package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.result.SendGiftResultHandlerManager$onFailResult$1", f = "SendGiftResultHandlerManager.kt", l = {87, 102}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UVK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public UVO LJLIL;
    public UV8 LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ UVO LJLJJLL;
    public final /* synthetic */ C32816CuK LJLJL;
    public final /* synthetic */ UV8 LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVK(UVO uvo, C32816CuK c32816CuK, UV8 uv8, InterfaceC67352kd<? super UVK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = uvo;
        this.LJLJL = c32816CuK;
        this.LJLJLJ = uv8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UVK(this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVK.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
