package X;

import Y.ARunnableS21S0110000_15;
import android.app.Activity;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes16.dex */
public class XX8 implements G88 {
    public final /* synthetic */ XX9 LJLIL;

    public XX8(XX9 xx9) {
        this.LJLIL = xx9;
    }

    @Override // X.G88
    public final void LIZIZ(final C85022XYk c85022XYk, View view, MusicModel musicModel) {
        if (musicModel == null || view == null || view.getContext() == null) {
            return;
        }
        view.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            int id = view.getId();
            XTE xte = this.LJLIL.LJLJJLL;
            musicModel.getLogPb();
            xte.getClass();
            if (id == R.id.f75) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    LJIIIIZZ.getString(R.string.gaf);
                }
                c85022XYk.P();
                boolean z = c85022XYk.LJLLLLLL;
                String musicId = musicModel.getMusicId();
                XTE xte2 = this.LJLIL.LJLJJLL;
                musicModel.getLogPb();
                SFS.LJJIFFI(z, musicId, xte2);
                return;
            }
            if (id == R.id.f79) {
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
            if (id == R.id.g6y) {
                if (!SS0.LIZIZ(musicModel, view.getContext(), true) || this.LJLIL.LJLIL == null) {
                    return;
                }
                F9J.LIZIZ(view.getContext(), 0, "av_settings.xml");
                this.LJLIL.LJLIL.y8(musicModel);
                XTE xte3 = this.LJLIL.LJLJJLL;
                String musicId2 = musicModel.getMusicId();
                int layoutPosition = c85022XYk.getLayoutPosition();
                musicModel.getLogPb();
                SFS.LJJIIJ(xte3, musicId2, layoutPosition);
                return;
            }
            if (id != R.id.g4i) {
                return;
            }
            if (this.LJLIL.LJLJJI == c85022XYk.getPosition()) {
                XX9 xx9 = this.LJLIL;
                if (xx9.LJLIL != null) {
                    xx9.LJLLLLLL();
                }
            } else {
                XX9 xx92 = this.LJLIL;
                if (xx92.LJLIL != null) {
                    xx92.LJLLLLLL();
                    this.LJLIL.LJLJJI = c85022XYk.getPosition();
                    if (musicModel.isLocalMusic()) {
                        this.LJLIL.getClass();
                        MediaPlayer LIZ2 = XTP.LIZ();
                        try {
                            LIZ2.reset();
                            LIZ2.setDataSource(musicModel.getLocalPath());
                            LIZ2.setAudioStreamType(3);
                            LIZ2.prepareAsync();
                            LIZ2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.XY5
                                @Override // android.media.MediaPlayer.OnPreparedListener
                                public final void onPrepared(MediaPlayer mediaPlayer) {
                                    C85022XYk c85022XYk2 = C85022XYk.this;
                                    mediaPlayer.start();
                                    c85022XYk2.U(false, true);
                                }
                            });
                            LIZ2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.XTQ
                                @Override // android.media.MediaPlayer.OnErrorListener
                                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                                    if (XTP.LIZ != null) {
                                        XTP.LIZ.release();
                                        XTP.LIZ = null;
                                        return false;
                                    }
                                    return false;
                                }
                            });
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    } else {
                        this.LJLIL.LJLIL.C7(new XT7() { // from class: X.XY1
                            @Override // X.XT7
                            public final void LIZ() {
                                XX9 xx93 = XX8.this.LJLIL;
                                if (xx93.LJLJJI < 0) {
                                    return;
                                }
                                xx93.LJLJI.post(new ARunnableS21S0110000_15(xx93, 5));
                            }
                        });
                        XX9 xx93 = this.LJLIL;
                        xx93.LJLIL.t2(xx93.LJLJJLL, musicModel);
                        SFS.LJLJJL = c85022XYk.getPosition();
                    }
                }
            }
            this.LJLIL.LJLJJL = musicModel.getMusicId();
            this.LJLIL.getClass();
            return;
        }
        C5S1 c5s12 = new C5S1(view.getContext());
        c5s12.LIZJ(R.string.img);
        c5s12.LJ();
    }
}
