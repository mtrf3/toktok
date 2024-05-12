package X;

import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* renamed from: X.LTl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54317LTl implements InterfaceC54208LPg {
    public final /* synthetic */ DetailFragment LIZ;

    @Override // X.InterfaceC54208LPg
    public final void LIZ() {
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZ.LJLJI;
        IOV event = IOV.INSTANCE;
        scrollSwitchStateManager.getClass();
        o.LJIIIZ(event, "event");
        scrollSwitchStateManager.LJLLI.setValue(event);
    }

    public C54317LTl(DetailFragment detailFragment) {
        this.LIZ = detailFragment;
    }
}
