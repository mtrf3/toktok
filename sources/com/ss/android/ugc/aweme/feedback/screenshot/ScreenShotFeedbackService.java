package com.ss.android.ugc.aweme.feedback.screenshot;

import X.AbstractC62641OiD;
import X.AbstractC65590Pog;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C03880Dg;
import X.C10A;
import X.C116694i1;
import X.C16880lQ;
import X.C188727au;
import X.C221018lt;
import X.C58096Mr6;
import X.C62715OjP;
import X.C62811Okx;
import X.C65300Pk0;
import X.C70657RoD;
import X.C85990Xow;
import X.C86550Xxy;
import X.DialogC25756A8y;
import X.ESM;
import X.FMX;
import X.HG3;
import X.JBR;
import X.ORZ;
import X.RBX;
import X.X1D;
import Y.IDObjectS326S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS65S1200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ScreenShotFeedbackService extends AbstractC62641OiD implements IScreenShotFeedbackService, WeakHandler.IHandler {
    public static final int $stable = 8;
    public boolean avoidInAppPush;
    public List<String> blackPageList;
    public boolean feedbackUsable;
    public final C62811Okx floatViewProvider = new C62811Okx();
    public DialogC25756A8y loadingDialog;
    public final boolean needDispatchIfHandledAlready;

    public static void com_ss_android_ugc_aweme_feedback_screenshot_ScreenShotFeedbackService_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-3527628860929480828")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    private final boolean checkPageBlocked() {
        ActivityC45651qj activityC45651qj;
        List<String> list;
        List<Fragment> LJJJJLI;
        if (this.avoidInAppPush && isDMPushShowing()) {
            return true;
        }
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) validTopActivity;
        } else {
            activityC45651qj = null;
        }
        if (activityC45651qj != null && (list = this.blackPageList) != null && !list.isEmpty() && list != null) {
            if (containsNotNull(list, C16880lQ.LJLLJ(activityC45651qj.getClass()))) {
                return true;
            }
            Fragment mv0 = C116694i1.LIZ(activityC45651qj).mv0();
            if (mv0 != null && containsNotNull(list, C16880lQ.LJLLJ(mv0.getClass()))) {
                return true;
            }
            Fragment LJIILIIL = C70657RoD.LJIILIIL(activityC45651qj);
            if (LJIILIIL != null && containsNotNull(list, C16880lQ.LJLLJ(LJIILIIL.getClass()))) {
                return true;
            }
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            if (supportFragmentManager != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
                Iterator<Fragment> it = LJJJJLI.iterator();
                while (it.hasNext()) {
                    if (containsNotNull(list, C16880lQ.LJLLJ(it.next().getClass()))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isDMPushShowing() {
        if (!C86550Xxy.LIZIZ.LJFF() && !IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public void sendShareFeedbackEvent() {
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis(), "click_time");
        c188727au.LJIIIZ("country", C85990Xow.LIZIZ());
        FMX.LJIIL("click_beta_feedback_after_screenshot", c188727au.LIZ);
    }

    @Override // X.AbstractC62641OiD
    public boolean getNeedDispatchIfHandledAlready() {
        return this.needDispatchIfHandledAlready;
    }

    public static IScreenShotFeedbackService createIScreenShotFeedbackServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IScreenShotFeedbackService.class, z);
        if (LIZ != null) {
            return (IScreenShotFeedbackService) LIZ;
        }
        if (C58096Mr6.S0 == null) {
            synchronized (IScreenShotFeedbackService.class) {
                if (C58096Mr6.S0 == null) {
                    C58096Mr6.S0 = new ScreenShotFeedbackService();
                }
            }
        }
        return C58096Mr6.S0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r0 != null) goto L24;
     */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMsg(android.os.Message r8) {
        /*
            r7 = this;
            X.A8y r0 = r7.loadingDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            android.app.Activity r4 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L11
            if (r4 != 0) goto L12
        L11:
            return
        L12:
            if (r8 != 0) goto L15
            return
        L15:
            java.lang.Object r6 = r8.obj
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.profile.model.AvatarUri
            java.lang.String r5 = "url"
            java.lang.String r3 = "uri"
            if (r0 == 0) goto L64
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri"
            kotlin.jvm.internal.o.LJII(r6, r0)
            com.ss.android.ugc.aweme.profile.model.AvatarUri r6 = (com.ss.android.ugc.aweme.profile.model.AvatarUri) r6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "id"
            java.util.UUID r0 = java.util.UUID.randomUUID()
            org.json.JSONObject r1 = r2.put(r1, r0)
            java.lang.String r0 = r6.uri
            org.json.JSONObject r2 = r1.put(r3, r0)
            java.util.List<java.lang.String> r0 = r6.urlList
            java.lang.String r1 = "it.urlList"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            java.lang.Object r0 = X.ORZ.LJLLJ(r0)
            org.json.JSONObject r2 = r2.put(r5, r0)
            java.util.List<java.lang.String> r0 = r6.urlList
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            java.lang.Object r1 = X.ORZ.LJLLJ(r0)
            java.lang.String r0 = "preview"
            org.json.JSONObject r2 = r2.put(r0, r1)
            java.lang.String r1 = "type"
            java.lang.String r0 = "image"
            org.json.JSONObject r2 = r2.put(r1, r0)
            if (r2 != 0) goto L7a
        L63:
            return
        L64:
            boolean r0 = r6 instanceof X.C38333F2r
            if (r0 == 0) goto L63
            X.AKb r2 = new X.AKb
            r2.<init>(r4)
            java.lang.Object r1 = r8.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.F2r r1 = (X.C38333F2r) r1
            X.C1FJ.LJI(r1, r2)
            goto L63
        L7a:
            X.2YJ r0 = X.C2YJ.LIZIZ
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r0.LIZ
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy"
            kotlin.jvm.internal.o.LJII(r1, r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf r0 = r1.getFeedbackConf()
            java.lang.String r1 = r0.getFeHelp()
            boolean r0 = X.C78685UuP.LJJJZ(r1)
            if (r0 == 0) goto Lc9
            if (r1 == 0) goto Lc9
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r5)
            if (r0 == 0) goto Lc9
        La0:
            X.F0r r3 = new X.F0r
            r3.<init>(r0)
            java.lang.String r1 = "uploaded_image"
            java.lang.String r0 = r2.toString()
            r3.LIZLLL(r1, r0)
            java.lang.String r0 = "aweme://webview"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
            java.lang.String r0 = r3.LJ()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            r2.withParam(r0)
            java.lang.String r1 = "hide_nav_bar"
            r0 = 1
            r2.withParam(r1, r0)
            r2.open()
            return
        Lc9:
            java.lang.String r0 = "https://feedback.tiktokv.com/falcon/fe_tiktok_common/faq/feedback/?feedback_id=-1&is_from_home=2&entrance=&topic_id=-1&hide_nav_bar=1&container_color_auto_dark=1/"
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService.handleMsg(android.os.Message):void");
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public boolean isFeedbackEnable(boolean z) {
        if (this.feedbackUsable && (!z || !checkPageBlocked())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC62641OiD
    public boolean onShot(String imagePath) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(imagePath, "imagePath");
        super.onShot(imagePath);
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (!(validTopActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) validTopActivity) == null) {
            return false;
        }
        return tryShowScreenShotFloatingView(activityC45651qj, imagePath, null, null);
    }

    private final <E> boolean containsNotNull(List<? extends E> list, E e) {
        if (e == null) {
            return false;
        }
        return list.contains(e);
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public void startUploadScreenShotFeedback(Context context, String imagePath) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imagePath, "imagePath");
        DialogC25756A8y dialogC25756A8y = this.loadingDialog;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        DialogC25756A8y dialogC25756A8y2 = new DialogC25756A8y(context);
        dialogC25756A8y2.LIZIZ(R.string.thp);
        this.loadingDialog = dialogC25756A8y2;
        com_ss_android_ugc_aweme_feedback_screenshot_ScreenShotFeedbackService_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(dialogC25756A8y2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Api.LIZIZ);
        LIZ.append("?uid=");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        HG3.LJIIL();
        HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LIZIZ, 4194304, imagePath, null);
    }

    public void init(Context context, List<String> list, boolean z) {
        Integer num;
        o.LJIIIZ(context, "context");
        ScreenShotService.LJIIIZ().LJ(this);
        this.blackPageList = list;
        this.avoidInAppPush = z;
        this.feedbackUsable = true;
        StringBuilder LJI = JBR.LJI("init， avoidInAppPush=", z, "， blackPageList.size=");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LJI.append(num);
        C221018lt.LJFF("ScreenShotFeedback", X1D.LIZIZ(LJI));
    }

    @Override // com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService
    public boolean tryShowScreenShotFloatingView(ActivityC45651qj activity, String imagePath, String str, ESM<?> esm) {
        View view;
        ViewGroup viewGroup;
        Integer num;
        boolean z;
        ComposeView composeView;
        ViewGroup viewGroup2;
        ComposeView composeView2;
        ViewGroup viewGroup3;
        Configuration configuration;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(imagePath, "imagePath");
        ArrayList arrayList = new ArrayList();
        if (esm != null) {
            arrayList.add(esm);
        }
        if (isFeedbackEnable(true)) {
            arrayList.add(new ESM(C03660Ck.LIZ(activity, R.string.c6x, "activity.resources.getSt…YP_screenshotPreview_btn)"), imagePath, new AqS65S1200000_10(this, activity, imagePath, 1)));
        }
        if (!arrayList.isEmpty()) {
            C62811Okx c62811Okx = this.floatViewProvider;
            AbstractC65590Pog<ESM<?>> copyOf = AbstractC65590Pog.copyOf((Collection) arrayList);
            o.LJIIIIZZ(copyOf, "copyOf(actionList)");
            c62811Okx.getClass();
            Window window = activity.getWindow();
            if (window != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return true;
            }
            if (ViewTreeLifecycleOwner.get(viewGroup) == null) {
                ViewTreeLifecycleOwner.set(viewGroup, activity);
            }
            if (ViewTreeViewModelStoreOwner.get(viewGroup) == null) {
                ViewTreeViewModelStoreOwner.set(viewGroup, activity);
            }
            if (C10A.LIZ(viewGroup) == null) {
                C10A.LIZIZ(viewGroup, activity);
            }
            Resources resources = activity.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                num = Integer.valueOf(configuration.orientation);
            } else {
                num = null;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("configurationOrientation=");
            LIZ.append(num);
            LIZ.append(", requestedOrientation=");
            LIZ.append(requestedOrientation);
            C221018lt.LJFF("ScreenShotFeedback", X1D.LIZIZ(LIZ));
            if (num == null || num.intValue() != 1 || requestedOrientation == 0 || requestedOrientation == 8 || requestedOrientation == 6 || requestedOrientation == 11) {
                z = false;
            } else {
                z = true;
            }
            ViewGroup viewGroup4 = c62811Okx.LIZIZ;
            if (viewGroup4 == null || (composeView = c62811Okx.LIZJ) == null || !o.LJ(c62811Okx.LIZ, viewGroup) || viewGroup.indexOfChild(viewGroup4) == -1 || viewGroup4.indexOfChild(composeView) == -1) {
                ViewGroup c62715OjP = new C62715OjP(activity, c62811Okx, viewGroup);
                Context context = c62715OjP.getContext();
                o.LJIIIIZZ(context, "fullScreenView.context");
                ComposeView composeView3 = new ComposeView(context, null, 6);
                c62811Okx.LIZ(composeView3, viewGroup, c62715OjP, imagePath, z, copyOf);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388659;
                c62715OjP.addView(composeView3, layoutParams);
                viewGroup.addView(c62715OjP, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
                c62811Okx.LIZ = viewGroup;
                return true;
            }
            if (!o.LJ(viewGroup, c62811Okx.LIZ) || (viewGroup2 = c62811Okx.LIZIZ) == null) {
                return true;
            }
            View view2 = (View) ORZ.LJLLL(new IDObjectS326S0100000_1(viewGroup2, 15));
            if (!(view2 instanceof ComposeView) || (composeView2 = (ComposeView) view2) == null || (viewGroup3 = c62811Okx.LIZIZ) == null) {
                return true;
            }
            c62811Okx.LIZ(composeView2, viewGroup, viewGroup3, imagePath, z, copyOf);
            return true;
        }
        return false;
    }
}
