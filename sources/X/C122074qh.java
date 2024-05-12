package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122074qh extends AbstractC65781Prl implements InterfaceC65784Pro<C122094qj> {
    public static final C122074qh LJLIL = new C122074qh();

    public C122074qh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4qj] */
    @Override // X.InterfaceC65784Pro
    public final C122094qj invoke() {
        return new InterfaceC121994qZ() { // from class: X.4qj
            @Override // X.InterfaceC121994qZ
            public final int LIZ(String debug) {
                o.LJIIIZ(debug, "debug");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("| ");
                LIZ.append(debug);
                return android.util.Log.d("NLEPro.Operate", X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC121994qZ
            public final int LIZIZ(String error) {
                o.LJIIIZ(error, "error");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("| ");
                LIZ.append(error);
                return android.util.Log.e("NLEPro.Operate", X1D.LIZIZ(LIZ));
            }
        };
    }
}
