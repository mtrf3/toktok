package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nih, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60123Nih extends AbstractC60796NtY {
    public Context LJLILLLLZI;
    public MusicLandingPageViewModel LJLJI;

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        Context context = this.LJLILLLLZI;
        if (context == null) {
            return null;
        }
        L92 l92 = new L92(context);
        C6XC c6xc = l92.LJLIL;
        if (c6xc != null) {
            c6xc.LIZ();
            c6xc.LJLLLL = true;
            c6xc.LJLLILLLL = true;
            c6xc.postInvalidate();
            return l92;
        }
        o.LJIJI("loadingBall");
        throw null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLILLLLZI = context;
    }

    @Override // X.AbstractC60796NtY
    public final void LIZIZ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        Object LJIILL = sparkContext.LJIILL();
        ActivityC45651qj activityC45651qj = null;
        if (LJIILL != null && (LJIILL instanceof SparkActivity)) {
            activityC45651qj = (ActivityC45651qj) LJIILL;
        }
        o.LJII(activityC45651qj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJI = (MusicLandingPageViewModel) ViewModelProviders.of(activityC45651qj).get(MusicLandingPageViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        C60161NjJ c60161NjJ;
        o.LJIIIZ(refresher, "refresher");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "no_internet";
        Context context = this.LJLILLLLZI;
        if (context != null) {
            c60161NjJ = new C60161NjJ(context);
            c60161NjJ.setCurrentStatus$anchor_business_release((String) c68322mC.element);
            c60161NjJ.setCurrentStatusView$anchor_business_release(new C60122Nig(refresher, c68322mC, this));
        } else {
            c60161NjJ = null;
        }
        if (C60119Nid.LIZLLL) {
            C60119Nid.LIZLLL = false;
            String str = (String) c68322mC.element;
            o.LJIIIZ(str, "<set-?>");
            C60119Nid.LIZ = str;
            MusicLandingPageViewModel musicLandingPageViewModel = this.LJLJI;
            if (musicLandingPageViewModel != null) {
                musicLandingPageViewModel.gv0((String) c68322mC.element);
            } else {
                o.LJIJI("safeStatusViewModel");
                throw null;
            }
        }
        return c60161NjJ;
    }
}
