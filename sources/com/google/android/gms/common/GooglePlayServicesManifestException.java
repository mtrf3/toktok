package com.google.android.gms.common;

import X.C67258QaU;

/* loaded from: classes12.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int LJLIL;

    public int getActualVersion() {
        return this.LJLIL;
    }

    public int getExpectedVersion() {
        return C67258QaU.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.LJLIL = i;
    }
}
