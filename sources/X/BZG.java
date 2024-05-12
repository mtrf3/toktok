package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZG extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BZG(Context context, boolean z) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Float f, Integer num) {
        float floatValue = f.floatValue();
        int intValue = num.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detection callback: score=");
        LIZ.append(floatValue);
        LIZ.append(" cameraId=");
        LIZ.append(intValue);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        C0NB.LIZIZ("DirtyLenDetect", msg);
        C29306Beo.LJJJ(new BZD(floatValue, intValue, this.LJLILLLLZI, this.LJLIL));
        return C76800UCe.LIZ;
    }
}
