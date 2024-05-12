package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsInviteCell;
import java.util.List;

/* renamed from: X.Mql, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58075Mql extends SIT {
    public List<? extends InterfaceC57784Mm4> LJLJJLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(RecFriendsAuthCell.class, RecFriendsInviteCell.class);
        List<? extends InterfaceC57784Mm4> list = this.LJLJJLL;
        if (list != null) {
            this.LJLJJL.LJIILLIIL(list);
            this.LJLJJLL = null;
        }
    }
}
