package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GkR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42395GkR extends C42399GkV {
    public final /* synthetic */ C42393GkP LIZLLL;
    public final /* synthetic */ Aweme LJ;

    @Override // X.AbstractC42411Gkh
    public final void LJ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        super.LJ(str, fullFilePath);
        C42393GkP c42393GkP = this.LIZLLL;
        c42393GkP.LJ = 99 - c42393GkP.LJIIL;
        C10K.LIZIZ(c42393GkP.LJIILIIL, C10K.LJIIIIZZ, null);
        if (new File(fullFilePath).length() == 0) {
            this.LIZLLL.LIZJ();
            return;
        }
        C42393GkP c42393GkP2 = this.LIZLLL;
        c42393GkP2.LJI = fullFilePath;
        c42393GkP2.LIZIZ(this.LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42395GkR(Aweme aweme, C42393GkP c42393GkP, List list) {
        super(list, "replace_music");
        this.LIZLLL = c42393GkP;
        this.LJ = aweme;
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZIZ(Exception exc, Integer num, String str) {
        super.LIZIZ(exc, num, str);
        this.LIZLLL.LIZJ();
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZJ(int i, long j, long j2) {
        C42393GkP c42393GkP = this.LIZLLL;
        if (c42393GkP.LIZ != null) {
            if (i >= c42393GkP.LJ) {
                c42393GkP.LJ = i;
                C10K.LIZIZ(c42393GkP.LJIILIIL, C10K.LJIIIIZZ, null);
                return;
            }
            return;
        }
        o.LJIJI("mContext");
        throw null;
    }
}
