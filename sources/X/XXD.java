package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* loaded from: classes16.dex */
public final /* synthetic */ class XXD implements G88, InterfaceC46840IZw {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ XXD(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.G88
    public final void LIZIZ(C85022XYk c85022XYk, View view, MusicModel musicModel) {
        final StickerMusicWidget stickerMusicWidget = (StickerMusicWidget) this.LJLIL;
        stickerMusicWidget.getClass();
        int id = view.getId();
        if (id == R.id.f75) {
            C84763XOl.LJIIIIZZ();
            c85022XYk.P();
            boolean z = c85022XYk.LJLLLLLL;
            String musicId = musicModel.getMusicId();
            XTE xte = stickerMusicWidget.LJLLJ;
            musicModel.getLogPb();
            SFS.LJJIFFI(z, musicId, xte);
            return;
        }
        if (id == R.id.f79) {
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.iia);
                }
                C5S1 c5s1 = new C5S1(view.getContext());
                c5s1.LIZLLL(offlineDesc);
                c5s1.LJ();
                return;
            }
            if (!SS0.LIZIZ(musicModel, view.getContext(), true)) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            C61200O0e LIZLLL = C61200O0e.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://music/detail/");
            LIZ.append(musicModel.getMusicId());
            C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
            c39061g6.LIZIZ("process_id", uuid);
            LIZLLL.LJII(c39061g6.LIZJ());
            return;
        }
        if (id == R.id.g4i) {
            if (stickerMusicWidget.LJLL == c85022XYk.LJZL && ((Integer) stickerMusicWidget.LJLJJI.get("music_position", -1)).intValue() == -2) {
                stickerMusicWidget.LJLJJI.jv0(-1, "music_position");
                stickerMusicWidget.LJLJJI.jv0(-1, "music_index");
                stickerMusicWidget.LJLJLLL.k2(null);
                return;
            }
            XY6 xy6 = stickerMusicWidget.LJLJLLL;
            if (xy6 != null) {
                xy6.k2(null);
                SFS.LJLJJL = c85022XYk.LJZL;
                XTE xte2 = new XTE("change_music_page", "prop", "", SFS.LJLJJI);
                stickerMusicWidget.LJLJJI.get("sticker_id", null);
                stickerMusicWidget.LJLJLLL.C7(new XT7() { // from class: X.XY0
                    @Override // X.XT7
                    public final void LIZ() {
                        StickerMusicWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                    }
                });
                stickerMusicWidget.LJLJLLL.t2(xte2, musicModel);
            }
            stickerMusicWidget.LJLJJI.jv0(-2, "music_position");
            stickerMusicWidget.LJLJJI.jv0(Integer.valueOf(c85022XYk.LJZL), "music_index");
            stickerMusicWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
            return;
        }
        if (id != R.id.g6y) {
            return;
        }
        XZ1 xz1 = stickerMusicWidget.LJLLLL;
        if (xz1 != null) {
            ((BaseNewMusicTabFragment) xz1).LJLZ = 9;
        }
        XY6 xy62 = stickerMusicWidget.LJLJLLL;
        if (xy62 == null) {
            return;
        }
        xy62.y8(musicModel);
        XTE xte3 = stickerMusicWidget.LJLLJ;
        String musicId2 = musicModel.getMusicId();
        int i = c85022XYk.LJZL;
        musicModel.getLogPb();
        SFS.LJJIIJ(xte3, musicId2, i);
    }
}
