package X;

import Y.ALAdapterS0S0200000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117374j7 extends C40171ht {
    public final List<RecyclerView.ViewHolder> LJIJI = new ArrayList();
    public final List<RecyclerView.ViewHolder> LJIJJ = new ArrayList();

    @Override // X.C40171ht, X.AbstractC030109x
    public final void LJIIJ() {
        int size = ((ArrayList) this.LJIJI).size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LJIJI, size);
                View view = viewHolder.itemView;
                o.LJIIIIZZ(view, "holder.itemView");
                LJJIIJZLJL(view);
                LJIL(viewHolder);
                ListProtector.remove(this.LJIJI, size);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        int size2 = ((ArrayList) this.LJIJJ).size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(this.LJIJJ, size2);
                View view2 = viewHolder2.itemView;
                o.LJIIIIZZ(view2, "holder.itemView");
                LJJIIJZLJL(view2);
                LJIL(viewHolder2);
                ListProtector.remove(this.LJIJJ, size2);
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        super.LJIIJ();
    }

    @Override // X.C40171ht, X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if (!((ArrayList) this.LJIJI).isEmpty() || !((ArrayList) this.LJIJJ).isEmpty() || super.LJIILJJIL()) {
            return true;
        }
        return false;
    }

    public C117374j7() {
        this.LIZJ = 300L;
        this.LIZLLL = 300L;
        this.LJ = 300L;
    }

    @Override // X.C40171ht, X.AbstractC030109x
    public final void LJIIZILJ() {
        int size;
        int size2;
        super.LJIIZILJ();
        if (!((ArrayList) this.LJIJI).isEmpty() && ((ArrayList) this.LJIJI).size() - 1 >= 0) {
            while (true) {
                int i = size2 - 1;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LJIJI, size2);
                viewHolder.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.LIZJ).setListener(new ALAdapterS0S0200000_1(this, viewHolder, 2)).setInterpolator(new C30911Jf());
                ListProtector.remove(this.LJIJI, size2);
                if (i < 0) {
                    break;
                } else {
                    size2 = i;
                }
            }
        }
        if (((ArrayList) this.LJIJJ).isEmpty() || ((ArrayList) this.LJIJJ).size() - 1 < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(this.LJIJJ, size);
            viewHolder2.itemView.animate().alpha(0.0f).translationX(-viewHolder2.itemView.getWidth()).setDuration(this.LIZLLL).setListener(new ALAdapterS0S0200000_1(this, viewHolder2, 3)).setInterpolator(new C30911Jf());
            ListProtector.remove(this.LJIJJ, size);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    public static void LJJIIJZLJL(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // X.C40171ht, X.AbstractC030109x
    public final void LJIIIZ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        holder.itemView.animate().cancel();
        if (((ArrayList) this.LJIJI).remove(holder)) {
            LJIL(holder);
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            LJJIIJZLJL(view);
        }
        if (((ArrayList) this.LJIJJ).remove(holder)) {
            LJII(holder);
            View view2 = holder.itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            LJJIIJZLJL(view2);
        }
        super.LJIIIZ(holder);
    }

    @Override // X.C40171ht, X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.LJIJ(holder);
    }

    @Override // X.C40171ht, X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof AbstractC73265SpB) {
            holder.itemView.setAlpha(1.0f);
            holder.itemView.setTranslationX(0.0f);
            ((ArrayList) this.LJIJJ).add(holder);
            return;
        }
        super.LJIJJLI(holder);
    }
}
