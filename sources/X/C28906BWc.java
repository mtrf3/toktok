package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* renamed from: X.BWc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28906BWc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, int i, String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        if (str == null || str.length() == 0) {
            if (i == 2) {
                ((IHostAction) CN1.LIZ(IHostAction.class)).jumpToAgsStatusPage(context, str2);
                return;
            }
            String value = LiveForbbidenDetailPageSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                    value = "https://inapp-va.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
                } else {
                    value = "https://inapp.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
                }
            }
            o.LJIIIIZZ(value, "getSettingsForbiddenPageUrl()");
            interfaceC88472Yns.invoke(value);
            return;
        }
        interfaceC88472Yns.invoke(str);
    }
}
