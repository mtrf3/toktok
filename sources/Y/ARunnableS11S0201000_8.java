package Y;

import X.C0NB;
import X.C16880lQ;
import X.C31319CQx;
import X.C37618Epa;
import X.C47261Igj;
import X.C47448Ijk;
import X.C47560IlY;
import X.C47570Ili;
import X.C47625Imb;
import X.C47631Imh;
import X.C48054ItW;
import X.C48071Itn;
import X.C48072Ito;
import X.C48334Iy2;
import X.C49128JPw;
import X.C49389JZx;
import X.C49567Jcp;
import X.C49710Jf8;
import X.C49825Jgz;
import X.C49914JiQ;
import X.C49918JiU;
import X.C49919JiV;
import X.C49920JiW;
import X.C49921JiX;
import X.C49922JiY;
import X.C49923JiZ;
import X.C49936Jim;
import X.C49945Jiv;
import X.C49950Jj0;
import X.C49951Jj1;
import X.C49956Jj6;
import X.C5S1;
import X.C62846OlW;
import X.C74275TDb;
import X.C76800UCe;
import X.C78253UnR;
import X.C78583Usl;
import X.C78765Uvh;
import X.C79004UzY;
import X.C79033V0b;
import X.C86188Xs8;
import X.CN1;
import X.CRD;
import X.EnumC47567Ilf;
import X.EnumC49934Jik;
import X.EnumC49968JjI;
import X.InterfaceC162266Yk;
import X.InterfaceC31104CIq;
import X.InterfaceC47447Ijj;
import X.InterfaceC49926Jic;
import X.InterfaceC65784Pro;
import X.J4O;
import X.J4S;
import X.J4W;
import X.J6U;
import X.JQX;
import X.JYS;
import X.KMP;
import X.RunnableC31321CQz;
import X.V0Z;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.interceptor.ImageHeaderInterceptor;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS11S0201000_8 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        View view = (View) aRunnableS11S0201000_8.l0;
        int i = aRunnableS11S0201000_8.i2;
        View view2 = (View) aRunnableS11S0201000_8.l1;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (i == 0) {
                layoutParams.width = -1;
            } else {
                layoutParams.width = view2.getWidth() - i;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void run$1(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                C48334Iy2 LIZ = C48334Iy2.LIZ((Context) aRunnableS11S0201000_8.l0, (String) aRunnableS11S0201000_8.l1);
                HashMap<String, C48334Iy2> hashMap = C48334Iy2.LJFF;
                if (hashMap.get(LIZ.LIZIZ) != null) {
                    hashMap.remove(LIZ.LIZIZ);
                    return;
                }
                return;
            default:
                ((TTVideoEngineImpl) aRunnableS11S0201000_8.l0).LLZILL = (C47631Imh) aRunnableS11S0201000_8.l1;
                return;
        }
    }

    public static final void run$10(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                ImageHeaderInterceptor imageHeaderInterceptor = (ImageHeaderInterceptor) aRunnableS11S0201000_8.l1;
                Context context = (Context) aRunnableS11S0201000_8.l0;
                imageHeaderInterceptor.getClass();
                ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                imageHeaderInterceptor.LJLJL = memoryInfo.availMem;
                return;
            case 1:
                Object obj = aRunnableS11S0201000_8.l1;
                Context context2 = (Context) aRunnableS11S0201000_8.l0;
                obj.getClass();
                new TuxTextView(context2);
                new TuxIconView(context2);
                return;
            default:
                ((TTVideoEngineImpl) aRunnableS11S0201000_8.l1).LJJLIIIJILLIZJL((Surface) aRunnableS11S0201000_8.l0);
                return;
        }
    }

    public static final void run$11(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        boolean LIZ;
        try {
            Handler handler = (Handler) aRunnableS11S0201000_8.l0;
            if (handler == null) {
                try {
                    ((Callable) aRunnableS11S0201000_8.l1).call();
                    return;
                } catch (Exception e) {
                    C0NB.LJ(C78583Usl.LIZLLL, e.getMessage());
                    return;
                }
            }
            Message obtainMessage = handler.obtainMessage(aRunnableS11S0201000_8.i2);
            try {
                obtainMessage.obj = ((Callable) aRunnableS11S0201000_8.l1).call();
            } catch (Exception e2) {
                obtainMessage.obj = e2;
            }
            ((Handler) aRunnableS11S0201000_8.l0).sendMessage(obtainMessage);
            return;
        } finally {
        }
        if (LIZ) {
        }
    }

    public static final void run$12(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        long j;
        boolean z;
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                J4W j4w = (J4W) aRunnableS11S0201000_8.l0;
                float[] fArr = (float[]) aRunnableS11S0201000_8.l1;
                j4w.getClass();
                if (J6U.LIZ) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                J4O j4o = j4w.LIZ.LIZLLL;
                if (j4o != null && j4o.isReady()) {
                    z = true;
                } else {
                    z = false;
                }
                if (J6U.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("HARService predictRun begin canRun:");
                    LIZ.append(z);
                    LIZ.append(" >>>>");
                    X1D.LIZIZ(LIZ);
                }
                if (z) {
                    j4w.LIZ.LIZLLL.LIZ(fArr, new J4S(j4w, j));
                } else {
                    j4w.LIZ.LJII(null, -2, false);
                }
                if (J6U.LIZ) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("HARService predictRun end1 canRun:");
                    LIZ2.append(z);
                    LIZ2.append(" cost:");
                    LIZ2.append(currentTimeMillis);
                    LIZ2.append(" <<<<");
                    X1D.LIZIZ(LIZ2);
                    return;
                }
                return;
            case 1:
                Context context = (Context) aRunnableS11S0201000_8.l0;
                StringBuilder sb = (StringBuilder) aRunnableS11S0201000_8.l1;
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(sb.toString());
                c5s1.LJ();
                return;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) aRunnableS11S0201000_8.l0;
                View view = (View) aRunnableS11S0201000_8.l1;
                horizontalScrollView.getClass();
                horizontalScrollView.smoothScrollTo((view.getLeft() - (horizontalScrollView.getWidth() / 2)) - ((int) C74275TDb.LIZIZ(view.getContext(), 16)), 0);
                return;
        }
    }

    public static final void run$13(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                ((InterfaceC31104CIq) aRunnableS11S0201000_8.l0).LJI((File) aRunnableS11S0201000_8.l1);
                return;
            case 1:
                C86188Xs8 c86188Xs8 = (C86188Xs8) aRunnableS11S0201000_8.l0;
                UrlModel urlModel = (UrlModel) aRunnableS11S0201000_8.l1;
                if (c86188Xs8.LJLJJLL.getWidth() == 0) {
                    return;
                }
                C62846OlW c62846OlW = c86188Xs8.LJLJJLL;
                C78765Uvh.LJI(c62846OlW, urlModel, c62846OlW.getWidth(), c86188Xs8.LJLJJLL.getHeight(), C47261Igj.LJIILIIL((c86188Xs8.LJLJJLL.getWidth() * 1.0f) / c86188Xs8.LJLJJLL.getWidth()));
                return;
            case 2:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) aRunnableS11S0201000_8.l0;
                View view = (View) aRunnableS11S0201000_8.l1;
                horizontalScrollView.getClass();
                horizontalScrollView.smoothScrollTo((view.getLeft() - (horizontalScrollView.getWidth() / 2)) - ((int) C74275TDb.LIZIZ(view.getContext(), 16)), 0);
                return;
            case 3:
                SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aRunnableS11S0201000_8.l0;
                JYS jys = (JYS) aRunnableS11S0201000_8.l1;
                if (searchContainerFragment.LJLJJL != null) {
                    int i = jys.LJLIL;
                    if (C48054ItW.LIZ()) {
                        searchContainerFragment.LJLJJL.LIZLLL(i, false);
                        return;
                    } else {
                        searchContainerFragment.LJLJJI.setCurrentItem(i, false);
                        return;
                    }
                }
                return;
            default:
                String str = (String) aRunnableS11S0201000_8.l0;
                JSONObject jSONObject = (JSONObject) aRunnableS11S0201000_8.l1;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onEventV2 monitorName ");
                LIZ.append(str);
                C78253UnR.LJI("AppLogEngineUploader", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(str)) {
                    C47570Ili.LIZIZ();
                    if (C47570Ili.LIZLLL != null) {
                        try {
                            jSONObject.putOpt("params_for_special", "videoplayer_monitor");
                            jSONObject.put("auto_report", 1);
                            C47570Ili.LIZ(C47570Ili.LIZLLL, new Object[]{str, jSONObject});
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("upload error ");
                            LIZ2.append(e);
                            C78253UnR.LIZLLL("AppLogEngineUploader", X1D.LIZIZ(LIZ2));
                        }
                    }
                    EnumC47567Ilf.LIZLLL(jSONObject);
                    C47560IlY.LIZ.getClass();
                    return;
                }
                return;
        }
    }

    public static final void run$2(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        boolean LIZ;
        try {
            ((SearchBottomSheetBehavior) aRunnableS11S0201000_8.l1).LIZJ(aRunnableS11S0201000_8.i2, (View) aRunnableS11S0201000_8.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$3(Y.ARunnableS11S0201000_8 r5) {
        /*
            int r0 = r5.i2
            r4 = 0
            switch(r0) {
                case 0: goto L12;
                case 1: goto L43;
                case 2: goto L72;
                case 3: goto L80;
                default: goto L6;
            }
        L6:
            java.lang.Object r1 = r5.l0
            X.IWi r1 = (X.C46748IWi) r1
            java.lang.Object r0 = r5.l1
            X.IWf r0 = (X.C46745IWf) r0
            X.C46748IWi.LJJIIZ(r1, r0)
            return
        L12:
            java.lang.Object r3 = r5.l0
            com.bytedance.pia.core.tracing.Tracing r3 = (com.bytedance.pia.core.tracing.Tracing) r3
            java.lang.Object r2 = r5.l1
            X.En8 r2 = (X.InterfaceC37466En8) r2
            java.util.List<com.bytedance.pia.core.tracing.Tracing$Event> r0 = r3.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.next()
            r2.accept(r0)
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L22
        L35:
            boolean r0 = r2.LIZIZ()
            if (r0 != 0) goto L42
            java.util.Set<X.En8> r0 = r3.LIZIZ
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r2)
        L42:
            return
        L43:
            java.lang.Object r3 = r5.l0
            X.5WY r3 = (X.C5WY) r3
            java.lang.Object r2 = r5.l1
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.util.Queue<android.widget.ImageView> r0 = r3.LJLIL
            if (r0 == 0) goto L5f
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r1 = r0.size()
            r0 = 3
            if (r1 >= r0) goto L5f
            java.util.Queue<android.widget.ImageView> r0 = r3.LJLIL
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r2)
        L5f:
            r2.setImageDrawable(r4)
            r2.clearAnimation()
            boolean r0 = X.C78996UzQ.LJJIIJZLJL(r2)
            if (r0 == 0) goto L6e
            X.C78996UzQ.LJI()
        L6e:
            r3.removeView(r2)
            return
        L72:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = (com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r0
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            X.KNp r0 = r0.LLIIIJ
            r0.LIZJ(r1)
            return
        L80:
            java.lang.Object r3 = r5.l0
            com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity r3 = (com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity) r3
            java.lang.Object r2 = r5.l1
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0 = 1
            r3.LJLJI = r0
            r3.LJIJ()
            X.Uz3 r0 = X.EnumC78973Uz3.DYABindPhoneNumberSourceTypeAccountManagementPhoneNumber
            int r1 = r0.getValue()
            java.lang.String r0 = "phone_number_source"
            r2.putInt(r0, r1)
            com.ss.android.ugc.aweme.IBindService r1 = X.HG3.LJFF()
            X.IMl r0 = X.EnumC46491IMl.MANAGE_MY_ACCOUNT
            java.lang.String r0 = r0.getValue()
            r1.bindMobile(r3, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0201000_8.run$3(Y.ARunnableS11S0201000_8):void");
    }

    public static final void run$4(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) aRunnableS11S0201000_8.l0;
                String str = (String) aRunnableS11S0201000_8.l1;
                commentWidget.getClass();
                if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(str)) {
                    commentWidget.LLII(str);
                } else {
                    commentWidget.LLFZ(str);
                }
                commentWidget.LLILII("livesdk_comment_rethink_cg_click");
                return;
            case 1:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aRunnableS11S0201000_8.l0;
                InterfaceC162266Yk interfaceC162266Yk = (InterfaceC162266Yk) aRunnableS11S0201000_8.l1;
                if (videoEditContainerScene.LLIL && videoEditContainerScene.mActivity != null) {
                    Iterator<Integer> it = interfaceC162266Yk.LIZ().iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        V0Z.LIZ(videoEditContainerScene.mActivity, new C79033V0b(KMP.LJ("publish", intValue), intValue, null));
                    }
                    return;
                }
                return;
            case 2:
                IEffectService.OnVideoCoverCallback onVideoCoverCallback = (IEffectService.OnVideoCoverCallback) aRunnableS11S0201000_8.l0;
                Bitmap bitmap = (Bitmap) aRunnableS11S0201000_8.l1;
                if (onVideoCoverCallback != null) {
                    if (bitmap != null) {
                        onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
                        return;
                    } else {
                        onVideoCoverCallback.onGetVideoCoverFailed(-1);
                        return;
                    }
                }
                return;
            case 3:
                Object this$0 = aRunnableS11S0201000_8.l0;
                InterfaceC65784Pro block = (InterfaceC65784Pro) aRunnableS11S0201000_8.l1;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(block, "$block");
                try {
                    new AqS158S0100000_8(block, (InterfaceC65784Pro<C76800UCe>) 702).invoke();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                C47625Imb c47625Imb = (C47625Imb) aRunnableS11S0201000_8.l0;
                String str2 = (String) aRunnableS11S0201000_8.l1;
                c47625Imb.getClass();
                try {
                    C16880lQ.LLLZZIL(new File(c47625Imb.LIZ, str2));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("saved event deleted: ");
                    LIZ.append(str2);
                    C78253UnR.LJI("EventSaver", X1D.LIZIZ(LIZ));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object, com.ss.android.ugc.aweme.base.api.BaseResponse, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList, com.ss.android.ugc.aweme.discover.model.SearchApiResult] */
    public static final void run$5(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        K k;
        C49919JiV c49919JiV;
        T t;
        K k2;
        K k3;
        K k4;
        K k5;
        int i;
        int i2 = 0;
        switch (aRunnableS11S0201000_8.i2) {
            case 0:
                ARunnableS41S0100000_5 aRunnableS41S0100000_5 = (ARunnableS41S0100000_5) aRunnableS11S0201000_8.l0;
                List<CRD> list = (List) aRunnableS11S0201000_8.l1;
                C31319CQx c31319CQx = (C31319CQx) aRunnableS41S0100000_5.l0;
                if (c31319CQx.mView == 0) {
                    return;
                }
                c31319CQx.LLJJIJIIJIL = SystemClock.elapsedRealtime();
                c31319CQx.LLJJJ.LIZJ(new RunnableC31321CQz(i2, c31319CQx, list));
                for (CRD crd : list) {
                    c31319CQx.LJJJLL(crd);
                    crd.LIZLLL().LIZJ = SystemClock.uptimeMillis();
                    c31319CQx.LJLIL.LJFF(crd);
                }
                return;
            case 1:
                Object obj = aRunnableS11S0201000_8.l0;
                Runnable runnable = (Runnable) aRunnableS11S0201000_8.l1;
                obj.getClass();
                Process.setThreadPriority(10);
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                WebViewPort webViewPort = (WebViewPort) aRunnableS11S0201000_8.l0;
                String str = (String) aRunnableS11S0201000_8.l1;
                WebView webView = webViewPort.LIZLLL.get();
                if (webView == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder("(function(n){var i=window.pia_bridge,o=i&&i.onmessage;o&&\"function\"==typeof o&&o(n)})");
                C37618Epa.LIZ(str, sb);
                C37618Epa.LIZIZ(webView, sb.toString(), null);
                return;
            default:
                C49918JiU c49918JiU = (C49918JiU) aRunnableS11S0201000_8.l0;
                ?? r5 = (SearchMixFeedList) aRunnableS11S0201000_8.l1;
                C49914JiQ c49914JiQ = c49918JiU.LIZJ;
                synchronized (c49914JiQ) {
                    if (r5 != 0) {
                        GlobalDoodleConfig globalDoodleConfig = r5.globalDoodleConfig;
                        if (globalDoodleConfig != null) {
                            InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) c49914JiQ.LLIIIL.LJLILLLLZI;
                            if (interfaceC49926Jic != null) {
                                interfaceC49926Jic.Gd0(globalDoodleConfig);
                            }
                            if (r5.globalDoodleConfig.getForbidSearchType() != EnumC49968JjI.DEFAULT.getType()) {
                                c49914JiQ.mData = r5;
                                return;
                            }
                        }
                    }
                    K k6 = c49914JiQ.LLIIIL.LJLILLLLZI;
                    if (k6 != 0) {
                        ((InterfaceC49926Jic) k6).H30(false);
                    }
                    if (c49914JiQ.LLIIL.booleanValue() && r5.resultStatus == 9) {
                        Gson LIZ = GsonHolder.LIZLLL().LIZ();
                        ISearchDebugService iSearchDebugService = (ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class);
                        GsonProtectorUtils.toJson(LIZ, (Object) r5);
                        GsonProtectorUtils.toJson(LIZ, c49914JiQ.mData);
                        iSearchDebugService.LJFF();
                        return;
                    }
                    if (r5.extra != null) {
                        C49920JiW LJ = C49921JiX.LJ(c49914JiQ.LJLJJI);
                        String str2 = r5.extra.dc;
                        LJ.getClass();
                        if (!o.LJ(LJ, C49567Jcp.LIZ)) {
                            LJ.LJJIL = str2;
                        }
                        long j = r5.extra.server_stream_time;
                        if (j >= 0) {
                            if (LJ.LIZLLL == -1) {
                                LJ.LIZLLL = j;
                            }
                            LJ.LJFF = j;
                        }
                        C49923JiZ LIZLLL = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                        long j2 = r5.extra.server_stream_time;
                        if (j2 < 0) {
                            LIZLLL.getClass();
                        } else {
                            if (LIZLLL.LJJIJIIJIL == -1) {
                                LIZLLL.LJJIJIIJIL = j2;
                            }
                            LIZLLL.LJJIJIL = j2;
                        }
                        String str3 = r5.extra.dc;
                        if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
                            LIZLLL.LJJIIZ = str3;
                        }
                    }
                    if (c49914JiQ.LLFZ != 5 && !c49914JiQ.LLIIII) {
                        C49951Jj1 c49951Jj1 = C49950Jj0.LJ;
                        Integer valueOf = Integer.valueOf(r5.ack);
                        if (c49951Jj1.LIZLLL == null) {
                            c49951Jj1.LIZLLL = valueOf;
                            if (valueOf == null) {
                                i = -2;
                            } else {
                                i = valueOf.intValue();
                            }
                            c49951Jj1.LIZ(Integer.valueOf(i), "is_hit_trunk");
                        }
                        if (r5.resultStatus == 2) {
                            c49914JiQ.LLIIJLIL = new LinkedList(r5.mItems);
                            C49914JiQ.LJJIL(0, r5);
                            c49914JiQ.LLI = true;
                            C49950Jj0.LJFF.LJFF = true;
                            c49914JiQ.LJJJJ(1);
                            C49919JiV c49919JiV2 = c49914JiQ.LLIIIL;
                            if (c49919JiV2.LJLIL != 0 && (k5 = c49919JiV2.LJLILLLLZI) != 0) {
                                ((InterfaceC49926Jic) k5).sN();
                            }
                            C49825Jgz.LJJIIZ(r5);
                            C49825Jgz.LJJIIJZLJL(r5);
                            LinkedList linkedList = new LinkedList(r5.mItems);
                            C49389JZx.LIZIZ(linkedList, c49914JiQ.LJZ, c49914JiQ.LJZI, r5.hasMore);
                            r5.mItems = linkedList;
                            c49914JiQ.mData = r5;
                            c49914JiQ.LJJIIZI(r5);
                            c49914JiQ.LLIIIL.oa(r5.globalDoodleConfig);
                            C49919JiV c49919JiV3 = c49914JiQ.LLIIIL;
                            if (c49919JiV3.LJLIL != 0 && c49919JiV3.LJLILLLLZI != 0 && c49919JiV3.LJJIIJ().isViewValid()) {
                                InterfaceC49926Jic interfaceC49926Jic2 = (InterfaceC49926Jic) c49919JiV3.LJLILLLLZI;
                                RESPONSE data = ((C49825Jgz) c49919JiV3.LJLIL).getData();
                                o.LJIIIIZZ(data, "mModel.data");
                                interfaceC49926Jic2.u80((SearchMixFeedList) data);
                            }
                            return;
                        }
                        if (r5.ack == -1) {
                            C49919JiV c49919JiV4 = c49914JiQ.LLIIIL;
                            if (c49919JiV4.LJLIL != 0 && (k4 = c49919JiV4.LJLILLLLZI) != 0) {
                                ((InterfaceC49926Jic) k4).o90();
                            }
                            c49914JiQ.LJJIJIL();
                            C49920JiW LJ2 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            LJ2.getClass();
                            if (!o.LJ(LJ2, C49567Jcp.LIZ)) {
                                LJ2.LJIIZILJ = 0;
                            }
                            c49914JiQ.LJJJJ(2);
                            c49914JiQ.LLIIIILZ = true;
                        }
                        if (r5.ack == 0) {
                            T t2 = c49914JiQ.mData;
                            if (t2 == 0 || ((SearchMixFeedList) t2).mItems == null || ((SearchMixFeedList) t2).mItems.size() <= 0) {
                                C49921JiX.LJ(c49914JiQ.LJLJJI).LJIJJLI = 2;
                                c49951Jj1.LIZIZ(6, 6, "chunk hit but no data");
                                return;
                            }
                            C49914JiQ.LJJJI((SearchMixFeedList) c49914JiQ.mData);
                            c49914JiQ.LJJIZ(r5);
                            C49920JiW LJ3 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            LJ3.LJIILJJIL();
                            if (!o.LJ(LJ3, C49567Jcp.LIZ)) {
                                LJ3.LJIIZILJ = 1;
                            }
                            C49923JiZ LIZLLL2 = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                            LIZLLL2.LJIIIZ();
                            if (!o.LJ(LIZLLL2, C49936Jim.LIZ)) {
                                LIZLLL2.LJIIIZ = 1;
                            }
                            c49914JiQ.LLIIIL.o10();
                            C49919JiV c49919JiV5 = c49914JiQ.LLIIIL;
                            if (c49919JiV5.LJLIL != 0 && c49919JiV5.LJLILLLLZI != 0 && c49919JiV5.LJJIIJ().isViewValid()) {
                                ((InterfaceC49926Jic) c49919JiV5.LJLILLLLZI).Dy();
                            }
                            c49914JiQ.LLIIIL.WN();
                            c49914JiQ.LLIIIL.LJJIIJZLJL();
                            c49914JiQ.LJJJJ(3);
                            c49914JiQ.LLIFFJFJJ = false;
                        }
                        if (r5.ack == 1) {
                            C49956Jj6.LIZLLL(r5, true);
                            C49920JiW LJ4 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            LJ4.getClass();
                            C49920JiW c49920JiW = C49567Jcp.LIZ;
                            if (!o.LJ(LJ4, c49920JiW)) {
                                LJ4.LJJIIZ = true;
                            }
                            C49923JiZ LIZLLL3 = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                            LIZLLL3.getClass();
                            C49923JiZ c49923JiZ = C49936Jim.LIZ;
                            if (!o.LJ(LIZLLL3, c49923JiZ)) {
                                LIZLLL3.LJJIJ = true;
                            }
                            List<ChunkPatch> list2 = r5.patchs;
                            if (list2 == null || list2.size() <= 0) {
                                C49921JiX.LJ(c49914JiQ.LJLJJI).LJIIIIZZ(EnumC49934Jik.INVALID_PATCH.ordinal());
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            ((SearchMixFeedList) c49914JiQ.mData).mItems = c49914JiQ.LLIIJLIL;
                            C49945Jiv c49945Jiv = C49945Jiv.LIZJ;
                            C49920JiW LJ5 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            C49923JiZ LIZLLL4 = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                            c49945Jiv.LIZ = LJ5;
                            c49945Jiv.LIZIZ = LIZLLL4;
                            c49945Jiv.LIZ(c49914JiQ.mData, r5.patchs);
                            T t3 = c49914JiQ.mData;
                            if (t3 == 0 || ((SearchMixFeedList) t3).mItems == null || ((SearchMixFeedList) t3).mItems.size() <= 0) {
                                C49921JiX.LJ(c49914JiQ.LJLJJI).LJIJJLI = 4;
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            C49920JiW LJ6 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            LJ6.getClass();
                            if (!o.LJ(LJ6, c49920JiW)) {
                                LJ6.LJJIJ = currentTimeMillis2;
                            }
                            C49923JiZ LIZLLL5 = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                            LIZLLL5.getClass();
                            if (!o.LJ(LIZLLL5, c49923JiZ)) {
                                LIZLLL5.LJJIJIIJI = currentTimeMillis2;
                            }
                            c49914JiQ.LJJJIL();
                            C49914JiQ.LJJJI((SearchMixFeedList) c49914JiQ.mData);
                            C49919JiV c49919JiV6 = c49914JiQ.LLIIIL;
                            if (c49919JiV6.LJLIL != 0 && c49919JiV6.LJLILLLLZI != 0 && c49919JiV6.LJJIIJ().isViewValid()) {
                                InterfaceC49926Jic interfaceC49926Jic3 = (InterfaceC49926Jic) c49919JiV6.LJLILLLLZI;
                                RESPONSE data2 = ((C49825Jgz) c49919JiV6.LJLIL).getData();
                                o.LJIIIIZZ(data2, "mModel.data");
                                interfaceC49926Jic3.J70((SearchMixFeedList) data2);
                            }
                            C49920JiW LJ7 = C49921JiX.LJ(c49914JiQ.LJLJJI);
                            LJ7.LJIILJJIL();
                            if (!o.LJ(LJ7, c49920JiW)) {
                                LJ7.LJIIZILJ = 1;
                            }
                            C49923JiZ LIZLLL6 = C49922JiY.LIZLLL(c49914JiQ.LJLJJI);
                            LIZLLL6.LJIIIZ();
                            if (!o.LJ(LIZLLL6, c49923JiZ)) {
                                LIZLLL6.LJIIIZ = 1;
                            }
                            c49914JiQ.LJJIZ(r5);
                            c49914JiQ.LLIIIL.LJJIIJZLJL();
                            c49914JiQ.LJJJJ(3);
                            c49914JiQ.LLIFFJFJJ = false;
                        }
                        if (r5.resultStatus == 4) {
                            if (!c49914JiQ.LLI && c49914JiQ.LLIFFJFJJ && c49914JiQ.getItems().size() > 0) {
                                c49914JiQ.LJJIJIL();
                            }
                            if (c49914JiQ.LLI && c49914JiQ.LLFZ == 1) {
                                c49914JiQ.LJJIJIL();
                                C49921JiX.LJ(c49914JiQ.LJLJJI).LJIJJLI = 3;
                            }
                            c49914JiQ.LJJJJ(4);
                            C49825Jgz.LJJIIZ(r5);
                            C49825Jgz.LJJIIJZLJL(r5);
                            if (c49914JiQ.LLIFFJFJJ) {
                                LinkedList linkedList2 = new LinkedList(r5.mItems);
                                C49389JZx.LIZIZ(linkedList2, c49914JiQ.LJZ, c49914JiQ.LJZI, r5.hasMore);
                                r5.mItems = linkedList2;
                                C49914JiQ.LJJIL(1, r5);
                                c49914JiQ.mData = r5;
                                C49914JiQ.LJJJI(r5);
                                c49914JiQ.LLIIIL.oa(r5.globalDoodleConfig);
                                C49919JiV c49919JiV7 = c49914JiQ.LLIIIL;
                                T t4 = c49919JiV7.LJLIL;
                                if (t4 != 0 && (k3 = c49919JiV7.LJLILLLLZI) != 0) {
                                    RESPONSE data3 = ((C49825Jgz) t4).getData();
                                    o.LJIIIIZZ(data3, "mModel.data");
                                    ((InterfaceC49926Jic) k3).gl((SearchMixFeedList) data3);
                                }
                                c49914JiQ.LJJIJLIJ((SearchMixFeedList) c49914JiQ.mData);
                                c49914JiQ.LLIFFJFJJ = false;
                                if (C79004UzY.LJJIFFI(r5.mItems) && (t = (c49919JiV = c49914JiQ.LLIIIL).LJLIL) != 0 && (k2 = c49919JiV.LJLILLLLZI) != 0) {
                                    RESPONSE data4 = ((C49825Jgz) t).getData();
                                    o.LJIIIIZZ(data4, "mModel.data");
                                    ((InterfaceC49926Jic) k2).yB((SearchMixFeedList) data4);
                                }
                            } else if (r5.mItems != null) {
                                C49914JiQ.LJJIL(2, r5);
                                LinkedList linkedList3 = new LinkedList(r5.mItems);
                                C49389JZx.LIZIZ(linkedList3, c49914JiQ.LJZ, c49914JiQ.LJZI, r5.hasMore);
                                r5.mItems = linkedList3;
                                T t5 = c49914JiQ.mData;
                                if (t5 != 0 && ((SearchMixFeedList) t5).mItems != null) {
                                    ((SearchMixFeedList) t5).mItems.addAll(linkedList3);
                                    ((SearchMixFeedList) c49914JiQ.mData).mBacktrace = r5.mBacktrace;
                                } else {
                                    c49914JiQ.mData = r5;
                                }
                                C49919JiV c49919JiV8 = c49914JiQ.LLIIIL;
                                T t6 = c49919JiV8.LJLIL;
                                if (t6 != 0 && (k = c49919JiV8.LJLILLLLZI) != 0) {
                                    RESPONSE data5 = ((C49825Jgz) t6).getData();
                                    o.LJIIIIZZ(data5, "mModel.data");
                                    ((InterfaceC49926Jic) k).yB((SearchMixFeedList) data5);
                                }
                                c49914JiQ.LJJIJLIJ((SearchMixFeedList) c49914JiQ.mData);
                            } else {
                                return;
                            }
                            C49950Jj0.LJFF.LJFF = false;
                        }
                        return;
                    }
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$6(Y.ARunnableS11S0201000_8 r8) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0201000_8.run$6(Y.ARunnableS11S0201000_8):void");
    }

    public static final void run$7(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        boolean LIZ;
        try {
            ((C47448Ijk) ((InterfaceC47447Ijj) aRunnableS11S0201000_8.l0)).LIZJ(((C48072Ito) aRunnableS11S0201000_8.l1).LJLJI.get(), 0L, ((C48072Ito) aRunnableS11S0201000_8.l1).LJLJJI.get());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        boolean LIZ;
        try {
            ((C47448Ijk) ((InterfaceC47447Ijj) aRunnableS11S0201000_8.l0)).LIZJ(((C48071Itn) aRunnableS11S0201000_8.l1).LJLJI.get(), 0L, ((C48071Itn) aRunnableS11S0201000_8.l1).LJLJJI.get());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS11S0201000_8 aRunnableS11S0201000_8) {
        boolean LIZ;
        JQX jqx;
        try {
            C49710Jf8 c49710Jf8 = ((TopFeedFragment) aRunnableS11S0201000_8.l0).LLJZ;
            if (c49710Jf8 != null) {
                Object LJJIZ = c49710Jf8.LJJIZ(aRunnableS11S0201000_8.i2);
                if ((LJJIZ instanceof JQX) && (jqx = (JQX) LJJIZ) != null) {
                    jqx.f((C49128JPw) aRunnableS11S0201000_8.l1);
                    return;
                }
                return;
            }
            o.LJIJI("searchRecyclerView");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S0201000_8(Callable callable, int i) {
        this.$t = i;
        this.l0 = null;
        this.l1 = callable;
        this.i2 = 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS11S0201000_8(int r2, java.lang.Object r3, java.lang.Object r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                case 2: goto L5;
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L10;
                case 6: goto L10;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L10;
                case 13: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.l1 = r3
            r0.l0 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r3
            r0.l1 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0201000_8.<init>(int, java.lang.Object, java.lang.Object, int):void");
    }

    public ARunnableS11S0201000_8(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
