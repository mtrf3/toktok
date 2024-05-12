package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RrS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70858RrS {
    public AbstractC70995Rtf LIZ;
    public final HashMap<String, LaneParams> LIZIZ = new HashMap<>();

    public final void LIZ(InterfaceC88471Ynr<? super String, ? super LaneParams, C76800UCe> interfaceC88471Ynr) {
        for (Map.Entry<String, LaneParams> entry : this.LIZIZ.entrySet()) {
            interfaceC88471Ynr.invoke(entry.getKey(), entry.getValue());
        }
    }

    public LaneParams LIZIZ(String lane) {
        o.LJIIIZ(lane, "lane");
        return this.LIZIZ.get(lane);
    }

    public final void LIZJ(C70858RrS other) {
        o.LJIIIZ(other, "other");
        other.LIZ(new AqS194S0100000_12(this, 174));
    }

    public final void LIZLLL(LaneParams laneData, String lane) {
        o.LJIIIZ(lane, "lane");
        o.LJIIIZ(laneData, "laneData");
        this.LIZIZ.put(lane, laneData);
    }
}
