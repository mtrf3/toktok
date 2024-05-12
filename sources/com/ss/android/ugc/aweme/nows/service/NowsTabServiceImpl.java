package com.ss.android.ugc.aweme.nows.service;

import X.AbstractC56325M8r;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C00F;
import X.C107794Kx;
import X.C116694i1;
import X.C194107ja;
import X.C194227jm;
import X.C194597kN;
import X.C194707kY;
import X.C194727ka;
import X.C194837kl;
import X.C194937kv;
import X.C195937mX;
import X.C196367nE;
import X.C196457nN;
import X.C197357op;
import X.C197377or;
import X.C197387os;
import X.C197437ox;
import X.C197517p5;
import X.C197547p8;
import X.C197557p9;
import X.C197617pF;
import X.C197627pG;
import X.C197637pH;
import X.C197767pU;
import X.C197827pa;
import X.C198177q9;
import X.C198617qr;
import X.C198667qw;
import X.C200997uh;
import X.C201157ux;
import X.C26227ARb;
import X.C2MA;
import X.C2U8;
import X.C2WW;
import X.C34K;
import X.C38333F2r;
import X.C41759GaB;
import X.C43694HCw;
import X.C47261Igj;
import X.C53976LGi;
import X.C56319M8l;
import X.C58096Mr6;
import X.C63782es;
import X.C65314PkE;
import X.C72085SQv;
import X.C73969T1h;
import X.C76965UIn;
import X.C77117UOj;
import X.C78596Usy;
import X.C78923UyF;
import X.C7MK;
import X.C7NW;
import X.C7X6;
import X.C7XD;
import X.C84763XOl;
import X.EnumC1806777f;
import X.EnumC181687Bc;
import X.EnumC197427ow;
import X.EnumC198137q5;
import X.EnumC198697qz;
import X.HG3;
import X.InterfaceC194077jX;
import X.InterfaceC55058LjC;
import X.InterfaceC64592gB;
import X.InterfaceC70422pa;
import X.J9A;
import X.LHM;
import X.OHI;
import X.OSZ;
import X.RBX;
import X.SIT;
import X.T16;
import X.UC0;
import X.X1D;
import X.XKX;
import Y.IDDListenerS143S0100000_3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.models.NowDiversionLimitInfo;
import com.ss.android.ugc.aweme.now.NowInteractionControl;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveFeedFragment;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder;
import com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsDetailFragment;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowShareModuleCell;
import com.ss.android.ugc.aweme.nows.publish.ui.NowsTurnOnNotifyPermissionFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class NowsTabServiceImpl implements INowsTabService {
    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIILLIIL() {
        C196457nN.LIZ = null;
    }

    public static INowsTabService LJJIIJ() {
        Object LIZ = C58096Mr6.LIZ(INowsTabService.class, false);
        if (LIZ != null) {
            return (INowsTabService) LIZ;
        }
        if (C58096Mr6.F3 == null) {
            synchronized (INowsTabService.class) {
                if (C58096Mr6.F3 == null) {
                    C58096Mr6.F3 = new NowsTabServiceImpl();
                }
            }
        }
        return C58096Mr6.F3;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LIZLLL() {
        C197767pU c197767pU = new C197767pU();
        C196457nN.LIZ = c197767pU;
        c197767pU.isMute();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIIL() {
        ActivityC45651qj LIZLLL;
        boolean z;
        if (!LHM.LIZIZ.LIZ().shouldShowFriendsTab() || (LIZLLL = StateOwner.LJLIL.LIZLLL()) == null) {
            return false;
        }
        String nv0 = C116694i1.LIZ(LIZLLL).nv0();
        IFriendsTabLayoutAbility LIZJ = C53976LGi.LIZJ(LIZLLL);
        if (LIZJ != null) {
            z = LIZJ.ma("SOCIAL_NOWS");
        } else {
            z = false;
        }
        if (!o.LJ(nv0, "FRIENDS_TAB") || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJIILL() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("tt_now_enable_group", -1);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJI() {
        C7XD.LIZ("NowsTabServiceImpl", "about to turn on switch");
        C7X6.LIZJ().turnOnNowDailyNotification().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.7oy
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C7XD.LIZ("NowsTabServiceImpl", "turn on switch success");
            }
        }, new InterfaceC64592gB() { // from class: X.7p7
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJJII() {
        IFriendsTabLayoutAbility LIZJ;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null || !o.LJ(C116694i1.LIZ(LIZLLL).nv0(), "FRIENDS_TAB") || (LIZJ = C53976LGi.LIZJ(LIZLLL)) == null || !LIZJ.ma("SOCIAL_NOWS")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZJ() {
        if (((HashSet) C78596Usy.LJJIFFI().LIZJ.LJ).size() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJII() {
        boolean z = ActivityStack.getTopActivity() instanceof InterfaceC55058LjC;
        boolean LJIIL = LJIIL();
        if (z && LJIIL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIJJ() {
        return C63782es.LIZIZ().getBoolean("has_visited", false);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePushLanding ");
        LIZ.append(true);
        C7XD.LIZ("NowFeedMonitor", X1D.LIZIZ(LIZ));
        if (StateOwner.LJLIL.LIZLLL() != null) {
            C197387os.LIZ(0, "inner_push", "push_landing");
            C197387os.LJLJL = false;
            C197387os.LJLJJI = true;
            return;
        }
        C197387os.LJLJL = true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZ() {
        return NowArchiveFeedFragment.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIILIIL() {
        return SocialNowsDetailFragment.LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LIZIZ(Aweme aweme) {
        return C195937mX.LJII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJ(int i) {
        C197387os.LJLJJLL = i;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final boolean LJIILJJIL(C2MA c2ma) {
        return c2ma instanceof NowPostCardFeedViewHolder;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final String LJIIZILJ(Aweme aweme) {
        return C7MK.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJ(int i) {
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("tt_now_enable_group", i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJJIFFI(C107794Kx event) {
        o.LJIIIZ(event, "event");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            C200997uh.LIZIZ(event, (ActivityC45651qj) LJIIIIZZ);
        }
    }

    public static Uri LJJIII(Uri uri, Map map) {
        if (map.isEmpty()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (map.containsKey(str)) {
                clearQuery.appendQueryParameter(str, (String) ((LinkedHashMap) map).get(str));
            } else {
                clearQuery.appendQueryParameter(str, UriProtector.getQueryParameter(uri, str));
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (!UriProtector.getQueryParameterNames(uri).contains(entry.getKey())) {
                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "builder.build()");
        return build;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJFF(ActivityC45651qj activityC45651qj, Aweme aweme) {
        String str;
        if (C65314PkE.LJII().LIZ()) {
            C196367nE.LIZ.getClass();
            if (!C196367nE.LJII(aweme)) {
                if (aweme == null || (str = aweme.getAuthorUid()) == null) {
                    str = "";
                }
                if (!C196367nE.LJI(str)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJI(ActivityC45651qj activityC45651qj, Fragment fragment) {
        C200997uh.LIZ(activityC45651qj, fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIJJLI(C41759GaB e, PublishModel publishModel) {
        String str;
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj activityC45651qj2;
        o.LJIIIZ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive nows publish failed event: ");
        LIZ.append(e);
        C7XD.LIZ("NowsPublishManager", X1D.LIZIZ(LIZ));
        if (publishModel == null || (str = publishModel.creationId) == null) {
            str = "";
        }
        C197377or.LIZLLL(new AqS28S1000000_3(str, 2));
        OSZ<Boolean, C38333F2r> retrieveServerError = e.retrieveServerError();
        Boolean isApiServerError = retrieveServerError.getFirst();
        C38333F2r second = retrieveServerError.getSecond();
        C34K c34k = new C34K();
        o.LJIIIIZZ(isApiServerError, "isApiServerError");
        if (isApiServerError.booleanValue() && second != null && second.getErrorCode() == 3013009) {
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL != null) {
                C26227ARb c26227ARb = new C26227ARb(LIZLLL);
                c26227ARb.LIZIZ(LIZLLL.getString(R.string.j3i));
                C77117UOj.LJIL(c26227ARb, LIZLLL.getString(R.string.j6l), new AqS170S0100000_4(LIZLLL, 1270));
                UC0.LIZJ(c26227ARb, new AqS169S0100000_3(LIZLLL, 854));
                c26227ARb.LJI().LIZLLL();
                C7MK.LJII("repetitive_post_pop_up", C197557p9.LJLIL);
            }
        } else if (isApiServerError.booleanValue() && second != null && second.getErrorCode() == 9) {
            C197517p5.LIZ();
        } else if (C7NW.LIZ) {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if ((validTopActivity instanceof ActivityC45651qj) && (activityC45651qj2 = (ActivityC45651qj) validTopActivity) != null) {
                Boolean isApiServerError2 = e.retrieveServerError().getFirst();
                IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
                o.LJIIIIZZ(isApiServerError2, "isApiServerError");
                publishService.showUploadRecoverIfNeed(new PublishFailureReason(e, isApiServerError2.booleanValue(), "now_publish_failed", publishService.getErrorMsg(activityC45651qj2, e, activityC45651qj2.getString(R.string.j67))), activityC45651qj2, publishModel, str);
            }
            c34k.element = true;
        } else {
            C197617pF c197617pF = C197617pF.LJLIL;
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(c34k, 671);
            Activity validTopActivity2 = ActivityStack.getValidTopActivity();
            if ((validTopActivity2 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) validTopActivity2) != null) {
                C26227ARb c26227ARb2 = new C26227ARb(activityC45651qj);
                c26227ARb2.LJFF(activityC45651qj.getResources().getString(R.string.j7i));
                c26227ARb2.LIZIZ(activityC45651qj.getResources().getString(R.string.j7f));
                c26227ARb2.LJII = false;
                UC0.LIZJ(c26227ARb2, new AqS107S0300000_3(activityC45651qj, c197617pF, aqS153S0100000_3, 31));
                c26227ARb2.LJI().LIZLLL();
                C7MK.LJII("upload_failed_pop_up", C197547p8.LJLIL);
            }
        }
        if (!c34k.element) {
            C197377or.LIZLLL(new AqS28S1000000_3(str, 3));
            C194707kY c194707kY = C78596Usy.LJJIFFI().LIZJ;
            c194707kY.getClass();
            c194707kY.LIZ.remove(str);
            c194707kY.LIZLLL.remove(str);
            c194707kY.LIZJ(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0223, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "profile_avatar_plus_icon") != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl.LJJI(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void onPublishProgress(int i, PublishModel publishModel) {
        C197377or.LIZLLL(new AqS93S0101000_3(i, publishModel, 7));
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final AbstractC73672Svk<BaseResponse> setNowVisibility(String str, int i) {
        return C7X6.LIZJ().setNowVisibility(str, i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final SIT LJIIIIZZ(final EnumC198697qz scene, final ActivityC45651qj activityC45651qj, final Fragment fragment) {
        o.LJIIIZ(scene, "scene");
        return new SIT(scene, activityC45651qj, fragment) { // from class: X.7pM
            public final EnumC198697qz LJLJJLL;
            public final ActivityC45651qj LJLJL;
            public final Fragment LJLJLJ;

            @Override // X.SIT, X.InterfaceC227608wW
            public final void onCreate() {
                LJIIIIZZ(NowShareModuleCell.class);
                C72808Sho<InterfaceC57784Mm4> c72808Sho = this.LJLJJL;
                EnumC198697qz enumC198697qz = this.LJLJJLL;
                C198177q9.LIZ.getClass();
                c72808Sho.LIZJ(new C197697pN(enumC198697qz, C198177q9.LIZIZ()));
                C200997uh.LIZ(this.LJLJL, this.LJLJLJ);
                EventBus.LIZJ().LJIILJJIL(this);
            }

            @Override // X.SIT, X.InterfaceC227608wW
            public final void onDestroy() {
                EventBus.LIZJ().LJIJ(this);
            }

            @QD3
            public final void onEvent(C107794Kx event) {
                o.LJIIIZ(event, "event");
                C200997uh.LIZIZ(event, this.LJLJL);
            }

            {
                o.LJIIIZ(scene, "scene");
                this.LJLJJLL = scene;
                this.LJLJL = activityC45651qj;
                this.LJLJLJ = fragment;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (r2.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        r1 = r2.next();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "key");
        r4.put(r1, java.lang.String.valueOf(X.C16880lQ.LLJJIII(r8, r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        r0 = r8.keySet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        if (r0 == null) goto L21;
     */
    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r7, android.os.Bundle r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            java.lang.String r2 = "af_dp"
            java.lang.String r3 = "NowsTabServiceImpl"
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = "now_never_button_schema"
            java.lang.String r0 = ""
            r4.getClass()     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "getInstance().getStringV…ButtonSchema::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La7
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Exception -> La7
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> La7
            r4.<init>()     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r5, r2)     // Catch: java.lang.Exception -> La7
            if (r1 != 0) goto L2d
            goto L2f
        L2d:
            if (r9 != 0) goto L32
        L2f:
            if (r8 == 0) goto L77
            goto L50
        L32:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L39
            goto L2f
        L39:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "parse(deepLink)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La7
            android.net.Uri r0 = LJJIII(r1, r9)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L2f
            r4.put(r2, r0)     // Catch: java.lang.Exception -> La7
            goto L2f
        L50:
            java.util.Set r0 = r8.keySet()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L77
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La7
        L5a:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La7
            java.lang.Object r0 = X.C16880lQ.LLJJIII(r8, r1)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> La7
            r4.put(r1, r0)     // Catch: java.lang.Exception -> La7
            goto L5a
        L77:
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Exception -> La7
            android.net.Uri r0 = LJJIII(r5, r4)     // Catch: java.lang.Exception -> La7
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "uri.appendOrReplaceParams(map).toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> La7
            X.9nM r1 = X.C247339nF.LJI     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "now"
            r1.getClass()     // Catch: java.lang.Exception -> La7
            X.C247409nM.LJFF(r7, r2, r0)     // Catch: java.lang.Exception -> La7
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "routeToNever: "
            r1.append(r0)     // Catch: java.lang.Exception -> La7
            r1.append(r2)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> La7
            X.C7XD.LIZ(r3, r0)     // Catch: java.lang.Exception -> La7
            goto Lad
        La7:
            r1 = move-exception
            java.lang.String r0 = "routeToNever"
            X.C7XD.LIZJ(r3, r0, r1)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl.LJIIIZ(android.content.Context, android.os.Bundle, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJJ(PublishModel publishModel, CreateAwemeResponse createAwemeResponse, ActivityC45651qj activityC45651qj) {
        String str;
        NowDiversionLimitInfo nowDiversionLimitInfo;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        NowDiversionLimitInfo nowDiversionLimitInfo2;
        IBottomTabLayoutAbility LJIIIIZZ;
        ActivityC45651qj activityC45651qj2 = activityC45651qj;
        o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
        C7XD.LIZ("NowsPublishManager", "received nows publish succeed");
        long LIZIZ = J9A.LIZIZ("now_publish_times", -1L);
        if (LIZIZ >= 0) {
            C63782es.LIZIZ().storeLong("published_times", LIZIZ);
        } else {
            C63782es.LIZIZ().storeLong("published_times", C63782es.LIZIZ().getLong("published_times", 0L) + 1);
        }
        Aweme aweme = createAwemeResponse.aweme;
        if (aweme != null && publishModel != null) {
            XKX.LIZLLL((InterfaceC70422pa) C194937kv.LIZ.getValue(), null, null, new C197627pG(publishModel, aweme, null), 3);
        }
        C194707kY c194707kY = C78596Usy.LJJIFFI().LIZJ;
        String str2 = "";
        if (publishModel == null || (str = publishModel.creationId) == null) {
            str = "";
        }
        Aweme aweme2 = createAwemeResponse.aweme;
        o.LJIIIIZZ(aweme2, "createAwemeResponse.aweme");
        c194707kY.getClass();
        c194707kY.LIZ.remove(str);
        LinkedHashMap<String, Aweme> linkedHashMap = c194707kY.LIZIZ;
        String aid = aweme2.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        linkedHashMap.put(aid, aweme2);
        c194707kY.LIZJ(str);
        String aid2 = aweme2.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        ((HashSet) c194707kY.LJ).add(aid2);
        ((HashSet) c194707kY.LJFF).add(aid2);
        C197377or.LIZLLL(new AqS134S0200000_3(publishModel, createAwemeResponse, 117));
        if (activityC45651qj2 == null) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity instanceof ActivityC45651qj) {
                activityC45651qj2 = (ActivityC45651qj) topActivity;
            } else {
                activityC45651qj2 = null;
            }
        }
        final boolean z6 = true;
        final boolean z7 = false;
        if (activityC45651qj2 != null) {
            if (C63782es.LIZIZ().getLong("published_times", 0L) == 1) {
                z = true;
            } else {
                z = false;
            }
            long j = C63782es.LIZIZ().getLong("published_times", 0L);
            if (j != 1 && j % 4 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            OHI.LIZ.getClass();
            boolean LJFF = OHI.LJFF(activityC45651qj2);
            C198177q9.LIZ.getClass();
            EnumC198137q5 LIZ = C198177q9.LIZ();
            boolean z8 = ActivityStack.getTopActivity() instanceof InterfaceC55058LjC;
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL != null && (LJIIIIZZ = C53976LGi.LJIIIIZZ(LIZLLL)) != null) {
                z3 = LJIIIIZZ.wY();
            } else {
                z3 = false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isIMainActivityTopActivity = ");
            LIZ2.append(z8);
            LIZ2.append(", isInFriendsTab = ");
            LIZ2.append(z3);
            C7XD.LIZ("NowsPublishManager", X1D.LIZIZ(LIZ2));
            if (z8 && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("TTNowNewYearConfig.nowEventType() = ");
            LIZ3.append(LIZ);
            LIZ3.append(", isOn2Tab = ");
            LIZ3.append(z4);
            C7XD.LIZ("NowsPublishManager", X1D.LIZIZ(LIZ3));
            if ((LIZ == EnumC198137q5.CHRISTMAS || LIZ == EnumC198137q5.NEW_YEAR) && z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            StringBuilder LIZLLL2 = C00F.LIZLLL("onPublishSuccess isFirstTimePublish = ", z, ", isReturnViaWeb = ", false, ", isGrantedNotifyPermission = ");
            C76965UIn.LIZJ(LIZLLL2, LJFF, ", isShowPermissionPopup = ", z2, ", isShowQRCode = ");
            LIZLLL2.append(z5);
            C7XD.LIZ("NowsPublishManager", X1D.LIZIZ(LIZLLL2));
            C194227jm value = C194597kN.LIZ.LIZIZ.getValue();
            if (value != null) {
                nowDiversionLimitInfo2 = value.LIZIZ;
            } else {
                nowDiversionLimitInfo2 = null;
            }
            InterfaceC194077jX LJIIL = C78923UyF.LJIIL(nowDiversionLimitInfo2);
            C194107ja c194107ja = C194107ja.LIZ;
            if (o.LJ(LJIIL, c194107ja)) {
                String str3 = C197377or.LIZ;
                if (str3 != null) {
                    str2 = str3;
                }
                PopupManager.LIZ(new C197827pa(str2, LJIIL));
            }
            if (z) {
                if (!LJFF) {
                    PopupManager.LIZ(new AbstractC56325M8r<DialogFragment>(z6) { // from class: X.7pd
                        public final boolean LJLIL;
                        public final int LJLILLLLZI = 2505;

                        @Override // X.InterfaceC55641Lsb
                        public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
                            return null;
                        }

                        @Override // X.InterfaceC56321M8n
                        public final int getPriority() {
                            return this.LJLILLLLZI;
                        }

                        {
                            this.LJLIL = z6;
                        }

                        @Override // com.bytedance.poplayer.IPopupTask
                        public final Object showPopup(C54082LKk context) {
                            o.LJIIIZ(context, "context");
                            ActivityC45651qj LIZJ = context.LIZJ();
                            if (LIZJ == null) {
                                return null;
                            }
                            NowsTurnOnNotifyPermissionFragment nowsTurnOnNotifyPermissionFragment = new NowsTurnOnNotifyPermissionFragment(this.LJLIL);
                            ASL asl = new ASL();
                            TuxSheet tuxSheet = asl.LIZ;
                            tuxSheet.LJLLILLLL = nowsTurnOnNotifyPermissionFragment;
                            tuxSheet.LJZI = false;
                            asl.LJI(0);
                            IDDListenerS143S0100000_3 iDDListenerS143S0100000_3 = new IDDListenerS143S0100000_3(nowsTurnOnNotifyPermissionFragment, 6);
                            TuxSheet tuxSheet2 = asl.LIZ;
                            tuxSheet2.LJLILLLLZI = iDDListenerS143S0100000_3;
                            C1DG.LJII(LIZJ, "activity.supportFragmentManager", tuxSheet2, "nows_turn_on_notify_permission_popup_window");
                            return tuxSheet2;
                        }
                    });
                } else {
                    PopupManager.LIZ(new C198617qr());
                    C197357op.LIZJ(activityC45651qj2, C197377or.LIZLLL);
                }
            } else if (!o.LJ(LJIIL, c194107ja)) {
                if (z2 && !LJFF) {
                    C43694HCw c43694HCw = new C43694HCw(createAwemeResponse.aweme, 10, 100, null);
                    c43694HCw.LJLJLJ = createAwemeResponse;
                    C2U8.LIZIZ(c43694HCw);
                    PopupManager.LIZ(new AbstractC56325M8r<DialogFragment>(z7) { // from class: X.7pd
                        public final boolean LJLIL;
                        public final int LJLILLLLZI = 2505;

                        @Override // X.InterfaceC55641Lsb
                        public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
                            return null;
                        }

                        @Override // X.InterfaceC56321M8n
                        public final int getPriority() {
                            return this.LJLILLLLZI;
                        }

                        {
                            this.LJLIL = z7;
                        }

                        @Override // com.bytedance.poplayer.IPopupTask
                        public final Object showPopup(C54082LKk context) {
                            o.LJIIIZ(context, "context");
                            ActivityC45651qj LIZJ = context.LIZJ();
                            if (LIZJ == null) {
                                return null;
                            }
                            NowsTurnOnNotifyPermissionFragment nowsTurnOnNotifyPermissionFragment = new NowsTurnOnNotifyPermissionFragment(this.LJLIL);
                            ASL asl = new ASL();
                            TuxSheet tuxSheet = asl.LIZ;
                            tuxSheet.LJLLILLLL = nowsTurnOnNotifyPermissionFragment;
                            tuxSheet.LJZI = false;
                            asl.LJI(0);
                            IDDListenerS143S0100000_3 iDDListenerS143S0100000_3 = new IDDListenerS143S0100000_3(nowsTurnOnNotifyPermissionFragment, 6);
                            TuxSheet tuxSheet2 = asl.LIZ;
                            tuxSheet2.LJLILLLLZI = iDDListenerS143S0100000_3;
                            C1DG.LJII(LIZJ, "activity.supportFragmentManager", tuxSheet2, "nows_turn_on_notify_permission_popup_window");
                            return tuxSheet2;
                        }
                    });
                } else if (z5) {
                    final String str4 = C197377or.LIZ;
                    PopupManager.LIZ(new AbstractC56325M8r<Dialog>(str4) { // from class: X.7pb
                        public final String LJLIL;
                        public final int LJLILLLLZI = 2508;

                        @Override // X.InterfaceC55641Lsb
                        public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
                            return null;
                        }

                        @Override // X.InterfaceC56321M8n
                        public final int getPriority() {
                            return this.LJLILLLLZI;
                        }

                        {
                            this.LJLIL = str4;
                        }

                        @Override // com.bytedance.poplayer.IPopupTask
                        public final Object showPopup(C54082LKk context) {
                            o.LJIIIZ(context, "context");
                            ActivityC45651qj LIZJ = context.LIZJ();
                            if (LIZJ == null) {
                                return null;
                            }
                            ShareService shareService = C4LD.LIZ;
                            o.LJIIIIZZ(shareService, "shareService()");
                            return shareService.LJIIJJI(LIZJ, this.LJLIL, null);
                        }
                    });
                } else {
                    C43694HCw c43694HCw2 = new C43694HCw(createAwemeResponse.aweme, 10, 100, null);
                    c43694HCw2.LJLJLJ = createAwemeResponse;
                    C2U8.LIZIZ(c43694HCw2);
                    C197357op.LIZJ(activityC45651qj2, C197377or.LIZLLL);
                }
            }
            PopupManager.LJIIJJI(C56319M8l.LJLIL);
        }
        C194227jm value2 = C194597kN.LIZ.LIZIZ.getValue();
        if (value2 != null && o.LJ(C78923UyF.LJIIL(value2.LIZIZ), C194107ja.LIZ)) {
            C194727ka c194727ka = C78596Usy.LJJIFFI().LIZLLL;
            NowDiversionLimitInfo nowDiversionLimitInfo3 = value2.LIZIZ;
            if (nowDiversionLimitInfo3 != null) {
                nowDiversionLimitInfo = NowDiversionLimitInfo.copy$default(nowDiversionLimitInfo3, C2WW.LIZJ(), null, 2, null);
            } else {
                nowDiversionLimitInfo = null;
            }
            c194727ka.LLIIJI(new C194227jm(value2.LIZ, nowDiversionLimitInfo));
        }
        C197377or.LIZ = null;
        C197377or.LIZIZ = null;
        C197377or.LIZJ = null;
        C197377or.LIZLLL = null;
        C197377or.LJ = false;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        curUser.setUserNowPackStruct(new UserNowPackStruct(1, null, 2, null));
        List LJJIJ = C47261Igj.LJJIJ(curUser);
        C197637pH mapUser = C197637pH.LJLIL;
        o.LJIIIZ(mapUser, "mapUser");
        C72085SQv.LJ(new C194837kl(LJJIJ, mapUser, true));
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final void LJIIJJI(Context context, Bundle bundle, boolean z, EnumC197427ow routeType) {
        EnumC197427ow enumC197427ow;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routeType, "routeType");
        if (routeType == EnumC197427ow.AUTO) {
            if (C201157ux.LIZ) {
                enumC197427ow = EnumC197427ow.FORCE_TO_INDIVIDUAL_PAGE;
            } else {
                enumC197427ow = EnumC197427ow.FORCE_TO_TAB;
            }
        } else {
            enumC197427ow = routeType;
        }
        int i = C197437ox.LIZ[enumC197427ow.ordinal()];
        if (i != 1) {
            if (i != 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unexpected route parameter. finalRouteType: ");
                LIZ.append(enumC197427ow);
                LIZ.append("  routeType: ");
                LIZ.append(routeType);
                C7XD.LIZIZ("NowsTabServiceImpl", X1D.LIZIZ(LIZ));
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//main");
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
            buildRoute.withParam("is_nows", true);
            buildRoute.withParam("extra_skip_process_publish", true);
            buildRoute.addFlags(67108864);
            if (bundle != null) {
                buildRoute.withParam(bundle);
            }
            buildRoute.open();
            return;
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//now/individual-feed");
        buildRoute2.addFlags(536870912);
        buildRoute2.withParam("switch_to_inbox_on_finishing", z);
        if (bundle != null) {
            buildRoute2.withParam(bundle);
        }
        buildRoute2.open();
    }

    @Override // com.ss.android.ugc.aweme.service.INowsTabService
    public final int LJIIJ(ActivityC45651qj activityC45651qj, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, EnumC1806777f bubbleType, Comment comment) {
        boolean z;
        String str;
        Integer num;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String aid;
        NowPostInfo nowPostInfo;
        NowInteractionControl nowInteractionControl;
        o.LJIIIZ(bubbleType, "bubbleType");
        int i2 = 0;
        int i3 = 1;
        if (C65314PkE.LJII().LIZ()) {
            C196367nE.LIZ.getClass();
            if (!C196367nE.LJII(aweme)) {
                String str7 = "";
                if (aweme == null || (str = aweme.getAuthorUid()) == null) {
                    str = "";
                }
                if (!C196367nE.LJI(str)) {
                    if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null && (nowInteractionControl = nowPostInfo.getNowInteractionControl()) != null) {
                        num = Integer.valueOf(nowInteractionControl.getBlurCommentAction());
                    } else {
                        num = null;
                    }
                    int value = EnumC181687Bc.DIGG.getValue();
                    if (num == null || num.intValue() != value) {
                        int value2 = EnumC181687Bc.ENTER_COMMENT.getValue();
                        if (num == null || num.intValue() != value2) {
                            if (activityC45651qj != null) {
                                if (nowFeedMobHierarchyData == null || (str2 = nowFeedMobHierarchyData.getEnterFrom()) == null) {
                                    str2 = "";
                                }
                                if (aweme != null && (aid = aweme.getAid()) != null) {
                                    str7 = aid;
                                }
                                if (bubbleType == EnumC1806777f.CAPTION) {
                                    str3 = "caption";
                                } else {
                                    str3 = "bullet";
                                }
                                if (nowFeedMobHierarchyData != null) {
                                    i = nowFeedMobHierarchyData.isNewPage();
                                    str4 = nowFeedMobHierarchyData.getPreviousPage();
                                    str5 = nowFeedMobHierarchyData.getNowTabEnterMethod();
                                    str6 = nowFeedMobHierarchyData.getNowScene();
                                } else {
                                    i = 0;
                                    str4 = null;
                                    str5 = null;
                                    str6 = null;
                                }
                                C197377or.LIZJ(activityC45651qj, "click_post", str2, null, false, false, null, null, null, "video_cover", str7, str3, i, str4, str5, str6, 504);
                            }
                            return 0;
                        }
                    }
                    if (activityC45651qj != null) {
                        if (bubbleType == EnumC1806777f.COMMENT || bubbleType == EnumC1806777f.CAPTION) {
                            i3 = 0;
                        }
                        C198667qw.LIZ(aweme, activityC45651qj, nowFeedMobHierarchyData, false, comment, Integer.valueOf(i3), "bullet", 260);
                    }
                    return 0;
                }
            }
        }
        if (aweme != null && activityC45651qj != null) {
            EnumC1806777f enumC1806777f = EnumC1806777f.COMMENT;
            if (bubbleType == enumC1806777f) {
                z = true;
            } else {
                z = false;
            }
            if (bubbleType != enumC1806777f && bubbleType != EnumC1806777f.CAPTION) {
                i2 = 1;
            }
            C198667qw.LIZ(aweme, activityC45651qj, nowFeedMobHierarchyData, z, comment, Integer.valueOf(i2), "bullet", 260);
        }
        return 1;
    }
}
