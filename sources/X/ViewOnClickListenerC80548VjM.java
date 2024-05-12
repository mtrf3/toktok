package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.VjM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80548VjM implements View.OnClickListener {
    public final /* synthetic */ C80540VjE LJLIL;
    public final /* synthetic */ MaterialCalendar LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int LLILL = ((LinearLayoutManager) this.LJLILLLLZI.LJLJLLL.getLayoutManager()).LLILL() + 1;
        if (LLILL < this.LJLILLLLZI.LJLJLLL.getAdapter().getItemCount()) {
            this.LJLILLLLZI.wl(this.LJLIL.LJLILLLLZI.start.LJIIL(LLILL));
        }
    }

    public ViewOnClickListenerC80548VjM(MaterialCalendar materialCalendar, C80540VjE c80540VjE) {
        this.LJLILLLLZI = materialCalendar;
        this.LJLIL = c80540VjE;
    }
}
