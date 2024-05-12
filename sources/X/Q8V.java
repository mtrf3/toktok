package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bae.router.AudioRouteDeviceManager;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.services.AccountService;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q8V implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List<WM7> list;
        switch (this.LJLIL) {
            case 0:
                ((AudioRouteDeviceManager) this.LJLILLLLZI).bluetoothScoConnectionCheck();
                return;
            case 1:
                FF5 ff5 = (FF5) this.LJLILLLLZI;
                ff5.getClass();
                FHB.LJ.LJIIIZ().load();
                ff5.LIZ = true;
                return;
            case 2:
                Object obj = this.LJLILLLLZI;
                if (Q8X.LIZJ == null) {
                    Q8X.LIZJ = new Q8W(EF7.LIZIZ());
                }
                Q8X.LIZIZ.add(obj);
                if (!Q8X.LIZLLL) {
                    Q8X.LIZLLL = true;
                    Q8X.LIZJ.enable();
                    return;
                }
                return;
            case 3:
                CommentInputFragment commentInputFragment = (CommentInputFragment) this.LJLILLLLZI;
                if (commentInputFragment.LJLLLL.getParent() != null) {
                    commentInputFragment.LJLJJL.performClick();
                    return;
                }
                return;
            case 4:
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.LJLILLLLZI;
                fTCVideoRecordNewActivity.getClass();
                new DefaultGesturePresenter(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity, null, fTCVideoRecordNewActivity.LLIIII).LIZLLL(new W17(fTCVideoRecordNewActivity.LLIIJI.e8().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) fTCVideoRecordNewActivity.LLIIJI.sm0().getLayoutParams())), 1, 100);
                return;
            case 5:
                if (((Boolean) this.LJLILLLLZI).booleanValue()) {
                    DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                    if (dataLoaderHelper.LJIIIZ == null) {
                        C78253UnR.LIZLLL("DataLoaderHelper", "need start mdl first");
                        return;
                    }
                    dataLoaderHelper.LJJ.LIZJ(1);
                    dataLoaderHelper.LJIIIZ.suspendPreconnect();
                    dataLoaderHelper.LJJ.LJ(1);
                    return;
                }
                DataLoaderHelper dataLoaderHelper2 = C47148Ieu.LIZ;
                if (dataLoaderHelper2.LJIIIZ == null) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "need start mdl first");
                    return;
                }
                dataLoaderHelper2.LJJ.LIZJ(1);
                dataLoaderHelper2.LJIIIZ.resumePreConnect();
                dataLoaderHelper2.LJJ.LJ(1);
                return;
            case 6:
                ((I18nSettingManageMyAccountActivity) this.LJLILLLLZI).LJIJ();
                return;
            case 7:
                ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) this.LJLILLLLZI;
                if (exteriorVideoRecordScene.LJZL.getParent() == null) {
                    return;
                }
                C24540xm.LIZ(R.string.dwm, exteriorVideoRecordScene.requireActivity(), 3015);
                return;
            case 8:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) this.LJLILLLLZI;
                Activity activity = videoPublishContainerScene.mActivity;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                try {
                    Activity[] activityStack = ActivityStack.getActivityStack();
                    if (activityStack.length <= 1) {
                        return;
                    }
                    for (int length = activityStack.length - 1; length >= 0; length--) {
                        Activity activity2 = activityStack[length];
                        if (activity2 != null && !activity2.isFinishing()) {
                            if ((activity2 instanceof VideoRecordNewActivity) && !videoPublishContainerScene.LLILZLL.creativeModel.initialModel.highLightVideoParametersModel.isEcom) {
                                activity2.finish();
                            } else if (activity2 instanceof SAAActivity) {
                                SAAActivity sAAActivity = (SAAActivity) activity2;
                                NavigationScene navigationScene = sAAActivity.LJLJJLL;
                                if (navigationScene != null) {
                                    list = navigationScene.getSceneList();
                                } else {
                                    list = null;
                                }
                                o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.scene.Scene>");
                                for (WM7 wm7 : list) {
                                    if ((wm7 instanceof VideoRecordNewScene) || (wm7 instanceof ExteriorVideoRecordScene)) {
                                        if (!videoPublishContainerScene.LLILZLL.creativeModel.initialModel.highLightVideoParametersModel.isEcom) {
                                            sAAActivity.LJLJJLL.remove(wm7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    C41859Gbn LIZIZ = C1I0.LIZIZ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception: ");
                    LIZ.append(android.util.Log.getStackTraceString(th));
                    LIZIZ.LIZJ("click_post_pre_destroy_activities", X1D.LIZIZ(LIZ));
                    return;
                }
            case 9:
                ((TextView) this.LJLILLLLZI).setCursorVisible(true);
                return;
            case 10:
                IQX this$0 = (IQX) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZ();
                return;
            default:
                C65277Pjd c65277Pjd = (C65277Pjd) this.LJLILLLLZI;
                C65264PjQ c65264PjQ = (C65264PjQ) c65277Pjd.LIZJ;
                c65264PjQ.LIZLLL();
                for (Session session : Collections.unmodifiableMap(c65264PjQ.LIZJ).values()) {
                    C65269PjV c65269PjV = (C65269PjV) c65277Pjd.LJ;
                    c65269PjV.getClass();
                    c65269PjV.LIZ.getClass();
                    C65050Pfy c65050Pfy = new C65050Pfy((TwitterSession) session);
                    if (!c65050Pfy.LIZ.contains(AccountService.class)) {
                        c65050Pfy.LIZ.putIfAbsent(AccountService.class, c65050Pfy.LIZIZ.LIZIZ(AccountService.class));
                    }
                    AccountService accountService = (AccountService) c65050Pfy.LIZ.get(AccountService.class);
                    try {
                        c65269PjV.LIZ();
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.FALSE;
                        accountService.verifyCredentials(bool, bool2, bool2).execute();
                    } catch (IOException | RuntimeException unused) {
                    }
                }
                C65278Pje c65278Pje = c65277Pjd.LIZ;
                c65277Pjd.LIZIZ.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (c65278Pje) {
                    c65278Pje.LIZ = false;
                    c65278Pje.LIZIZ = currentTimeMillis;
                }
                return;
        }
    }

    public /* synthetic */ Q8V(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
