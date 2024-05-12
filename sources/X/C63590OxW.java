package X;

import com.bytedance.im.core.proto.Request;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetchByWs$2", f = "DefaultRemoteFetcher.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.OxW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63590OxW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63589OxV LJLIL;
    public final /* synthetic */ Request LJLILLLLZI;
    public final /* synthetic */ C63597Oxd LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63590OxW(C63589OxV c63589OxV, Request request, C63597Oxd c63597Oxd, InterfaceC67352kd<? super C63590OxW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63589OxV;
        this.LJLILLLLZI = request;
        this.LJLJI = c63597Oxd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63590OxW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC63292Osi invoke = this.LJLIL.LIZ.invoke();
        Integer num = this.LJLILLLLZI.cmd;
        o.LJIIIIZZ(num, "request.cmd");
        int intValue = num.intValue();
        Long l = this.LJLILLLLZI.sequence_id;
        o.LJIIIIZZ(l, "request.sequence_id");
        long longValue = l.longValue();
        C63597Oxd c63597Oxd = this.LJLJI;
        invoke.LJIILJJIL(longValue, intValue, c63597Oxd.LIZ, c63597Oxd.LIZIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
