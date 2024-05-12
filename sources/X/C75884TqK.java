package X;

import Y.AfS3S0200100_13;
import Y.AfS5S0000100_13;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TqK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75884TqK {
    public final ConcurrentHashMap<Long, InterfaceC92693kP> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Long> LIZIZ = new ConcurrentHashMap<>();
    public DataChannel LIZJ;

    public final void LIZIZ() {
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clear, disposableMap size = ");
                LIZ.append(this.LIZ.size());
                LIZ.append('}');
                C0NB.LJIIIZ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ));
                Iterator<Map.Entry<Long, InterfaceC92693kP>> it = this.LIZ.entrySet().iterator();
                while (it.hasNext()) {
                    LIZLLL(it.next().getKey().longValue());
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("clear, e = ");
                LIZ2.append(e);
                C0NB.LJ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ2));
            }
        } finally {
            this.LIZ.clear();
            this.LIZIZ.clear();
        }
    }

    public final void LIZLLL(long j) {
        C44878HjO.LIZJ("removeCountDown, uid = ", j, "MultiCoHostTimeOut");
        InterfaceC92693kP interfaceC92693kP = this.LIZ.get(Long.valueOf(j));
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LIZ.remove(Long.valueOf(j));
        this.LIZIZ.remove(Long.valueOf(j));
    }

    public final void LIZ(long j, final long j2, EnumC75915Tqp source) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addCountDown, source = ");
        LIZ.append(source);
        LIZ.append(", uid = ");
        LIZ.append(j);
        LIZ.append(", countdownSecond = ");
        LIZ.append(j2);
        C0NB.LJIIIZ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ));
        InterfaceC92693kP interfaceC92693kP = this.LIZ.get(Long.valueOf(j));
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LIZ.put(Long.valueOf(j), TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(j2).LJJIJL(new InterfaceC48038ItG() { // from class: X.2WR
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                return Long.valueOf(j2 - ((Number) obj).longValue());
            }
        }).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS3S0200100_13(j, this, source, 4), new AfS5S0000100_13(j, 3), new C75916Tqq(j, this, source)));
    }

    public final void LIZJ(long j, long j2, EnumC75915Tqp source) {
        o.LJIIIZ(source, "source");
        if (j <= 0) {
            return;
        }
        this.LIZIZ.put(Long.valueOf(j), Long.valueOf(j2));
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.qv0(MultiCoHostCountDownEvent.class, new C75718Tne(j, j2, source));
        }
    }
}
