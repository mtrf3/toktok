package X;

import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.MzK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58606MzK extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C76800UCe> {
    public static final C58606MzK LJLIL = new C58606MzK();

    public C58606MzK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Object obj) {
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.retrofit2.Retrofit.Builder");
        C65064PgC c65064PgC = (C65064PgC) obj;
        InterfaceC37216Ej6 orbuSandboxTTNetInterceptor = SandboxServiceImpl.LIZ().orbuSandboxTTNetInterceptor();
        if (orbuSandboxTTNetInterceptor != null) {
            c65064PgC.LIZJ(orbuSandboxTTNetInterceptor);
        }
        return C76800UCe.LIZ;
    }
}
