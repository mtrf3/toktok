package X;

import Y.AObjectS45S0101000_13;
import Y.AObjectS52S0101000_7;
import Y.AObjectS57S0101000_14;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.Surface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.setting.performance.CameraPureColorFakeFrameConfig;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitorV2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.runtime.VERuntime;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WrL */
/* loaded from: classes15.dex */
public class C83591WrL extends C83622Wrq<WRQ> implements WRQ {
    public C83576Wr6 LLLLLLL;
    public CreativeInfo LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public final C29901Fi<C76800UCe> LLLLLLLZIL;
    public final C29901Fi<C76800UCe> LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public Bundle LLLLLZIL;
    public boolean LLLLLZL;
    public final C29901Fi<C76800UCe> LLLLZ;
    public boolean LLLLZI;
    public InterfaceC83710WtG LLLLZIL;
    public boolean LLLLZLL;

    @Override // X.C83621Wrp
    public boolean LLZLL() {
        return true;
    }

    @Override // X.C83621Wrp, X.WLT
    public boolean v00(boolean z) {
        return false;
    }

    @Override // X.C83621Wrp, X.WLT
    public boolean zy(boolean z, boolean z2) {
        return false;
    }

    private JSONObject C2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio", false);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    private void f3() {
        this.LLLLLLZ.LJII(C76800UCe.LIZ);
    }

    private void h3() {
        this.LLLLZ.LJII(C76800UCe.LIZ);
    }

    private void w2() {
        File y = this.LLILZIL.mWorkspace.y();
        if (y.exists()) {
            if (y.exists() && y.isDirectory()) {
                if (y.listFiles() != null && y.listFiles().length != 0) {
                    return;
                }
            } else {
                return;
            }
        }
        for (int i = 0; i < this.LLILZIL.LIZIZ().size(); i++) {
            if (C76917UGr.LJJJJJ(this.LLILZIL.LIZIZ().get(i))) {
                e8().LLZZZIL(null, null);
            }
        }
    }

    @Override // X.C83622Wrq
    public boolean F1() {
        if (this.LLLLZI) {
            return false;
        }
        return C52531KjX.LIZ();
    }

    @Override // X.C83621Wrp
    public void LJFF() {
        if (C43150Gwc.LIZIZ) {
            C43150Gwc.LIZIZ = false;
            C43150Gwc.LIZLLL("camera_success");
        }
    }

    @Override // X.C83621Wrp
    public InterfaceC83927Wwl LLJI() {
        int i;
        if (V16.LJJ((ShortVideoContext) this.LJLIL.LJ(ShortVideoContext.class, null))) {
            i = 2;
        } else {
            i = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokCameraCoreComponent,createRecordContext,type:");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
        return new C83923Wwh(i, this.LLILZIL, super.LLJI());
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLLLIL() {
        if (this.LLJLIL.LJJ && e1.LIZ(31744, "studio_resolve_surface_destroy_event_with_lifecycle_check", true, true)) {
            if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                super.LLLLLIL();
                return;
            }
            return;
        }
        super.LLLLLIL();
    }

    @Override // X.C83621Wrp
    public void LLLZIIL() {
        C170666ms.LIZIZ("initDuetAndReaction() called");
        w2();
        super.LLLZIIL();
    }

    @Override // X.C83621Wrp
    public void LLLZLL() {
        C170666ms.LIZIZ("initMediaProcess() called");
        super.LLLZLL();
    }

    @Override // X.C83621Wrp
    public void c1() {
        C170666ms.LIZIZ("resetAllPlayStatus() called");
        super.c1();
        HB4.LIZLLL();
    }

    private void c3() {
        C83625Wrt jL = jL();
        InterfaceC83710WtG observer = this.LLLLZIL;
        jL.getClass();
        o.LJIIIZ(observer, "observer");
        ((ArrayList) jL.LIZ).add(observer);
    }

    private void e3() {
        int currentCameraType = rX().getCameraController().getCurrentCameraType();
        if (currentCameraType == -1 || currentCameraType != VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal() || !this.LLLLLLLLLL) {
            return;
        }
        this.LLLLLLLLLL = false;
        this.LLLLLLLZIL.LJII(C76800UCe.LIZ);
    }

    @Override // X.C83621Wrp
    public void K0() {
        super.K0();
        if (C45869HzN.LIZ()) {
            G8G.LIZ.end(CameraFirstFramePerformanceMonitorV2.INSTANCE, "effect frame available");
        } else {
            G8G.LIZ.end(CameraFirstFramePerformanceMonitor.INSTANCE, "effect frame available");
        }
    }

    @Override // X.C83621Wrp
    public void LLJJJIL() {
        super.LLJJJIL();
        C170666ms.LIZIZ("closeWavFile() called");
    }

    @Override // X.C83621Wrp
    public void LLJLIL() {
        super.LLJLIL();
        C170666ms.LIZIZ("lackPermission() called");
        C43882HKc.LJ("checkPermission", 1, C2());
    }

    @Override // X.C83621Wrp
    public void LLJLLIL() {
        super.LLJLLIL();
        if (C45869HzN.LIZ()) {
            G8G.LIZ.step("av_camera_open_init", "camera open start");
        } else {
            G8G.LIZ.step("av_video_record_init", "camera open start");
        }
    }

    @Override // X.C83621Wrp
    public void LLLFZ() {
        super.LLLFZ();
        G8G.LIZ.end("av_video_record_change_camera", "changeCamera#onFirstFrame");
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLLLJLJLL() {
        super.LLLLLJLJLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: ");
        LIZ.append(this.LLLLL);
        LIZ.append(" isOpenCameraSuccess: ");
        LIZ.append(this.LLLLLILLIL);
        LIZ.append(" cameraClosedByLive: ");
        C13860gY.LIZIZ(LIZ, this.LLLLLLZZ, LIZ);
    }

    @Override // X.C83621Wrp
    public void LLLZ() {
        super.LLLZ();
        if (this.LLILZIL.LJIILIIL()) {
            C170666ms.LIZIZ("initDuet() called");
        }
    }

    @Override // X.C83621Wrp
    public void h0() {
        super.h0();
        C44422Hc2.LIZ("extracting_frame", "extract_shot");
    }

    @Override // X.C83621Wrp
    public void j0() {
        super.j0();
        C44422Hc2.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Wrh] */
    @Override // X.C83621Wrp, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        rX().getCameraController().LJJIJLIJ(new InterfaceC88473Ynt() { // from class: X.Wrh
            @Override // X.InterfaceC88473Ynt
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C83591WrL.Y2(C83591WrL.this, (Integer) obj, (Integer) obj2, (String) obj3);
            }
        });
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_CREATE);
    }

    @Override // X.C83622Wrq, X.C83621Wrp, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        VERuntime.getInstance().enableRefactorRecorder(false);
        VERuntime.getInstance().enableAudioCapture(false);
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_DESTROY);
        C83625Wrt jL = jL();
        InterfaceC83710WtG observer = this.LLLLZIL;
        jL.getClass();
        o.LJIIIZ(observer, "observer");
        ((ArrayList) jL.LIZ).remove(observer);
    }

    @Override // X.C83622Wrq, X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_PAUSE);
    }

    @Override // X.C83622Wrq, X.C83621Wrp, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_RESUME);
        if (!this.LLLLLZ) {
            rX().getCameraController().LJJ();
        }
        if (this.LLLLLZ) {
            this.LLLLLZ = false;
        }
        this.LLLLZLL = true;
    }

    @Override // X.WRQ
    public LiveEvent<C76800UCe> Bk() {
        return this.LLLLLLLZIL;
    }

    @Override // X.WRQ
    public boolean Or0() {
        return this.LLLLLLZZ;
    }

    @Override // X.WRQ
    public boolean VK() {
        return this.LLLLLZL;
    }

    @Override // X.WRQ
    public LiveEvent<C76800UCe> Wp0() {
        return this.LLLLZ;
    }

    @Override // X.WRQ
    public C83576Wr6 e20() {
        return this.LLLLLLL;
    }

    @Override // X.WRQ
    public LiveEvent<C76800UCe> iT() {
        return this.LLLLLLZ;
    }

    public static C76800UCe E2(C82622Wbi c82622Wbi) {
        Application application = ((Activity) c82622Wbi.LJ(C29S.class, null)).getApplication();
        Object value = new EJO().LIZ.getValue();
        o.LJIIIIZZ(value, "<get-customGson>(...)");
        XFY.LIZ(application, (Gson) value, C44172HVg.LJJII).LIZIZ(C65315PkF.LIZ());
        VERuntime.getInstance().setEffectJsonConfig(C31461Li.LIZJ("effect_sdk_config_settings", "", "getInstance().getStringV…nfigSettings::class.java)"));
        return C76800UCe.LIZ;
    }

    public static C76800UCe I2(InterfaceC83624Wrs interfaceC83624Wrs) {
        SettingsManager.LIZLLL().getClass();
        interfaceC83624Wrs.LJJIJLIJ(SettingsManager.LIZ("enable_use_effect", true));
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ C76800UCe R2(C83591WrL c83591WrL) {
        c83591WrL.LLIIZ.finish();
        return null;
    }

    public static /* synthetic */ C76800UCe V2(C83591WrL c83591WrL) {
        c83591WrL.LLIIZ.finish();
        return null;
    }

    private boolean z2(Cert cert) {
        String certToken;
        if (cert == null || (certToken = cert.certToken()) == null || TextUtils.isEmpty(certToken)) {
            return true;
        }
        List list = ((CameraPureColorFakeFrameConfig) C83602WrW.LIZIZ.getValue()).excludedList;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        C83728WtY c83728WtY = C83728WtY.LIZIZ;
        if (certToken.equals(c83728WtY.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_BY_ALBUM_CLOSE, null).certToken()) || certToken.equals(c83728WtY.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_BACK_FROM_CHOOSE_MUSIC_FAIL, null).certToken()) || certToken.equals(c83728WtY.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_SWITCH_BOTTOM_TAB, null).certToken())) {
            return false;
        }
        if (list.isEmpty() || !list.contains(certToken)) {
            return true;
        }
        return false;
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLFFI(int i) {
        super.LLLFFI(i);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("useVERecoder", Boolean.TRUE);
        C43882HKc.LIZLLL(0, "aweme_open_camera_error_rate", c6bk.LJ(), C48331Ixz.LJ());
        G8G.LIZ.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLI(int i) {
        if (C45869HzN.LIZ()) {
            G8G.LIZ.step("av_camera_open_init", "camera open success");
        } else {
            G8G.LIZ.step("av_video_record_init", "camera open success");
        }
        super.LLLI(i);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("useVERecoder", Boolean.TRUE);
        C43882HKc.LIZLLL(0, "aweme_open_camera_error_rate", c6bk.LJ(), C48331Ixz.LJ());
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLLJI(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: ");
        LIZ.append(this.LLLLL);
        LIZ.append(" isOpenCameraSuccess: ");
        LIZ.append(this.LLLLLILLIL);
        LIZ.append(" cameraClosedByLive: ");
        LIZ.append(this.LLLLLLZZ);
        H78.LIZ(X1D.LIZIZ(LIZ));
        C6BK c6bk = new C6BK();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("w = ");
        LIZ2.append(K5().getWidth());
        LIZ2.append("   h = ");
        LIZ2.append(K5().getHeight());
        c6bk.LIZ.put("camera_surface_view_size", X1D.LIZIZ(LIZ2));
        C43882HKc.LIZIZ("zoom_info_log", c6bk.LJ());
        super.LLLLJI(surface);
    }

    @Override // X.WRQ
    public void OP(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokCameraCoreComponent,onCameraModeTypeChanged,type:");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC83927Wwl recordContext = getRecordContext();
        if (recordContext instanceof C83923Wwh) {
            C83923Wwh c83923Wwh = (C83923Wwh) recordContext;
            c83923Wwh.LJLIL = i;
            boolean z = c83923Wwh.LJJJJJL() instanceof C83615Wrj;
        }
    }

    @Override // X.WRQ
    public void Q4(FilterBean filterBean) {
        String str;
        C83576Wr6 c83576Wr6 = this.LLLLLLL;
        if (filterBean != null) {
            c83576Wr6.getClass();
            if (C44659Hfr.LJ(filterBean)) {
                String str2 = c83576Wr6.LJII;
                if (str2 != null && (str = c83576Wr6.LJIIIIZZ) != null) {
                    c83576Wr6.LJI(str2, str, 1.0f);
                    c83576Wr6.LIZLLL(c83576Wr6.LJII, c83576Wr6.LJIIIIZZ);
                    c83576Wr6.LJII = null;
                    c83576Wr6.LJIIIIZZ = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new ComposerInfo(C44659Hfr.LIZIZ(filterBean, 0.0f), filterBean.getExtra(), String.valueOf(filterBean.getId()), ""));
                    c83576Wr6.LIZ.m(arrayList);
                }
                c83576Wr6.LIZJ = null;
                return;
            }
            c83576Wr6.LIZIZ.LIZ.setFilter("");
            return;
        }
        c83576Wr6.LIZIZ.LIZ.setFilter("");
    }

    @Override // X.C83621Wrp
    public void e0(long j) {
        super.e0(j);
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZJ()) {
            return;
        }
        GXR.LIZ("tool_performance_record_fetch_frames", UFE.LIZ(j, "duration").LIZ);
    }

    @Override // X.C83621Wrp
    public void k0(int i) {
        int memoryClass;
        C170666ms.LIZIZ(C0NY.LIZIZ("onNativeInitCallBack() called with: ret = [", i, "]"));
        super.k0(i);
        HB4.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentWidth:");
        LIZ.append(this.LLJILJIL);
        LIZ.append("    currentHeight:");
        String LIZ2 = C08380Uo.LIZ(LIZ, this.LLJILJILJ, "      availableMem:", LIZ);
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2);
            C29S c29s = this.LLIIZ;
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(c29s, "activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            LIZ3.append(Formatter.formatFileSize(c29s, memoryInfo.availMem));
            LIZ3.append(" currentPIDMem:");
            Context LLLLLIL = C16880lQ.LLLLLIL(this.LLIIZ);
            ActivityManager activityManager2 = (ActivityManager) C16880lQ.LLILL(LLLLLIL, "activity");
            if ((LLLLLIL.getApplicationInfo().flags & 1048576) != 0) {
                memoryClass = activityManager2.getLargeMemoryClass();
            } else {
                memoryClass = activityManager2.getMemoryClass();
            }
            LIZ3.append(Formatter.formatFileSize(LLLLLIL, memoryClass * 1024 * 1024));
            LIZ3.append("hasUsedMem:");
            LIZ3.append(Formatter.formatFileSize(C16880lQ.LLLLJI(this.LLIIZ.getApplication()), C16880lQ.LLJJL((ActivityManager) C16880lQ.LLILL(r6, "activity"), new int[]{Process.myPid()})[0].getTotalPrivateDirty() * 1024));
            LIZ2 = X1D.LIZIZ(LIZ3);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C170666ms.LIZJ(new Exception("init failed detail: " + LIZ2));
        if (C48331Ixz.LJ()) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", Integer.valueOf(i));
            c6bk.LIZ.put("errorDesc", "");
            c6bk.LIZ.put("exception", LIZ2);
            C43882HKc.LJ("aweme_camera_preview_init_fail", 1, c6bk.LJ());
        }
        C43150Gwc.LIZIZ("camera_error", "3", "native init failed , ve result = " + i);
    }

    @Override // X.C83622Wrq, X.InterfaceC82086WJm
    public void openCamera(Cert cert) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TAG openCamera cameraClosedByLive: ");
        LIZ.append(this.LLLLLLZZ);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        super.openCamera(cert);
        this.LLLLLLZZ = false;
    }

    @Override // X.WRQ
    public void r20(InterfaceC83737Wth interfaceC83737Wth) {
        C83817Wuz LIZ = C78594Usw.LIZ(0);
        e8().LLLLLLLZIL(LIZ, new AObjectS45S0101000_13(4, this, 6), interfaceC83737Wth, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_SWITCH_FROM_NOW, null));
        e8().getCameraController().LJ(C52264KfE.LIZ);
        int[] LJIILIIL = LIZ.LJIILIIL();
        e8().getMediaController().a9(new VESize(LJIILIIL[0], LJIILIIL[1]));
        e8().getMediaController().d9(WYC.LIZ(this.LLIIZ, false, this.LLILZIL));
    }

    @Override // X.C83621Wrp
    public void w0(int i) {
        CreativeInfo creativeInfo = this.LLLLLLLLL;
        if (creativeInfo != null) {
            this.LLLLLLL.LIZ.setRenderCacheString("CreationID", creativeInfo.getCreationId());
        }
        C170666ms.LIZIZ(C0NY.LIZIZ("onNativeInitCallBack() called with: ret = [", i, "]"));
        if (C48331Ixz.LJ()) {
            C43882HKc.LJ("aweme_camera_preview_init_fail", 0, null);
        }
        super.w0(i);
    }

    public static C76800UCe b3(C83591WrL c83591WrL, VECameraSettings.Builder builder) {
        builder.setDefaultZoomRatio(c83591WrL.e8().getCameraController().LJIJI());
        boolean z = C52264KfE.LIZ;
        builder.setDefaultZoomUsingZoomV2(z);
        if (z) {
            builder.setCameraZoomLimitFactor(1.0f);
            return null;
        }
        return null;
    }

    @Override // X.WRQ
    public void Bh(int i, int i2) {
        this.LLILLL.LIZIZ.pausePlayTrack(i, i2);
    }

    @Override // X.C83622Wrq, X.InterfaceC82086WJm
    public void C7(boolean z, Cert cert) {
        super.C7(z, cert);
        this.LLLLLLZZ = true;
    }

    @Override // X.C83621Wrp, X.WLT
    public void LLILII(float f, float f2) {
        float LIZJ;
        boolean z = C52264KfE.LIZ;
        if (!z) {
            f += 100.0f;
        }
        mi(false);
        if (f < 0.0f) {
            return;
        }
        C29S context = this.LLIIZ;
        o.LJIIIZ(context, "context");
        float LIZJ2 = f2 - KL2.LIZJ(context, 225.0f);
        if (z) {
            C29S context2 = this.LLIIZ;
            o.LJIIIZ(context2, "context");
            LIZJ = KL2.LIZJ(context2, 225.0f);
        } else {
            C29S context3 = this.LLIIZ;
            o.LJIIIZ(context3, "context");
            f -= KL2.LIZJ(context3, 35.0f);
            LIZJ = KL2.LIZJ(context3, 225.0f);
        }
        float f3 = f / (f2 - LIZJ);
        if (!C19N.LJ("enable_max_zoom_optimized", true) && f3 > 0.98f) {
            f3 = 1.0f;
        }
        Ya0(f3, LIZJ2);
    }

    @Override // X.C83621Wrp
    public void LLLILZLLLI(int i, int i2) {
        if (!this.LLJILLL) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("camera_preview_size", C48263Iwt.LIZLLL("w = ", i, "   h = ", i2));
            C43882HKc.LIZIZ("zoom_info_log", c6bk.LJ());
        }
        super.LLLILZLLLI(i, i2);
    }

    @Override // X.WRQ
    public void QP(C82298WRq c82298WRq, float f) {
        char c;
        int i;
        float f2;
        C83576Wr6 c83576Wr6 = this.LLLLLLL;
        c83576Wr6.getClass();
        if (f < 0.0f) {
            c = 65535;
        } else {
            c = 1;
        }
        int i2 = c82298WRq.LIZ;
        if (c == 65535) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            i = i2;
            i2 = i3;
        } else {
            int size = C44172HVg.LJJ.LJIILL().LJ().LIZJ().size();
            i = i2 + 1;
            if (i >= size) {
                i = size - 1;
            }
        }
        InterfaceC41983Gdn LJ = C44172HVg.LJJ.LJIILL().LJ();
        String LIZ = LJ.LIZ(i2);
        String LIZ2 = LJ.LIZ(i);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        c83576Wr6.LIZ.E9(LIZ, LIZ2, f2);
    }

    @Override // X.WRQ
    public void Rk(int i, int i2) {
        this.LLILLL.LIZIZ.removeTrack(i, i2);
    }

    @Override // X.WRQ
    public void a1(FilterBean filterBean, Float f) {
        float floatValue;
        C83576Wr6 c83576Wr6 = this.LLLLLLL;
        if (f == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f.floatValue();
        }
        c83576Wr6.getClass();
        if (filterBean == null) {
            return;
        }
        if (C44659Hfr.LJ(filterBean)) {
            String filterFolder = filterBean.getFilterFolder();
            String LIZJ = c83576Wr6.LIZJ();
            if (LIZJ != null) {
                String str = c83576Wr6.LJII;
                if (str != null) {
                    if (c83576Wr6.LJIIIIZZ != null) {
                        if (str.equals(filterFolder)) {
                            c83576Wr6.LJI(c83576Wr6.LJII, c83576Wr6.LJIIIIZZ, 1.0f);
                            c83576Wr6.LIZLLL(c83576Wr6.LJIIIIZZ);
                        } else if (c83576Wr6.LJIIIIZZ.equals(filterFolder)) {
                            c83576Wr6.LJI(c83576Wr6.LJII, c83576Wr6.LJIIIIZZ, 0.0f);
                            c83576Wr6.LIZLLL(c83576Wr6.LJII);
                        } else {
                            c83576Wr6.LIZLLL(c83576Wr6.LJII, c83576Wr6.LJIIIIZZ);
                            c83576Wr6.LIZ.LLIIJI(new ArrayList(), C83576Wr6.LIZ(filterBean, floatValue), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                        }
                    } else if (!str.equals(filterFolder) || c83576Wr6.LJI != 1.0f) {
                        c83576Wr6.LIZLLL(c83576Wr6.LJII);
                        c83576Wr6.LIZ.LLIIJI(new ArrayList(), C83576Wr6.LIZ(filterBean, floatValue), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                    }
                } else {
                    String str2 = c83576Wr6.LJIIIIZZ;
                    if (str2 != null) {
                        if (!str2.equals(filterFolder) || c83576Wr6.LJI != 0.0f) {
                            c83576Wr6.LIZLLL(c83576Wr6.LJIIIIZZ);
                            c83576Wr6.LIZ.LLIIJI(new ArrayList(), C83576Wr6.LIZ(filterBean, floatValue), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                        }
                    } else if (LIZJ.equals(filterFolder)) {
                        c83576Wr6.LIZ.P9(filterFolder, floatValue);
                    } else {
                        c83576Wr6.LIZ.LLIIJI(C83576Wr6.LIZ(c83576Wr6.LIZJ, 0.0f), C83576Wr6.LIZ(filterBean, floatValue), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                    }
                }
            } else {
                c83576Wr6.LIZ.LLIIJI(new ArrayList(), C83576Wr6.LIZ(filterBean, floatValue), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
            }
            c83576Wr6.LIZJ = filterBean;
            c83576Wr6.LJII = null;
            c83576Wr6.LJIIIIZZ = null;
            return;
        }
        c83576Wr6.LIZIZ.LIZ.setFilter(filterBean.getFilterFolder(), floatValue);
    }

    @Override // X.WRQ
    public void cY(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool == null) {
            if (!this.LLLLZLL) {
                return;
            }
            this.LLLLZLL = false;
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue() || this.LLILZIL.LJIIIIZZ() || this.LLILZIL.LJIIIZ()) {
            z = true;
        }
        e8().pauseEffectAudio(z);
        e8().w4(z);
    }

    @Override // X.C83622Wrq, X.InterfaceC82086WJm
    public void gJ(boolean z, Cert cert) {
        this.LLLLLZL = false;
        super.gJ(z, cert);
    }

    @Override // X.WRQ
    public int gk(int i, VETrackParams vETrackParams) {
        return this.LLILLL.LIZIZ.addTrack(i, vETrackParams);
    }

    @Override // X.C83621Wrp
    public void o0(int i, int i2) {
        C170666ms.LIZIZ(C0NY.LIZIZ("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [", i, "]"));
        super.o0(i, i2);
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel.mRestoreType == 0) {
            int i3 = cameraComponentModel.mHardEncode;
            SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
            edit.putInt("hard_encode", i3);
            WX6.LIZ(edit);
        }
        C60903NvH.LJIIJJI().LJJIL().setRecordUseSuccessRecordProfile(i2);
    }

    @Override // X.C83621Wrp
    public void r0(File file, int i) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i));
        c6bk.LIZIZ(Integer.valueOf(this.LLILZIL.LIZIZ().size()), "segment_count");
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = this.LLILZIL.LIZIZ().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getDuration());
            sb.append(",");
        }
        if (sb.length() == 0) {
            c6bk.LIZLLL("video_durations", "");
        } else {
            c6bk.LIZLLL("video_durations", sb.substring(0, sb.length() - 1));
        }
        c6bk.LIZJ(Long.valueOf(this.LLILZIL.mTotalRecordingTime), "total_duration");
        c6bk.LIZLLL("path", file.getPath());
        if (file.isDirectory()) {
            c6bk.LIZLLL("file_path", C78857UxB.LJJJJ(file.list()));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(this.LLLLLZIL.getInt("record_from", 0));
        c6bk.LIZLLL("enter_from", X1D.LIZIZ(LIZ));
        JSONObject LJ = c6bk.LJ();
        C43882HKc.LIZIZ("aweme_draft_edit_error", LJ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJ.toString());
        LIZ2.append(" RestoreType: ");
        LIZ2.append(this.LLILZIL.mRestoreType);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        super.r0(file, i);
    }

    @Override // X.C83622Wrq, X.InterfaceC82086WJm
    public void Er(boolean z, Cert cert, boolean z2) {
        if (((CameraPureColorFakeFrameConfig) C83602WrW.LIZIZ.getValue()).enable) {
            VERecorder vERecorder = this.LLILLL;
            vERecorder.LIZIZ.enablePreviewPureColorFakeFrame(z2(cert));
        }
        super.Er(z, cert, z2);
        this.LLLLLZL = true;
    }

    @Override // X.C83621Wrp, X.WLT
    public void In(WRT wrt, WRT wrt2, float f) {
        float f2;
        float f3;
        String str;
        String str2;
        String str3;
        String str4;
        C83576Wr6 c83576Wr6 = this.LLLLLLL;
        c83576Wr6.getClass();
        if (wrt == null || wrt2 == null) {
            return;
        }
        boolean LJ = C44659Hfr.LJ(wrt.LJLIL);
        boolean LJ2 = C44659Hfr.LJ(wrt2.LJLIL);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        if (LJ && LJ2) {
            if (f < 0.0f) {
                f3 = Math.abs(f);
            } else {
                f3 = 1.0f - f;
            }
            if (Math.abs(f) < 0.05f) {
                if (f <= 0.0f) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
            }
            if (c83576Wr6.LJI == f3) {
                return;
            }
            String filterFolder = wrt.LJLIL.getFilterFolder();
            String filterFolder2 = wrt2.LJLIL.getFilterFolder();
            String LIZJ = c83576Wr6.LIZJ();
            if (c83576Wr6.LJII == null && c83576Wr6.LJIIIIZZ == null) {
                if (Objects.equals(LIZJ, filterFolder)) {
                    c83576Wr6.LJII = LIZJ;
                } else if (Objects.equals(LIZJ, filterFolder2)) {
                    c83576Wr6.LJIIIIZZ = LIZJ;
                }
            }
            if (!Objects.equals(c83576Wr6.LJII, filterFolder) && (str3 = c83576Wr6.LJII) != null) {
                float f4 = c83576Wr6.LJI;
                if (f4 > 0.0f && f4 < 1.0f && (str4 = c83576Wr6.LJIIIIZZ) != null) {
                    c83576Wr6.LJI(str3, str4, 0.0f);
                    c83576Wr6.LJI = 0.0f;
                }
                c83576Wr6.LIZLLL(c83576Wr6.LJII);
                c83576Wr6.LJII = null;
            }
            if (!Objects.equals(c83576Wr6.LJIIIIZZ, filterFolder2) && (str = c83576Wr6.LJIIIIZZ) != null) {
                float f5 = c83576Wr6.LJI;
                if (f5 > 0.0f && f5 < 1.0f && (str2 = c83576Wr6.LJII) != null) {
                    c83576Wr6.LJI(str2, str, 1.0f);
                    c83576Wr6.LJI = 1.0f;
                }
                c83576Wr6.LIZLLL(c83576Wr6.LJIIIIZZ);
                c83576Wr6.LJIIIIZZ = null;
            }
            if (c83576Wr6.LJII == null) {
                c83576Wr6.LIZ.LLLLIIL(C83576Wr6.LIZ(wrt.LJLIL, wrt.LJLILLLLZI), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                c83576Wr6.LJII = filterFolder;
            }
            if (c83576Wr6.LJIIIIZZ == null) {
                c83576Wr6.LIZ.LLLLIIL(C83576Wr6.LIZ(wrt2.LJLIL, wrt2.LJLILLLLZI), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                c83576Wr6.LJIIIIZZ = filterFolder2;
            }
            c83576Wr6.LJI(c83576Wr6.LJII, c83576Wr6.LJIIIIZZ, f3);
            if (f3 == 0.0f) {
                if (c83576Wr6.LJII != null) {
                    c83576Wr6.LIZLLL(filterFolder);
                    c83576Wr6.LJII = null;
                }
                c83576Wr6.LIZJ = wrt2.LJLIL;
            }
            if (f3 == 1.0f) {
                if (c83576Wr6.LJIIIIZZ != null) {
                    c83576Wr6.LIZLLL(filterFolder2);
                    c83576Wr6.LJIIIIZZ = null;
                }
                c83576Wr6.LIZJ = wrt.LJLIL;
            }
            c83576Wr6.LJI = f3;
            return;
        }
        c83576Wr6.LIZ.setFilter(C82238WPi.LIZIZ(wrt.LJLIL), C82238WPi.LIZIZ(wrt2.LJLIL), f2, wrt.LJLILLLLZI, wrt2.LJLILLLLZI);
    }

    @Override // X.C83621Wrp
    public void LLJJL(int i, int i2, double d) {
        super.LLJJL(i, i2, d);
        StringBuilder LIZJ = C06460Ne.LIZJ("initWavFile() called with: sampleRate = [", i, "], channels = [", i2, "], speed = [");
        LIZJ.append(d);
        LIZJ.append("]");
        C170666ms.LIZIZ(X1D.LIZIZ(LIZJ));
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLJZIJLIL(int i, int i2, String str) {
        super.LLJZIJLIL(i, i2, str);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("useVERecoder", Boolean.TRUE);
        c6bk.LIZ.put("errorDesc", str);
        C43882HKc.LIZLLL(i2, "aweme_open_camera_error_rate", c6bk.LJ(), C48331Ixz.LJ());
    }

    @Override // X.C83622Wrq, X.C83621Wrp
    public void LLLIIIL(int i, int i2, String str) {
        super.LLLIIIL(i, i2, str);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("useVERecoder", Boolean.TRUE);
        c6bk.LIZ.put("errorDesc", str);
        C43882HKc.LIZLLL(i2, "aweme_open_camera_error_rate", c6bk.LJ(), C48331Ixz.LJ());
    }

    @Override // X.C83621Wrp
    public void LLLJ(boolean z, float f, List<Integer> list) {
        super.LLLJ(z, f, list);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("isDragEnable", Boolean.valueOf(z));
        c6bk.LIZ.put("mMaxZoom", Float.valueOf(f));
        c6bk.LIZ.put("mCameraZoomList", Boolean.valueOf(C32151Nz.LJJIIZI(list)));
        C43882HKc.LIZIZ("zoom_info_log", c6bk.LJ());
    }

    @Override // X.C83621Wrp
    public void LLLJIL(int i, float f, boolean z) {
        super.LLLJIL(i, f, z);
        C6BK c6bk = new C6BK();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" size = ");
        LIZ.append(f);
        c6bk.LIZ.put("camera_zoom_size", X1D.LIZIZ(LIZ));
        C43882HKc.LIZIZ("zoom_info_log", c6bk.LJ());
    }

    @Override // X.WRQ
    public void Wh0(C82298WRq c82298WRq, float f, InterfaceC148845sm interfaceC148845sm) {
        char c;
        int max;
        float f2;
        FilterBean filterBean;
        final C83576Wr6 c83576Wr6 = this.LLLLLLL;
        c83576Wr6.getClass();
        if (f < 0.0f) {
            c = 65535;
        } else {
            c = 1;
        }
        int i = c82298WRq.LIZ;
        int i2 = 0;
        if (c == 65535) {
            int i3 = i - 1;
            if (i3 >= 0) {
                i2 = i3;
            }
            max = i;
            i = i2;
        } else {
            max = Math.max(Math.min(C44172HVg.LJJ.LJIILL().LJ().LIZJ().size() - 1, i + 1), 0);
        }
        InterfaceC41983Gdn LJ = C44172HVg.LJJ.LJIILL().LJ();
        String LIZ = LJ.LIZ(i);
        String LIZ2 = LJ.LIZ(max);
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        List<FilterBean> LIZJ = C44172HVg.LJJ.LJIILL().LJ().LIZJ();
        FilterBean filterBean2 = null;
        if (max < LIZJ.size()) {
            filterBean = (FilterBean) ListProtector.get(LIZJ, max);
        } else {
            filterBean = null;
        }
        if (i < LIZJ.size()) {
            filterBean2 = (FilterBean) ListProtector.get(LIZJ, i);
        }
        InterfaceC122704ri interfaceC122704ri = new InterfaceC122704ri() { // from class: X.Hfq
            @Override // X.InterfaceC122704ri
            public final float LIZ(FilterBean filterBean3) {
                C83576Wr6 c83576Wr62 = C83576Wr6.this;
                c83576Wr62.getClass();
                float LIZLLL = C44659Hfr.LIZLLL(filterBean3);
                if (LIZLLL == 0.0f) {
                    return c83576Wr62.LIZ.getFilterIntensity(filterBean3.getFilterFolder());
                }
                return LIZLLL;
            }
        };
        if (filterBean2 != null && filterBean != null) {
            c83576Wr6.LIZ.setFilter(LIZ, LIZ2, f2, TML.LIZJ(filterBean2, interfaceC148845sm, interfaceC122704ri), TML.LIZJ(filterBean, interfaceC148845sm, interfaceC122704ri));
        }
    }

    @Override // X.WRQ
    public void X40(int i, int i2, long j) {
        this.LLILLL.LIZIZ.seekTrack(i, i2, j);
    }

    @Override // X.C83621Wrp, X.WLT
    public int Yo0(C82085WJl c82085WJl, Cert cert, String str) {
        G8G.LIZ.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.Yo0(c82085WJl, cert, str);
    }

    @Override // X.WRQ
    public void nu(int i, int i2, boolean z) {
        this.LLILLL.LIZIZ.startPlayTrack(i, i2, z);
    }

    @Override // X.C83621Wrp
    public void v0(String[] strArr, double[] dArr, boolean[] zArr) {
        super.v0(strArr, dArr, zArr);
        ClientCherEffectParam clientCherEffectParam = this.LLILZIL.veCherEffectParam;
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        if (clientCherEffectParam != null) {
            edit.putString("ve_cher_effect_param", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), clientCherEffectParam));
        } else {
            edit.remove("ve_cher_effect_param");
        }
        WX6.LIZ(edit);
    }

    @Override // X.C83622Wrq, X.InterfaceC82086WJm
    public int z6(boolean z, Cert cert, String str) {
        if (TextUtils.equals(str, "double_click")) {
            AnonymousClass632.LIZIZ(this.LLIIZ);
        }
        return super.z6(z, cert, str);
    }

    public C83591WrL(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, CreativeInfo creativeInfo, Effect effect) {
        this(c82622Wbi, cameraComponentModel, new C82040WHs((ShortVideoContext) c82622Wbi.LJ(ShortVideoContext.class, null)), creativeInfo, true, true, false, null, effect);
    }

    public static /* synthetic */ C76800UCe Y2(C83591WrL c83591WrL, Integer num, Integer num2, String str) {
        if (num.intValue() == 2 || num.intValue() == 1) {
            c83591WrL.h3();
            c83591WrL.e3();
        }
        if (num.intValue() == 1) {
            c83591WrL.f3();
            return null;
        }
        return null;
    }

    @Override // X.C83621Wrp
    public void d0(boolean z, int i, int i2, String str) {
        boolean LIZ = HR1.LIZ.LIZ(this.LLIIZ, this.LLLLLZIL);
        StringBuilder LIZ2 = C06830Op.LIZ("onCameraOpenFailed : errorCode,", i2, "msg :", str, " permission : ");
        LIZ2.append(LIZ);
        C43150Gwc.LIZIZ("camera_error", "3", X1D.LIZIZ(LIZ2));
        if (LIZ) {
            C83756Wu0.LIZ.LIZ(this.LLIIZ);
            return;
        }
        if (this.LLLLLZIL.containsKey("exterior_record_model") && ((ExteriorRecordModel) this.LLLLLZIL.getParcelable("exterior_record_model")).recordPageType.getType() == HR3.PHOTO_SEARCH.getType()) {
            HVR.LIZ.LJIIJ(this.LLIIZ, new AObjectS52S0101000_7(1, this, 6), new String[]{"android.permission.CAMERA"});
            return;
        }
        HVR.LIZ.LJIIIZ(this.LLIIZ, new AObjectS57S0101000_14(1, this, 0));
    }

    public C83591WrL(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, CreativeInfo creativeInfo, InterfaceC83697Wt3 interfaceC83697Wt3, Effect effect) {
        this(c82622Wbi, cameraComponentModel, new C82040WHs((ShortVideoContext) c82622Wbi.LJ(ShortVideoContext.class, null)), creativeInfo, true, true, false, interfaceC83697Wt3, effect);
    }

    public static C76800UCe H2(C82622Wbi c82622Wbi, int i, ShortVideoContext shortVideoContext, CameraComponentModel cameraComponentModel, C83593WrN c83593WrN) {
        long j;
        boolean z;
        EnumC83605WrZ enumC83605WrZ;
        boolean z2;
        ((Activity) c82622Wbi.LJ(C29S.class, null)).getApplication();
        C83148WkC c83148WkC = new C83148WkC("");
        Keva keva = C83148WkC.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c83148WkC.LIZ);
        LIZ.append("key_need_face_detect");
        boolean z3 = keva.getBoolean(X1D.LIZIZ(LIZ), false);
        if (z3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c83148WkC.LIZ);
            LIZ2.append("key_need_face_detect");
            keva.storeBoolean(X1D.LIZIZ(LIZ2), false);
        }
        c83593WrN.LJLIL = true;
        if (z3) {
            j = 1;
        } else {
            j = 0;
        }
        c83593WrN.LJLILLLLZI = j;
        c83593WrN.LJLJI = C78594Usw.LIZ(i);
        c83593WrN.LJZL = true;
        C82633Wbt c82633Wbt = c83593WrN.LJLJL;
        String str = c82633Wbt.LJLJI;
        String str2 = c82633Wbt.LJLILLLLZI;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z = true;
            c83593WrN.LJLJL.LJLJJLL = HLU.LIZIZ();
        } else {
            z = false;
        }
        c83593WrN.LJLJLJ.LJLIL = e1.LIZ(31744, "use_enhance_volume", true, false);
        if (shortVideoContext.creativeModel.recordDowngradeModel.bitrate != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("TikTokCameraCoreComponent downgrade_sticker_preview_resolution_tag resolution = ");
            LIZ3.append(shortVideoContext.cameraComponentModel.mVideoWidth);
            LIZ3.append("x");
            LIZ3.append(shortVideoContext.cameraComponentModel.mVideoHeight);
            H78.LIZ(X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("TikTokCameraCoreComponent downgrade_sticker_preview_resolution_tag bitrate = ");
            LIZ4.append(shortVideoContext.creativeModel.recordDowngradeModel.bitrate);
            H78.LIZ(X1D.LIZIZ(LIZ4));
            c83593WrN.LJLJLLL = new OSZ<>(Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoWidth), Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoHeight));
            c83593WrN.LJLJLJ.LJLILLLLZI = shortVideoContext.creativeModel.recordDowngradeModel.bitrate.floatValue() * 4.0f;
        } else {
            c83593WrN.LJLJLJ.LJLILLLLZI = C44739Hh9.LJI(false) * 4.0f;
        }
        c83593WrN.LJLJLJ.LJLJJI = C44739Hh9.LJII();
        C83595WrP c83595WrP = c83593WrN.LJLJLJ;
        int LIZ5 = IAL.LIZ();
        if (LIZ5 != 1) {
            if (LIZ5 != 2) {
                if (LIZ5 != 8) {
                    enumC83605WrZ = EnumC83605WrZ.AS_ENCODE_PROFILE_UNKNOWN;
                } else {
                    enumC83605WrZ = EnumC83605WrZ.AS_ENCODE_PROFILE_HIGH;
                }
            } else {
                enumC83605WrZ = EnumC83605WrZ.AS_ENCODE_PROFILE_MAIN;
            }
        } else {
            enumC83605WrZ = EnumC83605WrZ.AS_ENCODE_PROFILE_BASELINE;
        }
        c83595WrP.getClass();
        o.LJIIIZ(enumC83605WrZ, "<set-?>");
        c83595WrP.LJLJI = enumC83605WrZ;
        c83593WrN.LJLLI = true;
        c83593WrN.LLFFF = cameraComponentModel.enableFastCVLanczos;
        c83593WrN.LJLZ = new C83788WuW(1);
        c83593WrN.LLF = e1.LIZ(31744, "arcore_opt", true, false);
        c83593WrN.LL = true;
        c83593WrN.LJLLILLLL = true;
        c83593WrN.LJLLLLLL = e1.LIZ(31744, "enable_three_buffer", true, false);
        c83593WrN.LJLLJ = true;
        c83593WrN.LJLLL = true;
        c83593WrN.LLFII = ((Number) C52840KoW.LIZ.getValue()).intValue();
        if (C143225ji.LIZ() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        c83593WrN.LJLLLL = z2;
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "enable_camera_kit", true, false);
        return C76800UCe.LIZ;
    }

    @Override // X.C83621Wrp
    public void LLLJL(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        super.LLLJL(i, z, z2, f, list);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("cameraType", Integer.valueOf(i));
        c6bk.LIZ.put("supportZoom", Boolean.valueOf(z));
        c6bk.LIZ.put("supportSmooth", Boolean.valueOf(z2));
        c6bk.LIZ.put("maxZoom", Float.valueOf(f));
        if (C32151Nz.LJJIIZI(list)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(ListProtector.get(list, 0));
            LIZ.append("");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = " ";
        }
        c6bk.LIZ.put("ratios", str);
        C43882HKc.LIZIZ("zoom_info_log", c6bk.LJ());
    }

    public C83591WrL(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, CreativeInfo creativeInfo, boolean z, Effect effect) {
        this(c82622Wbi, cameraComponentModel, new C82040WHs((ShortVideoContext) c82622Wbi.LJ(ShortVideoContext.class, null)), creativeInfo, true, true, z, null, effect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01e2, code lost:
    
        if (((com.bytedance.keva.Keva) r12.getValue()).getInt("camera_publish_facing", -1) != (-1)) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L2(final X.C82622Wbi r14, final com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r15, X.InterfaceC83790WuY r16, boolean r17, com.ss.android.ugc.aweme.creative.CreativeInfo r18, X.C83592WrM r19) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83591WrL.L2(X.Wbi, com.ss.android.ugc.aweme.shortvideo.CameraComponentModel, X.WuY, boolean, com.ss.android.ugc.aweme.creative.CreativeInfo, X.WrM):void");
    }

    @Override // X.C83621Wrp
    public void LLLL(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        long currentTimeMillis = System.currentTimeMillis() - C43994HOk.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("open camera to first frame cost = ");
        LIZ.append(currentTimeMillis);
        H7B.LJ(X1D.LIZIZ(LIZ));
        C45857HzB.LIZIZ(EnumC45860HzE.RECORD_ON_FIRST_FRAME);
        if (C45869HzN.LIZ()) {
            G8G.LIZ.step(CameraFirstFramePerformanceMonitorV2.INSTANCE, "camera frame available");
        } else {
            G8G.LIZ.step(CameraFirstFramePerformanceMonitor.INSTANCE, "camera frame available");
        }
        super.LLLL(eGLContext, i, i2, i3, i4, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C83591WrL(final X.C82622Wbi r18, final com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r19, final X.InterfaceC83790WuY r20, final com.ss.android.ugc.aweme.creative.CreativeInfo r21, boolean r22, boolean r23, final boolean r24, X.InterfaceC83697Wt3 r25, com.ss.android.ugc.effectmanager.effect.model.Effect r26) {
        /*
            r17 = this;
            X.Hic r9 = X.C44830Hic.LIZ
            X.Wu0 r10 = X.C83756Wu0.LIZ
            X.WrR r11 = new X.WrR
            r2 = r21
            r8 = r20
            r6 = r18
            r7 = r19
            r15 = r24
            r11 = r11
            r12 = r6
            r13 = r7
            r14 = r8
            r16 = r2
            r11.<init>()
            X.P7u r0 = X.C32151Nz.LJIILJJIL()
            X.C44172HVg.LIZLLL(r0)
            X.SFS r12 = new X.SFS
            r12.<init>()
            r13 = r25
            r14 = r26
            r5 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = 1
            r5.LLLLLLLLLL = r4
            X.1Fi r0 = new X.1Fi
            r0.<init>()
            r5.LLLLLLLZIL = r0
            X.1Fi r0 = new X.1Fi
            r0.<init>()
            r5.LLLLLLZ = r0
            r1 = 0
            r5.LLLLLLZZ = r1
            r5.LLLLLZ = r4
            r5.LLLLLZL = r1
            X.1Fi r0 = new X.1Fi
            r0.<init>()
            r5.LLLLZ = r0
            r5.LLLLZI = r1
            X.Wrc r0 = new X.Wrc
            r0.<init>(r5)
            r5.LLLLZIL = r0
            r5.LLLLZLL = r1
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r3 = 0
            java.lang.Object r0 = r6.LJ(r0, r3)
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r0 = X.C44231HXn.LIZ(r0, r6)
            r5.LLLLLZIL = r0
            r5.LLLLLLLLL = r2
            X.IAW r2 = r5.Jo0()
            com.ss.android.vesdk.VERecorder r1 = r5.LLILLL
            X.Wr6 r0 = new X.Wr6
            r0.<init>(r2, r1)
            r5.LLLLLLL = r0
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
            java.lang.Object r0 = r6.LJ(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContext) r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r0 = r0.initialModel
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig r0 = r0.recordPageOptionalConfig
            if (r0 == 0) goto L8c
        L86:
            r5.LLLLZI = r4
            r5.c3()
            return
        L8c:
            r4 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83591WrL.<init>(X.Wbi, com.ss.android.ugc.aweme.shortvideo.CameraComponentModel, X.WuY, com.ss.android.ugc.aweme.creative.CreativeInfo, boolean, boolean, boolean, X.Wt3, com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }
}
