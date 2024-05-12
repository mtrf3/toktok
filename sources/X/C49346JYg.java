package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.JYg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49346JYg {
    public final InterfaceC88471Ynr<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final ExecutorService LIZIZ;
    public final java.util.Set<Integer> LIZJ;
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> LIZLLL;
    public final JYX LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C49346JYg(RecyclerView recyclerView, InterfaceC88471Ynr<? super ViewGroup, ? super Integer, ? extends RecyclerView.ViewHolder> createViewHolder, ExecutorService executorService, java.util.Set<Integer> set, InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> skipCreateVHAsync, JYX jyx) {
        o.LJIIIZ(createViewHolder, "createViewHolder");
        o.LJIIIZ(skipCreateVHAsync, "skipCreateVHAsync");
        this.LIZ = createViewHolder;
        this.LIZIZ = executorService;
        this.LIZJ = set;
        this.LIZLLL = skipCreateVHAsync;
        this.LJ = jyx;
    }
}
