package X;

import java.util.List;

/* renamed from: X.GuU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43018GuU<T> implements InterfaceC64592gB {
    public final /* synthetic */ C43021GuX LJLIL;
    public final /* synthetic */ int LJLILLLLZI = 0;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public C43018GuU(C43021GuX c43021GuX, long j, List list, int i) {
        this.LJLIL = c43021GuX;
        this.LJLJI = j;
        this.LJLJJI = list;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C73411SrX c73411SrX = this.LJLIL.LJII;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C43021GuX c43021GuX = this.LJLIL;
        c43021GuX.LJII = null;
        c43021GuX.LIZLLL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 10, 20, -1, c43021GuX.LIZ.LJI, this.LJLJJL, 0, false);
    }
}
