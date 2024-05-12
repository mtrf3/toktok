package X;

import java.util.NoSuchElementException;

/* renamed from: X.Po6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65554Po6<T> extends AbstractC65557Po9<T> {
    public EnumC65555Po7 LJLIL = EnumC65555Po7.NOT_READY;
    public T LJLILLLLZI;

    public abstract T LIZ();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        EnumC65555Po7 enumC65555Po7 = this.LJLIL;
        EnumC65555Po7 enumC65555Po72 = EnumC65555Po7.FAILED;
        if (enumC65555Po7 != enumC65555Po72) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILL(z);
        int ordinal = this.LJLIL.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.LJLIL = enumC65555Po72;
        this.LJLILLLLZI = LIZ();
        if (this.LJLIL != EnumC65555Po7.DONE) {
            this.LJLIL = EnumC65555Po7.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.LJLIL = EnumC65555Po7.NOT_READY;
            T t = this.LJLILLLLZI;
            this.LJLILLLLZI = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
