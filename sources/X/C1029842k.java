package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.42k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1029842k extends TBS implements InterfaceC88472Yns<Integer, Boolean> {
    public C1029842k(Object obj) {
        super(1, obj, AbstractC1038245q.class, "isScrollToBottom", "isScrollToBottom(I)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Integer num) {
        RecyclerView recyclerView;
        C0A2 layoutManager;
        LinearLayoutManager linearLayoutManager;
        boolean z;
        int intValue = num.intValue();
        AbstractC1038245q abstractC1038245q = (AbstractC1038245q) this.receiver;
        if (abstractC1038245q.LJZL.LIZIZ() || (recyclerView = abstractC1038245q.LJLIL) == null || (layoutManager = recyclerView.getLayoutManager()) == null || !(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.LLILL() > intValue) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
