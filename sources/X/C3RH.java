package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.CombinedLoader$loadInternal$1$1", f = "CombinedLoader.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3RH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3RZ<R> LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RH(C3RZ<R> c3rz, Object obj, boolean z, InterfaceC67352kd<? super C3RH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3rz;
        this.LJLILLLLZI = obj;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3RH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJI = false;
        if (C3C5.m13isSuccessimpl(this.LJLILLLLZI)) {
            C3RG c3rg = this.LJLIL;
            Object obj2 = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            if (C3C5.m12isFailureimpl(obj2)) {
                obj2 = arrayList;
            }
            c3rg.LIZIZ((List) obj2, this.LJLJI);
        } else if (C3C5.m12isFailureimpl(this.LJLILLLLZI)) {
            C3RG c3rg2 = this.LJLIL;
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(this.LJLILLLLZI);
            o.LJI(m10exceptionOrNullimpl);
            if (this.LJLJI) {
                InterfaceC82613Mb<R> interfaceC82613Mb = c3rg2.LIZ;
                if (interfaceC82613Mb != 0) {
                    interfaceC82613Mb.L8(m10exceptionOrNullimpl);
                } else {
                    o.LJIJI("loadSubscriber");
                    throw null;
                }
            } else {
                InterfaceC82613Mb<R> interfaceC82613Mb2 = c3rg2.LIZ;
                if (interfaceC82613Mb2 != 0) {
                    interfaceC82613Mb2.Y8(m10exceptionOrNullimpl);
                } else {
                    o.LJIJI("loadSubscriber");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
