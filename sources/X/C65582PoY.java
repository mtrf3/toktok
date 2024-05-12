package X;

import java.util.NoSuchElementException;

/* renamed from: X.PoY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65582PoY extends AbstractC65557Po9<Object> {
    public boolean LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.LJLIL;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LJLIL) {
            this.LJLIL = true;
            return this.LJLILLLLZI;
        }
        throw new NoSuchElementException();
    }

    public C65582PoY(Object obj) {
        this.LJLILLLLZI = obj;
    }
}
