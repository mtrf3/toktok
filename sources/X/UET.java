package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public final class UET extends AbstractC03120Ai {
    public final List<RealtimeViolationRecord> LIZ;
    public final List<RealtimeViolationRecord> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public UET(List<RealtimeViolationRecord> list, List<RealtimeViolationRecord> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Boolean bool;
        Boolean bool2;
        Integer num;
        RealtimeViolationRecord realtimeViolationRecord = (RealtimeViolationRecord) ListProtector.get(this.LIZ, i);
        RealtimeViolationRecord realtimeViolationRecord2 = (RealtimeViolationRecord) ListProtector.get(this.LIZIZ, i2);
        if (realtimeViolationRecord.startTime == realtimeViolationRecord2.startTime && realtimeViolationRecord.endTime == realtimeViolationRecord2.endTime && o.LJ(realtimeViolationRecord.title, realtimeViolationRecord2.title) && o.LJ(realtimeViolationRecord.reason, realtimeViolationRecord2.reason) && o.LJ(realtimeViolationRecord.suggestion, realtimeViolationRecord2.suggestion) && realtimeViolationRecord.type == realtimeViolationRecord2.type && o.LJ(realtimeViolationRecord.punishInfo, realtimeViolationRecord2.punishInfo)) {
            AppealInfo appealInfo = realtimeViolationRecord.appealInfo;
            Integer num2 = null;
            if (appealInfo != null) {
                bool = Boolean.valueOf(appealInfo.showAppeal);
            } else {
                bool = null;
            }
            AppealInfo appealInfo2 = realtimeViolationRecord2.appealInfo;
            if (appealInfo2 != null) {
                bool2 = Boolean.valueOf(appealInfo2.showAppeal);
            } else {
                bool2 = null;
            }
            if (o.LJ(bool, bool2)) {
                AppealInfo appealInfo3 = realtimeViolationRecord.appealInfo;
                if (appealInfo3 != null) {
                    num = Integer.valueOf(appealInfo3.appealStatus);
                } else {
                    num = null;
                }
                AppealInfo appealInfo4 = realtimeViolationRecord2.appealInfo;
                if (appealInfo4 != null) {
                    num2 = Integer.valueOf(appealInfo4.appealStatus);
                }
                if (o.LJ(num, num2) && realtimeViolationRecord.status == realtimeViolationRecord2.status) {
                    return true;
                }
            }
        }
        return false;
    }
}
