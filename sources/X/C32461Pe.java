package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32461Pe implements InterfaceC10110aV, InterfaceC273515n {
    public final C10280am LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final List<InterfaceC10230ah> LJ;
    public final int LJFF;
    public final /* synthetic */ InterfaceC273515n LJI;

    @Override // X.InterfaceC273515n
    public final void LIZJ() {
        this.LJI.LIZJ();
    }

    @Override // X.InterfaceC273515n
    public final java.util.Map<AbstractC272415c, Integer> LJI() {
        return this.LJI.LJI();
    }

    @Override // X.InterfaceC273515n
    public final int getHeight() {
        return this.LJI.getHeight();
    }

    @Override // X.InterfaceC273515n
    public final int getWidth() {
        return this.LJI.getWidth();
    }

    @Override // X.InterfaceC10110aV
    public final int LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC10110aV
    public final List<InterfaceC10230ah> LIZIZ() {
        return this.LJ;
    }

    public C32461Pe(C10280am c10280am, int i, boolean z, float f, InterfaceC273515n measureResult, List visibleItemsInfo, int i2, C0UT orientation) {
        o.LJIIIZ(measureResult, "measureResult");
        o.LJIIIZ(visibleItemsInfo, "visibleItemsInfo");
        o.LJIIIZ(orientation, "orientation");
        this.LIZ = c10280am;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = visibleItemsInfo;
        this.LJFF = i2;
        this.LJI = measureResult;
    }
}
