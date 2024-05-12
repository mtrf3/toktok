package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.FjW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39790FjW extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "feedback_record");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "enter_from");
        if (queryParameter == null) {
            queryParameter = "";
        }
        C86034Xpe.LIZIZ.startFeedbackRecordActivity(activity, queryParameter, null);
    }
}
