package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;

/* renamed from: X.5kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC143655kP extends C0I6 {
    void AE(C140415fB c140415fB);

    LiveData<Boolean> Av();

    InterfaceC133095Kf Ax();

    void Ay(int i);

    void BE();

    MutableLiveData<Bitmap> C0();

    LiveData<SurfaceView> D50();

    MutableLiveData<C5MM> DM();

    void Dl0(VEVolumeChangeOp vEVolumeChangeOp);

    LiveData<C140415fB> Dm();

    LiveData<OSZ<C76800UCe, String>> Dw();

    void Ea(C122144qo c122144qo);

    void Gd(boolean z, int i);

    LiveData<OSZ<C76800UCe, String>> Hi0();

    void I7(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    void Ic(String str);

    FrameLayout Iy();

    ArrayList<EffectPointModel> J7();

    boolean Jt0();

    LiveData<InterfaceC153045zY> Kh();

    void Kp(int i);

    void LA(VEPreviewMusicParams vEPreviewMusicParams, long j, long j2, long j3, long j4);

    void LJJIJL(int i, long j, long j2, String str);

    LiveData<OSZ<Boolean, Integer>> Lg0();

    MutableLiveData<C122144qo> Lo0();

    void MK(C5PF c5pf);

    void Ml(boolean z);

    void Mo0();

    MutableLiveData<C143405k0> Mq();

    void Mt0();

    C5S3 N40();

    void N6(boolean z);

    void Nj0(C143555kF c143555kF);

    LiveData<InterfaceC148845sm> Nm();

    void Nn0(boolean z);

    void Ot(boolean z, C143515kB c143515kB);

    void Ov(boolean z);

    MutableLiveData<C140335f3> PM();

    void PS(boolean z);

    void Pf0(boolean z);

    LiveData<OSZ<Boolean, Integer>> Qs();

    MutableLiveData<Boolean> Rq();

    void Ru();

    void S50();

    LiveData<Boolean> SW();

    StoredLiveData<C5RV> Sj0();

    LiveData<C76800UCe> TL();

    void U2(boolean z, boolean z2, boolean z3);

    void UE(String str);

    MutableLiveData<Integer> UR();

    void Uc(boolean z, int i);

    int V30();

    FilterBean W40();

    int W60();

    C5MG WS();

    LiveData<C76800UCe> We0();

    LiveData<Boolean> Xb0();

    void YM(int i);

    LiveData<Boolean> Zj0();

    void Zm(MutableLiveData<Integer> mutableLiveData);

    LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0();

    void aM(boolean z, int i);

    void ak(String str);

    LiveData<Void> bq0();

    ViewGroup.MarginLayoutParams cd();

    LiveData<Void> dZ();

    void dn(boolean z);

    void dq0();

    LiveData<C123754tP> eA();

    MutableLiveData<Integer> fc0();

    void finish();

    void go0();

    void gw(int i);

    LiveData<OSZ<Boolean, Integer>> he0();

    LiveData<C5RV> i3();

    void i90();

    LiveData<String> ij(int i);

    LiveData<OSZ<C76800UCe, String>> jC();

    LiveData<Boolean> jb();

    LiveData<VEPreviewMusicParams> jn();

    void jo(String str);

    LiveData<C76800UCe> kn0();

    void lN();

    int lU();

    void m70(boolean z);

    void nc0(boolean z);

    void oF(C140335f3 c140335f3);

    void p1();

    ReplayLiveData<C5RT> pJ();

    LiveData<C123774tR> pR();

    boolean pi();

    LiveData<C143495k9> pp0();

    LiveData<Boolean> q40();

    LiveData<Boolean> q60();

    boolean qF();

    LiveData<OSZ<Boolean, C143515kB>> qP();

    void rZ(boolean z);

    LiveData<C76800UCe> sI();

    LiveData<IAudioEffectParam> sP();

    LiveData<C76800UCe> sU();

    MutableLiveData<Boolean> tG();

    LiveData<C76800UCe> tH();

    LiveData<VEVolumeChangeOp> tZ();

    LiveData<Integer> tf();

    void tp(FilterBean filterBean, FilterBean filterBean2, float f);

    void tt0(C123754tP c123754tP);

    void uC(C123774tR c123774tR);

    void ul0(boolean z, int i);

    void updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);

    LiveData<InterfaceC122704ri> v50();

    LiveData<OSZ<Boolean, Integer>> vE();

    void wZ(boolean z);

    LiveData<Void> wf0();

    LiveData<VEEditorAutoStartStopArbiter> wz();

    MutableLiveData<Boolean> x7();

    boolean x70(VEPreviewMusicParams vEPreviewMusicParams);

    void x8();

    LiveData<OSZ<C76800UCe, String>> xm0();

    void y00();

    LiveData<Integer> zL();
}
