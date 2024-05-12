package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Hkr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44969Hkr implements F4V {
    public final ShortVideoContext LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public C44969Hkr(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = shortVideoContext;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            String effectId = t4q.LIZ.getEffectId();
            if (effectId != null && effectId.length() != 0) {
                OSZ[] oszArr = new OSZ[6];
                oszArr[0] = new OSZ("creation_id", this.LJLIL.LJI());
                String str = this.LJLIL.shootWay;
                if (str == null) {
                    str = "";
                }
                oszArr[1] = new OSZ("shoot_way", str);
                oszArr[2] = new OSZ("content_source", this.LJLIL.LIZLLL().getContentSource());
                oszArr[3] = new OSZ("content_type", this.LJLIL.LIZLLL().getContentType());
                oszArr[4] = new OSZ("enter_from", "video_shoot_page");
                oszArr[5] = new OSZ("prop_id", t4q.LIZ.getEffectId());
                C78880UxY.LJJLIIIJL("prop_try", C113554cx.LJJJLZIJ(oszArr));
            }
        }
        return ern.LIZ(session);
    }
}
