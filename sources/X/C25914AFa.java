package X;

import android.net.Uri;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.AFa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25914AFa {
    public static void LIZ(InterfaceC25921AFh interfaceC25921AFh, String url, String str, Boolean bool, Boolean bool2) {
        String str2;
        o.LJIIIZ(url, "url");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", url);
        Boolean bool3 = Boolean.TRUE;
        boolean LJ = o.LJ(bool, bool3);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (LJ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("hide_nav_bar", str2);
        if (o.LJ(bool2, bool3)) {
            str3 = "1";
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("hide_status_bar", str3).appendQueryParameter("use_spark", "1");
        if (str != null) {
            appendQueryParameter3.appendQueryParameter("title", str);
        }
        SmartRouter.buildRoute(interfaceC25921AFh.getActivity(), appendQueryParameter3.build().toString()).open();
    }

    public static /* synthetic */ void LIZIZ(InterfaceC25921AFh interfaceC25921AFh, String str, String str2, Boolean bool, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        interfaceC25921AFh.LJFF(str, str2, bool, null);
    }
}
