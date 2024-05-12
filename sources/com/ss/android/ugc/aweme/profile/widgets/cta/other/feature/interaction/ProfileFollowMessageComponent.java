package com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction;

import X.ALX;
import X.AV1;
import X.ActivityC45651qj;
import X.C107724Kq;
import X.C16880lQ;
import X.C188717at;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221038lv;
import X.C221108m2;
import X.C225318sp;
import X.C227768wm;
import X.C2318698c;
import X.C234999Kd;
import X.C235079Kl;
import X.C245349k2;
import X.C245819kn;
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
import X.C32151Nz;
import X.C36821Ecj;
import X.C38293F1d;
import X.C38333F2r;
import X.C3BA;
import X.C3U3;
import X.C40883G2t;
import X.C41424GNo;
import X.C44384HbQ;
import X.C47704Ins;
import X.C52943KqB;
import X.C53177Ktx;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C57285Me1;
import X.C57293Me9;
import X.C57368MfM;
import X.C57463Mgt;
import X.C57465Mgv;
import X.C57469Mgz;
import X.C57470Mh0;
import X.C57481MhB;
import X.C57486MhG;
import X.C57488MhI;
import X.C57491MhL;
import X.C57504MhY;
import X.C59522Vg;
import X.C59955Nfz;
import X.C5H3;
import X.C5S1;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C70622pu;
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
import X.C8VA;
import X.C8VB;
import X.C8VC;
import X.C8YN;
import X.C9I2;
import X.C9IF;
import X.C9PN;
import X.EF7;
import X.EnumC234329Ho;
import X.EnumC57365MfJ;
import X.EnumC57387Mff;
import X.FMX;
import X.IIJ;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC245979l3;
import X.InterfaceC26071ALb;
import X.InterfaceC57106Mb8;
import X.InterfaceC57508Mhc;
import X.InterfaceC57511Mhf;
import X.InterfaceC57512Mhg;
import X.InterfaceC87065YEz;
import X.J9P;
import X.KMP;
import X.LO7;
import X.LSC;
import X.M9F;
import X.O6R;
import X.ORZ;
import X.Q7L;
import X.Q8U;
import X.QD3;
import X.TBT;
import X.UC0;
import X.XKX;
import Y.AObserverS77S0100000_9;
import Y.IDCListenerS161S0100000_9;
import Y.IDgS349S0100000_9;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
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
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility;
import com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ProfileFollowMessageComponent;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
import ujb.s;

/* loaded from: classes10.dex */
public final class ProfileFollowMessageComponent extends Hilt_ProfileFollowMessageComponent implements InterfaceC245979l3, WeakHandler.IHandler, ICTAFollowMessageAbility {
    public C188717at LJLJI;
    public C57465Mgv LJLJJI;
    public final C214298b3 LJLJJLL;
    public final C214298b3 LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public LiveData<ActivityStatus> LJLLLLLL;
    public User LJLZ;
    public int LJZ;
    public long LJZI;
    public Map<Integer, View> LJZL = new LinkedHashMap();
    public final C55749LuL LJLJJL = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LJZL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJZL;
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

