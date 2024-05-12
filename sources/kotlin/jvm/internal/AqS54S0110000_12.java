package kotlin.jvm.internal;

import X.AK4;
import X.AbstractC65781Prl;
import X.C27932Axk;
import X.C27943Axv;
import X.C61878OQg;
import X.C69600RTg;
import X.C69643RUx;
import X.C69925RcP;
import X.C69926RcQ;
import X.C70414RkI;
import X.C71313Ryn;
import X.C72188SUu;
import X.C72231SWl;
import X.C72818Shy;
import X.C72944Sk0;
import X.C72949Sk5;
import X.C74189T9t;
import X.C76800UCe;
import X.C86655Xzf;
import X.C87277YNd;
import X.EnumC70239RhT;
import X.EnumC72939Sjv;
import X.InterfaceC88472Yns;
import X.MG0;
import X.MGL;
import X.OH3;
import X.ORZ;
import X.RVC;
import X.RWJ;
import X.RXV;
import X.RYM;
import X.S6S;
import X.SV7;
import X.SVA;
import X.TA3;
import X.X1D;
import X.XKX;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.music.model.PlayListAnchorExtra;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class AqS54S0110000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(VideoMusicTitleVM videoMusicTitleVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoMusicTitleVM;
        this.z1 = true;
    }

    public static final Object invoke$0(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        C74189T9t it = (C74189T9t) obj;
        o.LJIIIZ(it, "it");
        XKX.LIZLLL(((EffectEditVM) aqS54S0110000_12.l0).getAssemVMScope(), null, null, new TA3(aqS54S0110000_12.z1, (EffectEditVM) aqS54S0110000_12.l0, it, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("module_name", "platform_discounts");
        logWhenShow.plusAssign("is_coupon_available", Integer.valueOf(!aqS54S0110000_12.z1 ? 1 : 0));
        C87277YNd.LJJJJJL(logWhenShow, ((C69643RUx) aqS54S0110000_12.l0).LIZLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        FollowingRelationState setState = (FollowingRelationState) obj;
        o.LJIIIZ(setState, "$this$setState");
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!aqS54S0110000_12.z1) {
            hashMap.putAll(setState.getUnreadCountMap());
            arrayList.addAll(setState.getUnreadUidList());
        }
        List<User> list = ((FollowingItemList) aqS54S0110000_12.l0).items;
        if (list != null) {
            for (User user : ORZ.LJLL(list)) {
                if (user.getUnReadVideoInfo() != null) {
                    user.getUid();
                    user.getUnReadVideoCount();
                    if (user.getUnReadVideoCount() > 0) {
                        String uid = user.getUid();
                        o.LJIIIIZZ(uid, "it.uid");
                        hashMap.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                        String uid2 = user.getUid();
                        o.LJIIIIZZ(uid2, "it.uid");
                        arrayList.add(uid2);
                    }
                }
            }
        }
        return FollowingRelationState.copy$default(setState, null, null, false, null, null, false, 0, null, hashMap, arrayList, null, null, 0, 7423, null);
    }

    public static final Object invoke$11(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (aqS54S0110000_12.z1) {
            return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, (EnumC70239RhT) aqS54S0110000_12.l0, null, null, false, null, new Object(), null, false, null, null, null, null, 2130182143, null);
        }
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, (EnumC70239RhT) aqS54S0110000_12.l0, null, null, false, null, null, null, false, null, null, null, null, 2146959359, null);
    }

    public static final Object invoke$12(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        String str;
        int i;
        Integer num;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        boolean z = aqS54S0110000_12.z1;
        Response response = (Response) aqS54S0110000_12.l0;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        logView.plusAssign("save_type", str);
        if (response != null && response.isCodeOK()) {
            i = 1;
        } else {
            i = 0;
        }
        logView.plusAssign("is_success", Integer.valueOf(i));
        if (response != null) {
            if (!response.isCodeOK()) {
                num = Integer.valueOf(response.code);
            }
            return C76800UCe.LIZ;
        }
        num = null;
        logView.plusAssign("error_code", num);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        Aweme aweme;
        C72231SWl setState = (C72231SWl) obj;
        o.LJIIIZ(setState, "$this$setState");
        VideoMusicTitleVM videoMusicTitleVM = (VideoMusicTitleVM) aqS54S0110000_12.l0;
        VideoItemParams gv0 = videoMusicTitleVM.gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return C72231SWl.LIZ(setState, null, false, null, false, false, false, Boolean.valueOf(videoMusicTitleVM.kv0(aweme, aqS54S0110000_12.z1)), 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    public static final Object invoke$14(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        String str;
        ?? r0;
        Integer num;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        boolean z = aqS54S0110000_12.z1;
        Response response = (Response) aqS54S0110000_12.l0;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        logNode.plusAssign("save_type", str);
        if (response != null) {
            r0 = response.isCodeOK();
        } else {
            r0 = 0;
        }
        logNode.plusAssign("is_success", Integer.valueOf((int) r0));
        if (response != null) {
            if (!response.isCodeOK()) {
                num = Integer.valueOf(response.code);
            }
            return C76800UCe.LIZ;
        }
        num = null;
        logNode.plusAssign("error_code", num);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        S6S setStateImmediate = (S6S) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return S6S.LIZ(setStateImmediate, (RootData) aqS54S0110000_12.l0, aqS54S0110000_12.z1, false, null, null, 57);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final Object invoke$16(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        ?? r5;
        String str;
        Map<String, RYM> map;
        Set<String> keySet;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "together_add_to_cart");
        C69926RcQ c69926RcQ = ((C69925RcP) aqS54S0110000_12.l0).LJLJJLL;
        if (c69926RcQ != null && (map = c69926RcQ.LIZ) != null && (keySet = map.keySet()) != null) {
            C69925RcP c69925RcP = (C69925RcP) aqS54S0110000_12.l0;
            r5 = new ArrayList();
            for (String str2 : keySet) {
                RYM rym = c69925RcP.LJLJJLL.LIZ.get(str2);
                if (rym != null && rym.LJFF) {
                    r5.add(str2);
                }
            }
        } else {
            r5 = C61878OQg.INSTANCE;
        }
        logNode.plusAssign("product_id", ORZ.LLD(r5, ",", null, null, null, 62));
        logNode.plusAssign("product_cnt", Integer.valueOf(r5.size()));
        logNode.plusAssign("product_source", 5);
        if (aqS54S0110000_12.z1) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        logNode.plusAssign("button_type", str);
        logNode.plusAssign("source_page_type", "buy_together");
        logNode.plusAssign("source_module", "rec_pdp_outer_buy_together_module");
        logNode.plusAssign("original_price", ((C69925RcP) aqS54S0110000_12.l0).LJLL);
        logNode.plusAssign("sales_price", ((C69925RcP) aqS54S0110000_12.l0).LJLJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        List<SalePropValue> list;
        SaleProp saleProp;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        StringBuilder sb = new StringBuilder();
        List<SaleProp> list2 = ((RWJ) aqS54S0110000_12.l0).LIZ;
        if (list2 == null || (saleProp = (SaleProp) ORZ.LJLLLLLL(1, list2)) == null || (list = saleProp.salePropValueList) == null) {
            list = C61878OQg.INSTANCE;
        }
        for (SalePropValue salePropValue : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(salePropValue.propValueId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("size_id", sb.toString());
        logWhenShow.plusAssign("module_name", "size_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS54S0110000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        NotificationChoiceState setState = (NotificationChoiceState) obj;
        o.LJIIIZ(setState, "$this$setState");
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!aqS54S0110000_12.z1) {
            hashMap.putAll(setState.getUnreadCountMap());
            arrayList.addAll(setState.getUnreadUidList());
        }
        List<User> list = ((FollowingItemList) aqS54S0110000_12.l0).items;
        if (list != null) {
            for (User user : ORZ.LJLL(list)) {
                if (user.getUnReadVideoInfo() != null) {
                    user.getUid();
                    user.getUnReadVideoCount();
                    if (user.getUnReadVideoCount() > 0) {
                        String uid = user.getUid();
                        o.LJIIIIZZ(uid, "it.uid");
                        hashMap.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                        String uid2 = user.getUid();
                        o.LJIIIIZZ(uid2, "it.uid");
                        arrayList.add(uid2);
                    }
                }
            }
        }
        return NotificationChoiceState.copy$default(setState, null, null, false, null, false, 0, null, false, hashMap, arrayList, 255, null);
    }

    public static final Object invoke$19(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        if (aqS54S0110000_12.z1) {
            str = "to_affiliate_product";
        } else {
            str = "close";
        }
        logNode.plusAssign("action_type", str);
        logNode.put("popup_name", "nonaffiliate_product");
        logNode.withParamsGroup(((C70414RkI) aqS54S0110000_12.l0).LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        List<SalePropValue> list;
        SaleProp saleProp;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        StringBuilder sb = new StringBuilder();
        List<SaleProp> list2 = ((RXV) aqS54S0110000_12.l0).LIZ;
        if (list2 == null || (saleProp = (SaleProp) ORZ.LJLLLLLL(1, list2)) == null || (list = saleProp.salePropValueList) == null) {
            list = C61878OQg.INSTANCE;
        }
        for (SalePropValue salePropValue : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(salePropValue.propValueId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("size_id", sb.toString());
        logWhenShow.plusAssign("module_name", "size_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS54S0110000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        List<SalePropValue> list;
        SaleProp saleProp;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        StringBuilder sb = new StringBuilder();
        List<SaleProp> list2 = ((RXV) aqS54S0110000_12.l0).LIZ;
        if (list2 == null || (saleProp = (SaleProp) ORZ.LJLLLLLL(1, list2)) == null || (list = saleProp.salePropValueList) == null) {
            list = C61878OQg.INSTANCE;
        }
        for (SalePropValue salePropValue : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(salePropValue.propValueId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("size_id", sb.toString());
        logWhenShow.plusAssign("module_name", "size_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS54S0110000_12.z1 ? 1 : 0));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r0 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS54S0110000_12 r7, java.lang.Object r8) {
        /*
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r8 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r8
            java.lang.String r0 = "effectChannelResponse"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.Object r4 = r7.l0
            com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel r4 = (com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel) r4
            boolean r5 = r7.z1
            r4.getClass()
            if (r5 == 0) goto L7a
            java.lang.String r7 = com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel.LJLJLJ
            java.lang.String r6 = com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel.LJLL
        L16:
            java.util.List r0 = r8.getCategoryResponseList()
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate r1 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate) r1
            java.lang.String r0 = r1.getKey()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L1e
            java.util.List r0 = r1.getTotalEffects()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
            if (r6 == 0) goto L6d
            java.util.List r0 = r1.getTotalEffects()
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            java.lang.String r1 = r0.getName()
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r6)
            if (r1 == 0) goto L4b
        L61:
        L62:
            X.SfZ r1 = new X.SfZ
            r1.<init>(r4, r8, r5)
            X.HW1.LIZ(r3, r0, r1)
        L6a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6d:
            java.util.List r0 = r1.getTotalEffects()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            if (r0 != 0) goto L61
            goto L6a
        L7a:
            java.lang.String r7 = com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel.LJLJL
            java.lang.String r6 = com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel.LJLJLLL
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS54S0110000_12.invoke$4(kotlin.jvm.internal.AqS54S0110000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        String str;
        String str2;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "video");
        if (aqS54S0110000_12.z1) {
            str = "yes";
        } else {
            str = "no";
        }
        c27943Axv.LIZLLL("is_single_anchor", str);
        if (aqS54S0110000_12.z1) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c27943Axv.LIZLLL("entrance_form", str2);
        c27943Axv.LIZLLL("anchor_show_type", "video_cart_tag");
        c27943Axv.LJ((Map) aqS54S0110000_12.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        String str;
        TTMStoreLink tTMStoreLink;
        AnchorCommonStruct withAnchor = (AnchorCommonStruct) obj;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        String schema = withAnchor.getSchema();
        if (schema != null && ujb.o.LJJJLIIL(schema, "aweme://lynxview", false)) {
            StringBuilder LIZJ = b1.LIZJ(schema, "&enter_from=");
            LIZJ.append(((C72188SUu) aqS54S0110000_12.l0).LJJIIZI());
            LIZJ.append("&open_timestamp=");
            LIZJ.append(System.currentTimeMillis());
            LIZJ.append("&item_id=");
            LIZJ.append(((C72188SUu) aqS54S0110000_12.l0).LJJII().getAid());
            C72188SUu c72188SUu = (C72188SUu) aqS54S0110000_12.l0;
            OH3 oh3 = OH3.PLAYLIST;
            c72188SUu.getClass();
            SV7 sv7 = SV7.LIZ;
            PlayListAnchorExtra playListAnchorExtra = c72188SUu.LJLJLJ;
            if (playListAnchorExtra != null) {
                tTMStoreLink = playListAnchorExtra.store;
            } else {
                tTMStoreLink = null;
            }
            SVA sva = SVA.TIKTOK_MUSIC;
            sv7.getClass();
            LIZJ.append(SV7.LIZIZ(tTMStoreLink, oh3, sva));
            LIZJ.append("&request_id=");
            LIZJ.append(((C72188SUu) aqS54S0110000_12.l0).LJJII().getRequestId());
            str = X1D.LIZIZ(LIZJ);
        } else {
            str = "";
        }
        if (str.length() > 0) {
            if (aqS54S0110000_12.z1 && !MG0.LIZIZ) {
                MG0.LIZIZ = true;
                C72818Shy.LIZLLL("music_subscription_success_event", (MGL) MG0.LJ.getValue());
            }
            PlayListAnchorExtra playListAnchorExtra2 = ((C72188SUu) aqS54S0110000_12.l0).LJLJLJ;
            if (playListAnchorExtra2 != null && playListAnchorExtra2.isTTM()) {
                C27932Axk.LIZIZ();
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(((C72188SUu) aqS54S0110000_12.l0).LJJI(), str);
            buildRoute.withParam("enter_from", ((C72188SUu) aqS54S0110000_12.l0).LJJIIZI());
            buildRoute.open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        Aweme aweme;
        RVC it = (RVC) obj;
        o.LJIIIZ(it, "it");
        VideoItemParams gv0 = ((VideoCLACaptionViewModel) aqS54S0110000_12.l0).gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        if (C86655Xzf.LIZ(aweme, it.LJLJJL, aqS54S0110000_12.z1, ((VideoCLACaptionViewModel) aqS54S0110000_12.l0).LLIIII)) {
            ((VideoCLACaptionViewModel) aqS54S0110000_12.l0).setStateImmediate(C69600RTg.LJLIL);
            AK4.LIZ().LJII(AK4.LIZ().LJIIL() + 1);
            AK4.LIZ().LJIJJ(System.currentTimeMillis());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        C72949Sk5 setState = (C72949Sk5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C72949Sk5.L(setState, new C72944Sk0((EnumC72939Sjv) aqS54S0110000_12.l0, aqS54S0110000_12.z1), false, null, null, null, null, 62);
    }

    public static final Object invoke$9(AqS54S0110000_12 aqS54S0110000_12, Object obj) {
        ((DistributeStatusViewModel) aqS54S0110000_12.l0).setState(new AqS16S0010000_12(aqS54S0110000_12.z1, 12));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(RWJ rwj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rwj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(RXV rxv, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rxv;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(C69925RcP c69925RcP, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c69925RcP;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(EnumC70239RhT enumC70239RhT, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC70239RhT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(C72188SUu c72188SUu, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c72188SUu;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(EnumC72939Sjv enumC72939Sjv, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC72939Sjv;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(DistributeStatusViewModel distributeStatusViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = distributeStatusViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(VideoCLACaptionViewModel videoCLACaptionViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoCLACaptionViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(FollowingItemList followingItemList, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = followingItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(RootData rootData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rootData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(EffectEditVM effectEditVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = effectEditVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(ProfileNaviEditorViewModel profileNaviEditorViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileNaviEditorViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(boolean z, C69643RUx c69643RUx, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c69643RUx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0110000_12(boolean z, C70414RkI c70414RkI, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c70414RkI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0110000_12(boolean z, boolean z2, Response<Object> response) {
        super(1);
        this.$t = response;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0110000_12(boolean z, boolean z2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
