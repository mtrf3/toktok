package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JrS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50474JrS extends F9E implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C50474JrS() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().pE().LIZIZ(C65352Pkq.LIZ(C50474JrS.class), C50470JrO.LJLIL);
    }

    public /* synthetic */ C50474JrS(int i) {
        this("", "");
    }

    public C50474JrS(String authorId, String groupId) {
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(groupId, "groupId");
        this.LJLIL = authorId;
        this.LJLILLLLZI = groupId;
    }
}
