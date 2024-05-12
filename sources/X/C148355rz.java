package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148355rz implements InterfaceC148435s7<C165186e2> {
    public final int LIZ;
    public final WMH LIZIZ;
    public final C82622Wbi LIZJ;
    public final C148195rj LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final C148415s5 LJFF;
    public final C148415s5 LJI;

    @Override // X.InterfaceC148435s7
    public final C148425s6 LIZ() {
        return this.LJI;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.5s5] */
    public C148355rz(int i, WMH parentScene, C82622Wbi objectContainer, C148195rj c148195rj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = i;
        this.LIZIZ = parentScene;
        this.LIZJ = objectContainer;
        this.LIZLLL = c148195rj;
        this.LJ = interfaceC65784Pro;
        ?? r2 = new C148425s6(c148195rj, new WIW(i, objectContainer), new WJC(interfaceC65784Pro)) { // from class: X.5s5
            {
                super(r2, r3);
            }
        };
        this.LJFF = r2;
        this.LJI = r2;
    }
}
