package X;

/* renamed from: X.Yic, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC88146Yic implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C88145Yib LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC88142YiY interfaceC88142YiY = this.LJLILLLLZI.LIZIZ.LIZLLL;
            ((C88141YiX) interfaceC88142YiY).LIZ.LJFF(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC88146Yic(C88145Yib c88145Yib, long j) {
        this.LJLILLLLZI = c88145Yib;
        this.LJLIL = j;
    }
}
