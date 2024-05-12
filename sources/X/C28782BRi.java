package X;

import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BRi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28782BRi implements C15M {
    public final /* synthetic */ C34K LIZ;

    public C28782BRi(C34K c34k) {
        this.LIZ = c34k;
    }

    @Override // X.C15M
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dld, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) LLLLIILL.findViewById(R.id.gui);
        compoundButton.setChecked(true);
        this.LIZ.element = compoundButton.isChecked();
        compoundButton.setText(C15380j0.LJIILJJIL(R.string.lui));
        compoundButton.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this.LIZ, 18));
        return LLLLIILL;
    }
}
