package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88393dT {
    public static final /* synthetic */ int LJII = 0;
    public final RecyclerView LIZ;
    public final List<String> LIZIZ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZJ;
    public List<String> LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;

    static {
        new C6X6();
    }

    public final void LIZ(List<String> list) {
        List<String> LLJILJILJ;
        synchronized (this) {
            if (list == null) {
                LLJILJILJ = null;
            } else {
                LLJILJILJ = ORZ.LLJILJILJ(list);
            }
            this.LIZLLL = LLJILJILJ;
            if (LLJILJILJ != null) {
                o.LJI(LLJILJILJ);
                if (!LLJILJILJ.isEmpty()) {
                    if (this.LIZ.getVisibility() != 0) {
                        this.LIZ.LJLI(0);
                        this.LIZ.setVisibility(0);
                    }
                    if (this.LJ) {
                        List<String> list2 = this.LIZLLL;
                        o.LJI(list2);
                        String string = this.LIZ.getContext().getString(R.string.dpt);
                        o.LJIIIIZZ(string, "recyclerView.context.get…on_email_input_suggested)");
                        list2.add(0, string);
                    }
                    if (this.LIZ.getAdapter() == null) {
                        this.LIZ.setAdapter(new C86773ar(this));
                    } else {
                        AbstractC029409q adapter = this.LIZ.getAdapter();
                        o.LJI(adapter);
                        adapter.notifyDataSetChanged();
                    }
                }
            }
            if (this.LIZ.getVisibility() != 8) {
                this.LIZ.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C88393dT(RecyclerView recyclerView, List<String> list, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LIZ = recyclerView;
        this.LIZIZ = list;
        this.LIZJ = interfaceC88472Yns;
        if (list != null) {
            this.LIZLLL = C61328O5c.LJ(list);
        }
        this.LJFF = -1;
        this.LJI = -1;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        if (this.LIZLLL != null && (!r0.isEmpty())) {
            if (this.LJ) {
                List<String> list2 = this.LIZLLL;
                o.LJI(list2);
                String string = recyclerView.getContext().getString(R.string.dpt);
                o.LJIIIIZZ(string, "recyclerView.context.get…on_email_input_suggested)");
                ListProtector.add(list2, 0, string);
            }
            if (recyclerView.getAdapter() == null) {
                recyclerView.setAdapter(new C86773ar(this));
                return;
            }
            AbstractC029409q adapter = recyclerView.getAdapter();
            o.LJI(adapter);
            adapter.notifyDataSetChanged();
            return;
        }
        recyclerView.setVisibility(8);
    }
}
