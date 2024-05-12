package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;

/* loaded from: classes16.dex */
public final /* synthetic */ class XTB implements InterfaceC44312HaG {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ XTB(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC44312HaG
    public final void LIZ(WMH wmh) {
        VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLIL;
        videoRecordNewScene.getClass();
        InterfaceC45854Hz8 LIZ = PageFactoryDelegate.LIZIZ().LIZ(videoRecordNewScene.LJLZ.shootWay);
        if (LIZ != null) {
            LIZ.LIZ(wmh);
        }
    }

    public final void LIZIZ(int i) {
        C84880XSy c84880XSy = (C84880XSy) this.LJLIL;
        MusicModel musicModel = c84880XSy.LJII;
        if (musicModel != null) {
            XT0 xt0 = c84880XSy.LJIIIIZZ;
            if (xt0 != null) {
                xt0.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                XT0 xt02 = new XT0(c84880XSy, musicModel.getRealAuditionDuration());
                c84880XSy.LJIIIIZZ = xt02;
                xt02.start();
            }
        }
        XTE xte = c84880XSy.LJIIL;
        MusicModel musicModel2 = c84880XSy.LJII;
        if (xte != null && musicModel2 != null && !musicModel2.isLocalMusic() && SFS.LJLJJL != -1) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", xte.LIZ);
            c188727au.LJIIIZ("music_id", musicModel2.getMusicId());
            c188727au.LJIIIZ("category_name", xte.LIZIZ);
            c188727au.LJIIIZ("enter_method", xte.LIZJ);
            c188727au.LJIIIZ("previous_page", xte.LIZLLL);
            c188727au.LIZLLL(SFS.LJLJJL, "order");
            FMX.LJIIL("play_music", c188727au.LIZ);
        }
        String musicId = c84880XSy.LJII.getMusicId();
        if (SFS.LJLJL == null) {
            SFS.LJLJL = new XTF();
        }
        SFS.LJLJL.LIZ = musicId;
        System.currentTimeMillis();
        String musicId2 = c84880XSy.LJII.getMusicId();
        XTA xta = c84880XSy.LJIILJJIL;
        if (xta != null && TextUtils.equals(musicId2, xta.LIZ)) {
            long currentTimeMillis = System.currentTimeMillis() - c84880XSy.LJIILJJIL.LIZIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("duration", Long.valueOf(currentTimeMillis));
            C09900aA.LJ("time_from_click_music_to_start_play", c198517qh.LJ());
        }
        if (c84880XSy.LJI && c84880XSy.LIZLLL != null) {
            c84880XSy.LIZJ();
        }
        InterfaceC84871XSp interfaceC84871XSp = c84880XSy.LIZ;
        if (interfaceC84871XSp != null && interfaceC84871XSp.LIZLLL() != null && i != 0) {
            c84880XSy.LIZ.LIZLLL().setDuration(i);
        }
    }
}
