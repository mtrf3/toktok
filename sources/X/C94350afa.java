package X;

import kotlin.jvm.internal.o;

/* renamed from: X.afa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94350afa extends F9E implements C33Q {
    public final int LJLIL;
    public final C94309aev LJLILLLLZI;
    public final OSZ<String, Boolean> LJLJI;
    public final String LJLJJI;

    public C94350afa() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C94350afa(int i) {
        this(0, new C94309aev("", "", "", 1), new OSZ("", Boolean.TRUE), "");
    }

    public C94350afa(int i, C94309aev result, OSZ<String, Boolean> displayWord, String debugResponse) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(displayWord, "displayWord");
        o.LJIIIZ(debugResponse, "debugResponse");
        this.LJLIL = i;
        this.LJLILLLLZI = result;
        this.LJLJI = displayWord;
        this.LJLJJI = debugResponse;
    }

    public static C94350afa L(C94350afa c94350afa, int i, C94309aev result, OSZ displayWord, String debugResponse, int i2) {
        if ((i2 & 1) != 0) {
            i = c94350afa.LJLIL;
        }
        if ((i2 & 2) != 0) {
            result = c94350afa.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            displayWord = c94350afa.LJLJI;
        }
        if ((i2 & 8) != 0) {
            debugResponse = c94350afa.LJLJJI;
        }
        c94350afa.getClass();
        o.LJIIIZ(result, "result");
        o.LJIIIZ(displayWord, "displayWord");
        o.LJIIIZ(debugResponse, "debugResponse");
        return new C94350afa(i, result, displayWord, debugResponse);
    }
}
