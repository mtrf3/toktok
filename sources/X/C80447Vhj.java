package X;

import android.widget.CompoundButton;

/* renamed from: X.Vhj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80447Vhj implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C80445Vhh LJLIL;

    public C80447Vhj(C80445Vhh c80445Vhh) {
        this.LJLIL = c80445Vhh;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C80445Vhh c80445Vhh = this.LJLIL;
        if (c80445Vhh.LJLLILLLL) {
            return;
        }
        if (c80445Vhh.getCheckedChipIds().isEmpty()) {
            C80445Vhh c80445Vhh2 = this.LJLIL;
            if (c80445Vhh2.LJLJLJ) {
                c80445Vhh2.LIZIZ(compoundButton.getId(), true);
                this.LJLIL.LJLLI = compoundButton.getId();
                return;
            }
        }
        int id = compoundButton.getId();
        if (z) {
            C80445Vhh c80445Vhh3 = this.LJLIL;
            int i = c80445Vhh3.LJLLI;
            if (i != -1 && i != id && c80445Vhh3.LJLJL) {
                c80445Vhh3.LIZIZ(i, false);
            }
            this.LJLIL.setCheckedId(id);
            return;
        }
        C80445Vhh c80445Vhh4 = this.LJLIL;
        if (c80445Vhh4.LJLLI != id) {
            return;
        }
        c80445Vhh4.setCheckedId(-1);
    }
}
