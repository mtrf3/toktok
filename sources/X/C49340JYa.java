package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.JYa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49340JYa extends AbstractC65781Prl implements InterfaceC65784Pro<RecyclerView.ViewHolder> {
    public final /* synthetic */ C49341JYb<T> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C49344JYe<T> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49340JYa(C49341JYb<T> c49341JYb, int i, int i2, C49344JYe<T> c49344JYe) {
        super(0);
        this.LJLIL = c49341JYb;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c49344JYe;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final RecyclerView.ViewHolder invoke() {
        RecyclerView.LayoutParams layoutParams;
        AbstractC029409q adapter;
        RecyclerView.ViewHolder recycledView = this.LJLIL.LIZ.getRecycledViewPool().getRecycledView(this.LJLILLLLZI);
        if (recycledView == null && ((adapter = this.LJLIL.LIZ.getAdapter()) == null || (recycledView = adapter.createViewHolder(this.LJLIL.LIZ, this.LJLILLLLZI)) == null)) {
            return null;
        }
        if (C16880lQ.LLLLIIIILLL().isInterrupted()) {
            this.LJLIL.LIZ.getRecycledViewPool().putRecycledView(recycledView);
            return null;
        }
        if (!(recycledView.itemView.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
            View view = recycledView.itemView;
            C0A2 layoutManager = this.LJLIL.LIZ.getLayoutManager();
            if (layoutManager != null) {
                layoutParams = layoutManager.LJJIJL();
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
        C49341JYb<T> c49341JYb = this.LJLIL;
        if (c49341JYb.LJII == null) {
            ViewGroup.LayoutParams layoutParams2 = recycledView.itemView.getLayoutParams();
            o.LJIIIIZZ(layoutParams2, "holder.itemView.layoutParams");
            c49341JYb.LJII = EWW.LIZ(layoutParams2, "mViewHolder");
        }
        Field field = this.LJLIL.LJII;
        if (field != null) {
            field.set(recycledView.itemView.getLayoutParams(), recycledView);
        }
        C49341JYb<T> c49341JYb2 = this.LJLIL;
        if (c49341JYb2.LJIIIIZZ == null) {
            c49341JYb2.LJIIIIZZ = EWW.LIZ(recycledView, "mPosition");
        }
        Field field2 = this.LJLIL.LJIIIIZZ;
        if (field2 != null) {
            field2.set(recycledView, Integer.valueOf(this.LJLJI));
        }
        JYW.LIZ.add(Integer.valueOf(recycledView.itemView.hashCode()));
        this.LJLIL.LIZJ.invoke(recycledView, Integer.valueOf(this.LJLJI));
        this.LJLJJI.LIZJ = recycledView;
        if (C16880lQ.LLLLIIIILLL().isInterrupted()) {
            this.LJLIL.LIZ.getRecycledViewPool().putRecycledView(recycledView);
            return null;
        }
        return recycledView;
    }
}
