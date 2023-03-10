@file:Suppress("SpellCheckingInspection", "unused")

package org.michaelbel.template.dependencies

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.michaelbel.template.extensions.api
import org.michaelbel.template.extensions.implementation

/**
 * Activity
 *
 * @see <a href="https://developer.android.com/jetpack/androidx/releases/activity">Activity</a>
 */

private const val ActivityVersion = "1.5.1"

private const val Activity = "androidx.activity:activity-ktx:$ActivityVersion"
private const val ActivityCompose = "androidx.activity:activity-compose:$ActivityVersion"

fun DependencyHandler.implementationActivityDependencies() {
    implementation(Activity)
    implementation(ActivityCompose)
}

fun DependencyHandler.apiActivityDependencies() {
    api(Activity)
    api(ActivityCompose)
}