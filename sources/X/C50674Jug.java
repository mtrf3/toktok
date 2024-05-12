package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jug, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50674Jug extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C50674Jug(String keyword, String songID, int i, String str) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(songID, "songID");
        this.LJLIL = keyword;
        this.LJLILLLLZI = songID;
        this.LJLJI = i;
        this.LJLJJI = str;
    }
}
