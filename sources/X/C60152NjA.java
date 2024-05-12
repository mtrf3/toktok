package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.NjA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60152NjA implements InterfaceC84870XSo {
    public Long LIZ;
    public final /* synthetic */ C60148Nj6 LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        this.LIZ = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public C60152NjA(C60148Nj6 c60148Nj6, MusicModel musicModel) {
        this.LIZIZ = c60148Nj6;
        this.LIZJ = musicModel;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(musicFile, "musicFile");
        Context context = this.LIZIZ.LIZJ;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            LJJIFFI.runOnUiThread(new RunnableC60151Nj9(this.LIZJ, musicWaveBean, this.LIZIZ, musicFile, this));
        }
    }
}
