package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XXE implements InterfaceC85021XYj {
    public final /* synthetic */ List<MusicModel> LIZ;
    public final /* synthetic */ MusicRadioWidget LIZIZ;

    public XXE(List<MusicModel> list, MusicRadioWidget musicRadioWidget) {
        this.LIZ = list;
        this.LIZIZ = musicRadioWidget;
    }

    @Override // X.InterfaceC85021XYj
    public final void LIZ(C84995XXj c84995XXj, View view, MusicModel musicModel) {
        String str;
        MusicModel musicModel2;
        String str2;
        if (musicModel == null) {
            List<MusicModel> list = this.LIZ;
            if (list == null || list.isEmpty()) {
                MusicRadioWidget musicRadioWidget = this.LIZIZ;
                if (musicRadioWidget.LJLLJ) {
                    return;
                }
                musicRadioWidget.LJLLJ = true;
                musicRadioWidget.LJLJJI.jv0(Boolean.TRUE, "should_load_more_pick");
                return;
            }
            return;
        }
        int id = view.getId();
        MusicModel musicModel3 = null;
        if (id == R.id.f75) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                o.LJIIIIZZ(LJIIIIZZ.getString(R.string.gaf), "activity.getString(R.str…vorite_music_after_login)");
            }
            List<MusicModel> list2 = c84995XXj.LJLZ;
            if (list2 != null && ORZ.LJLLLLLL(c84995XXj.LJZ, list2) != null) {
                List<MusicModel> list3 = c84995XXj.LJLZ;
                if (list3 != null) {
                    musicModel2 = (MusicModel) ORZ.LJLLLLLL(c84995XXj.LJZ, list3);
                } else {
                    musicModel2 = null;
                }
                if (SS0.LIZIZ(musicModel2, c84995XXj.LJZL, true)) {
                    InterfaceC85019XYh<XYN> interfaceC85019XYh = c84995XXj.LJLLLLLL;
                    if (interfaceC85019XYh != null) {
                        List<MusicModel> list4 = c84995XXj.LJLZ;
                        if (list4 != null) {
                            musicModel3 = (MusicModel) ORZ.LJLLLLLL(c84995XXj.LJZ, list4);
                        }
                        if (c84995XXj.LL) {
                            str2 = "unfollow_type";
                        } else {
                            str2 = "follow_type";
                        }
                        interfaceC85019XYh.onInternalEvent(new XYN(str2, 0, c84995XXj.LJZ, musicModel3));
                    }
                    c84995XXj.LL = !c84995XXj.LL;
                    T5P t5p = c84995XXj.LJLJLJ;
                    if (t5p != null) {
                        t5p.LIZIZ();
                    }
                }
            }
            XTE xte = this.LIZIZ.LJLJLLL;
            if (xte != null) {
                xte.LIZJ = "click_button";
            }
            boolean z = c84995XXj.LL;
            String musicId = musicModel.getMusicId();
            XTE xte2 = this.LIZIZ.LJLJLLL;
            musicModel.getLogPb();
            SFS.LJJIFFI(z, musicId, xte2);
            return;
        }
        if (id == R.id.g4i || id == R.id.g2s || id == R.id.g6w) {
            Integer num = (Integer) this.LIZIZ.LJLJJI.get("music_position", -1);
            int i = this.LIZIZ.LJLL;
            if (num != null && num.intValue() == i) {
                Integer num2 = (Integer) this.LIZIZ.LJLJJI.get("music_index", -1);
                int i2 = c84995XXj.LJZ;
                if (num2 != null && num2.intValue() == i2) {
                    this.LIZIZ.LJLJJI.jv0(-1, "music_position");
                    this.LIZIZ.LJLJJI.jv0(-1, "music_index");
                    XY6 xy6 = this.LIZIZ.LJLLILLLL;
                    if (xy6 != null) {
                        xy6.k2(null);
                        return;
                    }
                    return;
                }
            }
            SFS.LJLJJL = c84995XXj.LJZ;
            XTE xte3 = this.LIZIZ.LJLJLLL;
            if (xte3 != null) {
                if (view.getId() == R.id.g2s) {
                    str = "click_start_your_fm";
                } else {
                    str = "click_play_icon";
                }
                xte3.LIZJ = str;
            }
            XY6 xy62 = this.LIZIZ.LJLLILLLL;
            if (xy62 != null) {
                xy62.k2(null);
            }
            c84995XXj.N(true, true);
            MusicRadioWidget musicRadioWidget2 = this.LIZIZ;
            XY6 xy63 = musicRadioWidget2.LJLLILLLL;
            if (xy63 != null) {
                xy63.C7(new C85011XXz(musicRadioWidget2));
            }
            MusicRadioWidget musicRadioWidget3 = this.LIZIZ;
            XY6 xy64 = musicRadioWidget3.LJLLILLLL;
            if (xy64 != null) {
                xy64.t2(musicRadioWidget3.LJLJLLL, musicModel);
            }
            MusicRadioWidget musicRadioWidget4 = this.LIZIZ;
            musicRadioWidget4.LJLJJI.jv0(Integer.valueOf(musicRadioWidget4.LJLL), "music_position");
            this.LIZIZ.LJLJJI.jv0(Integer.valueOf(c84995XXj.LJZ), "music_index");
            this.LIZIZ.LJLJJI.jv0(Boolean.TRUE, "music_loading");
            return;
        }
        if (id != R.id.g6y) {
            return;
        }
        MusicRadioWidget musicRadioWidget5 = this.LIZIZ;
        XTE xte4 = musicRadioWidget5.LJLJLLL;
        if (xte4 != null) {
            xte4.LIZJ = "";
        }
        XZ1 xz1 = musicRadioWidget5.LJLLLL;
        if (xz1 != null) {
            ((BaseNewMusicTabFragment) xz1).LJLZ = 8;
        }
        XY6 xy65 = musicRadioWidget5.LJLLILLLL;
        if (xy65 != null) {
            xy65.y8(musicModel);
        }
        XTE xte5 = this.LIZIZ.LJLJLLL;
        String musicId2 = musicModel.getMusicId();
        int i3 = this.LIZIZ.LJLL;
        musicModel.getLogPb();
        SFS.LJJIIJ(xte5, musicId2, i3);
    }
}
