package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHZ extends WI1 {
    public int LJIIIZ;
    public WI0 LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public final int LJII() {
        return R.string.gij;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final int LJ() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    public WHZ(ShortVideoContext shortVideoContext, boolean z) {
        VLL vll;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJIIIZ = WI2.LIZIZ(0);
        if (z) {
            vll = VLL.FIXED;
        } else if (C52533KjZ.LIZ() == 1) {
            vll = VLL.FIXED;
        } else {
            vll = VLL.SLIDE;
        }
        WJV.LIZ().LIZIZ();
        this.LJIIJ = new WI0(vll, LiveTryModeCountDownThresholdSetting.DEFAULT, false, 4);
        this.LJIIJJI = C6MP.FLASH;
    }
}
