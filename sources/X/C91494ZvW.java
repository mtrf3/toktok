package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZvW, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91494ZvW extends AbstractC91380Ztg {
    public Long LJLJI;
    public boolean LJLJJI;
    public InterfaceC91296ZsK LJLJJL;
    public final C91382Zti LJLJJLL = new C91382Zti(this);
    public final C91467Zv5 LJLJL;

    @Override // X.InterfaceC91297ZsL
    public final C91467Zv5 LIZ() {
        return this.LJLJL;
    }

    @Override // X.AbstractC91380Ztg
    public final AbstractC91187ZqZ LJ() {
        return this.LJLJJLL;
    }

    public C91494ZvW(C91467Zv5 c91467Zv5) {
        this.LJLJL = c91467Zv5;
    }

    @Override // X.AbstractC91380Ztg
    public final boolean LJI(InterfaceC91296ZsK dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        this.LJLJJL = dataSource;
        if (this.LJLIL.size() - LJFF(dataSource) <= 3) {
            return true;
        }
        return false;
    }
}
