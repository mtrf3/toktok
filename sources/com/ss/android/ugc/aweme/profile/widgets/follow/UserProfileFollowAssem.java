package com.ss.android.ugc.aweme.profile.widgets.follow;

import X.AV1;
import X.ActivityC45651qj;
import X.C107724Kq;
import X.C110614Vt;
import X.C16880lQ;
import X.C188717at;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C225318sp;
import X.C227768wm;
import X.C234999Kd;
import X.C235079Kl;
import X.C245349k2;
import X.C245829ko;
import X.C245969l2;
import X.C26074ALe;
import X.C26076ALg;
import X.C26175APb;
import X.C26227ARb;
import X.C26335AVf;
import X.C27740Aue;
import X.C29822Bn8;
import X.C2J0;
import X.C2U8;
import X.C32151Nz;
import X.C36821Ecj;
import X.C38293F1d;
import X.C38333F2r;
import X.C3BA;
import X.C3U3;
import X.C40883G2t;
import X.C41424GNo;
import X.C47704Ins;
import X.C52943KqB;
import X.C53177Ktx;
import X.C55749LuL;
import X.C57293Me9;
import X.C57368MfM;
import X.C57462Mgs;
import X.C57467Mgx;
import X.C57469Mgz;
import X.C57470Mh0;
import X.C57487MhH;
import X.C57489MhJ;
import X.C57505MhZ;
import X.C5H3;
import X.C5S1;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C70632pv;
import X.C70792qB;
import X.C76800UCe;
import X.C78613UtF;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78926UyI;
import X.C78949Uyf;
import X.C7FA;
import X.C7MY;
import X.C86V;
import X.C87030YDq;
import X.C8VA;
import X.C8VB;
import X.C8VC;
import X.C8YN;
import X.C99W;
import X.C9AC;
import X.C9AE;
import X.C9PN;
import X.EF7;
import X.EnumC57365MfJ;
import X.EnumC57387Mff;
import X.IIJ;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC245979l3;
import X.InterfaceC26071ALb;
import X.InterfaceC57508Mhc;
import X.InterfaceC57512Mhg;
import X.J9P;
import X.KMP;
import X.LSC;
import X.M9F;
import X.ORZ;
import X.Q7L;
import X.Q8U;
import X.QD3;
import X.SY4;
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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
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
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowAssem;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
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
public final class UserProfileFollowAssem extends Hilt_UserProfileFollowAssem implements InterfaceC245979l3, WeakHandler.IHandler {
    public LiveData<ActivityStatus> activityStatusLiveData;
    public User activityStatusPreUser;
    public final C5H3 activityStatusProfileLifecycleOwner$delegate;
    public C57467Mgx extraBtnHelper;
    public C188717at followRequestTip;
    public SY4 followView;
    public SY4 followedView;
    public String mEventType;
    public boolean mHasShowGuide;
    public String mRequestId;
    public boolean needReportFollowBackBtn;
    public final C5H3 paramsBuilder$delegate;
    public SY4 sendButtonView;
    public final C214298b3 userProfileBlockVM$delegate;
    public final C214298b3 userProfileFollowVM$delegate;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C55749LuL profileInitData$delegate = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

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

