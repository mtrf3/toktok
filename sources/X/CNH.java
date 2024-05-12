package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class CNH extends C30891CAl {
    public final /* synthetic */ CNL LIZ;

    public CNH(CNL cnl) {
        this.LIZ = cnl;
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.LIZ.Li("H5_popup_container_height_state_changed", C51029K0z.LJJIIZI(new OSZ("state", "closed")));
                return;
            }
            this.LIZ.Li("H5_popup_container_height_state_changed", C51029K0z.LJJIIZI(new OSZ("state", "normal")));
            return;
        }
        this.LIZ.Li("H5_popup_container_height_state_changed", C51029K0z.LJJIIZI(new OSZ("state", "expanded")));
    }
}
