package X;

import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VESize;

/* renamed from: X.WzY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC84100WzY extends P6Q {
    int LIZ();

    int LIZIZ(float f);

    boolean LIZJ(VESize vESize);

    void LIZLLL(X0Z x0z);

    void LJ();

    float LJFF();

    int LJII(VECameraSettings.CAMERA_FACING_ID camera_facing_id);

    int LJIIIZ(X07 x07);

    void LJIIJ();

    int LJIIJJI();

    void LJIIL();

    int LJIILIIL(VEFocusSettings vEFocusSettings);

    void LJIILJJIL(X0N x0n);

    void LJIILL(InterfaceC84139X0l interfaceC84139X0l);

    int LJIIZILJ(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode);

    int LJIJ(boolean z);

    int LJIJI();

    int LLJJLIIIJLLLLLLLZ(int i);

    int LLLIILIL();

    C63824P3c getCameraECInfo();

    VECameraSettings.CAMERA_FACING_ID getCameraFacing();

    boolean isSupportedExposureCompensation();

    void setExposureCompensation(int i);

    void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI);
}
