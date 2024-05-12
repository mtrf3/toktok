package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8XG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XG {
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<InterfaceC65350Pko<?>, AssemViewModel<?>> LIZIZ = new ConcurrentHashMap<>();

    public final <VM extends AssemViewModel<S>, S extends C33Q, ITEM> void LIZ(VM vm, InterfaceC88473Ynt<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC88473Ynt, C8XE c8xe) {
        o.LJIIIZ(vm, "vm");
        C65776Prg LIZ = C65352Pkq.LIZ(vm.getClass());
        if (!this.LIZ.containsKey(LIZ)) {
            if (c8xe != null) {
                c8xe.LJIILJJIL(vm, interfaceC88473Ynt);
            }
            this.LIZ.put(LIZ, interfaceC88473Ynt);
            this.LIZIZ.put(LIZ, vm);
        }
    }

    public final void LIZIZ(Object obj, List<? extends Object> list, long j) {
        for (Map.Entry<InterfaceC65350Pko<?>, Object> entry : this.LIZ.entrySet()) {
            AssemViewModel<?> assemViewModel = this.LIZIZ.get(entry.getKey());
            if (assemViewModel != null) {
                assemViewModel.maxScheduledGeneration = j;
                AssemViewModel.syncItem2State$default(assemViewModel, obj, list, entry.getValue(), null, 8, null);
            }
        }
    }
}
