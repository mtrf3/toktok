package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDV extends AbstractC65781Prl implements InterfaceC88472Yns<Exception, C76800UCe> {
    public static final HDV LJLIL = new HDV();

    public HDV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Exception exc) {
        Exception exception = exc;
        o.LJIIIZ(exception, "exception");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordBGMComponent zyc downloadAudioTimeAlignModel failed, error=");
        LIZ.append(exception.getMessage());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
