package X;

import com.bytedance.android.livesdk.usermanage.UserManageService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BK9 extends AbstractC60811Ntn {
    public final /* synthetic */ UserManageService LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C28555BIp LJLJJI;

    public BK9(UserManageService userManageService, String str, C28555BIp c28555BIp) {
        this.LJLILLLLZI = userManageService;
        this.LJLJI = str;
        this.LJLJJI = c28555BIp;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        LJJJJ(view, url);
        UserManageService userManageService = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        C28555BIp c28555BIp = this.LJLJJI;
        if (str == null) {
            str = "onLoadUnknownFailed";
        }
        userManageService.getClass();
        UserManageService.LJ(str2, c28555BIp, true, str);
    }
}
