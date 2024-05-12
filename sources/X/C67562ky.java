package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$setPendingEvents$2", f = "MobClickConsentHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67562ky extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C67602l2> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67562ky(List<C67602l2> list, InterfaceC67352kd<? super C67562ky> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67562ky(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<C67602l2> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C67602l2> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C75792yF.LIZJ(it.next()));
        }
        C67612l3.LIZ.storeStringArray("pending_events", (String[]) arrayList.toArray(new String[0]));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
