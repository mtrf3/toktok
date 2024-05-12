package X;

import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.placediscovery2.ui.assem.DiscoveryMapAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M37 implements InterfaceC56168M2q {
    public final /* synthetic */ DiscoveryMapAssem LIZ;

    @Override // X.InterfaceC56168M2q
    public final void LIZ() {
        TuxIconView tuxIconView = this.LIZ.LJLJLJ;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setVisibility(4);
    }

    @Override // X.InterfaceC56168M2q
    public final void LIZIZ() {
        SY4 sy4 = this.LIZ.LJLJJLL;
        if (sy4 != null) {
            sy4.setLoading(true);
        }
        C208248Fg c208248Fg = this.LIZ.LJLJJL;
        if (c208248Fg == null) {
            return;
        }
        c208248Fg.setVisibility(8);
    }

    @Override // X.InterfaceC56168M2q
    public final Context LIZJ() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC56168M2q
    public final void LIZLLL() {
        SY4 sy4 = this.LIZ.LJLJJLL;
        if (sy4 != null) {
            sy4.setVisibility(0);
        }
        C208248Fg c208248Fg = this.LIZ.LJLJJL;
        if (c208248Fg == null) {
            return;
        }
        c208248Fg.setVisibility(8);
    }

    @Override // X.InterfaceC56168M2q
    public final void LJFF() {
        SY4 sy4 = this.LIZ.LJLJJLL;
        if (sy4 == null) {
            return;
        }
        sy4.setLoading(false);
    }

    @Override // X.InterfaceC56168M2q
    public final void LJII() {
        SY4 sy4 = this.LIZ.LJLJJLL;
        if (sy4 != null) {
            sy4.setVisibility(8);
        }
        C208248Fg c208248Fg = this.LIZ.LJLJJL;
        if (c208248Fg == null) {
            return;
        }
        c208248Fg.setVisibility(0);
    }

    public M37(DiscoveryMapAssem discoveryMapAssem) {
        this.LIZ = discoveryMapAssem;
    }

    @Override // X.InterfaceC56168M2q
    public final void LJ(boolean z) {
        TuxIconView tuxIconView = this.LIZ.LJLJLJ;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setClickable(z);
    }

    @Override // X.InterfaceC56168M2q
    public final void LJI(EnumC56169M2r state) {
        TuxIconView tuxIconView;
        o.LJIIIZ(state, "state");
        int i = C56170M2s.LIZ[state.ordinal()];
        if (i != 1) {
            if (i == 2 && (tuxIconView = this.LIZ.LJLJLJ) != null) {
                tuxIconView.setIconRes(R.raw.icon_location_north_east);
            }
        } else {
            TuxIconView tuxIconView2 = this.LIZ.LJLJLJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_location_north_east_fill);
            }
        }
        TuxIconView tuxIconView3 = this.LIZ.LJLJLJ;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setTag(state);
    }
}
