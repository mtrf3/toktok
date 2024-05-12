package X;

import com.bytedance.android.livesdk.livesetting.other.LivePipoHostSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveMPHostSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.C6q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30792C6q {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        LiveMPHostSetting liveMPHostSetting = LiveMPHostSetting.INSTANCE;
        if (C29306Beo.LJIJJLI(liveMPHostSetting.getValue())) {
            return liveMPHostSetting.getValue();
        }
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion();
        return LiveMPHostSetting.DEFAULT;
    }

    public static String LIZIZ() {
        LivePipoHostSetting livePipoHostSetting = LivePipoHostSetting.INSTANCE;
        if (C29306Beo.LJIJJLI(livePipoHostSetting.getValue())) {
            return livePipoHostSetting.getValue();
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            return "https://f-p-va.isnssdk.com";
        }
        return "https://f-p.sgsnssdk.com";
    }
}
