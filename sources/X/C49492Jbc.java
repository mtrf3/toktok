package X;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jbc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49492Jbc extends JZT {
    public final /* synthetic */ C49491Jbb LIZJ;

    @Override // X.JZT
    public final RecyclerView.ViewHolder LIZ() {
        InterfaceC49498Jbi interfaceC49498Jbi;
        C49491Jbb c49491Jbb = this.LIZJ;
        ViewGroup viewGroup = c49491Jbb.LIZ;
        if (viewGroup != null && (interfaceC49498Jbi = c49491Jbb.LIZIZ) != null) {
            return interfaceC49498Jbi.LJJLIIIJJI(viewGroup);
        }
        return null;
    }

    public C49492Jbc(C68322mC<Handler> c68322mC, C49491Jbb c49491Jbb) {
        this.LIZJ = c49491Jbb;
    }
}
