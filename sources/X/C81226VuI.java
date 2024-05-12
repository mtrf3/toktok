package X;

import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;

/* renamed from: X.VuI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81226VuI implements InterfaceC80580Vjs {
    public final /* synthetic */ ViewPagerBottomSheetBehavior<RelativeLayout> LIZ;
    public final /* synthetic */ I18nSignUpActivity LIZIZ;

    public C81226VuI(ViewPagerBottomSheetBehavior<RelativeLayout> viewPagerBottomSheetBehavior, I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = viewPagerBottomSheetBehavior;
        this.LIZIZ = i18nSignUpActivity;
    }

    @Override // X.InterfaceC80580Vjs
    public final void LIZIZ() {
        this.LIZ.setState(5);
        this.LIZIZ.LLFII();
    }
}
