package X;

import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UmX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78197UmX implements InterfaceC32440CoG {
    public final C32449CoP LIZ;
    public final J03 LIZIZ;
    public final C78185UmL LIZJ;
    public C78202Umc LIZLLL;

    @Override // X.InterfaceC32440CoG
    public final void stop() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this, 358));
    }

    @Override // X.InterfaceC32440CoG
    public final void LIZIZ(InterfaceC78213Umn renderView, C32448CoO c32448CoO) {
        o.LJIIIZ(renderView, "renderView");
        C32257ClJ.LJIIIIZZ(new AqS102S0300000_13(this, renderView, c32448CoO, 8));
    }

    public C78197UmX(C32449CoP request, J03 j03, C78185UmL c78185UmL) {
        o.LJIIIZ(request, "request");
        this.LIZ = request;
        this.LIZIZ = j03;
        this.LIZJ = c78185UmL;
    }
}
