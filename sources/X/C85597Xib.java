package X;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xib, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85597Xib implements TAY {
    public final /* synthetic */ PhoneEmailLoginFragment LJLIL;

    public C85597Xib(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        this.LJLIL = phoneEmailLoginFragment;
    }

    @Override // X.TAY
    public final void LIZIZ(C80674VlO c80674VlO) {
        String str;
        String str2;
        PhoneEmailLoginFragment phoneEmailLoginFragment = this.LJLIL;
        phoneEmailLoginFragment.LLF = false;
        if (phoneEmailLoginFragment.LLD == c80674VlO.LJ) {
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        if (c80674VlO.LJ == 0) {
            str = "switch_to_phone";
        } else {
            str = "switch_to_email";
        }
        c35936E8m.LIZLLL("enter_method", this.LJLIL.getEnterMethod());
        c35936E8m.LIZLLL("enter_type", this.LJLIL.LJLJL);
        c35936E8m.LIZLLL("enter_from", this.LJLIL.getEnterFrom());
        c35936E8m.LIZLLL("login_panel_type", this.LJLIL.wl());
        if (this.LJLIL.LLFF) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c35936E8m.LIZJ("is_first_show", str2);
        FMX.LJIIL(str, c35936E8m.LIZ);
        PhoneEmailLoginFragment phoneEmailLoginFragment2 = this.LJLIL;
        phoneEmailLoginFragment2.LLFF = false;
        ((ViewPager) phoneEmailLoginFragment2._$_findCachedViewById(R.id.hne)).setCurrentItem(c80674VlO.LJ);
    }
}
