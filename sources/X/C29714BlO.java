package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.BlO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29714BlO {
    public static final /* synthetic */ int LIZJ = 0;
    public final java.util.Map<String, String> LIZ = new HashMap();
    public final Uri.Builder LIZIZ = C0F1.LIZ("sslocal");

    public final android.net.Uri LIZ() {
        ((HashMap) this.LIZ).put("__live_platform__", "webcast");
        ((HashMap) this.LIZ).put("target_handler", "webcast");
        return LIZLLL();
    }

    public final android.net.Uri LIZLLL() {
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            this.LIZIZ.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        android.net.Uri build = this.LIZIZ.build();
        o.LJIIIIZZ(build, "builder.build()");
        return build;
    }

    public final String LIZIZ(String str) {
        return (String) ((HashMap) this.LIZ).get(str);
    }

    public final boolean LIZJ(String str) {
        boolean z;
        String LIZIZ = LIZIZ(str);
        if (LIZIZ == null || ujb.o.LJJJJJL(LIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final void LJ(int i) {
        String containerBgColor = C40691Fy3.LIZ(i);
        o.LJIIIZ(containerBgColor, "containerBgColor");
        ((HashMap) this.LIZ).put("container_bg_color", containerBgColor);
    }

    public C29714BlO LJFF(String fallbackUrl) {
        o.LJIIIZ(fallbackUrl, "fallbackUrl");
        ((HashMap) this.LIZ).put("fallback_url", fallbackUrl);
        return this;
    }

    public C29714BlO LJI(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) this.LIZ).put("hide_loading", str);
        return this;
    }

    public C29714BlO LJII(String url) {
        o.LJIIIZ(url, "url");
        ((HashMap) this.LIZ).put("url", url);
        return this;
    }

    public C29714BlO LJIIIIZZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        ((HashMap) this.LIZ).put(key, value);
        return this;
    }
}
