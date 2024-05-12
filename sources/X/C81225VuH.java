package X;

import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;

/* renamed from: X.VuH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81225VuH implements InterfaceC80580Vjs {
    public final /* synthetic */ ViewPagerBottomSheetBehavior<RelativeLayout> LIZ;
    public final /* synthetic */ LoginMethodListActivity LIZIZ;

    public C81225VuH(ViewPagerBottomSheetBehavior<RelativeLayout> viewPagerBottomSheetBehavior, LoginMethodListActivity loginMethodListActivity) {
        this.LIZ = viewPagerBottomSheetBehavior;
        this.LIZIZ = loginMethodListActivity;
    }

    @Override // X.InterfaceC80580Vjs
    public final void LIZIZ() {
        this.LIZ.setState(5);
        this.LIZIZ.getWindow().setDimAmount(0.0f);
    }
}
