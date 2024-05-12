package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aeV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94283aeV extends F9E implements C33Q {
    public final EnumC93589aTJ LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C94283aeV(EnumC93589aTJ state, String str, String str2) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    public static C94283aeV L(C94283aeV c94283aeV, EnumC93589aTJ state, String keyword, String songId, int i) {
        if ((i & 1) != 0) {
            state = c94283aeV.LJLIL;
        }
        if ((i & 2) != 0) {
            keyword = c94283aeV.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            songId = c94283aeV.LJLJI;
        }
        c94283aeV.getClass();
        o.LJIIIZ(state, "state");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(songId, "songId");
        return new C94283aeV(state, keyword, songId);
    }
}
