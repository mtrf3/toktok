package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.base.BaseAssetHandler$scheduleFrameUpdate$1", f = "BaseAssetHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94953apJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC94369aft LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94953apJ(AbstractC94369aft abstractC94369aft, int i, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC94369aft;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94953apJ(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C93939aYx.LIZ().removeAlgorithmCallback(this.LJLIL.LIZIZ);
        C93939aYx.LIZ().addAlgorithmCallback(this.LJLILLLLZI, this.LJLIL.LIZIZ);
        return C76800UCe.LIZ;
    }
}
