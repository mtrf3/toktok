package X;

import Y.AObjectS123S0200000_7;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS8S0002000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wy0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84004Wy0 implements InterfaceC83865Wvl {
    public InterfaceC83970WxS LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final MutableLiveData<Boolean> LJ;
    public final List<InterfaceC83962WxK> LJFF;
    public final List<InterfaceC84052Wym> LJI;
    public final VERecorder LJII;
    public final InterfaceC83927Wwl LJIIIIZZ;
    public final VECameraSettings LJIIIZ;
    public final InterfaceC83697Wt3 LJIIJ;

    @Override // X.InterfaceC83865Wvl
    public final int I8(int i, int i2, String str, int i3, int i4, int i5, boolean z) {
        return 0;
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLZLLIL(ActivityC45651qj context, I86 i86) {
        o.LJIIIZ(context, "context");
        return 0;
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLZZLLIL(C29S context, I86 i86) {
        o.LJIIIZ(context, "context");
        return 0;
    }

    @Override // X.InterfaceC83865Wvl
    public final void setMusicPath(String str) {
    }

    @Override // X.InterfaceC83865Wvl
    public final int B8() {
        return this.LJII.LIZIZ.previewSeriousLagCount;
    }

    @Override // X.InterfaceC83865Wvl
    public final int C8() {
        return this.LJII.LIZIZ.recordLagCount;
    }

    @Override // X.InterfaceC83865Wvl
    public final int D8() {
        return this.LJII.LIZIZ.previewLagCount;
    }

    @Override // X.InterfaceC83865Wvl
    public final int E8() {
        return this.LJII.LIZIZ.previewLagMaxDuration;
    }

    @Override // X.InterfaceC83865Wvl
    public final float F8() {
        return this.LJII.LIZIZ.cameraOpenpreviewFirstNFrameIntervalsAverageMS;
    }

    @Override // X.InterfaceC83865Wvl
    public final void G8() {
        this.LJII.LIZIZ.setCameraFirstFrameOptimize(true);
    }

    @Override // X.InterfaceC83865Wvl
    public final int H8() {
        return this.LJII.LIZIZ.recordLagMaxDuration;
    }

    @Override // X.InterfaceC83865Wvl
    public final int K8() {
        return this.LJII.LIZIZ.recordSeriousLagCount;
    }

    @Override // X.InterfaceC83865Wvl
    public final void LIZ() {
        this.LJII.LIZIZ.stopPreview();
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZIL() {
        VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
        vEPrePlayParams.isLoop = true;
        InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syz music beat sticker startPrePlay oldPrePlayStatus:");
        LIZ.append(this.LIZJ);
        LJFF.LIZ(X1D.LIZIZ(LIZ));
        this.LIZJ = true;
        LIZIZ(false);
        this.LJII.LIZIZ.startPrePlay(vEPrePlayParams);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean LLZLLLL() {
        if (this.LJII.LIZIZ.getRecordStatus() == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83865Wvl
    public final VEDisplaySettings O7() {
        VEDisplaySettings displaySettings = this.LJII.LIZIZ.getDisplaySettings();
        o.LJIIIIZZ(displaySettings, "recorder.displaySettings");
        return displaySettings;
    }

    @Override // X.InterfaceC83865Wvl
    public final String[] P8() {
        return this.LJII.LIZIZ.getRecordedVideoPaths();
    }

    @Override // X.InterfaceC83865Wvl
    public final int U8() {
        return this.LJII.LIZIZ.getRecordCount();
    }

    @Override // X.InterfaceC83865Wvl
    public final int V8() {
        return this.LJII.LIZIZ.recordLagTotalDuration;
    }

    @Override // X.InterfaceC83865Wvl
    public final float W8() {
        return this.LJII.LIZIZ.recordFirstNFrameIntervalsAverageMS;
    }

    @Override // X.InterfaceC83865Wvl
    public final float X8() {
        return this.LJII.LIZIZ.previewRenderFps;
    }

    @Override // X.InterfaceC83865Wvl
    public final float Y8() {
        return this.LJII.LIZIZ.recordRenderFps;
    }

    @Override // X.InterfaceC83865Wvl
    public final float Z8() {
        return this.LJII.LIZIZ.previewFirstNFrameIntervalsAverageMS;
    }

    @Override // X.InterfaceC83865Wvl
    public final float e9() {
        return this.LJII.LIZIZ.recordWriteFps;
    }

    @Override // X.InterfaceC83865Wvl
    public final long getEndFrameTimeUS() {
        return this.LJII.LIZIZ.getSegmentFrameTimeUS();
    }

    @Override // X.InterfaceC83865Wvl
    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        P4Q.LJFF("VERecorder", "get intermediate path from effect");
        return vERecorder.LIZIZ.getMapBuffer();
    }

    @Override // X.InterfaceC83865Wvl
    public final int getLastRecordFrameNum() {
        return this.LJII.LIZIZ.getLastRecordFrameNum();
    }

    @Override // X.InterfaceC83865Wvl
    public final long getSegmentAudioLength() {
        return this.LJII.LIZIZ.getSegmentAudioUS();
    }

    @Override // X.InterfaceC83865Wvl
    public final float[] getSuggestVolume() {
        float[] aECSuggestVolume = this.LJII.LIZIZ.getAECSuggestVolume();
        o.LJIIIIZZ(aECSuggestVolume, "recorder.aecSuggestVolume");
        return aECSuggestVolume;
    }

    @Override // X.InterfaceC83865Wvl
    public final void x8() {
        this.LJII.LIZIZ.startRenderAsync(null);
    }

    @Override // X.InterfaceC83865Wvl
    public final int z8() {
        return this.LJII.LIZIZ.previewLagTotalDuration;
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZ() {
        InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syz music beat sticker stopPrePlay oldPrePlayStatus:");
        LIZ.append(this.LIZJ);
        LJFF.LIZ(X1D.LIZIZ(LIZ));
        this.LIZJ = false;
        VERecorder vERecorder = this.LJII;
        C83967WxP c83967WxP = new C83967WxP(this);
        vERecorder.getClass();
        C84013Wy9 c84013Wy9 = new C84012Wy8().LIZ;
        c84013Wy9.LIZ = false;
        vERecorder.LIZIZ.stopPrePlay(c83967WxP, c84013Wy9);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean O8() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83865Wvl
    public final LiveData<Boolean> R8() {
        return this.LJ;
    }

    @Override // X.InterfaceC83865Wvl
    public final void A8(InterfaceC84052Wym listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJI).remove(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final void L8(InterfaceC88472Yns<? super C87278YNe, C76800UCe> block) {
        C87278YNe c87278YNe;
        o.LJIIIZ(block, "block");
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LJII.LIZIZ.mVideoEncodeSettings;
        if (vEVideoEncodeSettings != null) {
            c87278YNe = new C87278YNe(vEVideoEncodeSettings);
        } else {
            c87278YNe = new C87278YNe(1);
        }
        block.invoke(c87278YNe);
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        o.LJIIIIZZ(LIZ, "builder.build()");
        this.LJII.LIZIZ.changeVideoEncodeSettings(LIZ);
    }

    public final void LIZIZ(boolean z) {
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            this.LJ.postValue(Boolean.valueOf(z));
        } else {
            this.LJ.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZILL(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJFF).add(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZL(boolean z) {
        this.LJII.LIZIZ.useMusic(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        VERecorder vERecorder = this.LJII;
        C84010Wy6 c84010Wy6 = new C84010Wy6(interfaceC88472Yns);
        vERecorder.getClass();
        vERecorder.LIZIZ.stopRecordAsync(new C84006Wy2(c84010Wy6));
    }

    @Override // X.InterfaceC83865Wvl
    public final void M8(VESafeAreaParams[] vESafeAreaParamsArr) {
        if (vESafeAreaParamsArr != null) {
            for (VESafeAreaParams vESafeAreaParams : vESafeAreaParamsArr) {
                InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
                StringBuilder LJ = C7MY.LJ("VEMediaController: setSafeArea type ", 0, " safeType ");
                LJ.append(vESafeAreaParams.safeType);
                LJ.append(" left ");
                LJ.append(vESafeAreaParams.left);
                LJ.append(' ');
                LJ.append("top ");
                LJ.append(vESafeAreaParams.top);
                LJ.append(" right ");
                LJ.append(vESafeAreaParams.right);
                LJ.append(" bottom ");
                LJ.append(vESafeAreaParams.bottom);
                LJFF.LIZJ(X1D.LIZIZ(LJ));
            }
        }
        this.LJII.LIZIZ.setSafeArea(0, vESafeAreaParamsArr);
    }

    @Override // X.InterfaceC83865Wvl
    public final void N8(float f) {
        L8(new C84009Wy5(f));
    }

    @Override // X.InterfaceC83865Wvl
    public final void S8(C83698Wt4 c83698Wt4) {
        this.LJII.LIZIZ.pauseRenderAsync(c83698Wt4);
    }

    @Override // X.InterfaceC83865Wvl
    public final void a(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJFF).remove(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final void a9(VESize vESize) {
        this.LJII.LIZIZ.changeRenderSize(vESize);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean b(boolean z) {
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        C63870P4w c63870P4w = new C63870P4w();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(z);
        LIZ.append("");
        c63870P4w.LIZJ("iesve_verecorder_use_sharedtexture", X1D.LIZIZ(LIZ));
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_use_sharedtexture", c63870P4w);
        return vERecorder.LIZIZ.setSharedTextureStatus(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void b9(InterfaceC84052Wym listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJI).add(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean c(String str) {
        if (this.LJII.LIZIZ.setEnableAEC(true, str) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83865Wvl
    public final void c9(C43873HJt c43873HJt) {
        this.LJII.LIZIZ.releaseGPUResourcesAsync(c43873HJt);
    }

    @Override // X.InterfaceC83865Wvl
    public final void d9(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LJII.LIZIZ.changeVideoEncodeSettings(vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC83865Wvl
    public final void enableAudio(boolean z) {
        this.LJII.LIZIZ.enableAudio(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final int s8(VEDisplaySettings settings) {
        o.LJIIIZ(settings, "settings");
        return this.LJII.LIZIZ.setDisplaySettings(settings);
    }

    @Override // X.InterfaceC83865Wvl
    public final void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        this.LIZ = interfaceC83970WxS;
    }

    @Override // X.InterfaceC83865Wvl
    public final void setRecordMaxDuration(long j) {
        this.LJII.LIZIZ.setRecordMaxDuration(j * 1000);
    }

    @Override // X.InterfaceC83865Wvl
    public final void t8(Surface surface) {
        this.LJII.LIZIZ.changeSurface(surface);
    }

    @Override // X.InterfaceC83865Wvl
    public final void w8(boolean z) {
        this.LJII.LIZIZ.enable34To916RatioForEffectRender(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void y8(C66882QMs c66882QMs) {
        this.LJII.LIZIZ.slamGetTextParagraphContent(c66882QMs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Wxz] */
    @Override // X.InterfaceC83865Wvl
    public final void LLZZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        if (!this.LIZLLL && this.LJIIIIZZ.LJJJJJL().LJIIJJI()) {
            return;
        }
        this.LIZLLL = false;
        VERecorder vERecorder = this.LJII;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns = new C84003Wxz(interfaceC88472Yns);
        }
        vERecorder.LIZIZ.stopPreviewAsync((InterfaceC84052Wym) interfaceC88472Yns, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.Wxz] */
    @Override // X.InterfaceC83865Wvl
    public final void LLZZZIL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEMediaController#deleteLastFrag, ");
        LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
        LJFF.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJII.LIZIZ.getRecordStatus() == 3) {
            LLZLI(new AqS118S0300000_14(this, interfaceC88472Yns, interfaceC65784Pro, 3));
            return;
        }
        VERecorder vERecorder = this.LJII;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns = new C84003Wxz(interfaceC88472Yns);
        }
        vERecorder.LIZIZ.deleteLastFrag((InterfaceC84052Wym) interfaceC88472Yns);
    }

    @Override // X.InterfaceC83865Wvl
    public final void T8(boolean z, Cert cert) {
        this.LIZIZ = z;
        this.LJII.LIZIZ.enableAudioRecorder(z, cert);
        if (!z) {
            InterfaceC83970WxS interfaceC83970WxS = this.LIZ;
            if (interfaceC83970WxS != null) {
                interfaceC83970WxS.LIZIZ();
            }
            InterfaceC83970WxS interfaceC83970WxS2 = this.LIZ;
            if (interfaceC83970WxS2 != null) {
                interfaceC83970WxS2.LJIJ();
            }
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void v8(int i, int i2) {
        L8(new AqS8S0002000_14(i, i2, 0));
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZZZ(String str, double d, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        InterfaceC83970WxS interfaceC83970WxS;
        boolean z = this.LIZIZ;
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C83998Wxu(this, str, d, aObjectS123S0200000_7, z, null), 2);
        if (z && (interfaceC83970WxS = this.LIZ) != null) {
            interfaceC83970WxS.LIZ();
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void u8(Surface surface, String deviceName, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(surface, "surface");
        o.LJIIIZ(deviceName, "deviceName");
        this.LIZLLL = true;
        this.LJII.LIZIZ.mCameraSettings = this.LJIIIZ;
        C84007Wy3 c84007Wy3 = new C84007Wy3(this, interfaceC88472Yns);
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LJIIJ;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_recorder_start_to_surface_create");
        }
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        vERecorder.LIZIZ.startPreviewAsync(surface, new C83981Wxd(c84007Wy3));
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLLII(String strImagePath, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(callback, "callback");
        VERecorder vERecorder = this.LJII;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        P8Y p8y = new P8Y(callback);
        vERecorder.getClass();
        vERecorder.LIZIZ.shotScreen(strImagePath, i, i2, false, true, compressFormat, new P8V(i, i2, System.currentTimeMillis(), p8y), true);
        return 0;
    }

    public C84004Wy0(VERecorder recorder, InterfaceC83927Wwl recorderContext, VECameraSettings cameraSettings, VECameraController cameraController, InterfaceC83697Wt3 interfaceC83697Wt3) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(cameraSettings, "cameraSettings");
        o.LJIIIZ(cameraController, "cameraController");
        this.LJII = recorder;
        this.LJIIIIZZ = recorderContext;
        this.LJIIIZ = cameraSettings;
        this.LJIIJ = interfaceC83697Wt3;
        this.LIZIZ = true;
        this.LJ = new MutableLiveData<>();
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
    }

    @Override // X.InterfaceC83865Wvl
    public final void J8(String str, String str2, boolean z, String str3, InterfaceC88472Yns interfaceC88472Yns) {
        HH1.LIZ(str, "videoPath", str2, "audioPath", str3, "description");
        if (z) {
            this.LJII.LIZ("", new C45438HsQ(interfaceC88472Yns));
        } else {
            this.LJII.LIZ(str3, new C45437HsP(interfaceC88472Yns));
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZJLIL(long j, long j2, String str, boolean z, boolean z2) {
        int i;
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC83962WxK) it.next()).LIZIZ(z2);
        }
        ((XFZ) C83739Wtj.LIZIZ()).LJFF().LIZ("syz setRecordBGM");
        VERecorder vERecorder = this.LJII;
        int i2 = (int) j;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        vERecorder.LIZIZ.setRecordBGM(str, i2, -1, i);
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC83962WxK) it2.next()).LIZ(z2);
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void Q8(List list, String videoDir, String str, int i, C83696Wt2 c83696Wt2) {
        o.LJIIIZ(videoDir, "videoDir");
        VERecorder vERecorder = this.LJII;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ASMediaSegment toVETimeSpeedModel = (ASMediaSegment) it.next();
            o.LJIIIZ(toVETimeSpeedModel, "$this$toVETimeSpeedModel");
            arrayList.add(new C84014WyA(toVETimeSpeedModel.speed, toVETimeSpeedModel.duration));
        }
        vERecorder.LIZIZ.tryRestoreAsync(arrayList, str, i, 2, c83696Wt2);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZLL(double d, boolean z, float f, int i, int i2, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        InterfaceC83970WxS interfaceC83970WxS;
        boolean z2 = this.LIZIZ;
        VERecorder vERecorder = this.LJII;
        float f2 = (float) d;
        C83999Wxv c83999Wxv = new C83999Wxv(this, aObjectS123S0200000_7, z2);
        vERecorder.getClass();
        vERecorder.LIZIZ.startRecordAsync(f2, new C84000Wxw(f2, c83999Wxv));
        if (z2 && (interfaceC83970WxS = this.LIZ) != null) {
            interfaceC83970WxS.LIZ();
        }
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLLZZIL(String strImagePath, int i, int i2, boolean z, Bitmap.CompressFormat format, InterfaceC88472Yns<? super Integer, C76800UCe> callback, boolean z2) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(format, "format");
        o.LJIIIZ(callback, "callback");
        C63966P8o c63966P8o = new C63966P8o();
        c63966P8o.LIZ.LIZJ = strImagePath;
        VESize vESize = new VESize(i, i2);
        C63965P8n c63965P8n = c63966P8o.LIZ;
        c63965P8n.LIZ = vESize;
        c63965P8n.LIZIZ = z;
        c63965P8n.LIZLLL = format;
        c63965P8n.LJI = new P8Y(callback);
        c63965P8n.LJ = z2;
        this.LJII.LJIILIIL(c63965P8n);
    }
}
