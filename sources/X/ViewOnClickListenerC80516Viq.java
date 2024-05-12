package X;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;

/* renamed from: X.Viq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80516Viq implements View.OnClickListener {
    public final /* synthetic */ MaterialTimePicker LJLIL;

    public ViewOnClickListenerC80516Viq(MaterialTimePicker materialTimePicker) {
        this.LJLIL = materialTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        MaterialTimePicker materialTimePicker = this.LJLIL;
        if (materialTimePicker.LJLLLL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        materialTimePicker.LJLLLL = i;
        materialTimePicker.vl(materialTimePicker.LJLLL);
    }
}
