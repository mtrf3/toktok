package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJM extends WI1 {
    public final ShortVideoContext LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public WI0 LJIILIIL;
    public final C6MP LJIILJJIL;

    @Override // X.WI1
    public final int LJII() {
        return R.string.i4n;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIILIIL;
    }

    @Override // X.WI1
    public final int LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.WI1
    public final int LJ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final int LJFF() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final int LJI() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    public WJM(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJIIIZ = shortVideoContext;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        this.LJIILIIL = new WI0(VLL.SLIDE, WJV.LIZ().LJIIJ(), !V16.LJJLIIIJILLIZJL(shortVideoContext));
        this.LJIILJJIL = C6MP.MICROPHONE;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIILIIL = wi0;
    }
}
