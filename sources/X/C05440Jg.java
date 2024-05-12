package X;

import com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05440Jg {
    public static OJM<GameCastWidget> LIZ;
    public static final java.util.Map<Class<? extends GameCastWidget>, Boolean> LIZIZ = new ConcurrentHashMap();

    public static void LIZIZ() {
        boolean z;
        Iterator it = ((ConcurrentHashMap) LIZIZ).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (o.LJ(((ConcurrentHashMap) LIZIZ).get(entry.getKey()), Boolean.TRUE)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (o.LJ(Boolean.valueOf(z), dataChannelGlobal.mv0(LiveCastStateChannel.class))) {
            return;
        }
        dataChannelGlobal.tv0(LiveCastStateChannel.class, Boolean.valueOf(z));
    }

    public static final boolean LIZ(Class<? extends GameCastWidget> cls) {
        Boolean bool = (Boolean) ((ConcurrentHashMap) LIZIZ).get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LIZJ(Class<? extends GameCastWidget> cls, boolean z) {
        Integer num;
        StringBuilder LJI = JBR.LJI("s: ", z, ", wsize:");
        OJM<GameCastWidget> ojm = LIZ;
        if (ojm != null) {
            num = Integer.valueOf(ojm.LJLIL.size());
        } else {
            num = null;
        }
        LJI.append(num);
        LJI.append(", mSize:");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        LJI.append(concurrentHashMap.size());
        LJI.append(" class: ");
        LJI.append(cls.getName());
        C0NB.LIZIZ("GameCastStateManager", X1D.LIZIZ(LJI));
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("state: ");
            LIZ2.append(((Boolean) entry.getValue()).booleanValue());
            C0NB.LIZIZ("GameCastStateManager", X1D.LIZIZ(LIZ2));
        }
        OJM<GameCastWidget> ojm2 = LIZ;
        if (ojm2 != null && ojm2.LJLIL.size() == 0) {
            for (Map.Entry entry2 : ((ConcurrentHashMap) LIZIZ).entrySet()) {
                if (o.LJ(entry2.getKey(), cls) && ((Boolean) entry2.getValue()).booleanValue() != z) {
                    ((ConcurrentHashMap) LIZIZ).put(cls, Boolean.valueOf(z));
                    LIZIZ();
                    return;
                }
            }
            return;
        }
        OJM<GameCastWidget> ojm3 = LIZ;
        if (ojm3 != null) {
            Iterator<GameCastWidget> it = ojm3.iterator();
            while (it.hasNext()) {
                GameCastWidget next = it.next();
                if (o.LJ(cls, next.getClass())) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZIZ;
                    if (!o.LJ(concurrentHashMap2.get(cls), Boolean.valueOf(z))) {
                        concurrentHashMap2.put(cls, Boolean.valueOf(z));
                        C29306Beo.LJJJIL(new C46191rb(next, z));
                        LIZIZ();
                        return;
                    }
                }
            }
        }
    }
}
