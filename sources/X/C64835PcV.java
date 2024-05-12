package X;

import com.bytedance.frameworks.baselib.network.dispatcher.NetThreadPoolManager;

/* renamed from: X.PcV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64835PcV extends AbstractRunnableC64837PcX {
    public final /* synthetic */ AbstractRunnableC64836PcW LJLILLLLZI;
    public final /* synthetic */ NetThreadPoolManager LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.getClass();
            if (((C64834PcU) this.LJLILLLLZI).LJLJJL == EnumC64807Pc3.IMMEDIATE) {
                this.LJLJI.executorImmediateService().execute(this.LJLILLLLZI);
            } else {
                this.LJLJI.executorApiService().execute(this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractRunnableC64837PcX abstractRunnableC64837PcX) {
        AbstractRunnableC64837PcX abstractRunnableC64837PcX2 = abstractRunnableC64837PcX;
        AbstractRunnableC64836PcW abstractRunnableC64836PcW = this.LJLILLLLZI;
        if (abstractRunnableC64836PcW != null) {
            return ((C64834PcU) abstractRunnableC64836PcW).compareTo(abstractRunnableC64837PcX2.LJLIL);
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64835PcV(NetThreadPoolManager netThreadPoolManager, AbstractRunnableC64836PcW abstractRunnableC64836PcW, AbstractRunnableC64836PcW abstractRunnableC64836PcW2) {
        super(abstractRunnableC64836PcW);
        this.LJLJI = netThreadPoolManager;
        this.LJLILLLLZI = abstractRunnableC64836PcW2;
    }
}
