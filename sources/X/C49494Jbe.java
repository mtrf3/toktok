package X;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jbe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49494Jbe extends JZT {
    public final /* synthetic */ C49491Jbb LIZJ;

    @Override // X.JZT
    public final RecyclerView.ViewHolder LIZ() {
        InterfaceC49498Jbi interfaceC49498Jbi;
        C49491Jbb c49491Jbb = this.LIZJ;
        ViewGroup viewGroup = c49491Jbb.LIZ;
        if (viewGroup == null || (interfaceC49498Jbi = c49491Jbb.LIZIZ) == null) {
            return null;
        }
        return interfaceC49498Jbi.LJJLIIIJLLLLLLLZ(viewGroup, true);
    }

    public C49494Jbe(C68322mC<Handler> c68322mC, C49491Jbb c49491Jbb) {
        this.LIZJ = c49491Jbb;
    }
}
