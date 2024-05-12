package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.AutoMsgFetchNode$tryLandToChat$1", f = "AutoMsgFetchNode.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2p4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70102p4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C70392pX LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70102p4(C70392pX c70392pX, InterfaceC67352kd<? super C70102p4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c70392pX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70102p4 c70102p4 = new C70102p4(this.LJLILLLLZI, interfaceC67352kd);
        c70102p4.LJLIL = obj;
        return c70102p4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        C70392pX c70392pX = this.LJLILLLLZI;
        C70172pB c70172pB = c70392pX.LJIIJJI;
        if (c70172pB != null) {
            XKX.LIZLLL(interfaceC70422pa, null, null, new C70112p5(c70172pB, null), 3);
            XKX.LIZLLL(interfaceC70422pa, C78613UtF.LIZJ, null, new C70092p3(c70172pB, c70392pX, null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
