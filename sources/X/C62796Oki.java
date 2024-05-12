package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.rss.feed.ui.RssFeedAssem;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.Oki, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62796Oki implements OnActivityResultCallback {
    public final /* synthetic */ RssFeedAssem LJLIL;

    public C62796Oki(RssFeedAssem rssFeedAssem) {
        this.LJLIL = rssFeedAssem;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        Context context;
        Activity LJIJJ;
        if (i2 != 10003) {
            if (i2 != 10004 || (context = this.LJLIL.getContext()) == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
                return;
            }
            LJIJJ.onBackPressed();
            return;
        }
        RssFeedViewModel H3 = this.LJLIL.H3();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "RSS_LINK_EDITED_URL");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        H3.getClass();
        H3.LJLJI = LLJJIJIIJIL;
        RssFeedViewModel H32 = this.LJLIL.H3();
        H32.getClass();
        H32.withState(new AqS167S0100000_1(H32, 472));
    }
}
