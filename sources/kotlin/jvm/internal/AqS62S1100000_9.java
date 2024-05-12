package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C116484hg;
import X.C16880lQ;
import X.C1DH;
import X.C35638Dyk;
import X.C47261Igj;
import X.C4LX;
import X.C52822KoE;
import X.C53710L6c;
import X.C54098LLa;
import X.C54406LWw;
import X.C54602Lbq;
import X.C55239Lm7;
import X.C55241Lm9;
import X.C55249LmH;
import X.C55793Lv3;
import X.C68322mC;
import X.C76542zS;
import X.C76800UCe;
import X.EF7;
import X.EnumC56196M3s;
import X.IJX;
import X.InterfaceC54080LKi;
import X.InterfaceC55235Lm3;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.L4T;
import X.L4W;
import X.L6Y;
import X.M38;
import X.M4B;
import X.O4B;
import X.O4O;
import X.ORZ;
import X.OSZ;
import X.UPK;
import X.US4;
import Y.ARunnableS28S0200000_9;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.provider.preload.PreLoader;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS62S1100000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(Map<L4T, L4W> it) {
        o.LJIIIZ(it, "it");
        if (o.LJ(this.s0, ((AvatarControllerVM) this.l1).LJLIL)) {
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                ((AvatarControllerVM) this.l1).LJLJLJ.setValue(it);
            } else {
                C1DH.LJJIJIIJI(new ARunnableS28S0200000_9(it, (AvatarControllerVM) this.l1, 48));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Boolean] */
    public static final Object invoke$0(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        O4B responseCache = (O4B) obj;
        o.LJIIJ(responseCache, "responseCache");
        if (o.LJ(responseCache.LIZIZ(), aqS62S1100000_9.s0)) {
            ((C68322mC) aqS62S1100000_9.l1).element = Boolean.valueOf(responseCache.LJ());
            return new OSZ(Boolean.TRUE, Boolean.FALSE);
        }
        WeakReference<O4O> weakReference = responseCache.LJFF;
        if (weakReference != null) {
            boolean z = false;
            if (weakReference.get() != null) {
                C68322mC c68322mC = (C68322mC) aqS62S1100000_9.l1;
                Boolean bool = (Boolean) c68322mC.element;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                c68322mC.element = Boolean.valueOf(responseCache.LJ() | z);
            }
        }
        Boolean bool2 = Boolean.FALSE;
        return new OSZ(bool2, bool2);
    }

    public static final Object invoke$1(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        US4 buildAuthDialogCenter = (US4) obj;
        o.LJIIIZ(buildAuthDialogCenter, "$this$buildAuthDialogCenter");
        buildAuthDialogCenter.LIZJ(EnumC56196M3s.SOCIAL_RELEVANT_EVENT);
        buildAuthDialogCenter.LIZIZ((InterfaceC70422pa) aqS62S1100000_9.l1);
        buildAuthDialogCenter.LJ(new AqS32S1000000_9(aqS62S1100000_9.s0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS62S1100000_9 aqS62S1100000_9, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        C54098LLa.LIZ(((InterfaceC54080LKi) aqS62S1100000_9.l1).LIZ());
        String str2 = aqS62S1100000_9.s0;
        switch (str2.hashCode()) {
            case -1965615457:
                if (str2.equals("Nearby")) {
                    str = "homepage_nearby";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case -1525083535:
                if (str2.equals("Following")) {
                    str = "homepage_follow";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case -1309089240:
                if (str2.equals("FRIENDS_FEED")) {
                    str = "homepage_friends";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case 2576150:
                if (str2.equals("Shop")) {
                    str = "shop_tab";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case 984907784:
                if (str2.equals("For You")) {
                    str = "homepage_hot";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case 1270713017:
                if (str2.equals("Popular")) {
                    str = "faq_page";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
            case 1442906357:
                if (str2.equals("MUSIC_DSP_XTAB")) {
                    str = "music_tab";
                    C116484hg.LIZ("enter_from", str, "homepage_main_tab_name_show");
                    break;
                }
                break;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        M38 setState = (M38) obj;
        o.LJIIIZ(setState, "$this$setState");
        M38 LIZ = M38.LIZ(setState, null, null, new IJX(aqS62S1100000_9.s0, ((DiscoveryLandingMapVM) aqS62S1100000_9.l1).LLIFFJFJJ, 4), null, 11);
        ((DiscoveryLandingMapVM) aqS62S1100000_9.l1).LLIFFJFJJ = true;
        return LIZ;
    }

    public static final Object invoke$12(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        RecUser it = (RecUser) obj;
        o.LJIIIZ(it, "it");
        RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) aqS62S1100000_9.l1;
        String str = aqS62S1100000_9.s0;
        recSwipeViewModel.getClass();
        if (!o.LJ(str, "homepage_hot")) {
            str = "no_fyp_feed";
        }
        return Boolean.valueOf(!RecSwipeViewModel.lv0(it, str));
    }

    public static final Object invoke$13(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        US4 buildAuthDialogCenter = (US4) obj;
        o.LJIIIZ(buildAuthDialogCenter, "$this$buildAuthDialogCenter");
        buildAuthDialogCenter.LIZJ(EnumC56196M3s.FYP);
        buildAuthDialogCenter.LIZIZ((InterfaceC70422pa) aqS62S1100000_9.l1);
        buildAuthDialogCenter.LJ(new AqS32S1000000_9(aqS62S1100000_9.s0, 18));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(((UPK) aqS62S1100000_9.l1).LIZLLL.invoke());
        trackerConfig.LIZIZ(aqS62S1100000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        String str;
        int i;
        Integer tabType;
        C35638Dyk state = (C35638Dyk) obj;
        o.LJIIIZ(state, "state");
        MallRacunTabInfo mallRacunTabInfo = (MallRacunTabInfo) ORZ.LJLLLLLL(((MallRacunFragment) aqS62S1100000_9.l1).LJZL, state.LJLIL);
        if (mallRacunTabInfo == null || (str = mallRacunTabInfo.getTabName()) == null) {
            str = "";
        }
        MallRacunTabInfo mallRacunTabInfo2 = (MallRacunTabInfo) ORZ.LJLLLLLL(((MallRacunFragment) aqS62S1100000_9.l1).LJZL, state.LJLIL);
        if (mallRacunTabInfo2 != null && (tabType = mallRacunTabInfo2.getTabType()) != null) {
            i = tabType.intValue();
        } else {
            i = -1;
        }
        String enterMethod = aqS62S1100000_9.s0;
        o.LJIIIZ(enterMethod, "enterMethod");
        C55793Lv3.LIZJ = System.currentTimeMillis();
        C55793Lv3.LJFF = enterMethod;
        C55793Lv3.LIZLLL = str;
        C55793Lv3.LJ = i;
        C76542zS.LIZJ("tiktokec_enter_list", new AqS1S2001000_9(str, i, enterMethod, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(aweme, "aweme");
        L6Y l6y = (L6Y) aqS62S1100000_9.l1;
        String str = aqS62S1100000_9.s0;
        C53710L6c LIZIZ = l6y.LJLJJI.LIZIZ(aweme);
        C47261Igj.LJJJJLI(LIZIZ, Boolean.TRUE, Long.valueOf(System.currentTimeMillis()));
        l6y.N(str, LIZIZ, Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        aqS62S1100000_9.invoke$0((Map) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C54602Lbq(aqS62S1100000_9.s0, (C54406LWw) aqS62S1100000_9.l1);
        hierarchyData.LIZIZ = "feed_skylight_hierarchy_data_key";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        US4 buildAuthDialogCenter = (US4) obj;
        o.LJIIIZ(buildAuthDialogCenter, "$this$buildAuthDialogCenter");
        buildAuthDialogCenter.LIZJ(EnumC56196M3s.SOCIAL_RELEVANT_EVENT);
        buildAuthDialogCenter.LIZIZ((InterfaceC70422pa) aqS62S1100000_9.l1);
        buildAuthDialogCenter.LJ(new AqS32S1000000_9(aqS62S1100000_9.s0, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        InterfaceC55235Lm3 LIZ = PreLoader.LIZ((ActivityC45651qj) aqS62S1100000_9.l1, aqS62S1100000_9.s0);
        if (LIZ == null) {
            interfaceC55235Lm3 = new C55239Lm7((ActivityC45651qj) aqS62S1100000_9.l1, it);
        } else {
            interfaceC55235Lm3 = LIZ;
        }
        C55249LmH.LIZ("vprovider_vscope", new AqS148S0200000_1(LIZ, interfaceC55235Lm3, 36));
        return interfaceC55235Lm3;
    }

    public static final Object invoke$6(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        InterfaceC55235Lm3 LIZ = PreLoader.LIZ((Fragment) aqS62S1100000_9.l1, aqS62S1100000_9.s0);
        if (LIZ == null) {
            return new C55241Lm9((Fragment) aqS62S1100000_9.l1, it);
        }
        return LIZ;
    }

    public static final Object invoke$7(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        String tag = (String) obj;
        o.LJIIIZ(tag, "tag");
        int hashCode = tag.hashCode();
        if (hashCode != -1837180097) {
            if (hashCode != 3357525) {
                if (hashCode == 1934780818 && tag.equals("whatsapp") && ((Number) C52822KoE.LIZ.getValue()).intValue() != 0 && ((Aweme) aqS62S1100000_9.l1).getAwemeType() == 0 && !TextUtils.equals(aqS62S1100000_9.s0, "publish_then_share")) {
                    return "WhatsApp Link";
                }
            } else if (tag.equals("more")) {
                return EF7.LIZIZ().getString(R.string.h33);
            }
        } else if (tag.equals("whatsapp_status") && ((Number) C52822KoE.LIZ.getValue()).intValue() != 0 && ((Aweme) aqS62S1100000_9.l1).getAwemeType() == 0 && !TextUtils.equals(aqS62S1100000_9.s0, "publish_then_share")) {
            return "WhatsApp Video";
        }
        return null;
    }

    public static final Object invoke$8(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        US4 buildAuthDialogCenter = (US4) obj;
        o.LJIIIZ(buildAuthDialogCenter, "$this$buildAuthDialogCenter");
        buildAuthDialogCenter.LIZJ(EnumC56196M3s.SOCIAL_RELEVANT_EVENT);
        buildAuthDialogCenter.LIZIZ((InterfaceC70422pa) aqS62S1100000_9.l1);
        buildAuthDialogCenter.LJ(new AqS32S1000000_9(aqS62S1100000_9.s0, 13));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS62S1100000_9 aqS62S1100000_9, Object obj) {
        US4 buildAuthDialogCenter = (US4) obj;
        o.LJIIIZ(buildAuthDialogCenter, "$this$buildAuthDialogCenter");
        buildAuthDialogCenter.LIZJ(EnumC56196M3s.SOCIAL_RELEVANT_EVENT);
        buildAuthDialogCenter.LIZIZ((InterfaceC70422pa) aqS62S1100000_9.l1);
        buildAuthDialogCenter.LJ(new AqS32S1000000_9(aqS62S1100000_9.s0, 14));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(ActivityC45651qj activityC45651qj, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityC45651qj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(InterfaceC70422pa interfaceC70422pa, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC70422pa;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(L6Y l6y, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = l6y;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(InterfaceC54080LKi interfaceC54080LKi, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC54080LKi;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(UPK upk, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = upk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(Fragment fragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(MallRacunFragment mallRacunFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = mallRacunFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(RecSwipeViewModel recSwipeViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = recSwipeViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(String str, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(String str, C54406LWw c54406LWw, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c54406LWw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(String str, AvatarControllerVM avatarControllerVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = avatarControllerVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1100000_9(String str, DiscoveryLandingMapVM discoveryLandingMapVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = discoveryLandingMapVM;
    }
}
