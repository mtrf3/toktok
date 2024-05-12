package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RsB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70903RsB extends AbstractC70995Rtf {
    public final String LJIIIIZZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq(WM7.SCENE_SERVICE, new C71008Rts[0]));
    }

    public C70903RsB(String str) {
        super("rd_tiktokec_use_check", "lib_track_builtin_lane_rd");
        this.LJIIIIZZ = str;
    }

    @Override // X.AbstractC70995Rtf
    public final void LJFF(LaneParams params) {
        o.LJIIIZ(params, "params");
        params.put(WM7.SCENE_SERVICE, this.LJIIIIZZ);
    }
}
