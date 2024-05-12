package Y;

import X.C0C3;
import X.C12460eI;
import X.C35936E8m;
import X.C85599Xid;
import X.C85712XkS;
import X.FMX;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDiS276S0100000_15 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$2(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
    }

    public static final void onPageScrollStateChanged$3(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
    }

    public static final void onPageScrolled$0(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
                return;
            case 4:
                onPageScrollStateChanged$4(this, i);
                return;
            case 5:
                onPageScrollStateChanged$5(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                return;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                return;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            case 4:
                onPageSelected$4(this, i);
                return;
            case 5:
                onPageSelected$5(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS276S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        String str;
        String str2;
        if (i == 2) {
            PhoneEmailLoginFragment phoneEmailLoginFragment = (PhoneEmailLoginFragment) iDiS276S0100000_15.l0;
            if (!phoneEmailLoginFragment.LLF) {
                phoneEmailLoginFragment.LLF = true;
                return;
            }
            if (((ViewPager) phoneEmailLoginFragment._$_findCachedViewById(R.id.hne)).getCurrentItem() == ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).LLD) {
                return;
            }
            C35936E8m c35936E8m = new C35936E8m();
            if (((ViewPager) ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0)._$_findCachedViewById(R.id.hne)).getCurrentItem() == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            c35936E8m.LIZLLL("enter_method", ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).getEnterMethod());
            c35936E8m.LIZLLL("enter_from", ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).getEnterFrom());
            c35936E8m.LIZLLL("enter_type", ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).LJLJL);
            c35936E8m.LIZLLL("login_panel_type", ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).wl());
            if (((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).LLFF) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c35936E8m.LIZLLL("is_first_show", str2);
            FMX.LJIIL(str, c35936E8m.LIZ);
            ((PhoneEmailLoginFragment) iDiS276S0100000_15.l0).LLFF = false;
        }
    }

    public static final void onPageScrollStateChanged$1(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        String str;
        String str2;
        if (i == 2) {
            PhoneEmailSignUpFragment phoneEmailSignUpFragment = (PhoneEmailSignUpFragment) iDiS276S0100000_15.l0;
            if (!phoneEmailSignUpFragment.LLD) {
                phoneEmailSignUpFragment.LLD = true;
                return;
            }
            int currentItem = ((ViewPager) phoneEmailSignUpFragment._$_findCachedViewById(R.id.hng)).getCurrentItem();
            PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = (PhoneEmailSignUpFragment) iDiS276S0100000_15.l0;
            if (currentItem == phoneEmailSignUpFragment2.LL) {
                return;
            }
            if (((ViewPager) phoneEmailSignUpFragment2._$_findCachedViewById(R.id.hng)).getCurrentItem() == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("login_panel_type", ((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).wl());
            c35936E8m.LIZLLL("enter_from", ((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).getEnterFrom());
            c35936E8m.LIZLLL("enter_method", ((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).getEnterMethod());
            c35936E8m.LIZLLL("enter_type", ((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).LJLJL);
            if (((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).LLF) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c35936E8m.LIZLLL("is_first_show", str2);
            FMX.LJIIL(str, c35936E8m.LIZ);
            ((PhoneEmailSignUpFragment) iDiS276S0100000_15.l0).LLF = false;
        }
    }

    public static final void onPageScrollStateChanged$4(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((AwemePagerAssem) iDiS276S0100000_15.l0).z4(i);
    }

    public static final void onPageScrollStateChanged$5(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((AwemePagerAssemV2) iDiS276S0100000_15.l0).B4(i);
    }

    public static final void onPageSelected$0(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        String str;
        PhoneEmailLoginFragment phoneEmailLoginFragment = (PhoneEmailLoginFragment) iDiS276S0100000_15.l0;
        phoneEmailLoginFragment.LLD = i;
        C85712XkS c85712XkS = phoneEmailLoginFragment.LJLZ;
        if (c85712XkS != null) {
            if (((ViewPager) phoneEmailLoginFragment._$_findCachedViewById(R.id.hne)).getCurrentItem() == 0) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            c85712XkS.LJIIL = str;
        }
        PhoneEmailLoginFragment phoneEmailLoginFragment2 = (PhoneEmailLoginFragment) iDiS276S0100000_15.l0;
        C85599Xid c85599Xid = phoneEmailLoginFragment2.LJZL;
        if (c85599Xid != null) {
            InterfaceC36571c5 LJJIII = c85599Xid.LJJIII(phoneEmailLoginFragment2.LLD);
            if (LJJIII instanceof InterfaceC18010nF) {
                C12460eI.LJIIIIZZ((InterfaceC18010nF) LJJIII, null);
                return;
            }
            return;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }

    public static final void onPageSelected$1(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        String str;
        PhoneEmailSignUpFragment phoneEmailSignUpFragment = (PhoneEmailSignUpFragment) iDiS276S0100000_15.l0;
        phoneEmailSignUpFragment.LL = i;
        C85712XkS c85712XkS = phoneEmailSignUpFragment.LJLZ;
        if (c85712XkS != null) {
            if (((ViewPager) phoneEmailSignUpFragment._$_findCachedViewById(R.id.hng)).getCurrentItem() == 0) {
                str = "phone_sign_up_homepage";
            } else {
                str = "email_sign_up_homepage";
            }
            c85712XkS.LJIIL = str;
        }
        PhoneEmailSignUpFragment phoneEmailSignUpFragment2 = (PhoneEmailSignUpFragment) iDiS276S0100000_15.l0;
        C85599Xid c85599Xid = phoneEmailSignUpFragment2.LJZL;
        if (c85599Xid != null) {
            InterfaceC36571c5 LJJIII = c85599Xid.LJJIII(phoneEmailSignUpFragment2.LL);
            if (LJJIII instanceof InterfaceC18010nF) {
                C12460eI.LJIIIIZZ((InterfaceC18010nF) LJJIII, null);
                return;
            }
            return;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }

    public static final void onPageSelected$2(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((ViewPager2MusicBoardWidget) iDiS276S0100000_15.l0).LJLLI = i;
        int i2 = 0;
        while (true) {
            ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = (ViewPager2MusicBoardWidget) iDiS276S0100000_15.l0;
            boolean[] zArr = viewPager2MusicBoardWidget.LL;
            if (i2 < zArr.length) {
                zArr[i2] = viewPager2MusicBoardWidget.LJZL[i2];
                i2++;
            } else {
                viewPager2MusicBoardWidget.LJIJ();
                return;
            }
        }
    }

    public static final void onPageSelected$3(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((MusicBoardWidget) iDiS276S0100000_15.l0).LJLL = i;
        int i2 = 0;
        while (true) {
            MusicBoardWidget musicBoardWidget = (MusicBoardWidget) iDiS276S0100000_15.l0;
            boolean[] zArr = musicBoardWidget.LJZI;
            if (i2 < zArr.length) {
                zArr[i2] = musicBoardWidget.LJZ[i2];
                i2++;
            } else {
                musicBoardWidget.LJIJ();
                return;
            }
        }
    }

    public static final void onPageSelected$4(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((AwemePagerAssem) iDiS276S0100000_15.l0).A4(i);
    }

    public static final void onPageSelected$5(IDiS276S0100000_15 iDiS276S0100000_15, int i) {
        ((AwemePagerAssemV2) iDiS276S0100000_15.l0).C4(i);
    }

    public static final void onPageScrolled$4(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
        ((AwemePagerAssem) iDiS276S0100000_15.l0).N0(i, f, i2);
    }

    public static final void onPageScrolled$5(IDiS276S0100000_15 iDiS276S0100000_15, int i, float f, int i2) {
        ((AwemePagerAssemV2) iDiS276S0100000_15.l0).N0(i, f, i2);
    }
}
