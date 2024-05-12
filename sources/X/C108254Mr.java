package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.FilteredListModelImpl$updateFilteredAndNotify$1", f = "FilteredListModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108254Mr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C63120Opw> LJLIL;
    public final /* synthetic */ InterfaceC81623Ig LJLILLLLZI;
    public final /* synthetic */ C108274Mt LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C108254Mr(List<? extends C63120Opw> list, InterfaceC81623Ig interfaceC81623Ig, C108274Mt c108274Mt, InterfaceC67352kd<? super C108254Mr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC81623Ig;
        this.LJLJI = c108274Mt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C108254Mr(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            ArrayList arrayList = new ArrayList();
            List<C63120Opw> list = this.LJLIL;
            if (list != null) {
                C108274Mt c108274Mt = this.LJLJI;
                for (C63120Opw c63120Opw : list) {
                    if (c63120Opw.isFiltered()) {
                        ConcurrentHashMap<String, C63120Opw> LJIIIZ = c108274Mt.LJIIIZ();
                        String conversationId = c63120Opw.getConversationId();
                        o.LJIIIIZZ(conversationId, "it.conversationId");
                        LJIIIZ.put(conversationId, c63120Opw);
                        arrayList.add(c63120Opw);
                    }
                }
            }
            InterfaceC81623Ig interfaceC81623Ig = this.LJLILLLLZI;
            if (interfaceC81623Ig != null) {
                ((C4WE) interfaceC81623Ig).LIZ(arrayList);
            }
            this.LJLJI.LJIIJ();
        } catch (Exception e) {
            C63322OtC.LJ("FilteredListModelImpl", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
