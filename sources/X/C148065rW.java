package X;

import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148065rW extends AbstractC163776bl<FTCEditCornerViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final C148075rX LJLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditCornerViewModel> LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C148065rW(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C148085rY.LJLIL);
        this.LJLL = C148075rX.LJLIL;
        parentScene.add(R.id.cof, (WM7) LIZIZ.getValue(), "FTCEditCornerScene");
    }
}
