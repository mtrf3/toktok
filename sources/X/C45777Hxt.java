package X;

import android.content.Context;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.Hxt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45777Hxt extends r2 {
    public final /* synthetic */ InterfaceC45785Hy1 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public C45777Hxt(InterfaceC45785Hy1 interfaceC45785Hy1, Context context) {
        this.LJLIL = interfaceC45785Hy1;
        this.LJLILLLLZI = context;
    }

    @Override // com.google.android.play.core.assetpacks.r2, X.InterfaceC45785Hy1
    public final void LIZIZ(AVMusic aVMusic, boolean z) {
        if (z) {
            InterfaceC45785Hy1 interfaceC45785Hy1 = this.LJLIL;
            if (interfaceC45785Hy1 != null) {
                interfaceC45785Hy1.LIZIZ(aVMusic, true);
            }
            Context context = this.LJLILLLLZI;
            C45783Hxz c45783Hxz = new C45783Hxz(this.LJLIL);
            if (context == null || aVMusic == null || aVMusic.getStickPointMusicAlg() == null) {
                c45783Hxz.LIZ(aVMusic, false);
                return;
            }
            C45776Hxs c45776Hxs = new C45776Hxs();
            c45776Hxs.LJ = new C45778Hxu(c45783Hxz, aVMusic);
            c45776Hxs.LIZIZ(context, aVMusic.getStickPointMusicAlg());
            return;
        }
        InterfaceC45785Hy1 interfaceC45785Hy12 = this.LJLIL;
        if (interfaceC45785Hy12 == null) {
            return;
        }
        interfaceC45785Hy12.LIZIZ(aVMusic, false);
    }
}
