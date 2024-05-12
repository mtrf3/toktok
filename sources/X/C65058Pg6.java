package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;

/* renamed from: X.Pg6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65058Pg6 implements InterfaceC65016PfQ<TypedInput, Void> {
    public static final C65058Pg6 LIZ = new C65058Pg6();

    @Override // X.InterfaceC65016PfQ
    public final Void LIZ(TypedInput typedInput) {
        InputStream in = typedInput.in();
        if (in != null) {
            in.close();
            return null;
        }
        return null;
    }
}
