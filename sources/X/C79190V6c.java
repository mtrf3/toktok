package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.V6c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C79190V6c extends TAZ implements InterfaceC88471Ynr<V75, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C79190V6c(Object obj) {
        super(2, obj, V6M.class, "triggerPaging", "triggerPaging(Lcom/bytedance/ext_power_list/AssemSingleListViewModel;Ltiktok/compose/paging/ComposePagingType;)V", 5);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(V75 v75, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        V75 s = v75;
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) this.receiver;
        o.LJIIIZ(assemSingleListViewModel, "<this>");
        o.LJIIIZ(s, "s");
        int i = V76.LIZ[s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AssemSingleListViewModel.manualListLoadLatest$default(assemSingleListViewModel, null, 1, null);
                }
            } else {
                AssemSingleListViewModel.manualListLoadMore$default(assemSingleListViewModel, null, 1, null);
            }
        } else {
            assemSingleListViewModel.manualListRefresh();
        }
        return C76800UCe.LIZ;
    }
}
