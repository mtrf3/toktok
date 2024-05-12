package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.powerlist.optimize.preload.ViewCacheAbility$preCreateVH$1", f = "ViewCacheExtension.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Y6, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ PowerAdapter LJLILLLLZI;
    public final /* synthetic */ C49485JbV LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Y6(PowerAdapter powerAdapter, C49485JbV c49485JbV, InterfaceC67352kd<? super C9Y6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = powerAdapter;
        this.LJLJI = c49485JbV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9Y6 c9y6 = new C9Y6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c9y6.LJLIL = obj;
        return c9y6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PowerAdapter powerAdapter = this.LJLILLLLZI;
        C49485JbV c49485JbV = this.LJLJI;
        try {
            Iterator<Integer> it = powerAdapter.LLIIL().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                int i = c49485JbV.LJLIL.preloadCount;
                for (int i2 = 0; i2 < i; i2++) {
                    PowerCell<? extends InterfaceC57784Mm4> createViewHolder = powerAdapter.createViewHolder(c49485JbV.LJLILLLLZI, intValue);
                    o.LJIIIIZZ(createViewHolder, "adapter.createViewHolder(powerList, type)");
                    c49485JbV.LJIJI(createViewHolder, intValue);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
