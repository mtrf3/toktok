package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.BrickInfoParserKt$toBrickList$2", f = "BrickInfoParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Asn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27625Asn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<InterfaceC27632Asu> LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27625Asn(List<InterfaceC27632Asu> list, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C27625Asn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27625Asn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Set keySet;
        PdpLynxPreloadItem pdpLynxPreloadItem;
        InterfaceC27632Asu interfaceC27632Asu;
        C27627Asp c27627Asp;
        C141335gf.LIZJ(obj);
        java.util.Map LIZ = C235179Kv.LIZ();
        if (LIZ != null && (keySet = ((LinkedHashMap) LIZ).keySet()) != null) {
            List<InterfaceC27632Asu> list = this.LJLIL;
            PdpViewModel pdpViewModel = this.LJLILLLLZI;
            for (Object obj2 : keySet) {
                java.util.Map LIZ2 = C235179Kv.LIZ();
                if (LIZ2 == null || (pdpLynxPreloadItem = (PdpLynxPreloadItem) ((LinkedHashMap) LIZ2).get(obj2)) == null) {
                    pdpLynxPreloadItem = new PdpLynxPreloadItem(false, 0, 3, null);
                }
                if (pdpLynxPreloadItem.enablePreload) {
                    Iterator<InterfaceC27632Asu> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            interfaceC27632Asu = it.next();
                            if (o.LJ(String.valueOf(interfaceC27632Asu.getBrickName()), obj2)) {
                                break;
                            }
                        } else {
                            interfaceC27632Asu = null;
                            break;
                        }
                    }
                    if ((interfaceC27632Asu instanceof C27627Asp) && (c27627Asp = (C27627Asp) interfaceC27632Asu) != null) {
                        C78565UsT.LJJIJ(pdpViewModel, C78613UtF.LIZJ, new C27626Aso(pdpLynxPreloadItem, c27627Asp, pdpViewModel, null));
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
