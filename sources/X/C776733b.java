package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.SourceExtKt$onInit$1", f = "SourceExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.33b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C776733b extends AbstractC65782Prm implements InterfaceC88471Ynr<C57969Mp3, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C57969Mp3, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C776733b(C34K c34k, InterfaceC88472Yns<? super C57969Mp3, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C776733b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c34k;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C776733b c776733b = new C776733b(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c776733b.LJLIL = obj;
        return c776733b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C57969Mp3 c57969Mp3 = (C57969Mp3) this.LJLIL;
        C34K c34k = this.LJLILLLLZI;
        if (c34k.element) {
            return C76800UCe.LIZ;
        }
        boolean z = c57969Mp3.LIZ;
        c34k.element = z;
        if (z) {
            this.LJLJI.invoke(c57969Mp3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C57969Mp3 c57969Mp3, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c57969Mp3, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
