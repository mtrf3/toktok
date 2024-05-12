package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$resolve$2$1", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public GLG(InterfaceC67352kd<? super GLG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLG(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C60903NvH.LJIIJJI().LJJIII().preloadEffectModel();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new GLG(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
