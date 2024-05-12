package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader$fetchAndCacheImages$2", f = "PhotoModeImageLoader.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.2iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66062iY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends C76800UCe>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ List<W5O> LJLJI;
    public final /* synthetic */ C78774Uvq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66062iY(C78774Uvq c78774Uvq, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
        this.LJLJJI = c78774Uvq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C66062iY c66062iY = new C66062iY(this.LJLJJI, this.LJLJI, interfaceC67352kd);
        c66062iY.LJLILLLLZI = obj;
        return c66062iY;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            List<W5O> list = this.LJLJI;
            C78774Uvq c78774Uvq = this.LJLJJI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<W5O> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C32043Chr(c78774Uvq, it.next(), null), 3));
            }
            this.LJLIL = 1;
            obj = T1W.LIZ(arrayList, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends C76800UCe>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
