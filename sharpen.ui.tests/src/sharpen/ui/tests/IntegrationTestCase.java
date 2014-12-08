/* Copyright (C) 2009  Versant Inc.   http://www.db4o.com */
package sharpen.ui.tests;

import sharpen.core.*;
//import org.junit.Test;

public class IntegrationTestCase extends AbstractConversionTestCase {
	//@Test
	public void testNamespaceMappingWithTypeRenaming() throws Throwable {
		final Configuration config = getConfiguration();
		config.enableOrganizeUsings();
		config.mapNamespace("integration\\.namespaceMapping\\.foo", "UbberFoo");
		
		runBatchConverterTestCase(config,
				new TestCaseResource(projecttempLocation,"integration/namespaceMapping/foo/Foo") {
					@Override public String targetSimpleName() {
						return "FooFactory";
					}
				},
				new TestCaseResource(projecttempLocation,"integration/namespaceMapping/bar/FooUsage"));
	}

}
