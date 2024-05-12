package X;

import Y.ARunnableS38S0100000_2;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewComponent$onDestroy$1$1", f = "EditPreviewComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143295jp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ARunnableS38S0100000_2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C143295jp(ARunnableS38S0100000_2 aRunnableS38S0100000_2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aRunnableS38S0100000_2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C143295jp(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC153045zY LJLIIL = ((C143265jm) this.LJLIL.l0).LJLIIL();
        if (LJLIIL != null) {
            LJLIIL.destroy();
        }
        ((C143265jm) this.LJLIL.l0).LJJLIIIJILLIZJL();
        return C76800UCe.LIZ;
    }
}
