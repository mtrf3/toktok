package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.VjL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80547VjL extends C0A6 {
    public final /* synthetic */ C80540VjE LJLIL;
    public final /* synthetic */ C80400Vgy LJLILLLLZI;
    public final /* synthetic */ MaterialCalendar LJLJI;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.LJLILLLLZI.getText());
        }
    }

    public C80547VjL(MaterialCalendar materialCalendar, C80540VjE c80540VjE, C80400Vgy c80400Vgy) {
        this.LJLJI = materialCalendar;
        this.LJLIL = c80540VjE;
        this.LJLILLLLZI = c80400Vgy;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int LLILLJJLI;
        if (i < 0) {
            LLILLJJLI = ((LinearLayoutManager) this.LJLJI.LJLJLLL.getLayoutManager()).LLILL();
        } else {
            LLILLJJLI = ((LinearLayoutManager) this.LJLJI.LJLJLLL.getLayoutManager()).LLILLJJLI();
        }
        this.LJLJI.LJLJJL = this.LJLIL.LJLILLLLZI.start.LJIIL(LLILLJJLI);
        C80400Vgy c80400Vgy = this.LJLILLLLZI;
        C80540VjE c80540VjE = this.LJLIL;
        c80400Vgy.setText(c80540VjE.LJLILLLLZI.start.LJIIL(LLILLJJLI).LJIIJ(c80540VjE.LJLIL));
    }
}
