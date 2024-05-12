package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRK extends C42416Gkm {
    public final /* synthetic */ C44065HRd LIZLLL;
    public final /* synthetic */ Aweme LJ;

    @Override // X.AbstractC42414Gkk
    public final void LIZLLL(int i) {
        C44065HRd c44065HRd = this.LIZLLL;
        if (c44065HRd.LIZ != null) {
            if (i > 99) {
                i = 99;
            }
            c44065HRd.LJFF = (int) (i * c44065HRd.LJIIL);
            if (!c44065HRd.LJIILLIIL) {
                C10K.LIZIZ(c44065HRd.LJIJJLI, C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.AbstractC42414Gkk
    public final void LJ(String url, String fullFilePath) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(fullFilePath, "fullFilePath");
        super.LJ(url, fullFilePath);
        C44065HRd c44065HRd = this.LIZLLL;
        c44065HRd.LJFF = 99 - c44065HRd.LJIIJJI;
        if (!c44065HRd.LJIILLIIL) {
            C10K.LIZIZ(c44065HRd.LJIJJLI, C10K.LJIIIIZZ, null);
        }
        if (C78496UrM.LIZ(fullFilePath) == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaterMarkComposer download file size == 0: ");
            LIZ.append(this.LIZLLL.LJI);
            C36922EeM.LJFF(new Exception(X1D.LIZIZ(LIZ)));
            C44065HRd c44065HRd2 = this.LIZLLL;
            c44065HRd2.getClass();
            C10K.LIZIZ(new ACallableS110S0100000_7(c44065HRd2, 34), C10K.LJIIIIZZ, null);
            return;
        }
        this.LIZLLL.LJII = fullFilePath;
        if (this.LJ.getMusic() != null) {
            C44065HRd c44065HRd3 = this.LIZLLL;
            if (c44065HRd3.LJIILJJIL) {
                Music music = this.LJ.getMusic();
                o.LJIIIIZZ(music, "aweme.music");
                c44065HRd3.LIZIZ(music);
                return;
            }
        }
        this.LIZLLL.LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HRK(C44065HRd c44065HRd, Aweme aweme, List<String> list) {
        super(list, "stitch");
        this.LIZLLL = c44065HRd;
        this.LJ = aweme;
    }

    @Override // X.AbstractC42414Gkk
    public final void LIZJ(Exception exc, Integer num, String str) {
        super.LIZJ(exc, num, str);
        C44065HRd c44065HRd = this.LIZLLL;
        c44065HRd.getClass();
        C10K.LIZIZ(new ACallableS110S0100000_7(c44065HRd, 34), C10K.LJIIIIZZ, null);
    }
}
