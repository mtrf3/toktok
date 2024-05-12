package X;

import com.bytedance.retrofit2.RequestBuilder;
import java.io.IOException;

/* renamed from: X.PeG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64944PeG<T> extends AbstractC64937Pe9<T> {
    public final InterfaceC65016PfQ<T, String> LIZ;

    public C64944PeG(InterfaceC65016PfQ<T, String> interfaceC65016PfQ) {
        this.LIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        try {
            requestBuilder.LJIIZILJ = Boolean.parseBoolean(this.LIZ.LIZ(t));
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to convert ");
            LIZ.append(t);
            LIZ.append(" to AddCommonParam");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e);
        }
    }
}
