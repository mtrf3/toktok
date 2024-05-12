package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.UWh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77323UWh implements Iterator<String>, InterfaceC90533gv {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C77324UWi LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL == null && !this.LJLILLLLZI) {
            String readLine = this.LJLJI.LIZ.readLine();
            this.LJLIL = readLine;
            if (readLine == null) {
                this.LJLILLLLZI = true;
            }
        }
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (hasNext()) {
            String str = this.LJLIL;
            this.LJLIL = null;
            o.LJI(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    public C77323UWh(C77324UWi c77324UWi) {
        this.LJLJI = c77324UWi;
    }
}
