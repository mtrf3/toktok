package X;

import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;

/* renamed from: X.Wvj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83863Wvj {
    boolean D7(VEFocusSettings vEFocusSettings);

    void LIZ(AqS181S0100000_15 aqS181S0100000_15);

    boolean LIZIZ(float f);

    boolean LIZJ(VESize vESize);

    void LIZLLL();

    void LJ(boolean z);

    void LJFF(InterfaceC83737Wth interfaceC83737Wth, Cert cert);

    void LJI(boolean z);

    void LJII(HY2 hy2);

    void LJIIIIZZ(InterfaceC83737Wth interfaceC83737Wth);

    InterfaceC83859Wvf LJIIIZ();

    void LJIIJ(InterfaceC83991Wxn interfaceC83991Wxn);

    void LJIIJJI(PDD pdd);

    int LJIIL(int i, int i2, Integer num, InterfaceC65784Pro interfaceC65784Pro);

    void LJIILIIL(Cert cert);

    boolean LJIILJJIL(int i, float f, float[] fArr, int i2);

    Bundle LJIILL();

    void LJIILLIIL(Cert cert, boolean z);

    void LJIIZILJ(boolean z);

    void LJIJ(InterfaceC83996Wxs interfaceC83996Wxs);

    float LJIJI();

    boolean LJIJJ();

    void LJIJJLI(float f);

    void LJIL(EnumC83975WxX enumC83975WxX);

    void LJJ();

    void LJJI(int[] iArr);

    boolean LJJIFFI();

    void LJJII(VK8 vk8, Cert cert);

    void LJJIII(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    int LJJIIJ(boolean z, Boolean bool, Cert cert);

    void LJJIIJZLJL();

    void LJJIJ(P88 p88);

    void LJJIJIIJI(InterfaceC88472Yns<? super VECameraSettings.Builder, C76800UCe> interfaceC88472Yns);

    void LJJIJIIJIL(float[] fArr, double d);

    void LJJIJIL(int i, InterfaceC83737Wth interfaceC83737Wth, Cert cert);

    void LJJIJL(int i, InterfaceC83737Wth interfaceC83737Wth, Cert cert);

    void LJJIJLIJ(C83613Wrh c83613Wrh);

    int LJJIL(Cert cert);

    void LJJIZ(int i);

    void LJJJ(C83688Wsu c83688Wsu);

    C84133X0f LJJJI();

    void LJJJIL(int i);

    void LJJJJ(InterfaceC83737Wth interfaceC83737Wth);

    int LJJJJI();

    void LJJJJJ(int i);

    void LLJJIJIIJIL(boolean z);

    float LLJJJJJIL();

    boolean LLJJL(float f);

    boolean LLJJLIIIJLLLLLLLZ(float f, float f2);

    boolean LLJL();

    void LLLLLLLZIL(C83817Wuz c83817Wuz, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83737Wth interfaceC83737Wth, Cert cert);

    boolean LLLLLLZZ();

    void LLLLLZ(InterfaceC83996Wxs interfaceC83996Wxs);

    void LLLLLZL(int i);

    void LLLLZ(InterfaceC83991Wxn interfaceC83991Wxn);

    boolean LLLLZI();

    void LLLLZLL(int i);

    C63824P3c getCameraECInfo();

    int getCameraPosition();

    int getCameraPreviewHeight();

    int getCameraPreviewWidth();

    int getCameraState();

    String getCameraTypeString();

    List<Integer> getCameraZoomList();

    int getCurrentCameraType();

    int getFlashMode();

    boolean getHasSetFocusAreas();

    int getLastFlashMode();

    int getNextFlashMode();

    boolean isSupportedExposureCompensation();

    int p9(Cert cert);

    void setBodyBeautyLevel(int i);

    void setCameraPreviewSizeInterface(InterfaceC83997Wxt interfaceC83997Wxt);

    void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS);

    void setDeviceRotation(int i);

    void setExposureCompensation(int i);

    void setRecordMode(EnumC84128X0a enumC84128X0a);

    void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI);

    void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT);
}
