package com.google.ar.core.exceptions;

/* loaded from: classes34.dex */
public class LocationPermissionNotGrantedException extends SecurityException {
    public LocationPermissionNotGrantedException() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocationPermissionNotGrantedException(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r0 = r2.length()
            java.lang.String r1 = "The Android permission ACCESS_FINE_LOCATION has not been granted prior to calling Session.configure() with Earth location estimation enabled (Config.EarthMode.ENABLED). "
            if (r0 == 0) goto L14
            java.lang.String r0 = r1.concat(r2)
        L10:
            r3.<init>(r0)
            return
        L14:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.exceptions.LocationPermissionNotGrantedException.<init>(java.lang.String):void");
    }
}
