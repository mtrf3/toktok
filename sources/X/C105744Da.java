package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel$pollResources$1$2", f = "EmojiModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105744Da extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105744Da(boolean z, InterfaceC67352kd<? super C105744Da> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C105744Da(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4FD.LJII(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
