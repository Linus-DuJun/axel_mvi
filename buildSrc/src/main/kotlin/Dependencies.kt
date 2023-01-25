
object BuildPlugins {

}

object Deps {
    val coreKtx   by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifeCycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val compose by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val composePreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"}
    val material by lazy { "androidx.compose.material3:material3:${Versions.material}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okHttpBom by lazy { "com.squareup.okhttp3:okhttp-bom:${Versions.okHttpBom}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp" }
    val okHttpLogger by lazy { "com.squareup.okhttp3:logging-interceptor" }
}

object DebugDeps {
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}"}
    val composeTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
}

object TestDeps {
    val junit     by lazy { "junit:junit:${Versions.jUnit}" }
    val androidJUnit by lazy { "androidx.test.ext:junit:${Versions.androidJUnit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val composeTestJUnit by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
}