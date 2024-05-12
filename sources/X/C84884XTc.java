package X;

import android.app.ProgressDialog;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: X.XTc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84884XTc implements InterfaceC84870XSo {
    public final /* synthetic */ ProgressDialog LIZ;
    public final /* synthetic */ M5G LIZIZ;
    public final /* synthetic */ Music LIZJ;
    public final /* synthetic */ MusicService LIZLLL;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        ProgressDialog progressDialog = this.LIZ;
        if (progressDialog == null || new C03880Dg(2).LIZJ(300000, "android/app/ProgressDialog", "show", progressDialog, new Object[0], "void", new C65300Pk0(false, "()V", "9055240804045678611")).LIZ) {
            return;
        }
        progressDialog.show();
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX xsx) {
        ProgressDialog progressDialog = this.LIZ;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        M5G m5g = this.LIZIZ;
        if (m5g != null) {
            m5g.onFailed(xsx);
        }
        this.LIZLLL.LIZIZ = null;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        MusicModel musicModel;
        ProgressDialog progressDialog = this.LIZ;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (this.LIZIZ != null) {
            try {
                Music music = this.LIZJ;
                if (music != null) {
                    musicModel = music.convertToMusicModel();
                } else {
                    musicModel = null;
                }
                this.LIZIZ.onSuccess(musicModel, str);
            } catch (Exception e) {
                this.LIZIZ.onFailed(e);
            }
        }
        this.LIZLLL.LIZIZ = null;
    }

    public C84884XTc(MusicService musicService, ProgressDialog progressDialog, M5G m5g, Music music) {
        this.LIZLLL = musicService;
        this.LIZ = progressDialog;
        this.LIZIZ = m5g;
        this.LIZJ = music;
    }
}
