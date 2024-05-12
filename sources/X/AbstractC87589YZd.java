package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87589YZd implements InterfaceC87609YZx {
    public final InterfaceC87606YZu<AbstractC87589YZd> LIZ;
    public final boolean LIZIZ;

    public AbstractC87589YZd() {
        throw null;
    }

    @Override // X.InterfaceC87609YZx
    public void start() {
        LIZLLL("start");
    }

    @Override // X.InterfaceC87609YZx
    public void LIZ(Object obj) {
        LIZIZ("cancelFinish");
    }

    public final void LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibScheduleError Node: call ");
        LIZ.append(str);
        LIZ.append(" on state:");
        LIZ.append(this);
        C41816Gb6.LIZIZ(777001, X1D.LIZIZ(LIZ), null);
    }

    public final void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NormalInvalidError Node: call ");
        LIZ.append(str);
        LIZ.append(" on state:");
        LIZ.append(this);
        C41816Gb6.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC87609YZx
    public void LJI(Object obj) {
        LIZLLL("resume");
    }

    @Override // X.InterfaceC87609YZx
    public void LJII(Object obj) {
        LIZLLL("pause");
    }

    @Override // X.InterfaceC87609YZx
    public void LJIIL(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        LIZLLL("cancel");
    }

    public AbstractC87589YZd(InterfaceC87606YZu interfaceC87606YZu, boolean z) {
        this.LIZ = interfaceC87606YZu;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC87609YZx
    public void LJIIJJI(C42360Gjs e, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        LIZIZ("setFailed");
    }

    @Override // X.InterfaceC87609YZx
    public void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        LIZIZ("setSuccess");
    }
}
