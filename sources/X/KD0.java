package X;

import Y.ARunnableS12S0101000_8;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes9.dex */
public abstract class KD0 {
    public final Queue<RecyclerView.ViewHolder> LIZ = new LinkedList();
    public int LIZIZ;

    public abstract RecyclerView.ViewHolder LIZIZ();

    public final void LIZ() {
        ((LinkedList) this.LIZ).clear();
    }

    public final RecyclerView.ViewHolder LIZJ() {
        if (!this.LIZ.isEmpty()) {
            return (RecyclerView.ViewHolder) ((LinkedList) this.LIZ).poll();
        }
        return null;
    }

    public final void LIZLLL(int i) {
        if (this.LIZIZ >= i) {
            return;
        }
        C38995FSd.LIZJ().execute(new ARunnableS12S0101000_8(i, this, 30));
    }
}
