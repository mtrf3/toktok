package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C536628s implements InterfaceC44861pS, InterfaceC23370vt {
    public final EnumC23500w6 LJLIL;
    public final /* synthetic */ InterfaceC23370vt LJLILLLLZI;

    @Override // X.InterfaceC23370vt
    public final long LJIJ(long j) {
        return this.LJLILLLLZI.LJIJ(j);
    }

    @Override // X.InterfaceC23370vt
    public final int LJJIJ(float f) {
        return this.LJLILLLLZI.LJJIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJIJL(long j) {
        return this.LJLILLLLZI.LJJIJL(j);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLILLLLZI.LJJJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return this.LJLILLLLZI.LJJJJIZL(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return this.LJLILLLLZI.LJJJLL(i);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return this.LJLILLLLZI.LJJJLZIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final long LJJLI(long j) {
        return this.LJLILLLLZI.LJJLI(j);
    }

    @Override // X.InterfaceC44861pS
    public final /* synthetic */ InterfaceC273515n LJJLIL(int i, int i2, java.util.Map map, InterfaceC88472Yns interfaceC88472Yns) {
        return C0ON.LIZ(i, i2, this, map, interfaceC88472Yns);
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLILLLLZI.getDensity();
    }

    @Override // X.InterfaceC39181gI
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLIL;
    }

    public C536628s(InterfaceC23370vt density, EnumC23500w6 layoutDirection) {
        o.LJIIIZ(density, "density");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        this.LJLIL = layoutDirection;
        this.LJLILLLLZI = density;
    }
}
