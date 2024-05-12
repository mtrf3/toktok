package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;
import android.util.Log;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS10S1100100_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS10S1100100_7 aqS10S1100100_7) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("media selection blocked by duration limit, minDuration=");
        LIZ.append(aqS10S1100100_7.j2);
        LIZ.append(", videoInfos: ");
        LIZ.append((List) aqS10S1100100_7.l1);
        LIZ.append("message=");
        LIZ.append(aqS10S1100100_7.s0);
        LIZ.append(", scene=checkMediaDurationValid#0, callStacktrace=");
        LIZ.append(Log.getStackTraceString(new Throwable()));
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS10S1100100_7 aqS10S1100100_7) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("media selection blocked by duration limit, minDuration=");
        LIZ.append(aqS10S1100100_7.j2);
        LIZ.append(", videoInfos: ");
        LIZ.append((List) aqS10S1100100_7.l1);
        LIZ.append("message=");
        LIZ.append(aqS10S1100100_7.s0);
        LIZ.append(", scene=checkMediaDurationValid#1, callStacktrace=");
        LIZ.append(Log.getStackTraceString(new Throwable()));
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AqS10S1100100_7) (LINE:67108867) kotlin.jvm.internal.AqS10S1100100_7.j2 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS10S1100100_7) (LINE:67108869) kotlin.jvm.internal.AqS10S1100100_7.l1 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Prl, kotlin.jvm.internal.AqS10S1100100_7] */
    public AqS10S1100100_7(long j, long j2, List<? extends MediaModel> list, String str) {
        long j3;
        Object obj;
        r2.$t = str;
        r2.j2 = j3;
        r2.l1 = obj;
        r2.s0 = list;
        ?? abstractC65781Prl = new AbstractC65781Prl(0);
    }
}
