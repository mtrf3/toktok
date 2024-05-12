package X;

import Y.ARunnableS17S0101000_13;
import Y.ARunnableS17S0201000_14;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS1S1301000_15;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: X.XUq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84924XUq implements InterfaceC84870XSo {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C84913XUf LIZLLL;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_start", "stage"));
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS17S0201000_14(3, this, this.LIZ, 10));
            this.LIZLLL.LJ.LLJJLIIIJLLLLLLLZ(this.LIZ);
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX xsx) {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_failed", "stage"));
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS17S0101000_13(3, this, 11));
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS18S0101000_14(i, this, 18));
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        FMX.LJIILL("music_detail_trace", new OSZ("music_download_success", "stage"));
        if (!this.LIZLLL.LJ.LJLIL()) {
            return;
        }
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS1S1301000_15(this, this.LIZ, musicWaveBean, str, this.LIZIZ, 0));
        }
        C84913XUf.LJI(System.currentTimeMillis() - this.LIZJ, str);
    }

    public C84924XUq(C84913XUf c84913XUf, MusicModel musicModel, int i, long j) {
        this.LIZLLL = c84913XUf;
        this.LIZ = musicModel;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
