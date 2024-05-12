package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.XVv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84955XVv implements InterfaceC84870XSo {
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LIZ;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        this.LIZIZ.onNext(new C84767XOp(null, null, -108, null, null, null, null, 123));
        this.LIZIZ.onComplete();
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        if (C52265KfF.LIZ) {
            this.LIZ.onNext(new C84768XOq(-100, -102, null, 0L, null, 28));
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        this.LIZIZ.onNext(new C84767XOp(null, null, -103, error, null, null, null, 115));
        this.LIZIZ.onComplete();
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        if (C52265KfF.LIZ) {
            this.LIZ.onNext(new C84768XOq(-100, i, null, 0L, null, 28));
        }
    }

    public C84955XVv(AbstractC73851Syd abstractC73851Syd, C73433Srt c73433Srt) {
        this.LIZ = abstractC73851Syd;
        this.LIZIZ = c73433Srt;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZIZ.onNext(new C84767XOp(musicFile, musicWaveBean, 100, null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT));
        this.LIZIZ.onComplete();
    }
}
