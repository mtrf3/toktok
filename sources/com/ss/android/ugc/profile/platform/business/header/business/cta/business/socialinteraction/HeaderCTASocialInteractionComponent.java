package com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction;

import X.ALX;
import X.APY;
import X.AV1;
import X.ActivityC45651qj;
import X.C107724Kq;
import X.C16880lQ;
import X.C188717at;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221038lv;
import X.C221108m2;
import X.C225318sp;
import X.C227768wm;
import X.C234059Gn;
import X.C234409Hw;
import X.C234999Kd;
import X.C235079Kl;
import X.C237429Tm;
import X.C245349k2;
import X.C245889ku;
import X.C26074ALe;
import X.C26076ALg;
import X.C26175APb;
import X.C26227ARb;
import X.C26335AVf;
import X.C27740Aue;
import X.C29822Bn8;
import X.C2J0;
import X.C2U8;
import X.C31633CbF;
import X.C31811Ce7;
import X.C32151Nz;
import X.C36821Ecj;
import X.C38293F1d;
import X.C38333F2r;
import X.C3BA;
import X.C3U3;
import X.C40883G2t;
import X.C41424GNo;
import X.C44384HbQ;
import X.C52943KqB;
import X.C53177Ktx;
import X.C53735L7b;
import X.C53736L7c;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57285Me1;
import X.C57293Me9;
import X.C57368MfM;
import X.C57464Mgu;
import X.C57466Mgw;
import X.C57469Mgz;
import X.C57490MhK;
import X.C57492MhM;
import X.C57506Mha;
import X.C57509Mhd;
import X.C59522Vg;
import X.C59955Nfz;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C70642pw;
import X.C70792qB;
import X.C76800UCe;
import X.C77266UUc;
import X.C78613UtF;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78926UyI;
import X.C78949Uyf;
import X.C7FA;
import X.C87030YDq;
import X.C87059YEt;
import X.C8VC;
import X.C8YN;
import X.C9PM;
import X.EnumC235129Kq;
import X.EnumC57365MfJ;
import X.EnumC57387Mff;
import X.IIJ;
import X.InterfaceC235069Kk;
import X.InterfaceC26071ALb;
import X.InterfaceC57106Mb8;
import X.InterfaceC57508Mhc;
import X.InterfaceC57511Mhf;
import X.InterfaceC88472Yns;
import X.J9P;
import X.KMP;
import X.LO7;
import X.LSC;
import X.M9F;
import X.O6R;
import X.Q7L;
import X.Q8U;
import X.QD3;
import X.TBT;
import X.UC0;
import X.XKX;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.IDCListenerS161S0100000_9;
import Y.IDgS349S0100000_9;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialInteractionData;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.zhiliaoapp.musically.R;
import defpackage.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class HeaderCTASocialInteractionComponent extends Hilt_HeaderCTASocialInteractionComponent implements ICTASocialInteractionAbility, WeakHandler.IHandler {
    public static final C57509Mhd Companion = new C57509Mhd();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public LiveData<ActivityStatus> activityStatusLiveData;
    public User activityStatusPreUser;
    public final C5H3 activityStatusProfileLifecycleOwner$delegate;
    public String eventType;
    public View followFeatureView;
    public C188717at followRequestTip;
    public boolean hasShowGuide;
    public C57466Mgw headerCTASocialInteractionHelper;
    public View messageFeatureView;
    public boolean needReportFollowBackBtn;
    public final C5H3 paramsBuilder$delegate;
    public String requestId;
    public SocialInteractionData socialInteractionData;
    public Map<String, Integer> socialInteractionIndexMap;
    public final C214298b3 userProfileBlockVM$delegate;
    public final C214298b3 userProfileFollowVM$delegate;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public HeaderCTASocialInteractionComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileFollowVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 750);
        C57464Mgu c57464Mgu = C57464Mgu.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        this.userProfileFollowVM$delegate = new C214298b3(aqS159S0100000_9, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), c57464Mgu, LIZ);
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserProfileBlockVM.class);
        this.userProfileBlockVM$delegate = new C214298b3(new AqS159S0100000_9(LIZ2, 751), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C57492MhM.INSTANCE, LIZ2);
        this.needReportFollowBackBtn = true;
        this.paramsBuilder$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(this, 749));
        this.activityStatusProfileLifecycleOwner$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(this, 752));
        this.socialInteractionIndexMap = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsBeforeUpdateUI() {
        C188717at c188717at;
        String str;
        ViewGroup viewGroup;
        C9PM state;
        ProfilePlatformViewModel profilePlatformVM;
        View view;
        super.actionsBeforeUpdateUI();
        ViewParent viewParent = null;
        this.headerCTASocialInteractionHelper = new C57466Mgw(this.followFeatureView, this.messageFeatureView, (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null), new C53736L7c(this), new C53735L7b(this), this.socialInteractionIndexMap);
        requestShow();
        View view2 = this.followFeatureView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.followFeatureView;
        if (view3 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 82), view3);
        }
        View view4 = this.messageFeatureView;
        if (view4 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 83), view4);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (view = LIZLLL.getView()) != null) {
            c188717at = (C188717at) view.findViewById(R.id.dkm);
        } else {
            c188717at = null;
        }
        this.followRequestTip = c188717at;
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null) {
            AssemViewModel.selectSubscribe$default(profilePlatformVM2, C234059Gn.LJLIL, null, null, null, new AqS170S0100000_4(new AqS175S0100000_9(this, 362), (InterfaceC88472Yns<? super APY, C76800UCe>) 1634), 14, null);
        }
        ProfilePlatformViewModel profilePlatformVM3 = getProfilePlatformVM();
        if (profilePlatformVM3 != null) {
            profilePlatformVM3.ov0(new AqS175S0100000_9(this, 363));
        }
        if (C53177Ktx.LIZ() && (profilePlatformVM = getProfilePlatformVM()) != null) {
            profilePlatformVM.pv0(new AqS175S0100000_9(this, 364));
        }
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLILLLLZI;
            }
        }, null, new AqS175S0100000_9(this, 365), null, new AqS170S0100000_4(this, 839), 10, null);
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJI;
            }
        }, null, new AqS170S0100000_4(this, 840), null, new AqS170S0100000_4(this, 841), 10, null);
        C8YN.LJII(this, getUserProfileFollowVM(), new TBT() { // from class: X.MhF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJJI;
            }
        }, null, new AqS191S0100000_9(this, 60), 6);
        ProfilePlatformViewModel profilePlatformVM4 = getProfilePlatformVM();
        if (profilePlatformVM4 != null && (state = profilePlatformVM4.getState()) != null) {
            str = state.LJZL;
        } else {
            str = null;
        }
        this.eventType = str;
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9kt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLIL;
            }
        }, null, C245889ku.LJLIL, 6);
        C57466Mgw c57466Mgw = this.headerCTASocialInteractionHelper;
        if (c57466Mgw != null) {
            if (C57469Mgz.LIZJ()) {
                View view5 = c57466Mgw.LIZ;
                if (view5 != null) {
                    viewParent = view5.getParent();
                }
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    LayoutTransition layoutTransition = new LayoutTransition();
                    layoutTransition.setAnimateParentHierarchy(false);
                    layoutTransition.disableTransitionType(0);
                    layoutTransition.disableTransitionType(1);
                    layoutTransition.disableTransitionType(3);
                    viewGroup.setLayoutTransition(layoutTransition);
                }
            }
            View view6 = c57466Mgw.LIZIZ;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            c57466Mgw.LJIILLIIL.getClass();
            c57466Mgw.LIZLLL(100);
            c57466Mgw.LJIILL.getClass();
            c57466Mgw.LJ(6, 8);
            if (C57469Mgz.LJ()) {
                w wVar = c57466Mgw.LJIILL;
                O6R.LJJIIZ(C32151Nz.LJIIZILJ(116));
                wVar.getClass();
                c57466Mgw.LJIILL.LIZ = C44384HbQ.LJJZ(R.string.i3_);
            } else if (C57469Mgz.LJFF()) {
                c57466Mgw.LJIILL.LIZJ = Integer.valueOf(R.raw.icon_paperplane_fill);
            }
        }
        C57466Mgw c57466Mgw2 = this.headerCTASocialInteractionHelper;
        if (c57466Mgw2 != null) {
            View view7 = c57466Mgw2.LIZ;
            if (view7 != null) {
                C7FA.LIZIZ(view7);
            }
            View view8 = c57466Mgw2.LIZIZ;
            if (view8 != null) {
                C7FA.LIZIZ(view8);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void addComponentToParent() {
        int i = 0;
        this.socialInteractionIndexMap.put("cta_social_interaction_follow", 0);
        int i2 = 1;
        this.socialInteractionIndexMap.put("cta_social_interaction_message", 1);
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            Integer num = this.socialInteractionIndexMap.get("cta_social_interaction_follow");
            if (num != null) {
                i = num.intValue();
            }
            iHeaderCTAAbility.tW(i, "cta_social_interaction_follow");
        }
        IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility2 != null) {
            Integer num2 = this.socialInteractionIndexMap.get("cta_social_interaction_message");
            if (num2 != null) {
                i2 = num2.intValue();
            }
            iHeaderCTAAbility2.tW(i2, "cta_social_interaction_message");
        }
    }

    public final void followImpl() {
        Integer num;
        int i;
        String str;
        int i2;
        Integer num2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        int i3;
        HashMap hashMap;
        String str7;
        ICTARecommendButtonAbility iCTARecommendButtonAbility;
        Aweme aweme;
        String str8;
        Long l;
        Long l2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        User author;
        C87059YEt Qd;
        String str9;
        C9PM state;
        C9PM state2;
        int i4;
        String str10;
        int i5;
        C57466Mgw c57466Mgw = this.headerCTASocialInteractionHelper;
        Integer num3 = null;
        if (c57466Mgw != null) {
            User curUser = getCurUser();
            if (curUser != null) {
                i4 = curUser.getFollowStatus();
            } else {
                i4 = 0;
            }
            User curUser2 = getCurUser();
            User curUser3 = getCurUser();
            if (curUser3 != null) {
                str10 = curUser3.getAccurateRecType();
            } else {
                str10 = null;
            }
            C57466Mgw.LIZJ(i4, curUser2, str10, true);
            User curUser4 = getCurUser();
            User curUser5 = getCurUser();
            if (curUser5 != null) {
                i5 = curUser5.getFollowStatus();
            } else {
                i5 = 0;
            }
            c57466Mgw.LJI(i5, curUser4, true);
        }
        User curUser6 = getCurUser();
        if (curUser6 != null) {
            num = Integer.valueOf(curUser6.getFollowStatus());
        } else {
            num = null;
        }
        User curUser7 = getCurUser();
        if (curUser7 != null) {
            i = curUser7.getFollowStatus();
        } else {
            i = 0;
        }
        boolean LJIILIIL = AV1.LJIILIIL(i);
        int nextFollowStatus = getNextFollowStatus();
        if (nextFollowStatus != 2) {
            if (nextFollowStatus == 4) {
                popRequestFollowForPrivacyAccount();
            }
        } else {
            InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
            User curUser8 = getCurUser();
            if (curUser8 != null) {
                str = curUser8.getUid();
            } else {
                str = null;
            }
            imSayHiService.LJFF(str, false);
        }
        User curUser9 = getCurUser();
        if ((curUser9 != null && curUser9.getFollowStatus() == 4) || LJIILIIL) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        boolean LJZ = ((InterfaceC57511Mhf) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC57511Mhf.class), null)).LJZ();
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            num2 = Integer.valueOf(userAwemePagerAbility.m9());
        } else {
            num2 = null;
        }
        String valueOf = String.valueOf(num2);
        LO7 lo7 = LO7.LIZIZ;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM == null || (state2 = profilePlatformVM.getState()) == null || (str2 = state2.LJZL) == null) {
            str2 = "";
        }
        if (lo7.J1(str2) && TextUtils.isEmpty(getFromSearch())) {
            ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
            if (profilePlatformVM2 != null && (state = profilePlatformVM2.getState()) != null) {
                str9 = state.LJZL;
            } else {
                str9 = null;
            }
            this.eventType = str9;
        }
        getUserProfileFollowVM().rv0(getAweme(), getCurUser(), getContext(), LJZ, this.requestId, this.eventType, valueOf);
        C2U8.LIZ(new C31633CbF(nextFollowStatus, getCurUser()));
        displayExtraBtn(getCurUser(), nextFollowStatus);
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        EventLiveData<RelationStatus> LJFF = c77266UUc.getRelationService().LJFF();
        User curUser10 = getCurUser();
        if (curUser10 != null) {
            str3 = curUser10.getUid();
        } else {
            str3 = null;
        }
        User curUser11 = getCurUser();
        if (curUser11 != null) {
            num3 = Integer.valueOf(curUser11.getFollowerStatus());
        }
        LJFF.postValue(new RelationStatus(str3, nextFollowStatus, num3, null, null, 24, null));
        if (c77266UUc.LJ(getCurUser())) {
            if (C59522Vg.LIZ()) {
                newAuthDialogCenter();
            } else {
                Context context = getContext();
                if (context != null) {
                    c77266UUc.LJFF(context, "others_homepage", 0, "follow");
                }
            }
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (Qd = userProfileAbility.Qd()) != null) {
            str4 = Qd.LIZLLL;
        } else {
            str4 = null;
        }
        Context context2 = getContext();
        if (context2 == null) {
            return;
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        ALX alx = new ALX();
        User curUser12 = getCurUser();
        if (curUser12 != null) {
            str5 = curUser12.getUid();
        } else {
            str5 = null;
        }
        alx.LIZJ(str5);
        User curUser13 = getCurUser();
        if (curUser13 != null) {
            str6 = curUser13.getSecUid();
        } else {
            str6 = null;
        }
        alx.LIZIZ(str6);
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LIZJ = i2;
        c57285Me1.LJFF = "others_homepage";
        c57285Me1.LIZLLL = 19;
        String str11 = this.eventType;
        Aweme aweme2 = getAweme();
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            bool = Boolean.valueOf(C221038lv.LIZ(author));
        } else {
            bool = null;
        }
        alx.LIZ.LJ = getPreviousPageType(str4, str11, bool, getEnterMethod());
        int i6 = -1;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        alx.LIZ.LJIIIZ = i3;
        User curUser14 = getCurUser();
        if (curUser14 != null) {
            i6 = curUser14.getFollowerStatus();
        }
        alx.LIZ.LJIIJ = i6;
        if (getAweme() != null && (aweme = getAweme()) != null && aweme.isAd()) {
            Aweme aweme3 = getAweme();
            if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null) {
                str8 = awemeRawAd3.getLogExtra();
            } else {
                str8 = null;
            }
            Aweme aweme4 = getAweme();
            if (aweme4 != null && (awemeRawAd2 = aweme4.getAwemeRawAd()) != null) {
                l = awemeRawAd2.getAdId();
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            Aweme aweme5 = getAweme();
            if (aweme5 != null && (awemeRawAd = aweme5.getAwemeRawAd()) != null) {
                l2 = awemeRawAd.getCreativeId();
            } else {
                l2 = null;
            }
            String valueOf3 = String.valueOf(l2);
            hashMap = new HashMap();
            C59955Nfz.LIZ(context2, str8, valueOf2, valueOf3, hashMap);
        } else {
            hashMap = new HashMap();
            C59955Nfz.LIZIZ(null, str4, hashMap);
        }
        alx.LIZ.LJIIJJI = hashMap;
        User curUser15 = getCurUser();
        if (curUser15 != null) {
            str7 = curUser15.getAccurateRecType();
        } else {
            str7 = null;
        }
        alx.LIZ.LJIILL = str7;
        C57285Me1 params = alx.LIZ();
        userProfileFollowVM.getClass();
        o.LJIIIZ(params, "params");
        userProfileFollowVM.withState(new AqS140S0200000_9(userProfileFollowVM, params, 95));
        if (C52943KqB.LIZ() && (iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICTARecommendButtonAbility.class, null)) != null) {
            iCTARecommendButtonAbility.c3(nextFollowStatus);
        }
    }

    public final M9F getActivityStatusProfileLifecycleOwner() {
        return (M9F) this.activityStatusProfileLifecycleOwner$delegate.getValue();
    }

    public final C107724Kq getParamsBuilder() {
        return (C107724Kq) this.paramsBuilder$delegate.getValue();
    }

    public final UserProfileBlockVM getUserProfileBlockVM() {
        return (UserProfileBlockVM) this.userProfileBlockVM$delegate.getValue();
    }

    public final UserProfileFollowVM getUserProfileFollowVM() {
        return (UserProfileFollowVM) this.userProfileFollowVM$delegate.getValue();
    }

    private final Aweme getAweme() {
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            return profilePlatformVM.gv0();
        }
        return null;
    }

    private final ProfileCommonInfo getCommonData() {
        return getCommonInfo();
    }

    private final String getEnterMethod() {
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null) {
            return profileInitData.LJLJJI;
        }
        return null;
    }

    private final String getFrEventPreviousPage() {
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null) {
            return profileInitData.LJLJJL;
        }
        return null;
    }

    private final String getFromSearch() {
        C57368MfM c57368MfM;
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null && (c57368MfM = profileInitData.LJLJLJ) != null) {
            return c57368MfM.LJ;
        }
        return null;
    }

    private final int getNextFollowStatus() {
        Integer valueOf;
        User curUser = getCurUser();
        if (curUser != null && (valueOf = Integer.valueOf(curUser.getFollowStatus())) != null) {
            if (valueOf.intValue() == 0) {
                User curUser2 = getCurUser();
                if (curUser2 != null && curUser2.isSecret()) {
                    return 4;
                }
                User curUser3 = getCurUser();
                if (curUser3 != null && curUser3.getFollowerStatus() == 1) {
                    return 2;
                }
                return 1;
            }
            if (valueOf.intValue() != 4 && valueOf.intValue() != 1) {
                valueOf.intValue();
            }
        }
        return 0;
    }

    private final C26175APb getProfileInitData() {
        IHeaderBaseAbility iHeaderBaseAbility = (IHeaderBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBaseAbility.class, null);
        if (iHeaderBaseAbility == null) {
            return null;
        }
        return iHeaderBaseAbility.Nu();
    }

    private final void initViewModelProfileParams() {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C87059YEt Qd;
        C87059YEt Qd2;
        C87059YEt Qd3;
        C87059YEt Qd4;
        C87059YEt Qd5;
        C87059YEt Qd6;
        C87059YEt Qd7;
        String str6 = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (Qd7 = userProfileAbility.Qd()) != null) {
            num = Qd7.LJIIIZ;
        } else {
            num = null;
        }
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility2 != null && (Qd6 = userProfileAbility2.Qd()) != null) {
            str = Qd6.LIZLLL;
        } else {
            str = null;
        }
        UserProfileAbility userProfileAbility3 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility3 != null && (Qd5 = userProfileAbility3.Qd()) != null) {
            str2 = Qd5.LJ;
        } else {
            str2 = null;
        }
        UserProfileAbility userProfileAbility4 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility4 != null && (Qd4 = userProfileAbility4.Qd()) != null) {
            str3 = Qd4.LJFF;
        } else {
            str3 = null;
        }
        UserProfileAbility userProfileAbility5 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility5 != null && (Qd3 = userProfileAbility5.Qd()) != null) {
            str4 = Qd3.LJI;
        } else {
            str4 = null;
        }
        UserProfileAbility userProfileAbility6 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility6 != null && (Qd2 = userProfileAbility6.Qd()) != null) {
            str5 = Qd2.LJII;
        } else {
            str5 = null;
        }
        UserProfileAbility userProfileAbility7 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility7 != null && (Qd = userProfileAbility7.Qd()) != null) {
            str6 = Qd.LJIIIIZZ;
        }
        getUserProfileFollowVM().jv0(num, str, str2, str3, str4, str5, str6);
        getUserProfileFollowVM().LJLJJLL = getCurUser();
    }

    private final Boolean isVisible() {
        C9PM state;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null) {
            return Boolean.valueOf(state.LJLLLLLL);
        }
        return null;
    }

    private final void newAuthDialogCenter() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LIZ), C78613UtF.LIZJ, null, new C70642pw(LIZ, null), 2);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final void popRequestFollowForPrivacyAccount() {
        Fragment LIZLLL;
        C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        Integer followCount = privacyAccountFollowCount.LIZ();
        if (followCount == null || followCount.intValue() != 0) {
            o.LJIIIIZZ(followCount, "followCount");
            int intValue = followCount.intValue();
            if (1 <= intValue && intValue < 4 && (LIZLLL = C212428Vi.LIZLLL(this)) != null) {
                C31811Ce7.LIZJ(LIZLLL, R.string.pao);
            }
        } else {
            Context context = getContext();
            if (context != null) {
                C26227ARb LIZ = Q7L.LIZ(context, R.string.pan);
                UC0.LIZJ(LIZ, C57490MhK.LJLIL);
                LIZ.LJI().LIZLLL();
            }
        }
        privacyAccountFollowCount.LIZLLL(Integer.valueOf(followCount.intValue() + 1));
    }

    public final void bindActivityStatus() {
        String uid;
        LiveData<ActivityStatus> LJIIJJI;
        User curUser;
        User curUser2 = getCurUser();
        if (curUser2 == null || (uid = curUser2.getUid()) == null || !o.LJ(isVisible(), Boolean.TRUE) || o.LJ(this.activityStatusPreUser, getCurUser())) {
            return;
        }
        this.activityStatusPreUser = getCurUser();
        if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF() && (curUser = getCurUser()) != null && curUser.getFollowStatus() == 2) {
            return;
        }
        LiveData<ActivityStatus> liveData = this.activityStatusLiveData;
        if (liveData != null) {
            M9F activityStatusProfileLifecycleOwner = getActivityStatusProfileLifecycleOwner();
            if (activityStatusProfileLifecycleOwner == null) {
                activityStatusProfileLifecycleOwner = this;
            }
            liveData.removeObservers(activityStatusProfileLifecycleOwner);
        }
        LJIIJJI = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().LJIIJJI(uid, true, C3BA.OTHERS);
        M9F activityStatusProfileLifecycleOwner2 = getActivityStatusProfileLifecycleOwner();
        if (activityStatusProfileLifecycleOwner2 == null) {
            activityStatusProfileLifecycleOwner2 = this;
        }
        LJIIJJI.observe(activityStatusProfileLifecycleOwner2, new AObserverS77S0100000_9(this, 48));
        this.activityStatusLiveData = LJIIJJI;
    }

    public final void checkBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.bl7, R.string.bl8);
            UC0.LIZJ(LIZLLL, new AqS175S0100000_9(this, 366));
            LIZLLL.LJI().LIZLLL();
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        User curUser = getCurUser();
        userProfileFollowVM.getClass();
        UserProfileFollowVM.uv0(curUser);
    }

    public final void checkBlockFail() {
        String str;
        Context context = getContext();
        if (context != null) {
            String LIZ = C29822Bn8.LIZ(context, R.string.a7k, "it.resources.getString(R…nce_unblock_popup_header)");
            Object[] objArr = new Object[2];
            objArr[0] = AV1.LIZLLL(getCurUser());
            User curUser = getCurUser();
            String str2 = null;
            if (curUser == null || (str = curUser.getNickname()) == null) {
                str = "";
            }
            objArr[1] = str;
            String LIZIZ = Q8U.LIZIZ(objArr, 2, LIZ, "format(format, *args)");
            String LIZ2 = C29822Bn8.LIZ(context, R.string.a7j, "it.resources.getString(R…ience_unblock_popup_body)");
            Object[] objArr2 = new Object[1];
            User curUser2 = getCurUser();
            if (curUser2 != null) {
                str2 = curUser2.getUniqueId();
            }
            objArr2[0] = str2;
            String LIZIZ2 = Q8U.LIZIZ(objArr2, 1, LIZ2, "format(format, *args)");
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJFF(LIZIZ);
            c26227ARb.LIZIZ(LIZIZ2);
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 842));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void checkDoubleCancelFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.tcl);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 367));
            LIZ.LJI().LIZLLL();
        }
    }

    public final void checkLoginFail() {
        String str;
        String str2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str3 = this.eventType;
        if (str3 == null) {
            str3 = "";
        }
        C40883G2t c40883G2t = new C40883G2t();
        Aweme aweme = getAweme();
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c40883G2t.LIZLLL("group_id", str);
        Aweme aweme2 = getAweme();
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c40883G2t.LIZLLL("author_id", str2);
        Aweme aweme3 = getAweme();
        if (aweme3 != null) {
            str4 = aweme3.getAid();
        }
        c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str4));
        J9P.LIZIZ(LIZ, str3, "click_follow", (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(this, 5));
    }

    public final void checkRequestedFail() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C41424GNo c41424GNo = new C41424GNo(context);
        c41424GNo.LIZ(new String[]{context.getResources().getString(R.string.cgi), context.getResources().getString(R.string.cgj)}, new IDCListenerS161S0100000_9(this, 2));
        c41424GNo.LIZIZ();
    }

    public final void checkTemporaryBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.bl_);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 368));
            LIZ.LJI().LIZLLL();
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        User curUser = getCurUser();
        userProfileFollowVM.getClass();
        UserProfileFollowVM.uv0(curUser);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View generateComponentView() {
        C234409Hw c234409Hw;
        C234409Hw c234409Hw2 = null;
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            iHeaderCTAAbility.JA("cta_social_interaction_follow");
        }
        IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility2 != null) {
            iHeaderCTAAbility2.JA("cta_social_interaction_message");
        }
        IHeaderCTAAbility iHeaderCTAAbility3 = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility3 != null) {
            c234409Hw = iHeaderCTAAbility3.Tj0("cta_social_interaction_follow");
        } else {
            c234409Hw = null;
        }
        this.followFeatureView = c234409Hw;
        IHeaderCTAAbility iHeaderCTAAbility4 = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility4 != null) {
            c234409Hw2 = iHeaderCTAAbility4.Tj0("cta_social_interaction_message");
        }
        this.messageFeatureView = c234409Hw2;
        return super.generateComponentView();
    }

    public final User getCurUser() {
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null) {
            return null;
        }
        return userProfileAbility.getUser();
    }

    public final String getEnterFrom() {
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null) {
            return profileInitData.LJLJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.Hilt_HeaderCTASocialInteractionComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ICTASocialInteractionAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public void removeFollower() {
        C188717at c188717at;
        User curUser;
        String str;
        getUserProfileFollowVM().pv0();
        Context context = getContext();
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.q1f);
            String LLLZ = C16880lQ.LLLZ(C29822Bn8.LIZ(context, R.string.q1e, "it.resources.getString(R…emove_follower_alert_msg)"), Arrays.copyOf(new Object[]{AV1.LIZLLL(getCurUser())}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c26227ARb.LIZIZ(LLLZ);
            UC0.LIZJ(c26227ARb, new AqS175S0100000_9(this, 361));
            c26227ARb.LJI().LIZLLL();
        }
        if (TextUtils.equals(getEnterFrom(), "follow_request_page") && this.hasShowGuide && (c188717at = this.followRequestTip) != null && c188717at.LJLJJI && (curUser = getCurUser()) != null && curUser.isBlock) {
            C188717at c188717at2 = this.followRequestTip;
            if (c188717at2 != null) {
                c188717at2.LIZIZ();
            }
            User curUser2 = getCurUser();
            if (curUser2 == null || (str = curUser2.getUid()) == null) {
                str = "";
            }
            C2U8.LIZ(new IIJ(str, -101));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateComponentUIAndData() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent.updateComponentUIAndData():void");
    }

    public final Map<String, Integer> getSocialInteractionIndexMap() {
        return this.socialInteractionIndexMap;
    }

    private final void updateFollowStatus(int i) {
        User curUser = getCurUser();
        if (curUser != null && curUser.getFollowStatus() == i) {
            return;
        }
        User curUser2 = getCurUser();
        if (curUser2 != null) {
            curUser2.setFollowStatus(i);
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null) {
            return;
        }
        userProfileAbility.Pe0(getCurUser(), EnumC235129Kq.NORMAL);
    }

    public final void follow(View view) {
        boolean z;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            z = LIZLLL.isAdded();
        } else {
            z = false;
        }
        if (!this._isViewValid || !z || getCurUser() == null || getContext() == null || C6ZT.LIZIZ(view, 300L)) {
            return;
        }
        if (!TextUtils.isEmpty(getFromSearch())) {
            this.eventType = getFromSearch();
        }
        getUserProfileFollowVM().gv0(EnumC57387Mff.START);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        BaseResponse baseResponse;
        User curUser = getCurUser();
        if (curUser != null) {
            Object obj = null;
            if (message != null) {
                obj = message.obj;
            }
            if ((obj instanceof BaseResponse) && (baseResponse = (BaseResponse) obj) != null) {
                if (NoticeServiceImpl.LJJJJJ().LJIJJLI(baseResponse)) {
                    String uid = curUser.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    C2U8.LIZ(new IIJ(uid, -101));
                } else {
                    if (!NoticeServiceImpl.LJJJJJ().LJJIIZ(baseResponse)) {
                        return;
                    }
                    String uid2 = curUser.getUid();
                    o.LJIIIIZZ(uid2, "user.uid");
                    C2U8.LIZ(new IIJ(uid2, -100));
                    curUser.setFollowerStatus(1);
                    if (curUser.getFollowStatus() == 1) {
                        curUser.setFollowStatus(2);
                    }
                    displayExtraBtn(getCurUser(), curUser.getFollowStatus());
                }
            }
        }
    }

    public final void mobFollowRecommendEvent(String str) {
        Activity activity;
        String enterMethod = getEnterMethod();
        if (enterMethod != null && o.LJ(enterMethod, "guide_dm")) {
            C225318sp.LIZLLL(getCurUser(), enterMethod, str);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        Context context = getContext();
        if (context != null) {
            activity = C78949Uyf.LJIILL(context);
        } else {
            activity = null;
        }
        C225318sp.LIZJ(activity, str, LSC.PROFILE, null);
    }

    @QD3
    public final void onEvent(C245349k2 event) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        Aweme aweme = getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getCreativeIdStr();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            return;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
            if (user != null && (commerceUserInfo = user.getCommerceUserInfo()) != null) {
                commerceUserInfo.setNotificationConfig(event.LJLILLLLZI ? 1 : 0);
            }
        } else {
            user = null;
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
    }

    public void onFollowFail(Exception e) {
        FragmentManager fragmentManager;
        o.LJIIIZ(e, "e");
        if (!this._isViewValid) {
            return;
        }
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        if (c87030YDq.shouldDoCaptcha(e)) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                fragmentManager = LIZLLL.getChildFragmentManager();
            } else {
                fragmentManager = null;
            }
            c87030YDq.showCaptchaDialog(fragmentManager, (C38333F2r) e, new C57506Mha());
            return;
        }
        C57293Me9.LIZ(C27740Aue.LIZ(getContext()), e);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatusUpdate(FollowStatusEvent event) {
        String str;
        o.LJIIIZ(event, "event");
        FollowStatus followStatus = event.status;
        String str2 = followStatus.userId;
        User curUser = getCurUser();
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str2, str)) {
            return;
        }
        displayExtraBtn(getCurUser(), followStatus.followStatus);
        InterfaceC57508Mhc interfaceC57508Mhc = (InterfaceC57508Mhc) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57508Mhc.class));
        if (interfaceC57508Mhc != null) {
            interfaceC57508Mhc.Z7(followStatus);
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        ActivityC45651qj LIZ;
        INoticeService LJJJJJ;
        String str;
        String uid;
        C9PM state;
        ICTARecommendButtonAbility iCTARecommendButtonAbility;
        String str2;
        String str3;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        AwemeRawAd awemeRawAd;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd2;
        C9PM state2;
        if (followStatus != null) {
            int i = followStatus.followStatus;
            if (i == 1 || i == 2) {
                User curUser = getCurUser();
                if (curUser != null) {
                    curUser.setBlock(false);
                }
                this.needReportFollowBackBtn = true;
                C225318sp.LJ(getCurUser(), EnumC57365MfJ.PROFILE_FOLLOW.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            int i2 = followStatus.followStatus;
            if ((i2 == 1 || i2 == 2 || i2 == 4) && (LIZ = C212428Vi.LIZ(this)) != null && (LJJJJJ = NoticeServiceImpl.LJJJJJ()) != null) {
                LJJJJJ.LJJJJI(LIZ, new GuideOutPushParam("others_homepage", (String) null, "follow", (String) null, 21));
            }
            if (followStatus.followStatus == 0) {
                C225318sp.LJ(getCurUser(), EnumC57365MfJ.PROFILE_FOLLOW_CANCEL.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            Aweme aweme = getAweme();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
                User curUser2 = getCurUser();
                Activity LIZ2 = C27740Aue.LIZ(getContext());
                C26175APb profileInitData = getProfileInitData();
                if (profileInitData != null) {
                    str4 = profileInitData.LJLJI;
                } else {
                    str4 = null;
                }
                ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
                if (profilePlatformVM != null && (state2 = profilePlatformVM.getState()) != null) {
                    str5 = state2.LLD;
                } else {
                    str5 = null;
                }
                InterfaceC26071ALb interfaceC26071ALb = new InterfaceC26071ALb() { // from class: X.9kM
                    @Override // X.InterfaceC26071ALb
                    public final void LIZ(User user) {
                        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(HeaderCTASocialInteractionComponent.this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
                    }
                };
                Aweme aweme2 = getAweme();
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C26074ALe.LIZLLL(new C26076ALg(curUser2, LIZ2, "others_homepage", str4, str5, interfaceC26071ALb, "follow_notification", awemeRawAd2, null, 1792));
            }
            User curUser3 = getCurUser();
            if (curUser3 == null) {
                curUser3 = new User();
                ProfileCommonInfo commonInfo = getCommonInfo();
                if (commonInfo != null && (userProfileInfo2 = commonInfo.getUserProfileInfo()) != null) {
                    str2 = userProfileInfo2.getUid();
                } else {
                    str2 = null;
                }
                curUser3.setUid(str2);
                ProfileCommonInfo commonInfo2 = getCommonInfo();
                if (commonInfo2 != null && (userProfileInfo = commonInfo2.getUserProfileInfo()) != null) {
                    str3 = userProfileInfo.getSecUid();
                } else {
                    str3 = null;
                }
                curUser3.setSecUid(str3);
                curUser3.setFollowStatus(followStatus.followStatus);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(IMUser.fromUser(curUser3));
            displayExtraBtn(getCurUser(), followStatus.followStatus);
            int i3 = followStatus.followStatus;
            if ((i3 == 1 || i3 == 4) && curUser3.isBlock()) {
                curUser3.setBlock(false);
                str = null;
                UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserAwemePagerAbility.class, null);
                if (userAwemePagerAbility != null) {
                    userAwemePagerAbility.LLJLLIL();
                }
            } else {
                str = null;
            }
            if (!C52943KqB.LIZ() && (iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICTARecommendButtonAbility.class, str)) != null) {
                iCTARecommendButtonAbility.c3(followStatus.followStatus);
            }
            User curUser4 = getCurUser();
            if (curUser4 != null && (uid = curUser4.getUid()) != null && (!TextUtils.isEmpty(uid))) {
                if (TextUtils.equals(getEnterFrom(), "follow_request_page")) {
                    C2U8.LIZ(new IIJ(uid, followStatus.followStatus));
                } else {
                    ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
                    if (profilePlatformVM2 != null && (state = profilePlatformVM2.getState()) != null) {
                        str = state.LJZI;
                    }
                    if (TextUtils.equals(str, "homepage_friends") && followStatus.followStatus == 0) {
                        C2U8.LIZ(new C70792qB(getAweme()));
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus.followStatus);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C2U8.LIZ(new C38293F1d("userFollowStatusChange", jSONObject));
        }
    }

    @QD3
    public final void onMobRequestIdEvent(C2J0 event) {
        o.LJIIIZ(event, "event");
        this.requestId = event.LJLIL;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        String str;
        C57466Mgw c57466Mgw;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        if (str2 != null) {
            User curUser = getCurUser();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && (c57466Mgw = this.headerCTASocialInteractionHelper) != null) {
                c57466Mgw.LJIILJJIL.LIZJ = C44384HbQ.LJJZ(R.string.i3_);
                c57466Mgw.LJFF();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        List<Integer> list;
        o.LJIIIZ(jsonObject, "jsonObject");
        this.socialInteractionData = (SocialInteractionData) C237429Tm.LIZ(jsonObject.toString(), SocialInteractionData.class);
        User curUser = getCurUser();
        Boolean bool = null;
        if (curUser != null) {
            SocialInteractionData socialInteractionData = this.socialInteractionData;
            if (socialInteractionData != null) {
                list = socialInteractionData.getCanMessageFollowStatusList();
            } else {
                list = null;
            }
            curUser.setCanMessageFollowStatusList(list);
        }
        User curUser2 = getCurUser();
        if (curUser2 == null) {
            return;
        }
        SocialInteractionData socialInteractionData2 = this.socialInteractionData;
        if (socialInteractionData2 != null) {
            bool = Boolean.valueOf(socialInteractionData2.isShowMessageEntrance());
        }
        curUser2.isShowMessageEntrance = bool.booleanValue();
    }

    public final void setSocialInteractionIndexMap(Map<String, Integer> map) {
        o.LJIIIZ(map, "<set-?>");
        this.socialInteractionIndexMap = map;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility
    public void showFollowRequestTip(User user) {
        String str;
        GeneralPermission generalPermission;
        if (!TextUtils.equals(getEnterFrom(), "follow_request_page") || this.hasShowGuide) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (getContext() == null || LIZ == null || !this._isViewValid || user == null) {
            return;
        }
        User curUser = getCurUser();
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || LIZ.isFinishing() || user.isBlock || user.isBlocked()) {
            return;
        }
        if ((user.getGeneralPermission() != null && ((generalPermission = user.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 0)) || user.getFollowerStatus() == 1) {
            return;
        }
        C188717at c188717at = this.followRequestTip;
        if (c188717at != null) {
            c188717at.LIZLLL(user);
            c188717at.setAcceptCallback(new AqS98S0300000_9(this, user, c188717at, 15));
            c188717at.setDeleteCallback(new AqS98S0300000_9(this, user, c188717at, 16));
            c188717at.LIZJ();
            String enterFrom = getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            C26335AVf.LJIJJ(enterFrom, uid);
        }
        this.hasShowGuide = true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        super.updateDataWhenUserUpdate(profileComponents);
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        initViewModelProfileParams();
        updateComponentUIAndData();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01df, code lost:
    
        if (r3.LJII(r0) == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e3, code lost:
    
        r10 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
        r3 = r18.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "user.uid");
        r10.LJ(r18.getFollowerStatus(), r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e1, code lost:
    
        if (r16 != false) goto L323;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void displayExtraBtn(com.ss.android.ugc.aweme.profile.model.User r18, int r19) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent.displayExtraBtn(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public final void onImClick(String str, String str2) {
        String str3;
        if (getCurUser() == null) {
            return;
        }
        getUserProfileFollowVM().ov0(this.eventType, getCurUser(), getAweme());
        Context context = getContext();
        String str4 = null;
        if (context != null) {
            C225318sp.LJ(getCurUser(), EnumC57365MfJ.ENTER_CHAT.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
            User curUser = getCurUser();
            C26175APb profileInitData = getProfileInitData();
            if (profileInitData != null) {
                str3 = profileInitData.LJLLLLLL;
            } else {
                str3 = null;
            }
            userProfileFollowVM.mv0(context, curUser, str, str2, str3);
        }
        C57466Mgw c57466Mgw = this.headerCTASocialInteractionHelper;
        if (c57466Mgw != null) {
            User curUser2 = getCurUser();
            if (curUser2 != null) {
                str4 = curUser2.getUid();
            }
            c57466Mgw.LIZIZ("click", str4);
        }
    }

    public final void updateInterActionText(String str, String str2) {
        if (str2 != null) {
            updateText(str, str2);
        }
    }

    public final void updateInteractionIcon(String str, Integer num) {
        if (num != null) {
            updateIcon(str, Integer.valueOf(num.intValue()));
        }
    }

    private final int getPreviousPageType(String str, String str2, Boolean bool, String str3) {
        boolean z;
        boolean z2;
        if (o.LJ(str3, "click_comment_head")) {
            return C78897Uxp.LJJLIIIJ(str2, 1, false, true);
        }
        if (C78685UuP.LJJJZ(str)) {
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            return C78897Uxp.LJJLIIIJ(str, 2, z2, false);
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return C78897Uxp.LJJLIIIJ(str2, 2, z, false);
    }

    public static /* synthetic */ void onImClick$default(HeaderCTASocialInteractionComponent headerCTASocialInteractionComponent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        headerCTASocialInteractionComponent.onImClick(str, str2);
    }

    public static /* synthetic */ int getPreviousPageType$default(HeaderCTASocialInteractionComponent headerCTASocialInteractionComponent, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return headerCTASocialInteractionComponent.getPreviousPageType(str, str2, bool, str3);
    }
}
