package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ9 implements InterfaceC82738Wda {
    public final /* synthetic */ VerticalMusicView LIZ;

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

    @Override // X.InterfaceC82734WdW
    public final void LJIIIIZZ() {
        XTV.LJIIIZ.LJII.LIZ = false;
        VerticalMusicView verticalMusicView = this.LIZ;
        verticalMusicView.LJIILJJIL(verticalMusicView.LLJ);
    }

    public XZ9(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZ(int i, View view) {
        List<MusicModel> data;
        MusicModel musicModel;
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        XZJ xzj = this.LIZ.LLJJ;
        if (xzj != null && (data = xzj.getData()) != null && (musicModel = (MusicModel) ORZ.LJLLLLLL(i, data)) != null) {
            VerticalMusicView verticalMusicView = this.LIZ;
            verticalMusicView.LLJJI = musicModel;
            XZJ xzj2 = verticalMusicView.LLJJ;
            if (xzj2 != null) {
                str = xzj2.LJLLLLLL();
            } else {
                str = null;
            }
            if (o.LJ(str, musicModel.getMusicId())) {
                XZH xzh = verticalMusicView.LJLJL;
                if (xzh != null) {
                    if (!xzh.LJIIL) {
                        XZO xzo = xzh.LJIILL;
                        String stringValue = XW2.TAB_RECENT.getStringValue();
                        XZQ LJIIL = verticalMusicView.LJIIL();
                        if (LJIIL != null) {
                            String musicId = musicModel.getMusicId();
                            o.LJIIIIZZ(musicId, "model.musicId");
                            str2 = LJIIL.pp(musicId);
                        } else {
                            str2 = null;
                        }
                        xzo.LJFF(i, musicModel, stringValue, str2);
                    }
                    verticalMusicView.LJIIIZ(verticalMusicView.LLJJ, false);
                    verticalMusicView.LLJJI = null;
                    return;
                }
                o.LJIJI("params");
                throw null;
            }
            XZJ xzj3 = verticalMusicView.LLJJ;
            if (xzj3 != null) {
                xzj3.LJZ(i);
            }
            if (C53235Kut.LIZ()) {
                XZH xzh2 = verticalMusicView.LJLJL;
                if (xzh2 != null) {
                    if (!xzh2.LJIIIIZZ) {
                        verticalMusicView.LJJIJ(musicModel, i, view, XW2.TAB_RECENT, verticalMusicView.LLJJ);
                        return;
                    }
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            verticalMusicView.LJJIIZI(i, musicModel, XW2.TAB_RECENT);
        }
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZJ(int i, View view) {
        o.LJIIIZ(view, "view");
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
        String str;
        XZQ LJIIL;
        VerticalMusicView verticalMusicView = this.LIZ;
        XW2 xw2 = XW2.TAB_RECENT;
        String musicId = musicModel.getMusicId();
        if (musicId != null && (LJIIL = this.LIZ.LJIIL()) != null) {
            str = LJIIL.pp(musicId);
        } else {
            str = null;
        }
        verticalMusicView.LJIJJ(musicModel, xw2, i, "edit_page_recent", str);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.Wch] */
    @Override // X.InterfaceC82738Wda
    public final void LJFF(int i, View view) {
        List<MusicModel> data;
        MusicModel musicModel;
        XZJ xzj = this.LIZ.LLJJ;
        if (xzj != null && (data = xzj.getData()) != null && (musicModel = (MusicModel) ListProtector.get(data, i)) != null) {
            VerticalMusicView verticalMusicView = this.LIZ;
            C68322mC c68322mC = new C68322mC();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "anchorView.context");
            C6DJ c6dj = new C6DJ(context);
            c6dj.LIZ.LIZIZ = view;
            c6dj.LJI(WHL.TOP);
            c6dj.LIZ.LJII = -1001L;
            c6dj.LJIIJJI(new C85038XZa(verticalMusicView, musicModel, i, c68322mC));
            ?? LIZJ = c6dj.LIZJ();
            c68322mC.element = LIZJ;
            LIZJ.show();
        }
    }

    @Override // X.InterfaceC82734WdW
    public final void LJI(int i, View view) {
        List<MusicModel> data;
        MusicModel musicModel;
        o.LJIIIZ(view, "view");
        XZJ xzj = this.LIZ.LLJJ;
        if (xzj != null && (data = xzj.getData()) != null && (musicModel = (MusicModel) ListProtector.get(data, i)) != null) {
            VerticalMusicView verticalMusicView = this.LIZ;
            verticalMusicView.LJJII(verticalMusicView.LLJJ, musicModel);
        }
    }

    @Override // X.InterfaceC82734WdW
    public final void LJII(int i, View view) {
        String musicId;
        XZQ LJIIL;
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        XZH xzh = this.LIZ.LJLJL;
        String str = null;
        if (xzh != null) {
            XZN xzn = xzh.LJIILJJIL;
            XW2 xw2 = XW2.TAB_RECENT;
            xzn.O9(xw2.getStringValue());
            VerticalMusicView verticalMusicView = this.LIZ;
            XZH xzh2 = verticalMusicView.LJLJL;
            if (xzh2 != null) {
                XZO xzo = xzh2.LJIILL;
                MusicModel musicModel = verticalMusicView.LLJJI;
                String stringValue = xw2.getStringValue();
                MusicModel musicModel2 = this.LIZ.LLJJI;
                if (musicModel2 != null && (musicId = musicModel2.getMusicId()) != null && (LJIIL = this.LIZ.LJIIL()) != null) {
                    str = LJIIL.pp(musicId);
                }
                xzo.LJ(musicModel, stringValue, str);
                return;
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }
}
