package X;

import java.util.Iterator;

/* renamed from: X.Po5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65553Po5 extends AbstractC65554Po6<Object> {
    public final /* synthetic */ Iterator LJLJI;
    public final /* synthetic */ InterfaceC65503PnH LJLJJI;

    @Override // X.AbstractC65554Po6
    public final Object LIZ() {
        while (this.LJLJI.hasNext()) {
            Object next = this.LJLJI.next();
            if (this.LJLJJI.apply(next)) {
                return next;
            }
        }
        this.LJLIL = EnumC65555Po7.DONE;
        return null;
    }

    public C65553Po5(Iterator it, InterfaceC65503PnH interfaceC65503PnH) {
        this.LJLJI = it;
        this.LJLJJI = interfaceC65503PnH;
    }
}
