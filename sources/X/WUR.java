package X;

import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUR extends AbstractC163776bl<FTCEditVolumeViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C62822Ol8 LJLLI;
    public final WUS LJLLILLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        this.LJLJLLL.show((WM7) this.LJLLI.getValue());
        ((WUJ) this.LJLLI.getValue()).LLJILJILJ(true);
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditVolumeViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public WUR(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.fns;
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 22));
        this.LJLLILLLL = WUS.LJLIL;
    }
}
