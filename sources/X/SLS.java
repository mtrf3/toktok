package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa.QAInviteViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLS extends SN1<QAInviteViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "qna_invite";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SLS(QAInviteViewModel qAInviteViewModel, Context context, LifecycleOwner lifecycleOwner, SKL skl) {
        super(qAInviteViewModel, context, skl);
        int i;
        Integer valueOf;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LJLLLLLL(new SKY(0));
        if (C234869Jq.LIZ()) {
            LJLLLLLL(new SKP(C226388uY.LIZJ(R.string.bcw, R.string.be7)));
        } else {
            LJLLLLLL(new SKP(R.string.pox));
        }
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 1;
        LLIFFJFJJ(sl4, 1, false);
        AbstractC71913SKf.LIZJ(sl4, R.string.blo);
        sl4.LJIIJJI = false;
        LJLLLLLL(sl4.LIZ());
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 3;
        LLIFFJFJJ(sl42, 3, false);
        AbstractC71913SKf.LIZJ(sl42, R.string.pow);
        sl42.LJIIJJI = false;
        LJLLLLLL(sl42.LIZ());
        boolean friendsTabStylePrivacyHint = LHM.LIZIZ.LIZ().friendsTabStylePrivacyHint();
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 4;
        LLIFFJFJJ(sl43, 4, false);
        if (friendsTabStylePrivacyHint) {
            i = R.string.gnw;
        } else {
            i = R.string.jbq;
        }
        AbstractC71913SKf.LIZJ(sl43, i);
        if (friendsTabStylePrivacyHint) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(R.string.gna);
        }
        sl43.LJ = valueOf;
        sl43.LJIIJJI = false;
        LJLLLLLL(sl43.LIZ());
        SL4 sl44 = new SL4();
        sl44.LJIILLIIL = 5;
        LLIFFJFJJ(sl44, 5, false);
        AbstractC71913SKf.LIZJ(sl44, R.string.p9_);
        sl44.LJIIJJI = false;
        LJLLLLLL(sl44.LIZ());
        qAInviteViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 102));
        qAInviteViewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 103));
    }
}
