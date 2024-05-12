package X;

import android.widget.CompoundButton;

/* loaded from: classes5.dex */
public final class AB7 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AB8 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public AB7(AB8 ab8, int i) {
        this.LJLIL = ab8;
        this.LJLILLLLZI = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AB6 ab6 = this.LJLIL.LJLILLLLZI;
        if (ab6 != null) {
            ab6.LJJIFFI(this.LJLILLLLZI);
        }
    }
}
