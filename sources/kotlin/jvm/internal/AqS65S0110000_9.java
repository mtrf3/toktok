package kotlin.jvm.internal;

import X.AX8;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C10K;
import X.C54234LQg;
import X.C54239LQl;
import X.C54362LVe;
import X.C55096Ljo;
import X.C55888Lwa;
import X.C57935MoV;
import X.C57944Moe;
import X.C76800UCe;
import X.C8W0;
import X.EnumC56648MLc;
import X.EnumC57165Mc5;
import X.FMX;
import X.InterfaceC27853AwT;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import X.KR8;
import X.KU4;
import X.LKR;
import X.LQZ;
import Y.ACallableS104S0100000_1;
import android.text.TextUtils;
import com.bytedance.hox.Hox;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class AqS65S0110000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1();
            case 2:
                return invoke$2();
            case 3:
                return invoke$3();
            case 4:
                return invoke$4();
            case 5:
                return invoke$5();
            case 6:
                return invoke$6();
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$0() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility, X.2K0] */
    public final IFeedFetchDataAbility invoke$1() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedFetchDataAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility, X.2K0] */
    public final IPageStateAbility invoke$2() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IPageStateAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$3() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility, X.2K0] */
    public final IFeedFetchDataAbility invoke$4() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedFetchDataAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$5() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility, X.2K0] */
    public final IFeedPanelPlatformAbility invoke$6() {
        if (this.z1 && KR8.LJIIIZ((C8W0) ((KU4) this.l0))) {
            return null;
        }
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) ((KU4) this.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static final Object invoke$7(AqS65S0110000_9 aqS65S0110000_9) {
        C57935MoV c57935MoV = (C57935MoV) aqS65S0110000_9.l0;
        return new C57944Moe(c57935MoV.LJLIL, c57935MoV.LJLJJL, aqS65S0110000_9.z1);
    }

    public static final Object invoke$8(AqS65S0110000_9 aqS65S0110000_9) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC27853AwT interfaceC27853AwT;
        String str6;
        C54234LQg c54234LQg = (C54234LQg) aqS65S0110000_9.l0;
        boolean z = aqS65S0110000_9.z1;
        c54234LQg.getClass();
        HashMap hashMap = new HashMap();
        int LJIILIIL = C54362LVe.LJIILIIL(260);
        C54239LQl c54239LQl = C54239LQl.LIZIZ;
        int LIZJ = c54239LQl.LIZJ();
        String str7 = "1";
        if (LJIILIIL > 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        if (z) {
            str2 = String.valueOf(c54239LQl.LJ());
            str = "bubble";
        } else if (LIZJ > 0) {
            str2 = String.valueOf(LIZJ);
            str = "number_dot";
        } else if (c54239LQl.LIZIZ()) {
            str = "yellow_dot";
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "report_null";
            str2 = CardStruct.IStatusCode.DEFAULT;
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("notice_type", str);
        hashMap.put("show_cnt", str2);
        hashMap.put("is_live", obj);
        hashMap.put("message_cnt", String.valueOf(c54239LQl.LIZ()));
        InterfaceC36571c5 Ja = c54234LQg.LJ.Ja("NOTIFICATION");
        if ((Ja instanceof LQZ) || (Ja instanceof AX8)) {
            str3 = "chat";
        } else {
            str3 = "all";
        }
        hashMap.put("tab_name", str3);
        if (EnumC57165Mc5.CONTACTS.decideDisplay(c54234LQg.LIZ, c54234LQg.LIZJ) == EnumC56648MLc.GONE) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_auth_show", str7);
        String LJJLIIIJJI = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        ActivityC45651qj activityC45651qj = c54234LQg.LIZ;
        if (activityC45651qj != null) {
            String nv0 = c54234LQg.LJ.nv0();
            if (o.LJ(nv0, "HOME")) {
                if (LKR.LIZIZ(activityC45651qj, "page_profile")) {
                    str6 = "others_homepage";
                    hashMap.put("enter_from", str6);
                    hashMap.put("previous_page", LJJLIIIJJI);
                    LJJLIIIJJI = str6;
                }
                str6 = LJJLIIIJJI;
                hashMap.put("enter_from", str6);
                hashMap.put("previous_page", LJJLIIIJJI);
                LJJLIIIJJI = str6;
            } else {
                if (o.LJ(nv0, "NOTIFICATION") && (Ja instanceof AX8) && !((AX8) Ja).L3()) {
                    str6 = "notification_page";
                    hashMap.put("enter_from", str6);
                    hashMap.put("previous_page", LJJLIIIJJI);
                    LJJLIIIJJI = str6;
                }
                str6 = LJJLIIIJJI;
                hashMap.put("enter_from", str6);
                hashMap.put("previous_page", LJJLIIIJJI);
                LJJLIIIJJI = str6;
            }
        }
        if (TextUtils.isEmpty((CharSequence) hashMap.get("enter_from"))) {
            hashMap.put("enter_from", LJJLIIIJJI);
        }
        InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(Hox.LJLLI.LIZ(c54234LQg.LIZ).Ja("NOTIFICATION"));
        if (!(findTopFragment instanceof InterfaceC27853AwT) || (interfaceC27853AwT = (InterfaceC27853AwT) findTopFragment) == null || (str4 = interfaceC27853AwT.getPageName()) == null) {
            str4 = "";
        }
        hashMap.put("to_inbox_page", str4);
        hashMap.put("enter_method", "click_button_icon");
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        if (c55888Lwa.LJIIZILJ()) {
            if (c55888Lwa.LJJI(false)) {
                str5 = "on";
            } else {
                str5 = "off";
            }
            hashMap.put("creator_inbox_status", str5);
        }
        C10K.LIZIZ(new ACallableS104S0100000_1(hashMap, 22), FMX.LIZIZ(), null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0110000_9(C54234LQg c54234LQg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c54234LQg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0110000_9(C57935MoV c57935MoV, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c57935MoV;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0110000_9(boolean z, KU4 ku4, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = ku4;
    }
}
