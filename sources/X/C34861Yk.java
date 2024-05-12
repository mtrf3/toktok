package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34861Yk implements InterfaceC20640rU, InterfaceC22630uh {
    public final List<InterfaceC22630uh> LIZ = new ArrayList();
    public final AnonymousClass151 LIZIZ;
    public final C43751nf LIZJ;
    public final C43751nf LIZLLL;
    public final C43751nf LJ;

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
    }

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC22630uh) ListProtector.get(this.LIZ, i)).LJI();
        }
    }

    public final void LIZIZ(InterfaceC22630uh interfaceC22630uh) {
        ((ArrayList) this.LIZ).add(interfaceC22630uh);
    }

    public C34861Yk(AbstractC45041pk abstractC45041pk, C38881fo c38881fo) {
        this.LIZIZ = c38881fo.LIZIZ;
        AbstractC22650uj<Float, Float> LIZ = c38881fo.LIZJ.LIZ();
        this.LIZJ = (C43751nf) LIZ;
        AbstractC22650uj<Float, Float> LIZ2 = c38881fo.LIZLLL.LIZ();
        this.LIZLLL = (C43751nf) LIZ2;
        AbstractC22650uj<Float, Float> LIZ3 = c38881fo.LJ.LIZ();
        this.LJ = (C43751nf) LIZ3;
        abstractC45041pk.LJFF(LIZ);
        abstractC45041pk.LJFF(LIZ2);
        abstractC45041pk.LJFF(LIZ3);
        LIZ.LIZ(this);
        LIZ2.LIZ(this);
        LIZ3.LIZ(this);
    }
}
