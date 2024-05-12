package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WIr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82065WIr extends WI1 {
    public final ShortVideoContext LJIIIZ;
    public WI0 LJIIJ;
    public final int LJIIJJI;
    public final C6MP LJIIL;

    @Override // X.WI1
    public final int LJII() {
        return R.string.fiz;
    }

    @Override // X.WI1
    public final boolean LJIIIZ() {
        if (this.LJIIIZ.isAIEnhanceOn || this.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final int LJ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIL;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJ = wi0;
    }

    public C82065WIr(ShortVideoContext shortVideoContext, boolean z) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJIIIZ = shortVideoContext;
        WJV.LIZ().LJIIIIZZ();
        this.LJIIJ = new WI0(null, 110, !z, 1);
        this.LJIIJJI = R.raw.icon_camera_enhancephoto_fill;
        this.LJIIL = C6MP.AI_ENHANCE;
    }
}
