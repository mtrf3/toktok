package com.ss.android.ugc.profile.platform.business.navbar.business.other;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C107794Kx;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C234159Gx;
import X.C234529Ii;
import X.C237429Tm;
import X.C245729ke;
import X.C245739kf;
import X.C245759kh;
import X.C26175APb;
import X.C27740Aue;
import X.C31811Ce7;
import X.C47704Ins;
import X.C4LD;
import X.C55096Ljo;
import X.C55749LuL;
import X.C56642Ke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C75792yF;
import X.C78926UyI;
import X.C8YN;
import X.C9H0;
import X.C9PM;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.QD3;
import X.TBT;
import android.app.Activity;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.ICTASocialInteractionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NavBarMoreData;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import yq4.a;

/* loaded from: classes5.dex */
public final class NavBarMoreComponent extends NavbarBaseUIComponent<NavBarMoreData> implements WeakHandler.IHandler {
    public static final C245759kh Companion = new Object() { // from class: X.9kh
    };
    public WeakHandler handler;
    public final C214298b3 userProfileBlockVM$delegate;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C234529Ii moreIconAction = new C234529Ii();
    public final C55749LuL profileInitData$delegate = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsAfterUpdateUI() {
        C9H0 c9h0;
        super.actionsAfterUpdateUI();
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, this.index, this.moreIconAction, uniqueId());
            }
        }
        EventBus.LIZJ().LJIILJJIL(this);
        this.handler = new WeakHandler(this);
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9kl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLIL;
            }
        }, null, C245729ke.LJLIL, 6);
        C8YN.LJII(this, getUserProfileBlockVM(), new TBT() { // from class: X.9kj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245849kq) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 49), 6);
    }

    public NavBarMoreComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileBlockVM.class);
        this.userProfileBlockVM$delegate = new C214298b3(new AqS154S0100000_4(LIZ, 971), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C245739kf.INSTANCE, LIZ);
    }

    public final C26175APb getProfileInitData() {
        return (C26175APb) this.profileInitData$delegate.getValue();
    }

    public final UserProfileBlockVM getUserProfileBlockVM() {
        return (UserProfileBlockVM) this.userProfileBlockVM$delegate.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public AbstractC234519Ih initNavBarAction() {
        C234529Ii c234529Ii = this.moreIconAction;
        updateNavActionIcon(c234529Ii);
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 970));
        return super.initNavBarAction();
    }

    private final void blockUser() {
        String str;
        boolean z;
        UserRelationInfo userRelationInfo;
        Boolean isBlocking;
        UserProfileInfo userProfileInfo;
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
            str = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("others_homepage", "others_homepage");
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("click_block", c188727au.LIZ);
        if (commonInfo != null && (userRelationInfo = commonInfo.getUserRelationInfo()) != null && (isBlocking = userRelationInfo.isBlocking()) != null) {
            z = isBlocking.booleanValue();
        } else {
            z = false;
        }
        blockUser(z);
    }

    private final void reportText() {
        String str;
        m mVar;
        String str2;
        String str3;
        UserRelationInfo userRelationInfo;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        ProfileCommonInfo commonInfo = getCommonInfo();
        String str4 = "";
        if (commonInfo == null || (userProfileInfo2 = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo2.getUid()) == null) {
            str = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("others_homepage", "others_homepage");
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("report_user", c188727au.LIZ);
        try {
            mVar = new m();
            Boolean bool = null;
            if (commonInfo != null && (userProfileInfo = commonInfo.getUserProfileInfo()) != null) {
                str2 = userProfileInfo.getUsername();
            } else {
                str2 = null;
            }
            mVar.LJJIIZ("unique_id", str2);
            if (commonInfo != null && (userRelationInfo = commonInfo.getUserRelationInfo()) != null) {
                bool = userRelationInfo.isBlocking();
            }
            mVar.LJJIII(bool, "is_blocked");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (commonInfo != null) {
            UserProfileInfo userProfileInfo3 = commonInfo.getUserProfileInfo();
            if (userProfileInfo3 != null) {
                str3 = userProfileInfo3.getSecUid();
                if (str3 == null) {
                }
                mVar.LJJIIZ("sec_user_id", str3);
                str4 = C75792yF.LIZJ(mVar);
                a.LJIILLIIL().LIZIZ(C212428Vi.LIZ(this), new Uri.Builder().appendQueryParameter("owner_id", str).appendQueryParameter("object_id", str).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str4));
            }
        }
        str3 = "";
        mVar.LJJIIZ("sec_user_id", str3);
        str4 = C75792yF.LIZJ(mVar);
        a.LJIILLIIL().LIZIZ(C212428Vi.LIZ(this), new Uri.Builder().appendQueryParameter("owner_id", str).appendQueryParameter("object_id", str).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r8.isAd() == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r8 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendText() {
        /*
            r9 = this;
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r9.getProfilePlatformVM()
            r5 = 0
            if (r0 == 0) goto La3
            X.33Q r0 = r0.getState()
            X.9PM r0 = (X.C9PM) r0
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.LJLJLLL
        L11:
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r9)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility> r0 = com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility r0 = (com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility) r0
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.profile.model.User r7 = r0.getUser()
        L23:
            r2 = 0
            if (r8 == 0) goto L9f
            boolean r1 = r8.isAd()
            r0 = 1
            if (r1 != r0) goto L9f
        L2d:
            java.lang.String r4 = "click_stranger_chat_button"
            java.lang.String r3 = "others_homepage"
            if (r0 == 0) goto L7e
            X.446 r6 = new X.446
            if (r8 == 0) goto L78
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            if (r0 == 0) goto L78
            java.lang.String r1 = r0.getLogExtra()
        L41:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            if (r0 == 0) goto L7c
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto L7c
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L51:
            r6.<init>(r1, r0)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r2)
            X.3uH r2 = r0.getImChatService()
            android.content.Context r1 = r9.getContext()
            if (r7 == 0) goto L66
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r7)
        L66:
            X.3tv r0 = new X.3tv
            r0.<init>(r1, r5)
            r0.setImAdLog(r6)
            r0.setEnterFromForMob(r3)
            r0.setEnterMethodForMob(r4)
            r2.LJFF(r0)
        L77:
            return
        L78:
            r1 = r5
            if (r8 == 0) goto L7c
            goto L41
        L7c:
            r0 = r5
            goto L51
        L7e:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r2)
            X.3uH r2 = r0.getImChatService()
            android.content.Context r1 = r9.getContext()
            if (r7 == 0) goto L90
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r7)
        L90:
            X.3tv r0 = new X.3tv
            r0.<init>(r1, r5)
            r0.setEnterFromForMob(r3)
            r0.setEnterMethodForMob(r4)
            r2.LJFF(r0)
            goto L77
        L9f:
            r0 = 0
            goto L2d
        La1:
            r7 = r5
            goto L23
        La3:
            r8 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarMoreComponent.sendText():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void onReport() {
        Boolean bool;
        String str;
        List<Aweme> list;
        String str2;
        C9PM state;
        Aweme aweme;
        UserAccountInfo userAccountInfo;
        ProfileCommonInfo commonInfo = getCommonInfo();
        User user = null;
        if (commonInfo != null && (userAccountInfo = commonInfo.getUserAccountInfo()) != null) {
            bool = userAccountInfo.isSecret();
        } else {
            bool = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        if (o.LJ(bool, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_private_profile", str);
        FMX.LJIIL("click_more_action", c188727au.LIZ);
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            list = userAwemePagerAbility.LLLIIIL();
        } else {
            list = null;
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM == null || (state = profilePlatformVM.getState()) == null || (aweme = state.LJLJLLL) == null || (str2 = aweme.getGroupId()) == null) {
            str2 = "";
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            user = userProfileAbility.getUser();
        }
        WeakHandler weakHandler = this.handler;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (user == null || user.getShareInfo() == null) {
            return;
        }
        C4LD.LIZ.LIZIZ(weakHandler, LIZ, user, list, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0015, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.9kI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void blockUser(boolean r12) {
        /*
            r11 = this;
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r2 = r11.getCommonInfo()
            java.lang.String r5 = ""
            if (r2 == 0) goto L14
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r2.getUserProfileInfo()
            if (r0 == 0) goto L14
            java.lang.String r4 = r0.getUid()
            if (r4 != 0) goto L17
        L14:
            r4 = r5
            if (r2 == 0) goto L23
        L17:
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r2.getUserProfileInfo()
            if (r0 == 0) goto L23
            java.lang.String r1 = r0.getSecUid()
            if (r1 != 0) goto L24
        L23:
            r1 = r5
        L24:
            java.lang.String r3 = "others_homepage"
            r10 = 0
            if (r12 == 0) goto L39
            com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM r0 = r11.getUserProfileBlockVM()
            r0.gv0(r10, r4, r1)
            X.V16.LJJLJLI(r3, r4)
            java.lang.String r0 = "unblock"
            X.C245999l5.LIZIZ(r0)
        L38:
            return
        L39:
            X.9kI r6 = new X.9kI
            r6.<init>()
            android.content.Context r8 = r11.getContext()
            if (r8 == 0) goto L38
            r1 = 2131821736(0x7f1104a8, float:1.9276224E38)
            java.lang.String r0 = "it.resources.getString(R…ience_block_popup_header)"
            java.lang.String r9 = X.C29822Bn8.LIZ(r8, r1, r0)
            if (r2 == 0) goto L5b
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r2.getUserProfileInfo()
            if (r0 == 0) goto L5b
            java.lang.String r7 = r0.getNickname()
            if (r7 != 0) goto L5e
        L5b:
            r7 = r5
            if (r2 == 0) goto L6a
        L5e:
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r2.getUserProfileInfo()
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getUsername()
            if (r0 != 0) goto L6b
        L6a:
            r0 = r5
        L6b:
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r10] = r0
            r0 = 1
            r1[r0] = r7
            java.lang.String r0 = "format(format, *args)"
            java.lang.String r0 = X.Q8U.LIZIZ(r1, r2, r9, r0)
            X.ARb r2 = new X.ARb
            r2.<init>(r8)
            r2.LJFF(r0)
            r0 = 2131821735(0x7f1104a7, float:1.9276222E38)
            r2.LIZ(r0)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 849(0x351, float:1.19E-42)
            r1.<init>(r6, r0)
            X.UC0.LIZJ(r2, r1)
            X.ARf r0 = r2.LJI()
            r0.LIZLLL()
            X.V16.LJFF(r3, r4, r5)
            java.lang.String r0 = "block"
            X.C245999l5.LIZIZ(r0)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarMoreComponent.blockUser(boolean):void");
    }

    private final C234529Ii updateNavActionIcon(C234529Ii c234529Ii) {
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

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        ICTASocialInteractionAbility iCTASocialInteractionAbility;
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
        } else {
            if (i != 56 || (iCTASocialInteractionAbility = (ICTASocialInteractionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICTASocialInteractionAbility.class, null)) == null) {
                return;
            }
            iCTASocialInteractionAbility.removeFollower();
        }
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        C9H0 c9h0;
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("user", event.LJLJJI)) {
            C234159Gx data = getData();
            View view = null;
            if (data != null && (c9h0 = data.LJLIL) != null) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                String value = c9h0.getValue();
                if (value == null) {
                    value = "";
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
                if (iNavbarBaseAbility != null) {
                    view = iNavbarBaseAbility.rm(uniqueId());
                }
            }
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(getContext(), view, event);
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001a, code lost:
    
        if (r1 != null) goto L10;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUnBlockUser(X.C245749kg r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r1 = r4.getCommonInfo()
            java.lang.String r3 = ""
            if (r1 == 0) goto L19
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r1.getUserProfileInfo()
            if (r0 == 0) goto L19
            java.lang.String r2 = r0.getUid()
            if (r2 != 0) goto L1c
        L19:
            r2 = r3
            if (r1 == 0) goto L28
        L1c:
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r1.getUserProfileInfo()
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.getSecUid()
            if (r0 != 0) goto L41
        L28:
            java.lang.String r0 = r5.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.LJLILLLLZI
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM r1 = r4.getUserProfileBlockVM()
            r0 = 0
            r1.gv0(r0, r2, r3)
        L40:
            return
        L41:
            r3 = r0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarMoreComponent.onUnBlockUser(X.9kg):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), NavBarMoreData.class);
    }

    public final void showToast(String str) {
        Activity LIZ = C27740Aue.LIZ(getContext());
        if (LIZ != null) {
            C31811Ce7.LIZIZ(LIZ, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        super.updateDataWhenUserUpdate(profileComponents);
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateNavActionIcon(this.moreIconAction);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateIndexAtContainer(int i) {
        C9H0 c9h0;
        if (this.index == i) {
            return;
        }
        super.updateIndexAtContainer(i);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, i, this.moreIconAction, uniqueId());
            }
        }
    }
}