    public ProfileFollowMessageComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileFollowVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 517);
        C57463Mgt c57463Mgt = C57463Mgt.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        this.LJLJJLL = new C214298b3(aqS159S0100000_9, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), c57463Mgt, LIZ);
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserProfileBlockVM.class);
        this.LJLJL = new C214298b3(new AqS159S0100000_9(LIZ2, 518), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C57491MhL.INSTANCE, LIZ2);
        this.LJLL = true;
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 516));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 515));
        this.LJZ = -1;
    }

    private final C26175APb getProfileInitData() {
        return (C26175APb) this.LJLJJL.getValue();
    }

    private final Boolean isVisible() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return Boolean.valueOf(c9pn.LJIIIZ);
        }
        return null;
    }

    private final Aweme x3() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJI;
        }
        return null;
    }

    public final void checkRequestedFail() {
        String str;
        Resources resources;
        String string;
        Resources resources2;
        C41424GNo c41424GNo = new C41424GNo(getContext());
        String[] strArr = new String[2];
        Context context = getContext();
        String str2 = "";
        if (context == null || (resources2 = context.getResources()) == null || (str = resources2.getString(R.string.cgi)) == null) {
            str = "";
        }
        strArr[0] = str;
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.cgj)) != null) {
            str2 = string;
        }
        strArr[1] = str2;
        c41424GNo.LIZ(strArr, new IDCListenerS161S0100000_9(this, 0));
        c41424GNo.LIZIZ();
    }

    @Override // X.C8VB
    public C57470Mh0 defaultObservableData() {
        return new C57470Mh0(null);
    }

    public final void followImpl() {
        Integer num;
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        int i3;
        HashMap hashMap;
        InterfaceC57512Mhg interfaceC57512Mhg;
        Aweme x3;
        String str8;
        Long l;
        Long l2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        User author;
        String str9;
        int i4;
        String str10;
        int i5;
        C57465Mgv c57465Mgv = this.LJLJJI;
        Integer num2 = null;
        if (c57465Mgv != null) {
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
            C57465Mgv.LIZIZ(i4, curUser2, str10, true);
            User curUser4 = getCurUser();
            User curUser5 = getCurUser();
            if (curUser5 != null) {
                i5 = curUser5.getFollowStatus();
            } else {
                i5 = 0;
            }
            c57465Mgv.LJFF(i5, curUser4, true);
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
        String valueOf = String.valueOf(((InterfaceC87065YEz) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC87065YEz.class), null)).m9());
        LO7 lo7 = LO7.LIZIZ;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn == null || (str2 = c9pn.LIZLLL) == null) {
            str2 = "";
        }
        if (lo7.J1(str2) && TextUtils.isEmpty(getFromSearch())) {
            C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn2 != null) {
                str9 = c9pn2.LIZLLL;
            } else {
                str9 = null;
            }
            this.LJLLI = str9;
        }
        getUserProfileFollowVM().rv0(x3(), getCurUser(), getContext(), LJZ, this.LJLLILLLL, this.LJLLI, valueOf);
        C57465Mgv c57465Mgv2 = this.LJLJJI;
        if (c57465Mgv2 != null) {
            c57465Mgv2.LJIJI = true;
        }
        this.LJZI = System.currentTimeMillis();
        this.LJZ = nextFollowStatus;
        C2U8.LIZ(new C31633CbF(nextFollowStatus, getCurUser()));
        displayExtraBtn(nextFollowStatus);
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
            num2 = Integer.valueOf(curUser11.getFollowerStatus());
        }
        String str11 = null;
        LJFF.postValue(new RelationStatus(str3, nextFollowStatus, num2, null, null, 24, null));
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
        C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn3 != null) {
            str4 = c9pn3.LIZJ;
        } else {
            str4 = null;
        }
        C9PN c9pn4 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn4 != null) {
            str5 = c9pn4.LIZLLL;
        } else {
            str5 = null;
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        ALX alx = new ALX();
        User curUser12 = getCurUser();
        if (curUser12 != null) {
            str6 = curUser12.getUid();
        } else {
            str6 = null;
        }
        alx.LIZJ(str6);
        User curUser13 = getCurUser();
        if (curUser13 != null) {
            str7 = curUser13.getSecUid();
        } else {
            str7 = null;
        }
        alx.LIZIZ(str7);
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LIZJ = i2;
        c57285Me1.LJFF = "others_homepage";
        c57285Me1.LIZLLL = 19;
        Aweme x32 = x3();
        if (x32 != null && (author = x32.getAuthor()) != null) {
            bool = Boolean.valueOf(C221038lv.LIZ(author));
        } else {
            bool = null;
        }
        alx.LIZ.LJ = getPreviousPageType(str4, str5, bool, getEnterMethod());
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
        if (x3() != null && (x3 = x3()) != null && x3.isAd()) {
            Context context2 = getContext();
            if (context2 != null) {
                Aweme x33 = x3();
                if (x33 != null && (awemeRawAd3 = x33.getAwemeRawAd()) != null) {
                    str8 = awemeRawAd3.getLogExtra();
                } else {
                    str8 = null;
                }
                Aweme x34 = x3();
                if (x34 != null && (awemeRawAd2 = x34.getAwemeRawAd()) != null) {
                    l = awemeRawAd2.getAdId();
                } else {
                    l = null;
                }
                String valueOf2 = String.valueOf(l);
                Aweme x35 = x3();
                if (x35 != null && (awemeRawAd = x35.getAwemeRawAd()) != null) {
                    l2 = awemeRawAd.getCreativeId();
                } else {
                    l2 = null;
                }
                String valueOf3 = String.valueOf(l2);
                hashMap = new HashMap();
                C59955Nfz.LIZ(context2, str8, valueOf2, valueOf3, hashMap);
            } else {
                hashMap = null;
            }
        } else {
            hashMap = new HashMap();
            C59955Nfz.LIZIZ(null, str4, hashMap);
        }
        alx.LIZ.LJIIJJI = hashMap;
        User curUser15 = getCurUser();
        if (curUser15 != null) {
            str11 = curUser15.getAccurateRecType();
        }
        alx.LIZ.LJIILL = str11;
        C57285Me1 params = alx.LIZ();
        userProfileFollowVM.getClass();
        o.LJIIIZ(params, "params");
        userProfileFollowVM.withState(new AqS140S0200000_9(userProfileFollowVM, params, 95));
        if (C52943KqB.LIZ() && (interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57512Mhg.class))) != null) {
            interfaceC57512Mhg.c3(this.LJZ);
        }
    }

    public final M9F getActivityStatusProfileLifecycleOwner() {
        return (M9F) this.LJLLLL.getValue();
    }

    public final User getCurUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final C107724Kq getParamsBuilder() {
        return (C107724Kq) this.LJLLL.getValue();
    }

    public final UserProfileBlockVM getUserProfileBlockVM() {
        return (UserProfileBlockVM) this.LJLJL.getValue();
    }

    public final UserProfileFollowVM getUserProfileFollowVM() {
        return (UserProfileFollowVM) this.LJLJJLL.getValue();
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.Hilt_ProfileFollowMessageComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        C9I2 c9i2;
        C9I2 c9i22;
        String str;
        ViewGroup viewGroup;
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C3();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        ViewParent viewParent = null;
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ICTAFollowMessageAbility.class, null);
        }
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            c9i2 = profileCTAAbility.me0(C9IF.FOLLOW);
        } else {
            c9i2 = null;
        }
        this.LJLJLJ = c9i2;
        ProfileCTAAbility profileCTAAbility2 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility2 != null) {
            c9i22 = profileCTAAbility2.me0(C9IF.MESSAGE);
        } else {
            c9i22 = null;
        }
        this.LJLJLLL = c9i22;
        ProfileCTAAbility profileCTAAbility3 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility3 != null) {
            profileCTAAbility3.gp0(C9IF.FOLLOW, null);
        }
        ProfileCTAAbility profileCTAAbility4 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility4 != null) {
            profileCTAAbility4.gp0(C9IF.MESSAGE, null);
        }
        this.LJLJJI = new C57465Mgv(this.LJLJLJ, this.LJLJLLL, (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Pg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS175S0100000_9(this, 210));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Pb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C234999Kd) obj).LIZJ);
            }
        }, new AqS175S0100000_9(this, 211));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9PZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS175S0100000_9(this, 200));
        if (C53177Ktx.LIZ()) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pd
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C9PN) obj).LJIIIZ);
                }
            }, new AqS175S0100000_9(this, 202));
        }
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLILLLLZI;
            }
        }, null, new AqS175S0100000_9(this, 209), null, new AqS170S0100000_4(this, 684), 10, null);
        AssemViewModel.asyncSubscribe$default(getUserProfileFollowVM(), new TBT() { // from class: X.Mh4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJI;
            }
        }, null, new AqS170S0100000_4(this, 685), null, new AqS170S0100000_4(this, 686), 10, null);
        C8YN.LJII(this, getUserProfileFollowVM(), new TBT() { // from class: X.MhD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57376MfU) obj).LJLJJI;
            }
        }, null, new AqS191S0100000_9(this, 44), 6);
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            str = c9pn.LIZLLL;
        } else {
            str = null;
        }
        this.LJLLI = str;
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9kr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLIL;
            }
        }, null, C245819kn.LJLIL, 6);
        C57486MhG c57486MhG = C57486MhG.LJLIL;
        Class<ProfileFollowMessageComponent> cls = ProfileFollowMessageComponent.class;
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
                C8VA LIZLLL2 = getSupervisor().LIZLLL();
                Object LJLLJ = ORZ.LJLLJ(arrayList);
                o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
                LIZLLL2.LJI((Class) LJLLJ, c57486MhG);
                break;
            }
        }
        C57465Mgv c57465Mgv = this.LJLJJI;
        if (c57465Mgv != null) {
            if (C57469Mgz.LIZJ() && (!C2318698c.LIZIZ() || C2318698c.LIZJ())) {
                View view = c57465Mgv.LIZ;
                if (view != null) {
                    viewParent = view.getParent();
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
            new LinkedHashMap().put(C9IF.FOLLOW, 0);
            new LinkedHashMap().put(C9IF.MESSAGE, 1);
            View view2 = c57465Mgv.LIZIZ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            c57465Mgv.LJIILIIL.getClass();
            c57465Mgv.LIZJ(100);
            c57465Mgv.LJIIL.getClass();
            c57465Mgv.LIZLLL(6, 8);
            if (C57469Mgz.LJ()) {
                C57481MhB c57481MhB = c57465Mgv.LJIIL;
                O6R.LJJIIZ(C32151Nz.LJIIZILJ(116));
                c57481MhB.getClass();
                c57465Mgv.LJIIL.LIZLLL = C44384HbQ.LJJZ(R.string.i3_);
            } else if (C57469Mgz.LJFF()) {
                c57465Mgv.LJIIL.LIZJ = Integer.valueOf(R.raw.icon_paperplane_fill);
            }
        }
        C57465Mgv c57465Mgv2 = this.LJLJJI;
        if (c57465Mgv2 != null) {
            View view3 = c57465Mgv2.LIZ;
            if (view3 != null) {
                C7FA.LIZIZ(view3);
            }
            View view4 = c57465Mgv2.LIZIZ;
            if (view4 != null) {
                C7FA.LIZIZ(view4);
            }
        }
    }

    private final void C3() {
        ProfileCTAAbility profileCTAAbility = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility != null) {
            profileCTAAbility.TX(EnumC234329Ho.TEXT, C9IF.FOLLOW, C65352Pkq.LIZ(ProfileFollowMessageComponent.class));
        }
        ProfileCTAAbility profileCTAAbility2 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility2 != null) {
            profileCTAAbility2.TX(EnumC234329Ho.TEXT, C9IF.MESSAGE, C65352Pkq.LIZ(ProfileFollowMessageComponent.class));
        }
        ProfileCTAAbility profileCTAAbility3 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility3 != null) {
            profileCTAAbility3.Lq(C9IF.FOLLOW, null, null, new AqS175S0100000_9(this, 206));
        }
        ProfileCTAAbility profileCTAAbility4 = (ProfileCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileCTAAbility.class, null);
        if (profileCTAAbility4 != null) {
            profileCTAAbility4.Lq(C9IF.MESSAGE, null, null, new AqS175S0100000_9(this, 207));
        }
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

    private final void newAuthDialogCenter() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LIZ), C78613UtF.LIZJ, null, new C70622pu(LIZ, null), 2);
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
                UC0.LIZJ(LIZ, C57488MhI.LJLIL);
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
        if (curUser2 == null || (uid = curUser2.getUid()) == null || !o.LJ(isVisible(), Boolean.TRUE) || o.LJ(this.LJLZ, getCurUser())) {
            return;
        }
        this.LJLZ = getCurUser();
        if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF() && (curUser = getCurUser()) != null && curUser.getFollowStatus() == 2) {
            return;
        }
        LiveData<ActivityStatus> liveData = this.LJLLLLLL;
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
        LJIIJJI.observe(activityStatusProfileLifecycleOwner2, new AObserverS77S0100000_9(this, 36));
        this.LJLLLLLL = LJIIJJI;
    }

    public final void checkBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.bl7, R.string.bl8);
            UC0.LIZJ(LIZLLL, new AqS175S0100000_9(this, 201));
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
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 683));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void checkDoubleCancelFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.tcl);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 203));
            LIZ.LJI().LIZLLL();
        }
    }

    public final void checkLoginFail() {
        String str;
        String str2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str3 = this.LJLLI;
        if (str3 == null) {
            str3 = "";
        }
        C40883G2t c40883G2t = new C40883G2t();
        Aweme x3 = x3();
        String str4 = null;
        if (x3 != null) {
            str = x3.getAid();
        } else {
            str = null;
        }
        c40883G2t.LIZLLL("group_id", str);
        Aweme x32 = x3();
        if (x32 != null) {
            str2 = x32.getAuthorUid();
        } else {
            str2 = null;
        }
        c40883G2t.LIZLLL("author_id", str2);
        Aweme x33 = x3();
        if (x33 != null) {
            str4 = x33.getAid();
        }
        c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str4));
        J9P.LIZIZ(LIZ, str3, "click_follow", (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(this, 2));
    }

    public final void checkTemporaryBanFail() {
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.bl_);
            UC0.LIZJ(LIZ, new AqS175S0100000_9(this, 204));
            LIZ.LJI().LIZLLL();
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        User curUser = getCurUser();
        userProfileFollowVM.getClass();
        UserProfileFollowVM.uv0(curUser);
    }

    public final String getEnterFrom() {
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null) {
            return profileInitData.LJLJI;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C55096Ljo.LJIILL(C55096Ljo.LJIIZILJ(this), ICTAFollowMessageAbility.class, null);
    }

    @Override // X.InterfaceC245979l3, com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ICTAFollowMessageAbility
    public void removeFollower() {
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
            UC0.LIZJ(c26227ARb, new AqS175S0100000_9(this, 205));
            c26227ARb.LJI().LIZLLL();
        }
        if (TextUtils.equals(getEnterFrom(), "follow_request_page") && this.LJLLJ) {
            C188717at c188717at = this.LJLJI;
            if (c188717at != null) {
                if (c188717at.LJLJJI && (curUser = getCurUser()) != null && curUser.isBlock) {
                    C188717at c188717at2 = this.LJLJI;
                    if (c188717at2 != null) {
                        c188717at2.LIZIZ();
                        User curUser2 = getCurUser();
                        if (curUser2 == null || (str = curUser2.getUid()) == null) {
                            str = "";
                        }
                        C2U8.LIZ(new IIJ(str, -101));
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
        User curUser = getCurUser();
        if (curUser != null && curUser.getFollowStatus() == i) {
            return;
        }
        User curUser2 = getCurUser();
        if (curUser2 != null) {
            curUser2.setFollowStatus(i);
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), getCurUser(), null, false, 6);
    }

    public final void E3(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        User curUser = getCurUser();
        if (curUser == null || (str2 = curUser.getUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("profile_unfollow_recomfirm_popup", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x027a, code lost:
    
        if (r11.LJII(r0) == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x027e, code lost:
    
        r13 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
        r11 = r10.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r11, "user.uid");
        r13.LJ(r10.getFollowerStatus(), r11, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x027c, code lost:
    
        if (r16 != false) goto L449;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void displayExtraBtn(int r18) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ProfileFollowMessageComponent.displayExtraBtn(int):void");
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
        if (AV1.LJIIJJI()) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.cq5);
            c5s1.LJ();
        } else {
            if (!TextUtils.isEmpty(getFromSearch())) {
                this.LJLLI = getFromSearch();
            }
            getUserProfileFollowVM().gv0(EnumC57387Mff.START);
        }
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
                    if (System.currentTimeMillis() - this.LJZI <= 50 && curUser.getFollowStatus() != this.LJZ) {
                        return;
                    }
                    displayExtraBtn(curUser.getFollowStatus());
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
        Aweme x3 = x3();
        if (x3 != null && (awemeRawAd = x3.getAwemeRawAd()) != null) {
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
            c87030YDq.showCaptchaDialog(fragmentManager, (C38333F2r) e, new C57504MhY());
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
        if (System.currentTimeMillis() - this.LJZI > 50 || followStatus.followStatus == this.LJZ) {
            displayExtraBtn(followStatus.followStatus);
        }
        InterfaceC57508Mhc interfaceC57508Mhc = (InterfaceC57508Mhc) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57508Mhc.class));
        if (interfaceC57508Mhc != null) {
            interfaceC57508Mhc.Z7(followStatus);
        }
    }

    @Override // X.InterfaceC245979l3
    public void onFollowSuccess(FollowStatus followStatus) {
        ActivityC45651qj LIZ;
        INoticeService LJJJJJ;
        String str;
        String uid;
        InterfaceC57512Mhg interfaceC57512Mhg;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd2;
        if (followStatus != null) {
            int i = followStatus.followStatus;
            if (i == 1 || i == 2) {
                User curUser = getCurUser();
                if (curUser != null) {
                    curUser.setBlock(false);
                }
                this.LJLL = true;
                C225318sp.LJ(getCurUser(), EnumC57365MfJ.PROFILE_FOLLOW.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            int i2 = followStatus.followStatus;
            if ((i2 == 1 || i2 == 2 || i2 == 4) && (LIZ = C212428Vi.LIZ(this)) != null && (LJJJJJ = NoticeServiceImpl.LJJJJJ()) != null) {
                LJJJJJ.LJJJJI(LIZ, new GuideOutPushParam("others_homepage", (String) null, "follow", (String) null, 21));
            }
            if (followStatus.followStatus == 0) {
                C225318sp.LJ(getCurUser(), EnumC57365MfJ.PROFILE_FOLLOW_CANCEL.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            }
            Aweme x3 = x3();
            if (x3 != null && (awemeRawAd = x3.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
                User curUser2 = getCurUser();
                Activity LIZ2 = C27740Aue.LIZ(getContext());
                C26175APb profileInitData = getProfileInitData();
                if (profileInitData != null) {
                    str4 = profileInitData.LJLJI;
                } else {
                    str4 = null;
                }
                C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn != null) {
                    str5 = c9pn.LJFF;
                } else {
                    str5 = null;
                }
                InterfaceC26071ALb interfaceC26071ALb = new InterfaceC26071ALb() { // from class: X.9kK
                    @Override // X.InterfaceC26071ALb
                    public final void LIZ(User user) {
                        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(ProfileFollowMessageComponent.this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
                    }
                };
                Aweme x32 = x3();
                if (x32 != null) {
                    awemeRawAd2 = x32.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C26074ALe.LIZLLL(new C26076ALg(curUser2, LIZ2, "others_homepage", str4, str5, interfaceC26071ALb, "follow_notification", awemeRawAd2, null, 1792));
            }
            User curUser3 = getCurUser();
            if (curUser3 == null) {
                curUser3 = new User();
                C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn2 != null) {
                    str2 = c9pn2.LIZ;
                } else {
                    str2 = null;
                }
                curUser3.setUid(str2);
                C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn3 != null) {
                    str3 = c9pn3.LIZIZ;
                } else {
                    str3 = null;
                }
                curUser3.setSecUid(str3);
                curUser3.setFollowStatus(followStatus.followStatus);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIJJLI(IMUser.fromUser(curUser3));
            if (System.currentTimeMillis() - this.LJZI > 50 || followStatus.followStatus == this.LJZ) {
                displayExtraBtn(followStatus.followStatus);
            }
            int i3 = followStatus.followStatus;
            if ((i3 == 1 || i3 == 4) && curUser3.isBlock()) {
                curUser3.setBlock(false);
                str = null;
                ((InterfaceC235089Km) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class), null)).LLJLLIL();
            } else {
                str = null;
            }
            if (!C52943KqB.LIZ() && (interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57512Mhg.class))) != null) {
                interfaceC57512Mhg.c3(followStatus.followStatus);
            }
            User curUser4 = getCurUser();
            if (curUser4 != null && (uid = curUser4.getUid()) != null && (!TextUtils.isEmpty(uid))) {
                if (TextUtils.equals(getEnterFrom(), "follow_request_page")) {
                    C2U8.LIZ(new IIJ(uid, followStatus.followStatus));
                } else {
                    C9PN c9pn4 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                    if (c9pn4 != null) {
                        str = c9pn4.LIZJ;
                    }
                    if (TextUtils.equals(str, "homepage_friends") && followStatus.followStatus == 0) {
                        C2U8.LIZ(new C70792qB(x3()));
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
        this.LJLLILLLL = event.LJLIL;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        String str;
        C57465Mgv c57465Mgv;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        if (str2 != null) {
            User curUser = getCurUser();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && (c57465Mgv = this.LJLJJI) != null) {
                c57465Mgv.LJIIJJI.LIZJ = C44384HbQ.LJJZ(R.string.i3_);
                c57465Mgv.LJ();
            }
        }
    }

    @Override // X.InterfaceC245979l3
    public void showFollowRequestTip(User user) {
        String str;
        GeneralPermission generalPermission;
        if (!TextUtils.equals(getEnterFrom(), "follow_request_page") || this.LJLLJ) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (getContext() == null || LIZ == null || getContainerView() == null || !this._isViewValid || user == null) {
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
        C188717at c188717at = this.LJLJI;
        if (c188717at != null) {
            c188717at.LIZLLL(user);
            c188717at.setAcceptCallback(new AqS98S0300000_9(this, user, c188717at, 8));
            c188717at.setDeleteCallback(new AqS98S0300000_9(this, user, c188717at, 9));
            c188717at.LIZJ();
            String enterFrom = getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            C26335AVf.LJIJJ(enterFrom, uid);
            this.LJLLJ = true;
            return;
        }
        o.LJIJI("followRequestTip");
        throw null;
    }

    public final SpannableString v3(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), s.LJJLIIIJL(str, " ", 0, false, 6) + 1, str.length() - 1, 33);
        return spannableString;
    }

    public final void onImClick(String str, String str2) {
        String str3;
        if (getCurUser() == null) {
            return;
        }
        UserProfileFollowVM userProfileFollowVM = getUserProfileFollowVM();
        Aweme x3 = x3();
        userProfileFollowVM.ov0(this.LJLLI, getCurUser(), x3);
        Context context = getContext();
        if (context != null) {
            C225318sp.LJ(getCurUser(), EnumC57365MfJ.ENTER_CHAT.getType(), getEnterFrom(), getFrEventPreviousPage(), null, null, null);
            getUserProfileFollowVM().mv0(context, getCurUser(), str, str2, null);
        }
        C57465Mgv c57465Mgv = this.LJLJJI;
        if (c57465Mgv != null) {
            User curUser = getCurUser();
            if (curUser != null) {
                str3 = curUser.getUid();
            } else {
                str3 = null;
            }
            c57465Mgv.LIZ("click", str3);
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

    public static /* synthetic */ void F3(ProfileFollowMessageComponent profileFollowMessageComponent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        profileFollowMessageComponent.onImClick(str, str2);
    }

    public static /* synthetic */ int A3(ProfileFollowMessageComponent profileFollowMessageComponent, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return profileFollowMessageComponent.getPreviousPageType(str, str2, bool, str3);
    }
}
