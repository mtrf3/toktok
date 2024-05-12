package X;

import Y.AObjectS42S0101000_5;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.PortraitShortTouchPreviewEvent;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.UUID;

/* loaded from: classes16.dex */
public final /* synthetic */ class XX4 implements InterfaceC30078BrG, G87, InterfaceC47506Ikg {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ XX4(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.LJLIL;
        absAudienceInteractionFragment.mDataChannel.ov0(absAudienceInteractionFragment, PortraitShortTouchPreviewEvent.class, new AObjectS42S0101000_5(1, interfaceC29879Bo3, 28));
    }

    @Override // X.G87
    public final void LIZ(C84987XXb c84987XXb, View view, MusicModel musicModel, int i) {
        final StickerMusicWidget stickerMusicWidget = (StickerMusicWidget) this.LJLIL;
        stickerMusicWidget.getClass();
        int id = view.getId();
        if (id == R.id.f75) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.getString(R.string.gaf);
            }
            if (!t1.LJI()) {
                C84964XWe.LIZIZ(C84763XOl.LJIIIIZZ(), C44426Hc6.LIZJ(i));
                return;
            } else {
                c84987XXb.P();
                XVF.LJII(c84987XXb.LLF, musicModel, stickerMusicWidget.LJLLL, c84987XXb.LLI, musicModel.getLogPb());
                return;
            }
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
            if (!XU0.LIZ(musicModel, view.getContext(), true)) {
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
            XVF.LJIIIIZZ(new XVG("change_music_page", "attached_song", "click_button", XVF.LIZ), musicModel.getMusicId(), false, uuid);
            return;
        }
        if (id == R.id.g4i) {
            ChooseMusicSelectView chooseMusicSelectView = XVI.LIZ;
            if (chooseMusicSelectView != null) {
                chooseMusicSelectView.LIZIZ();
            }
            if (stickerMusicWidget.LJLLI == c84987XXb.LLI && ((Integer) stickerMusicWidget.LJLJJI.get("music_position", -1)).intValue() == -2) {
                stickerMusicWidget.LJLJJI.jv0(-1, "music_position");
                stickerMusicWidget.LJLJJI.jv0(-1, "music_index");
                stickerMusicWidget.LJLL.k2(null);
                return;
            }
            XY4 xy4 = stickerMusicWidget.LJLL;
            if (xy4 != null) {
                xy4.k2(null);
                XVF.LIZLLL = c84987XXb.LLI;
                XVG xvg = new XVG("change_music_page", "prop", "", XVF.LIZ);
                xvg.LJFF = (String) stickerMusicWidget.LJLJJI.get("sticker_id", null);
                stickerMusicWidget.LJLL.za0(new XUP() { // from class: X.XXv
                    @Override // X.XUP
                    public final void LIZ() {
                        StickerMusicWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                    }
                });
                stickerMusicWidget.LJLL.oj0(musicModel, xvg);
            }
            stickerMusicWidget.LJLJJI.jv0(-2, "music_position");
            stickerMusicWidget.LJLJJI.jv0(Integer.valueOf(c84987XXb.LLI), "music_index");
            stickerMusicWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
            return;
        }
        if (id == R.id.g6y) {
            XZ0 xz0 = stickerMusicWidget.LJLLLLLL;
            if (xz0 != null) {
                ((BaseNewMusicTabFragment) xz0).LJZL = 9;
            }
            if (musicModel == null) {
                return;
            }
            MusicModel m159clone = musicModel.m159clone();
            if (stickerMusicWidget.LJLL == null) {
                return;
            }
            String str = stickerMusicWidget.LJLLL.LJ;
            if (C38354F3m.LJ(str)) {
                str = "";
            }
            m159clone.setCategoryID(str);
            m159clone.setEditFrom("");
            stickerMusicWidget.LJLL.y8(m159clone);
            XVF.LJIILL(stickerMusicWidget.LJLLL, m159clone, c84987XXb.LLI, m159clone.getLogPb());
            return;
        }
        if (id != R.id.f77) {
            return;
        }
        stickerMusicWidget.LJLJJI.jv0(-1, "music_position");
        stickerMusicWidget.LJLJJI.jv0(-1, "music_index");
        c84987XXb.V(false, false, false);
        stickerMusicWidget.LJLL.k2(null);
        XVG xvg2 = stickerMusicWidget.LJLLL;
        xvg2.LIZJ = "change_music";
        xvg2.LJIIJ = XVF.LIZIZ(xvg2.LIZLLL);
        ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C165706es.LJ(stickerMusicWidget.LJLJLLL).get(ChooseMusicCutViewModel.class);
        chooseMusicCutViewModel.gv0().postValue(stickerMusicWidget.LJLLL);
        chooseMusicCutViewModel.hv0().postValue(musicModel);
    }
}
