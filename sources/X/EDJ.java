package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.pipfeed.components.single.PlayerViewComponent$onRenderFirstFrame$1$1", f = "PlayerViewComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EDJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C48774JCg LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDJ(C48774JCg c48774JCg, String str, InterfaceC67352kd<? super EDJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c48774JCg;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EDJ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LLF.storeString("last_session_record", this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
