package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Bty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30246Bty {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(C30252Bu4 tbContext) {
        EnumC30254Bu6 enumC30254Bu6;
        float LIZIZ;
        float f;
        o.LJIIIZ(tbContext, "tbContext");
        if (C29306Beo.LJJ((Boolean) tbContext.LIZJ.kv0(BCW.class))) {
            enumC30254Bu6 = EnumC30254Bu6.PORTRAIT;
        } else {
            enumC30254Bu6 = EnumC30254Bu6.LANDSCAPE;
        }
        if (enumC30254Bu6 == EnumC30254Bu6.PORTRAIT) {
            LIZIZ = LIZIZ(enumC30254Bu6) + 36.0f;
            f = 56.0f;
        } else {
            LIZIZ = LIZIZ(enumC30254Bu6) + 36.0f;
            f = 64.0f;
        }
        return new OSZ(Float.valueOf(LIZIZ), Float.valueOf(f));
    }

    public static float LIZIZ(EnumC30254Bu6 enumC30254Bu6) {
        if (enumC30254Bu6 == EnumC30254Bu6.PORTRAIT) {
            return 8.0f;
        }
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
            return 12.0f;
        }
        return 4.0f;
    }

    public static float LIZJ(EnumC30254Bu6 enumC30254Bu6) {
        int i = C30253Bu5.LIZ[enumC30254Bu6.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
                    return 16.0f;
                }
                return 8.0f;
            }
            throw new C162476Zf();
        }
        return 12.0f;
    }

    public static float LIZLLL(EnumC30254Bu6 orientation, EnumC30206BtK location, boolean z) {
        boolean z2;
        o.LJIIIZ(orientation, "orientation");
        o.LJIIIZ(location, "location");
        if ((location == EnumC30206BtK.LEFT && z) || (location == EnumC30206BtK.RIGHT && !z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return LIZJ(orientation) - (LIZIZ(orientation) / 2);
        }
        return LIZIZ(orientation) / 2;
    }
}
