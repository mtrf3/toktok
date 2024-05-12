package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJO extends WI1 {
    public int LJIIIZ;
    public int LJIIJ;
    public WI0 LJIIJJI;
    public final C6MP LJIIL;

    @Override // X.WI1
    public final int LJII() {
        return R.string.a2m;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final int LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final int LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIL;
    }

    public WJO(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJIIIZ = R.raw.icon_audio_editing_microphone;
        VLL vll = VLL.SLIDE;
        WJV.LIZ().LJFF();
        this.LJIIJJI = new WI0(vll, 83, false);
        this.LJIIL = C6MP.VOICE_CHANGE;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJJI = wi0;
    }
}
