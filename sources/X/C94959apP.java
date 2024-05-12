package X;

import android.graphics.Bitmap;
import fjb.a;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.Selector$notifySelectCallbacks$2$1", f = "Selector.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94959apP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IDqS419S0100000_42 LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94959apP(IDqS419S0100000_42 iDqS419S0100000_42, Bitmap bitmap, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iDqS419S0100000_42;
        this.LJLILLLLZI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94959apP(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C93996aZs) this.LJLIL.l0).LIZ.onBitmapResult(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
