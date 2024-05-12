package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.behaviour.viewmodel.ActionViewModel$filterNotSupport$2", f = "ActionViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ang, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94852ang extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends C94384ag8>>, Object> {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94852ang(List list, List list2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94852ang(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends C94384ag8>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ArrayList arrayList = new ArrayList();
        for (C94384ag8 c94384ag8 : this.LJLIL) {
            List<C94383ag7> list = c94384ag8.LJLJI;
            ArrayList arrayList2 = new ArrayList();
            for (C94383ag7 c94383ag7 : list) {
                if (Boolean.valueOf(this.LJLILLLLZI.contains(c94383ag7.LJLJI)).booleanValue()) {
                    arrayList2.add(c94383ag7);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C94384ag8(c94384ag8.LJLIL, c94384ag8.LJLILLLLZI, arrayList2));
            }
        }
        return arrayList;
    }
}
