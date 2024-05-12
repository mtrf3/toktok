package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareService;

/* renamed from: X.7cY */
/* loaded from: classes4.dex */
public final class C189747cY {
    public static /* synthetic */ void LIZ(ShareService shareService, C62394OeE c62394OeE, Activity activity, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        shareService.LJIJJ(activity, c62394OeE, z, false);
    }

    public static /* synthetic */ void LIZIZ(ShareService shareService, Context context, Aweme aweme, InterfaceC72642tA interfaceC72642tA, String str, String str2, String str3) {
        shareService.LJJIJ(context, aweme, interfaceC72642tA, str, str2, "", str3);
    }
}
