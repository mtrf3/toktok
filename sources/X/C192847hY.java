package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192847hY extends F9E implements C33Q {
    public final AbstractC72932td<List<C192727hM>> LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;

    public C192847hY() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C192847hY(int i) {
        this(C33X.LIZ, true, 0L, true);
    }

    public static C192847hY L(C192847hY c192847hY, AbstractC72932td abstractC72932td) {
        boolean z = c192847hY.LJLILLLLZI;
        long j = c192847hY.LJLJI;
        boolean z2 = c192847hY.LJLJJI;
        c192847hY.getClass();
        return new C192847hY(abstractC72932td, z, j, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C192847hY(AbstractC72932td<? extends List<C192727hM>> data, boolean z, long j, boolean z2) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = z2;
    }
}
