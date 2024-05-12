package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RVc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69648RVc {
    public static final boolean LIZIZ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return C47261Igj.LJJIJ(Integer.valueOf(LiveNetAdaptiveHurryTimeSetting.DEFAULT)).contains(Integer.valueOf(c109544Rq.getMsgType()));
    }

    public static final BaseResponseComponent LIZJ(RUB rub) {
        TTLComponent tTLComponent;
        RU9 ru9 = rub.ttl;
        if (ru9 != null) {
            Long l = ru9.expired_at;
            if (l == null) {
                l = RU9.DEFAULT_EXPIRED_AT;
            }
            o.LJIIIIZZ(l, "expired_at ?: TTL.DEFAULT_EXPIRED_AT");
            tTLComponent = new TTLComponent(l.longValue());
        } else {
            tTLComponent = new TTLComponent(0);
        }
        List list = rub.context_menu;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        Long l2 = rub.min_version;
        if (l2 == null) {
            l2 = RUB.DEFAULT_MIN_VERSION;
        }
        o.LJIIIIZZ(l2, "min_version ?: BaseResp.DEFAULT_MIN_VERSION");
        long longValue = l2.longValue();
        java.util.Map map = rub.extra;
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        return new BaseResponseComponent(tTLComponent, list, longValue, map);
    }

    public static final boolean LIZ(BaseResponseComponent baseResponseComponent, C47X action) {
        o.LJIIIZ(action, "action");
        switch (C47W.LIZ[action.ordinal()]) {
            case 1:
                return baseResponseComponent.contentMenus.contains("delete");
            case 2:
                return baseResponseComponent.contentMenus.contains("digg");
            case 3:
                return baseResponseComponent.contentMenus.contains("report");
            case 4:
                return baseResponseComponent.contentMenus.contains("reply");
            case 5:
                return baseResponseComponent.contentMenus.contains("forward");
            case 6:
                return baseResponseComponent.contentMenus.contains("reaction");
            default:
                throw new C162476Zf();
        }
    }
}
