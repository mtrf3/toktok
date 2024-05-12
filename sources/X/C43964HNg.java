package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;

/* renamed from: X.HNg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43964HNg implements I0Z {
    public final /* synthetic */ I0V LIZ;

    public C43964HNg(I0V i0v) {
        this.LIZ = i0v;
    }

    @Override // X.I0Z
    public final void LIZ(boolean z) {
        ((ShortVideoContextViewModel) ((ViewModelProvider) this.LIZ.LJLLLLLL.getValue()).get(ShortVideoContextViewModel.class)).LJLIL.cameraComponentModel.duetContext.successEnableAEC = z;
        ((ShortVideoContextViewModel) ((ViewModelProvider) this.LIZ.LJLLLLLL.getValue()).get(ShortVideoContextViewModel.class)).LJLIL.creativeModel.audioAlgorithmModel.isAECOn = z;
    }

    @Override // X.I0Z
    public final void LIZIZ(boolean z, String str, int i, Exception exc) {
        String LJII;
        int i2 = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", String.valueOf(i));
        if (exc == null) {
            LJII = "";
        } else {
            LJII = J7I.LJII(exc);
        }
        c6bk.LIZ.put("exception", LJII);
        C43882HKc.LIZLLL(i2, "download_aec_model", c6bk.LJ(), true);
    }
}
