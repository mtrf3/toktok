package X;

import android.os.SystemClock;
import com.bytedance.android.live.GuidanceVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQB implements InterfaceC31332CRk<CQ6> {
    public int LIZ;

    @Override // X.InterfaceC31332CRk
    public final void LIZ(CQ6 cq6, CQQ context) {
        int i;
        C19690px c19690px;
        CQ6 model = cq6;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(context, "context");
        if (!context.LJFF || model.LIZJ || (i = this.LIZ) > 0) {
            return;
        }
        this.LIZ = i + 1;
        DataChannel dataChannel = context.LJIIIIZZ;
        if (dataChannel == null || (c19690px = (C19690px) dataChannel.kv0(C54812Dd.class)) == null || !c19690px.LIZIZ || SystemClock.uptimeMillis() - context.LJIILL <= c19690px.LJI || o.LJ(dataChannel.kv0(GuidanceVisibilityChannel.class), Boolean.TRUE)) {
            return;
        }
        context.LJIILL = SystemClock.uptimeMillis();
        model.LJIL = true;
        CQI cqi = model.LJJ;
        String str = c19690px.LJFF;
        cqi.getClass();
        o.LJIIIZ(str, "<set-?>");
        cqi.LIZIZ = str;
    }
}
