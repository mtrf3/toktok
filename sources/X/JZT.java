package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes9.dex */
public abstract class JZT {
    public final Queue<RecyclerView.ViewHolder> LIZ = new ConcurrentLinkedQueue();
    public int LIZIZ = 0;

    public abstract RecyclerView.ViewHolder LIZ();
}
