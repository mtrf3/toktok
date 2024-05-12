package X;

import com.bytedance.geckox.GeckoGlobalConfig;

/* renamed from: X.ZzF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public /* synthetic */ class C91725ZzF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GeckoGlobalConfig.ENVType.values().length];
        try {
            iArr[GeckoGlobalConfig.ENVType.PROD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeckoGlobalConfig.ENVType.BOE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
