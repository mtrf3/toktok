package X;

import Y.ARunnableS31S0200000_12;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS162S0100000_12;

@InterfaceC65848Psq(c = "com.bytedance.ies.powerlist.page.PowerPageLoader$refreshInner$1", f = "PowerPageLoader.kt", l = {374}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SZK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PowerPageLoader<T> LJLILLLLZI;
    public final /* synthetic */ SZP LJLJI;
    public final /* synthetic */ C72242sW LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZK(PowerPageLoader<T> powerPageLoader, SZP szp, C72242sW c72242sW, InterfaceC67352kd<? super SZK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = powerPageLoader;
        this.LJLJI = szp;
        this.LJLJJI = c72242sW;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new SZK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<InterfaceC57784Mm4> list;
        List<InterfaceC57784Mm4> list2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                SZ0 sz0 = this.LJLILLLLZI.LJLJI;
                if (sz0 != null) {
                    sz0.LIZ(C65352Pkq.LIZ(C88516Yoa.class));
                }
                PowerPageLoader<T> powerPageLoader = this.LJLILLLLZI;
                C72242sW c72242sW = this.LJLJJI;
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                powerPageLoader.LJLZ = xks;
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                powerPageLoader.LJLIL.onRefresh(xks);
                c72242sW.element = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                obj = xks.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            A2G a2g = (A2G) obj;
            if (a2g instanceof A2V) {
                PowerPageLoader<T> powerPageLoader2 = this.LJLILLLLZI;
                C72808Sho<InterfaceC57784Mm4> c72808Sho = powerPageLoader2.LJLILLLLZI;
                if ((!powerPageLoader2.LJLJJL.LJIIIIZZ || ((list2 = ((A2V) a2g).LIZLLL) != null && !list2.isEmpty())) && c72808Sho != null) {
                    c72808Sho.LJIIJJI(((A2V) a2g).LIZLLL);
                }
                this.LJLILLLLZI.LJLJLLL = new OSZ<>(((A2V) a2g).LIZIZ, ((A2V) a2g).LIZJ);
                this.LJLILLLLZI.LJ().LIZ(SZY.Loaded, this.LJLJI, new C35923E7z(((A2V) a2g).LIZIZ, ((A2V) a2g).LIZJ));
            } else if (a2g instanceof A2I) {
                this.LJLILLLLZI.LJ().LIZ(SZY.Error, this.LJLJI, ((A2I) a2g).LIZIZ);
            } else if (a2g instanceof A2H) {
                PowerPageLoader<T> powerPageLoader3 = this.LJLILLLLZI;
                C72808Sho<InterfaceC57784Mm4> c72808Sho2 = powerPageLoader3.LJLILLLLZI;
                if ((!powerPageLoader3.LJLJJL.LJIIIIZZ || ((list = ((A2H) a2g).LIZIZ) != null && !list.isEmpty())) && c72808Sho2 != null) {
                    c72808Sho2.LJIILLIIL(((A2H) a2g).LIZIZ);
                }
                ((Handler) this.LJLILLLLZI.LJLL.getValue()).post(new ARunnableS31S0200000_12(this.LJLJI, this.LJLILLLLZI, 2));
            }
            SZ0 sz02 = this.LJLILLLLZI.LJLJI;
            if (sz02 != null) {
                sz02.LIZIZ(C65352Pkq.LIZ(C88516Yoa.class), new AqS162S0100000_12(this.LJLJJI, 73));
            }
            return C76800UCe.LIZ;
        } catch (CancellationException e) {
            C16880lQ.LLLLIIL(e);
            return C76800UCe.LIZ;
        }
    }
}
