package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8O extends AbstractC68940R3w {
    public final /* synthetic */ C45R<C69030R7i> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    public R8O(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI response, int i) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(i, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), response.LJII, null, 32, null));
    }
}
