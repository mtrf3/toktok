package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M55 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (ujb.o.LJJJJIZL("chatting", host, true) && ujb.o.LJJJJIZL("/message", path, true)) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        OpenChatExt.LIZJ(activity, UriProtector.getQueryParameter(uri, "uid"), UriProtector.getQueryParameter(uri, "ext"), null);
    }
}
