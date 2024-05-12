package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;

/* renamed from: X.JYf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49345JYf {
    public final InterfaceC88471Ynr<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final ExecutorService LIZIZ;
    public final java.util.Set<Integer> LIZJ;
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> LIZLLL;
    public final JYX LJ;
    public final C49343JYd<RecyclerView.ViewHolder> LJFF;

    public C49345JYf(C49346JYg c49346JYg) {
        this.LIZ = c49346JYg.LIZ;
        ExecutorService executorService = c49346JYg.LIZIZ;
        this.LIZIZ = executorService;
        this.LIZJ = c49346JYg.LIZJ;
        InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> interfaceC88474Ynu = c49346JYg.LIZLLL;
        this.LIZLLL = interfaceC88474Ynu;
        this.LJ = c49346JYg.LJ;
        this.LJFF = new C49343JYd<>(new C49348JYi(interfaceC88474Ynu, executorService, "async create"));
    }
}
