package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$suggestedStickerDisplayFlow$1", f = "ChatRoomViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72402sm extends AbstractC65782Prm implements InterfaceC88474Ynu<Boolean, Boolean, Boolean, InterfaceC67352kd<? super C3FJ>, Object> {
    public /* synthetic */ boolean LJLIL;
    public /* synthetic */ boolean LJLILLLLZI;
    public /* synthetic */ boolean LJLJI;

    public C72402sm(InterfaceC67352kd<? super C72402sm> interfaceC67352kd) {
        super(4, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        boolean z = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        boolean z3 = this.LJLJI;
        if (z || z3 || z2) {
            return C3FJ.HIDDEN_PERMANENTLY;
        }
        return C3FJ.VISIBLE;
    }

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Boolean bool, Boolean bool2, Boolean bool3, InterfaceC67352kd<? super C3FJ> interfaceC67352kd) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        C72402sm c72402sm = new C72402sm(interfaceC67352kd);
        c72402sm.LJLIL = booleanValue;
        c72402sm.LJLILLLLZI = booleanValue2;
        c72402sm.LJLJI = booleanValue3;
        return c72402sm.invokeSuspend(C76800UCe.LIZ);
    }
}
