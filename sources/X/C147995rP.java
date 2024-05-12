package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147995rP extends AbstractC163776bl<FTCEditTextStickerViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final InterfaceC1546365b LJLLI;
    public final int LJLLILLLL;
    public final C148015rR LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        this.LJLJLLL.add(this.LJLL, (WM7) this.LJLLL.getValue(), "FTCEditTextStickerScene");
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditTextStickerViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C147995rP(C82622Wbi diContainer, C146945pi parentScene, C147955rL c147955rL, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.l5i;
        this.LJLLI = c147955rL;
        this.LJLLILLLL = i;
        this.LJLLJ = C148015rR.LJLIL;
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1082));
    }
}
