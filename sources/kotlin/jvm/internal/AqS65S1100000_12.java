package kotlin.jvm.internal;

import X.AYA;
import X.AbstractC65781Prl;
import X.C0R1;
import X.C16880lQ;
import X.C27739Aud;
import X.C27943Axv;
import X.C61878OQg;
import X.C69643RUx;
import X.C70042ReI;
import X.C70414RkI;
import X.C70666RoM;
import X.C70690Rok;
import X.C70691Rol;
import X.C71765SEn;
import X.C72457Sc9;
import X.C72879Six;
import X.C72972SkS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78857UxB;
import X.C87277YNd;
import X.InterfaceC72840SiK;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.aweme.qna.fragment.QnaSuggestedTabFragment;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import com.ss.android.ugc.aweme.utils.Au2S1S1100000_12;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ujb.s;

/* loaded from: classes13.dex */
public class AqS65S1100000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ProductReviewState it) {
        o.LJIIIZ(it, "it");
        if (C78685UuP.LJJJZ(this.s0)) {
            View review_ratings = ((ReviewFragmentV1) this.l1)._$_findCachedViewById(R.id.j17);
            o.LJIIIIZZ(review_ratings, "review_ratings");
            review_ratings.setVisibility(0);
            View review_ratings2 = ((ReviewFragmentV1) this.l1)._$_findCachedViewById(R.id.j17);
            o.LJIIIIZZ(review_ratings2, "review_ratings");
            C16880lQ.LJIIJ(new Au2S1S1100000_12((ReviewFragmentV1) this.l1, this.s0, 2), review_ratings2);
        }
    }

    public static final Object invoke$0(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        List<AIGCQuota> quotas = (List) obj;
        o.LJIIIZ(quotas, "quotas");
        ProfileAigcProgressAssem profileAigcProgressAssem = (ProfileAigcProgressAssem) aqS65S1100000_12.l1;
        profileAigcProgressAssem.K3(aqS65S1100000_12.s0, profileAigcProgressAssem.v3(quotas));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        List<AIGCQuota> quotas = (List) obj;
        o.LJIIIZ(quotas, "quotas");
        ProfileAigcProgressAssem profileAigcProgressAssem = (ProfileAigcProgressAssem) aqS65S1100000_12.l1;
        profileAigcProgressAssem.L3(aqS65S1100000_12.s0, profileAigcProgressAssem.v3(quotas));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70691Rol) aqS65S1100000_12.l1).getClass();
        C70691Rol.LIZIZ(logNode);
        logNode.plusAssign("button_name", "buy_now");
        logNode.plusAssign("button_type", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS65S1100000_12 aqS65S1100000_12, Object it) {
        o.LJIIIZ(it, "it");
        if (((ReviewFragment) aqS65S1100000_12.l1).xl().LJLLILLLL != null) {
            C70691Rol.LJFF((ReviewFragment) aqS65S1100000_12.l1, "sort_by", aqS65S1100000_12.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        C70666RoM.LJ(logView, (ReviewItemStruct) aqS65S1100000_12.l1, C70691Rol.LJIJ);
        logView.put("button_for", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS65S1100000_12 aqS65S1100000_12, Object it) {
        o.LJIIIZ(it, "it");
        if (((ReviewFragmentV1) aqS65S1100000_12.l1).Al().LJLLILLLL != null) {
            C70691Rol.LJFF((ReviewFragmentV1) aqS65S1100000_12.l1, "sort_by", aqS65S1100000_12.s0);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        aqS65S1100000_12.invoke$0((ProductReviewState) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        String LIZJ;
        ProductReviewState it = (ProductReviewState) obj;
        o.LJIIIZ(it, "it");
        String string = ((ReviewFragment) aqS65S1100000_12.l1).getString(R.string.f_o);
        o.LJIIIIZZ(string, "getString(R.string.ecom_…iew_secondary_page_title)");
        TextView textView = (TextView) ((ReviewFragment) aqS65S1100000_12.l1)._$_findCachedViewById(R.id.m8g);
        String str = aqS65S1100000_12.s0;
        int i = 0;
        if (str == null || str.length() == 0) {
            StringBuilder LIZJ2 = b1.LIZJ(string, " (");
            Integer count = it.getCount();
            if (count != null) {
                i = count.intValue();
            }
            LIZJ = b0.LIZJ(LIZJ2, i, ')', LIZJ2);
        } else {
            StringBuilder LJFF = C72972SkS.LJFF(string, ' ');
            LJFF.append(aqS65S1100000_12.s0);
            LIZJ = X1D.LIZIZ(LJFF);
        }
        textView.setText(LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70691Rol) aqS65S1100000_12.l1).getClass();
        C70691Rol.LIZIZ(logNode);
        logNode.plusAssign("button_name", "add_to_cart");
        logNode.plusAssign("button_type", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        Object obj2;
        Object obj3;
        C70690Rok c70690Rok;
        Integer num;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        Object obj4 = null;
        String str = null;
        if (C70691Rol.LJIJJLI == 2) {
            logNode.plusAssign("shop_id", C70691Rol.LJIJJ);
            logNode.plusAssign("page_name", "shop_review");
            C70690Rok c70690Rok2 = C70691Rol.LJIJ;
            if (c70690Rok2 != null) {
                obj2 = c70690Rok2.LJ;
            } else {
                obj2 = null;
            }
            logNode.plusAssign("review_cnt", obj2);
            C70690Rok c70690Rok3 = C70691Rol.LJIJ;
            if (c70690Rok3 != null) {
                str = c70690Rok3.LIZJ;
            }
            if (C78685UuP.LJJJZ(str) && (c70690Rok = C70691Rol.LJIJ) != null && (num = c70690Rok.LIZLLL) != null) {
                if (num.intValue() == 2) {
                    obj3 = "rate";
                } else if (num.intValue() == 1) {
                    obj3 = "keyword";
                } else if (num.intValue() == 3) {
                    obj3 = "impression_tag";
                }
                logNode.plusAssign("page_info", obj3);
                logNode.plusAssign("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
            }
            obj3 = "all";
            logNode.plusAssign("page_info", obj3);
            logNode.plusAssign("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
        } else {
            logNode.plusAssign("page_name", "product_review");
            C70690Rok c70690Rok4 = C70691Rol.LJIJ;
            if (c70690Rok4 != null) {
                obj4 = c70690Rok4.LJ;
            }
            logNode.plusAssign("review_cnt", obj4);
            ((C70691Rol) aqS65S1100000_12.l1).getClass();
            C70691Rol.LIZJ(logNode);
            logNode.plusAssign("page_info", C70666RoM.LIZ());
            logNode.plusAssign("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
        }
        logNode.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((C70691Rol) aqS65S1100000_12.l1).LJI));
        logNode.put("quit_type", aqS65S1100000_12.s0);
        logNode.put("is_load_data", Integer.valueOf(((C70691Rol) aqS65S1100000_12.l1).LJIIIZ ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        C72457Sc9 setState = (C72457Sc9) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C72457Sc9.LIZ(setState, 0, null, null, null, null, aqS65S1100000_12.s0, (List) aqS65S1100000_12.l1, null, null, 415);
    }

    public static final Object invoke$19(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        String voucherID;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("module_name", "platform_discounts");
        Voucher voucher = ((C69643RUx) aqS65S1100000_12.l1).LJ;
        int i = 0;
        if (voucher != null && (voucherID = voucher.getVoucherID()) != null && C78857UxB.LJJJIL(voucherID)) {
            i = 1;
        }
        logNode.plusAssign("is_coupon_available", Integer.valueOf(i ^ 1));
        logNode.plusAssign("click_area", aqS65S1100000_12.s0);
        C87277YNd.LJJJJJL(logNode, ((C69643RUx) aqS65S1100000_12.l1).LIZLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS65S1100000_12 aqS65S1100000_12, Object it) {
        o.LJIIIZ(it, "it");
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = ((QnaSuggestedTabFragment) aqS65S1100000_12.l1).LJLJJLL;
        if (qnaSuggestedTabViewModel != null) {
            qnaSuggestedTabViewModel.RO(aqS65S1100000_12.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS65S1100000_12.l1).LIZIZ);
        logNode.plusAssign("glide_type", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        List list;
        List<PaymentMethod> list2;
        C71765SEn it = (C71765SEn) obj;
        o.LJIIIZ(it, "it");
        if (aqS65S1100000_12.s0.length() == 0) {
            PaymentMethod paymentMethod = it.LJLILLLLZI;
            if (paymentMethod != null) {
                list2 = paymentMethod.subPaymentMethods;
            } else {
                list2 = null;
            }
            ((SubPaymentListViewModel) aqS65S1100000_12.l1).setState(new AqS178S0100000_12(list2, (List<Tab>) 721));
        } else {
            List<PaymentMethod> list3 = it.LJLJI;
            if (list3 != null) {
                String str = aqS65S1100000_12.s0;
                ArrayList arrayList = new ArrayList();
                for (PaymentMethod paymentMethod2 : list3) {
                    String str2 = paymentMethod2.displayName;
                    if (str2 != null && s.LJJJLZIJ(str2, str, true)) {
                        arrayList.add(paymentMethod2);
                    }
                }
                list = ORZ.LLJILJILJ(arrayList);
            } else {
                list = C61878OQg.INSTANCE;
            }
            ((SubPaymentListViewModel) aqS65S1100000_12.l1).setState(new AqS178S0100000_12(list, (List<Tab>) 722));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("log_id", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchlogId());
        sendLog.LIZLLL("search_entrance", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchEntrance());
        sendLog.LIZLLL("search_position", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchPosition());
        sendLog.LIZLLL("button_type", aqS65S1100000_12.s0);
        sendLog.LIZLLL("action_type", "long_press_feedback");
        sendLog.LIZLLL("text_type", "recom_search_feedback");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("log_id", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchlogId());
        sendLog.LIZLLL("search_entrance", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchEntrance());
        sendLog.LIZLLL("search_position", ((InterfaceC72840SiK) aqS65S1100000_12.l1).getSearchPosition());
        sendLog.LIZLLL("action_type", "long_press_feedback");
        sendLog.LIZLLL("impr_id", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        C72879Six setSearchStatus = (C72879Six) obj;
        o.LJIIIZ(setSearchStatus, "$this$setSearchStatus");
        boolean z = true;
        if (((FollowingRelationFragment) aqS65S1100000_12.l1).isAdded() && aqS65S1100000_12.s0.length() == 0 && setSearchStatus.LJLJI) {
            AYA.LIZ(((FollowingRelationFragment) aqS65S1100000_12.l1).mo49getActivity(), ((FollowingRelationFragment) aqS65S1100000_12.l1)._$_findCachedViewById(R.id.czx));
        }
        String str = aqS65S1100000_12.s0;
        if (str.length() <= 0) {
            z = false;
        }
        return C72879Six.L(setSearchStatus, str, false, z, 2);
    }

    public static final Object invoke$6(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        HashMap<String, Object> LJII = C27739Aud.LJII(((Announcement) aqS65S1100000_12.l1).getDaInfo());
        if (LJII != null) {
            logNode.putAll(LJII);
        }
        logNode.plusAssign("button_type", aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, new C70042ReI(aqS65S1100000_12.s0, (Integer) aqS65S1100000_12.l1), null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, 2147483643, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x03d8, code lost:
    
        if (X.C28098B1a.LIZIZ(r5) != false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b8  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AqS65S1100000_12 r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS65S1100000_12.invoke$8(kotlin.jvm.internal.AqS65S1100000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AqS65S1100000_12 aqS65S1100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withNotCheckParams((Map) ((C0R1) aqS65S1100000_12.l1).LJLIL);
        C87277YNd.LJJJJJL(logNode, aqS65S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS65S1100000_12(com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1 r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 13: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS65S1100000_12.<init>(com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(C0R1 c0r1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0r1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(C69643RUx c69643RUx, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c69643RUx;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(C70414RkI c70414RkI, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(C70691Rol c70691Rol, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70691Rol;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(InterfaceC72840SiK interfaceC72840SiK, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC72840SiK;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(CCDCAddCardViewModel cCDCAddCardViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = cCDCAddCardViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(Announcement announcement, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = announcement;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(ReviewFragment reviewFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = reviewFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(ReviewItemStruct reviewItemStruct, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = reviewItemStruct;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(FollowingRelationFragment followingRelationFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = followingRelationFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(ProfileAigcProgressAssem profileAigcProgressAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = profileAigcProgressAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(QnaSuggestedTabFragment qnaSuggestedTabFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = qnaSuggestedTabFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(String str, SubPaymentListViewModel subPaymentListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = subPaymentListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S1100000_12(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS65S1100000_12(String str, String str2, List<IMUser> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }
}
