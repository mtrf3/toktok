package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;

/* loaded from: classes9.dex */
public final class IY6 implements IY4 {
    @Override // X.IY4
    public final /* synthetic */ boolean LIZ() {
        return true;
    }

    @Override // X.IY4
    public final String getName() {
        return "PersonalVideoLocalUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        IYI iyi = iy5.LIZJ;
        String LIZIZ = LocalVideoPlayerManager.LIZLLL().LIZIZ(C51029K0z.LJJJJLL(iyi.LIZ));
        if (!TextUtils.isEmpty(LIZIZ)) {
            H7B.LIZ("LocalVideoCache=>play subtitle using cache,filePath:" + LIZIZ);
            IY0 iy0 = new IY0(LIZIZ);
            if (C00F.LIZ(31744, 1, "force_software_play", true) == 1) {
                iy0.LIZLLL = true;
            }
            return iy0;
        }
        return iy5.LIZIZ(iyi);
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        IYH iyh = iy5.LIZIZ;
        String LIZIZ = LocalVideoPlayerManager.LIZLLL().LIZIZ(C51029K0z.LJJJJZ(iyh.LIZ));
        if (!TextUtils.isEmpty(LIZIZ)) {
            H7B.LIZ("LocalVideoCache=>play video using cache,filePath:" + LIZIZ);
            IY0 iy0 = new IY0(LIZIZ);
            if (C00F.LIZ(31744, 1, "force_software_play", true) == 1) {
                iy0.LIZLLL = true;
            }
            return iy0;
        }
        return iy5.LIZ(iyh);
    }
}
