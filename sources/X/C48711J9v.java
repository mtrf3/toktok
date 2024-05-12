package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.J9v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48711J9v implements InterfaceC53894LDe {
    public final /* synthetic */ TabletPlaybackSpeedComponent LJLIL;

    public C48711J9v(TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent) {
        this.LJLIL = tabletPlaybackSpeedComponent;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        Aweme aweme;
        o.LJIIIZ(to, "to");
        if (o.LJ(to, "For You") && (aweme = this.LJLIL.getAweme()) != null) {
            this.LJLIL.C3(aweme);
        }
    }
}
