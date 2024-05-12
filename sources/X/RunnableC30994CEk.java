package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;

/* renamed from: X.CEk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC30994CEk implements Runnable {
    public static final RunnableC30994CEk LJLIL = new RunnableC30994CEk();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
            OnlineAudienceGeckoSetting onlineAudienceGeckoSetting = OnlineAudienceGeckoSetting.INSTANCE;
            boolean Br0 = iHostResource.Br0(onlineAudienceGeckoSetting.getValue().audienceListGeckoChannel);
            String str = onlineAudienceGeckoSetting.getValue().audienceListGeckoChannel;
            if (!Br0 && !TextUtils.isEmpty(str)) {
                iHostResource.Te0(str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
