package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JyN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50903JyN extends F9E implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;

    public C50903JyN() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL)};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().pE().LIZIZ(C65352Pkq.LIZ(C50903JyN.class), C50904JyO.LJLIL);
    }

    public /* synthetic */ C50903JyN(int i) {
        this("", "", false, false, false, false);
    }

    public C50903JyN(String authorId, String groupId, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(groupId, "groupId");
        this.LJLIL = authorId;
        this.LJLILLLLZI = groupId;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
    }
}
