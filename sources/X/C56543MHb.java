package X;

import com.ss.android.ugc.aweme.ml.ab.SmartMusicDetailPreloadExperiment;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.MHb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56543MHb {
    public static final C56543MHb LIZ = new C56543MHb();
    public static final int LIZIZ;
    public static final C0M6<String, C56546MHe> LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        int i;
        Integer expireTime = SmartMusicDetailPreloadExperiment.INSTANCE.getExpireTime();
        if (expireTime != null) {
            i = expireTime.intValue();
        } else {
            i = 15000;
        }
        LIZIZ = i;
        LIZJ = new C0M6<>(16);
        LIZLLL = C221108m2.LIZIZ(C56547MHf.LJLIL);
    }

    public static MusicDetail LIZ(String musicId, String extra) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(extra, "extra");
        C0M6<String, C56546MHe> c0m6 = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(musicId);
        LIZ2.append('&');
        LIZ2.append(extra);
        C56546MHe LIZIZ2 = c0m6.LIZIZ(X1D.LIZIZ(LIZ2));
        if (LIZIZ2 != null && System.currentTimeMillis() - LIZIZ2.LIZIZ < LIZIZ) {
            return LIZIZ2.LIZ;
        }
        return null;
    }
}
