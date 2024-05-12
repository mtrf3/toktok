package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aev, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94309aev extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C94309aev(String str, String songKeyword, String songID, int i) {
        o.LJIIIZ(songKeyword, "songKeyword");
        o.LJIIIZ(songID, "songID");
        this.LJLIL = str;
        this.LJLILLLLZI = songKeyword;
        this.LJLJI = songID;
        this.LJLJJI = i;
        this.LJLJJL = "";
    }
}
