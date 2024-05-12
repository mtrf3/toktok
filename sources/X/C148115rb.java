package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148115rb extends WI1 {
    public WI0 LJIIIZ;
    public final C6MP LJIIJ;

    @Override // X.WI1
    public final int LJ() {
        return R.raw.icon_closed_caption_fill;
    }

    @Override // X.WI1
    public final int LJII() {
        return R.string.bwy;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJ;
    }

    public C148115rb(VideoPublishEditModel model) {
        int i;
        o.LJIIIZ(model, "model");
        if (C151975xp.LIZ(model)) {
            i = 80;
        } else {
            i = 90;
        }
        this.LJIIIZ = new WI0(null, i, false, 5);
        this.LJIIJ = C6MP.CAPTION;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIIZ = wi0;
    }
}
