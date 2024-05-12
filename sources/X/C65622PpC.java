package X;

/* renamed from: X.PpC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65622PpC extends AbstractC65557Po9<Object> {
    public final AbstractC65557Po9 LJLIL;
    public AbstractC65557Po9 LJLILLLLZI = C65608Poy.LJLJJL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI.hasNext() || this.LJLIL.hasNext()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LJLILLLLZI.hasNext()) {
            this.LJLILLLLZI = ((AbstractC65578PoU) this.LJLIL.next()).iterator();
        }
        return this.LJLILLLLZI.next();
    }

    public C65622PpC(AbstractC65611Pp1 abstractC65611Pp1) {
        this.LJLIL = abstractC65611Pp1.LJLJJLL.values().iterator();
    }
}
