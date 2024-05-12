package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.sticker.StickerInlineMessageChecker$onSendMessage$1", f = "StickerInlineMessageChecker.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91213i1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C91203i0 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91213i1(C91203i0 c91203i0, InterfaceC67352kd<? super C91213i1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c91203i0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91213i1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String LJFF = C91093hp.LJFF(this.LJLIL.LIZ);
        if (LJFF != null) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C109544Rq LJIILJJIL = C63150OqQ.LJIILJJIL(LJFF);
            if (LJIILJJIL != null) {
                java.util.Map<String, String> localExt = LJIILJJIL.getLocalExt();
                if (localExt != null) {
                    localExt.remove("a:sticker_store_inline");
                }
                C106674Gp.LJIILJJIL(LJIILJJIL);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
