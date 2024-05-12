package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82047WHz extends WI1 {
    public final InterfaceC82086WJm LJIIIZ;
    public WI0 LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public final int LJI() {
        return R.drawable.az5;
    }

    @Override // X.WI1
    public final int LJII() {
        return R.string.f0n;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJ = wi0;
    }

    public C82047WHz(InterfaceC82086WJm cameraApiComponent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJIIIZ = cameraApiComponent;
        this.LJIIJ = new WI0(VLL.SLIDE, WJV.LIZ().LJIIIZ(), !shortVideoContext.LJJJI());
        this.LJIIJJI = C6MP.DUET_LAYOUT;
    }
}
