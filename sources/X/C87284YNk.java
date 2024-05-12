package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: X.YNk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87284YNk implements TEVideoUtils.CompileProbeListener {
    public final /* synthetic */ InterfaceC87287YNn LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ VEVideoEncodeSettings LIZJ;

    public C87284YNk(C45015Hlb c45015Hlb, int i, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LIZ = c45015Hlb;
        this.LIZIZ = i;
        this.LIZJ = vEVideoEncodeSettings;
    }

    @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener
    public final void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2) {
        InterfaceC87287YNn interfaceC87287YNn = this.LIZ;
        if (interfaceC87287YNn != null) {
            interfaceC87287YNn.LIZ(i, i2, f, this.LIZIZ, i3, i4, i5, i6, f2, this.LIZJ.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, this.LIZJ.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, this.LIZJ.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
        }
    }
}
