package X;

import com.ss.android.ugc.aweme.dsp.arch.DspFeedBaseItemCell;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS14S0101000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztw, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91396Ztw implements InterfaceC212878Xb<DspFeedBaseItemCell, C91395Ztv> {
    public final AbstractC91394Ztu LIZ;
    public final ConcurrentHashMap<String, C212988Xm<DspFeedBaseItemCell, C91395Ztv>> LIZIZ;

    public C91396Ztw(AbstractC91394Ztu adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZ = adapter;
        this.LIZIZ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC212878Xb
    public final void LIZIZ(C8RL item, InterfaceC212998Xn<?, ?> interfaceC212998Xn, int i, List<? extends Object> list) {
        o.LJIIIZ(item, "item");
        String valueOf = String.valueOf(((C91395Ztv) item).LJLILLLLZI);
        C212988Xm<DspFeedBaseItemCell, C91395Ztv> c212988Xm = this.LIZIZ.get(valueOf);
        if (c212988Xm == null) {
            InterfaceC212978Xl<?, ?> child = interfaceC212998Xn.getChild();
            if (!(child instanceof InterfaceC212978Xl)) {
                child = null;
            }
            c212988Xm = new C212988Xm<>(C65352Pkq.LIZ(interfaceC212998Xn.getClass()), child);
            this.LIZIZ.put(valueOf, c212988Xm);
        }
        C212988Xm<?, ?> proxy = interfaceC212998Xn.getProxy();
        if (proxy != null) {
            proxy.LIZIZ();
        }
        c212988Xm.LIZ(i, interfaceC212998Xn, item, list, new IDqS14S0101000_29(c212988Xm, (C212988Xm<? extends C3C8, ? extends Object>) i, 1), new C91582Zww(this, valueOf, i));
    }
}
