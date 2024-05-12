package X;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Gx3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43177Gx3<V> implements Callable {
    public final /* synthetic */ C43176Gx2 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ AbstractC43178Gx4 LJLJJL;

    public CallableC43177Gx3(C43176Gx2 c43176Gx2, String str, String str2, long j, AbstractC43178Gx4 abstractC43178Gx4) {
        this.LJLIL = c43176Gx2;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = j;
        this.LJLJJL = abstractC43178Gx4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C43176Gx2 c43176Gx2 = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        long j = this.LJLJJI;
        c43176Gx2.getClass();
        C43189GxF c43189GxF = new C43189GxF(str, j, str2);
        VVX vvx = VVX.LIZIZ;
        vvx.getClass();
        vvx.LIZ.LJIJ().LIZ(c43189GxF);
        C43176Gx2 c43176Gx22 = this.LJLIL;
        String type = this.LJLILLLLZI;
        long LIZLLL = this.LJLJJI - this.LJLJJL.LIZLLL();
        c43176Gx22.getClass();
        o.LJIIIZ(type, "type");
        vvx.LIZ.LJIJ().LIZIZ(LIZLLL, type);
        return C76800UCe.LIZ;
    }
}
