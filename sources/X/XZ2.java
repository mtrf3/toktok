package X;

import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ2 implements InterfaceC42845Grh {
    public final /* synthetic */ VerticalMusicView LIZ;

    @Override // X.InterfaceC42845Grh
    public final void LJIIJJI() {
        XZC xzc = this.LIZ.LLJILLL;
        if (xzc != null) {
            xzc.showLoadMoreLoading();
        }
        VerticalMusicView verticalMusicView = this.LIZ;
        if (verticalMusicView.LLJ.LIZLLL) {
            XTV xtv = XTV.LJIIIZ;
            XZH xzh = verticalMusicView.LJLJL;
            if (xzh != null) {
                int i = xzh.LJI;
                xtv.getClass();
                XKX.LIZLLL(C780334l.LJLIL, null, null, new XTT(xtv, i, true, null), 3);
                return;
            }
            o.LJIJI("params");
            throw null;
        }
    }

    public XZ2(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }
}
