package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.VjO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80550VjO implements View.OnClickListener {
    public final /* synthetic */ C80540VjE LJLIL;
    public final /* synthetic */ MaterialCalendar LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int LLILLJJLI = ((LinearLayoutManager) this.LJLILLLLZI.LJLJLLL.getLayoutManager()).LLILLJJLI() - 1;
        if (LLILLJJLI >= 0) {
            this.LJLILLLLZI.wl(this.LJLIL.LJLILLLLZI.start.LJIIL(LLILLJJLI));
        }
    }

    public ViewOnClickListenerC80550VjO(MaterialCalendar materialCalendar, C80540VjE c80540VjE) {
        this.LJLILLLLZI = materialCalendar;
        this.LJLIL = c80540VjE;
    }
}
