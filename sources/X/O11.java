package X;

import com.bytedance.geckox.GeckoGlobalConfig;

/* loaded from: classes11.dex */
public /* synthetic */ class O11 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GeckoGlobalConfig.ENVType.values().length];
        LIZ = iArr;
        try {
            iArr[GeckoGlobalConfig.ENVType.DEV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[GeckoGlobalConfig.ENVType.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[GeckoGlobalConfig.ENVType.BOE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
