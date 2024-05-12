package X;

import Y.AfS53S0100000_1;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lw3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55855Lw3 extends M56 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C55856Lw4.LJLIL);

    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "live";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "live");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        long j;
        Long LJJIZ;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        ((M6Y) this.LIZ.getValue()).LIZIZ("before_parse_url");
        if (z) {
            User user = new User();
            user.setUid(UriProtector.getQueryParameter(uri, "user_id"));
            String queryParameter = UriProtector.getQueryParameter(uri, "room_id");
            if (queryParameter != null && (LJJIZ = C38350F3i.LJJIZ(queryParameter)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            user.roomId = j;
            LiveOuterService.LJJJLL().getLiveStateManager().LJIIIIZZ(user, new AfS53S0100000_1(user, 19), "");
        }
        C55839Lvn.LIZLLL(UriProtector.getQueryParameter(uri, "user_id"), uri);
        HashMap hashMap = new HashMap();
        hashMap.put("from_notification", String.valueOf(z));
        if (LiveOuterService.LJJJLL().LJJIJIL().handleWithoutHost(activity, uri, hashMap)) {
            M62.LIZIZ.LIZIZ(uri, "live", z);
            return null;
        }
        return new Intent(activity, (Class<?>) MainActivity.class);
    }
}
