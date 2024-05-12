package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63D, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C63D extends C0I6 {
    void A20();

    LiveEvent<OSZ<Integer, Integer>> AM();

    LiveEvent<String> AN();

    void AZ(TextStickerData textStickerData);

    C10K<List<TextStickerCompileResult>> Ar(C1552367j c1552367j, ViewGroup viewGroup, boolean z);

    LiveEvent<OSZ<TextStickerData, Boolean>> Ba0();

    LiveEvent<C76800UCe> Bd0();

    void Bj0(AnonymousClass688 anonymousClass688);

    void Bp0(long j);

    void By();

    void D60(C67P c67p);

    void F3(InterfaceC1543363x interfaceC1543363x);

    void F8(boolean z);

    void Fq(TextStickerData textStickerData);

    void G7(TextStickerData textStickerData);

    LiveEvent<InfoStickerModel> Gj0();

    void Gq0(int i);

    void Gt(int i);

    C0IB<Boolean> H3();

    void H5(C67P c67p);

    void HQ(C68B c68b);

    List<C67P> Hi();

    C68B IG();

    LiveEvent<C67P> Jo();

    LiveData<OSZ<Float, Boolean>> Jy();

    void K3(boolean z);

    void K4(C67P c67p);

    boolean K60();

    InterfaceC147435qV LIZ();

    boolean LIZLLL();

    boolean LJIIIIZZ();

    void LJIIL(MutableLiveData<Boolean> mutableLiveData);

    void LJIILIIL(boolean z);

    boolean LJJIIZI(MotionEvent motionEvent);

    void LJJIJIIJIL(int i);

    boolean LJJIZ(float f);

    void LJJJJ();

    boolean LJJL();

    boolean LJJLIL(C82537WaL c82537WaL, float f, float f2);

    boolean LJLI(C82537WaL c82537WaL);

    boolean LJLIL();

    boolean LJLJI(float f);

    void LJLL();

    void LJLLLLLL(boolean z);

    List<C67P> LJZL();

    void LLIIIILZ();

    void LLILLIZIL(OSZ<Integer, Integer> osz);

    C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI();

    void LLILZ();

    void LLJLL();

    void LLLILZ(InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns);

    void LLLIZZ(boolean z);

    boolean LLLLILI();

    void LLLLLLJ(TextWatcher textWatcher);

    boolean LLLLLLLZIL(C82536WaK c82536WaK);

    void LLLLZ(InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> interfaceC88471Ynr);

    C29901Fi<C76800UCe> LLZZZZ();

    void M6();

    TextStickerData Mf0();

    void Mj(C67P c67p);

    C0IB<Boolean> N4();

    LiveEvent<C76800UCe> N70();

    void N80(C67P c67p);

    LiveEvent<OSZ<TextStickerData, String>> Np0();

    void Nu0(boolean z);

    void O90(String str);

    void OE(int i);

    LiveEvent<InterfaceC1543363x> Od();

    OSZ<Float, Float> P5(Context context);

    void P8(boolean z);

    void PN(C67P c67p);

    LiveEvent<View.OnClickListener> QH();

    C67P QZ();

    LiveData<OSZ<String, String>> Qc();

    LiveEvent<TextWatcher> Qn();

    void R7();

    TextWatcher RB();

    void Rm0();

    void Rx(List<TextStickerTextWrap> list);

    void S10(C67P c67p, Context context);

    List<TextStickerData> S2();

    List<InteractStickerStruct> S7(Context context, List<? extends StickerItemModel> list, Gson gson);

    ArrayList<TextStickerData> S80();

    void S9(InterfaceC1552467k interfaceC1552467k);

    void T3();

    LiveEvent<InterfaceC1552467k> T30();

    C29901Fi<C76800UCe> Tt0();

    void U60(C68G c68g);

    LiveEvent<C67P> Ua();

    List<C67P> Va0();

    LiveEvent<AnonymousClass688> Vh0();

    C29901Fi<Boolean> Vy();

    void W2(InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns);

    LiveEvent<C67P> W6();

    void WI(boolean z);

    LiveEvent<TextStickerData> Wl();

    int Wz();

    boolean X1();

    LiveEvent<C76800UCe> Yi0();

    boolean Zu0();

    void aR(C67P c67p, Integer num);

    LiveEvent<C76800UCe> ae0();

    void ao(boolean z);

    void b1(InfoStickerModel infoStickerModel);

    LiveEvent<C76800UCe> b10();

    LiveEvent<C76800UCe> b4();

    LiveEvent<Integer> c0();

    void c7(View.OnClickListener onClickListener);

    void c8(TextStickerData textStickerData, boolean z);

    LiveEvent<C67P> cb();

    LiveEvent<Integer> cl0();

    void cs0(TextStickerData textStickerData);

    void d2(boolean z);

    LiveEvent<InterfaceC1542963t> eC();

    LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> eM();

    LiveEvent<C76800UCe> ev0();

    void f80(C67P c67p);

    LiveEvent<Boolean> fF();

    void fL(float f, boolean z);

    LiveEvent<Integer> fZ();

    LiveEvent<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> fh0();

    C29901Fi<C76800UCe> fu();

    LiveData<TextStickerData> g3();

    void g5(boolean z);

    void gQ();

    boolean gY();

    String getTextContent();

    void gp();

    void gy(boolean z);

    void h6(boolean z);

    void h9(C67P c67p);

    LiveEvent<Boolean> hK();

    void hide();

    void hl0(OSZ<String, Integer> osz);

    LiveEvent<C76800UCe> i4();

    void i6(boolean z);

    LiveEvent<OSZ<C67P, Integer>> iX();

    void j();

    Iterator<C67P> kM();

    List<TextStickerData> kc0();

    C10K<List<TextStickerCompileResult>> kf(C1552367j c1552367j, ViewGroup viewGroup);

    LiveEvent<TextStickerData> kk0();

    LiveEvent<C76800UCe> l00();

    void l9(TextWatcher textWatcher);

    LiveEvent<Boolean> li0();

    void lp0(float f, boolean z);

    LiveEvent<C76800UCe> lu0();

    C67P mS();

    LiveEvent<Integer> mp();

    C0IB<C67P> nO();

    LiveEvent<C76800UCe> nV();

    LiveEvent<TextStickerData> nq0();

    C29901Fi<Boolean> o();

    LiveEvent<Boolean> ol();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    LiveEvent<C67P> ou();

    LiveEvent<C76800UCe> pk0();

    C29901Fi<Boolean> py();

    LiveEvent<Boolean> q20();

    void q5(InterfaceC1542963t interfaceC1542963t);

    int qV();

    LiveEvent<C76800UCe> qw();

    LiveEvent<C67P> rW();

    void setEnable(boolean z);

    void show();

    void so(boolean z);

    void t8();

    LiveEvent<InterfaceC88472Yns<C67P, C76800UCe>> tE();

    void uO();

    void uY(boolean z);

    LiveEvent<List<TextStickerTextWrap>> ud();

    LiveEvent<OSZ<String, Integer>> un();

    void vX(TextStickerData textStickerData);

    void wC(TextStickerData textStickerData);

    InteractStickerStruct wF(Context context, List<? extends StickerItemModel> list, Gson gson);

    void wR(C67P c67p);

    LiveEvent<Boolean> wa0();

    void wb(C67P c67p);

    boolean wj();

    void wk(TextStickerData textStickerData, String str);

    void xF(C29901Fi<C76800UCe> c29901Fi);

    void xS(boolean z, C67P c67p);

    LiveEvent<Boolean> y70();

    void yi0();

    LiveEvent<C67P> yr0();

    void z4(String str, String str2);
}
