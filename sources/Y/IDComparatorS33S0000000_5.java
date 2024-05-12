package Y;

import X.AbstractC32698CsQ;
import X.C31106CIs;
import X.C31723Cch;
import X.C66851QLn;
import X.CRD;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.livesetting.level.FeResourceChannelConfig;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class IDComparatorS33S0000000_5 implements Comparator {
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
            default:
                return 0;
        }
    }

    public IDComparatorS33S0000000_5(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return ((C31723Cch) obj).LIZ - ((C31723Cch) obj2).LIZ;
    }

    public static final int compare$1(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return ((C31723Cch) obj).LIZ - ((C31723Cch) obj2).LIZ;
    }

    public static final int compare$10(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((GiftHintInfo) obj).hintShowDelayMs), Long.valueOf(((GiftHintInfo) obj2).hintShowDelayMs));
    }

    public static final int compare$11(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        HashMap<String, Integer> hashMap = C31106CIs.LIZLLL;
        Integer num = hashMap.get(((EmoteModel) obj).emoteId);
        Integer num2 = Integer.MAX_VALUE;
        if (num == null) {
            num = num2;
        }
        Integer num3 = hashMap.get(((EmoteModel) obj2).emoteId);
        if (num3 != null) {
            num2 = num3;
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$12(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EmoteWithIndex) obj).index), Integer.valueOf(((EmoteWithIndex) obj2).index));
    }

    public static final int compare$13(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return ((C31723Cch) obj).LIZ - ((C31723Cch) obj2).LIZ;
    }

    public static final int compare$2(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return ((C31723Cch) obj).LIZ - ((C31723Cch) obj2).LIZ;
    }

    public static final int compare$3(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return ((C31723Cch) obj).LIZ - ((C31723Cch) obj2).LIZ;
    }

    public static final int compare$4(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$5(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((PollOptionInfo) obj2).votes), Long.valueOf(((PollOptionInfo) obj).votes));
    }

    public static final int compare$6(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        Integer num;
        AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) obj;
        Integer num2 = null;
        if (abstractC32698CsQ != null) {
            num = Integer.valueOf(abstractC32698CsQ.LIZIZ());
        } else {
            num = null;
        }
        AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) obj2;
        if (abstractC32698CsQ2 != null) {
            num2 = Integer.valueOf(abstractC32698CsQ2.LIZIZ());
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$7(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        Integer num;
        AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) obj2;
        Integer num2 = null;
        if (abstractC32698CsQ != null) {
            num = Integer.valueOf(abstractC32698CsQ.LIZIZ());
        } else {
            num = null;
        }
        AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) obj;
        if (abstractC32698CsQ2 != null) {
            num2 = Integer.valueOf(abstractC32698CsQ2.LIZIZ());
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$8(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        Integer num;
        FeResourceChannelConfig feResourceChannelConfig = (FeResourceChannelConfig) obj;
        Integer num2 = null;
        if (feResourceChannelConfig != null) {
            num = Integer.valueOf(feResourceChannelConfig.minLevel);
        } else {
            num = null;
        }
        FeResourceChannelConfig feResourceChannelConfig2 = (FeResourceChannelConfig) obj2;
        if (feResourceChannelConfig2 != null) {
            num2 = Integer.valueOf(feResourceChannelConfig2.minLevel);
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$9(IDComparatorS33S0000000_5 iDComparatorS33S0000000_5, Object obj, Object obj2) {
        CRD crd = (CRD) obj;
        CRD crd2 = (CRD) obj2;
        if (crd.LJJJZ() == crd2.LJJJZ()) {
            return 0;
        }
        if (crd.LJJJZ() - crd2.LJJJZ() > 0) {
            return -1;
        }
        return 1;
    }
}
