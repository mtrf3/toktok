package X;

import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;

/* renamed from: X.WtX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83727WtX extends InterfaceC83192Wku {
    int B0(float f);

    void B9(String str, java.util.Map<Integer, Float> map);

    void C0(boolean z);

    void C9(InterfaceC83974WxW interfaceC83974WxW);

    void D0(boolean z);

    int D7(String[] strArr, int i);

    int D9();

    void E7(double d, double d2, double d3, double d4);

    void E9(String str, String str2, float f);

    void F7(double[] dArr, double d);

    void F9(C83743Wtn c83743Wtn);

    void G7(C29S c29s);

    void G9();

    void H7(boolean z, boolean z2, boolean z3, boolean z4);

    void H9(MessageCenter.Listener listener);

    int I1(String str, float f);

    int I3(String[] strArr, int i);

    void I9(String str);

    void J1(String[] strArr, double[] dArr, boolean[] zArr);

    void J3(int i, int i2, String str, String str2);

    int J8(String str, float f, float f2);

    boolean J9(VETouchPointer vETouchPointer, int i);

    void K1();

    void K3(double d, double d2, double d3, double d4);

    void K8(C84046Wyg c84046Wyg);

    void K9(WSU wsu);

    void L9(MessageCenter.Listener listener);

    void LJJIJL(int i, long j, long j2, String str);

    void LJJIJLIJ(boolean z);

    int[] LLII(String str, String str2);

    void LLIIII(double d, double d2, double d3, double d4);

    void LLIIIILZ();

    int LLIIIJ(String str, String str2);

    void M9(C83590WrK c83590WrK);

    void N9(double d);

    void O9(X0W x0w);

    int P9(String str, float f);

    void Q9(C29S c29s, String str, String str2);

    void R9(C29S c29s, String str, String str2, String str3);

    ICH S9();

    void T9();

    void U9(float f);

    HYA V9();

    void W9(IB4 ib4);

    void X9(float f, float f2);

    void Y9(float f, float f2);

    void Z9(float f, float f2);

    C78941UyX aa();

    void ba(float f, float f2, float f3, float f4, float f5);

    String ca();

    void da();

    VEFrame ea(String str);

    int fa(VEEffectFilterParam vEEffectFilterParam);

    void ga(int i, int i2, InterfaceC63955P8d interfaceC63955P8d);

    float getFilterIntensity(String str);

    void ha(InterfaceC83327Wn5 interfaceC83327Wn5);

    void ia();

    void ja(X0W x0w);

    void ka(float f, float f2, int i, int i2);

    void l3(int i, String str);

    void la();

    void ma(float f, float f2);

    void na(InterfaceC83327Wn5 interfaceC83327Wn5);

    int oa(List<String> list, List<? extends VEFrame> list2);

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f, float f2);

    void setARCoreParam(VEARCoreParam vEARCoreParam);

    void setDetectInterval(int i);

    void setFilter(String str);

    void setFilter(String str, float f);

    void setFilter(String str, String str2, float f, float f2, float f3);

    void setHandDetectLowpower(boolean z);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f, float f2);

    void t4(float f, float f2);

    int u3(String[] strArr, int i, String[] strArr2, int i2);

    void u4(boolean z);

    void v4(String str);

    void w4(boolean z);
}
