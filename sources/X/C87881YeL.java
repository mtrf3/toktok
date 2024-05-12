package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.google.android.play.core.assetpacks.w0;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.AqS198S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YeL, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87881YeL implements Y9V {
    public final IMUser LIZ;
    public final C63120Opw LIZIZ;
    public final boolean LIZJ;
    public int LIZLLL;
    public final EnumC40672Fxk LJ;
    public final java.util.Set<String> LJFF;
    public final w0 LJI;
    public final AqS166S0100000_16 LJII;
    public final AqS198S0100000_16 LJIIIIZZ;
    public final AqS182S0100000_16 LJIIIZ;
    public final AqS182S0100000_16 LJIIJ;
    public final AqS182S0100000_16 LJIIJJI;
    public final AqS198S0100000_16 LJIIL;
    public final AqS198S0100000_16 LJIILIIL;
    public final AqS198S0100000_16 LJIILJJIL;
    public final AqS166S0100000_16 LJIILL;

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, String> LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LJIILL;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LJIIJJI;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LJIILIIL;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIJ() {
        return this.LJIIL;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        String str;
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87881YeL)) {
            return false;
        }
        IMUser iMUser = ((C87881YeL) delegate).LIZ;
        String str2 = null;
        if (iMUser != null) {
            str = iMUser.getUid();
        } else {
            str = null;
        }
        IMUser iMUser2 = this.LIZ;
        if (iMUser2 != null) {
            str2 = iMUser2.getUid();
        }
        return o.LJ(str, str2);
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87881YeL)) {
            return false;
        }
        C87881YeL c87881YeL = (C87881YeL) delegate;
        IMUser iMUser = c87881YeL.LIZ;
        String str4 = null;
        if (iMUser != null) {
            str = iMUser.getNickName();
        } else {
            str = null;
        }
        IMUser iMUser2 = this.LIZ;
        if (iMUser2 != null) {
            str2 = iMUser2.getNickName();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return false;
        }
        if (iMUser != null) {
            str3 = iMUser.getUniqueId();
        } else {
            str3 = null;
        }
        IMUser iMUser3 = this.LIZ;
        if (iMUser3 != null) {
            str4 = iMUser3.getUniqueId();
        }
        if (!o.LJ(str3, str4) || c87881YeL.LIZLLL != this.LIZLLL || c87881YeL.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(View view, boolean z, IMSearchDefaultVM iMSearchDefaultVM, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String LIZIZ;
        boolean z3;
        w0 w0Var = this.LJI;
        if (w0Var != null) {
            w0Var.LIZ();
        }
        IMUser iMUser = this.LIZ;
        String str7 = null;
        Context context = null;
        if (iMUser != null) {
            str = iMUser.getUid();
        } else {
            str = null;
        }
        boolean z4 = false;
        int i = 0;
        if (str == null) {
            iMSearchDefaultVM.getClass();
        } else {
            C33A c33a = iMSearchDefaultVM.LJLIL;
            if (c33a != null) {
                c33a.LIZIZ.LJ(0, str);
            }
        }
        if (!z2) {
            str2 = "click_dm_search_cell";
        } else {
            str2 = "follow_button";
        }
        if (z) {
            IMUser iMUser2 = this.LIZ;
            C63120Opw c63120Opw = this.LIZIZ;
            EnumC40671Fxj position = this.LJ.getPosition();
            EnumC40673Fxl displayType = this.LJ.getDisplayType();
            int i2 = this.LIZLLL;
            o.LJIIIZ(position, "position");
            o.LJIIIZ(displayType, "displayType");
            int i3 = 1;
            if (iMUser2 == null || (iMUser2.getFollowStatus() != 2 && iMUser2.getFollowStatus() != 1)) {
                i3 = 0;
            }
            InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
            if (view != null) {
                context = view.getContext();
            }
            C98593tv c98593tv = new C98593tv(context, iMUser2);
            c98593tv.setEnterFromForMob("dm_search_page");
            c98593tv.setEnterMethodForMob(str2);
            c98593tv.setFollowStatus(i3);
            if (c63120Opw != null) {
                z3 = c63120Opw.isStickTop();
            } else {
                z3 = false;
            }
            c98593tv.setStickyTop(z3);
            if (c63120Opw != null) {
                i = (int) c63120Opw.getUnreadCount();
            }
            c98593tv.setUnreadCount(i);
            imChatService.LJFF(c98593tv);
            V8U.LIZ(position, displayType, iMUser2, c63120Opw, i2, EnumC57385Mfd.ENTER_CHAT);
            return;
        }
        IMUser iMUser3 = this.LIZ;
        EnumC40671Fxj position2 = this.LJ.getPosition();
        EnumC40673Fxl displayType2 = this.LJ.getDisplayType();
        int i4 = this.LIZLLL;
        o.LJIIIZ(position2, "position");
        o.LJIIIZ(displayType2, "displayType");
        if (iMUser3 != null) {
            str3 = iMUser3.getUid();
        } else {
            str3 = null;
        }
        C3E5.LIZLLL(str3);
        if (iMUser3 != null) {
            str4 = iMUser3.getUid();
        } else {
            str4 = null;
        }
        C96093pt.LIZJ(str4, "dm_search_page", "click_dm_search_cell", null, null);
        if (iMUser3 != null) {
            str7 = iMUser3.getUid();
        }
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null) {
            z4 = c88545Yp3.isConnected();
        }
        Boolean valueOf = Boolean.valueOf(z4);
        String str8 = "";
        if (c88545Yp3 == null || (str5 = c88545Yp3.LJIILJJIL()) == null) {
            str5 = "";
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (str7 != null) {
            C1HQ LIZJ = HXX.LIZJ("to_user_id", str7, "enter_from", "dm_search_page");
            LIZJ.put("enter_method", "click_dm_search_cell");
            if (c88545Yp3 == null || (str6 = c88545Yp3.LJ()) == null) {
                str6 = "";
            }
            LIZJ.put(str6, String.valueOf(valueOf));
            if (c88545Yp3 != null && (LIZIZ = c88545Yp3.LIZIZ()) != null) {
                str8 = LIZIZ;
            }
            LIZJ.put(str8, str5);
            onEventV3.LIZIZ("enter_personal_detail", LIZJ);
        }
        V8U.LIZ(position2, displayType2, iMUser3, null, i4, EnumC57385Mfd.ENTER_PROFILE);
    }

    public C87881YeL(IMUser iMUser, C63120Opw c63120Opw, boolean z, int i, EnumC40672Fxk iMSearchMobData, java.util.Set<String> mobShowFilterSet, w0 w0Var) {
        AqS198S0100000_16 aqS198S0100000_16;
        o.LJIIIZ(iMSearchMobData, "iMSearchMobData");
        o.LJIIIZ(mobShowFilterSet, "mobShowFilterSet");
        this.LIZ = iMUser;
        this.LIZIZ = c63120Opw;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = iMSearchMobData;
        this.LJFF = mobShowFilterSet;
        this.LJI = w0Var;
        this.LJII = new AqS166S0100000_16(this, 7);
        this.LJIIIIZZ = new AqS198S0100000_16(this, 5);
        this.LJIIIZ = new AqS182S0100000_16(this, 15);
        this.LJIIJ = new AqS182S0100000_16(this, 16);
        this.LJIIJJI = new AqS182S0100000_16(this, 14);
        this.LJIIL = new AqS198S0100000_16(this, 8);
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() == 5) {
            aqS198S0100000_16 = new AqS198S0100000_16(this, 7);
        } else {
            aqS198S0100000_16 = null;
        }
        this.LJIILIIL = aqS198S0100000_16;
        this.LJIILJJIL = new AqS198S0100000_16(this, 6);
        this.LJIILL = new AqS166S0100000_16(this, 8);
    }
}
