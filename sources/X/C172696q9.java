package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172696q9 extends AbstractC65781Prl implements InterfaceC65784Pro<C172706qA> {
    public static final C172696q9 LJLIL = new C172696q9();

    public C172696q9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6qA] */
    @Override // X.InterfaceC65784Pro
    public final C172706qA invoke() {
        return new InterfaceC172956qZ() { // from class: X.6qA
            @Override // X.InterfaceC172956qZ
            public final void LIZ(Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("FileUtils");
                LIZ.append('|');
                LIZ.append("Get file header failed");
                H78.LIZJ(X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC172956qZ
            public final void LIZIZ(String str) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cut.NetworkFileFetcher");
                LIZ.append('|');
                LIZ.append(str);
                H78.LJII(X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC172956qZ
            public final void LIZJ(String str, String msg) {
                o.LJIIIZ(msg, "msg");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append('|');
                LIZ.append(msg);
                H78.LIZ(X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC172956qZ
            public final void LIZLLL(String str, String msg) {
                o.LJIIIZ(msg, "msg");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append('|');
                LIZ.append(msg);
                H78.LIZJ(X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC172956qZ
            public final void LJ(String str, String str2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append('|');
                LIZ.append(str2);
                H78.LJI(X1D.LIZIZ(LIZ));
            }
        };
    }
}
