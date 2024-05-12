package X;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public interface X10 {
    int LJJJJIZL();

    void LJJJJJ(int i);

    int LLJJJ();

    int LLJJJJ();

    float LLJJJJJIL();

    C84134X0g LLJJJJLIIL();

    void LLJJL();

    void LLJJLIIIJLLLLLLLZ(int i);

    boolean LLJL();

    int LLJLIL();

    Bundle LLJLILLLLZIIL(String str);

    void LLJLL(int i, int i2, PZA pza);

    void LLJLLIL(YR0 yr0);

    void LLJLLL();

    void LLJZ();

    void LLJZIJLIL(float f, InterfaceC87361YQj interfaceC87361YQj);

    void LLL(String str, boolean z);

    void LLLF();

    void LLLFF(C84151X0x c84151X0x);

    int LLLFFI();

    void LLLFZ(TECameraAlgorithmParam tECameraAlgorithmParam);

    void LLLI(int i);

    void LLLII(Cert cert);

    boolean LLLIIII();

    void LLLIIIIL(C87372YQu c87372YQu);

    TEFrameSizei LLLIIIL(float f, TEFrameSizei tEFrameSizei);

    int LLLIIL(int i);

    void LLLIILIL(Bundle bundle);

    void LLLIL();

    void LLLILZ(InterfaceC87361YQj interfaceC87361YQj, boolean z);

    int LLLILZJ(Cert cert);

    void LLLILZLLLI(int i, int i2);

    void LLLIZZ(boolean z);

    List<TEFrameSizei> LLLJ();

    int[] LLLJIL();

    void LLLJL(boolean z);

    void LLLL(float f);

    P6E LLLLII(P6E p6e);

    void LLLLIIIILLL(TEFrameRateRange tEFrameRateRange);

    void LLLLIIL();

    JSONObject LLLLIILL();

    void LLLLIILLL(InterfaceC63917P6r interfaceC63917P6r);

    void LLLLIL(float f);

    float LLLLILI();

    P7J LLLLJ();

    void LLLLJI();

    void LLLLL(P7J p7j);

    int LLLLLIL();

    void LLLLLILLIL();

    boolean LLLLLJIL();

    boolean LLLLLJLJLL();

    void LLLLLL(C84143X0p c84143X0p);

    void LLLLLLIL();

    int LLLLLLJ();

    List<TEFrameSizei> LLLLLLL();

    int LLLLLLLLL();

    long[] LLLLLLLLLL();

    float[] LLLLLLLZIL();

    void LLLLLLZ(int i);

    void LLLLLLZZ(InterfaceC84149X0v interfaceC84149X0v);

    void LLLLLZ(float f, InterfaceC87361YQj interfaceC87361YQj);

    void LLLLLZIL(int i);

    void LLLLLZL(PZA pza);

    int[] LLLLZ();

    void LLLLZI(long j);

    void LLLLZIL();

    void LLLLZLL(TECameraAlgorithmParam tECameraAlgorithmParam);

    long LLLLZLLIL(boolean z);

    void LLLLZLLLI(P74 p74);

    void LLLZ(boolean z);

    int[] LLLZI();

    int LLLZIIL(C84134X0g c84134X0g, Cert cert);

    void LLLZIL(InterfaceC87361YQj interfaceC87361YQj);

    void LLLZL(int i);

    float[] LLLZLL();

    void LLLZLZ(boolean z);

    void LLLZZ();

    void LLLZZIL(boolean z);

    void LLZ();

    int[] LLZIL();

    void LLZILL(int i);

    void destroy();

    C63824P3c getCameraECInfo();

    int getFlashMode();

    Handler getHandler();

    boolean isSupportedExposureCompensation();

    void setDeviceRotation(int i);

    boolean setExposureCompensation(int i);

    void stopCapture();
}
