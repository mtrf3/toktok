package X;

import androidx.recyclerview.widget.RecyclerView;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.AbsMessageAdapter$submitListDelegate$1", f = "AbsMessageAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.43i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1032243i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AbstractC1029742j LJLILLLLZI;
    public final /* synthetic */ List<C109544Rq> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1032243i(AbstractC1029742j abstractC1029742j, List<? extends C109544Rq> list, InterfaceC67352kd<? super C1032243i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC1029742j;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1032243i c1032243i = new C1032243i(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c1032243i.LJLIL = obj;
        return c1032243i;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C1038845w c1038845w;
        AbstractC029409q adapter;
        int i;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        if (((Number) C45X.LIZ.getValue()).intValue() == 1) {
            MBA context = interfaceC70422pa.getCoroutineContext();
            RecyclerView recyclerView = this.LJLILLLLZI.LJLIL;
            List<C109544Rq> messages = this.LJLJI;
            o.LJIIIZ(context, "context");
            o.LJIIIZ(messages, "messages");
            if (recyclerView != null) {
                RecyclerView.RecycledViewPool recycledViewPool = recyclerView.getRecycledViewPool();
                if ((recycledViewPool instanceof C1038845w) && (c1038845w = (C1038845w) recycledViewPool) != null && (adapter = recyclerView.getAdapter()) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C109544Rq c109544Rq : messages) {
                        EnumC110124Tw.Companion.getClass();
                        int viewType = C110134Tx.LJFF(c109544Rq).getViewType();
                        Integer valueOf = Integer.valueOf(viewType);
                        Integer num = (Integer) linkedHashMap.get(Integer.valueOf(viewType));
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        linkedHashMap.put(valueOf, Integer.valueOf(i + 1));
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry.getKey()).intValue();
                        int intValue2 = ((Number) entry.getValue()).intValue();
                        Queue<RecyclerView.ViewHolder> queue = c1038845w.LIZ.get(intValue);
                        if (queue == null) {
                            queue = new LinkedList<>();
                            c1038845w.LIZ.put(intValue, queue);
                        }
                        int max = Math.max(3, intValue2 - queue.size());
                        for (int i2 = 0; i2 < max; i2++) {
                            C79146V4k.LJJIIJ(context);
                            RecyclerView.ViewHolder createViewHolder = adapter.createViewHolder(recyclerView, intValue);
                            o.LJIIIIZZ(createViewHolder, "adapter.createViewHolder(recyclerView, viewType)");
                            c1038845w.putRecycledView(createViewHolder);
                        }
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
