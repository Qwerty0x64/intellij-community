/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("frontend-fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/components/returnExpressionTarget")
public class ReturnExpressionTargetTestGenerated extends AbstractReturnExpressionTargetTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("returnFromFunctionViaLambdaWithoutLabel.kt")
    public void testReturnFromFunctionViaLambdaWithoutLabel() throws Exception {
        runTest("testData/components/returnExpressionTarget/returnFromFunctionViaLambdaWithoutLabel.kt");
    }

    @TestMetadata("returnFromFunctionWithLabel.kt")
    public void testReturnFromFunctionWithLabel() throws Exception {
        runTest("testData/components/returnExpressionTarget/returnFromFunctionWithLabel.kt");
    }

    @TestMetadata("returnFromFunctionWithoutLabel.kt")
    public void testReturnFromFunctionWithoutLabel() throws Exception {
        runTest("testData/components/returnExpressionTarget/returnFromFunctionWithoutLabel.kt");
    }

    @TestMetadata("returnFromLambdaWithLabel.kt")
    public void testReturnFromLambdaWithLabel() throws Exception {
        runTest("testData/components/returnExpressionTarget/returnFromLambdaWithLabel.kt");
    }
}
