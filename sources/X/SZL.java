package X;

import com.bytedance.ies.powerlist.page.PowerPageLoader;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.bytedance.ies.powerlist.page.PowerPageLoader$loadLatestInner$1", f = "PowerPageLoader.kt", l = {374}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SZL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PowerPageLoader<T> LJLJI;
    public final /* synthetic */ SZP LJLJJI;
    public final /* synthetic */ T LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZL(PowerPageLoader<T> powerPageLoader, SZP szp, T t, InterfaceC67352kd<? super SZL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = powerPageLoader;
        this.LJLJJI = szp;
        this.LJLJJL = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SZL(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                PowerPageLoader<T> powerPageLoader = this.LJLJI;
                Object obj2 = this.LJLJJL;
                this.LJLIL = obj2;
                this.LJLILLLLZI = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                powerPageLoader.LJLLLLLL = xks;
                if (obj2 != null || (obj2 = powerPageLoader.LJLJLLL.getFirst()) != null) {
                    powerPageLoader.LJLIL.onLoadLatest(xks, obj2);
                }
                obj = xks.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            A2G a2g = (A2G) obj;
            if (a2g instanceof A2V) {
                List<InterfaceC57784Mm4> list = ((A2V) a2g).LIZLLL;
                if (true ^ list.isEmpty()) {
                    this.LJLJI.LJLILLLLZI.LIZLLL(0, list);
                }
                PowerPageLoader<T> powerPageLoader2 = this.LJLJI;
                powerPageLoader2.LJLJLLL = OSZ.copy$default(powerPageLoader2.LJLJLLL, ((A2V) a2g).LIZIZ, null, 2, null);
                this.LJLJI.LJ().LIZ(SZY.Loaded, this.LJLJJI, null);
            } else if (a2g instanceof A2I) {
                this.LJLJI.LJ().LIZ(SZY.Error, this.LJLJJI, ((A2I) a2g).LIZIZ);
            } else if (a2g instanceof A2H) {
                List<InterfaceC57784Mm4> list2 = ((A2H) a2g).LIZIZ;
                if (!list2.isEmpty()) {
                    this.LJLJI.LJLILLLLZI.LIZLLL(0, list2);
                }
                this.LJLJI.LJ().LIZ(SZY.End, this.LJLJJI, null);
            }
            return C76800UCe.LIZ;
        } catch (CancellationException e) {
            C16880lQ.LLLLIIL(e);
            return C76800UCe.LIZ;
        }
    }
}
