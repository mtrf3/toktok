package X;

import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WtW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83726WtW implements InterfaceC83727WtX {
    public final InterfaceC83727WtX LIZ;

    @Override // X.InterfaceC83727WtX
    public final int B0(float f) {
        return this.LIZ.B0(f);
    }

    @Override // X.InterfaceC83727WtX
    public final void B9(String resourcePath, java.util.Map<Integer, Float> intensityDict) {
        o.LJIIIZ(resourcePath, "resourcePath");
        o.LJIIIZ(intensityDict, "intensityDict");
        this.LIZ.B9(resourcePath, intensityDict);
    }

    @Override // X.InterfaceC83727WtX
    public final void C0(boolean z) {
        this.LIZ.C0(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void C9(InterfaceC83974WxW interfaceC83974WxW) {
        this.LIZ.C9(interfaceC83974WxW);
    }

    @Override // X.InterfaceC83727WtX
    public final void D0(boolean z) {
        this.LIZ.D0(z);
    }

    @Override // X.InterfaceC83727WtX
    public final int D7(String[] nodePaths, int i) {
        o.LJIIIZ(nodePaths, "nodePaths");
        return this.LIZ.D7(nodePaths, i);
    }

    @Override // X.InterfaceC83727WtX
    public final int D9() {
        return this.LIZ.D9();
    }

    @Override // X.InterfaceC83727WtX
    public final void E7(double d, double d2, double d3, double d4) {
        this.LIZ.E7(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void E9(String str, String str2, float f) {
        this.LIZ.E9(str, str2, f);
    }

    @Override // X.InterfaceC83727WtX
    public final void F7(double[] dArr, double d) {
        this.LIZ.F7(dArr, d);
    }

    @Override // X.InterfaceC83727WtX
    public final void F9(C83743Wtn c83743Wtn) {
        this.LIZ.F9(c83743Wtn);
    }

    @Override // X.InterfaceC83727WtX
    public final void G7(C29S context) {
        o.LJIIIZ(context, "context");
        this.LIZ.G7(context);
    }

    @Override // X.InterfaceC83727WtX
    public final void G9() {
        this.LIZ.G9();
    }

    @Override // X.InterfaceC83727WtX
    public final void H7(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ.H7(z, z2, z3, z4);
    }

    @Override // X.InterfaceC83727WtX
    public final void H9(MessageCenter.Listener messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        this.LIZ.H9(messageListener);
    }

    @Override // X.InterfaceC83727WtX
    public final int I1(String strRes, float f) {
        o.LJIIIZ(strRes, "strRes");
        return this.LIZ.I1(strRes, f);
    }

    @Override // X.InterfaceC83727WtX
    public final int I3(String[] nodePaths, int i) {
        o.LJIIIZ(nodePaths, "nodePaths");
        return this.LIZ.I3(nodePaths, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void I9(String str) {
        this.LIZ.I9(str);
    }

    @Override // X.InterfaceC83727WtX
    public final void J1(String[] strArr, double[] dArr, boolean[] zArr) {
        this.LIZ.J1(strArr, dArr, zArr);
    }

    @Override // X.InterfaceC83727WtX
    public final void J3(int i, int i2, String str, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        this.LIZ.J3(i, i2, str, arg3);
    }

    @Override // X.InterfaceC83727WtX
    public final int J8(String strRes, float f, float f2) {
        o.LJIIIZ(strRes, "strRes");
        return this.LIZ.J8(strRes, f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final boolean J9(VETouchPointer vETouchPointer, int i) {
        return this.LIZ.J9(vETouchPointer, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void K1() {
        this.LIZ.K1();
    }

    @Override // X.InterfaceC83727WtX
    public final void K3(double d, double d2, double d3, double d4) {
        this.LIZ.K3(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void K8(C84046Wyg c84046Wyg) {
        this.LIZ.K8(c84046Wyg);
    }

    @Override // X.InterfaceC83727WtX
    public final void K9(WSU wsu) {
        this.LIZ.K9(wsu);
    }

    @Override // X.InterfaceC83727WtX
    public final void L9(MessageCenter.Listener messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        this.LIZ.L9(messageListener);
    }

    @Override // X.InterfaceC83727WtX
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ.LJJIJL(i, j, j2, msg);
    }

    @Override // X.InterfaceC83727WtX
    public final void LJJIJLIJ(boolean z) {
        this.LIZ.LJJIJLIJ(z);
    }

    @Override // X.InterfaceC83727WtX
    public final int[] LLII(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        return this.LIZ.LLII(nodePath, nodeKey);
    }

    @Override // X.InterfaceC83727WtX
    public final void LLIIII(double d, double d2, double d3, double d4) {
        this.LIZ.LLIIII(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void LLIIIILZ() {
        this.LIZ.LLIIIILZ();
    }

    @Override // X.InterfaceC83727WtX
    public final int LLIIIJ(String key, String imagePath) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(imagePath, "imagePath");
        return this.LIZ.LLIIIJ(key, imagePath);
    }

    @Override // X.InterfaceC83192Wku
    public final void LLIIJI(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        this.LIZ.LLIIJI(list, list2, i);
    }

    @Override // X.InterfaceC83192Wku
    public final void LLILLL(List<ComposerInfo> list, int i) {
        this.LIZ.LLILLL(list, i);
    }

    @Override // X.InterfaceC83192Wku
    public final void LLLLIIL(List<ComposerInfo> list, int i) {
        this.LIZ.LLLLIIL(list, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void M9(C83590WrK c83590WrK) {
        this.LIZ.M9(c83590WrK);
    }

    @Override // X.InterfaceC83727WtX
    public final void N9(double d) {
        this.LIZ.N9(d);
    }

    @Override // X.InterfaceC83727WtX
    public final void O9(X0W landmarkListener) {
        o.LJIIIZ(landmarkListener, "landmarkListener");
        this.LIZ.O9(landmarkListener);
    }

    @Override // X.InterfaceC83727WtX
    public final int P9(String nodePath, float f) {
        o.LJIIIZ(nodePath, "nodePath");
        return this.LIZ.P9(nodePath, f);
    }

    @Override // X.InterfaceC83727WtX
    public final void Q9(C29S c29s, String str, String str2) {
        this.LIZ.Q9(c29s, str, str2);
    }

    @Override // X.InterfaceC83727WtX
    public final void R9(C29S c29s, String str, String str2, String str3) {
        this.LIZ.R9(c29s, str, str2, str3);
    }

    @Override // X.InterfaceC83727WtX
    public final ICH S9() {
        return this.LIZ.S9();
    }

    @Override // X.InterfaceC83727WtX
    public final void T9() {
        this.LIZ.T9();
    }

    @Override // X.InterfaceC83727WtX
    public final void U9(float f) {
        this.LIZ.U9(f);
    }

    @Override // X.InterfaceC83727WtX
    public final HYA V9() {
        return this.LIZ.V9();
    }

    @Override // X.InterfaceC83727WtX
    public final void W9(IB4 ib4) {
        this.LIZ.W9(ib4);
    }

    @Override // X.InterfaceC83727WtX
    public final void X9(float f, float f2) {
        this.LIZ.X9(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void Y9(float f, float f2) {
        this.LIZ.Y9(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void Z9(float f, float f2) {
        this.LIZ.Z9(f, f2);
    }

    @Override // X.InterfaceC83192Wku
    public final void a(List<ComposerInfo> list, int i) {
        this.LIZ.a(list, i);
    }

    @Override // X.InterfaceC83727WtX
    public final C78941UyX aa() {
        return this.LIZ.aa();
    }

    @Override // X.InterfaceC83727WtX
    public final void ba(float f, float f2, float f3, float f4, float f5) {
        this.LIZ.ba(f, f2, f3, f4, f5);
    }

    @Override // X.InterfaceC83727WtX
    public final String ca() {
        return this.LIZ.ca();
    }

    @Override // X.InterfaceC83727WtX
    public final void da() {
        this.LIZ.da();
    }

    @Override // X.InterfaceC83727WtX
    public final VEFrame ea(String str) {
        return this.LIZ.ea(str);
    }

    @Override // X.InterfaceC83727WtX
    public final int fa(VEEffectFilterParam vEEffectFilterParam) {
        return this.LIZ.fa(vEEffectFilterParam);
    }

    @Override // X.InterfaceC83727WtX
    public final void ga(int i, int i2, InterfaceC63955P8d interfaceC63955P8d) {
        this.LIZ.ga(i, i2, interfaceC63955P8d);
    }

    @Override // X.InterfaceC83727WtX
    public final float getFilterIntensity(String filterPath) {
        o.LJIIIZ(filterPath, "filterPath");
        return this.LIZ.getFilterIntensity(filterPath);
    }

    @Override // X.InterfaceC83727WtX
    public final void ha(InterfaceC83327Wn5 callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZ.ha(callback);
    }

    @Override // X.InterfaceC83192Wku
    public final void i(List<ComposerInfo> list, int i) {
        this.LIZ.i(list, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void ia() {
        this.LIZ.ia();
    }

    @Override // X.InterfaceC83192Wku
    public final void j() {
        this.LIZ.j();
    }

    @Override // X.InterfaceC83727WtX
    public final void ja(X0W landmarkListener) {
        o.LJIIIZ(landmarkListener, "landmarkListener");
        this.LIZ.ja(landmarkListener);
    }

    @Override // X.InterfaceC83192Wku
    public final void k() {
        this.LIZ.k();
    }

    @Override // X.InterfaceC83727WtX
    public final void ka(float f, float f2, int i, int i2) {
        this.LIZ.ka(f, f2, i, i2);
    }

    @Override // X.InterfaceC83192Wku
    public final InterfaceC45910I0c l() {
        return this.LIZ.l();
    }

    @Override // X.InterfaceC83727WtX
    public final void l3(int i, String strBeautyFaceRes) {
        o.LJIIIZ(strBeautyFaceRes, "strBeautyFaceRes");
        this.LIZ.l3(i, strBeautyFaceRes);
    }

    @Override // X.InterfaceC83727WtX
    public final void la() {
        this.LIZ.la();
    }

    @Override // X.InterfaceC83192Wku
    public final void m(List<ComposerInfo> list) {
        this.LIZ.m(list);
    }

    @Override // X.InterfaceC83727WtX
    public final void ma(float f, float f2) {
        this.LIZ.ma(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void na(InterfaceC83327Wn5 callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZ.na(callback);
    }

    @Override // X.InterfaceC83727WtX
    public final int oa(List<String> list, List<? extends VEFrame> list2) {
        return this.LIZ.oa(list, list2);
    }

    @Override // X.InterfaceC83727WtX
    public final void pauseEffectAudio(boolean z) {
        this.LIZ.pauseEffectAudio(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void processTouchEvent(float f, float f2) {
        this.LIZ.processTouchEvent(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void setARCoreParam(VEARCoreParam vEARCoreParam) {
        this.LIZ.setARCoreParam(vEARCoreParam);
    }

    @Override // X.InterfaceC83727WtX
    public final void setDetectInterval(int i) {
        this.LIZ.setDetectInterval(i);
    }

    @Override // X.InterfaceC83727WtX
    public final void setFilter(String str) {
        this.LIZ.setFilter(str);
    }

    @Override // X.InterfaceC83727WtX
    public final void setFilter(String str, float f) {
        this.LIZ.setFilter(str, f);
    }

    @Override // X.InterfaceC83727WtX
    public final void setFilter(String str, String str2, float f, float f2, float f3) {
        this.LIZ.setFilter(str, str2, f, f2, f3);
    }

    @Override // X.InterfaceC83727WtX
    public final void setHandDetectLowpower(boolean z) {
        this.LIZ.setHandDetectLowpower(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void setRenderCacheString(String str, String value) {
        o.LJIIIZ(value, "value");
        this.LIZ.setRenderCacheString(str, value);
    }

    @Override // X.InterfaceC83727WtX
    public final int setReshape(String strRes, float f, float f2) {
        o.LJIIIZ(strRes, "strRes");
        return this.LIZ.setReshape(strRes, f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void t4(float f, float f2) {
        this.LIZ.t4(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final int u3(String[] oldPaths, int i, String[] newPaths, int i2) {
        o.LJIIIZ(oldPaths, "oldPaths");
        o.LJIIIZ(newPaths, "newPaths");
        return this.LIZ.u3(oldPaths, i, newPaths, i2);
    }

    @Override // X.InterfaceC83727WtX
    public final void u4(boolean z) {
        this.LIZ.u4(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void v4(String str) {
        this.LIZ.v4(str);
    }

    @Override // X.InterfaceC83727WtX
    public final void w4(boolean z) {
        this.LIZ.w4(z);
    }

    public C83726WtW(InterfaceC83727WtX ctrl) {
        o.LJIIIZ(ctrl, "ctrl");
        this.LIZ = ctrl;
    }
}
