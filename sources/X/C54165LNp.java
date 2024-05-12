package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: X.LNp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54165LNp implements LNI {
    public final /* synthetic */ ScrollSwitchStateManager LJLIL;

    public C54165LNp(ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LJLIL = scrollSwitchStateManager;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        InterfaceC208778Hh value = this.LJLIL.LJLLL.getValue();
        if (value != null) {
            this.LJLIL.uv0(value);
        }
    }
}
