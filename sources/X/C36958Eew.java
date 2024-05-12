package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Eew, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36958Eew extends AbstractC36957Eev {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;

    @Override // X.AbstractC36957Eev
    public final char LIZ() {
        int i = this.LJLJJI;
        if (i == this.LJLILLLLZI) {
            if (this.LJLJI) {
                this.LJLJI = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.LJLJJI = this.LJLIL + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLJI;
    }

    public C36958Eew(char c, char c2, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = c2;
        boolean z = true;
        if (i <= 0 ? o.LJIIJJI(c, c2) < 0 : o.LJIIJJI(c, c2) > 0) {
            z = false;
        }
        this.LJLJI = z;
        this.LJLJJI = z ? c : c2;
    }
}
