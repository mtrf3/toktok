package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.IEx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46295IEx {
    public static float LIZ(Aweme aweme) {
        if (aweme == null) {
            return 1.0f;
        }
        float LIZIZ = LIZIZ(aweme);
        double d = LIZIZ;
        if (0.5d > d || d > 2.0d) {
            return 1.0f;
        }
        return LIZIZ;
    }

    public static float LIZIZ(Aweme aweme) {
        if (aweme == null || LFH.LIZIZ.LIZLLL().block().LJIIIZ()) {
            return -1.0f;
        }
        return aweme.getParameterizedSpeed();
    }
}
