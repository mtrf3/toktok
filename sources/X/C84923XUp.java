package X;

import Y.ARunnableS14S0210000_15;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS21S0110000_15;
import Y.ARunnableS26S0300000_15;
import Y.ARunnableS3S0111000_15;
import Y.IDgS140S0200000_15;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;

/* renamed from: X.XUp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84923XUp implements InterfaceC84926XUs {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ C84913XUf LJFF;

    @Override // X.InterfaceC84926XUs
    public final void LIZIZ(C84767XOp c84767XOp) {
        ExceptionResult exceptionResult;
        Activity activity;
        if (e1.LIZ(31744, "studio_music_shoot_same_unlogin_optimization", true, false) && (exceptionResult = c84767XOp.LJI) != null && 2012 == exceptionResult.getErrorCode()) {
            Activity activity2 = this.LJFF.LIZLLL;
            if (activity2 != null) {
                activity2.runOnUiThread(new ARunnableS21S0110000_15(this, this.LIZIZ, 3));
            }
            if (!((RBX) HG3.LJIILL()).isLogin() && (activity = this.LJFF.LIZLLL) != null && !activity.isFinishing()) {
                J9P.LIZIZ(this.LJFF.LIZLLL, "music_detail", "click_shoot", null, new IDgS140S0200000_15(this, c84767XOp, 0));
                return;
            }
            return;
        }
        LJFF(c84767XOp, this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ);
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZLLL(Effect effect) {
        this.LJFF.LJII = effect;
    }

    @Override // X.InterfaceC84926XUs
    public final void LJ(C84767XOp c84767XOp) {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_failed", "stage"));
        C84913XUf c84913XUf = this.LJFF;
        c84913XUf.LJII = null;
        Activity activity = c84913XUf.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS21S0110000_15(this, this.LIZIZ, 2));
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void onStart(Effect effect) {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_start", "stage"));
        Activity activity = this.LJFF.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS14S0210000_15(this.LIZ, this, this.LIZIZ, 5));
            this.LJFF.LJ.LLJJLIIIJLLLLLLLZ(this.LIZ);
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZ(Effect effect, String str) {
        Activity activity;
        Activity activity2;
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_skip", "stage"));
        if (this.LJFF.LJ == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C84913XUf c84913XUf = this.LJFF;
            c84913XUf.LJII = null;
            if (c84913XUf.LJ.LJLIL() && (activity2 = this.LJFF.LIZLLL) != null) {
                activity2.runOnUiThread(new ARunnableS18S0201000_15(1, this, this.LIZ, 7));
                return;
            }
            return;
        }
        C84913XUf c84913XUf2 = this.LJFF;
        Effect effect2 = c84913XUf2.LJII;
        c84913XUf2.LJII = null;
        if (effect == null) {
            effect = effect2;
            if (effect2 == null) {
                AVExternalServiceImpl.LIZ().abilityService().effectService().buildEffectPlatform(this.LJFF.LIZLLL, new C84922XUo(this, str), null);
                return;
            }
        }
        if (c84913XUf2.LJ.LJLIL() && (activity = this.LJFF.LIZLLL) != null) {
            activity.runOnUiThread(new ARunnableS26S0300000_15(this, effect, this.LIZ, 2));
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZJ(int i, Effect effect, Long l) {
        Activity activity = this.LJFF.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS3S0111000_15(this, i, this.LIZIZ, 4));
        }
    }

    public final void LJFF(C84767XOp c84767XOp, final MusicModel musicModel, final boolean z, final int i, long j) {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_success", "stage"));
        this.LJFF.LJII = null;
        final String str = c84767XOp.LIZ;
        if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO && (musicModel.getDuration() <= 0 || musicModel.getShootDuration().intValue() <= 0)) {
            int intValue = AVExternalServiceImpl.LIZ().vesdkService().getAudioFileInfo(str).getDuration().intValue();
            musicModel.setDuration(intValue);
            musicModel.setShootDuration(Integer.valueOf(intValue));
        }
        final MusicWaveBean musicWaveBean = c84767XOp.LIZIZ;
        C84913XUf c84913XUf = this.LJFF;
        c84913XUf.LJI = c84767XOp.LJ;
        if (!c84913XUf.LJ.LJLIL()) {
            return;
        }
        Activity activity = this.LJFF.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: X.XUr
                @Override // java.lang.Runnable
                public final void run() {
                    C84923XUp c84923XUp = C84923XUp.this;
                    boolean z2 = z;
                    MusicModel musicModel2 = musicModel;
                    MusicWaveBean musicWaveBean2 = musicWaveBean;
                    String str2 = str;
                    int i2 = i;
                    c84923XUp.LJFF.LJ.LLLLZLL(z2, false);
                    musicModel2.setMusicWaveBean(musicWaveBean2);
                    musicModel2.setDownloadComplete(true);
                    c84923XUp.LJFF.LJ.LLJILLL(str2, musicModel2, i2);
                }
            });
        }
        C84913XUf.LJI(System.currentTimeMillis() - j, str);
    }

    public C84923XUp(C84913XUf c84913XUf, MusicModel musicModel, boolean z, String str, int i, long j) {
        this.LJFF = c84913XUf;
        this.LIZ = musicModel;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
