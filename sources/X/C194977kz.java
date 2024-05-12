package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeCacheManager$insert$4", f = "NowSelfAwemeCacheManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194977kz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Aweme> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C194977kz(List<? extends Aweme> list, InterfaceC67352kd<? super C194977kz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C194977kz(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<Aweme> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Aweme> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C188897bB.LIZ(it.next()));
        }
        VFJ.LIZ().LJIJ().LIZ(arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
