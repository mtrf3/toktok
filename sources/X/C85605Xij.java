package X;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xij, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85605Xij implements TAY {
    public final /* synthetic */ PhoneEmailSignUpFragment LJLIL;

    public C85605Xij(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        this.LJLIL = phoneEmailSignUpFragment;
    }

    @Override // X.TAY
    public final void LIZIZ(C80674VlO c80674VlO) {
        String str;
        String str2;
        PhoneEmailSignUpFragment phoneEmailSignUpFragment = this.LJLIL;
        phoneEmailSignUpFragment.LLD = false;
        int i = phoneEmailSignUpFragment.LL;
        int i2 = c80674VlO.LJ;
        if (i == i2) {
            return;
        }
        if (i2 == 0) {
            str = "switch_to_phone";
        } else {
            str = "switch_to_email";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LJLIL.getEnterFrom());
        c35936E8m.LIZLLL("enter_method", this.LJLIL.getEnterMethod());
        c35936E8m.LIZLLL("enter_type", this.LJLIL.LJLJL);
        c35936E8m.LIZLLL("login_panel_type", this.LJLIL.wl());
        if (this.LJLIL.LLF) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c35936E8m.LIZLLL("is_first_show", str2);
        FMX.LJIIL(str, c35936E8m.LIZ);
        PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = this.LJLIL;
        phoneEmailSignUpFragment2.LLF = false;
        ((ViewPager) phoneEmailSignUpFragment2._$_findCachedViewById(R.id.hng)).setCurrentItem(c80674VlO.LJ);
    }
}
