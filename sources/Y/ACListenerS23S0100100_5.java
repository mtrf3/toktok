package Y;

import X.ActivityC45651qj;
import X.C04120Ee;
import X.C29306Beo;
import X.C30627C0h;
import X.CN1;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ACListenerS23S0100100_5 implements View.OnClickListener {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS23S0100100_5 aCListenerS23S0100100_5, View view) {
        ActivityC45651qj LIZIZ;
        String str;
        Context context = C30627C0h.LJLJLJ;
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            long j = aCListenerS23S0100100_5.j1;
            C04120Ee c04120Ee = (C04120Ee) aCListenerS23S0100100_5.l0;
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
            DataChannel dataChannel = C30627C0h.LJLILLLLZI.get(j);
            PollMessage pollMessage = c04120Ee.LJI;
            if (pollMessage == null || (str = Long.valueOf(pollMessage.pollId).toString()) == null) {
                str = "";
            }
            iRoomFunctionService.u00("short_touch", LIZIZ, dataChannel, true, str);
        }
    }

    public static final void onClick$1(ACListenerS23S0100100_5 aCListenerS23S0100100_5, View it) {
        long j = aCListenerS23S0100100_5.j1;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - C29306Beo.LIZ < j) {
            return;
        }
        C29306Beo.LIZ = uptimeMillis;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS23S0100100_5.l0;
        o.LJIIIIZZ(it, "it");
        interfaceC88472Yns.invoke(it);
    }

    public static final void onClick$2(ACListenerS23S0100100_5 aCListenerS23S0100100_5, View view) {
        long j = aCListenerS23S0100100_5.j1;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - C29306Beo.LIZ < j) {
            return;
        }
        C29306Beo.LIZ = uptimeMillis;
        ((View.OnClickListener) aCListenerS23S0100100_5.l0).onClick(view);
    }

    public ACListenerS23S0100100_5(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
