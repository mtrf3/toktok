package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148375s1 extends WI1 {
    public final C6MP LJIIIZ;
    public WI0 LJIIJ;

    @Override // X.WI1
    public final int LJ() {
        return R.raw.icon_templates_cards;
    }

    @Override // X.WI1
    public final int LJII() {
        if (C00F.LIZ(31744, 0, "autocut_edit_entrance_name", true) == 1) {
            return R.string.e23;
        }
        return R.string.e1v;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIIZ;
    }

    public C148375s1(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LJIIIZ = C6MP.AUTO_CUT;
        C151975xp.LIZ(model);
        this.LJIIJ = new WI0(null, -10, false, 5);
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJ = wi0;
    }
}
