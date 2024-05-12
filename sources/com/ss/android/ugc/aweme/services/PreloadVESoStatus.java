package com.ss.android.ugc.aweme.services;

import X.C162476Zf;
import X.V0N;

/* loaded from: classes8.dex */
public enum PreloadVESoStatus {
    DECOMPRESSING,
    DECOMPRESS_ERROR,
    UNLOAD,
    LOADING,
    LOADED;

    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreloadVESoStatus.values().length];
            try {
                iArr[PreloadVESoStatus.DECOMPRESS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreloadVESoStatus.DECOMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreloadVESoStatus.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreloadVESoStatus.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreloadVESoStatus.LOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static PreloadVESoStatus valueOf(String str) {
        return (PreloadVESoStatus) V0N.LJJJ(PreloadVESoStatus.class, str);
    }

    public final int toStatusCode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return 1;
                        }
                        throw new C162476Zf();
                    }
                    return 0;
                }
                return -1;
            }
            return -2;
        }
        return -3;
    }
}
