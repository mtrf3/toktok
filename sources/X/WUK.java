package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class WUK {
    public static final float LJIIZILJ = C5P9.LIZIZ();
    public static final float LJIJ;
    public static final float LJIJI;
    public static final float LJIJJ;
    public View LIZ;
    public C173616rd LIZIZ;
    public C173616rd LIZJ;
    public TextView LIZLLL;
    public TextView LJ;
    public View LJFF;
    public ActivityC45651qj LJI;
    public boolean LJIIIZ;
    public final VideoPublishEditModel LJIIJ;
    public WUP LJIIJJI;
    public WUN LJIIL;
    public InterfaceC45540Hu4 LJIILIIL;
    public int LJII = (int) (LJIJI * 100.0f);
    public int LJIIIIZZ = (int) (LJIIZILJ * 100.0f);
    public final WUO LJIILJJIL = new C5HC() { // from class: X.WUO
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            WUN wun;
            WUK wuk = WUK.this;
            if (i == 4) {
                if (wuk.LJIIIZ && (wun = wuk.LJIIL) != null) {
                    wun.LIZ();
                    return true;
                }
            } else {
                wuk.getClass();
            }
            return false;
        }
    };
    public View LJIILL = null;
    public boolean LJIILLIIL = false;

    public final void LIZJ() {
        WUN wun = this.LJIIL;
        if (wun != null) {
            wun.LIZ();
        }
        try {
            C43882HKc.LIZ.LJIILLIIL("aweme_short_video_volume_set", null, new JSONObject().put("mVoiceVolume", this.LJIIIIZZ).put("mMusicVolume", this.LJII));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    static {
        float f;
        float f2 = 1.0f;
        if (C5P9.LIZ()) {
            f = 1.0f;
        } else {
            f = 2.0f;
        }
        LJIJ = f;
        LJIJI = C5P9.LIZIZ();
        if (!C5P9.LIZ()) {
            f2 = 2.0f;
        }
        LJIJJ = f2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.WUO] */
    public WUK(VideoPublishEditModel videoPublishEditModel) {
        this.LJIIJ = videoPublishEditModel;
    }

    public final void LIZ(boolean z) {
        C173616rd c173616rd;
        float f;
        if (this.LJIIIZ && (c173616rd = this.LIZJ) != null) {
            c173616rd.setEnabled(z);
            C173616rd c173616rd2 = this.LIZJ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            c173616rd2.setAlpha(f);
            if (!z) {
                this.LIZJ.setProgress(0);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        AudioRecorderParam audioRecorderParam;
        C173616rd c173616rd;
        float f;
        float f2 = 1.0f;
        if (this.LJIIIZ && (c173616rd = this.LIZIZ) != null) {
            c173616rd.setEnabled(z);
            C173616rd c173616rd2 = this.LIZIZ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            c173616rd2.setAlpha(f);
            if (!z) {
                this.LIZIZ.setProgress(0);
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        if (videoPublishEditModel != null && (audioRecorderParam = videoPublishEditModel.veAudioRecorderParam) != null && this.LIZIZ != null) {
            if (!audioRecorderParam.getNeedOriginalSound()) {
                this.LIZIZ.setEnabled(false);
                this.LIZIZ.setAlpha(0.5f);
            } else if (!this.LJIIJ.hasOriginalSound(HRX.LIZLLL()) || this.LJIIJ.isMuted) {
                this.LIZIZ.setEnabled(false);
                this.LIZIZ.setAlpha(0.5f);
            } else {
                this.LIZIZ.setEnabled(z);
                C173616rd c173616rd3 = this.LIZIZ;
                if (!z) {
                    f2 = 0.5f;
                }
                c173616rd3.setAlpha(f2);
            }
            if (this.LJIIJ.getMMusicPath() != null) {
                this.LJII = (int) (this.LJIIJ.musicVolume * 100.0f);
            }
            this.LIZIZ.setProgress((int) (this.LJIIJ.voiceVolume * 100.0f));
        }
    }

    public final void LIZLLL(boolean z) {
        if (!this.LJIIIZ) {
            return;
        }
        if (z) {
            View view = this.LIZ;
            if (view != null) {
                view.setVisibility(0);
                this.LIZ.setTranslationY(C170576mj.LIZ(this.LJI, 400.0f));
                this.LIZ.animate().translationY(0.0f).setDuration(400L).start();
            }
            InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJIILIIL;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LJIILJJIL);
                this.LJIILIIL.registerActivityOnKeyDownListener(this.LJIILJJIL);
                return;
            }
            return;
        }
        View view2 = this.LIZ;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        InterfaceC45540Hu4 interfaceC45540Hu42 = this.LJIILIIL;
        if (interfaceC45540Hu42 == null) {
            return;
        }
        interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(this.LJIILJJIL);
    }
}
