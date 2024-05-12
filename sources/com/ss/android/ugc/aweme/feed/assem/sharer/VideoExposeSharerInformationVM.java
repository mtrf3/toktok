package com.ss.android.ugc.aweme.feed.assem.sharer;

import X.C113554cx;
import X.C188727au;
import X.C200007t6;
import X.C220488l2;
import X.C221018lt;
import X.C221108m2;
import X.C221198mB;
import X.C221298mL;
import X.C221458mb;
import X.C221468mc;
import X.C221478md;
import X.C221488me;
import X.C221498mf;
import X.C221508mg;
import X.C221518mh;
import X.C222578oP;
import X.C27740Aue;
import X.C33Q;
import X.C34K;
import X.C48841JEv;
import X.C55786Luw;
import X.C57107Mb9;
import X.C57293Me9;
import X.C57362MfG;
import X.C57364MfI;
import X.C5S1;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C76732zl;
import X.C78966Uyw;
import X.C87O;
import X.C88545Yp3;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.FMX;
import X.InterfaceC109344Qw;
import X.InterfaceC51691KQl;
import X.InterfaceC57288Me4;
import X.InterfaceC74236TBo;
import X.OSZ;
import X.T2R;
import X.TBV;
import X.X1D;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class VideoExposeSharerInformationVM extends FeedBaseViewModel<C221298mL> implements InterfaceC57288Me4 {
    public static final C221198mB LJLLILLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C87O LJLJLLL;
    public InterfaceC51691KQl LJLL;
    public final C62822Ol8 LJLLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8mB] */
    static {
        TBV tbv = new TBV(VideoExposeSharerInformationVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbv};
        LJLLILLLL = new Object() { // from class: X.8mB
        };
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C221298mL(0);
    }

    public final Context getContext() {
        return (Context) this.LJLJLLL.LIZ(LJLLJ[0]);
    }

    public final IIMService mv0() {
        return (IIMService) this.LJLLI.getValue();
    }

    public VideoExposeSharerInformationVM() {
        C48841JEv.LIZ(new C221478md(CoroutineExceptionHandler.LJJJJIZL).plus(T2R.LJIIJJI()));
        this.LJLJLLL = new C87O(C221508mg.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(C221488me.LJLIL);
    }

    public static boolean qv0() {
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
        if (LJIIIIZZ == null || (privacyUserSettings = LJIIIIZZ.getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 3) {
            return false;
        }
        return true;
    }

    public final User nv0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            return aweme.getSharer();
        }
        return null;
    }

    public final String ov0() {
        String uid;
        User nv0 = nv0();
        if (nv0 == null || (uid = nv0.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public final boolean sv0() {
        User nv0 = nv0();
        if (nv0 == null || !C221518mh.LIZ() || C78966Uyw.LJJIJ().LIZIZ() || !o.LJ(this.LJLJI, "homepage_hot") || nv0.getFollowStatus() != 2 || qv0()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String lv0(com.ss.android.ugc.aweme.profile.model.User r7) {
        /*
            r6 = this;
            int r2 = r7.getFollowStatus()
            int r1 = r7.getFollowerStatus()
            r3 = 2131832960(0x7f113080, float:1.9298989E38)
            r0 = 1
            if (r2 == 0) goto L97
            if (r2 == r0) goto L89
            r0 = 2
            if (r2 == r0) goto L3a
            r0 = 4
            if (r2 == r0) goto L2c
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L22
            java.lang.String r2 = r0.getString(r3)
        L20:
            if (r2 != 0) goto L2b
        L22:
            java.lang.String r2 = X.C86V.LJFF(r3)
            java.lang.String r0 = "getString(R.string.mus_follow)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L2b:
            return r2
        L2c:
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L22
            r0 = 2131830531(0x7f112703, float:1.9294062E38)
            java.lang.String r2 = r1.getString(r0)
            goto L20
        L3a:
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L22
            com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy r0 = X.C78966Uyw.LJJIJ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L50
            boolean r0 = qv0()
            if (r0 == 0) goto L58
        L50:
            r0 = 2131828290(0x7f111e42, float:1.9289517E38)
            java.lang.String r2 = r5.getString(r0)
            goto L20
        L58:
            boolean r0 = r6.sv0()
            if (r0 == 0) goto L67
            X.33Q r0 = r6.getState()
            X.8mL r0 = (X.C221298mL) r0
            java.lang.String r2 = r0.LJLJJLL
            goto L20
        L67:
            r4 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r4)
            X.Mb8 r2 = r0.getImSayHiService()
            java.lang.String r1 = r7.getUid()
            r0 = 12
            java.lang.String r2 = X.C57107Mb9.LIZ(r2, r5, r1, r4, r0)
            java.lang.String r1 = r7.getUid()
            java.lang.String r0 = "sharer.uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "show"
            r6.pv0(r1, r0)
            goto L20
        L89:
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L22
            r0 = 2131830541(0x7f11270d, float:1.9294082E38)
            java.lang.String r2 = r1.getString(r0)
            goto L20
        L97:
            if (r1 != r0) goto La8
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L22
            r0 = 2131830487(0x7f1126d7, float:1.9293973E38)
            java.lang.String r2 = r1.getString(r0)
            goto L20
        La8:
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L22
            r0 = 2131830483(0x7f1126d3, float:1.9293965E38)
            java.lang.String r2 = r1.getString(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM.lv0(com.ss.android.ugc.aweme.profile.model.User):java.lang.String");
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        C57293Me9.LIZ(C27740Aue.LIZ(getContext()), exc);
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        User nv0 = nv0();
        if (nv0 == null || nv0.getUid() == null || !o.LJ(nv0.getUid(), followStatus.userId)) {
            return;
        }
        nv0.setFollowStatus(followStatus.followStatus);
        if (followStatus.followStatus == 2 && !C78966Uyw.LJJIJ().LIZIZ()) {
            IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJI(followStatus);
            tv0(1, R.attr.go, true);
        } else {
            tv0(0, R.attr.cl, true);
        }
    }

    public final void rv0(String text) {
        Aweme aweme;
        User nv0;
        String str;
        o.LJIIIZ(text, "text");
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (nv0 = nv0()) == null) {
            return;
        }
        InterfaceC109344Qw shareService = mv0().getShareService();
        VideoItemParams gv02 = gv0();
        if (gv02 == null || (str = gv02.mEventType) == null) {
            str = "";
        }
        shareService.LJIJI(text, nv0, aweme, str, false, null, C221498mf.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C221298mL iv0(C221298mL c221298mL, VideoItemParams item) {
        String str;
        String str2;
        String str3;
        User nv0;
        User sharer;
        User sharer2;
        User sharer3;
        C221298mL state = c221298mL;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        boolean sv0 = sv0();
        Aweme aweme = item.getAweme();
        UrlModel urlModel = null;
        if (aweme != null && (sharer3 = aweme.getSharer()) != null) {
            str = sharer3.getNickname();
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        FeedAvatarDefaultAssem.LLIIIL.getClass();
        LIZ.append(FeedAvatarDefaultAssem.LLIIJI);
        LIZ.append('_');
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ == null) {
            LIZIZ = "no_aid";
        }
        Aweme aweme3 = item.getAweme();
        if (aweme3 != null && (sharer2 = aweme3.getSharer()) != null) {
            urlModel = sharer2.getAvatarThumb();
        }
        Aweme aweme4 = item.getAweme();
        if (aweme4 != null && (sharer = aweme4.getSharer()) != null) {
            str3 = lv0(sharer);
        } else {
            str3 = "";
        }
        C221298mL LIZ2 = C221298mL.LIZ(state, str, LIZIZ, urlModel, null, null, str3, 0, 0, false, sv0, false, null, 3544);
        User nv02 = nv0();
        if ((nv02 != null && nv02.getFollowStatus() == 4) || ((nv0 = nv0()) != null && nv0.getFollowStatus() == 1)) {
            setState(new AqS8S0010000_3(false, 31));
        }
        return LIZ2;
    }

    public final void kv0(String enterFrom, String str) {
        Aweme aweme;
        boolean z;
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            User sharer = aweme.getSharer();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("current sharer: ");
            LIZ.append(sharer);
            C221018lt.LJFF("Relation_Shared", X1D.LIZIZ(LIZ));
            if (sharer == null || sharer.getUid() == null || C63081OpJ.LJLJLLL(aweme)) {
                return;
            }
            if (!aweme.isCanPlay() || aweme.isDelete()) {
                if (aweme.isImage()) {
                    C5S1 c5s1 = new C5S1(getContext());
                    c5s1.LIZJ(R.string.h_y);
                    c5s1.LJ();
                    return;
                } else {
                    C5S1 c5s12 = new C5S1(getContext());
                    c5s12.LIZJ(R.string.tob);
                    c5s12.LJ();
                    return;
                }
            }
            C55786Luw.LJI(C55786Luw.LJ(sharer));
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIJ("share_link");
            String str3 = this.LJLJI;
            String str4 = "homepage_hot";
            if (str3 == null) {
                str3 = "homepage_hot";
            }
            c57362MfG.LJJIIZI(str3);
            c57362MfG.LJJJJIZL(sharer);
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
            EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
            c57362MfG.LJJLI = enumC57366MfK;
            c57362MfG.LJJJJI();
            c57362MfG.LJLL = C55786Luw.LJI(C55786Luw.LJ(sharer));
            c57362MfG.LJIILIIL();
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", enterFrom);
            if (this.LJLILLLLZI != 0) {
                str4 = "server_push";
            }
            c188727au.LJIIIZ("previous_page", str4);
            c188727au.LJIIIZ("enter_method", str);
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            c188727au.LJIIIZ("to_user_id", sharer.getUid());
            C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
            if (c88545Yp3 != null) {
                z = c88545Yp3.isConnected();
            } else {
                z = false;
            }
            c188727au.LJFF(Boolean.valueOf(z), "is_casting");
            if (c88545Yp3 == null || (str2 = c88545Yp3.LJIILJJIL()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("casting_session_id", str2);
            Object LJII = c220488l2.LJII(aweme, c188727au);
            C222578oP.LIZJ(LJII, aweme, null, null, 14);
            FMX.LJIIL("enter_personal_detail", ((C188727au) LJII).LIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
            buildRoute.withParam("uid", sharer.getUid());
            buildRoute.withParam("sec_user_id", sharer.getSecUid());
            buildRoute.withParam("extra_previous_page", "share_user_info_card");
            buildRoute.withParam("extra_from_pre_page", "share_user_info_card");
            buildRoute.withParam("enter_from", "others_homepage");
            buildRoute.withParam("enter_method", "share_link");
            String accurateRecType = sharer.getAccurateRecType();
            C57364MfI.Companion.getClass();
            buildRoute.withParam("recommend_enter_profile_params", new C57364MfI("homepage_hot", "share_user_info_card", enumC57366MfK, accurateRecType, C200007t6.LIZ(sharer), sharer.getUid(), null, null, sharer.getRequestId(), null, null, null, sharer.getMatchedFriendStruct(), null, null, null, false, "share_link", null, null, null, false, null, false, 16637952, null));
            buildRoute.open();
        }
    }

    public final void pv0(String str, String str2) {
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (!C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), str, 6)) {
            return;
        }
        if (o.LJ(str2, "show")) {
            createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZ(str, C113554cx.LJJLIIIIJ(new OSZ("enter_from", "share_user_info_card")), this, false);
        } else {
            if (!o.LJ(str2, "click")) {
                return;
            }
            createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZIZ(str, C113554cx.LJJLIIIIJ(new OSZ("enter_from", "share_user_info_card")));
        }
    }

    public final void tv0(int i, int i2, boolean z) {
        String str;
        User nv0 = nv0();
        if (nv0 == null) {
            return;
        }
        String lv0 = lv0(nv0);
        C34K c34k = new C34K();
        C34K c34k2 = new C34K();
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = i;
        C76732zl c76732zl2 = new C76732zl();
        c76732zl2.element = i2;
        int followStatus = nv0.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 2) {
                c34k2.element = true;
            } else {
                if (z && sv0()) {
                    c34k.element = true;
                    c76732zl.element = 0;
                    c76732zl2.element = R.attr.cl;
                    c34k2.element = true;
                }
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.exk);
                } else {
                    str = null;
                }
                if (o.LJ(lv0, str)) {
                    if (qv0()) {
                        c76732zl.element = 1;
                        c76732zl2.element = R.attr.go;
                        c34k2.element = false;
                    } else {
                        c34k2.element = true;
                    }
                }
            }
        } else {
            setState(C221468mc.LJLIL);
        }
        setState(new C221458mb(this, c76732zl, c76732zl2, c34k, lv0, c34k2, z));
    }
}
