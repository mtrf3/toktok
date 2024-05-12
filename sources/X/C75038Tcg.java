package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorActivityBannerChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorCommonBannerChannel;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorActivityInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorCommonInfoSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75038Tcg {
    public static final /* synthetic */ int LIZJ = 0;
    public final DataChannel LIZ;
    public volatile int LIZIZ;

    public static boolean LIZ() {
        if (MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.R2.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_ACTIVITY_BANNER_FOR_ANCHOR.value");
            if (LIZJ2.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL() {
        DataChannel dataChannel;
        C75045Tcn c75045Tcn;
        if (!MultiGuestFetchAnchorCommonInfoSetting.INSTANCE.isEnable() || (dataChannel = this.LIZ) == null || (c75045Tcn = (C75045Tcn) dataChannel.kv0(AnchorCommonBannerChannel.class)) == null || c75045Tcn.L() == null || this.LIZIZ == 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ() {
        DataChannel dataChannel;
        C74860TZo c74860TZo;
        if (!LIZ() || (dataChannel = this.LIZ) == null || (c74860TZo = (C74860TZo) dataChannel.kv0(AnchorActivityBannerChannel.class)) == null || !c74860TZo.LIZ || TextUtils.isEmpty(c74860TZo.LIZJ) || TextUtils.isEmpty(c74860TZo.LIZIZ) || this.LIZIZ == 2) {
            return false;
        }
        return true;
    }

    public C75038Tcg(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZIZ(int i, Object obj, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        C35955E9f<String, String> c35955E9f;
        InRoomMultiGuestBanner inRoomMultiGuestBanner;
        C75045Tcn c75045Tcn;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onItemClose, ");
        LIZ.append(i);
        C32014ChO.LIZ("MultiLiveBannerHelper", X1D.LIZIZ(LIZ));
        if (i == 2) {
            AnonymousClass030.LJFF(InterfaceC30442Bx8.n3);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel == null || (c75045Tcn = (C75045Tcn) dataChannel.kv0(AnchorCommonBannerChannel.class)) == null || (c35955E9f = c75045Tcn.LJLILLLLZI) == null) {
                C35956E9g c35956E9g = C35955E9f.Companion;
                java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.m3.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_BANNER_BLOCKED.value");
                c35956E9g.getClass();
                c35955E9f = new C35955E9f<>(50);
                c35955E9f.putAll(LIZJ2);
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.rv0(AnchorCommonBannerChannel.class, new C75045Tcn(C61878OQg.INSTANCE, c35955E9f));
            }
            if ((obj instanceof InRoomMultiGuestBanner) && (inRoomMultiGuestBanner = (InRoomMultiGuestBanner) obj) != null) {
                c35955E9f.put(String.valueOf(inRoomMultiGuestBanner.id), String.valueOf(System.currentTimeMillis()));
                InterfaceC30442Bx8.m3.LIZ(c35955E9f);
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(String.valueOf(inRoomMultiGuestBanner.id));
                }
            }
        }
    }
}
