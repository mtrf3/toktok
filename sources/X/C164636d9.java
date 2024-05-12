package X;

import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6d9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164636d9 implements C6FI {
    public final WM7 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public C164636d9(WM7 scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = scene;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 853));
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 852));
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 851));
    }

    @Override // X.C6FI
    public final void LIZIZ(boolean z) {
        int i;
        FTCEditCornerViewModel fTCEditCornerViewModel = (FTCEditCornerViewModel) this.LJLJJI.getValue();
        if (z) {
            i = C81184Vtc.LJFF(this.LJLIL.requireActivity());
        } else {
            i = 0;
        }
        fTCEditCornerViewModel.f0(i);
    }

    @Override // X.C6FI
    public final void LIZJ(boolean z) {
        int LJI = AnonymousClass668.LIZIZ().LJI();
        FTCEditCornerViewModel fTCEditCornerViewModel = (FTCEditCornerViewModel) this.LJLJJI.getValue();
        if (!z) {
            LJI = 0;
        }
        fTCEditCornerViewModel.LLZZZIL(LJI);
    }

    @Override // X.C6FI
    public final void LIZLLL(int i, int i2) {
        ((FTCEditToolbarViewModel) this.LJLILLLLZI.getValue()).f0(i);
        ((FTCEditStickerViewModel) this.LJLJI.getValue()).rb0(Integer.valueOf(i));
        ((FTCEditToolbarViewModel) this.LJLILLLLZI.getValue()).LZ(i2);
    }
}
