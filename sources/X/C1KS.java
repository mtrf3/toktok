package X;

import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.EffectManager;
import kotlin.jvm.internal.o;

/* renamed from: X.1KS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KS implements InterfaceC08030Tf {
    public static final C1KS LIZ = new C1KS();
    public static final EffectManager LIZIZ;

    static {
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        LIZIZ = LJLJJLL;
    }

    public static final boolean LIZIZ() {
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.A.LIZJ();
            o.LJIIIIZZ(LIZJ, "SHOULD_BEAUTY_ENTRANCE_SHOW_RED_DOT.value");
            if (LIZJ.booleanValue() && !LiveEffectDowngradeSetting.INSTANCE.remove()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ() {
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.e.LIZJ();
            o.LJIIIIZZ(LIZJ, "SHOULD_SHOW_FILTER_RED_DOT.value");
            if (LIZJ.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZLLL() {
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.y.LIZJ();
            o.LJIIIIZZ(LIZJ, "SHOULD_STICKER_SHOW_RED_DOT.value");
            if (LIZJ.booleanValue() && !LiveEffectDowngradeSetting.INSTANCE.remove()) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(DataChannel dataChannel) {
        InterfaceC30442Bx8.e.LIZ(Boolean.FALSE);
        if (dataChannel != null) {
            dataChannel.pv0(EffectRedDotStatusChangeEvent.class);
        }
    }
}
