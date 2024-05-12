package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZD implements XUC {
    public final /* synthetic */ VerticalMusicView LJLIL;

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return null;
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.XUC
    public final /* synthetic */ void T3(MusicModel musicModel) {
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        if (this.LJLIL.LLILZLL != null) {
            return true;
        }
        return false;
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        XZH xzh = this.LJLIL.LJLJL;
        if (xzh != null) {
            return xzh.LIZLLL;
        }
        o.LJIJI("params");
        throw null;
    }

    public XZD(VerticalMusicView verticalMusicView) {
        this.LJLIL = verticalMusicView;
    }

    @Override // X.XUC
    public final void LJJJJIZL(MusicModel musicModel, Exception e) {
        boolean z;
        XZC xzc;
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(e, "e");
        VerticalMusicView verticalMusicView = this.LJLIL;
        if (verticalMusicView.LLJJIJIIJIL == XW2.TAB_AI && o.LJ(verticalMusicView.LLJLIL, musicModel.getMusicId())) {
            XZH xzh = this.LJLIL.LJLJL;
            if (xzh != null) {
                xzh.LJIILJJIL.V9(true);
                z = true;
            } else {
                o.LJIJI("params");
                throw null;
            }
        } else {
            z = false;
        }
        int i = XW3.LIZ[this.LJLIL.LLJJIJIIJIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    xzc = this.LJLIL.LLJJ;
                } else {
                    throw new C162476Zf();
                }
            } else {
                xzc = this.LJLIL.LLJILLL;
            }
        } else {
            xzc = this.LJLIL.LLJILJILJ;
        }
        if (xzc != null) {
            xzc.LJZ(-1);
        }
        VerticalMusicView verticalMusicView2 = this.LJLIL;
        XZH xzh2 = verticalMusicView2.LJLJL;
        if (xzh2 != null) {
            xzh2.LJIILJJIL.U9(musicModel, z, verticalMusicView2.LLJJIJIIJIL.getStringValue(), this.LJLIL.LLJJLIIIJLLLLLLLZ);
        } else {
            o.LJIJI("params");
            throw null;
        }
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        XZH xzh = this.LJLIL.LJLJL;
        if (xzh != null) {
            XZN xzn = xzh.LJIILJJIL;
            new I9Q();
            xzn.ba(I9Q.LIZ(musicModel), new AqS57S1200000_2(musicModel, this.LJLIL, str, 0));
            return;
        }
        o.LJIJI("params");
        throw null;
    }
}
