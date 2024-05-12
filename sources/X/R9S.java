package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9S extends QQE<C68922R3e> {
    public final /* synthetic */ C45R<C68922R3e> LIZ;

    public R9S(C73516StE c73516StE) {
        this.LIZ = c73516StE;
    }

    @Override // X.QQE
    public final void onResponse(C68922R3e response) {
        o.LJIIIZ(response, "response");
        if (response.LIZIZ) {
            ((C73516StE) this.LIZ).onSuccess(response);
            return;
        }
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LJ, null, EnumC69116RAq.NONE, EnumC69113RAn.NONE, null, null, 32, null));
    }
}
