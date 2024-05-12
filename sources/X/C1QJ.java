package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1QJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QJ implements InterfaceC11290cP, InterfaceC273515n {
    public final C11480ci LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final List<InterfaceC11350cV> LJ;
    public final int LJFF;
    public final int LJI;
    public final /* synthetic */ InterfaceC273515n LJII;

    @Override // X.InterfaceC273515n
    public final void LIZJ() {
        this.LJII.LIZJ();
    }

    @Override // X.InterfaceC273515n
    public final java.util.Map<AbstractC272415c, Integer> LJI() {
        return this.LJII.LJI();
    }

    @Override // X.InterfaceC273515n
    public final int getHeight() {
        return this.LJII.getHeight();
    }

    @Override // X.InterfaceC273515n
    public final int getWidth() {
        return this.LJII.getWidth();
    }

    @Override // X.InterfaceC11290cP
    public final int LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC11290cP
    public final List<InterfaceC11350cV> LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC11290cP
    public final int LIZLLL() {
        return this.LJFF;
    }

    public C1QJ(C11480ci c11480ci, int i, boolean z, float f, InterfaceC273515n measureResult, List visibleItemsInfo, int i2, int i3, C0UT orientation) {
        o.LJIIIZ(measureResult, "measureResult");
        o.LJIIIZ(visibleItemsInfo, "visibleItemsInfo");
        o.LJIIIZ(orientation, "orientation");
        this.LIZ = c11480ci;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = visibleItemsInfo;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = measureResult;
    }
}
