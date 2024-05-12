package X;

import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.IGz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46349IGz implements InterfaceC252619vl {
    public final /* synthetic */ TabletPlaybackSpeedComponent LJLIL;

    public C46349IGz(TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent) {
        this.LJLIL = tabletPlaybackSpeedComponent;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i == 4 && user2 != null && user != null && !o.LJ(user2.getUid(), user.getUid())) {
            this.LJLIL.getContainerView().postDelayed(new ARunnableS44S0100000_8(this.LJLIL, 146), 150L);
        }
    }
}
