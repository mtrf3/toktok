package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel$onLoadEmojiData$1", f = "EmojiModel.kt", l = {175}, m = "invokeSuspend")
/* renamed from: X.4FL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C4FL(InterfaceC67352kd<? super C4FL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FL(interfaceC67352kd);
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
            C4FF.LJI();
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C4FM c4fm = new C4FM(null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c4fm, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C4FL(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
