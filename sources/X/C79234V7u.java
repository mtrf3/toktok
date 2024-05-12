package X;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.touchpoint.core.model.TextLink;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V7u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79234V7u implements C0K7 {
    public static String LJLIL;
    public static Boolean LJLILLLLZI;
    public static final C79234V7u LJLJI = new C79234V7u();

    public static String LJIJI(int i) {
        if (i == 0) {
            return "output";
        }
        if (i == 1) {
            return "like";
        }
        if (i == 3) {
            return "music";
        }
        if (i == 6) {
            return "effect";
        }
        if (i == 8) {
            return "favorite";
        }
        switch (i) {
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "recommend";
            case 14:
                return "private";
            case 15:
                return "repost";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 20:
                return "shop";
            case 17:
                return "ghost_music_tab";
            case 18:
                return "repost_history";
            case 19:
                return "stickers";
            case 21:
                return "business_page";
            default:
                return "";
        }
    }

    public static final float LJJIFFI(int i, int i2) {
        float f = i / i2;
        if (0.75f <= f && f <= 1.143f) {
            return (f * 4.0f) / 3.0f;
        }
        if (0.5f > f || f > 0.75f) {
            return 1.0f;
        }
        return 3.0f / (f * 4.0f);
    }

    public static final float LJJIII(int i, int i2) {
        float f = i / i2;
        double d = f;
        if (d <= 0.75d && d > 0.5625d) {
            return (f * 16.0f) / 9.0f;
        }
        if (d < 0.5625d) {
            return 9.0f / (f * 16.0f);
        }
        return 1.0f;
    }

    public static int LJIJJLI() {
        return C00F.LIZ(31744, 0, "optimize_disabledrawcount", true);
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isFastImport || C19N.LJ("ve_fast_import_ignore_recode", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(boolean z) {
        if (z && InterfaceC44798Hi6.LJFF.enableSplitConfig()) {
            return true;
        }
        return false;
    }

    public static final Fragment LJIIIZ(View view) {
        Fragment fragment;
        while (view != null) {
            Object tag = view.getTag(R.id.bq7);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                return fragment;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static String LJIIL(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".json")) {
            return "application/json";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    public static final C68212m1 LJIILJJIL(Fragment fragment) {
        Fragment parentFragment;
        Intent intent;
        C68212m1 LJIILJJIL;
        o.LJIIIZ(fragment, "<this>");
        Bundle arguments = fragment.getArguments();
        if ((arguments == null || (LJIILJJIL = TrackNodeStore.LIZLLL(fragment, arguments.getString("lib_track_rtn_id", null))) == null) && ((parentFragment = fragment.getParentFragment()) == null || (LJIILJJIL = LJIILJJIL(parentFragment)) == null)) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity == null || (intent = mo49getActivity.getIntent()) == null) {
                return null;
            }
            return LJIILIIL(intent, mo49getActivity);
        }
        return LJIILJJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC71003Rtn LJIILL(Object target) {
        o.LJIIIZ(target, "target");
        if (target instanceof View) {
            return C78948Uye.LJIILIIL((View) target);
        }
        InterfaceC71003Rtn interfaceC71003Rtn = null;
        if (target instanceof RecyclerView.ViewHolder) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) target;
            if (viewHolder instanceof InterfaceC71003Rtn) {
                return (InterfaceC71003Rtn) viewHolder;
            }
            View itemView = viewHolder.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            Object tag = itemView.getTag(R.id.cli);
            if (!(tag instanceof InterfaceC71003Rtn) || (interfaceC71003Rtn = (InterfaceC71003Rtn) tag) == null) {
                View itemView2 = viewHolder.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                return C78948Uye.LJIILIIL(itemView2);
            }
        } else if (target instanceof ActivityC45651qj) {
            C1AU c1au = (C1AU) target;
            Intent intent = c1au.getIntent();
            if (intent != null) {
                return LJIILIIL(intent, c1au);
            }
        } else if (target instanceof Fragment) {
            return LJIILJJIL((Fragment) target);
        }
        return interfaceC71003Rtn;
    }

    public static String LJIIZILJ(int i) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(LJLIL)) {
            return LJLIL;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(i);
            LIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new FileReader(X1D.LIZIZ(LIZ)));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            LJLIL = readLine;
            try {
                bufferedReader.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
            return readLine;
        } catch (Throwable unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            return null;
        }
    }

    public static String LJIJ(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final boolean LJJ(List list) {
        o.LJIIIZ(list, "<this>");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == EnumC195697m9.FAKE_TRAN_ING) {
                if (i == -1) {
                    return false;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    public static final boolean LJJI(Object obj) {
        if (obj instanceof Integer) {
            if (o.LJ(obj, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT))) {
                return false;
            }
        } else if (obj instanceof Float) {
            if (((Number) obj).floatValue() == Float.MIN_VALUE) {
                return false;
            }
        } else if (!(obj instanceof String) || o.LJ(obj, "invalid_str")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(VideoItemParams videoItemParams) {
        if (videoItemParams.getAweme().isAd()) {
            return false;
        }
        ISpecActService LJJJIL = SpecActServiceImpl.LJJJIL();
        Aweme aweme = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        String str = videoItemParams.mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        TextLink LJIL = LJJJIL.LJIL(aweme, str);
        if (LJIL == null) {
            return false;
        }
        videoItemParams.textLink = LJIL;
        return true;
    }

    public static String LJJIJ(View view) {
        o.LJIIIZ(view, "<this>");
        return TrackNodeStore.LJ(view, null).LJLIL;
    }

    public static final C2068389v LJJJJI(InterfaceC88472Yns interfaceC88472Yns) {
        C2068389v c2068389v = new C2068389v();
        interfaceC88472Yns.invoke(c2068389v);
        return c2068389v;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f2, code lost:
    
        if (r6.equals("zwnj") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00eb, code lost:
    
        if (r5 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        r3.append((char) r5);
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79234V7u.LJI(java.lang.String, boolean):java.lang.String");
    }

    public static String[] LJIIJ(XN6 xn6, String str) {
        AbstractC83571Wr1 abstractC83571Wr1;
        XN9<?, ?>[] LIZIZ = xn6.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset);
        if (LIZIZ == null) {
            return null;
        }
        XN9<?, ?> xn9 = LIZIZ[0];
        if (!(xn9 instanceof XNE) || xn9 == null || (abstractC83571Wr1 = (AbstractC83571Wr1) xn9.LIZ) == null) {
            return null;
        }
        String[] LJIIL = abstractC83571Wr1.LJIIL();
        ArrayList arrayList = new ArrayList();
        for (String str2 : LJIIL) {
            String LJ = a1.LJ(str, "/AmazingFeature/", str2);
            if (LJ != null) {
                arrayList.add(LJ);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final C68212m1 LJIILIIL(Intent intent, LifecycleOwner owner) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(owner, "owner");
        C68212m1 LIZLLL = TrackNodeStore.LIZLLL(owner, C16880lQ.LLJJIJIIJIL(intent, "lib_track_rtn_id"));
        if (LIZLLL == null) {
            android.net.Uri data = intent.getData();
            String str = null;
            if (data == null) {
                return null;
            }
            try {
                str = UriProtector.getQueryParameter(data, "lib_track_rtn_id");
            } catch (Throwable unused) {
            }
            return TrackNodeStore.LIZLLL(owner, str);
        }
        return LIZLLL;
    }

    public static final void LJIL(WMH hide, String str) {
        o.LJIIIZ(hide, "$this$hide");
        WM7 findSceneByTag = hide.findSceneByTag(str);
        if (findSceneByTag != null) {
            hide.hide(findSceneByTag);
        }
    }

    public static final Object LJJIIJZLJL(Object obj, C84629XJh c84629XJh) {
        if (obj == null) {
            return c84629XJh;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(c84629XJh);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(c84629XJh);
        return arrayList;
    }

    public static final void LJJIIZ(WMH remove, String tag) {
        o.LJIIIZ(remove, "$this$remove");
        o.LJIIIZ(tag, "tag");
        WM7 findSceneByTag = remove.findSceneByTag(tag);
        if (findSceneByTag != null) {
            remove.remove(findSceneByTag);
        }
    }

    public static final String LJJIIZI(InterfaceC71003Rtn interfaceC71003Rtn, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        return TrackNodeStore.LJFF(interfaceC71003Rtn, interfaceC88472Yns).LJLIL;
    }

    public static void LJJIJIL(Bundle bundle, View view) {
        o.LJIIIZ(view, "view");
        if (view.getParent() == null) {
            C78983UzD.LJIILL("slark, view.parent is null");
        }
        bundle.putString("lib_track_rtn_id", TrackNodeStore.LJ(view, null).LJLIL);
    }

    public static final void LJJIJL(Intent intent, String trackNodeId) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(trackNodeId, "trackNodeId");
        intent.putExtra("lib_track_rtn_id", trackNodeId);
    }

    public static final void LJJIJLIJ(Bundle bundle, String trackNodeId) {
        o.LJIIIZ(bundle, "<this>");
        o.LJIIIZ(trackNodeId, "trackNodeId");
        bundle.putString("lib_track_rtn_id", trackNodeId);
    }

    public static final void LJJIL(SmartRoute smartRoute, String id) {
        o.LJIIIZ(id, "id");
        smartRoute.withParam("lib_track_rtn_id", id);
    }

    public static final void LJJJ(WMH show, String str) {
        o.LJIIIZ(show, "$this$show");
        WM7 findSceneByTag = show.findSceneByTag(str);
        if (findSceneByTag != null) {
            show.show(findSceneByTag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CanvasVideoData LJJJI(C5VH c5vh, List list) {
        CanvasBackground LIZIZ;
        List LJJIJIL;
        o.LJIIIZ(c5vh, "<this>");
        if (c5vh.LIZIZ.getFirst().intValue() == c5vh.LIZIZ.getSecond().intValue()) {
            C142615ij c142615ij = CanvasBackground.Companion;
            int intValue = c5vh.LIZIZ.getFirst().intValue();
            c142615ij.getClass();
            LIZIZ = C142615ij.LIZ(intValue);
        } else {
            C142615ij c142615ij2 = CanvasBackground.Companion;
            int intValue2 = c5vh.LIZIZ.getFirst().intValue();
            int intValue3 = c5vh.LIZIZ.getSecond().intValue();
            c142615ij2.getClass();
            LIZIZ = C142615ij.LIZIZ(intValue2, intValue3);
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (list == null || list.isEmpty()) {
            LJJIJIL = C47261Igj.LJJIJIL(c5vh.LIZ);
        } else {
            LJJIJIL = ORZ.LLJILJILJ(list);
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(C47261Igj.LJJIJIL(c5vh.LIZ), LJJIJIL, LIZIZ, null, 0, null, 0, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
        CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
        canvasFilterParam.setScaleFactor(c5vh.LIZJ);
        canvasFilterParam.setClipIndex(0);
        canvasVideoData.putTransform(canvasFilterParam);
        float f = 0.0f;
        CanvasGestureConfig canvasGestureConfig = new CanvasGestureConfig(false, false, false, false, 0, false, 48, null);
        canvasVideoData.setExtra(new CanvasExtra(i, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, f, f, objArr2 == true ? 1 : 0, canvasGestureConfig, null, 0 == true ? 1 : 0, f, 0L, objArr == true ? 1 : 0, 8063, 0 == true ? 1 : 0));
        return canvasVideoData;
    }

    public static final void LJJIJIIJI(Bundle bundle, InterfaceC71003Rtn node, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(node, "node");
        bundle.putString("lib_track_rtn_id", TrackNodeStore.LJFF(node, interfaceC88472Yns).LJLIL);
    }

    public static final void LJJIJIIJIL(SmartRoute smartRoute, InterfaceC71003Rtn node, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(node, "node");
        smartRoute.withParam("lib_track_rtn_id", TrackNodeStore.LJFF(node, interfaceC88472Yns).LJLIL);
    }

    public static void LJJIZ(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f, f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CanvasVideoData LJJJIL(C5VH c5vh, List list, boolean z) {
        CanvasBackground LIZIZ;
        List LJJIJIL;
        o.LJIIIZ(c5vh, "<this>");
        if (c5vh.LIZIZ.getFirst().intValue() == c5vh.LIZIZ.getSecond().intValue()) {
            C142615ij c142615ij = CanvasBackground.Companion;
            int intValue = c5vh.LIZIZ.getFirst().intValue();
            c142615ij.getClass();
            LIZIZ = C142615ij.LIZ(intValue);
        } else {
            C142615ij c142615ij2 = CanvasBackground.Companion;
            int intValue2 = c5vh.LIZIZ.getFirst().intValue();
            int intValue3 = c5vh.LIZIZ.getSecond().intValue();
            c142615ij2.getClass();
            LIZIZ = C142615ij.LIZIZ(intValue2, intValue3);
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (list == null || list.isEmpty()) {
            LJJIJIL = C47261Igj.LJJIJIL(c5vh.LIZ);
        } else {
            LJJIJIL = ORZ.LLJILJILJ(list);
        }
        ForwardCanvasExtra forwardCanvasExtra = null;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        CanvasVideoData canvasVideoData = new CanvasVideoData(C47261Igj.LJJIJIL(c5vh.LIZ), LJJIJIL, LIZIZ, null, 0, null, 0, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
        if (c5vh.LIZJ != 1.0f && !C143225ji.LIZ()) {
            CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
            canvasFilterParam.setScaleFactor(c5vh.LIZJ);
            canvasFilterParam.setClipIndex(0);
            canvasVideoData.putTransform(canvasFilterParam);
        }
        if (z) {
            float f = 0.0f;
            canvasVideoData.setExtra(new CanvasExtra(i, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, f, f, objArr2 == true ? 1 : 0, new CanvasGestureConfig(false, false, false, false, 0, false, 48, null), forwardCanvasExtra, objArr7 == true ? 1 : 0, f, 0L, objArr == true ? 1 : 0, 8063, objArr6 == true ? 1 : 0));
        }
        return canvasVideoData;
    }

    public static final void LIZIZ(WMH addAndHide, int i, WM7 scene, String tag) {
        o.LJIIIZ(addAndHide, "$this$addAndHide");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(tag, "tag");
        addAndHide.beginTransaction();
        addAndHide.add(i, scene, tag);
        addAndHide.hide(scene);
        addAndHide.commitTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJII(X.V85 r12, X.C79238V7y r13, X.W8X r14, int r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79234V7u.LJII(X.V85, X.V7y, X.W8X, int):int");
    }

    public static final int LJIIJJI(EnumC53663L4h businessTag, L4T nodeType, L50 l50, String str) {
        C53514KzO c53514KzO;
        C53513KzN c53513KzN;
        o.LJIIIZ(businessTag, "businessTag");
        o.LJIIIZ(nodeType, "nodeType");
        if (str == null && ((!(l50 instanceof C53513KzN) || (c53513KzN = (C53513KzN) l50) == null || (str = c53513KzN.LJIIJJI) == null) && (!(l50 instanceof C53514KzO) || (c53514KzO = (C53514KzO) l50) == null || (str = c53514KzO.LJIILLIIL) == null))) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(businessTag.getString());
        LIZ.append(nodeType.getString());
        LIZ.append(str);
        return X1D.LIZIZ(LIZ).hashCode();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 int, still in use, count: 1, list:
          (r3v1 int) from 0x003c: INVOKE 
          (r2v0 android.text.SpannableString)
          (wrap:android.text.style.ForegroundColorSpan:0x0037: CONSTRUCTOR 
          (wrap:int:0x0031: INVOKE (r0v3 java.lang.Integer) VIRTUAL call: java.lang.Integer.intValue():int A[MD:():int (c), WRAPPED] (LINE:67108913))
         A[MD:(int):void (c), WRAPPED] (LINE:67108919) call: android.text.style.ForegroundColorSpan.<init>(int):void type: CONSTRUCTOR)
          (r4v1 int)
          (r3v1 int)
          (33 int)
         VIRTUAL call: android.text.SpannableString.setSpan(java.lang.Object, int, int, int):void A[MD:(java.lang.Object, int, int, int):void (c)] (LINE:67108924)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:95)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:79)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:163)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public static final android.text.SpannableString LJIJJ(android.content.Context r5, X.C86023Ze r6, java.lang.String r7, java.lang.String r8) {
        /*
            X.OSZ<java.lang.Integer, java.lang.Integer> r0 = r6.LJLJJLL
            if (r0 == 0) goto L42
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
        Le:
            if (r7 == 0) goto L40
            int r1 = r7.length()
        L14:
            int r3 = r8.length()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r7)
            if (r4 < 0) goto L3f
            if (r4 >= r1) goto L3f
            int r3 = r3 + r4
            int r0 = r3 + (-1)
            if (r0 < 0) goto L3f
            if (r0 >= r1) goto L3f
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r5)
            if (r0 == 0) goto L3f
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            r0 = 33
            r2.setSpan(r1, r4, r3, r0)
        L3f:
            return r2
        L40:
            r1 = 0
            goto L14
        L42:
            r4 = -1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79234V7u.LJIJJ(android.content.Context, X.3Ze, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static final float LJJII(int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        PointF pointF = new PointF(i, i2);
        PointF pointF2 = new PointF(i3, i4);
        if (z) {
            f = pointF2.y / pointF2.x;
            f2 = pointF.y / pointF.x;
            if (f <= f2) {
                return 1.0f;
            }
        } else {
            f = pointF2.y / pointF2.x;
            f2 = pointF.y / pointF.x;
            if (f <= f2) {
                return 1.0f;
            }
        }
        return f / f2;
    }

    public static final void LJFF(C86901Y8r c86901Y8r, Y4F y4f, int i, boolean z, int i2, C86895Y8l c86895Y8l) {
        boolean z2;
        o.LJIIIZ(c86901Y8r, "<this>");
        Iterator it = ((ArrayList) c86901Y8r.LIZ).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C79236V7w) it.next()).LIZ == 0) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        ((ArrayList) c86901Y8r.LIZIZ).add(new C79237V7x(y4f, i, i2, z, z2, c86895Y8l));
    }

    public static final void LIZLLL(C86901Y8r c86901Y8r, int i, String str, int i2, boolean z, boolean z2, C86898Y8o c86898Y8o) {
        o.LJIIIZ(c86901Y8r, "<this>");
        ((ArrayList) c86901Y8r.LIZ).add(new C79235V7v(i, str, i2, z, z2, c86898Y8o));
    }

    public static final InterfaceC35811ar LIZ(boolean z, boolean z2, C0X9 c0x9, InterfaceC21550sx interfaceC21550sx, float f, float f2, InterfaceC24520xk interfaceC24520xk, int i) {
        InterfaceC24760y8 LJJJJIZL;
        interfaceC24520xk.LJJIIJ(1097899920);
        InterfaceC35811ar LJIIL = C78949Uyf.LJIIL(c0x9, interfaceC24520xk, (i >> 6) & 14);
        InterfaceC24760y8<C11850dJ> LJIIIZ = interfaceC21550sx.LJIIIZ(z, z2, c0x9, interfaceC24520xk, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        if (!((Boolean) LJIIL.getValue()).booleanValue()) {
            f = f2;
        }
        if (z) {
            interfaceC24520xk.LJJIIJ(1685712037);
            LJJJJIZL = C07110Pr.LIZ(f, C1JI.LJJIJIIJIL(150, 0, null, 6), interfaceC24520xk);
            interfaceC24520xk.LJJIJIIJIL();
        } else {
            interfaceC24520xk.LJJIIJ(1685712135);
            LJJJJIZL = C78966Uyw.LJJJJIZL(new C23390vv(f2), interfaceC24520xk);
            interfaceC24520xk.LJJIJIIJIL();
        }
        InterfaceC35811ar LJJJJIZL2 = C78966Uyw.LJJJJIZL(new C0SX(((C23390vv) LJJJJIZL.getValue()).LJLIL, new C32691Qb(LJIIIZ.getValue().LIZ)), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LJJJJIZL2;
    }
}
