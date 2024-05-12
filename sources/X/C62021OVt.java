package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.OVt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62021OVt implements InterfaceC47330Ihq {
    public final /* synthetic */ MusicPlayViewModel LIZ;
    public final /* synthetic */ MusicModel LIZIZ;

    public C62021OVt(MusicPlayViewModel musicPlayViewModel, MusicModel musicModel) {
        this.LIZ = musicPlayViewModel;
        this.LIZIZ = musicModel;
    }

    @Override // X.InterfaceC47330Ihq
    public final void LIZ(int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.LIZ.LJLL = SystemClock.elapsedRealtime();
        MusicPlayViewModel musicPlayViewModel = this.LIZ;
        MusicModel musicModel = this.LIZIZ;
        CountDownTimerC62023OVv countDownTimerC62023OVv = musicPlayViewModel.LJLLILLLL;
        if (countDownTimerC62023OVv != null) {
            countDownTimerC62023OVv.cancel();
        }
        int duration = musicModel.getDuration();
        Integer auditionDuration = musicModel.getAuditionDuration();
        if (auditionDuration == null || duration != auditionDuration.intValue()) {
            long realAuditionDuration = musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MusicDetailFragment: audition_duration is zero, music id: ");
                LIZ.append(musicModel.getMusicId());
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
            } else {
                CountDownTimerC62023OVv countDownTimerC62023OVv2 = new CountDownTimerC62023OVv(realAuditionDuration, musicPlayViewModel);
                musicPlayViewModel.LJLLILLLL = countDownTimerC62023OVv2;
                countDownTimerC62023OVv2.start();
            }
        }
        MusicPlayViewModel musicPlayViewModel2 = this.LIZ;
        if (!musicPlayViewModel2.LJLLJ) {
            musicPlayViewModel2.LJLLI.pause();
        }
        this.LIZ.setState(C62022OVu.LJLIL);
        C50652JuK.Companion.getClass();
        C50321Joz LIZIZ = C50651JuJ.LIZIZ();
        if (LIZIZ != null) {
            str = LIZIZ.getSearchId();
            str2 = LIZIZ.getSearchKeyword();
        } else {
            str = null;
            str2 = null;
        }
        java.util.Map<String, String> LLLLIILL = SearchServiceImpl.LLLZI().LLLLIILL();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", this.LIZIZ.getMusicId());
        String str5 = "share_from_resso";
        if (!o.LJ("share_from_resso", this.LIZ.gv0())) {
            str5 = "single_song";
        }
        c188727au.LJIIIZ("enter_from", str5);
        c188727au.LJIIIZ("previous_page_position", (String) this.LIZ.LJLJL.getValue());
        c188727au.LJIIIZ("search_type", LLLLIILL.get("searchType"));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(LLLLIILL.get("imprId")));
        c188727au.LJIIIZ("impr_id", LLLLIILL.get("imprId"));
        c188727au.LJIIIZ("search_id", LLLLIILL.get("searchId"));
        c188727au.LJIIIZ("search_id_x", str);
        c188727au.LJIIIZ("search_result_id", LLLLIILL.get("searchResultId"));
        c188727au.LJIIIZ("search_keyword", LLLLIILL.get("searchKeyword"));
        c188727au.LJIIIZ("search_keyword_x", str2);
        c188727au.LJIIIZ("process_id", (String) this.LIZ.LJLJJL.getValue());
        c188727au.LJIIIZ("enter_method", "click_play_music");
        if (((Boolean) this.LIZ.LJLJJLL.getValue()).booleanValue()) {
            str3 = "panel";
        } else {
            str3 = "detail";
        }
        c188727au.LJIIIZ("page_model", str3);
        Music music = this.LIZIZ.getMusic();
        if (music != null && music.isNewRelease()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("music_new_flag", str4);
        float LIZ2 = C47130Iec.LIZ(this.LIZIZ.getMusicVolumeInfo());
        if (C47130Iec.LIZJ(Float.valueOf(LIZ2))) {
            c188727au.LIZIZ(LIZ2, "bgm_volume_difference_with_feed_db");
        }
        C78983UzD.LJII(c188727au, Z9N.LIZIZ.LLJLLIL(this.LIZ.gv0(), ""));
        FMX.LJIIL("play_music", c188727au.LIZ);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ.LJLJLLL;
        String musicId = this.LIZIZ.getMusicId();
        String str6 = (String) this.LIZ.LJLJJL.getValue();
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "single_song");
        c188727au2.LJIIIZ("enter_method", "click_play_music");
        c188727au2.LJIIIZ("music_id", musicId);
        c188727au2.LJIIIZ("process_id", str6);
        c188727au2.LJ(elapsedRealtime, "duration");
        FMX.LJIIL("play_music_initiate_duration", c188727au2.LIZ);
    }
}