    @Override // X.InterfaceC245979l3, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public UserProfileFollowAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileFollowVM.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 732);
        C57462Mgs c57462Mgs = C57462Mgs.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        this.userProfileFollowVM$delegate = new C214298b3(aqS154S0100000_4, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), c57462Mgs, LIZ);
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserProfileBlockVM.class);
        this.userProfileBlockVM$delegate = new C214298b3(new AqS154S0100000_4(LIZ2, 733), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C245969l2.INSTANCE, LIZ2);
        this.needReportFollowBackBtn = true;
        this.paramsBuilder$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(this, 519));
        this.activityStatusProfileLifecycleOwner$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 731));
    }

    private final void buttonPressFeedback() {
        float f;
        if (C99W.LIZ) {
            f = C32151Nz.LJIIZILJ(8);
        } else {
            f = 0.0f;
        }
        SY4 sy4 = this.followView;
        if (sy4 != null) {
            C9AC c9ac = C9AC.LIGHT_MASK;
            C9AE.LIZ(sy4, c9ac, f);
            SY4 sy42 = this.sendButtonView;
            if (sy42 != null) {
                C9AE.LIZ(sy42, c9ac, f);
                C9AE.LIZ(this.followedView, c9ac, f);
                C188717at c188717at = this.followRequestTip;
                if (c188717at != null) {
                    C9AE.LIZ(c188717at, c9ac, f);
                    return;
                } else {
                    o.LJIJI("followRequestTip");
                    throw null;
                }
            }
            o.LJIJI("sendButtonView");
            throw null;
        }
        o.LJIJI("followView");
        throw null;
    }

    private final void buttonRoundCorner() {
        if (C99W.LIZ) {
            Drawable drawable = null;
            if (this.followView != null) {
                if (this.sendButtonView != null) {
                    SY4 sy4 = this.sendButtonView;
                    if (sy4 != null) {
                        sy4.setButtonVariant(5);
                        SY4 sy42 = this.followedView;
                        if (sy42 != null) {
                            sy42.setButtonVariant(5);
                        }
                        C188717at c188717at = this.followRequestTip;
                        if (c188717at != null) {
                            Context context = getContext();
                            if (context != null) {
                                C110614Vt c110614Vt = new C110614Vt();
                                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ct);
                                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                                drawable = c110614Vt.LIZ(context);
                            }
                            c188717at.setBackground(drawable);
                            return;
                        }
                        o.LJIJI("followRequestTip");
                        throw null;
                    }
                    o.LJIJI("sendButtonView");
                    throw null;
                }
                o.LJIJI("sendButtonView");
                throw null;
            }
            o.LJIJI("followView");
            throw null;
        }
    }

    private final Aweme getMAweme() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJI;
        }
        return null;
    }

    private final C26175APb getProfileInitData() {
        return (C26175APb) this.profileInitData$delegate.getValue();
    }

    private final Boolean isVisible() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return Boolean.valueOf(c9pn.LJIIIZ);
        }
        return null;
    }

    public final void checkRequestedFail() {
        C41424GNo c41424GNo = new C41424GNo(getContext());
        Context context = getContext();
        o.LJI(context);
        Context context2 = getContext();
        o.LJI(context2);
        c41424GNo.LIZ(new String[]{context.getResources().getString(R.string.cgi), context2.getResources().getString(R.string.cgj)}, new IDCListenerS161S0100000_9(this, 1));
        c41424GNo.LIZIZ();
    }

    @Override // X.C8VB
    public C57470Mh0 defaultObservableData() {
        return new C57470Mh0(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void followImpl() {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowAssem.followImpl():void");
    }

    public final M9F getActivityStatusProfileLifecycleOwner() {
        return (M9F) this.activityStatusProfileLifecycleOwner$delegate.getValue();
    }

    public final User getMUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
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

    public final void initParams() {
        String str;
        String str2;
        User user;
        String str3;
        String str4;
        String str5;
        String str6;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        Integer num = null;
        if (c9pn != null) {
            str = c9pn.LIZJ;
        } else {
            str = null;
        }
        C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn2 != null) {
            str2 = c9pn2.LJFF;
        } else {
            str2 = null;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn3 != null) {
            str3 = c9pn3.LJIJI;
        } else {
            str3 = null;
        }
        C9PN c9pn4 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn4 != null) {
            str4 = c9pn4.LJIJJLI;
        } else {
            str4 = null;
        }
        C9PN c9pn5 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn5 != null) {
            str5 = c9pn5.LJIL;
        } else {
            str5 = null;
        }
        C9PN c9pn6 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn6 != null) {
            str6 = c9pn6.LJJ;
        } else {
            str6 = null;
        }
        C9PN c9pn7 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn7 != null) {
            num = c9pn7.LJJI;
        }
        getUserProfileFollowVM().jv0(num, str, str2, str3, str4, str5, str6);
        getUserProfileFollowVM().LJLJJLL = user;
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

    private final String getMFromSearch() {
        C57368MfM c57368MfM;
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null && (c57368MfM = profileInitData.LJLJLJ) != null) {
            return c57368MfM.LJ;
        }
        return null;
    }

    private final int getNextFollowStatus() {
        Integer valueOf;
        User mUser = getMUser();
        if (mUser != null && (valueOf = Integer.valueOf(mUser.getFollowStatus())) != null) {
            if (valueOf.intValue() == 0) {
                User mUser2 = getMUser();
                if (mUser2 != null && mUser2.isSecret()) {
                    return 4;
                }
                User mUser3 = getMUser();
                if (mUser3 != null && mUser3.getFollowerStatus() == 1) {
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

    private final void newAuthDialogCenter() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LIZ), C78613UtF.LIZJ, null, new C70632pv(LIZ, null), 2);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final void popRequestFollowForPrivacyAccount() {
        C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        Integer followCount = privacyAccountFollowCount.LIZ();
        if (followCount == null || followCount.intValue() != 0) {
            o.LJIIIIZZ(followCount, "followCount");
            int intValue = followCount.intValue();
            if (1 <= intValue && intValue < 4) {
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZJ(R.string.pao);
                c5s1.LJ();
            }
        } else {
            Context context = getContext();
            if (context != null) {
                C26227ARb LIZ = Q7L.LIZ(context, R.string.pan);
                UC0.LIZJ(LIZ, C57489MhJ.LJLIL);
                LIZ.LJI().LIZLLL();
            }
        }
        privacyAccountFollowCount.LIZLLL(Integer.valueOf(followCount.intValue() + 1));
    }

    public final void bindActivityStatus() {
        String uid;
        LiveData<ActivityStatus> LJIIJJI;
        User mUser;
        User mUser2 = getMUser();
        if (mUser2 == null || (uid = mUser2.getUid()) == null || !o.LJ(isVisible(), Boolean.TRUE) || o.LJ(this.activityStatusPreUser, getMUser())) {
            return;
        }
        this.activityStatusPreUser = getMUser();
        if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF() && (mUser = getMUser()) != null && mUser.getFollowStatus() == 2) {
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
        LJIIJJI.observe(activityStatusProfileLifecycleOwner2, new AObserverS77S0100000_9(this, 39));
        this.activityStatusLiveData = LJIIJJI;
    }

    public final void checkBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.bl7, R.string.bl8);
            UC0.LIZJ(LIZLLL, new AqS175S0100000_9(this, 219));
            LIZLLL.LJI().LIZLLL();
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        User mUser = getMUser();
        userProfileFollowVM.getClass();
        UserProfileFollowVM.uv0(mUser);
    }

    public final void checkBlockFail() {
        String str;
        Context context = getContext();
        if (context != null) {
            String LIZ = C29822Bn8.LIZ(context, R.string.a7k, "it.resources.getString(R…nce_unblock_popup_header)");
            Object[] objArr = new Object[2];
            objArr[0] = AV1.LIZLLL(getMUser());
            User mUser = getMUser();
            String str2 = null;
            if (mUser == null || (str = mUser.getNickname()) == null) {
                str = "";
            }
            objArr[1] = str;
            String LIZIZ = Q8U.LIZIZ(objArr, 2, LIZ, "format(format, *args)");
            String LIZ2 = C29822Bn8.LIZ(context, R.string.a7j, "it.resources.getString(R…ience_unblock_popup_body)");
            Object[] objArr2 = new Object[1];
            User mUser2 = getMUser();
            if (mUser2 != null) {
                str2 = mUser2.getUniqueId();
            }
            objArr2[0] = str2;
            String LIZIZ2 = Q8U.LIZIZ(objArr2, 1, LIZ2, "format(format, *args)");
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJFF(LIZIZ);
            c26227ARb.LIZIZ(LIZIZ2);
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 699));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void checkDoubleCancelFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.tcl);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 220));
            LIZ.LJI().LIZLLL();
        }
    }

    public final void checkLoginFail() {
        String str;
        String str2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str3 = this.mEventType;
        if (str3 == null) {
            str3 = "";
        }
        C40883G2t c40883G2t = new C40883G2t();
        Aweme mAweme = getMAweme();
        String str4 = null;
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        c40883G2t.LIZLLL("group_id", str);
        Aweme mAweme2 = getMAweme();
        if (mAweme2 != null) {
            str2 = mAweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c40883G2t.LIZLLL("author_id", str2);
        Aweme mAweme3 = getMAweme();
        if (mAweme3 != null) {
            str4 = mAweme3.getAid();
        }
        c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str4));
        J9P.LIZIZ(LIZ, str3, "click_follow", (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(this, 3));
    }

    public final void checkTemporaryBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.bl_);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 221));
            LIZ.LJI().LIZLLL();
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        User mUser = getMUser();
        userProfileFollowVM.getClass();
        UserProfileFollowVM.uv0(mUser);
    }

    public final String getMEnterFrom() {
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null) {
            return profileInitData.LJLJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.follow.Hilt_UserProfileFollowAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC245979l3, com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ICTAFollowMessageAbility
    public void removeFollower() {
        User mUser;
        getUserProfileFollowVM().pv0();
        Context context = getContext();
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.q1f);
            String LLLZ = C16880lQ.LLLZ(C29822Bn8.LIZ(context, R.string.q1e, "it.resources.getString(R…emove_follower_alert_msg)"), Arrays.copyOf(new Object[]{AV1.LIZLLL(getMUser())}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c26227ARb.LIZIZ(LLLZ);
            UC0.LIZJ(c26227ARb, new AqS175S0100000_9(this, 224));
            c26227ARb.LJI().LIZLLL();
        }
        if (TextUtils.equals(getMEnterFrom(), "follow_request_page") && this.mHasShowGuide) {
            C188717at c188717at = this.followRequestTip;
            if (c188717at != null) {
                if (c188717at.LJLJJI && (mUser = getMUser()) != null && mUser.isBlock) {
                    C188717at c188717at2 = this.followRequestTip;
                    if (c188717at2 != null) {
                        c188717at2.LIZIZ();
                        User mUser2 = getMUser();
                        o.LJI(mUser2);
                        String uid = mUser2.getUid();
                        o.LJIIIIZZ(uid, "mUser!!.uid");
                        C2U8.LIZ(new IIJ(uid, -101));
                        return;
                    }
                    o.LJIJI("followRequestTip");
                    throw null;
                }
                return;
            }
            o.LJIJI("followRequestTip");
            throw null;
        }
    }

    private final void updateFollowStatus(int i) {
        User mUser = getMUser();
        if (mUser != null && mUser.getFollowStatus() == i) {
            return;
        }
        User mUser2 = getMUser();
        if (mUser2 != null) {
            mUser2.setFollowStatus(i);
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), getMUser(), null, false, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        if (r9.LJII(r0) == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0261, code lost:
    
        r11 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
        r9 = r2.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r9, "user.uid");
        r11.LJ(r2.getFollowerStatus(), r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025f, code lost:
    
        if (r13 != false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c9, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r15)) == true) goto L316;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void displayExtraBtn(int r15) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowAssem.displayExtraBtn(int):void");
    }

    public final void follow(View view) {
        boolean z;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            z = LIZLLL.isAdded();
        } else {
            z = false;
        }
        if (!this._isViewValid || !z || getMUser() == null || getContext() == null || C6ZT.LIZIZ(view, 300L)) {
            return;
        }
        if (AV1.LJIIJJI()) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.cq5);
            c5s1.LJ();
        } else {
            if (!TextUtils.isEmpty(getMFromSearch())) {
                this.mEventType = getMFromSearch();
            }
            getUserProfileFollowVM().gv0(EnumC57387Mff.START);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        BaseResponse baseResponse;
        User mUser = getMUser();
        if (mUser != null) {
            Object obj = null;
            if (message != null) {
                obj = message.obj;
            }
            if ((obj instanceof BaseResponse) && (baseResponse = (BaseResponse) obj) != null) {
                if (NoticeServiceImpl.LJJJJJ().LJIJJLI(baseResponse)) {
                    String uid = mUser.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    C2U8.LIZ(new IIJ(uid, -101));
                } else {
                    if (!NoticeServiceImpl.LJJJJJ().LJJIIZ(baseResponse)) {
                        return;
                    }
                    String uid2 = mUser.getUid();
                    o.LJIIIIZZ(uid2, "user.uid");
                    C2U8.LIZ(new IIJ(uid2, -100));
                    mUser.setFollowerStatus(1);
                    if (mUser.getFollowStatus() == 1) {
                        mUser.setFollowStatus(2);
                    }
                    displayExtraBtn(mUser.getFollowStatus());
                }
            }
        }
    }

    public final void mobFollowRecommendEvent(String str) {
        Activity activity;
        String enterMethod = getEnterMethod();
        if (enterMethod != null && o.LJ(enterMethod, "guide_dm")) {
            C225318sp.LIZLLL(getMUser(), enterMethod, str);
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
        Aweme mAweme = getMAweme();
        if (mAweme != null && (awemeRawAd = mAweme.getAwemeRawAd()) != null) {
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

    @Override // X.InterfaceC245979l3
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
            c87030YDq.showCaptchaDialog(fragmentManager, (C38333F2r) e, new C57505MhZ());
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
        User mUser = getMUser();
        if (mUser != null) {
            str = mUser.getUid();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str2, str)) {
            return;
        }
        displayExtraBtn(followStatus.followStatus);
        InterfaceC57508Mhc interfaceC57508Mhc = (InterfaceC57508Mhc) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57508Mhc.class));
        if (interfaceC57508Mhc != null) {
            interfaceC57508Mhc.Z7(followStatus);
        }
    }

    @Override // X.InterfaceC245979l3
    public void onFollowSuccess(FollowStatus followStatus) {
        ActivityC45651qj LIZ;
        INoticeService LJJJJJ;
        boolean z;
        String uid;
        InterfaceC57512Mhg interfaceC57512Mhg;
        String str;
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (followStatus != null) {
            int i = followStatus.followStatus;
            if (i == 1 || i == 2) {
                User mUser = getMUser();
                if (mUser != null) {
                    mUser.setBlock(false);
                }
                this.needReportFollowBackBtn = true;
                C225318sp.LJ(getMUser(), EnumC57365MfJ.PROFILE_FOLLOW.getType(), getMEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            int i2 = followStatus.followStatus;
            if ((i2 == 1 || i2 == 2 || i2 == 4) && (LIZ = C212428Vi.LIZ(this)) != null && (LJJJJJ = NoticeServiceImpl.LJJJJJ()) != null) {
                LJJJJJ.LJJJJI(LIZ, new GuideOutPushParam("others_homepage", (String) null, "follow", (String) null, 21));
            }
            if (followStatus.followStatus == 0) {
                C225318sp.LJ(getMUser(), EnumC57365MfJ.PROFILE_FOLLOW_CANCEL.getType(), getMEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            Aweme mAweme = getMAweme();
            if (mAweme != null && (awemeRawAd2 = mAweme.getAwemeRawAd()) != null && awemeRawAd2.getNotificationConfig() == 1) {
                z = true;
            } else {
                z = false;
            }
            String str5 = null;
            if (z) {
                LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
                User mUser2 = getMUser();
                SY4 sy4 = this.followView;
                if (sy4 != null) {
                    Activity LIZ2 = C27740Aue.LIZ(sy4.getContext());
                    C26175APb profileInitData = getProfileInitData();
                    if (profileInitData != null) {
                        str3 = profileInitData.LJLJI;
                    } else {
                        str3 = null;
                    }
                    C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                    if (c9pn != null) {
                        str4 = c9pn.LJFF;
                    } else {
                        str4 = null;
                    }
                    InterfaceC26071ALb interfaceC26071ALb = new InterfaceC26071ALb() { // from class: X.9kL
                        @Override // X.InterfaceC26071ALb
                        public final void LIZ(User user) {
                            C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(UserProfileFollowAssem.this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
                        }
                    };
                    Aweme mAweme2 = getMAweme();
                    if (mAweme2 != null) {
                        awemeRawAd = mAweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C26074ALe.LIZLLL(new C26076ALg(mUser2, LIZ2, "others_homepage", str3, str4, interfaceC26071ALb, "follow_notification", awemeRawAd, null, 1792));
                } else {
                    o.LJIJI("followView");
                    throw null;
                }
            }
            User mUser3 = getMUser();
            if (mUser3 == null) {
                mUser3 = new User();
                C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn2 != null) {
                    str = c9pn2.LIZ;
                } else {
                    str = null;
                }
                mUser3.setUid(str);
                C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn3 != null) {
                    str2 = c9pn3.LIZIZ;
                } else {
                    str2 = null;
                }
                mUser3.setSecUid(str2);
                mUser3.setFollowStatus(followStatus.followStatus);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(IMUser.fromUser(mUser3));
            displayExtraBtn(followStatus.followStatus);
            int i3 = followStatus.followStatus;
            if ((i3 == 1 || i3 == 4) && mUser3.isBlock()) {
                mUser3.setBlock(false);
                ((InterfaceC235089Km) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class), null)).LLJLLIL();
            }
            if (!C52943KqB.LIZ() && (interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57512Mhg.class))) != null) {
                interfaceC57512Mhg.c3(followStatus.followStatus);
            }
            User mUser4 = getMUser();
            if (mUser4 != null && (uid = mUser4.getUid()) != null && (!TextUtils.isEmpty(uid))) {
                if (TextUtils.equals(getMEnterFrom(), "follow_request_page")) {
                    C2U8.LIZ(new IIJ(uid, followStatus.followStatus));
                } else {
                    C9PN c9pn4 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                    if (c9pn4 != null) {
                        str5 = c9pn4.LIZJ;
                    }
                    if (TextUtils.equals(str5, "homepage_friends") && followStatus.followStatus == 0) {
                        C2U8.LIZ(new C70792qB(getMAweme()));
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
        this.mRequestId = event.LJLIL;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        String str;
        C57467Mgx c57467Mgx;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        if (str2 != null) {
            User mUser = getMUser();
            if (mUser != null) {
                str = mUser.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && (c57467Mgx = this.extraBtnHelper) != null) {
                c57467Mgx.LJII().setText(C86V.LJ().getString(R.string.i3_));
                c57467Mgx.LJIIJ();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 55), view.findViewById(R.id.i6x));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 49), view.findViewById(R.id.ce3));
        View findViewById = view.findViewById(R.id.i6x);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.profile_btn_extra)");
        this.followView = (SY4) findViewById;
        SY4 sy4 = (SY4) view.findViewById(R.id.dkf);
        this.followedView = sy4;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 50));
        }
        SY4 sy42 = (SY4) view.findViewById(R.id.ixw);
        C16880lQ.LJJIZ(sy42, new ACListenerS29S0100000_9(this, 51));
        boolean z = C99W.LIZ;
        if (z) {
            sy42.setBackground(null);
            sy42.setButtonVariant(5);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.dkg);
        C16880lQ.LJIJ(relativeLayout, new ACListenerS29S0100000_9(this, 52));
        if (z) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context = relativeLayout.getContext();
            o.LJIIIIZZ(context, "context");
            relativeLayout.setBackground(c110614Vt.LIZ(context));
        }
        View findViewById2 = view.findViewById(R.id.job);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.send_message_btn)");
        SY4 sy43 = (SY4) findViewById2;
        this.sendButtonView = sy43;
        C16880lQ.LJJIZ(sy43, new ACListenerS29S0100000_9(this, 53));
        SY4 sy44 = (SY4) view.findViewById(R.id.ce2);
        if (z) {
            sy44.getClass();
            sy44.setButtonVariant(5);
        }
        C16880lQ.LJJIZ(sy44, new ACListenerS29S0100000_9(this, 54));
        View findViewById3 = view.findViewById(R.id.dkm);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.follow_request_tip)");
        this.followRequestTip = (C188717at) findViewById3;
        this.extraBtnHelper = new C57467Mgx(view);
        buttonRoundCorner();
        buttonPressFeedback();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Ph
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS175S0100000_9(this, 223));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS175S0100000_9(this, 225));
        if (C53177Ktx.LIZ()) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pe
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C9PN) obj).LJIIIZ);
                }
            }, new AqS175S0100000_9(this, 226));
        }
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLILLLLZI;
            }
        }, null, new AqS175S0100000_9(this, 227), null, new AqS170S0100000_4(this, 700), 10, null);
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJI;
            }
        }, null, new AqS170S0100000_4(this, 701), null, new AqS170S0100000_4(this, 702), 10, null);
        C8YN.LJII(this, getUserProfileFollowVM(), new TBT() { // from class: X.MhE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJJI;
            }
        }, null, new AqS191S0100000_9(this, 45), 6);
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            str = c9pn.LIZLLL;
        } else {
            str = null;
        }
        this.mEventType = str;
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9ks
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLIL;
            }
        }, null, C245829ko.LJLIL, 6);
        C57487MhH c57487MhH = C57487MhH.LJLIL;
        Class<UserProfileFollowAssem> cls = UserProfileFollowAssem.class;
        Class<?>[] interfaces = cls.getInterfaces();
        o.LJIIIIZZ(interfaces, "currentClass.interfaces");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : interfaces) {
            if (C8VB.class.isAssignableFrom(cls2)) {
                arrayList.add(cls2);
            }
        }
        while (true) {
            if (arrayList.isEmpty()) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
                Class<?>[] interfaces2 = cls.getInterfaces();
                o.LJIIIIZZ(interfaces2, "currentClass.interfaces");
                arrayList = new ArrayList();
                for (Class<?> cls3 : interfaces2) {
                    if (C8VB.class.isAssignableFrom(cls3)) {
                        arrayList.add(cls3);
                    }
                }
            } else {
                C8VA LIZLLL = getSupervisor().LIZLLL();
                Object LJLLJ = ORZ.LJLLJ(arrayList);
                o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
                LIZLLL.LJI((Class) LJLLJ, c57487MhH);
                break;
            }
        }
        C57467Mgx c57467Mgx = this.extraBtnHelper;
        if (c57467Mgx != null) {
            if (C57469Mgz.LIZJ()) {
                Object value = c57467Mgx.LIZIZ.getValue();
                o.LJIIIIZZ(value, "<get-buttonGroup>(...)");
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimateParentHierarchy(false);
                layoutTransition.disableTransitionType(0);
                layoutTransition.disableTransitionType(1);
                layoutTransition.disableTransitionType(3);
                ((ViewGroup) value).setLayoutTransition(layoutTransition);
            }
            c57467Mgx.LJ().setVisibility(8);
            SY4 LIZ = c57467Mgx.LIZ();
            LIZ.setVisibility(8);
            if (C57469Mgz.LJ()) {
                ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C7MY.LIZIZ(116);
                    LIZ.setLayoutParams(layoutParams);
                    LIZ.setButtonStartIcon(null);
                    LIZ.setText(C86V.LJ().getString(R.string.i3_));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (C57469Mgz.LJFF()) {
                LIZ.setButtonStartIcon(Integer.valueOf(R.raw.icon_paperplane_fill));
            }
        }
        C57467Mgx c57467Mgx2 = this.extraBtnHelper;
        if (c57467Mgx2 != null) {
            C7FA.LIZIZ(c57467Mgx2.LIZLLL());
            C7FA.LIZIZ(c57467Mgx2.LJII());
            C7FA.LIZIZ(c57467Mgx2.LJI());
            C7FA.LIZIZ(c57467Mgx2.LIZ());
        }
    }

    @Override // X.InterfaceC245979l3
    public void showFollowRequestTip(User user) {
        String str;
        GeneralPermission generalPermission;
        if (!TextUtils.equals(getMEnterFrom(), "follow_request_page") || this.mHasShowGuide) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (getContext() == null || LIZ == null || getContainerView() == null || !this._isViewValid || user == null) {
            return;
        }
        User mUser = getMUser();
        if (mUser != null) {
            str = mUser.getUid();
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
            c188717at.setAcceptCallback(new AqS98S0300000_9(this, user, c188717at, 10));
            c188717at.setDeleteCallback(new AqS98S0300000_9(this, user, c188717at, 11));
            c188717at.LIZJ();
            String mEnterFrom = getMEnterFrom();
            if (mEnterFrom == null) {
                mEnterFrom = "";
            }
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            C26335AVf.LJIJJ(mEnterFrom, uid);
            this.mHasShowGuide = true;
            return;
        }
        o.LJIJI("followRequestTip");
        throw null;
    }

    public final void onImClick(String str, String str2) {
        String str3;
        if (getMUser() == null) {
            return;
        }
        getUserProfileFollowVM().ov0(this.mEventType, getMUser(), getMAweme());
        Context context = getContext();
        String str4 = null;
        if (context != null) {
            C225318sp.LJ(getMUser(), EnumC57365MfJ.ENTER_CHAT.getType(), getMEnterFrom(), getFrEventPreviousPage(), null, null, null);
            UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
            User mUser = getMUser();
            C26175APb profileInitData = getProfileInitData();
            if (profileInitData != null) {
                str3 = profileInitData.LJLLLLLL;
            } else {
                str3 = null;
            }
            userProfileFollowVM.mv0(context, mUser, str, str2, str3);
        }
        C57467Mgx c57467Mgx = this.extraBtnHelper;
        if (c57467Mgx != null) {
            User mUser2 = getMUser();
            if (mUser2 != null) {
                str4 = mUser2.getUid();
            }
            c57467Mgx.LJIIIIZZ("click", str4);
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

    public static /* synthetic */ void onImClick$default(UserProfileFollowAssem userProfileFollowAssem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        userProfileFollowAssem.onImClick(str, str2);
    }

    public static /* synthetic */ int getPreviousPageType$default(UserProfileFollowAssem userProfileFollowAssem, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return userProfileFollowAssem.getPreviousPageType(str, str2, bool, str3);
    }
}
