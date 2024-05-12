package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.9gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243039gJ {
    public static final void LIZ(Context context, LiveEventStruct event) {
        o.LJIIIZ(event, "event");
        String LIZJ = C31461Li.LIZJ("live_event_detail_format", "", "getInstance().getStringV…entDetailUrl::class.java)");
        if (context == null || TextUtils.isEmpty(LIZJ)) {
            return;
        }
        C38281F0r c38281F0r = new C38281F0r("sslocal://webcast_webview");
        c38281F0r.LIZ(1, "hide_nav_bar");
        c38281F0r.LIZ(1, "hide_status_bar");
        C38281F0r c38281F0r2 = new C38281F0r(LIZJ);
        c38281F0r2.LIZLLL("event_id", event.getId());
        c38281F0r2.LIZLLL("live_event_enter_from", "live_event_card");
        c38281F0r.LIZLLL("url", c38281F0r2.LJ());
        LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(context, UriProtector.parse(c38281F0r.LJ()));
    }
}
