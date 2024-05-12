package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.QsG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68360QsG extends AbstractC68364QsK {
    public final Callable LJLJI;

    public C68360QsG(CallableC68261Qqf callableC68261Qqf) {
        super("internal.appMetadata");
        this.LJLJI = callableC68261Qqf;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        try {
            return C68361QsH.LIZIZ(this.LJLJI.call());
        } catch (Exception unused) {
            return InterfaceC68379QsZ.LJIIJ;
        }
    }
}
