package Y;

import X.C66851QLn;
import X.C75883TqJ;
import X.C76699U8h;
import X.C76876UFc;
import X.C78072UkW;
import X.C78087Ukl;
import X.C78832Uwm;
import X.C79006Uza;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkPosition;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes14.dex */
public class IDComparatorS41S0000000_13 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case 9:
                return compare$9(this, obj, obj2);
            case 10:
                return compare$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, obj, obj2);
            case 12:
                return compare$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return compare$16(this, obj, obj2);
            case 17:
                return compare$17(this, obj, obj2);
            case 18:
                return compare$18(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS41S0000000_13(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return ((C79006Uza) obj).LIZLLL - ((C79006Uza) obj2).LIZLLL;
    }

    public static final int compare$1(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C78072UkW) obj2).LIZLLL), Integer.valueOf(((C78072UkW) obj).LIZLLL));
    }

    public static final int compare$10(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C75883TqJ) obj).LJFF), Long.valueOf(((C75883TqJ) obj2).LJFF));
    }

    public static final int compare$11(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((LinkLayerListUser) obj).linkedTimeNano), Long.valueOf(((LinkLayerListUser) obj2).linkedTimeNano));
    }

    public static final int compare$12(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        long j;
        Long l = ((C76876UFc) obj2).LJFF;
        long j2 = Long.MAX_VALUE;
        if (l != null) {
            j = l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        Long valueOf = Long.valueOf(j);
        Long l2 = ((C76876UFc) obj).LJFF;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j2));
    }

    public static final int compare$13(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num == null || num2 == null) {
            return 0;
        }
        return num.intValue() - num2.intValue();
    }

    public static final int compare$14(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C76699U8h) obj).LJLIL), Integer.valueOf(((C76699U8h) obj2).LJLIL));
    }

    public static final int compare$15(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C76699U8h) obj).LJLIL), Integer.valueOf(((C76699U8h) obj2).LJLIL));
    }

    public static final int compare$16(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        int i;
        MicPositionInfo micPositionData = ((OnLineMicInfo) ((Map.Entry) obj).getValue()).getMicPositionData();
        int i2 = -1;
        if (micPositionData != null) {
            i = micPositionData.getPosition();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        MicPositionInfo micPositionData2 = ((OnLineMicInfo) ((Map.Entry) obj2).getValue()).getMicPositionData();
        if (micPositionData2 != null) {
            i2 = micPositionData2.getPosition();
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$17(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        int i;
        LinkPosition linkPosition;
        LinkPosition linkPosition2;
        MicPositionData micPositionData = ((LinkLayerListUser) obj).positionData;
        int i2 = -1;
        if (micPositionData != null && (linkPosition2 = micPositionData.linkPosition) != null) {
            i = linkPosition2.position;
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        MicPositionData micPositionData2 = ((LinkLayerListUser) obj2).positionData;
        if (micPositionData2 != null && (linkPosition = micPositionData2.linkPosition) != null) {
            i2 = linkPosition.position;
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$18(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C78087Ukl) obj).LIZ), Integer.valueOf(((C78087Ukl) obj2).LIZ));
    }

    public static final int compare$2(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((SeiRegion) obj).position), Integer.valueOf(((SeiRegion) obj2).position));
    }

    public static final int compare$3(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(((LinkUser) obj).getChannelOwnerLinkedTime(), ((LinkUser) obj2).getChannelOwnerLinkedTime());
    }

    public static final int compare$4(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C75883TqJ) obj).LJFF), Long.valueOf(((C75883TqJ) obj2).LJFF));
    }

    public static final int compare$5(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C75883TqJ) obj).LJFF), Long.valueOf(((C75883TqJ) obj2).LJFF));
    }

    public static final int compare$6(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num == null || num2 == null) {
            return 0;
        }
        return num.intValue() - num2.intValue();
    }

    public static final int compare$7(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        if (l != null && l2 != null) {
            if (l.longValue() > l2.longValue()) {
                return 1;
            }
            if (l.longValue() < l2.longValue()) {
                return -1;
            }
        }
        return 0;
    }

    public static final int compare$8(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C78832Uwm) obj).LIZ, ((C78832Uwm) obj2).LIZ);
    }

    public static final int compare$9(IDComparatorS41S0000000_13 iDComparatorS41S0000000_13, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C75883TqJ) obj).LJFF), Long.valueOf(((C75883TqJ) obj2).LJFF));
    }
}
