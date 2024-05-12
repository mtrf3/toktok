package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.BrickInfoParserKt$toBrickList$2$1$1", f = "BrickInfoParser.kt", l = {69}, m = "invokeSuspend")
/* renamed from: X.Aso, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27626Aso extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpLynxPreloadItem LJLILLLLZI;
    public final /* synthetic */ C27627Asp LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27626Aso(PdpLynxPreloadItem pdpLynxPreloadItem, C27627Asp c27627Asp, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C27626Aso> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpLynxPreloadItem;
        this.LJLJI = c27627Asp;
        this.LJLJJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27626Aso(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI.duration;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String schema = this.LJLJI.LJLJJI;
        String biz = this.LJLJJI.LLJLIL.LJLJLJ;
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(biz, "biz");
        ConcurrentHashMap<String, ConcurrentSkipListSet<String>> concurrentHashMap = O9C.LIZ;
        ConcurrentSkipListSet<String> concurrentSkipListSet = concurrentHashMap.get(biz);
        if (concurrentSkipListSet == null) {
            concurrentSkipListSet = new ConcurrentSkipListSet<>();
        }
        concurrentSkipListSet.add(schema);
        concurrentHashMap.put(biz, concurrentSkipListSet);
        C58310MuY.LIZIZ.LJII(schema, biz, null, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
