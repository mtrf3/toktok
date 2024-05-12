package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class MGW {
    public static void LIZ(RecyclerView recyclerView, InterfaceC56526MGk interfaceC56526MGk, int i, boolean z) {
        if (!z) {
            recyclerView.LJIIJJI(new C73379Sr1(EF7.LIZIZ()));
        }
        C56525MGj c56525MGj = new C56525MGj(recyclerView, interfaceC56526MGk);
        c56525MGj.LJI = i;
        recyclerView.setOnFlingListener(c56525MGj);
    }
}
