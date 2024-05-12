package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JLS implements JLN {
    public final RecyclerView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;

    @Override // X.JLN
    public boolean LIZ() {
        if (this.LIZLLL) {
            return true;
        }
        AbstractC029409q adapter = this.LIZ.getAdapter();
        if (adapter != null) {
            Integer valueOf = Integer.valueOf(adapter.getItemCount());
            if (valueOf.intValue() > 1) {
                valueOf.intValue();
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView != null && !recyclerView.canScrollHorizontally(this.LIZJ)) {
                    return true;
                }
                RecyclerView recyclerView2 = this.LIZ;
                if (recyclerView2 != null && !recyclerView2.canScrollHorizontally(this.LIZIZ)) {
                    return true;
                }
            }
        }
        return false;
    }

    public JLS(RecyclerView rv) {
        int i;
        o.LJIIIZ(rv, "rv");
        this.LIZ = rv;
        Context context = rv.getContext();
        o.LJIIIIZZ(context, "rv.context");
        if (C26338AVi.LIZJ(context)) {
            i = -1;
        } else {
            i = 1;
        }
        this.LIZIZ = i;
        Context context2 = rv.getContext();
        o.LJIIIIZZ(context2, "rv.context");
        this.LIZJ = C26338AVi.LIZJ(context2) ? 1 : -1;
    }

    @Override // X.JLN
    public final AbstractC49155JQx LIZIZ(Collection<? extends AbstractC49155JQx> observers) {
        boolean z;
        AbstractC49155JQx abstractC49155JQx;
        o.LJIIIZ(observers, "observers");
        AbstractC029409q adapter = this.LIZ.getAdapter();
        if (adapter != null) {
            Integer valueOf = Integer.valueOf(adapter.getItemCount());
            if (valueOf.intValue() > 1 && 1 != 0) {
                int intValue = valueOf.intValue();
                int i = this.LIZLLL ? intValue - 2 : intValue - 1;
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView != null && !recyclerView.canScrollHorizontally(this.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    abstractC49155JQx = null;
                    for (AbstractC49155JQx abstractC49155JQx2 : observers) {
                        if (abstractC49155JQx2.LIZ() == 0) {
                            abstractC49155JQx = abstractC49155JQx2;
                        } else if (LIZJ(abstractC49155JQx2, 32)) {
                            abstractC49155JQx2.LIZJ();
                        }
                    }
                } else {
                    RecyclerView recyclerView2 = this.LIZ;
                    if (recyclerView2 != null && !recyclerView2.canScrollHorizontally(this.LIZIZ) && C49111JPf.LIZ()) {
                        abstractC49155JQx = null;
                        for (AbstractC49155JQx abstractC49155JQx3 : observers) {
                            if (abstractC49155JQx3.LIZ() == i) {
                                abstractC49155JQx = abstractC49155JQx3;
                            } else if (LIZJ(abstractC49155JQx3, 32)) {
                                abstractC49155JQx3.LIZJ();
                            }
                        }
                    } else {
                        abstractC49155JQx = null;
                    }
                }
                RecyclerView recyclerView3 = this.LIZ;
                if (recyclerView3 != null && !recyclerView3.canScrollHorizontally(this.LIZIZ) && !C49111JPf.LIZ()) {
                    for (AbstractC49155JQx abstractC49155JQx4 : observers) {
                        if (abstractC49155JQx4.LIZ() == i) {
                            abstractC49155JQx = abstractC49155JQx4;
                        } else if (LIZJ(abstractC49155JQx4, 32)) {
                            abstractC49155JQx4.LIZJ();
                        }
                    }
                }
                if (abstractC49155JQx == null || !LIZJ(abstractC49155JQx, 16)) {
                    return null;
                }
                return abstractC49155JQx;
            }
        }
        throw new IllegalStateException("Cannot find edges when itemCount is less than 2");
    }

    public static boolean LIZJ(AbstractC49155JQx abstractC49155JQx, int i) {
        if (abstractC49155JQx.LIZ != i) {
            abstractC49155JQx.LIZ = i;
            return true;
        }
        return false;
    }
}
