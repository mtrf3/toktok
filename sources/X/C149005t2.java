package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149005t2 extends AbstractC163776bl<FTCEditInfoStickerViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final FrameLayout LJLLI;
    public final AqS152S0100000_2 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LJLJLLL.isAdded((WM7) this.LJLLJ.getValue())) {
            this.LJLJLLL.add(this.LJLL, (WM7) this.LJLLJ.getValue(), "FTCEditInfoStickerScene");
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditInfoStickerViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C149005t2(C82622Wbi diContainer, C146945pi parentScene, FrameLayout frameLayout) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.em3;
        this.LJLLI = frameLayout;
        this.LJLLILLLL = new AqS152S0100000_2(this, 1053);
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1052));
    }
}
