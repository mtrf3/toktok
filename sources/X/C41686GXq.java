package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$1$2", f = "Forward2StoryEnvironment.kt", l = {233}, m = "invokeSuspend")
/* renamed from: X.GXq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41686GXq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super GYE>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C41686GXq(InterfaceC67352kd<? super C41686GXq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41686GXq(interfaceC67352kd);
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
            C41690GXu c41690GXu = new C41690GXu();
            C41685GXp c41685GXp = new C41685GXp(false);
            this.LJLIL = 1;
            if (AbstractC41806Gaw.LIZ(c41690GXu, c41685GXp, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super GYE> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C41686GXq(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
