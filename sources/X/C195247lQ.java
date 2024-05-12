package X;

import fjb.a;
import java.util.Map;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry$fire$1$1", f = "NowGlobalEventCenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195247lQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Map.Entry<InterfaceC195257lR<T>, Object> LJLIL;
    public final /* synthetic */ T LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C195247lQ(Map.Entry<? extends InterfaceC195257lR<T>, ? extends Object> entry, T t, InterfaceC67352kd<? super C195247lQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = entry;
        this.LJLILLLLZI = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C195247lQ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((InterfaceC195257lR) this.LJLIL.getKey()).LIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
