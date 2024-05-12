package X;

import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.RecentSharedSortManager$shareWithNoCheck$3", f = "RecentSharedSortManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3WC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ArrayList<YXF> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3WC(ArrayList<YXF> arrayList, InterfaceC67352kd<? super C3WC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3WC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJLI().LIZ(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
