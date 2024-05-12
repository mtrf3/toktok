package X;

import fjb.a;
import kotlin.jvm.internal.AqS36S0210000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$checkValid$1", f = "ReflowSideProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9XZ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9XZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ android.net.Uri LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9XZ(android.net.Uri uri, InterfaceC67352kd<? super C9XZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9XZ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        final android.net.Uri uri = this.LJLIL;
        new AbstractC238349Xa(uri) { // from class: X.9XX
            public final String LIZIZ;
            public final C5H3 LIZJ;

            @Override // X.AbstractC238349Xa
            public final java.util.Map<String, String> LIZIZ() {
                Object value = this.LIZJ.getValue();
                o.LJIIIIZZ(value, "<get-params>(...)");
                return (java.util.Map) value;
            }

            @Override // X.AbstractC238349Xa
            public final String LIZ() {
                return this.LIZIZ;
            }

            {
                boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
                o.LJIIIZ(uri, "uri");
                this.LIZIZ = "link_parse_result";
                this.LIZJ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS36S0210000_4(this, isLogin, uri, 1));
            }
        }.LIZLLL("@LinkRelation");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
