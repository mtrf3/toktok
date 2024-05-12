package X;

import X.KR8;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.LTn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54319LTn implements InterfaceC54281LSb {
    public final /* synthetic */ DetailFragment LIZ;

    @Override // X.InterfaceC54281LSb
    public final void LIZ() {
    }

    public C54319LTn(DetailFragment detailFragment) {
        this.LIZ = detailFragment;
    }

    @Override // X.InterfaceC54281LSb
    public final void LIZIZ(HashMap<Integer, CommonPageFragment> fragments) {
        C54297LSr c54297LSr = this.LIZ.LJLJJLL;
        if (c54297LSr != null && Objects.equals(c54297LSr.LJJIIJ(0), "page_feed")) {
            final C54320LTo c54320LTo = this.LIZ.LJLJJI;
            final CommonPageFragment commonPageFragment = fragments.get(0);
            c54320LTo.getClass();
            if (commonPageFragment != null) {
                commonPageFragment.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.panel.DetailNodeVisibility$initNodeVisibility$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_CREATE) {
                            onCreate();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                    public final void onCreate() {
                        KR8.LJII(3, Fragment.this);
                        c54320LTo.LIZ = "page_feed";
                    }
                });
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZ.LJLJI;
        if (scrollSwitchStateManager != null) {
            o.LJIIIZ(fragments, "fragments");
            scrollSwitchStateManager.LJLJI.setValue(fragments);
        }
    }

    @Override // X.InterfaceC54281LSb
    public final void LIZJ(List<C54296LSq> mainPages) {
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZ.LJLJI;
        if (scrollSwitchStateManager != null) {
            o.LJIIIZ(mainPages, "mainPages");
            scrollSwitchStateManager.LJLILLLLZI.setValue(mainPages);
        }
    }
}
