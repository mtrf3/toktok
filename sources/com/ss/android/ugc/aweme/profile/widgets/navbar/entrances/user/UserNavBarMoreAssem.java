package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user;

import X.AV1;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C107794Kx;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C2318698c;
import X.C234529Ii;
import X.C234999Kd;
import X.C245749kg;
import X.C245839kp;
import X.C245899kv;
import X.C245999l5;
import X.C26175APb;
import X.C26227ARb;
import X.C27740Aue;
import X.C29822Bn8;
import X.C31811Ce7;
import X.C33Q;
import X.C3C8;
import X.C47704Ins;
import X.C4LD;
import X.C55096Ljo;
import X.C55749LuL;
import X.C56412MCa;
import X.C56642Ke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C75792yF;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C8YZ;
import X.C9PN;
import X.EnumC235829Ni;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC245979l3;
import X.InterfaceC87065YEz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.Q8U;
import X.QD3;
import X.TBT;
import X.TBW;
import X.UC0;
import X.V16;
import Y.IDCListenerS158S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ICTAFollowMessageAbility;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import yq4.a;

/* loaded from: classes5.dex */
public final class UserNavBarMoreAssem extends ProfileNavIconActionAssem<EnumC235829Ni> implements WeakHandler.IHandler, KPL {
    public static final C245899kv Companion = new Object() { // from class: X.9kv
    };
    public WeakHandler handler;
    public final C55749LuL profileInitData$delegate = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
    public final C214298b3 userProfileBlockVM$delegate;

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        requestDisplayAction();
        this.handler = new WeakHandler(this);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9P9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 732));
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9km
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 178), 6);
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9kk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 45), 6);
    }

    private final void reportText() {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4 = "";
        if (getUser() != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("others_homepage", "others_homepage");
            User user = getUser();
            String str5 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("to_user_id", str);
            FMX.LJIIL("report_user", c188727au.LIZ);
            try {
                m mVar = new m();
                mVar.LJJIIZ("unique_id", AV1.LIZLLL(getUser()));
                User user2 = getUser();
                if (user2 != null) {
                    bool = Boolean.valueOf(user2.isBlock());
                } else {
                    bool = null;
                }
                mVar.LJJIII(bool, "is_blocked");
                User user3 = getUser();
                if (user3 == null || (str3 = user3.getSecUid()) == null) {
                    str3 = "";
                }
                mVar.LJJIIZ("sec_user_id", str3);
                str4 = C75792yF.LIZJ(mVar);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            Uri.Builder builder = new Uri.Builder();
            User user4 = getUser();
            if (user4 != null) {
                str2 = user4.getUid();
            } else {
                str2 = null;
            }
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("owner_id", str2);
            User user5 = getUser();
            if (user5 != null) {
                str5 = user5.getUid();
            }
            a.LJIILLIIL().LIZIZ(C212428Vi.LIZ(this), appendQueryParameter.appendQueryParameter("object_id", str5).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str4));
        }
    }

    public final C26175APb getProfileInitData() {
        return (C26175APb) this.profileInitData$delegate.getValue();
    }

    public final User getUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final UserProfileBlockVM getUserProfileBlockVM() {
        return (UserProfileBlockVM) this.userProfileBlockVM$delegate.getValue();
    }

    public UserNavBarMoreAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileBlockVM.class);
        this.userProfileBlockVM$delegate = new C214298b3(new AqS154S0100000_4(LIZ, 746), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C245839kp.INSTANCE, LIZ);
    }

    private final void blockUser() {
        String str;
        boolean z;
        if (getUser() != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("others_homepage", "others_homepage");
            User user = getUser();
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("to_user_id", str);
            FMX.LJIIL("click_block", c188727au.LIZ);
            User user2 = getUser();
            if (user2 != null && !user2.isBlock()) {
                z = true;
            } else {
                z = false;
            }
            blockUser(!z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r7.isAd() == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendText() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getUser()
            r5 = 0
            if (r0 != 0) goto L32
            com.ss.android.ugc.aweme.profile.model.User r1 = new com.ss.android.ugc.aweme.profile.model.User
            r1.<init>()
            java.lang.Class<X.9Km> r0 = X.InterfaceC235089Km.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIIZZ(r8, r0)
            X.9PN r0 = (X.C9PN) r0
            if (r0 == 0) goto Lce
            java.lang.String r0 = r0.LIZ
        L1c:
            r1.setUid(r0)
            java.lang.Class<X.9Km> r0 = X.InterfaceC235089Km.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIIZZ(r8, r0)
            X.9PN r0 = (X.C9PN) r0
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.LIZIZ
        L2f:
            r1.setSecUid(r0)
        L32:
            java.lang.Class<X.9Km> r0 = X.InterfaceC235089Km.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIIZZ(r8, r0)
            X.9PN r0 = (X.C9PN) r0
            if (r0 == 0) goto Lc8
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.LJI
        L42:
            r2 = 0
            if (r7 == 0) goto Lc6
            boolean r1 = r7.isAd()
            r0 = 1
            if (r1 != r0) goto Lc6
        L4c:
            java.lang.String r4 = "click_stranger_chat_button"
            java.lang.String r3 = "others_homepage"
            if (r0 == 0) goto La1
            X.446 r6 = new X.446
            if (r7 == 0) goto L9b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L9b
            java.lang.String r1 = r0.getLogExtra()
        L60:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L9f
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto L9f
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L70:
            r6.<init>(r1, r0)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r2)
            X.3uH r2 = r0.getImChatService()
            android.content.Context r1 = r8.getContext()
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getUser()
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
        L89:
            X.3tv r0 = new X.3tv
            r0.<init>(r1, r5)
            r0.setImAdLog(r6)
            r0.setEnterFromForMob(r3)
            r0.setEnterMethodForMob(r4)
            r2.LJFF(r0)
        L9a:
            return
        L9b:
            r1 = r5
            if (r7 == 0) goto L9f
            goto L60
        L9f:
            r0 = r5
            goto L70
        La1:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r2)
            X.3uH r2 = r0.getImChatService()
            android.content.Context r1 = r8.getContext()
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getUser()
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
        Lb7:
            X.3tv r0 = new X.3tv
            r0.<init>(r1, r5)
            r0.setEnterFromForMob(r3)
            r0.setEnterMethodForMob(r4)
            r2.LJFF(r0)
            goto L9a
        Lc6:
            r0 = 0
            goto L4c
        Lc8:
            r7 = r5
            goto L42
        Lcb:
            r0 = r5
            goto L2f
        Lce:
            r0 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user.UserNavBarMoreAssem.sendText():void");
    }

    @Override // X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void onReport() {
        String str;
        String str2;
        Aweme aweme;
        if (getUser() == null || C6ZT.LIZ(getActionView())) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        User user = getUser();
        if (user != null && user.isSecret()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_private_profile", str);
        FMX.LJIIL("click_more_action", c188727au.LIZ);
        InterfaceC87065YEz interfaceC87065YEz = (InterfaceC87065YEz) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC87065YEz.class));
        List<Aweme> list = null;
        if (interfaceC87065YEz != null) {
            list = interfaceC87065YEz.LLLIIIL();
        }
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn == null || (aweme = c9pn.LJI) == null || (str2 = aweme.getGroupId()) == null) {
            str2 = "";
        }
        WeakHandler weakHandler = this.handler;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        User user2 = getUser();
        if (user2 == null || user2.getShareInfo() == null) {
            return;
        }
        C4LD.LIZ.LIZIZ(weakHandler, LIZ, user2, list, str2);
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public EnumC235829Ni getActionType() {
        return EnumC235829Ni.More;
    }

    private final void blockUser(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (z) {
            UserProfileBlockVM userProfileBlockVM = getUserProfileBlockVM();
            User user = getUser();
            if (user != null) {
                str3 = user.getUid();
            } else {
                str3 = null;
            }
            User user2 = getUser();
            if (user2 != null) {
                str4 = user2.getSecUid();
            } else {
                str4 = null;
            }
            userProfileBlockVM.gv0(0, str3, str4);
            User user3 = getUser();
            if (user3 != null) {
                str5 = user3.getUid();
            }
            V16.LJJLJLI("others_homepage", str5);
            C245999l5.LIZIZ("unblock");
            return;
        }
        IDCListenerS158S0100000_4 iDCListenerS158S0100000_4 = new IDCListenerS158S0100000_4(this, 9);
        Context context = getContext();
        if (context == null) {
            return;
        }
        String LIZ = C29822Bn8.LIZ(context, R.string.a7i, "it.resources.getString(R…ience_block_popup_header)");
        Object[] objArr = new Object[2];
        User user4 = getUser();
        if (user4 != null) {
            str = user4.getUniqueId();
        } else {
            str = null;
        }
        objArr[0] = str;
        User user5 = getUser();
        if (user5 != null) {
            str2 = user5.getNickname();
        } else {
            str2 = null;
        }
        objArr[1] = str2;
        String LIZIZ = Q8U.LIZIZ(objArr, 2, LIZ, "format(format, *args)");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(LIZIZ);
        c26227ARb.LIZ(R.string.a7h);
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4(iDCListenerS158S0100000_4, 731));
        c26227ARb.LJI().LIZLLL();
        User user6 = getUser();
        if (user6 != null) {
            str5 = user6.getUid();
        }
        V16.LJFF("others_homepage", str5, "");
        C245999l5.LIZIZ("block");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i == 50) {
            reportText();
            return;
        }
        if (i == 53) {
            sendText();
            return;
        }
        if (i == 54 || i == 55) {
            blockUser();
            return;
        }
        if (i != 56) {
            return;
        }
        if (C2318698c.LIZIZ()) {
            ICTAFollowMessageAbility iCTAFollowMessageAbility = (ICTAFollowMessageAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICTAFollowMessageAbility.class, null);
            if (iCTAFollowMessageAbility == null) {
                return;
            }
            iCTAFollowMessageAbility.removeFollower();
            return;
        }
        InterfaceC245979l3 interfaceC245979l3 = (InterfaceC245979l3) C8VC.LJFF(this, C65352Pkq.LIZ(InterfaceC245979l3.class), null);
        if (interfaceC245979l3 == null) {
            return;
        }
        interfaceC245979l3.removeFollower();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public void initNavAction(C234529Ii navAction) {
        o.LJIIIZ(navAction, "navAction");
        updateNavActionIcon(navAction);
        navAction.LIZIZ(new AqS154S0100000_4(this, 745));
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("user", event.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(getContext(), getActionView(), event);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        try {
            if (TextUtils.equals("userBlockSuccess", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                BlockStruct blockStruct = new BlockStruct();
                blockStruct.blockStatus = 1;
                UserProfileBlockVM userProfileBlockVM = getUserProfileBlockVM();
                userProfileBlockVM.getClass();
                userProfileBlockVM.setState(new AqS170S0100000_4(blockStruct, 1056));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUser(C245749kg event) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(event, "event");
        String str4 = event.LJLIL;
        User user = getUser();
        String str5 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str4, str)) {
            String str6 = event.LJLILLLLZI;
            User user2 = getUser();
            if (user2 != null) {
                str2 = user2.getSecUid();
            } else {
                str2 = null;
            }
            if (o.LJ(str6, str2)) {
                UserProfileBlockVM userProfileBlockVM = getUserProfileBlockVM();
                User user3 = getUser();
                if (user3 != null) {
                    str3 = user3.getUid();
                } else {
                    str3 = null;
                }
                User user4 = getUser();
                if (user4 != null) {
                    str5 = user4.getSecUid();
                }
                userProfileBlockVM.gv0(0, str3, str5);
            }
        }
    }

    public final void showToast(String str) {
        Activity LIZ = C27740Aue.LIZ(getContext());
        if (LIZ != null) {
            C31811Ce7.LIZIZ(LIZ, str);
        }
    }

    public final C234529Ii updateNavActionIcon(C234529Ii c234529Ii) {
        int i;
        C2068389v c2068389v = new C2068389v();
        if (e1.LIZ(31744, "profile_qr_code_share", true, false)) {
            i = R.raw.icon_arrow_turn_up_right;
        } else {
            i = R.raw.icon_ellipsis_vertical;
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c234529Ii.LIZ(c2068389v);
        return c234529Ii;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void withStateSafe(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw asyncSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
