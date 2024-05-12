package X;

import Y.AObjectS123S0200000_7;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.Wrs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83624Wrs {
    void A9(boolean z);

    void B9(Cert cert);

    void C0(boolean z);

    void C7(boolean z, Cert cert);

    void C9(InterfaceC83974WxW interfaceC83974WxW);

    boolean D7(VEFocusSettings vEFocusSettings);

    void D9(C78862UxG c78862UxG, boolean z);

    void E9();

    void F9(IBA iba);

    void G9(int i, int i2, WS2 ws2);

    boolean H9();

    void I9(int i, C83639Ws7 c83639Ws7, Cert cert);

    void J1(String[] strArr, double[] dArr, boolean[] zArr);

    void J9(long j, long j2, String str, boolean z);

    void K8(C84046Wyg c84046Wyg);

    void K9(C83639Ws7 c83639Ws7, Cert cert);

    void L9(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> interfaceC88474Ynu);

    void LIZ(InterfaceC83707WtD interfaceC83707WtD);

    void LIZIZ(AqS173S0100000_7 aqS173S0100000_7);

    void LJJIJL(int i, long j, long j2, String str);

    void LJJIJLIJ(boolean z);

    void LJJJJJ(int i);

    boolean LLJIJIL();

    void LLJJIJIIJIL(boolean z);

    boolean LLJJJJLIIL(boolean z);

    boolean LLJJL(float f);

    boolean LLJJLIIIJLLLLLLLZ(float f, float f2);

    int LLLII(String str, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void LLLLLILLIL();

    void LLLLLJIL(C83932Wwq c83932Wwq, String str);

    void LLLLLJLJLL(InterfaceC83707WtD interfaceC83707WtD);

    void LLLLLL(int i, int i2);

    void LLLLLLIL(HJ0 hj0);

    void LLLLLLJ(InterfaceC83889Ww9 interfaceC83889Ww9);

    void LLLLLLL();

    void LLLLLLLLL(IAF iaf);

    void LLLLLLLLLL(boolean z);

    void LLLLLLLZIL(C83817Wuz c83817Wuz, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83737Wth interfaceC83737Wth, Cert cert);

    void LLLLLLZ();

    boolean LLLLLLZZ();

    void LLLLLZ(InterfaceC83996Wxs interfaceC83996Wxs);

    void LLLLLZL(int i);

    void LLLLZ(InterfaceC83991Wxn interfaceC83991Wxn);

    boolean LLLLZI();

    void LLLLZIL();

    void LLLLZLL(int i);

    void LLLLZLLIL(float f, float f2);

    void LLLLZLLLI(InterfaceC83889Ww9 interfaceC83889Ww9);

    void LLLZ(IAF iaf);

    void LLLZI(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> interfaceC88474Ynu);

    void LLLZZIL(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, boolean z2);

    void LLZ();

    void LLZIL();

    void LLZILL(InterfaceC83962WxK interfaceC83962WxK);

    void LLZL(boolean z);

    void LLZLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void LLZLL(double d, boolean z, float f, int i, int i2, AObjectS123S0200000_7 aObjectS123S0200000_7);

    int LLZLLIL(ActivityC45651qj activityC45651qj, I86 i86);

    boolean LLZLLLL();

    void LLZZ(InterfaceC88472Yns interfaceC88472Yns, boolean z);

    void LLZZJLIL(long j, long j2, String str, boolean z, boolean z2);

    int LLZZLLIL(C29S c29s, I86 i86);

    void LLZZZIL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns);

    void LLZZZZ(String str, double d, AObjectS123S0200000_7 aObjectS123S0200000_7);

    void a(InterfaceC83962WxK interfaceC83962WxK);

    boolean b(boolean z);

    boolean c(String str);

    void enableAudio(boolean z);

    InterfaceC83670Wsc getAudioController();

    int getBackCameraPos();

    InterfaceC83863Wvj getCameraController();

    C63824P3c getCameraECInfo();

    int getCameraPosition();

    int getCameraPreviewHeight();

    int getCameraPreviewWidth();

    String getCameraTypeString();

    List<Integer> getCameraZoomList();

    int getCurrentCameraType();

    Runnable getDataSourceVideoCompleteListener();

    VEDisplaySettings getDisplayingSettings();

    InterfaceC83727WtX getEffectController();

    long getEndFrameTimeUS();

    boolean getExposureCompensationEnable();

    int getFPS();

    int getFlashMode();

    int getFrontCameraPos();

    boolean getHasSetFocusAreas();

    long getInitRecorderTime();

    VEMapBufferInfo getIntermediatePathFromEffect();

    boolean getIsExposureSeekBarShowing();

    int getLastFlashMode();

    int getLastRecordFrameNum();

    LifecycleOwner getLifecycleOwner();

    float getMaxCameraZoom();

    InterfaceC83865Wvl getMediaController();

    int getNextFlashMode();

    InterfaceC83927Wwl getRecordContext();

    long getSegmentAudioLength();

    float[] getSuggestVolume();

    InterfaceC82309WSb getViewFunction();

    void init();

    boolean o9();

    void p9(Cert cert);

    void pauseEffectAudio(boolean z);

    void q9(HJ0 hj0);

    void r9(int i, C83660WsS c83660WsS, Cert cert);

    void s9(Cert cert, boolean z);

    void setARCoreParam(boolean z);

    void setAudioCaptureDevice(IC8 ic8);

    void setAudioDevice(IC8 ic8);

    void setAudioDevice(boolean z);

    void setBodyBeautyLevel(int i);

    void setCameraPreviewSizeInterface(InterfaceC83997Wxt interfaceC83997Wxt);

    void setCloseCameraListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS);

    void setDataSourceVideoCompleteListener(Runnable runnable);

    void setDetectInterval(int i);

    void setDeviceRotation(int i);

    void setDuetSupportChangeLayout(boolean z);

    void setExposureCompensation(int i);

    void setExposureCompensationEnable(boolean z);

    void setExposureSeekBarProgress(float f);

    void setFilter(String str);

    void setHandDetectLowpower(boolean z);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);

    void setMusicPath(String str);

    void setRecordMaxDuration(long j);

    void setRecordMode(EnumC84128X0a enumC84128X0a);

    void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI);

    void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT);

    void setUseAudioGraph(boolean z);

    void t8(Surface surface);

    InterfaceC83867Wvn t9();

    void u4(boolean z);

    void u8(Surface surface, String str, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void u9(Cert cert);

    void v9(InterfaceC83927Wwl interfaceC83927Wwl, C83733Wtd c83733Wtd);

    void w4(boolean z);

    void w9(CameraModule cameraModule);

    boolean x9();

    void y9();

    void z9(C83656WsO c83656WsO);
}
