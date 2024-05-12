package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor;
import com.ss.android.ugc.aweme.feed.api.DetectInterceptor;
import com.ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class F1V {
    public static List LIZ() {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            arrayList.add(new ComplianceEncryptCheckInterceptor());
        }
        arrayList.add(new FeedRetryInterceptorTTNet());
        arrayList.add(new DetectInterceptor());
        arrayList.add(new FetchNetworkInfoInterceptor());
        return arrayList;
    }
}
