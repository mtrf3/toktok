package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BZI;
import X.C0NE;
import X.C20940ry;
import X.C28733BPl;
import X.C28787BRn;
import X.C30868C9o;
import X.C31522CYs;
import X.C31526CYw;
import X.C31847Ceh;
import X.C32I;
import X.C51029K0z;
import X.C73546Sti;
import X.C74861TZp;
import X.C76662U6w;
import X.C76800UCe;
import X.C76857UEj;
import X.C76876UFc;
import X.C78020Ujg;
import X.CN1;
import X.FMX;
import X.InterfaceC20950rz;
import X.InterfaceC65784Pro;
import X.InterfaceC92693kP;
import X.JBR;
import X.ORZ;
import X.Q8U;
import X.U4R;
import X.U7T;
import X.U7V;
import X.U86;
import X.UEJ;
import X.UFM;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestZoomFixSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.model.Price;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import webcast.data.RealtimeLiveCenterTips;

/* loaded from: classes14.dex */
public class AqS80S1100000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        FMX.LJIILJJIL(this.s0, (JSONObject) this.l1);
    }

    public final void invoke$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_entry());
        LIZ.append("&is_spotlight_preview=1&sec_anchor_id=");
        String LJFF = JBR.LJFF(LIZ, this.s0, "&show_mask=1&mask_bg_color=0000007f&show_entrance=spotlight", LIZ);
        List<C76876UFc> list = ((SubscriptionSpotlightFragment) this.l1).xl().LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (C76876UFc c76876UFc : list) {
            Integer num = c76876UFc.LIZIZ;
            if (num == null || num.intValue() != 3) {
                arrayList.add(c76876UFc);
            }
        }
        List<C76876UFc> LJ = C31847Ceh.LJ(UFM.LJLIL, arrayList);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJ, 10));
        for (C76876UFc c76876UFc2 : LJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("data:image/png;base64,");
            LIZ2.append(c76876UFc2.LJI);
            arrayList2.add(X1D.LIZIZ(LIZ2));
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{ORZ.LLD(arrayList2, "\",\"", "[\"", "\"]", null, 56)}, 1, "{initial_data:{image_list:%s}}", "format(this, *args)");
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = (SubscriptionSpotlightFragment) this.l1;
        BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_subscriptoon_highlight_preview_click");
        subscriptionSpotlightFragment.Gl(LIZ3);
        LIZ3.LJIJJ(subscriptionSpotlightFragment.LJLIL, "show_entrance");
        LIZ3.LJJIIJZLJL();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        Context requireContext = ((SubscriptionSpotlightFragment) this.l1).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        iHybridContainerService.Vs0(requireContext, LJFF, new AqS33S1000000_10(LIZIZ, 6));
    }

    public static final Object invoke$0(AqS80S1100000_13 aqS80S1100000_13) {
        RankListViewModel LJII;
        RankListV2Response.RankView rankView;
        RankListController rankListController = ((RankListFragment) aqS80S1100000_13.l1).LJLJJLL;
        if (rankListController != null && (LJII = rankListController.LJII()) != null && (rankView = LJII.LJLILLLLZI) != null) {
            RankListFragment rankListFragment = (RankListFragment) aqS80S1100000_13.l1;
            String str = aqS80S1100000_13.s0;
            RankListController rankListController2 = rankListFragment.LJLJJLL;
            if (rankListController2 != null) {
                C31526CYw c31526CYw = rankListFragment.LJLJJI;
                String str2 = rankView.ruleUrl;
                o.LJIIIIZZ(str2, "it.ruleUrl");
                C78020Ujg c78020Ujg = new C78020Ujg(c31526CYw, str2);
                IChildController iChildController = (IChildController) rankListController2.LJLILLLLZI;
                iChildController.getClass();
                ((RankRootController) iChildController.LJLILLLLZI).LIZLLL(c78020Ujg);
            }
            C31522CYs.LJ(rankView, rankListFragment.LJLJJI, str, C51029K0z.LJIILIIL(rankListFragment));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS80S1100000_13 aqS80S1100000_13) {
        String str;
        RealtimeLiveCenterTips realtimeLiveCenterTips;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_center_tip_show");
        LIZ.LJIJJ(aqS80S1100000_13.s0, "tip_type");
        String str2 = aqS80S1100000_13.s0;
        UEJ uej = (UEJ) aqS80S1100000_13.l1;
        if (o.LJ(str2, "random")) {
            RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = uej.LJLJLLL;
            if (realtimeLiveCenterDetailData != null && (realtimeLiveCenterTips = realtimeLiveCenterDetailData.tipsInfo) != null) {
                str = realtimeLiveCenterTips.randomTipKey;
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "random_tip_key");
        }
        LIZ.LJIILLIIL(((UEJ) aqS80S1100000_13.l1).LJLIL);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS80S1100000_13 aqS80S1100000_13) {
        C30868C9o.LJFF((Context) aqS80S1100000_13.l1, aqS80S1100000_13.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS80S1100000_13 aqS80S1100000_13) {
        C30868C9o.LJFF((Context) aqS80S1100000_13.l1, aqS80S1100000_13.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS80S1100000_13 aqS80S1100000_13) {
        Price price;
        String str = aqS80S1100000_13.s0;
        if (str != null && (price = (Price) aqS80S1100000_13.l1) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(price.getPriceInLocalCurrency());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        return "";
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS80S1100000_13 aqS80S1100000_13) {
        aqS80S1100000_13.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS80S1100000_13 aqS80S1100000_13) {
        boolean z;
        InterfaceC20950rz interfaceC20950rz = (InterfaceC20950rz) ((CoHostFriendNoticeService) aqS80S1100000_13.l1).LJLJJI.getValue();
        JSONObject jSONObject = new JSONObject();
        CoHostFriendNoticeService coHostFriendNoticeService = (CoHostFriendNoticeService) aqS80S1100000_13.l1;
        String str = aqS80S1100000_13.s0;
        jSONObject.putOpt("is_notice_clicked", Integer.valueOf(coHostFriendNoticeService.LJLJLLL));
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.putOpt("trigger_by_client", Integer.valueOf(coHostFriendNoticeService.LJLIL.contains(str) ? 1 : 0));
        } else {
            jSONObject.putOpt("trigger_by_client", 0);
        }
        JSONObject jSONObject2 = coHostFriendNoticeService.LJLJJLL;
        if (jSONObject2 != null) {
            jSONObject.putOpt("cohost_friend_opt_strategy_result", jSONObject2);
        }
        C20940ry.LIZ(interfaceC20950rz, "co_host_friend_notice_20s_result", jSONObject, 2, 8);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS80S1100000_13 aqS80S1100000_13) {
        boolean z;
        InterfaceC20950rz interfaceC20950rz = (InterfaceC20950rz) ((CoHostFriendNoticeService) aqS80S1100000_13.l1).LJLJJI.getValue();
        JSONObject jSONObject = new JSONObject();
        CoHostFriendNoticeService coHostFriendNoticeService = (CoHostFriendNoticeService) aqS80S1100000_13.l1;
        String str = aqS80S1100000_13.s0;
        jSONObject.putOpt("is_notice_clicked", Integer.valueOf(coHostFriendNoticeService.LJLJLLL));
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.putOpt("trigger_by_client", Integer.valueOf(coHostFriendNoticeService.LJLIL.contains(str) ? 1 : 0));
        } else {
            jSONObject.putOpt("trigger_by_client", 0);
        }
        JSONObject jSONObject2 = coHostFriendNoticeService.LJLJJLL;
        if (jSONObject2 != null) {
            jSONObject.putOpt("cohost_friend_opt_strategy_result", jSONObject2);
        }
        C20940ry.LIZ(interfaceC20950rz, "co_host_friend_notice_result", jSONObject, 2, 8);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS80S1100000_13 aqS80S1100000_13) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRender dealing linkMicId=");
        LIZ.append(aqS80S1100000_13.s0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        C76662U6w LJJIZ = ((U7T) aqS80S1100000_13.l1).LJJIZ();
        String linkMicId = aqS80S1100000_13.s0;
        LJJIZ.getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        U7V.LJIILJJIL(new AqS80S1100000_13(LJJIZ, linkMicId, 6));
        U86 u86 = (U86) ((U7T) aqS80S1100000_13.l1).LJJLIIIIJ.getValue();
        String linkMicId2 = aqS80S1100000_13.s0;
        u86.getClass();
        o.LJIIIZ(linkMicId2, "linkMicId");
        U7V.LJIILJJIL(new AqS80S1100000_13(u86, linkMicId2, 7));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS80S1100000_13 aqS80S1100000_13) {
        ((C76662U6w) aqS80S1100000_13.l1).LIZJ.add(aqS80S1100000_13.s0);
        if (((C76662U6w) aqS80S1100000_13.l1).LIZIZ.containsKey(aqS80S1100000_13.s0)) {
            InterfaceC92693kP interfaceC92693kP = ((C76662U6w) aqS80S1100000_13.l1).LIZIZ.get(aqS80S1100000_13.s0);
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            ((C76662U6w) aqS80S1100000_13.l1).LIZIZ.remove(aqS80S1100000_13.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS80S1100000_13 aqS80S1100000_13) {
        if (((Boolean) ((U86) aqS80S1100000_13.l1).LJII.getValue()).booleanValue()) {
            U86 u86 = (U86) aqS80S1100000_13.l1;
            u86.LIZLLL.add(aqS80S1100000_13.s0);
            if (C76857UEj.LJIILIIL(u86.LIZLLL, u86.LIZJ)) {
                C73546Sti c73546Sti = u86.LJ;
                if (c73546Sti != null) {
                    c73546Sti.dispose();
                }
                u86.LJ = null;
            }
        }
        if (((Boolean) ((U86) aqS80S1100000_13.l1).LJI.getValue()).booleanValue()) {
            U86 u862 = (U86) aqS80S1100000_13.l1;
            if (!u862.LIZJ.contains(aqS80S1100000_13.s0)) {
                u862.LIZ.LLLZLL("recharge_push_less", null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS80S1100000_13 aqS80S1100000_13) {
        boolean z;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str = ((C74861TZp) aqS80S1100000_13.l1).LIZJ;
        LJIILIIL.getClass();
        C0NE.LJII(str, "onUserLeft");
        if (((C74861TZp) aqS80S1100000_13.l1).LIZ.LJI() && o.LJ(aqS80S1100000_13.s0, ((C74861TZp) aqS80S1100000_13.l1).LIZ.LIZ.LIZJ) && LinkMicMultiGuestZoomFixSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AqS80S1100000_13 aqS80S1100000_13) {
        aqS80S1100000_13.invoke$1();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(C74861TZp c74861TZp, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c74861TZp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(C76662U6w c76662U6w, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c76662U6w;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(U7T u7t, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = u7t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(U86 u86, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = u86;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(CoHostFriendNoticeService coHostFriendNoticeService, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = coHostFriendNoticeService;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(RankListFragment rankListFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = rankListFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(String str, UEJ uej, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = uej;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(String str, SubscriptionSpotlightFragment subscriptionSpotlightFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = subscriptionSpotlightFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(String str, Price price, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S1100000_13(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
    }
}
