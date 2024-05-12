package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.google.android.play.core.assetpacks.w0;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.AqS198S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YeM, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87882YeM implements Y9V {
    public final C63120Opw LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public final EnumC40672Fxk LIZLLL;
    public final java.util.Set<String> LJ;
    public final w0 LJFF;
    public final AqS166S0100000_16 LJI;
    public final AqS198S0100000_16 LJII;
    public final AqS182S0100000_16 LJIIIIZZ;
    public final AqS182S0100000_16 LJIIIZ;
    public final AqS198S0100000_16 LJIIJ;
    public final AqS198S0100000_16 LJIIJJI;
    public final AqS198S0100000_16 LJIIL;
    public final AqS166S0100000_16 LJIILIIL;

    @Override // X.Y9V
    public final /* bridge */ /* synthetic */ InterfaceC88472Yns LIZIZ() {
        return null;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LIZ() {
        return this.LJII;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<C76800UCe> LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // X.Y9V
    public final InterfaceC88472Yns<Context, SpannableString> LJ() {
        return this.LJIIIZ;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<SY4, IMSearchDefaultVM, C76800UCe> LJFF() {
        return this.LJIIJJI;
    }

    @Override // X.Y9V
    public final InterfaceC65784Pro<ImageUrlModel> LJI() {
        return this.LJI;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIIIZZ() {
        return this.LJIIL;
    }

    @Override // X.Y9V
    public final InterfaceC88471Ynr<View, IMSearchDefaultVM, C76800UCe> LJIIJ() {
        return this.LJIIJ;
    }

    @Override // X.Y9V
    public final boolean LJII(Y9V delegate) {
        String str;
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87882YeM)) {
            return false;
        }
        C63120Opw c63120Opw = ((C87882YeM) delegate).LIZ;
        String str2 = null;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        C63120Opw c63120Opw2 = this.LIZ;
        if (c63120Opw2 != null) {
            str2 = c63120Opw2.getConversationId();
        }
        return o.LJ(str, str2);
    }

    @Override // X.Y9V
    public final boolean LJIIIZ(Y9V delegate) {
        Integer num;
        o.LJIIIZ(delegate, "delegate");
        if (!(delegate instanceof C87882YeM)) {
            return false;
        }
        C87882YeM c87882YeM = (C87882YeM) delegate;
        if (!o.LJ(c87882YeM.LIZIZ, this.LIZIZ)) {
            return false;
        }
        C63120Opw c63120Opw = c87882YeM.LIZ;
        Integer num2 = null;
        if (c63120Opw != null) {
            num = Integer.valueOf(c63120Opw.getMemberCount());
        } else {
            num = null;
        }
        C63120Opw c63120Opw2 = this.LIZ;
        if (c63120Opw2 != null) {
            num2 = Integer.valueOf(c63120Opw2.getMemberCount());
        }
        if (!o.LJ(num, num2) || c87882YeM.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(View view, IMSearchDefaultVM iMSearchDefaultVM, boolean z) {
        String str;
        String str2;
        Context context;
        boolean z2;
        w0 w0Var = this.LJFF;
        if (w0Var != null) {
            w0Var.LIZ();
        }
        C63120Opw c63120Opw = this.LIZ;
        String str3 = null;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        iMSearchDefaultVM.gv0(str);
        if (z) {
            str2 = "follow_button";
        } else {
            str2 = "click_dm_search_cell";
        }
        C63120Opw c63120Opw2 = this.LIZ;
        EnumC40671Fxj position = this.LIZLLL.getPosition();
        EnumC40673Fxl displayType = this.LIZLLL.getDisplayType();
        int i = this.LIZJ;
        o.LJIIIZ(position, "position");
        o.LJIIIZ(displayType, "displayType");
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        int i2 = 0;
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        if (c63120Opw2 != null) {
            str3 = c63120Opw2.getConversationId();
        }
        C98593tv c98593tv = new C98593tv(context, 3, str3);
        c98593tv.setEnterFromForMob("dm_search_page");
        c98593tv.setEnterMethodForMob(str2);
        if (c63120Opw2 != null) {
            z2 = c63120Opw2.isStickTop();
        } else {
            z2 = false;
        }
        c98593tv.setStickyTop(z2);
        if (c63120Opw2 != null) {
            i2 = (int) c63120Opw2.getUnreadCount();
        }
        c98593tv.setUnreadCount(i2);
        imChatService.LJFF(c98593tv);
        V8U.LIZ(position, displayType, null, c63120Opw2, i, EnumC57385Mfd.ENTER_CHAT);
    }

    public C87882YeM(C63120Opw c63120Opw, String str, int i, EnumC40672Fxk iMSearchMobData, java.util.Set<String> mobShowFilterSet, w0 w0Var) {
        AqS198S0100000_16 aqS198S0100000_16;
        o.LJIIIZ(iMSearchMobData, "iMSearchMobData");
        o.LJIIIZ(mobShowFilterSet, "mobShowFilterSet");
        this.LIZ = c63120Opw;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = iMSearchMobData;
        this.LJ = mobShowFilterSet;
        this.LJFF = w0Var;
        this.LJI = new AqS166S0100000_16(this, 5);
        this.LJII = new AqS198S0100000_16(this, 1);
        this.LJIIIIZZ = new AqS182S0100000_16(this, 13);
        this.LJIIIZ = new AqS182S0100000_16(this, 12);
        this.LJIIJ = new AqS198S0100000_16(this, 4);
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() == 5) {
            aqS198S0100000_16 = new AqS198S0100000_16(this, 3);
        } else {
            aqS198S0100000_16 = null;
        }
        this.LJIIJJI = aqS198S0100000_16;
        this.LJIIL = new AqS198S0100000_16(this, 2);
        this.LJIILIIL = new AqS166S0100000_16(this, 6);
    }
}
