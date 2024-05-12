package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.aa3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94007aa3 {
    public C1C8 LIZ;
    public View.OnTouchListener LIZIZ;
    public boolean LIZJ;
    public final AbstractC94375afz<?, ?> LIZLLL;

    public void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        throw null;
    }

    public void LIZJ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        throw null;
    }

    public void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        throw null;
    }

    public C94007aa3(AbstractC94375afz<?, ?> baseQuickAdapter) {
        o.LJIIIZ(baseQuickAdapter, "baseQuickAdapter");
        this.LIZLLL = baseQuickAdapter;
        this.LIZ = new C1C8(new C94390agE(this));
        this.LIZJ = true;
    }

    public final int LIZ(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        int adapterPosition = viewHolder.getAdapterPosition();
        this.LIZLLL.getClass();
        return adapterPosition;
    }

    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        int LIZ = LIZ(viewHolder);
        if (LIZ >= 0 && LIZ < this.LIZLLL.LJLIL.size()) {
            ListProtector.remove(this.LIZLLL.LJLIL, LIZ);
            this.LIZLLL.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }
}
