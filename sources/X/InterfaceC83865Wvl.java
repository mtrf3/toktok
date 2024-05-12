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

/* renamed from: X.Wvl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83865Wvl {
    void A8(InterfaceC84052Wym interfaceC84052Wym);

    int B8();

    int C8();

    int D8();

    int E8();

    float F8();

    void G8();

    int H8();

    int I8(int i, int i2, String str, int i3, int i4, int i5, boolean z);

    void J8(String str, String str2, boolean z, String str3, InterfaceC88472Yns interfaceC88472Yns);

    int K8();

    void L8(InterfaceC88472Yns<? super C87278YNe, C76800UCe> interfaceC88472Yns);

    void LIZ();

    int LLLII(String str, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

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

    void M8(VESafeAreaParams[] vESafeAreaParamsArr);

    void N8(float f);

    VEDisplaySettings O7();

    boolean O8();

    String[] P8();

    void Q8(List list, String str, String str2, int i, C83696Wt2 c83696Wt2);

    LiveData<Boolean> R8();

    void S8(C83698Wt4 c83698Wt4);

    void T8(boolean z, Cert cert);

    int U8();

    int V8();

    float W8();

    float X8();

    float Y8();

    float Z8();

    void a(InterfaceC83962WxK interfaceC83962WxK);

    void a9(VESize vESize);

    boolean b(boolean z);

    void b9(InterfaceC84052Wym interfaceC84052Wym);

    boolean c(String str);

    void c9(C43873HJt c43873HJt);

    void d9(VEVideoEncodeSettings vEVideoEncodeSettings);

    float e9();

    void enableAudio(boolean z);

    long getEndFrameTimeUS();

    VEMapBufferInfo getIntermediatePathFromEffect();

    int getLastRecordFrameNum();

    long getSegmentAudioLength();

    float[] getSuggestVolume();

    int s8(VEDisplaySettings vEDisplaySettings);

    void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS);

    void setMusicPath(String str);

    void setRecordMaxDuration(long j);

    void t8(Surface surface);

    void u8(Surface surface, String str, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void v8(int i, int i2);

    void w8(boolean z);

    void x8();

    void y8(C66882QMs c66882QMs);

    int z8();
}
