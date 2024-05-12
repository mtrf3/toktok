package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.34n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C780534n extends AbstractC65781Prl implements InterfaceC65784Pro<IPlaybackControlService> {
    public static final C780534n LJLIL = new C780534n();

    public C780534n() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPlaybackControlService invoke() {
        if (C4HD.LIZ()) {
            return new IPlaybackControlService() { // from class: X.34r
                @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
                public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> getCastingAssemClass() {
                    if (F6I.LIZ()) {
                        return C65352Pkq.LIZ(InteractInfoTVCastAssem.class);
                    }
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
                public final void addPlayBackControls(ViewGroup viewGroup) {
                    C781134t.LIZ(viewGroup, null);
                }

                @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
                public final void removePlayBackControls(ViewGroup viewGroup) {
                    C781134t.LIZIZ(viewGroup);
                }

                @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
                public final void updatePlaybackControlsForMainTabs(Fragment fragment, boolean z) {
                    if (fragment == null || !(fragment.getView() instanceof ViewGroup)) {
                        return;
                    }
                    if (z) {
                        View view = fragment.getView();
                        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                        C781134t.LIZIZ((ViewGroup) view);
                    } else {
                        View view2 = fragment.getView();
                        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                        C781134t.LIZ((ViewGroup) view2, fragment.mo49getActivity());
                    }
                }
            };
        }
        return new IPlaybackControlService() { // from class: X.34o
            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void addPlayBackControls(ViewGroup viewGroup) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> getCastingAssemClass() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void removePlayBackControls(ViewGroup viewGroup) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void updatePlaybackControlsForMainTabs(Fragment fragment, boolean z) {
            }
        };
    }
}
