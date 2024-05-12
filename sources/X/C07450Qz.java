package X;

import android.content.pm.PackageInfo;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.0Qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07450Qz {
    public static final /* synthetic */ int LIZ = 0;

    static {
        UriProtector.parse("*");
        UriProtector.parse("");
    }

    public static PackageInfo LIZ() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }
}
