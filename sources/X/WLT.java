package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import java.util.List;

/* loaded from: classes15.dex */
public interface WLT extends C0I6 {
    public static final WLU LJL = WLU.LIZ;

    boolean A0();

    C0IB<Boolean> AJ();

    LiveEvent<Boolean> AW();

    boolean Al();

    LiveData<Float> Au();

    int B0(float f);

    void B9(String str, java.util.Map<Integer, Float> map);

    LiveEvent<Integer> Ch0();

    void Ci(boolean z);

    void D7(String[] strArr, int i);

    void DS(boolean z);

    boolean E4();

    LiveEvent<Long> EL();

    SavePhotoStickerInfo Ea0();

    void Eg();

    void GK(boolean z);

    void Gm0(boolean z);

    void HF(C83607Wrb c83607Wrb);

    LiveEvent<C76800UCe> HJ();

    void Hl(String str, String str2, boolean z);

    boolean Ho();

    LiveEvent<Boolean> Hv();

    int I1(String str, float f);

    void I3(String[] strArr, int i);

    void I70(float f);

    boolean IE();

    LiveEvent<C76800UCe> IQ();

    LiveEvent<C76800UCe> Ib0();

    void In(WRT wrt, WRT wrt2, float f);

    LiveEvent<C76800UCe> Is0();

    InterfaceC83852WvY Iu();

    void J2(boolean z);

    int J8(String str, float f, float f2);

    IAW Jo0();

    void Jr(boolean z);

    boolean Jx();

    View K5();

    void LJL();

    boolean LLFZ();

    void LLILII(float f, float f2);

    boolean LLJIJIL();

    void LLJJIJIIJIL(boolean z);

    int LLJJJ();

    boolean LLJJJJLIIL(boolean z);

    LiveData<HK7> LLL();

    void LLLLLILLIL();

    LiveEvent<WLF> M70();

    void MY(boolean z);

    InterfaceC83703Wt9 N3();

    LiveEvent<OSZ<Integer, Integer>> NG();

    int Nc();

    LiveEvent<Long> Nv();

    void Nw();

    InterfaceC83737Wth O0();

    VEDisplaySettings O7();

    int OQ(C82085WJl c82085WJl, Cert cert, String str, boolean z);

    void PY(V8S v8s);

    boolean Ph0(VESize vESize);

    void Q3(boolean z);

    C0IB<WXA> QR();

    void QT(int i);

    void R0(float f, float f2);

    void RN();

    void Rh(boolean z);

    void T6();

    void UB(boolean z, VK8 vk8, Cert cert);

    void VG(boolean z);

    long VL();

    LiveEvent<Boolean> VO();

    void Vo();

    LiveEvent<C76800UCe> Wl0();

    I8O Xi0();

    HC5 Xq();

    void Ya0(float f, float f2);

    int Yo0(C82085WJl c82085WJl, Cert cert, String str);

    LiveData<C2PU> ZM();

    LiveEvent<C157166Eu> ZU();

    LiveEvent<Long> Zy();

    LiveEvent<Long> aW();

    void bM(int i);

    C0IB<Boolean> bh();

    boolean c40();

    void ch(boolean z);

    void cj(int i);

    void detectDirtyLens(InterfaceC88471Ynr<? super Float, ? super Integer, C76800UCe> interfaceC88471Ynr);

    InterfaceC83624Wrs e8();

    LiveEvent<HY0> eX();

    List<String> f30();

    boolean f8();

    long fA();

    void gc0();

    int getCameraFacing();

    InterfaceC83727WtX getEffectController();

    int getFlashMode();

    int getNextFlashMode();

    InterfaceC83927Wwl getRecordContext();

    EnumC82528WaC getSpeed();

    Surface getSurface();

    SurfaceView getSurfaceView();

    void gq0(int i);

    Point gz();

    LiveData<Boolean> iU();

    C0IB<Boolean> ip0();

    void jP(C45314HqQ c45314HqQ);

    LiveEvent<Integer> kp();

    LiveEvent<C45314HqQ> kw();

    void l3(int i, String str);

    void ln(boolean z);

    LiveEvent<Integer> ln0();

    LiveEvent<C76800UCe> mX();

    LiveEvent<WTD> md0();

    void mi(boolean z);

    void n0(boolean z);

    String n40();

    WLV ng0();

    void o30(String str);

    boolean o9();

    LiveEvent<C82085WJl> oX();

    void oc();

    LiveEvent<C76800UCe> pM();

    boolean ph0();

    void pm(boolean z, Rect[] rectArr);

    void qA(boolean z);

    void qm0();

    C82127WLb r4();

    InterfaceC83867Wvn rX();

    C0IB<Double> ru0();

    void rz(Cert cert, boolean z);

    int s8(VEDisplaySettings vEDisplaySettings);

    void s9(int i);

    boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void setBodyBeautyLevel(int i);

    void setExposureSeekBarProgress(float f);

    void setFilter(String str);

    void setFilter(String str, float f);

    int setReshape(String str, float f, float f2);

    View sm0();

    void sp0(boolean z, C29901Fi<IA8> c29901Fi);

    void t4(float f, float f2);

    void tn0(InterfaceC84052Wym interfaceC84052Wym);

    void u3(String[] strArr, int i, String[] strArr2, int i2);

    LiveEvent<OSZ<Integer, Boolean>> uB();

    void uo(OSZ<String, Float> osz, OSZ<String, Float> osz2, float f);

    boolean v00(boolean z);

    LiveEvent<Boolean> vV();

    boolean vZ();

    boolean vf();

    void wy(C82085WJl c82085WJl);

    LiveEvent<OSZ<Integer, Float>> xV();

    LiveEvent<C76800UCe> xf0();

    void xh(boolean z);

    void y90(EnumC82528WaC enumC82528WaC);

    void ya(int i);

    boolean ym0();

    CameraComponentModel zZ();

    LiveEvent<Integer> ze();

    boolean zy(boolean z, boolean z2);
}
