# Spinner Animation App

This is a simple Android app demonstrating an image spinner animation. When you click on the image, it rotates 360 degrees.

## Features
- The app uses an `ImageView` to display an image.
- When the user clicks the image, it rotates 360 degrees with a smooth animation.
- The animation lasts for 1 second.

## Prerequisites
- Android Studio (latest version)
- Basic understanding of Android development

## Setup Instructions

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Ensure your Android device or emulator is set up for testing.
4. Build and run the application.

## Code Explanation

1. **MainActivity**: The main activity contains an `ImageView`.
2. **RotateAnimation**: When the user clicks on the image, the app creates a `RotateAnimation` to rotate the image from 0 to 360 degrees.
3. **OnClickListener**: The animation starts when the image is clicked, making the image rotate.
4. **Animation Duration**: The animation duration is set to 1000ms (1 second).
5. **fillAfter**: This ensures the image remains in the rotated position after the animation completes.

## License

This project is licensed under the MIT License.
