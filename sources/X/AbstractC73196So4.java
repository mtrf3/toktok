package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.So4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73196So4 implements InterfaceC73200So8 {
    public boolean LIZ;
    public View LIZIZ;
    public RecyclerView.ViewHolder LIZJ;

    public final void LJFF() {
        RecyclerView.ViewHolder viewHolder = this.LIZJ;
        if (viewHolder != null) {
            viewHolder.setIsRecyclable(false);
        }
        LJ(null);
        this.LIZ = false;
        LIZJ(LIZ() + 1);
    }

    public int LIZLLL() {
        return isEnable() ? 1 : 0;
    }

    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        View view;
        this.LIZJ = viewHolder;
        if (viewHolder != null) {
            view = viewHolder.itemView;
        } else {
            view = null;
        }
        this.LIZIZ = view;
    }
}
