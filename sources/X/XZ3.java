package X;

import Y.AfS67S0100000_15;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ3 implements InterfaceC42845Grh {
    public final /* synthetic */ VerticalMusicView LIZ;

    public XZ3(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    @Override // X.InterfaceC42845Grh
    public final void LJIIJJI() {
        C73390SrC LIZ;
        VerticalMusicView verticalMusicView = this.LIZ;
        XZH xzh = verticalMusicView.LJLJL;
        if (xzh != null) {
            verticalMusicView.LLILZ = verticalMusicView.LJIILL(xzh);
            XZG xzg = this.LIZ.LLIZLLLIL;
            if (xzg.LIZLLL) {
                int i = xzg.LJ;
                VerticalMusicView.LLJLLL.getClass();
                int i2 = VerticalMusicView.LLJZIJLIL;
                if (i >= i2 / 2) {
                    XZC xzc = this.LIZ.LLJILJILJ;
                    if (xzc != null) {
                        xzc.showLoadMoreLoading();
                    }
                    VerticalMusicView verticalMusicView2 = this.LIZ;
                    XZG xzg2 = verticalMusicView2.LLIZLLLIL;
                    String str = xzg2.LIZIZ;
                    XZH xzh2 = verticalMusicView2.LJLJL;
                    if (xzh2 != null) {
                        String str2 = xzh2.LJII;
                        XZ4 xz4 = new XZ4(i2, xzh2.LJI, xzg2.LIZJ, verticalMusicView2.LLILZ, xzh2.LJFF, str, str2, xzh2.LJIILLIIL);
                        if ((TextUtils.isEmpty(xz4.LIZ) && C00F.LIZ(31744, 0, "enable_ai_music_without_frame", true) == 0) || C60903NvH.LJIIJJI().LJIILLIIL().LIZ()) {
                            LIZ = AbstractC73672Svk.LJIIJ(new C42634GoI(xz4.LIZLLL, xz4.LJI, xz4.LJ, xz4.LJFF));
                        } else {
                            LIZ = C42640GoO.LIZ.LIZ(xz4.LIZ, xz4.LIZIZ, xz4.LIZLLL, xz4.LJ, xz4.LJI, xz4.LJIIIIZZ, 0, xz4.LIZJ, xz4.LJII);
                        }
                        C73454SsE LJJJ = LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                        VerticalMusicView verticalMusicView3 = this.LIZ;
                        this.LIZ.LLJI.LIZ(LJJJ.LJJJLIIL(new AfS67S0100000_15(verticalMusicView3, 76), new AfS67S0100000_15(verticalMusicView3, 77)));
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                }
            }
            this.LIZ.LJIIZILJ(XW2.TAB_AI);
            return;
        }
        o.LJIJI("params");
        throw null;
    }
}
