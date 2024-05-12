package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.ActivityC45651qj;
import X.C168366jA;
import X.C168386jC;
import X.C187507Xm;
import X.C187517Xn;
import X.C187527Xo;
import X.C188727au;
import X.C221108m2;
import X.C3A5;
import X.C47130Iec;
import X.C47325Ihl;
import X.C62021OVt;
import X.C62026OVy;
import X.C62822Ol8;
import X.C76W;
import X.C78983UzD;
import X.CountDownTimerC62023OVv;
import X.FMX;
import X.XU2;
import X.Z9N;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicPlayViewModel extends AssemViewModel<C187507Xm> {
    public Bundle LJLIL;
    public ActivityC45651qj LJLILLLLZI;
    public MusicModel LJLJI;
    public long LJLJLLL;
    public long LJLL;
    public CountDownTimerC62023OVv LJLLILLLL;
    public boolean LJLLJ;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 301));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 304));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new C62026OVy(this));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 303));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 302));
    public final XU2 LJLLI = new XU2("single_song");

    public final void LLLLLL() {
        CountDownTimerC62023OVv countDownTimerC62023OVv = this.LJLLILLLL;
        if (countDownTimerC62023OVv != null) {
            countDownTimerC62023OVv.cancel();
        }
        this.LJLLI.pause();
        setState(C187517Xn.LJLIL);
        MusicModel musicModel = this.LJLJI;
        if (musicModel != null && this.LJLLJ) {
            this.LJLLJ = false;
            Map<String, String> LLLLIILL = SearchServiceImpl.LLLZI().LLLLIILL();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", "click_play_music");
            String str = "share_from_resso";
            if (!o.LJ("share_from_resso", gv0())) {
                str = "single_song";
            }
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("search_type", LLLLIILL.get("searchType"));
            c188727au.LJIIIZ("previous_page_position", (String) this.LJLJL.getValue());
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(LLLLIILL.get("imprId")));
            c188727au.LJIIIZ("impr_id", LLLLIILL.get("imprId"));
            c188727au.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au.LIZLLL(musicModel.getDuration(), "time");
            c188727au.LIZLLL(musicModel.getDuration(), "duration");
            c188727au.LJ(SystemClock.elapsedRealtime() - this.LJLL, "stay_time");
            c188727au.LJIIIZ("last_group_id", (String) this.LJLJLJ.getValue());
            C78983UzD.LJII(c188727au, Z9N.LIZIZ.LLJLLIL(gv0(), ""));
            FMX.LJIIL("music_play_time", c188727au.LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C187507Xm defaultState() {
        return new C187507Xm(2);
    }

    public final String gv0() {
        return (String) this.LJLJJI.getValue();
    }

    public final void hv0() {
        this.LJLJLLL = SystemClock.elapsedRealtime();
        this.LJLLJ = true;
        MusicModel musicModel = this.LJLJI;
        if (musicModel != null) {
            C47325Ihl c47325Ihl = new C47325Ihl();
            c47325Ihl.LJFF = musicModel.getMusicId();
            if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE || musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
                c47325Ihl.LIZJ = 4;
            }
            Integer auditionDuration = musicModel.getAuditionDuration();
            o.LJIIIIZZ(auditionDuration, "musicModel.auditionDuration");
            c47325Ihl.LIZLLL = auditionDuration.intValue();
            if (musicModel.isPlayUrlValid()) {
                c47325Ihl.LIZIZ = musicModel.getUrl().getUrlList();
            }
            if (C168386jC.LIZ) {
                if (!TextUtils.isEmpty(musicModel.getMusicVolumeInfo())) {
                    c47325Ihl.LJIIIZ = musicModel.getMusicVolumeInfo();
                }
                float LIZIZ = C47130Iec.LIZIZ();
                if (C47130Iec.LIZJ(Float.valueOf(LIZIZ))) {
                    c47325Ihl.LJIIJ = LIZIZ + C168366jA.LIZ.mdpPlaybackLoudnessBias;
                }
            }
            setState(C187527Xo.LJLIL);
            this.LJLLI.LIZIZ(new C62021OVt(this, musicModel));
            this.LJLLI.LIZLLL(c47325Ihl);
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("music_play");
            obtain.setLabelName("single_song");
            C76W c76w = new C76W();
            c76w.LIZ("song_id", musicModel.getMusicId());
            obtain.setJsonObject(c76w.LIZIZ());
            FMX.onEvent(obtain);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CountDownTimerC62023OVv countDownTimerC62023OVv = this.LJLLILLLL;
        if (countDownTimerC62023OVv != null) {
            countDownTimerC62023OVv.cancel();
        }
        this.LJLLILLLL = null;
        this.LJLLI.release();
        this.LJLILLLLZI = null;
    }
}
