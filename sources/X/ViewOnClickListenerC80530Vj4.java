package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* renamed from: X.Vj4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80530Vj4 implements View.OnClickListener {
    public final /* synthetic */ MaterialDatePicker LJLIL;

    public ViewOnClickListenerC80530Vj4(MaterialDatePicker materialDatePicker) {
        this.LJLIL = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.LJLIL;
        materialDatePicker.LJLZ.setEnabled(materialDatePicker.LJLJJLL.LLLLLLL());
        this.LJLIL.LJLLLL.toggle();
        MaterialDatePicker materialDatePicker2 = this.LJLIL;
        materialDatePicker2.Gl(materialDatePicker2.LJLLLL);
        this.LJLIL.Al();
    }
}
