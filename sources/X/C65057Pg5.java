package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;

/* renamed from: X.Pg5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65057Pg5 implements InterfaceC65016PfQ<TypedInput, C76800UCe> {
    public static final C65057Pg5 LIZ = new C65057Pg5();

    @Override // X.InterfaceC65016PfQ
    public final C76800UCe LIZ(TypedInput typedInput) {
        try {
            typedInput.in().close();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
