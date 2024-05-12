package kotlin.jvm.internal;

import X.A06;
import X.ALY;
import X.AML;
import X.ARH;
import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1J;
import X.B1K;
import X.C188727au;
import X.C1A7;
import X.C234109Gs;
import X.C234999Kd;
import X.C237929Vk;
import X.C237949Vm;
import X.C238099Wb;
import X.C238209Wm;
import X.C246349le;
import X.C247739nt;
import X.C248629pK;
import X.C249599qt;
import X.C249649qy;
import X.C252709vu;
import X.C25859ACx;
import X.C26045AKb;
import X.C26227ARb;
import X.C26335AVf;
import X.C26716Ae8;
import X.C26804AfY;
import X.C26936Ahg;
import X.C26965Ai9;
import X.C27448Apw;
import X.C27516Ar2;
import X.C27797AvZ;
import X.C27943Axv;
import X.C28128B2e;
import X.C2NU;
import X.C34K;
import X.C55096Ljo;
import X.C61836OOq;
import X.C65352Pkq;
import X.C70414RkI;
import X.C72912tb;
import X.C72972SkS;
import X.C76542zS;
import X.C76800UCe;
import X.C77339UWx;
import X.C78565UsT;
import X.C78685UuP;
import X.C78857UxB;
import X.C85990Xow;
import X.C8V3;
import X.C8VC;
import X.C9LM;
import X.C9LO;
import X.C9MF;
import X.EnumC248719pT;
import X.EnumC27805Avh;
import X.FKM;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC238119Wd;
import X.InterfaceC249619qv;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KNV;
import X.M78;
import X.OUP;
import X.Q8U;
import X.RBX;
import X.UC0;
import X.UPJ;
import X.X1D;
import Y.ACListenerS26S1200000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.Balance;
import com.bytedance.touchpoint.core.model.TaskDoneData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.PoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.INotifyAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowingComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AqS47S1200000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
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
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x008f, code lost:
    
        if (r6 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$0(X.C9LO r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.invoke$0(X.9LO):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$1(X.C9LO r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.invoke$1(X.9LO):void");
    }

    public final void invoke$2(C9LO it) {
        User user;
        boolean z;
        boolean z2;
        String str;
        Integer followToastType;
        UserProfileInfo userProfileInfo;
        Integer followingVisibility;
        ProfileCommonInfo commonInfo;
        UserRelationInfo userRelationInfo;
        Boolean isBlocked;
        UserRelationInfo userRelationInfo2;
        Boolean isBlocking;
        o.LJIIIZ(it, "it");
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ((RelationFollowingComponent) this.l1, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        User user2 = null;
        r3 = null;
        String str2 = null;
        String str3 = null;
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        ProfilePlatformViewModel profilePlatformVM = ((RelationFollowingComponent) this.l1).getProfilePlatformVM();
        if (profilePlatformVM != null) {
            z = profilePlatformVM.LJLJJL;
        } else {
            z = false;
        }
        ProfileCommonInfo commonInfo2 = ((RelationFollowingComponent) this.l1).getCommonInfo();
        if (commonInfo2 != null && (userRelationInfo2 = commonInfo2.getUserRelationInfo()) != null && (isBlocking = userRelationInfo2.isBlocking()) != null) {
            z2 = isBlocking.booleanValue();
        } else {
            z2 = false;
        }
        if (z2 || (((commonInfo = ((RelationFollowingComponent) this.l1).getCommonInfo()) != null && (userRelationInfo = commonInfo.getUserRelationInfo()) != null && (isBlocked = userRelationInfo.isBlocked()) != null && isBlocked.booleanValue()) || !((RelationFollowingComponent) this.l1).x3(z) || it.LJLILLLLZI <= 0)) {
            T t = ((RelationFollowingComponent) this.l1).LJLILLLLZI;
            if (t == 0 || (followingVisibility = t.getFollowingVisibility()) == null || followingVisibility.intValue() != 2) {
                T t2 = ((RelationFollowingComponent) this.l1).LJLILLLLZI;
                if (t2 == 0 || (followToastType = t2.getFollowToastType()) == null || followToastType.intValue() != 1) {
                    MobClick obtain = MobClick.obtain();
                    obtain.setEventName("click_follow_count");
                    obtain.setLabelName(this.s0);
                    FMX.onEvent(obtain);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", this.s0);
                    FMX.LJIIL("click_follow_count", c188727au.LIZ);
                    String str4 = this.s0;
                    if (user == null || (str = user.getUid()) == null) {
                        str = "";
                    }
                    C26335AVf.LJII(str4, "click_follow_count", str, null);
                    if (user != null) {
                        user2 = user.m150clone();
                    }
                    ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.l2;
                    if (activityC45651qj != null) {
                        final RelationFollowingComponent relationFollowingComponent = (RelationFollowingComponent) this.l1;
                        A06.LIZIZ(activityC45651qj, user2, "following_relation", new OnActivityResultCallback() { // from class: X.9LL
                            @Override // com.bytedance.router.OnActivityResultCallback
                            public final void onActivityResult(int i, int i2, Intent intent) {
                                boolean z3;
                                boolean z4;
                                boolean z5 = true;
                                if (i == 3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i2 == -1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3 & z4) {
                                    RelationFollowingComponent relationFollowingComponent2 = RelationFollowingComponent.this;
                                    if (intent == null || !intent.getBooleanExtra("following_page_extra_key", false)) {
                                        z5 = false;
                                    }
                                    relationFollowingComponent2.LJLJJL = z5;
                                    INotifyAbility iNotifyAbility = (INotifyAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(RelationFollowingComponent.this), INotifyAbility.class, null);
                                    if (iNotifyAbility != null) {
                                        iNotifyAbility.Si(RelationFollowingComponent.this.LJLJJL);
                                    }
                                }
                            }
                        }, 16);
                        return;
                    }
                    return;
                }
                Context context = ((RelationFollowingComponent) this.l1).getContext();
                if (context != null) {
                    RelationFollowingComponent relationFollowingComponent2 = (RelationFollowingComponent) this.l1;
                    String string = context.getString(R.string.a7p);
                    o.LJIIIIZZ(string, "it1.getString(R.string.abnormal_hidden_desc)");
                    Object[] objArr = new Object[1];
                    ProfileCommonInfo commonInfo3 = relationFollowingComponent2.getCommonInfo();
                    if (commonInfo3 != null && (userProfileInfo = commonInfo3.getUserProfileInfo()) != null) {
                        str2 = userProfileInfo.getUsername();
                    }
                    objArr[0] = str2;
                    str3 = Q8U.LIZIZ(objArr, 1, string, "format(format, *args)");
                }
                ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) this.l2;
                if (activityC45651qj2 != null) {
                    C26227ARb c26227ARb = new C26227ARb(activityC45651qj2);
                    c26227ARb.LJ(R.string.a7q);
                    c26227ARb.LIZIZ(str3);
                    UC0.LIZJ(c26227ARb, C9LM.LJLIL);
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                return;
            }
            ActivityC45651qj activityC45651qj3 = (ActivityC45651qj) this.l2;
            if (activityC45651qj3 != null) {
                C26045AKb c26045AKb = new C26045AKb(activityC45651qj3);
                c26045AKb.LJIIIIZZ(R.string.peu);
                c26045AKb.LIZLLL(2000L);
                c26045AKb.LJIIJ();
            }
        }
    }

    public static final Object invoke$0(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        String str;
        List LIZLLL;
        String str2;
        PaymentState it = (PaymentState) obj;
        o.LJIIIZ(it, "it");
        PaymentMethod paymentMethod = ((PaymentInfo) aqS47S1200000_4.l1).paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.LJFF();
        } else {
            str = null;
        }
        Map map = (Map) ((LinkedHashMap) ((PaymentViewModel) aqS47S1200000_4.l2).LJLLJ).get(aqS47S1200000_4.s0);
        if (map != null) {
            map.clear();
        }
        List<Object> paymentList = it.getPaymentList();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : paymentList) {
            if (!(obj2 instanceof B1J) || !((B1J) obj2).LIZ.LIZIZ) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        PaymentInfo paymentInfo = (PaymentInfo) aqS47S1200000_4.l1;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            arrayList2.add(next);
            if (next instanceof C28128B2e) {
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                if (paymentMethod2 != null) {
                    arrayList2.add(new B1J(paymentMethod2, false, 0));
                }
                if (((C28128B2e) next).LIZ) {
                    LIZLLL = PaymentCacheHelper.LJ();
                } else {
                    LIZLLL = PaymentCacheHelper.LIZLLL();
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : LIZLLL) {
                    PaymentMethod paymentMethod3 = ((PaymentInfo) obj3).paymentMethod;
                    if (paymentMethod3 != null) {
                        str2 = paymentMethod3.LJFF();
                    } else {
                        str2 = null;
                    }
                    if (!o.LJ(str2, str)) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    PaymentMethod paymentMethod4 = ((PaymentInfo) it3.next()).paymentMethod;
                    if (paymentMethod4 != null) {
                        arrayList2.add(new B1J(paymentMethod4, false, 0));
                    }
                }
            }
        }
        PaymentViewModel paymentViewModel = (PaymentViewModel) aqS47S1200000_4.l2;
        PaymentInfo paymentInfo2 = (PaymentInfo) aqS47S1200000_4.l1;
        paymentViewModel.Iv0(paymentInfo2, paymentInfo2.paymentMethod);
        ((PaymentViewModel) aqS47S1200000_4.l2).setState(new AqS170S0100000_4(arrayList2, (List<? extends Object>) 20));
        PaymentViewModel paymentViewModel2 = (PaymentViewModel) aqS47S1200000_4.l2;
        PaymentMethod paymentMethod5 = ((PaymentInfo) aqS47S1200000_4.l1).paymentMethod;
        paymentViewModel2.getClass();
        paymentViewModel2.setState(new AqS135S0200000_4(paymentViewModel2, paymentMethod5, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, new ACListenerS26S1200000_4((CreatorToolsActivity) aqS47S1200000_4.l1, (ShowCaseModel) aqS47S1200000_4.l2, aqS47S1200000_4.s0, 0), true, null, null, false, false, null, false, false, false, false, 8388587);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        aqS47S1200000_4.invoke$0((C9LO) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        aqS47S1200000_4.invoke$1((C9LO) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        aqS47S1200000_4.invoke$2((C9LO) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.putAll(((C27448Apw) ((PdpPromotionEntranceInfoViewHolder) aqS47S1200000_4.l1).getItem()).LIZLLL);
        logView.put("previous_page", "product_detail");
        logView.put("click_area", ((View) aqS47S1200000_4.l2).getTag());
        logView.put("module_name", aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C188727au LJ = C77339UWx.LJ((ARN) obj, "it");
        LJ.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
        LJ.LJIIIZ("country_code", C85990Xow.LIZ());
        LJ.LJIIIZ("previous_page", ((StateControlMediaAssem) aqS47S1200000_4.l1).getEnterFrom());
        FMX.LJIIL("scm_learn_more_click", LJ.LIZ);
        Context context = (Context) aqS47S1200000_4.l2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aqS47S1200000_4.s0);
        LIZ.append("&enter_from=");
        LIZ.append(((StateControlMediaAssem) aqS47S1200000_4.l1).getEnterFrom());
        LIZ.append("&object_id=");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ.append("&country_code=");
        LIZ.append(C85990Xow.LIZ());
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.withParam("hide_status_bar", true);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String string = ((Context) aqS47S1200000_4.l1).getString(R.string.qad);
        o.LJIIIIZZ(string, "context.getString(R.stri…_modal_button_learn_more)");
        buttonGroup.LJFF(string, new AqS47S1200000_4((Context) aqS47S1200000_4.l1, (StateControlMediaAssem) aqS47S1200000_4.l2, aqS47S1200000_4.s0, 14));
        String string2 = ((Context) aqS47S1200000_4.l1).getString(R.string.qac);
        o.LJIIIIZZ(string2, "context.getString(R.stri…eal_modal_button_dismiss)");
        buttonGroup.LJII(string2, C9MF.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        int i;
        String str;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("module_name", "logistics");
        logWhenShow.plusAssign("delivery_info", aqS47S1200000_4.s0);
        logWhenShow.plusAssign("sub_page_name", "traditional_order_submit");
        List<LogisticDTO> list = ((C26965Ai9) ((USMainOrderInfoVH) aqS47S1200000_4.l1).getItem()).LIZLLL;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (i > 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logWhenShow.plusAssign("is_clickable", str);
        LogisticDTO logisticDTO = (LogisticDTO) aqS47S1200000_4.l2;
        if (logisticDTO != null) {
            str2 = logisticDTO.LIZ();
        }
        logWhenShow.plusAssign("is_next_day_delivery", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS47S1200000_4 aqS47S1200000_4, Object it) {
        o.LJIIIZ(it, "it");
        if (!((C34K) aqS47S1200000_4.l1).element && C238099Wb.LIZIZ(aqS47S1200000_4.s0)) {
            Keva LIZ = C238099Wb.LIZ();
            StringBuilder LJFF = C72972SkS.LJFF("username_to_nickname_pop_up_shown_count", '_');
            LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
            int i = LIZ.getInt(X1D.LIZIZ(LJFF), 0);
            Keva LIZ2 = C238099Wb.LIZ();
            StringBuilder LJFF2 = C72972SkS.LJFF("username_to_nickname_pop_up_shown_count", '_');
            LIZ2.storeInt(UPJ.LJ((RBX) HG3.LJIILL(), LJFF2, LJFF2), i + 1);
        }
        ((InterfaceC238119Wd) aqS47S1200000_4.l2).LIZIZ(aqS47S1200000_4.s0, ((C34K) aqS47S1200000_4.l1).element);
        C238209Wm.LIZIZ(true, ((C34K) aqS47S1200000_4.l1).element);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        C34K c34k = (C34K) aqS47S1200000_4.l1;
        actionGroup.LJI(R.string.pcs, new AqS47S1200000_4((InterfaceC238119Wd) aqS47S1200000_4.l2, aqS47S1200000_4.s0, c34k, 17));
        actionGroup.LJIIIIZZ(R.string.pct, new AqS135S0200000_4((InterfaceC238119Wd) aqS47S1200000_4.l2, (C34K) aqS47S1200000_4.l1, 168));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS47S1200000_4 aqS47S1200000_4, Object it) {
        o.LJIIIZ(it, "it");
        if (!((C34K) aqS47S1200000_4.l1).element) {
            Keva LIZ = C238099Wb.LIZ();
            StringBuilder LJFF = C72972SkS.LJFF("nickname_to_username_pop_up_shown_count", '_');
            LJFF.append(((RBX) HG3.LJIILL()).getCurUserId());
            int i = LIZ.getInt(X1D.LIZIZ(LJFF), 0);
            Keva LIZ2 = C238099Wb.LIZ();
            StringBuilder LJFF2 = C72972SkS.LJFF("nickname_to_username_pop_up_shown_count", '_');
            LIZ2.storeInt(UPJ.LJ((RBX) HG3.LJIILL(), LJFF2, LJFF2), i + 1);
        }
        ((InterfaceC238119Wd) aqS47S1200000_4.l2).LIZIZ(aqS47S1200000_4.s0, ((C34K) aqS47S1200000_4.l1).element);
        C238209Wm.LIZ(true, ((C34K) aqS47S1200000_4.l1).element);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        AddressEditState state = (AddressEditState) obj;
        o.LJIIIZ(state, "state");
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) aqS47S1200000_4.l1;
        String str = aqS47S1200000_4.s0;
        addressEditViewModel.getClass();
        addressEditViewModel.Qv0(str, addressEditViewModel.Nv0(state.getInputItemVOList(), true), (InterfaceC88472Yns) aqS47S1200000_4.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.pcs, new AqS47S1200000_4((InterfaceC238119Wd) aqS47S1200000_4.l2, aqS47S1200000_4.s0, (C34K) aqS47S1200000_4.l1, 19));
        actionGroup.LJIIIIZZ(R.string.pct, new AqS135S0200000_4((InterfaceC238119Wd) aqS47S1200000_4.l2, (C34K) aqS47S1200000_4.l1, 169));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", ((VideoTagFriendsListViewModel) aqS47S1200000_4.l1).gv0().getEnterFrom());
        sendEventTrackingAsync.put("to_user_id", ((IMUser) aqS47S1200000_4.l2).getUid());
        sendEventTrackingAsync.put("click_type", aqS47S1200000_4.s0);
        sendEventTrackingAsync.put("user_type", ((VideoTagFriendsListViewModel) aqS47S1200000_4.l1).jv0((IMUser) aqS47S1200000_4.l2));
        sendEventTrackingAsync.put("search_keyword", "");
        sendEventTrackingAsync.put("function", "tag");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AqS47S1200000_4 aqS47S1200000_4, Object it) {
        String str;
        String productTotal;
        o.LJIIIZ(it, "it");
        if (((OrderSubmitViewModel) ((GlobalShopInfoVH) aqS47S1200000_4.l1).LJLJI.getValue()).LJLJJLL != 0) {
            ShopBill shopBill = ((C26804AfY) ((GlobalShopInfoVH) aqS47S1200000_4.l1).getItem()).LJ;
            if (shopBill != null) {
                str = shopBill.getProductTotal();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                View findViewById = ((GlobalShopInfoVH) aqS47S1200000_4.l1).LJLIL.findViewById(R.id.jxx);
                o.LJIIIIZZ(findViewById, "view.shop_bill_summary");
                OUP.LJJLIIIJ(findViewById);
                TextView textView = (TextView) ((GlobalShopInfoVH) aqS47S1200000_4.l1).LJLIL.findViewById(R.id.ktx);
                String str2 = aqS47S1200000_4.s0;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(str2);
                TextView textView2 = (TextView) ((GlobalShopInfoVH) aqS47S1200000_4.l1).LJLIL.findViewById(R.id.ktv);
                ShopBill shopBill2 = (ShopBill) aqS47S1200000_4.l2;
                if (shopBill2 != null && (productTotal = shopBill2.getProductTotal()) != null) {
                    str3 = productTotal;
                }
                textView2.setText(str3);
                return C76800UCe.LIZ;
            }
        }
        View findViewById2 = ((GlobalShopInfoVH) aqS47S1200000_4.l1).LJLIL.findViewById(R.id.jxx);
        o.LJIIIIZZ(findViewById2, "view.shop_bill_summary");
        OUP.LJIJJLI(findViewById2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        HashMap sellerVouchers = (HashMap) obj;
        o.LJIIIZ(sellerVouchers, "sellerVouchers");
        if (C1A7.LJJIFFI((List) aqS47S1200000_4.l1, (List) sellerVouchers.get(aqS47S1200000_4.s0))) {
            ((OrderSubmitViewModel) aqS47S1200000_4.l2).setState(C27797AvZ.LJLIL);
            sellerVouchers.put(aqS47S1200000_4.s0, (List) aqS47S1200000_4.l1);
            OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS47S1200000_4.l2;
            orderSubmitViewModel.LLILZ = true;
            OrderSubmitViewModel.Lw0(orderSubmitViewModel, false, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.SELECT_VOUCHER.getValue()), 4095);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS47S1200000_4 aqS47S1200000_4, Object report) {
        o.LJIIIZ(report, "report");
        ((C249599qt) aqS47S1200000_4.l1).LJJIIZI((ActivityTask) aqS47S1200000_4.l2);
        ((C249599qt) aqS47S1200000_4.l1).LJJIIJZLJL(aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        Balance balance;
        Float f;
        int floatValue;
        InterfaceC249619qv interfaceC249619qv;
        C249649qy report = (C249649qy) obj;
        o.LJIIIZ(report, "report");
        C249599qt c249599qt = (C249599qt) aqS47S1200000_4.l1;
        ActivityTask activityTask = (ActivityTask) aqS47S1200000_4.l2;
        c249599qt.getClass();
        Integer num = activityTask.awardCount;
        if (num != null && num.intValue() > 0) {
            InterfaceC249619qv interfaceC249619qv2 = c249599qt.LJLLLLLL;
            if (interfaceC249619qv2 != null) {
                interfaceC249619qv2.LJIILLIIL(12, activityTask.taskKey, c249599qt.LJJIIZ(activityTask), "", null);
            }
        } else {
            TaskDoneData taskDoneData = report.LJLJI;
            if (taskDoneData != null && (balance = taskDoneData.balance) != null && (f = balance.displayCashAmount) != null && (floatValue = (int) (f.floatValue() / 100)) > 0 && (interfaceC249619qv = c249599qt.LJLLLLLL) != null) {
                C247739nt.LIZ(interfaceC249619qv, 12, activityTask.taskKey, String.valueOf(floatValue), 24);
            }
        }
        ((C249599qt) aqS47S1200000_4.l1).LJJIIJZLJL(aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        AddressEditDetailState state = (AddressEditDetailState) obj;
        o.LJIIIZ(state, "state");
        AddressEditDetailViewModel addressEditDetailViewModel = (AddressEditDetailViewModel) aqS47S1200000_4.l1;
        String str = aqS47S1200000_4.s0;
        Address Iv0 = addressEditDetailViewModel.Iv0(state.getInputItemVOList());
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS47S1200000_4.l2;
        FKM.LIZ();
        try {
            if (C2NU.LIZ.LIZIZ() && str != null && str.length() != 0 && Iv0 != null) {
                C78565UsT.LJJIJIL(addressEditDetailViewModel, new C26716Ae8(addressEditDetailViewModel, str, Iv0, interfaceC88472Yns, null));
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS47S1200000_4 aqS47S1200000_4, Object it) {
        o.LJIIIZ(it, "it");
        SmartRoute buildRoute = SmartRouter.buildRoute((Activity) aqS47S1200000_4.l1, "aweme://push_setting_notification_choice");
        buildRoute.withParam("enter_from", aqS47S1200000_4.s0);
        buildRoute.open();
        ALY aly = (ALY) aqS47S1200000_4.l2;
        if (aly != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", aly.LIZJ);
            c188727au.LJIIIZ("enter_method", aly.LIZLLL);
            c188727au.LJIIIZ("room_id", aly.LIZ);
            c188727au.LJIIIZ("anchor_id", aly.LIZIZ);
            FMX.LJIIL("livesdk_push_pre_permission_auth", c188727au.LIZ);
        } else {
            String str = aqS47S1200000_4.s0;
            C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", str);
            LIZLLL.LJIIIZ("enter_method", "notification_bell");
            LIZLLL.LJIIIZ("enter_reason", "leave");
            FMX.LJIIL("push_pre_permission_auth", LIZLLL.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.gs8, new AqS47S1200000_4((Activity) aqS47S1200000_4.l1, aqS47S1200000_4.s0, (ALY) aqS47S1200000_4.l2, 27));
        actionGroup.LJIIIIZZ(R.string.ivd, new AqS58S1100000_4((ALY) aqS47S1200000_4.l2, aqS47S1200000_4.s0, 48));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        M78 wrapper = (M78) obj;
        o.LJIIIZ(wrapper, "wrapper");
        C246349le.LIZJ = wrapper;
        SmartRouter.buildRoute((Activity) aqS47S1200000_4.l1, aqS47S1200000_4.s0).open();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS47S1200000_4.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        String str;
        String str2;
        String str3;
        BindInfo bindInfo;
        String str4 = (String) obj;
        if (str4 != null && C78857UxB.LJJJIL(str4)) {
            Context context = ((PaymentMethodView) aqS47S1200000_4.l1).getContext();
            o.LJIIIIZZ(context, "context");
            PaymentMethod paymentMethod = ((PaymentMethodView) aqS47S1200000_4.l1).getPaymentMethod();
            String str5 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LIZLLL;
            } else {
                str = null;
            }
            C61836OOq.LIZ(context, str, aqS47S1200000_4.s0, str4, (CommuteType) aqS47S1200000_4.l2, ((PaymentMethodView) aqS47S1200000_4.l1).getPaySource());
            B1K paymentLogger = ((PaymentMethodView) aqS47S1200000_4.l1).getPaymentLogger();
            if (paymentLogger != null) {
                PaymentMethod paymentMethod2 = ((PaymentMethodView) aqS47S1200000_4.l1).getPaymentMethod();
                if (paymentMethod2 != null) {
                    str2 = paymentMethod2.LJIIL();
                } else {
                    str2 = null;
                }
                PaymentMethod paymentMethod3 = ((PaymentMethodView) aqS47S1200000_4.l1).getPaymentMethod();
                if (paymentMethod3 != null) {
                    str3 = paymentMethod3.extraInfo;
                } else {
                    str3 = null;
                }
                Boolean valueOf = Boolean.valueOf(C78857UxB.LJJJIL(str3));
                PaymentMethod paymentMethod4 = ((PaymentMethodView) aqS47S1200000_4.l1).getPaymentMethod();
                if (paymentMethod4 != null && (bindInfo = paymentMethod4.bindInfo) != null) {
                    str5 = bindInfo.bindStatus;
                }
                C76542zS.LIZIZ("tiktokec_button_click", paymentLogger.LIZ, new AqS10S2200000_4(str2, str5, Boolean.FALSE, valueOf, 0));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZLLL(((C234109Gs) aqS47S1200000_4.l1).LIZIZ);
        uiContentAssem.LIZIZ = aqS47S1200000_4.s0;
        C252709vu c252709vu = ((ProfileNavBarRootComponent) aqS47S1200000_4.l2).LJLJLJ;
        if (c252709vu != null) {
            uiContentAssem.LJII = c252709vu;
            return C76800UCe.LIZ;
        }
        o.LJIJI("navBar");
        throw null;
    }

    public static final Object invoke$31(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        String str;
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage;
        Address address;
        String str2;
        DeliveryPanelState it = (DeliveryPanelState) obj;
        o.LJIIIZ(it, "it");
        ReachableAddress LIZ = it.getSelectedShipToInfo().LIZ();
        if (LIZ != null) {
            LaneParams laneParams = (LaneParams) aqS47S1200000_4.l2;
            if (o.LJ(LIZ.reachable, Boolean.TRUE) && (address = LIZ.address) != null && (str2 = address.id) != null) {
                laneParams.plusAssign("current_select_address_id", str2);
            }
        }
        Context context = ((C26936Ahg) aqS47S1200000_4.l1).LJLIL.getContext();
        String str3 = aqS47S1200000_4.s0;
        String LJIIIIZZ = ((C26936Ahg) aqS47S1200000_4.l1).LJIIIIZZ();
        DeliveryPanelViewModel deliveryPanelViewModel = ((C26936Ahg) aqS47S1200000_4.l1).LJLILLLLZI;
        Parcelable parcelable = deliveryPanelViewModel.LJLJJLL;
        if (parcelable != null && deliveryPanelViewModel.LJLLLL == 1 && (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable) != null) {
            str = enterParamForProductDetailPage.productId;
        } else {
            str = null;
        }
        AddressPageStarter.LIZJ(context, str3, LJIIIIZZ, null, str, null, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        LaneParams injectParamsToNode = (LaneParams) obj;
        o.LJIIIZ(injectParamsToNode, "$this$injectParamsToNode");
        AML aml = (AML) aqS47S1200000_4.l1;
        C26936Ahg c26936Ahg = (C26936Ahg) aqS47S1200000_4.l2;
        aml.withState(c26936Ahg.LJLILLLLZI, new AqS47S1200000_4(c26936Ahg, aqS47S1200000_4.s0, injectParamsToNode, 31));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        View view;
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZLLL(((C234109Gs) aqS47S1200000_4.l1).LIZIZ);
        uiContentAssem.LIZIZ = aqS47S1200000_4.s0;
        Fragment LJIIIZ = C55096Ljo.LJIIIZ((ProfileNavBarBaseComponent) aqS47S1200000_4.l2);
        if (LJIIIZ == null || (view = LJIIIZ.getView()) == null) {
            view = new View(((ProfileNavBarBaseComponent) aqS47S1200000_4.l2).getContext());
        }
        uiContentAssem.LJII = view;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        logNode.plusAssign("button_name", aqS47S1200000_4.s0);
        HashMap hashMap = (HashMap) aqS47S1200000_4.l2;
        if (hashMap != null) {
            logNode.compareTo(logNode, hashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        sendLogReturnParams.LIZJ("button_name", aqS47S1200000_4.s0);
        HashMap hashMap = (HashMap) aqS47S1200000_4.l2;
        if (hashMap != null) {
            C27943Axv.LIZ(sendLogReturnParams, hashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        logNode.plusAssign("button_name", aqS47S1200000_4.s0);
        HashMap hashMap = (HashMap) aqS47S1200000_4.l2;
        if (hashMap != null) {
            logNode.withParamsGroup(hashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        sendLogReturnParams.LIZJ("button_name", aqS47S1200000_4.s0);
        HashMap hashMap = (HashMap) aqS47S1200000_4.l2;
        if (hashMap != null) {
            C27943Axv.LIZ(sendLogReturnParams, hashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        logNode.plusAssign("click_area", aqS47S1200000_4.s0);
        C70414RkI c70414RkI = (C70414RkI) aqS47S1200000_4.l1;
        PromotionEntrance promotionEntrance = ((C27516Ar2) aqS47S1200000_4.l2).LJLIL;
        c70414RkI.getClass();
        C70414RkI.LJIIIZ(logNode, promotionEntrance);
        C70414RkI c70414RkI2 = (C70414RkI) aqS47S1200000_4.l1;
        PromotionEntrance promotionEntrance2 = ((C27516Ar2) aqS47S1200000_4.l2).LJLIL;
        c70414RkI2.getClass();
        logNode.compareTo(logNode, C70414RkI.LJIJ(promotionEntrance2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        sendLogReturnParams.LIZJ("click_area", aqS47S1200000_4.s0);
        ((C70414RkI) aqS47S1200000_4.l1).LJIIJ(sendLogReturnParams, ((C27516Ar2) aqS47S1200000_4.l2).LJLIL);
        C70414RkI c70414RkI = (C70414RkI) aqS47S1200000_4.l1;
        PromotionEntrance promotionEntrance = ((C27516Ar2) aqS47S1200000_4.l2).LJLIL;
        c70414RkI.getClass();
        C27943Axv.LIZ(sendLogReturnParams, C70414RkI.LJIJ(promotionEntrance));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, (Map) aqS47S1200000_4.l1);
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        ((UserRightFragment) aqS47S1200000_4.l2).addUserRightParams(sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        ((PoliciesFragment) aqS47S1200000_4.l2).getClass();
        sendLog.LIZJ("page_name", "retailer_policies");
        sendLog.LIZJ("previous_page", "product_detail");
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        ((PoliciesFragment) aqS47S1200000_4.l2).getClass();
        sendLog.LIZJ("page_name", "retailer_policies");
        sendLog.LIZJ("previous_page", "product_detail");
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("is_load_data", 1);
        logNode.plusAssign("quit_type", aqS47S1200000_4.s0);
        logNode.plusAssign("stay_time", Long.valueOf(((SizeGuideFragment) aqS47S1200000_4.l1).getStayDuration()));
        logNode.compareTo(logNode, (LaneParams) aqS47S1200000_4.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        View view;
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZLLL(((C234109Gs) aqS47S1200000_4.l1).LIZIZ);
        uiContentAssem.LIZIZ = aqS47S1200000_4.s0;
        Fragment LJIIIZ = C55096Ljo.LJIIIZ((HeaderBaseContainerComponent) aqS47S1200000_4.l2);
        if (LJIIIZ == null || (view = LJIIIZ.getView()) == null) {
            view = new View(((HeaderBaseContainerComponent) aqS47S1200000_4.l2).getContext());
        }
        uiContentAssem.LJII = view;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        sendLog.LIZJ("previous_page", "product_detail");
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        ((UserRightFragment) aqS47S1200000_4.l2).addUserRightParams(sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, (Map) aqS47S1200000_4.l1);
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        ((UserRightFragment) aqS47S1200000_4.l2).addUserRightParams(sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, ((C70414RkI) aqS47S1200000_4.l1).LIZIZ);
        sendLog.LIZJ("previous_page", "product_detail");
        sendLog.LIZJ("page_name", ((UserRightFragment) aqS47S1200000_4.l2).getPageName());
        sendLog.LIZJ("button_name", aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        ((UserRightFragment) aqS47S1200000_4.l1).addUserRightParams(sendLog);
        C27943Axv.LIZ(sendLog, (Map) aqS47S1200000_4.l2);
        sendLog.LIZJ("stay_time", Long.valueOf(((UserRightFragment) aqS47S1200000_4.l1).getStayDuration()));
        sendLog.LIZJ("quit_type", aqS47S1200000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS47S1200000_4 aqS47S1200000_4, Object obj) {
        C248629pK setState = (C248629pK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248629pK.LIZ(setState, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, new C72912tb(aqS47S1200000_4.s0), null, (EnumC248719pT) aqS47S1200000_4.l2, ((CreatorCollectionDetailResponse) aqS47S1200000_4.l1).routerSchema, null, 1245183);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S1200000_4(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment r3, java.lang.String r4, java.util.Map r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 4: goto L11;
                case 5: goto L5;
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment, java.lang.String, java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S1200000_4(X.ActivityC45651qj r3, com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 10: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.<init>(X.1qj, com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationsAssem, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S1200000_4(X.InterfaceC238119Wd r3, java.lang.String r4, X.C34K r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 17: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r5
            r1.l2 = r3
            r1.s0 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.<init>(X.9Wd, java.lang.String, X.34K, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S1200000_4(X.C70414RkI r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 5: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.<init>(X.RkI, com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S1200000_4(android.content.Context r3, com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 14: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S1200000_4.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(ActivityC45651qj activityC45651qj, String str, AqS104S0101000_4 aqS104S0101000_4, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityC45651qj;
        this.s0 = str;
        this.l2 = aqS104S0101000_4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C234109Gs c234109Gs, String str, HeaderBaseContainerComponent headerBaseContainerComponent, int i) {
        super(1);
        this.$t = i;
        this.l1 = c234109Gs;
        this.s0 = str;
        this.l2 = headerBaseContainerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C234109Gs c234109Gs, String str, ProfileNavBarRootComponent profileNavBarRootComponent, int i) {
        super(1);
        this.$t = i;
        this.l1 = c234109Gs;
        this.s0 = str;
        this.l2 = profileNavBarRootComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C234109Gs c234109Gs, String str, ProfileNavBarBaseComponent profileNavBarBaseComponent, int i) {
        super(1);
        this.$t = i;
        this.l1 = c234109Gs;
        this.s0 = str;
        this.l2 = profileNavBarBaseComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C237929Vk c237929Vk, String str, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l1 = c34k;
        this.l2 = c237929Vk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C237949Vm c237949Vm, String str, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l1 = c34k;
        this.s0 = str;
        this.l2 = c237949Vm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C249599qt c249599qt, ActivityTask activityTask, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c249599qt;
        this.l2 = activityTask;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(AML aml, C26936Ahg c26936Ahg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aml;
        this.l2 = c26936Ahg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C26936Ahg c26936Ahg, String str, LaneParams laneParams, int i) {
        super(1);
        this.$t = i;
        this.l1 = c26936Ahg;
        this.s0 = str;
        this.l2 = laneParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C70414RkI c70414RkI, PoliciesFragment policiesFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.l2 = policiesFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(C70414RkI c70414RkI, String str, C27516Ar2 c27516Ar2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.s0 = str;
        this.l2 = c27516Ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S1200000_4(C70414RkI c70414RkI, C70414RkI c70414RkI2, String str, HashMap<String, Object> hashMap) {
        super(1);
        this.$t = hashMap;
        this.l1 = c70414RkI;
        this.s0 = c70414RkI2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(Activity activity, String str, ALY aly, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = aly;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(CreatorToolsActivity creatorToolsActivity, ShowCaseModel showCaseModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = creatorToolsActivity;
        this.l2 = showCaseModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S1200000_4(AddressEditViewModel addressEditViewModel, AddressEditViewModel addressEditViewModel2, String str, InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l1 = addressEditViewModel;
        this.s0 = addressEditViewModel2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S1200000_4(AddressEditDetailViewModel addressEditDetailViewModel, AddressEditDetailViewModel addressEditDetailViewModel2, String str, InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l1 = addressEditDetailViewModel;
        this.s0 = addressEditDetailViewModel2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(PaymentInfo paymentInfo, PaymentViewModel paymentViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = paymentInfo;
        this.l2 = paymentViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(PaymentMethodView paymentMethodView, String str, CommuteType commuteType, int i) {
        super(1);
        this.$t = i;
        this.l1 = paymentMethodView;
        this.s0 = str;
        this.l2 = commuteType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(PdpPromotionEntranceInfoViewHolder pdpPromotionEntranceInfoViewHolder, View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpPromotionEntranceInfoViewHolder;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(GlobalShopInfoVH globalShopInfoVH, String str, ShopBill shopBill, int i) {
        super(1);
        this.$t = i;
        this.l1 = globalShopInfoVH;
        this.s0 = str;
        this.l2 = shopBill;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(VideoTagFriendsListViewModel videoTagFriendsListViewModel, IMUser iMUser, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoTagFriendsListViewModel;
        this.l2 = iMUser;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(RelationFollowingComponent relationFollowingComponent, ActivityC45651qj activityC45651qj, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = relationFollowingComponent;
        this.l2 = activityC45651qj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(String str, SizeGuideFragment sizeGuideFragment, LaneParams laneParams, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = sizeGuideFragment;
        this.l2 = laneParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(String str, USMainOrderInfoVH uSMainOrderInfoVH, LogisticDTO logisticDTO, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = uSMainOrderInfoVH;
        this.l2 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1200000_4(String str, CreatorCollectionDetailResponse creatorCollectionDetailResponse, EnumC248719pT enumC248719pT, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = creatorCollectionDetailResponse;
        this.l2 = enumC248719pT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S1200000_4(List list, List<VoucherInfoNew> list2, String str, OrderSubmitViewModel orderSubmitViewModel) {
        super(1);
        this.$t = orderSubmitViewModel;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
    }
}
