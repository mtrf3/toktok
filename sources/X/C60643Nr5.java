package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nr5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60643Nr5 extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public final C60424NnY LJLJL = new C60424NnY(this);
    public final C60403NnD LJLJLJ = new C60403NnD(this);
    public InterfaceC60405NnF LJLJLLL = new C60645Nr7();

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        this.LJLJI = "CustomClientExtension";
        C60640Nr2 extendable = (C60640Nr2) LIZ();
        o.LJFF(extendable, "extendable");
        C60631Nqt.LIZ(extendable.getExtendableWebViewClient(), LJI());
        C60640Nr2 extendable2 = (C60640Nr2) LIZ();
        o.LJFF(extendable2, "extendable");
        C60631Nqt.LIZ(extendable2.getExtendableWebChromeClient(), LJFF());
    }

    public C60403NnD LJFF() {
        return this.LJLJLJ;
    }

    public C60424NnY LJI() {
        return this.LJLJL;
    }
}
