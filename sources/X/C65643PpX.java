package X;

import java.util.Iterator;

/* renamed from: X.PpX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65643PpX extends AbstractC65645PpZ<Object, Object> {
    public final /* synthetic */ InterfaceC65644PpY LJLILLLLZI;

    @Override // X.AbstractC65645PpZ
    public final Object LIZ(Object obj) {
        return this.LJLILLLLZI.apply(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65643PpX(Iterator it, InterfaceC65644PpY interfaceC65644PpY) {
        super(it);
        this.LJLILLLLZI = interfaceC65644PpY;
    }
}
