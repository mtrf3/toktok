package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.RequestBuilder;
import java.io.IOException;

/* renamed from: X.PeE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64942PeE<T> extends AbstractC64937Pe9<T> {
    public final InterfaceC65016PfQ<T, String> LIZ;

    public C64942PeE(InterfaceC65016PfQ<T, String> interfaceC65016PfQ) {
        this.LIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        try {
            requestBuilder.LJIILLIIL = CastIntegerProtector.parseInt(this.LIZ.LIZ(t));
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to convert ");
            LIZ.append(t);
            LIZ.append(" to MaxLength");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e);
        }
    }
}
