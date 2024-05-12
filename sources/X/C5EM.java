package X;

import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5EM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EM extends AbstractC48231ut<C51E, C1284652k, C2L2, C17N> implements InterfaceC135635Tz, C51E {
    public final C82622Wbi LJLL;
    public C1284652k LJLLI;

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C1284652k> LJLJJLL() {
        return new AqS152S0100000_2(this, 771);
    }

    @Override // X.C51E
    public TrackPanelViewModel Vo0() {
        return (TrackPanelViewModel) C5G0.LIZ(TTrackPanelViewModel.class);
    }

    @Override // X.C51E
    public C1284452i getMultiTrackController() {
        C1284652k c1284652k = this.LJLLI;
        if (c1284652k != null) {
            return c1284652k.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.C51E
    public C58D jB() {
        C1284652k c1284652k = this.LJLLI;
        if (c1284652k != null) {
            return c1284652k.LJLIL;
        }
        return null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C2L2> LJJLIIIJJI() {
        return C5EO.LJLIL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C17N> LJJLIIIJJIZ() {
        return C5EN.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5EM(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }
}
