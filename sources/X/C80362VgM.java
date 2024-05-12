package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.VgM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80362VgM implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ C80342Vg2 LIZ;

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        C80342Vg2 c80342Vg2 = this.LIZ;
        c80342Vg2.LJIIIIZZ = true;
        c80342Vg2.LJIIJ = System.currentTimeMillis();
        this.LIZ.LJ(false);
    }

    public C80362VgM(C80342Vg2 c80342Vg2) {
        this.LIZ = c80342Vg2;
    }
}
