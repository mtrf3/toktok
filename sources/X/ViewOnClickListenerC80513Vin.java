package X;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.Iterator;

/* renamed from: X.Vin, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80513Vin implements View.OnClickListener {
    public final /* synthetic */ MaterialTimePicker LJLIL;

    public ViewOnClickListenerC80513Vin(MaterialTimePicker materialTimePicker) {
        this.LJLIL = materialTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator<View.OnClickListener> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        this.LJLIL.dismiss();
    }
}
