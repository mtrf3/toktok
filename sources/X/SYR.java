package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SYR {
    public final RecyclerView LIZ;
    public final C73849Syb<C57939MoZ> LIZIZ;
    public final LifecycleOwner LIZJ;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> LIZLLL;
    public C72281SYj LJ;
    public C49485JbV LJFF;
    public C73411SrX LJI;
    public final C62822Ol8 LJII;

    public SYR() {
        throw null;
    }

    public SYR(RecyclerView list, C73849Syb observable, PowerAdapter lifecycleOwner) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap = new ConcurrentHashMap<>();
        o.LJIIIZ(list, "list");
        o.LJIIIZ(observable, "observable");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = list;
        this.LIZIZ = observable;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = concurrentHashMap;
        this.LJII = C221108m2.LIZIZ(C35881E6j.INSTANCE);
    }
}
