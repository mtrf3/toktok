package X;

import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.manager.NearbyVVCounter$recordVVCount$1", f = "NearbyVVCounter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63202dw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OSZ<Integer, InterfaceC65784Pro<C76800UCe>> LJLIL;
    public final /* synthetic */ Iterator<OSZ<Integer, InterfaceC65784Pro<C76800UCe>>> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63202dw(OSZ<Integer, ? extends InterfaceC65784Pro<C76800UCe>> osz, Iterator<? extends OSZ<Integer, ? extends InterfaceC65784Pro<C76800UCe>>> it, InterfaceC67352kd<? super C63202dw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = osz;
        this.LJLILLLLZI = it;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63202dw(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.getSecond().invoke();
        this.LJLILLLLZI.remove();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
