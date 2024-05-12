package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RsD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70905RsD extends AbstractC70875Rrj {
    public final String LJIIIIZZ;
    public final long LJIIIZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq(WM7.SCENE_SERVICE, new C71008Rts[0]), new C71006Rtq("path", new C71008Rts[0]), new C71006Rtq("source", new C71008Rts[0]), new C71006Rtq("result", new C71008Rts[0]), new C71006Rtq("errors", new C71008Rts[0]), new C71006Rtq("cost_time", new C71008Rts[0]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70905RsD(String scene, long j) {
        super("ec_params_rule_verification_result", "lib_track_builtin_lane_rd");
        o.LJIIIZ(scene, "scene");
        this.LJIIIIZZ = scene;
        this.LJIIIZ = j;
    }
}
