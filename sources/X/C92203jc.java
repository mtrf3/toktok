package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C92203jc extends TBS implements InterfaceC88472Yns<C109544Rq, AbstractC1041546x> {
    public C92203jc(AbstractC1038245q abstractC1038245q) {
        super(1, abstractC1038245q, AbstractC1038245q.class, "getCurrentViewHolder", "getCurrentViewHolder(Lcom/bytedance/im/core/model/Message;)Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/viewholder/BaseViewHolder;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final AbstractC1041546x invoke(C109544Rq c109544Rq) {
        C109544Rq p0 = c109544Rq;
        o.LJIIIZ(p0, "p0");
        for (AbstractC1041546x abstractC1041546x : ((AbstractC1029742j) this.receiver).LJLJI) {
            C109544Rq c109544Rq2 = abstractC1041546x.LJZI;
            if (c109544Rq2 != null && c109544Rq2.getMsgId() == p0.getMsgId()) {
                return abstractC1041546x;
            }
        }
        return null;
    }
}
