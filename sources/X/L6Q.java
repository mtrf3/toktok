package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6Q implements InterfaceC100393wp {
    @Override // X.InterfaceC100393wp
    public final boolean LJI(User user) {
        return false;
    }

    @Override // X.InterfaceC100393wp
    public final void reset() {
    }

    public L6Q(C212068Ty c212068Ty) {
        View view;
        Object obj = c212068Ty.LIZIZ;
        if (!(obj instanceof C53691L5j) || (view = (View) obj) == null) {
            return;
        }
        view.setClickable(false);
    }

    @Override // X.InterfaceC100393wp
    public final boolean LIZLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return false;
    }

    @Override // X.InterfaceC100393wp
    public final void LJFF(EnumC53695L5n mode) {
        o.LJIIIZ(mode, "mode");
    }
}
