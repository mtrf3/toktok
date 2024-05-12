package X;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;

/* renamed from: X.JdS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C49606JdS {
    public static ISpeedPredictorService LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return (ISpeedPredictorService) ESN.LIZ("com.ss.android.ugc.aweme.speedpredictor.cloudimpl2.CloudSpeedPredictorServiceImpl");
            }
            return (ISpeedPredictorService) ESN.LIZ("com.ss.android.ugc.aweme.speedpredictor.cloudimpl.CloudSpeedPredictorServiceImpl");
        }
        return (ISpeedPredictorService) ESN.LIZ("com.ss.android.ugc.aweme.speedpredictor.impl.DTSpeedPredictorServiceImpl");
    }

    public static C252659vp LIZIZ(int i, int i2) {
        C252659vp c252659vp = new C252659vp();
        c252659vp.LIZJ(i);
        c252659vp.LIZ(i2);
        return c252659vp;
    }
}
