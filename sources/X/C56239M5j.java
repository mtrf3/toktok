package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.M5j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56239M5j extends AbstractC56238M5i {
    @Override // X.AbstractC56238M5i
    public final void LIZ(android.net.Uri uri) {
        Intent intent;
        Bundle LLJJIJI;
        String LLJJIJIIJIL;
        M5X m5x = this.LIZ;
        if (((m5x != null && (intent = m5x.LJLJI) != null) || (intent = C56251M5v.LIZLLL) != null) && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "android.intent.extra.REFERRER");
            if ((LLJJIII != null && (LLJJIJIIJIL = LLJJIII.toString()) != null) || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "android.intent.extra.REFERRER_NAME")) != null) {
                android.net.Uri parse = UriProtector.parse(LLJJIJIIJIL);
                o.LJIIIIZZ(parse, "parse(refUrl)");
                String host = parse.getHost();
                if (host != null) {
                    if (s.LJJJLZIJ(host, "google", false)) {
                        C56251M5v.LJ = "seo.google";
                        return;
                    }
                    if (s.LJJJLZIJ(host, "yahoo", false)) {
                        C56251M5v.LJ = "seo.yahoo";
                        return;
                    }
                    if (s.LJJJLZIJ(host, "yandex", false)) {
                        C56251M5v.LJ = "seo.yandex";
                        return;
                    }
                    if (s.LJJJLZIJ(host, "bing", false)) {
                        C56251M5v.LJ = "seo.bing";
                    } else if (s.LJJJLZIJ(host, "duckduckgo", false)) {
                        C56251M5v.LJ = "seo.duckduckgo";
                    } else {
                        C56251M5v.LJ = "seo.unknown";
                    }
                }
            }
        }
    }
}
