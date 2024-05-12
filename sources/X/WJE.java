package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJE implements InterfaceC148435s7<C82097WJx> {
    public final WMH LIZ;
    public final C82622Wbi LIZIZ;
    public final C148425s6 LIZJ;

    @Override // X.InterfaceC148435s7
    public final C148425s6 LIZ() {
        return this.LIZJ;
    }

    public WJE(I3N parentScene, C82622Wbi objectContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = parentScene;
        this.LIZIZ = objectContainer;
        this.LIZJ = new C148425s6(new WIW(4, objectContainer), new WJC(null));
    }
}
