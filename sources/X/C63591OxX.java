package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher$fetchByHttp$resultItem$1", f = "DefaultRemoteFetcher.kt", l = {255}, m = "invokeSuspend")
/* renamed from: X.OxX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63591OxX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C63675Oyt>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63589OxV LJLILLLLZI;
    public final /* synthetic */ C63588OxU LJLJI;
    public final /* synthetic */ C63606Oxm LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63591OxX(C63589OxV c63589OxV, C63588OxU c63588OxU, C63606Oxm c63606Oxm, InterfaceC67352kd<? super C63591OxX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63589OxV;
        this.LJLJI = c63588OxU;
        this.LJLJJI = c63606Oxm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63591OxX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C63589OxV c63589OxV = this.LJLILLLLZI;
            C63588OxU c63588OxU = this.LJLJI;
            C63606Oxm c63606Oxm = this.LJLJJI;
            this.LJLIL = 1;
            obj = c63589OxV.LJII(c63588OxU, c63606Oxm, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C63675Oyt> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
