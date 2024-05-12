package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81913Jj extends F9E {
    public static final /* synthetic */ int LJLJL = 0;
    public final C81963Jo LJLIL;
    public final List<C63120Opw> LJLILLLLZI;
    public final boolean LJLJI;
    public final long LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81913Jj(C81963Jo originQuery, List<? extends C63120Opw> conversationList, boolean z, long j, int i, boolean z2) {
        o.LJIIIZ(originQuery, "originQuery");
        o.LJIIIZ(conversationList, "conversationList");
        this.LJLIL = originQuery;
        this.LJLILLLLZI = conversationList;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = i;
        this.LJLJJLL = z2;
    }
}
