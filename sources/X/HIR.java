package X;

import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import ujb.o;

/* loaded from: classes8.dex */
public final class HIR extends AbstractC65781Prl implements InterfaceC65784Pro<SmartSynthesisModelPath> {
    public static final HIR LJLIL = new HIR();

    public HIR() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SmartSynthesisModelPath invoke() {
        boolean z;
        Object LIZ;
        String modelPath = HIW.LJIIJ.getModelPath();
        if (modelPath == null || o.LJJJJJL(modelPath)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            HIQ.LIZIZ("model path json str is empty");
            return null;
        }
        try {
            LIZ = (SmartSynthesisModelPath) C75792yF.LIZ(modelPath, SmartSynthesisModelPath.class);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parse model path json fail: ");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            HIQ.LIZIZ(X1D.LIZIZ(LIZ2));
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            return null;
        }
        return LIZ;
    }
}
