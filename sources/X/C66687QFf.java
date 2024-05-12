package X;

import com.bytedance.ttnet.diagnosis.IDiagnosisCallback;

/* renamed from: X.QFf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66687QFf implements QFX {
    public final /* synthetic */ C66686QFe LIZ;

    public C66687QFf(C66686QFe c66686QFe) {
        this.LIZ = c66686QFe;
    }

    @Override // X.QFX
    public final void LIZ(String str) {
        IDiagnosisCallback iDiagnosisCallback = this.LIZ.LIZ;
        if (iDiagnosisCallback != null) {
            iDiagnosisCallback.onDiagnosisComplete(str);
        }
    }
}
