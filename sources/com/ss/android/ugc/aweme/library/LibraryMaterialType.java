package com.ss.android.ugc.aweme.library;

import X.V0N;

/* loaded from: classes8.dex */
public enum LibraryMaterialType {
    NONE(0),
    VideoClip(1),
    Gif(2),
    Photo(3);

    public final int LJLIL;

    public static LibraryMaterialType valueOf(String str) {
        return (LibraryMaterialType) V0N.LJJJ(LibraryMaterialType.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    LibraryMaterialType(int i) {
        this.LJLIL = i;
    }
}
