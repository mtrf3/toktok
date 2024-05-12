package X;

import java.util.Map;

/* renamed from: X.Pp7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65617Pp7 extends AbstractC65557Po9<Map.Entry<Object, Object>> {
    public final AbstractC65557Po9 LJLIL;
    public Object LJLILLLLZI = null;
    public AbstractC65557Po9 LJLJI = C65608Poy.LJLJJL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJI.hasNext() || this.LJLIL.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LJLJI.hasNext()) {
            Map.Entry entry = (Map.Entry) this.LJLIL.next();
            this.LJLILLLLZI = entry.getKey();
            this.LJLJI = ((AbstractC65578PoU) entry.getValue()).iterator();
        }
        return new C65506PnK(this.LJLILLLLZI, this.LJLJI.next());
    }

    public C65617Pp7(AbstractC65611Pp1 abstractC65611Pp1) {
        this.LJLIL = abstractC65611Pp1.LJLJJLL.entrySet().iterator();
    }
}
