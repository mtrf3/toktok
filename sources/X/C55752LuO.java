package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LuO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55752LuO {
    public final BaseListFragmentPanel LIZ;
    public final String LIZIZ;
    public final WeakReference<Context> LIZJ;
    public boolean LIZLLL;
    public Aweme LJ;
    public XKQ LJFF;

    public final void LIZ(User user) {
        Aweme aweme = this.LJ;
        if (aweme != null) {
            C221018lt.LJFF("@LinkRelation_Video", "insert aweme by reuse cache");
            if (user != null) {
                aweme.setSharer(user);
            }
            new C55751LuN(aweme, this.LIZ).LIZ();
            return;
        }
        this.LJFF = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C78613UtF.LIZJ, null, new C55753LuP(this, user, null), 2);
    }

    public C55752LuO(BaseListFragmentPanel panel, String awemeId) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(awemeId, "awemeId");
        this.LIZ = panel;
        this.LIZIZ = awemeId;
        this.LIZJ = new WeakReference<>(panel.getContext());
        this.LIZLLL = true;
    }
}
