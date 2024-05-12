package X;

import Y.IDLCallbackS107S0200000_9;
import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.M4w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56226M4w extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "publishVideo");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        AVExternalServiceImpl.LIZ().asyncService(activity, "deep_link_publish_video", new IDLCallbackS107S0200000_9(activity, uri, 0));
    }
}
