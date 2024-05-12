package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Gei, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42040Gei implements InterfaceC43231Gxv {
    public final C43229Gxt LJLIL;
    public final Fragment LJLILLLLZI;

    @Override // X.InterfaceC43231Gxv
    public final void pW() {
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.rk_);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC43231Gxv
    public final void as() {
        C36821Ecj<String> twitterSecret = SharePrefCache.inst().getTwitterSecret();
        twitterSecret.LIZJ(twitterSecret.LIZ);
        C36821Ecj<String> facebookAccessToken = SharePrefCache.inst().getFacebookAccessToken();
        facebookAccessToken.LIZJ(facebookAccessToken.LIZ);
        C36821Ecj<String> twitterAccessToken = SharePrefCache.inst().getTwitterAccessToken();
        twitterAccessToken.LIZJ(twitterAccessToken.LIZ);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.r5h);
        c26045AKb.LJIIJ();
    }

    public C42040Gei(Fragment fragment) {
        this.LJLILLLLZI = fragment;
        C43229Gxt c43229Gxt = new C43229Gxt();
        this.LJLIL = c43229Gxt;
        c43229Gxt.LJLILLLLZI = this;
    }
}
