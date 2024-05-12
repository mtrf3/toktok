package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JR2 extends JLM {
    public C49177JRt LJII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JR2(RecyclerView view) {
        super(view);
        o.LJIIIZ(view, "view");
    }

    @Override // X.JLM, X.JLL, X.InterfaceC49154JQw
    public final AbstractC49155JQx LJ(Collection<? extends AbstractC49155JQx> observers) {
        o.LJIIIZ(observers, "observers");
        AbstractC49155JQx LJ = super.LJ(observers);
        if (LJ != null) {
            C49177JRt c49177JRt = this.LJII;
            if (c49177JRt != null) {
                C49177JRt.LIZ(c49177JRt, "scrolltoactive", C51029K0z.LJJIIZI(new OSZ("index", Integer.valueOf(LJ.LIZ()))));
                return LJ;
            }
            return LJ;
        }
        return null;
    }
}
