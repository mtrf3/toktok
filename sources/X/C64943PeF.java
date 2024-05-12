package X;

import com.bytedance.retrofit2.RequestBuilder;
import java.io.IOException;

/* renamed from: X.PeF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64943PeF<T> extends AbstractC64937Pe9<T> {
    public final InterfaceC65016PfQ<T, Object> LIZ;

    public C64943PeF(InterfaceC65016PfQ<T, Object> interfaceC65016PfQ) {
        this.LIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        try {
            requestBuilder.LJIJ = this.LIZ.LIZ(t);
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to convert ");
            LIZ.append(t);
            LIZ.append(" to ExtraInfo");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e);
        }
    }
}
