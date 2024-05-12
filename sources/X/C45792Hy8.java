package X;

import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.Hy8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45792Hy8 extends r2 {
    public final /* synthetic */ InterfaceC45790Hy6 LJLIL;

    public C45792Hy8(InterfaceC45790Hy6 interfaceC45790Hy6) {
        this.LJLIL = interfaceC45790Hy6;
    }

    @Override // com.google.android.play.core.assetpacks.r2, X.InterfaceC45785Hy1
    public final void LIZ(AVMusic aVMusic, boolean z) {
        if (z) {
            InterfaceC45790Hy6 interfaceC45790Hy6 = this.LJLIL;
            if (interfaceC45790Hy6 != null) {
                interfaceC45790Hy6.LIZLLL(aVMusic);
                return;
            }
            return;
        }
        InterfaceC45790Hy6 interfaceC45790Hy62 = this.LJLIL;
        if (interfaceC45790Hy62 == null) {
            return;
        }
        interfaceC45790Hy62.LJII(aVMusic);
    }

    @Override // com.google.android.play.core.assetpacks.r2, X.InterfaceC45785Hy1
    public final void LIZIZ(AVMusic aVMusic, boolean z) {
        if (z) {
            InterfaceC45790Hy6 interfaceC45790Hy6 = this.LJLIL;
            if (interfaceC45790Hy6 != null) {
                interfaceC45790Hy6.LJI();
                return;
            }
            return;
        }
        InterfaceC45790Hy6 interfaceC45790Hy62 = this.LJLIL;
        if (interfaceC45790Hy62 == null) {
            return;
        }
        interfaceC45790Hy62.LIZ(aVMusic);
    }
}
