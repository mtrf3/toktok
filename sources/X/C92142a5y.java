package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.a5y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92142a5y implements Iterator<C91720ZzA>, InterfaceC90533gv {
    public int LJLIL = -1;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C92143a5z LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL + 1 < this.LJLJI.LJLJLLL.LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LJLILLLLZI) {
            C0MB<C91720ZzA> c0mb = this.LJLJI.LJLJLLL;
            c0mb.LJIIIZ(this.LJLIL).LJLILLLLZI = null;
            int i = this.LJLIL;
            Object[] objArr = c0mb.LJLJI;
            Object obj = objArr[i];
            Object obj2 = C0MB.LJLJJL;
            if (obj != obj2) {
                objArr[i] = obj2;
                c0mb.LJLIL = true;
            }
            this.LJLIL = i - 1;
            this.LJLILLLLZI = false;
            return;
        }
        "You must call next() before you can remove an element".toString();
        throw new IllegalStateException("You must call next() before you can remove an element");
    }

    @Override // java.util.Iterator
    public final C91720ZzA next() {
        if (hasNext()) {
            this.LJLILLLLZI = true;
            C0MB<C91720ZzA> c0mb = this.LJLJI.LJLJLLL;
            int i = this.LJLIL + 1;
            this.LJLIL = i;
            C91720ZzA LJIIIZ = c0mb.LJIIIZ(i);
            o.LJIIIIZZ(LJIIIZ, "nodes.valueAt(++index)");
            return LJIIIZ;
        }
        throw new NoSuchElementException();
    }

    public C92142a5y(C92143a5z c92143a5z) {
        this.LJLJI = c92143a5z;
    }
}
