package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;

/* renamed from: X.Hji, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44898Hji implements Observer<Aweme> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 == null || C84763XOl.LJIIIIZZ() == null) {
            return;
        }
        C44896Hjg c44896Hjg = C44896Hjg.LIZ;
        if (!(!((HashSet) C44896Hjg.LJIILIIL).isEmpty())) {
            return;
        }
        C44896Hjg.LJI = aweme2;
        C44896Hjg.LJIIJJI = C44896Hjg.LJIILIIL;
        C44896Hjg.LJIILIIL = new HashSet();
        if (C44938HkM.LIZIZ()) {
            return;
        }
        C44938HkM.LIZIZ = true;
        C44938HkM.LJFF = aweme2;
        c44896Hjg.LJIILL();
        if (!C44896Hjg.LIZIZ) {
            return;
        }
        C225298sn.LIZJ(C44896Hjg.LJIIIZ, 1, C44896Hjg.LJI);
    }
}
