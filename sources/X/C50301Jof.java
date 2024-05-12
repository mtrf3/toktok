package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jof, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50301Jof extends F9E implements InterfaceC50315Jot {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C50301Jof() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C50301Jof(int i) {
        this("", "");
    }

    public C50301Jof(String preClickImprId, String preDefaultShowId) {
        o.LJIIIZ(preClickImprId, "preClickImprId");
        o.LJIIIZ(preDefaultShowId, "preDefaultShowId");
        this.LJLIL = preClickImprId;
        this.LJLILLLLZI = preDefaultShowId;
    }

    public static C50301Jof L(C50301Jof c50301Jof, String preClickImprId, String preDefaultShowId, int i) {
        if ((i & 1) != 0) {
            preClickImprId = c50301Jof.LJLIL;
        }
        if ((i & 2) != 0) {
            preDefaultShowId = c50301Jof.LJLILLLLZI;
        }
        c50301Jof.getClass();
        o.LJIIIZ(preClickImprId, "preClickImprId");
        o.LJIIIZ(preDefaultShowId, "preDefaultShowId");
        return new C50301Jof(preClickImprId, preDefaultShowId);
    }
}
