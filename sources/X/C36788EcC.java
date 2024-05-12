package X;

/* renamed from: X.EcC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36788EcC<T> implements InterfaceC86003Zc {
    public static final C36788EcC<T> LJLIL = new C36788EcC<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Long> interfaceC73573Su9) {
        if (UTU.LJ) {
            long j = UTU.LIZIZ;
            if (j != 60000) {
                interfaceC73573Su9.onNext(Long.valueOf(j));
                return;
            }
            return;
        }
        long LIZ = UTU.LIZ();
        if (LIZ == 60000) {
            return;
        }
        interfaceC73573Su9.onNext(Long.valueOf(LIZ));
    }
}
