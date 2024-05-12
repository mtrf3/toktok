package X;

import com.bytedance.android.livesdk.livesetting.game.MaxTnsPiracyReportDataSize;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19840qC {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<InterfaceC18260ne> LIZLLL;
    public final long LJ;
    public final long LJFF;

    public C19840qC(String uid, String roomId, List list, Long l, Long l2) {
        int value = MaxTnsPiracyReportDataSize.INSTANCE.getValue();
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(roomId, "roomId");
        this.LIZ = value;
        this.LIZIZ = uid;
        this.LIZJ = roomId;
        this.LIZLLL = list;
        this.LJ = 1000L;
        this.LJFF = 30000L;
        if (l != null) {
            long longValue = l.longValue();
            this.LJ = longValue < 500 ? 500L : longValue;
        }
        if (l2 != null) {
            long longValue2 = l2.longValue();
            this.LJFF = longValue2 >= 30000 ? longValue2 : 30000L;
        }
    }
}
