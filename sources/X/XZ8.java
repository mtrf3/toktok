package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZ8 implements InterfaceC82734WdW {
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

    public XZ8(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZ(int i, View view) {
        String str;
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        Object obj = ListProtector.get(this.LIZ.LLJ.LIZ, i);
        o.LJIIIIZZ(obj, "collectMusicDataList.musicDataList.get(position)");
        MusicModel musicModel = (MusicModel) obj;
        if (musicModel.getMusic() == null) {
            return;
        }
        this.LIZ.LLJJI = musicModel;
        if (musicModel.getMusic().isCanNotReuse()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.eis);
            C78915Uy7.LJJIJ(view, 3068, creativeToastBuilder);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "change_music_page");
            FMX.LJIIL("add_private_music", c188727au.LIZ);
            return;
        }
        XZC xzc = this.LIZ.LLJILLL;
        if (xzc != null) {
            str = xzc.LJLLLLLL();
        } else {
            str = null;
        }
        if (o.LJ(str, musicModel.getMusicId())) {
            XZH xzh = this.LIZ.LJLJL;
            if (xzh != null) {
                if (!xzh.LJIIL) {
                    xzh.LJIILL.LJFF(i, musicModel, XW2.TAB_COLLECT.getStringValue(), null);
                }
                VerticalMusicView verticalMusicView = this.LIZ;
                verticalMusicView.LJIIIZ(verticalMusicView.LLJILLL, false);
                this.LIZ.LLJJI = null;
                return;
            }
            o.LJIJI("params");
            throw null;
        }
        if (CommerceMediaServiceImpl.LIZJ().LJIILLIIL(musicModel.getMusic())) {
            AnonymousClass030.LJ(view, R.string.iim);
            VerticalMusicView verticalMusicView2 = this.LIZ;
            verticalMusicView2.LJIIIZ(verticalMusicView2.LLJILLL, false);
            this.LIZ.LLJJI = null;
            return;
        }
        XZC xzc2 = this.LIZ.LLJILLL;
        if (xzc2 != null) {
            xzc2.LJZ(i);
        }
        if (C53235Kut.LIZ()) {
            VerticalMusicView verticalMusicView3 = this.LIZ;
            XZH xzh2 = verticalMusicView3.LJLJL;
            if (xzh2 != null) {
                if (!xzh2.LJIIIIZZ) {
                    verticalMusicView3.LJJIJ(musicModel, i, view, XW2.TAB_COLLECT, verticalMusicView3.LLJILLL);
                    return;
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        this.LIZ.LJJIIZI(i, musicModel, XW2.TAB_COLLECT);
    }

    @Override // X.InterfaceC82734WdW
    public final void LIZJ(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        o.LJIIIIZZ(ListProtector.get(this.LIZ.LLJ.LIZ, i), "collectMusicDataList.musicDataList.get(position)");
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
        this.LIZ.LJIJJ(musicModel, XW2.TAB_COLLECT, i, null, null);
    }

    @Override // X.InterfaceC82734WdW
    public final void LJI(int i, View view) {
        o.LJIIIZ(view, "view");
        if (i < 0) {
            return;
        }
        Object obj = ListProtector.get(this.LIZ.LLJ.LIZ, i);
        o.LJIIIIZZ(obj, "collectMusicDataList.musicDataList.get(position)");
        VerticalMusicView verticalMusicView = this.LIZ;
        verticalMusicView.LJJII(verticalMusicView.LLJILLL, (MusicModel) obj);
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
            XW2 xw2 = XW2.TAB_COLLECT;
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
