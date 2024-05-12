package X;

import kotlin.jvm.internal.o;

/* renamed from: X.42X, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C42X extends TBS implements InterfaceC88472Yns<InterfaceC1029942l, C76800UCe> {
    public C42X(AbstractC1038245q abstractC1038245q) {
        super(1, abstractC1038245q, AbstractC1038245q.class, "removeCallback", "removeCallback(Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/callback/IMessageAdapterCallback;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC1029942l p0) {
        o.LJIIIZ(p0, "p0");
        AbstractC1029742j abstractC1029742j = (AbstractC1029742j) this.receiver;
        abstractC1029742j.getClass();
        abstractC1029742j.LJLJJI.remove(p0);
        return C76800UCe.LIZ;
    }
}
