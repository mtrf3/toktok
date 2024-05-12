package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYI<T> {
    public final InterfaceC49350JYk<T> LIZ;
    public final java.util.Set<Integer> LIZIZ;
    public final InterfaceC88471Ynr<Integer, Integer, Boolean> LIZJ;
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> LIZLLL;
    public final InterfaceC49349JYj LJ;
    public final JYX LJFF;

    public JYI(RecyclerView recyclerView, InterfaceC49350JYk dataProvider, java.util.Set set, InterfaceC88471Ynr interfaceC88471Ynr, C49263JVb skipAsyncBind, C87776Yce c87776Yce) {
        JYJ jyj = new JYJ(recyclerView);
        o.LJIIIZ(dataProvider, "dataProvider");
        o.LJIIIZ(skipAsyncBind, "skipAsyncBind");
        this.LIZ = dataProvider;
        this.LIZIZ = set;
        this.LIZJ = interfaceC88471Ynr;
        this.LIZLLL = skipAsyncBind;
        this.LJ = jyj;
        this.LJFF = c87776Yce;
    }
}
