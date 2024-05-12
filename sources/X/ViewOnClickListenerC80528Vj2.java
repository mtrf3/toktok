package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.Iterator;

/* renamed from: X.Vj2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80528Vj2 implements View.OnClickListener {
    public final /* synthetic */ MaterialDatePicker LJLIL;

    public ViewOnClickListenerC80528Vj2(MaterialDatePicker materialDatePicker) {
        this.LJLIL = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator it = this.LJLIL.LJLIL.iterator();
        while (it.hasNext()) {
            InterfaceC80533Vj7 interfaceC80533Vj7 = (InterfaceC80533Vj7) it.next();
            this.LJLIL.LJLJJLL.LLLLLLZZ();
            interfaceC80533Vj7.LIZ();
        }
        this.LJLIL.dismiss();
    }
}
