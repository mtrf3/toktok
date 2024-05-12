package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLL implements InterfaceC71924SKq {
    public final /* synthetic */ C71925SKr LIZ;

    public SLL(C71925SKr c71925SKr) {
        this.LIZ = c71925SKr;
    }

    @Override // X.InterfaceC71924SKq
    public final void LIZIZ(int i) {
        this.LIZ.notifyItemRemoved(i);
        C71925SKr c71925SKr = this.LIZ;
        c71925SKr.notifyItemRangeChanged(i, c71925SKr.getItemCount() - i);
    }

    @Override // X.InterfaceC71924SKq
    public final void LIZJ(String str) {
        this.LIZ.notifyItemInserted(0);
        C71925SKr c71925SKr = this.LIZ;
        c71925SKr.notifyItemRangeChanged(1, c71925SKr.getItemCount());
    }

    @Override // X.InterfaceC71924SKq
    public final void LIZ(List<String> old, List<String> list) {
        o.LJIIIZ(old, "old");
        C03200Aq.LIZ(new SLO(old, list), true).LIZJ(this.LIZ);
    }
}
