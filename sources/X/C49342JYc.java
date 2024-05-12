package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.JYc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49342JYc<T> {
    public final RecyclerView LIZ;
    public final ExecutorService LIZIZ;
    public final InterfaceC88471Ynr<RecyclerView.ViewHolder, Integer, C76800UCe> LIZJ;
    public final InterfaceC49350JYk<T> LIZLLL;
    public final java.util.Set<Integer> LJ;
    public final InterfaceC88471Ynr<Integer, Integer, Boolean> LJFF;
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> LJI;
    public final InterfaceC49349JYj LJII;
    public final JYX LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C49342JYc(RecyclerView recyclerView, ExecutorService executorService, InterfaceC88471Ynr<? super RecyclerView.ViewHolder, ? super Integer, C76800UCe> bindViewHolder, InterfaceC49350JYk<T> dataProvider, java.util.Set<Integer> set, InterfaceC88471Ynr<? super Integer, ? super Integer, Boolean> allowAsyncBind, InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> skipAsyncBind, InterfaceC49349JYj preloadStrategy, JYX jyx) {
        o.LJIIIZ(bindViewHolder, "bindViewHolder");
        o.LJIIIZ(dataProvider, "dataProvider");
        o.LJIIIZ(allowAsyncBind, "allowAsyncBind");
        o.LJIIIZ(skipAsyncBind, "skipAsyncBind");
        o.LJIIIZ(preloadStrategy, "preloadStrategy");
        this.LIZ = recyclerView;
        this.LIZIZ = executorService;
        this.LIZJ = bindViewHolder;
        this.LIZLLL = dataProvider;
        this.LJ = set;
        this.LJFF = allowAsyncBind;
        this.LJI = skipAsyncBind;
        this.LJII = preloadStrategy;
        this.LJIIIIZZ = jyx;
    }
}
