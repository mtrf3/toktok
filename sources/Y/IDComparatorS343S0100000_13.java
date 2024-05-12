package Y;

import X.C66851QLn;
import X.C76669U7d;
import X.U2W;
import X.U7Z;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDComparatorS343S0100000_13 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS343S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        Long l = ((U7Z) iDComparatorS343S0100000_13.l0).LJFF.get(Long.valueOf(((Number) obj2).longValue()));
        Long l2 = 0L;
        if (l == null) {
            l = l2;
        }
        Long l3 = ((U7Z) iDComparatorS343S0100000_13.l0).LJFF.get(Long.valueOf(((Number) obj).longValue()));
        if (l3 != null) {
            l2 = l3;
        }
        return C66851QLn.LJFF(l, l2);
    }

    public static final int compare$1(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(((U2W) iDComparatorS343S0100000_13.l0).LJLZ.get(((LinkPlayerInfo) obj).mInteractIdStr), ((U2W) iDComparatorS343S0100000_13.l0).LJLZ.get(((LinkPlayerInfo) obj2).mInteractIdStr));
    }

    public static final int compare$2(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        String str = ((LinkPlayerInfo) obj).mInteractIdStr;
        o.LJIIIIZZ(str, "it.interactId");
        Integer valueOf = Integer.valueOf(U2W.LJJIIZI(str));
        String str2 = ((LinkPlayerInfo) obj2).mInteractIdStr;
        o.LJIIIIZZ(str2, "it.interactId");
        return C66851QLn.LJFF(valueOf, Integer.valueOf(U2W.LJJIIZI(str2)));
    }

    public static final int compare$3(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        long j;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        OnLineMicInfo onLineMicInfo = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIIZZ.get(obj);
        long j2 = -1;
        if (onLineMicInfo != null && (micPositionData2 = onLineMicInfo.getMicPositionData()) != null) {
            j = micPositionData2.getLinkedTime();
        } else {
            j = -1;
        }
        Long valueOf = Long.valueOf(j);
        OnLineMicInfo onLineMicInfo2 = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIIZZ.get(obj2);
        if (onLineMicInfo2 != null && (micPositionData = onLineMicInfo2.getMicPositionData()) != null) {
            j2 = micPositionData.getLinkedTime();
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j2));
    }

    public static final int compare$4(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        int i;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        OnLineMicInfo onLineMicInfo = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj);
        int i2 = -1;
        if (onLineMicInfo != null && (micPositionData2 = onLineMicInfo.getMicPositionData()) != null) {
            i = micPositionData2.getPosition();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        OnLineMicInfo onLineMicInfo2 = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj2);
        if (onLineMicInfo2 != null && (micPositionData = onLineMicInfo2.getMicPositionData()) != null) {
            i2 = micPositionData.getPosition();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$5(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        int i;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        OnLineMicInfo onLineMicInfo = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj);
        int i2 = -1;
        if (onLineMicInfo != null && (micPositionData2 = onLineMicInfo.getMicPositionData()) != null) {
            i = micPositionData2.getPosition();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        OnLineMicInfo onLineMicInfo2 = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj2);
        if (onLineMicInfo2 != null && (micPositionData = onLineMicInfo2.getMicPositionData()) != null) {
            i2 = micPositionData.getPosition();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$6(IDComparatorS343S0100000_13 iDComparatorS343S0100000_13, Object obj, Object obj2) {
        int i;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        OnLineMicInfo onLineMicInfo = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj);
        int i2 = -1;
        if (onLineMicInfo != null && (micPositionData2 = onLineMicInfo.getMicPositionData()) != null) {
            i = micPositionData2.getPosition();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        OnLineMicInfo onLineMicInfo2 = ((C76669U7d) iDComparatorS343S0100000_13.l0).LJIIIZ.get(obj2);
        if (onLineMicInfo2 != null && (micPositionData = onLineMicInfo2.getMicPositionData()) != null) {
            i2 = micPositionData.getPosition();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }
}
