package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJD implements InterfaceC148435s7<C82096WJw> {
    public final WMH LIZ;
    public final C82622Wbi LIZIZ;
    public final C148425s6 LIZJ;

    @Override // X.InterfaceC148435s7
    public final C148425s6 LIZ() {
        return this.LIZJ;
    }

    public WJD(WMH parentScene, C82622Wbi objectContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = parentScene;
        this.LIZIZ = objectContainer;
        this.LIZJ = new C148425s6(new WIW(1, objectContainer), new WJC(null));
    }
}
