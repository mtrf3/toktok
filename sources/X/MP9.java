package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MP9 extends AbstractC030309z {
    public final /* synthetic */ MusNewNotificationFragment LJLIL;

    public MP9(MusNewNotificationFragment musNewNotificationFragment) {
        this.LJLIL = musNewNotificationFragment;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (this.LJLIL.LJLJJI != null) {
            if (LIZJ == r0.getItemCount() - 1) {
                rect.bottom = (int) KL2.LIZJ(this.LJLIL.getContext(), 19.0f);
                return;
            }
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }
}
