package X;

import Y.AfS36S0101000_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1I {
    public static C1J LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static int LJ;
    public static DataChannel LJI;
    public static final C1I LIZ = new C1I();
    public static final HashSet<C1M> LJFF = new HashSet<>();

    public static void LIZIZ(C1M listener) {
        o.LJIIIZ(listener, "listener");
        LJFF.remove(listener);
    }

    public final void LIZ(int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        long j;
        Long l;
        Long l2;
        if (!LIZJ) {
            return;
        }
        LIZJ = false;
        DataChannel dataChannel = LJI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        Iterator<C1M> it = LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        DataChannel dataChannel2 = LJI;
        long j2 = 0;
        if (dataChannel2 != null && (l2 = (Long) dataChannel2.kv0(BCN.class)) != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        DataChannel dataChannel3 = LJI;
        if (dataChannel3 != null && (l = (Long) dataChannel3.kv0(C1N.class)) != null) {
            j2 = l.longValue();
        }
        C1EW.LIZ(((PollApi) C1A.LIZJ(PollApi.class)).endPoll(j, j2, i)).LJJJLIIL(new AfS36S0101000_5(i, interfaceC88472Yns, 61), new AfS57S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 307));
    }

    public final void LIZJ(long j, DataChannel dataChannel, CCC pollType) {
        o.LJIIIZ(pollType, "pollType");
        if (C29306Beo.LJIIL(dataChannel)) {
            return;
        }
        LJI = dataChannel;
        C1J c1j = LIZIZ;
        if (c1j != null) {
            c1j.cancel();
        }
        CC4.LIZ = pollType;
        C1J c1j2 = new C1J(j);
        LIZIZ = c1j2;
        c1j2.start();
        LIZJ = true;
        LJ++;
        dataChannel.mv0(WarningInfoVisibilityEvent.class, this, C1K.LJLIL);
        dataChannel.mv0(BroadcastEndShowEvent.class, this, C1L.LJLIL);
    }
}
