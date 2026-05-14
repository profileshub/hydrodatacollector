# Hydro Data Collector

A professional Android application designed for precise hydrological data collection and real-time reporting. This tool empowers researchers and field agents to contribute to geographic data collection by reporting incidents with high-accuracy location data and photographic evidence.

---

## 🚀 Key Features

*   **Real-time Reporting:** Submit hydrological data and incident reports directly from the field.
*   **Modernized for Android 14:** Fully updated to support API 34 with the latest privacy and security protections.
*   **Google Maps Integration:** Precise location tagging using the latest Google Maps SDK and Fused Location Provider.
*   **Media Support:** Capture and attach photos to reports for visual verification of hydrological conditions.
*   **Dynamic UI:** Clean and responsive interface using Material Design components.

## 📥 Getting Started (Users)

The latest stable version of the application is available via GitHub Releases:

👉 **[Download Latest APK](https://github.com/profileshub/hydrodatacollector/releases)**

### Installation Instructions:
1.  Download the latest `.apk` file to your Android device.
2.  If prompted, allow your browser or file manager to "Install unknown apps".
3.  Open the downloaded file and tap **Install**.
4.  *Note:* Google Play Protect may show a warning because the app is sideloaded. You can safely select "Install anyway".

## 🛠 Setup for Developers

To build this project from source, you must configure your local environment:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/profileshub/hydrodatacollector.git
    ```
2.  **Configure API Keys:**
    For security, API keys are not stored in the repository. Create a `local.properties` file in the root directory:
    ```properties
    MAPS_API_KEY=YOUR_GOOGLE_MAPS_API_KEY
    BASE_URL=https://iggresapps.dkut.ac.ke
    ```
3.  **Build:**
    *   Open the project in Android Studio (Iguana or newer recommended).
    *   Sync Gradle and build the project.

## 🛡 Recent Security & Privacy Updates

*   **API Key Protection:** Migrated all hardcoded API keys and backend URLs to `local.properties` and injected them via `BuildConfig`.
*   **Privacy Compliance:** Updated location permission logic to comply with Android 14 (API 34) requirements, requesting both Precise and Coarse location.
*   **Code Protection:** Enabled R8/ProGuard minification and resource shrinking for release builds to prevent reverse engineering.
*   **Input Validation:** Implemented robust null-safety checks for map initialization and camera intent results.

## 🏗 Built With

*   **Language:** Java (JDK 17+)
*   **Build System:** Gradle 8.2 with AGP 8.2.1
*   **Networking:** [Volley](https://github.com/google/volley)
*   **Maps:** Google Maps SDK & Google Places API
*   **Permissions:** [Dexter](https://github.com/Karumi/Dexter)
*   **Image Handling:** Picasso & RoundedImageView

---
*Developed for the Muringato Hydrological Data Collection Project.*
