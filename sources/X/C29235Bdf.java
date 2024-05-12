package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29235Bdf implements C0K7 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ VoiceChatWatchWidget LJLILLLLZI;

    public C29235Bdf(int i, VoiceChatWatchWidget voiceChatWatchWidget) {
        this.LJLIL = i;
        this.LJLILLLLZI = voiceChatWatchWidget;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        C75017TcL.LJIJ(this.LJLIL, "appeal");
        VoiceChatWatchWidget voiceChatWatchWidget = this.LJLILLLLZI;
        voiceChatWatchWidget.getClass();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                C32014ChO.LIZJ(voiceChatWatchWidget.LLF(), e.toString(), null);
            }
        }
        Context context = C8E.LIZIZ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }
}
