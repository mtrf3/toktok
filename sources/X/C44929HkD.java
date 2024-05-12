package X;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtService;
import kotlin.jvm.internal.o;

/* renamed from: X.HkD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44929HkD implements Observer<Aweme> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Aweme aweme) {
        Activity LJIIIIZZ;
        String str;
        Aweme aweme2 = aweme;
        if (aweme2 == null || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return;
        }
        String aid = aweme2.getAid();
        Aweme aweme3 = C44938HkM.LJFF;
        if (aweme3 != null) {
            str = aweme3.getAid();
        } else {
            str = null;
        }
        if (o.LJ(aid, str)) {
            C44938HkM.LJIIIZ++;
        } else {
            C44938HkM.LJIIIZ = 0;
        }
        if (aweme2.getAwemeType() == 150) {
            C44890Hja.LIZIZ(aweme2, C44932HkG.LJLIL);
            return;
        }
        ShareExtService shareExtService = C4LD.LIZIZ;
        o.LJIIIIZZ(shareExtService, "extService()");
        C44928HkC LJJI = shareExtService.LJJI(LJIIIIZZ, aweme2, C44938HkM.LJI, "retry", null);
        o.LJII(LJJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.action.DownloadAction");
        LJJI.LJIIL(aweme2, LJIIIIZZ, C44938HkM.LJIIL, C44938HkM.LJIIJJI, false, false, C44938HkM.LJIILL);
    }
}
