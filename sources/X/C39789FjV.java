package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FjV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39789FjV extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "livewallpaper");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) LocalLiveWallPaperActivity.class);
        intent.putExtra("from", UriProtector.getQueryParameter(uri, "from"));
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null && encodedQuery.length() != 0) {
            Iterator it = s.LJLJJL(encodedQuery, new String[]{"&"}, 0, 6).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
                if (LJLJJL.size() == 2 && o.LJ(ListProtector.get(LJLJJL, 0), "is_first_install_launch")) {
                    intent.putExtra("is_first_install_launch", o.LJ(ListProtector.get(LJLJJL, 1), "true"));
                    break;
                }
            }
        }
        return intent;
    }
}
