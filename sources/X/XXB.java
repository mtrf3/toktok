package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes16.dex */
public final /* synthetic */ class XXB implements InterfaceC71293RyT, InterfaceC55031Lil, G88, G7W {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC55031Lil
    public void LIZ() {
        List<Aweme> Q8;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) this.LJLIL;
        RecFeedShareComponentController recFeedShareComponentController = feedRecommendFragment.LLFFF;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LJLL;
        recFeedShareComponentController.getClass();
        if (recommendFeedFragmentPanel != null && recommendFeedFragmentPanel.getAdapter() != null && !recFeedShareComponentController.LIZ(recommendFeedFragmentPanel.getCurFeedViewHolder()) && (Q8 = recommendFeedFragmentPanel.getAdapter().Q8()) != null) {
            Iterator<Aweme> it = Q8.iterator();
            while (it.hasNext()) {
                recFeedShareComponentController.LIZJ(it.next());
            }
        }
    }

    @Override // X.G7W
    public void onSuccess() {
        ((VideoPublishContainerScene) this.LJLIL).j();
    }

    public /* synthetic */ XXB(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.G88
    public void LIZIZ(C85022XYk c85022XYk, View view, MusicModel musicModel) {
        final ChallengeMusicWidget challengeMusicWidget = (ChallengeMusicWidget) this.LJLIL;
        challengeMusicWidget.getClass();
        int id = view.getId();
        if (id == R.id.f75) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.getString(R.string.gaf);
            }
            c85022XYk.P();
            boolean z = c85022XYk.LJLLLLLL;
            String musicId = musicModel.getMusicId();
            XTE xte = challengeMusicWidget.LJLLJ;
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
            challengeMusicWidget.LJLJJI.get("challenge_id", null);
            return;
        }
        if (id == R.id.g4i) {
            if (challengeMusicWidget.LJLLI == c85022XYk.LJZL && ((Integer) challengeMusicWidget.LJLJJI.get("music_position", -1)).intValue() == -2) {
                challengeMusicWidget.LJLJJI.jv0(-1, "music_position");
                challengeMusicWidget.LJLJJI.jv0(-1, "music_index");
                c85022XYk.U(false, false);
                challengeMusicWidget.LJLL.k2(null);
                return;
            }
            XY6 xy6 = challengeMusicWidget.LJLL;
            if (xy6 != null) {
                xy6.k2(null);
                SFS.LJLJJL = c85022XYk.LJZL;
                XTE xte2 = new XTE("change_music_page", "attached_song", "", SFS.LJLJJI);
                challengeMusicWidget.LJLJJI.get("challenge_id", null);
                challengeMusicWidget.LJLL.t2(xte2, musicModel);
                challengeMusicWidget.LJLL.C7(new XT7() { // from class: X.XXx
                    @Override // X.XT7
                    public final void LIZ() {
                        ChallengeMusicWidget.this.LJLJJI.jv0(Boolean.FALSE, "music_loading");
                    }
                });
            }
            challengeMusicWidget.LJLJJI.jv0(-2, "music_position");
            challengeMusicWidget.LJLJJI.jv0(Integer.valueOf(c85022XYk.LJZL), "music_index");
            challengeMusicWidget.LJLJJI.jv0(Boolean.TRUE, "music_loading");
            return;
        }
        if (id != R.id.g6y) {
            return;
        }
        XZ1 xz1 = challengeMusicWidget.LJLLLL;
        if (xz1 != null) {
            ((BaseNewMusicTabFragment) xz1).LJLZ = 10;
        }
        if (challengeMusicWidget.LJLL == null) {
            return;
        }
        musicModel.setFromSection(MusicModel.FromSection.CHALLENGE);
        challengeMusicWidget.LJLL.y8(musicModel);
        XTE xte3 = challengeMusicWidget.LJLLJ;
        String musicId2 = musicModel.getMusicId();
        int i = c85022XYk.LJZL;
        musicModel.getLogPb();
        SFS.LJJIIJ(xte3, musicId2, i);
    }
}
