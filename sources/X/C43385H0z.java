package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$clearCacheFiles$1", f = "UploadFrameServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.H0z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43385H0z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ H15 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43385H0z(H15 h15, InterfaceC67352kd<? super C43385H0z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = h15;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43385H0z(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object value = this.LJLIL.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-poolDir>(...)");
        C44687HgJ.LJIILLIIL((String) value, H10.LJLIL);
        Object value2 = this.LJLIL.LIZIZ.getValue();
        o.LJIIIIZZ(value2, "<get-poolDir>(...)");
        C44687HgJ.LJIILIIL((String) value2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
