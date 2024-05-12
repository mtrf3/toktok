package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* renamed from: X.Jeh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49683Jeh implements InterfaceC47330Ihq {
    public final /* synthetic */ MusicPlayHelper LIZ;
    public final /* synthetic */ Music LIZIZ;

    public C49683Jeh(MusicPlayHelper musicPlayHelper, Music music) {
        this.LIZ = musicPlayHelper;
        this.LIZIZ = music;
    }

    @Override // X.InterfaceC47330Ihq
    public final void LIZ(int i, int i2) {
        MusicPlayHelper musicPlayHelper = this.LIZ;
        Music music = this.LIZIZ;
        musicPlayHelper.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "remove_15s_cap_music", true, true)) {
            CountDownTimerC49686Jek countDownTimerC49686Jek = musicPlayHelper.LJLJJI;
            if (countDownTimerC49686Jek != null) {
                countDownTimerC49686Jek.cancel();
            }
            if (music.getDuration() != music.getRealAuditionDuration()) {
                long realAuditionDuration = music.getRealAuditionDuration() * 1000;
                if (realAuditionDuration <= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MusicPlayHelper: audition_duration is zero, music id: ");
                    LIZ.append(music.getId());
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                } else {
                    CountDownTimerC49686Jek countDownTimerC49686Jek2 = new CountDownTimerC49686Jek(realAuditionDuration, musicPlayHelper);
                    musicPlayHelper.LJLJJI = countDownTimerC49686Jek2;
                    countDownTimerC49686Jek2.start();
                }
            }
        }
        this.LIZ.LJLIL.setValue(new OSZ<>(2, Long.valueOf(this.LIZIZ.getId())));
    }
}
