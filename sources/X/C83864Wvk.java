package X;

import Y.AObjectS123S0200000_7;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83864Wvk implements InterfaceC83865Wvl {
    public final InterfaceC83865Wvl LIZ;

    @Override // X.InterfaceC83865Wvl
    public final void A8(InterfaceC84052Wym listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.A8(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final int B8() {
        return this.LIZ.B8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int C8() {
        return this.LIZ.C8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int D8() {
        return this.LIZ.D8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int E8() {
        return this.LIZ.E8();
    }

    @Override // X.InterfaceC83865Wvl
    public final float F8() {
        return this.LIZ.F8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void G8() {
        this.LIZ.G8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int H8() {
        return this.LIZ.H8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int I8(int i, int i2, String str, int i3, int i4, int i5, boolean z) {
        return this.LIZ.I8(i, i2, str, i3, i4, i5, z);
    }

    @Override // X.InterfaceC83865Wvl
    public final int K8() {
        return this.LIZ.K8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void L8(InterfaceC88472Yns<? super C87278YNe, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.LIZ.L8(block);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLLII(String strImagePath, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(callback, "callback");
        return this.LIZ.LLLII(strImagePath, i, i2, callback);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLLZZIL(String strImagePath, int i, int i2, boolean z, Bitmap.CompressFormat format, InterfaceC88472Yns<? super Integer, C76800UCe> callback, boolean z2) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(format, "format");
        o.LJIIIZ(callback, "callback");
        this.LIZ.LLLZZIL(strImagePath, i, i2, z, format, callback, z2);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZ() {
        this.LIZ.LLZ();
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZIL() {
        this.LIZ.LLZIL();
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZILL(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LLZILL(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZL(boolean z) {
        this.LIZ.LLZL(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LIZ.LLZLI(interfaceC88472Yns);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZLL(double d, boolean z, float f, int i, int i2, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        this.LIZ.LLZLL(d, z, f, i, i2, aObjectS123S0200000_7);
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLZLLIL(ActivityC45651qj context, I86 i86) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLZLLIL(context, i86);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean LLZLLLL() {
        return this.LIZ.LLZLLLL();
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        this.LIZ.LLZZ(interfaceC88472Yns, z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZJLIL(long j, long j2, String str, boolean z, boolean z2) {
        this.LIZ.LLZZJLIL(j, j2, str, z, z2);
    }

    @Override // X.InterfaceC83865Wvl
    public final int LLZZLLIL(C29S context, I86 i86) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLZZLLIL(context, i86);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZZIL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ.LLZZZIL(interfaceC65784Pro, interfaceC88472Yns);
    }

    @Override // X.InterfaceC83865Wvl
    public final void LLZZZZ(String str, double d, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        this.LIZ.LLZZZZ(str, d, aObjectS123S0200000_7);
    }

    @Override // X.InterfaceC83865Wvl
    public final void M8(VESafeAreaParams[] vESafeAreaParamsArr) {
        this.LIZ.M8(vESafeAreaParamsArr);
    }

    @Override // X.InterfaceC83865Wvl
    public final void N8(float f) {
        this.LIZ.N8(f);
    }

    @Override // X.InterfaceC83865Wvl
    public final VEDisplaySettings O7() {
        return this.LIZ.O7();
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean O8() {
        return this.LIZ.O8();
    }

    @Override // X.InterfaceC83865Wvl
    public final String[] P8() {
        return this.LIZ.P8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void Q8(List list, String videoDir, String str, int i, C83696Wt2 c83696Wt2) {
        o.LJIIIZ(videoDir, "videoDir");
        this.LIZ.Q8(list, videoDir, str, i, c83696Wt2);
    }

    @Override // X.InterfaceC83865Wvl
    public final LiveData<Boolean> R8() {
        return this.LIZ.R8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void S8(C83698Wt4 c83698Wt4) {
        this.LIZ.S8(c83698Wt4);
    }

    @Override // X.InterfaceC83865Wvl
    public final void T8(boolean z, Cert cert) {
        this.LIZ.T8(z, cert);
    }

    @Override // X.InterfaceC83865Wvl
    public final int U8() {
        return this.LIZ.U8();
    }

    @Override // X.InterfaceC83865Wvl
    public final int V8() {
        return this.LIZ.V8();
    }

    @Override // X.InterfaceC83865Wvl
    public final float W8() {
        return this.LIZ.W8();
    }

    @Override // X.InterfaceC83865Wvl
    public final float X8() {
        return this.LIZ.X8();
    }

    @Override // X.InterfaceC83865Wvl
    public final float Y8() {
        return this.LIZ.Y8();
    }

    @Override // X.InterfaceC83865Wvl
    public final float Z8() {
        return this.LIZ.Z8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void a(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.a(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final void a9(VESize vESize) {
        this.LIZ.a9(vESize);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean b(boolean z) {
        return this.LIZ.b(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void b9(InterfaceC84052Wym listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.b9(listener);
    }

    @Override // X.InterfaceC83865Wvl
    public final boolean c(String str) {
        return this.LIZ.c(str);
    }

    @Override // X.InterfaceC83865Wvl
    public final void c9(C43873HJt c43873HJt) {
        this.LIZ.c9(c43873HJt);
    }

    @Override // X.InterfaceC83865Wvl
    public final void d9(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LIZ.d9(vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC83865Wvl
    public final float e9() {
        return this.LIZ.e9();
    }

    @Override // X.InterfaceC83865Wvl
    public final void enableAudio(boolean z) {
        this.LIZ.enableAudio(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final long getEndFrameTimeUS() {
        return this.LIZ.getEndFrameTimeUS();
    }

    @Override // X.InterfaceC83865Wvl
    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        return this.LIZ.getIntermediatePathFromEffect();
    }

    @Override // X.InterfaceC83865Wvl
    public final int getLastRecordFrameNum() {
        return this.LIZ.getLastRecordFrameNum();
    }

    @Override // X.InterfaceC83865Wvl
    public final long getSegmentAudioLength() {
        return this.LIZ.getSegmentAudioLength();
    }

    @Override // X.InterfaceC83865Wvl
    public final float[] getSuggestVolume() {
        return this.LIZ.getSuggestVolume();
    }

    @Override // X.InterfaceC83865Wvl
    public final int s8(VEDisplaySettings settings) {
        o.LJIIIZ(settings, "settings");
        return this.LIZ.s8(settings);
    }

    @Override // X.InterfaceC83865Wvl
    public final void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        this.LIZ.setControllerCallback(interfaceC83970WxS);
    }

    @Override // X.InterfaceC83865Wvl
    public final void setMusicPath(String str) {
        this.LIZ.setMusicPath(str);
    }

    @Override // X.InterfaceC83865Wvl
    public final void setRecordMaxDuration(long j) {
        this.LIZ.setRecordMaxDuration(j);
    }

    @Override // X.InterfaceC83865Wvl
    public final void t8(Surface surface) {
        this.LIZ.t8(surface);
    }

    @Override // X.InterfaceC83865Wvl
    public final void u8(Surface surface, String deviceName, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(surface, "surface");
        o.LJIIIZ(deviceName, "deviceName");
        this.LIZ.u8(surface, deviceName, interfaceC88472Yns);
    }

    @Override // X.InterfaceC83865Wvl
    public final void v8(int i, int i2) {
        this.LIZ.v8(i, i2);
    }

    @Override // X.InterfaceC83865Wvl
    public final void w8(boolean z) {
        this.LIZ.w8(z);
    }

    @Override // X.InterfaceC83865Wvl
    public final void x8() {
        this.LIZ.x8();
    }

    @Override // X.InterfaceC83865Wvl
    public final void y8(C66882QMs c66882QMs) {
        this.LIZ.y8(c66882QMs);
    }

    @Override // X.InterfaceC83865Wvl
    public final int z8() {
        return this.LIZ.z8();
    }

    public C83864Wvk(InterfaceC83865Wvl ctrl) {
        o.LJIIIZ(ctrl, "ctrl");
        this.LIZ = ctrl;
    }

    @Override // X.InterfaceC83865Wvl
    public final void J8(String str, String str2, boolean z, String str3, InterfaceC88472Yns interfaceC88472Yns) {
        HH1.LIZ(str, "videoPath", str2, "audioPath", str3, "description");
        this.LIZ.J8(str, str2, z, str3, interfaceC88472Yns);
    }
}
