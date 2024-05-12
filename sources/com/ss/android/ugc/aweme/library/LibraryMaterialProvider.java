package com.ss.android.ugc.aweme.library;

import X.V0N;

/* loaded from: classes8.dex */
public enum LibraryMaterialProvider {
    NONE(0),
    GIPHY(1),
    TOPTIKTOK(2),
    GALLERY(3);

    public final int LJLIL;

    public static LibraryMaterialProvider valueOf(String str) {
        return (LibraryMaterialProvider) V0N.LJJJ(LibraryMaterialProvider.class, str);
    }

    public final int getProvider() {
        return this.LJLIL;
    }

    LibraryMaterialProvider(int i) {
        this.LJLIL = i;
    }
}
