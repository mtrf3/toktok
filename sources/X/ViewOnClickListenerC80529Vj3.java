package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.Iterator;

/* renamed from: X.Vj3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80529Vj3 implements View.OnClickListener {
    public final /* synthetic */ MaterialDatePicker LJLIL;

    public ViewOnClickListenerC80529Vj3(MaterialDatePicker materialDatePicker) {
        this.LJLIL = materialDatePicker;
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
