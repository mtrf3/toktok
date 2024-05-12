package X;

import Y.ACallableS59S0300000_10;
import Y.ARunnableS46S0100000_10;
import Y.AgS127S0100000_10;
import android.app.Activity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OVV implements InterfaceC78763Uvf {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ OW6 LIZIZ;

    @Override // X.InterfaceC78763Uvf
    public final void onSuccess() {
        OW6 ow6 = this.LIZIZ;
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            ow6.getClass();
            if (aweme.getVideo() != null) {
                UrlModel cover = aweme.getVideo().getCover();
                if (cover == null) {
                    C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 103));
                    C62011OVj.LJII(1, "cover is empty");
                    return;
                } else {
                    C10K.LIZJ(new ACallableS59S0300000_10(cover, aweme, ow6, 3)).LIZLLL(new AgS127S0100000_10(ow6, 9));
                    return;
                }
            }
        }
        ow6.getClass();
        C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 103));
        C62011OVj.LJII(1, "aweme is empty");
    }

    @Override // X.InterfaceC78763Uvf
    public final void onFailure(Exception exc) {
        Activity activity = this.LIZIZ.LIZIZ;
        if (activity != null && !activity.isFinishing()) {
            C5S1 c5s1 = new C5S1(this.LIZIZ.LIZIZ);
            c5s1.LIZJ(R.string.exz);
            c5s1.LJ();
            this.LIZIZ.LIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request image fail ");
            LIZ.append(exc.getMessage());
            C62011OVj.LJII(1, X1D.LIZIZ(LIZ));
        }
    }

    public OVV(OW6 ow6, Aweme aweme) {
        this.LIZIZ = ow6;
        this.LIZ = aweme;
    }
}
