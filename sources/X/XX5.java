package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.UUID;

/* loaded from: classes16.dex */
public final /* synthetic */ class XX5 implements InterfaceC30078BrG, G87 {
    public final /* synthetic */ ViewModelStoreOwner LJLIL;

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).lambda$loadWidgetWithFirstFrameP2$57(interfaceC29879Bo3);
    }

    public /* synthetic */ XX5(ViewModelStoreOwner viewModelStoreOwner) {
        this.LJLIL = viewModelStoreOwner;
    }

    @Override // X.G87
    public final void LIZ(C84987XXb c84987XXb, View view, MusicModel musicModel, int i) {
        final ChallengeMusicWidget challengeMusicWidget = (ChallengeMusicWidget) this.LJLIL;
        challengeMusicWidget.getClass();
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
                XVF.LJII(c84987XXb.LLF, musicModel, challengeMusicWidget.LJLLL, c84987XXb.LLI, musicModel.getLogPb());
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
            XVG xvg = new XVG("change_music_page", "attached_song", "click_button", XVF.LIZ);
            xvg.LJI = (String) challengeMusicWidget.LJLJJI.get("challenge_id", null);
            XVF.LJIIIIZZ(xvg, musicModel.getMusicId(), false, uuid);
            return;
        }
        if (id == R.id.g4i) {
            ChooseMusicSelectView chooseMusicSelectView = XVI.LIZ;
            if (chooseMusicSelectView != null) {
                chooseMusicSelectView.LIZIZ();
            }
            if (challengeMusicWidget.LJLLILLLL == c84987XXb.LLI && ((Integer) challengeMusicWidget.LJLJJI.get("music_position", -1)).intValue() == -2) {
                challengeMusicWidget.LJLJJI.jv0(-1, "music_position");
                challengeMusicWidget.LJLJJI.jv0(-1, "music_index");
                c84987XXb.V(false, false, false);
                challengeMusicWidget.LJLLI.k2(null);
                return;
            }
            XY4 xy4 = challengeMusicWidget.LJLLI;
            if (xy4 != null) {
                xy4.k2(null);
                XVF.LIZLLL = c84987XXb.LLI;
                new XVG("change_music_page", "attached_song", "", XVF.LIZ);
                challengeMusicWidget.LJLLI.za0(new XUP() { // from class: X.XXu
                    @Override // X.XUP
                    public final void LIZ() {
                        ChallengeMusicWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                    }
                });
                challengeMusicWidget.LJLLI.oj0(musicModel, challengeMusicWidget.LJLLL);
            }
            challengeMusicWidget.LJLJJI.jv0(-2, "music_position");
            challengeMusicWidget.LJLJJI.jv0(Integer.valueOf(c84987XXb.LLI), "music_index");
            challengeMusicWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
            return;
        }
        if (id == R.id.g6y) {
            XZ0 xz0 = challengeMusicWidget.LJZ;
            if (xz0 != null) {
                ((BaseNewMusicTabFragment) xz0).LJZL = 10;
            }
            if (musicModel == null) {
                return;
            }
            MusicModel m159clone = musicModel.m159clone();
            if (challengeMusicWidget.LJLLI == null || challengeMusicWidget.LJLLL == null) {
                return;
            }
            m159clone.setEditFrom("");
            challengeMusicWidget.LJLLI.y8(m159clone);
            XVF.LJIILL(challengeMusicWidget.LJLLL, m159clone, c84987XXb.LLI, m159clone.getLogPb());
            return;
        }
        if (id != R.id.f77) {
            return;
        }
        challengeMusicWidget.LJLJJI.jv0(-1, "music_position");
        challengeMusicWidget.LJLJJI.jv0(-1, "music_index");
        c84987XXb.V(false, false, false);
        challengeMusicWidget.LJLLI.k2(null);
        XVG xvg2 = challengeMusicWidget.LJLLL;
        xvg2.LIZJ = "change_music";
        xvg2.LJIIJ = XVF.LIZIZ(xvg2.LIZLLL);
        ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C165706es.LJ(challengeMusicWidget.LJLJLLL).get(ChooseMusicCutViewModel.class);
        chooseMusicCutViewModel.hv0().postValue(musicModel);
        chooseMusicCutViewModel.gv0().postValue(challengeMusicWidget.LJLLL);
    }
}
