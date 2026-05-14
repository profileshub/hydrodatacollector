# Hydro Data Collector

An Android application designed for collecting hydrological data. This app has been modernized to support Android 14 (API 34) and follows security best practices for API key management and data transmission.

## 🚀 Features
- **Map Integration**: Real-time location tracking using Google Maps.
- **Data Capture**: Interface for capturing hydrological incident details and photos.
- **Secure Configuration**: API keys and base URLs are managed outside the source code for security.
- **Modernized Permissions**: Full support for Android 14 location permission requirements.

## 📥 Download
You can download the latest version of the app from the GitHub Releases page:
[Download Latest APK](https://github.com/profileshub/hydrodatacollector/releases)

---

## 🛠️ Setup Instructions for Developers
To build this project locally, you must provide your own API keys as they are not included in the repository for security reasons.

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/profileshub/hydrodatacollector.git
    ```
2.  **Create a `local.properties` file** in the root directory and add your credentials:
    ```properties
    MAPS_API_KEY=YOUR_GOOGLE_MAPS_API_KEY
    BASE_URL=YOUR_BACKEND_SERVER_URL
    ```
3.  **Sync Gradle** and build the project in Android Studio.

## 🔒 Security
- This project uses **BuildConfig** fields and **Manifest Placeholders** to inject secrets at build time.
- **ProGuard/R8** is enabled for release builds to protect the source code.
- Sensitive information is strictly excluded from version control via `.gitignore`.

## 📄 License
This project is for academic/research purposes. Please refer to the project authors for licensing details.
