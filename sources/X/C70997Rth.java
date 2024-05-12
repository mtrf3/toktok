package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rth, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70997Rth extends AbstractC70875Rrj {
    public final String LJIIIIZZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq(WM7.SCENE_SERVICE, new C71008Rts[0]), new C71006Rtq("rule", new C71008Rts[0]), new C71006Rtq("path", new C71008Rts[0]), new C71006Rtq("source", new C71008Rts[0]), new C71006Rtq("type", new C71008Rts[0]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70997Rth(String rule) {
        super("ec_params_rule_process_error", "lib_track_builtin_lane_rd");
        o.LJIIIZ(rule, "rule");
        this.LJIIIIZZ = rule;
    }
}
