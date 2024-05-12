package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a9u, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92386a9u extends AbstractC60815Ntr {
    public final Context LJLILLLLZI;
    public final List<String> LJLJI;

    public C92386a9u(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = context;
        this.LJLJI = C47261Igj.LJJIJ("lf-geckocdn.g-p-static.com");
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (interfaceC60710NsA instanceof C60607NqV) {
            C60607NqV c60607NqV = (C60607NqV) interfaceC60710NsA;
            c60607NqV.LIZIZ = new C92385a9t(this);
            c60607NqV.LIZLLL = new C92117a5Z(this);
        }
    }
}
