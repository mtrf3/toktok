package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOncemoreDurationSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cje, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32154Cje implements InterfaceC85887XnH, InterfaceC22840v2 {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    public /* synthetic */ C32154Cje(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC85887XnH
    public void LIZ(boolean z) {
        this.LJLIL.invoke(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC22840v2
    public void LJIILIIL(C22830v1 outputData) {
        Object LIZ;
        long value;
        o.LJIIIZ(outputData, "outputData");
        InterfaceC88472Yns interfaceC88472Yns = this.LJLIL;
        if (outputData.LIZ()) {
            Object obj = null;
            try {
                JSONObject jSONObject = outputData.LIZIZ;
                if (jSONObject != null) {
                    LIZ = Long.valueOf(jSONObject.optLong("duration"));
                } else {
                    LIZ = null;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (!C3C5.m12isFailureimpl(LIZ)) {
                obj = LIZ;
            }
            Long l = (Long) obj;
            if (l != null) {
                value = l.longValue();
            } else {
                value = LiveBattleDrawOncemoreDurationSetting.INSTANCE.getValue();
            }
            interfaceC88472Yns.invoke(Long.valueOf(value));
            return;
        }
        interfaceC88472Yns.invoke(Long.valueOf(LiveBattleDrawOncemoreDurationSetting.INSTANCE.getValue()));
    }
}
