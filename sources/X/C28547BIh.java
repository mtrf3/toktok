package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.t1;
import java.util.HashMap;

/* renamed from: X.BIh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28547BIh implements C0K7 {
    public final /* synthetic */ CLB LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C28547BIh(CLB clb, String str, boolean z, String str2) {
        this.LJLIL = clb;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = str2;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        CLB clb = this.LJLIL;
        String str = this.LJLILLLLZI;
        clb.getClass();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", str);
                value = buildUpon.build().toString();
            } catch (Exception e) {
                C0NB.LJ("GiftNewPresenter", e.toString());
            }
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLIL.LIZ, value);
        CLE.LIZ(this.LJLJJI, "primary_cta", this.LJLJI);
        if (B83.LIZ().LIZIZ() != null) {
            HashMap hashMap = new HashMap();
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_click_contact_us");
            LIZ.LJIILLIIL(this.LJLIL.LIZIZ);
            LIZ.LJJIFFI(hashMap);
            LIZ.LJJIIJZLJL();
        }
    }
}
