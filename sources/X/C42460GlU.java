package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import kotlin.jvm.internal.o;

/* renamed from: X.GlU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42460GlU extends M56 {
    public final String LIZ = "ban_music";

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "openVideoEditPage");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "type");
        if (!TextUtils.isEmpty(queryParameter) && o.LJ(queryParameter, this.LIZ)) {
            String queryParameter2 = UriProtector.getQueryParameter(uri, "item_id");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            String str = "from_promote";
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "from_promote"))) {
                PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
                C42622Go6.LJIIJ(uri);
            } else {
                str = "";
            }
            if (queryParameter2 != null) {
                Aweme i6 = AwemeService.LIZ().i6(queryParameter2);
                if (i6 != null && i6.isPhotoMode()) {
                    ReplaceMusicDownloadService.LIZJ().LIZ(activity, i6);
                    return;
                } else {
                    ReplaceMusicDownloadService.LIZJ().LIZIZ(activity, queryParameter2, str);
                    return;
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
