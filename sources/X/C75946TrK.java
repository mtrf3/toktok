package X;

import Y.IDCListenerS209S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TrK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75946TrK implements C15M {
    public final /* synthetic */ C34K LIZ;

    public C75946TrK(C34K c34k) {
        this.LIZ = c34k;
    }

    @Override // X.C15M
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dld, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) LLLLIILL.findViewById(R.id.gui);
        compoundButton.setText(C15380j0.LJIILJJIL(R.string.n9p));
        compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this.LIZ, 2));
        return LLLLIILL;
    }
}
