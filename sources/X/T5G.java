package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class T5G implements T5L {
    public final T5K LIZ = CommerceChallengeServiceImpl.LIZIZ().LIZ();

    @Override // X.T5L
    public final void LIZLLL() {
    }

    @Override // X.T5L
    public final void LIZ(float f) {
        this.LIZ.LIZ(f);
    }

    @Override // X.T5L
    public final void LIZIZ(ChallengeDetail challengeDetail) {
        this.LIZ.LJ(challengeDetail.challenge, challengeDetail.slideList);
    }

    @Override // X.T5L
    public final void LIZJ(FrameLayout frameLayout, T5H t5h) {
        int i;
        T5K t5k = this.LIZ;
        if (t5h.LIZJ == EnumC46499IMt.TYPE_NORMAL) {
            i = 0;
        } else {
            i = 1;
        }
        t5k.LIZJ(frameLayout, new C232669Be(i, t5h.LJ));
        this.LIZ.LJI((ViewStub) frameLayout.findViewById(R.id.nfg), t5h.LIZLLL);
        this.LIZ.LJFF((ViewStub) frameLayout.findViewById(R.id.ney));
        this.LIZ.LIZIZ((ViewStub) frameLayout.findViewById(R.id.nez));
        this.LIZ.LJII((ViewStub) frameLayout.findViewById(R.id.nf0));
        if (t5h.LIZJ == EnumC46499IMt.TYPE_TRANSFORM) {
            this.LIZ.LIZLLL(frameLayout.findViewById(R.id.ljd));
            this.LIZ.LJIIIZ((T5P) frameLayout.findViewById(R.id.fbr));
            this.LIZ.LJIIIIZZ((TextView) frameLayout.findViewById(R.id.mpa));
        }
    }
}
