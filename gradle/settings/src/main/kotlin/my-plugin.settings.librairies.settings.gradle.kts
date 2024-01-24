dependencyResolutionManagement {
    versionCatalogs {

        create("libraries") {
            from(files("librairies.versions.toml"))
        }
    }
}
