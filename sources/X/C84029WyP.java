package X;

import com.ss.android.vesdk.VEInfo;

/* renamed from: X.WyP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84029WyP implements X0P {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84029WyP(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.X0P
    public final void LIZ(int i, int i2, float f, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Info:: type: 0x");
        LIZ.append(Integer.toHexString(i));
        LIZ.append("; msg: ");
        LIZ.append(str);
        P4Q.LIZ("TERecorder", X1D.LIZIZ(LIZ));
        C84092WzQ c84092WzQ = this.LIZ;
        InterfaceC133905Ni interfaceC133905Ni = c84092WzQ.LJIILLIIL;
        if (interfaceC133905Ni != null) {
            if (i == VEInfo.TE_RECORD_INFO_RECORDING_TIMESTAMP) {
                interfaceC133905Ni.LIZ(VEInfo.TE_RECORD_INFO_RECORDING_CLIP_TIMESTAMP, i2, c84092WzQ.LIZIZ.LJIIIZ("SegmentFrameTime"), str);
            } else if (i == 1040) {
                c84092WzQ.recordLagCount = i2;
            } else if (i == 1098) {
                c84092WzQ.recordSeriousLagCount = i2;
            } else if (i == 1041) {
                c84092WzQ.recordLagMaxDuration = i2;
            } else if (i == 1043) {
                c84092WzQ.recordLagTotalDuration = i2;
            } else if (i == 1044) {
                c84092WzQ.previewLagCount = i2;
            } else if (i == 1099) {
                c84092WzQ.previewSeriousLagCount = i2;
            } else if (i == 1045) {
                c84092WzQ.previewLagMaxDuration = i2;
            } else if (i == 1046) {
                c84092WzQ.previewLagTotalDuration = i2;
            } else if (i == 1095) {
                c84092WzQ.previewSubLagCount = i2;
            } else if (i == 1096) {
                c84092WzQ.previewSubLagMaxDuration = i2;
            } else if (i == 1097) {
                c84092WzQ.previewSubLagTotalDuration = i2;
            } else if (i == 1091) {
                c84092WzQ.recordRenderFps = 1000000.0f / i2;
            } else if (i == 1092) {
                c84092WzQ.recordWriteFps = 1000000.0f / i2;
            }
            this.LIZ.LJIILLIIL.LIZ(i, i2, f, str);
        }
    }
}
