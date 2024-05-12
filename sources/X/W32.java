package X;

import com.ss.android.ugc.aweme.image.progressbar.ImageProgressViewModel;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W32 extends AbstractC163776bl<ImageProgressViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C152175y9 LJLLI;
    public final int LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LJLJLLL.isAdded((WM7) this.LJLLLL.getValue())) {
            this.LJLJLLL.add(this.LJLL, (WM7) this.LJLLLL.getValue(), "ImageProgressScene");
        }
        this.LJLJLLL.show((WM7) this.LJLLLL.getValue());
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        this.LJLJLLL.add(this.LJLL, (WM7) this.LJLLLL.getValue(), "ImageProgressScene");
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<ImageProgressViewModel> LJJLIIIJILLIZJL() {
        return W31.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public W32(C82622Wbi diContainer, WMH parentScene, int i, C152175y9 c152175y9, int i2, boolean z, boolean z2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = i;
        this.LJLLI = c152175y9;
        this.LJLLILLLL = i2;
        this.LJLLJ = z;
        this.LJLLL = z2;
        this.LJLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 526));
    }

    public /* synthetic */ W32(C82622Wbi c82622Wbi, WMH wmh, int i, C152175y9 c152175y9, int i2, boolean z, boolean z2, int i3) {
        this(c82622Wbi, wmh, i, c152175y9, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2);
    }
}
