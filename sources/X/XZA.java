package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZA implements InterfaceC82734WdW {
    public final /* synthetic */ VerticalMusicView LIZ;

    @Override // X.InterfaceC82734WdW
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC82734WdW
    public final boolean LIZIZ() {
        XZH xzh = this.LIZ.LJLJL;
        if (xzh != null) {
            return xzh.LJIILJJIL.LIZIZ();
        }
        o.LJIJI("params");
        throw null;
    }

    @Override // X.InterfaceC82734WdW
    public final boolean LIZLLL() {
        String musicId;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.LJLILLLLZI.Z9().LIZIZ());
        if (extractAVMusic != null && extractAVMusic.musicType == 5) {
            return false;
        }
        if (extractAVMusic != null && (musicId = extractAVMusic.getMusicId()) != null) {
            XZH xzh = this.LIZ.LJLJL;
            if (xzh != null) {
                List<String> list = xzh.LIZIZ;
                if (list != null && list.contains(musicId)) {
                    return false;
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        XZH xzh2 = this.LIZ.LJLJL;
        if (xzh2 != null) {
            return xzh2.LJIILJJIL.LIZLLL();
        }
        o.LJIJI("params");
        throw null;
    }

    public XZA(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZ(int i, View view) {
        String str;
        MusicModel musicModel;
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        Object obj = ListProtector.get(this.LIZ.LLIZLLLIL.LIZ, i);
        o.LJIIIIZZ(obj, "aiMsicListPageData.musicDataList[position]");
        MusicModel musicModel2 = (MusicModel) obj;
        XZC xzc = this.LIZ.LLJILJILJ;
        if (xzc != null) {
            str = xzc.LJLLLLLL();
        } else {
            str = null;
        }
        if (o.LJ(str, musicModel2.getMusicId())) {
            XZH xzh = this.LIZ.LJLJL;
            if (xzh != null) {
                if (!xzh.LJIIL) {
                    xzh.LJIILL.LJFF(i, musicModel2, XW2.TAB_AI.getStringValue(), null);
                }
                VerticalMusicView verticalMusicView = this.LIZ;
                verticalMusicView.LJIIIZ(verticalMusicView.LLJILJILJ, false);
                this.LIZ.LLJJI = null;
                return;
            }
            o.LJIJI("params");
            throw null;
        }
        VerticalMusicView verticalMusicView2 = this.LIZ;
        verticalMusicView2.LLJJI = musicModel2;
        XZC xzc2 = verticalMusicView2.LLJILJILJ;
        if (xzc2 != null) {
            xzc2.LJZ(i);
        }
        if (C53235Kut.LIZ()) {
            VerticalMusicView verticalMusicView3 = this.LIZ;
            XZH xzh2 = verticalMusicView3.LJLJL;
            if (xzh2 != null) {
                if (!xzh2.LJIIIIZZ && ((musicModel = verticalMusicView3.LLJJI) == null || !musicModel.isSpeechToSong())) {
                    VerticalMusicView verticalMusicView4 = this.LIZ;
                    verticalMusicView4.LJJIJ(musicModel2, i, view, XW2.TAB_AI, verticalMusicView4.LLJILJILJ);
                    return;
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        this.LIZ.LJJIIZI(i, musicModel2, XW2.TAB_AI);
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZJ(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        o.LJIIIIZZ(ListProtector.get(this.LIZ.LLIZLLLIL.LIZ, i), "aiMsicListPageData.musicDataList.get(position)");
        XZH xzh = this.LIZ.LJLJL;
        if (xzh != null) {
            xzh.LJIILJJIL.W9();
        } else {
            o.LJIJI("params");
            throw null;
        }
    }

    @Override // X.InterfaceC82734WdW
    public final void LJ(MusicModel musicModel, int i) {
        this.LIZ.LJIJJ(musicModel, XW2.TAB_AI, i, null, null);
    }

    @Override // X.InterfaceC82734WdW
    public final void LJI(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        Object obj = ListProtector.get(this.LIZ.LLIZLLLIL.LIZ, i);
        o.LJIIIIZZ(obj, "aiMsicListPageData.musicDataList.get(position)");
        VerticalMusicView verticalMusicView = this.LIZ;
        verticalMusicView.LJJII(verticalMusicView.LLJILJILJ, (MusicModel) obj);
    }

    @Override // X.InterfaceC82734WdW
    public final void LJII(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        XZH xzh = this.LIZ.LJLJL;
        if (xzh != null) {
            XZN xzn = xzh.LJIILJJIL;
            XW2 xw2 = XW2.TAB_AI;
            xzn.O9(xw2.getStringValue());
            VerticalMusicView verticalMusicView = this.LIZ;
            XZH xzh2 = verticalMusicView.LJLJL;
            if (xzh2 != null) {
                xzh2.LJIILL.LJ(verticalMusicView.LLJJI, xw2.getStringValue(), null);
                return;
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        o.LJIJI("params");
        throw null;
    }
}
