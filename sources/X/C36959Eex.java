package X;

import java.util.Iterator;

/* renamed from: X.Eex, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36959Eex implements Iterable<Character>, InterfaceC90533gv {
    public final char LJLIL;
    public final char LJLILLLLZI;
    public final int LJLJI = 1;

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C36958Eew(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public C36959Eex(char c, char c2) {
        this.LJLIL = c;
        this.LJLILLLLZI = (char) C78939UyV.LJIJ(c, c2, 1);
    }
}
