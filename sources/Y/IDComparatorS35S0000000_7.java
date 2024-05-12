package Y;

import X.C41545GSf;
import X.C43189GxF;
import X.C44651Hfj;
import X.C66851QLn;
import X.C8SZ;
import X.GQR;
import X.GUU;
import X.HFO;
import X.HN3;
import X.OSZ;
import X.S1E;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Comparator;

/* loaded from: classes8.dex */
public class IDComparatorS35S0000000_7 implements Comparator {
    public final int $t;

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
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case 9:
                return compare$9(this, t, t2);
            case 10:
                return compare$10(this, t, t2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, t, t2);
            case 12:
                return compare$12(this, t, t2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            case 15:
                return compare$15(this, t, t2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return compare$16(this, t, t2);
            case 17:
                return compare$17(this, t, t2);
            case 18:
                return compare$18(this, t, t2);
            case 19:
                return compare$19(this, t, t2);
            case 20:
                return compare$20(this, t, t2);
            case 21:
                return compare$21(this, t, t2);
            case 22:
                return compare$22(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS35S0000000_7(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((Number) obj).intValue())), Integer.valueOf(C8SZ.LIZ(((Number) obj2).intValue())));
    }

    public static final int compare$1(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((ReturnEcommerceCommentModel) obj).index), Integer.valueOf(((ReturnEcommerceCommentModel) obj2).index));
    }

    public static final int compare$10(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((DraftFileRestoreResult) obj2).getPriority()), Integer.valueOf(((DraftFileRestoreResult) obj).getPriority()));
    }

    public static final int compare$11(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return Integer.compare(((C41545GSf) obj).LIZ, ((C41545GSf) obj2).LIZ);
    }

    public static final int compare$12(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$13(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((AnchorTransData) obj2).getBusinessType())), Integer.valueOf(C8SZ.LIZ(((AnchorTransData) obj).getBusinessType())));
    }

    public static final int compare$14(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((AnchorTransData) obj).getBusinessType())), Integer.valueOf(C8SZ.LIZ(((AnchorTransData) obj2).getBusinessType())));
    }

    public static final int compare$15(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(((AnchorTransData) obj).getAddTime(), ((AnchorTransData) obj2).getAddTime());
    }

    public static final int compare$16(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(((AnchorTransData) obj).getAddTime(), ((AnchorTransData) obj2).getAddTime());
    }

    public static final int compare$17(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(((AnchorTransData) obj).getAddTime(), ((AnchorTransData) obj2).getAddTime());
    }

    public static final int compare$18(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(((MusicModel) obj2).getDateLastModified(), ((MusicModel) obj).getDateLastModified());
    }

    public static final int compare$19(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((HFO) obj).LJLIL), Long.valueOf(((HFO) obj2).LJLIL));
    }

    public static final int compare$2(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return ((InteractStickerStruct) obj).getIndex() - ((InteractStickerStruct) obj2).getIndex();
    }

    public static final int compare$20(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C43189GxF) obj2).LIZJ), Long.valueOf(((C43189GxF) obj).LIZJ));
    }

    public static final int compare$21(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((GQR) obj).LIZJ().ordinal()), Integer.valueOf(((GQR) obj2).LIZJ().ordinal()));
    }

    public static final int compare$22(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C44651Hfj) obj).LJLIL.priority), Integer.valueOf(((C44651Hfj) obj2).LJLIL.priority));
    }

    public static final int compare$3(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        long j = ((PUgcSlotData) obj).slotStartTime;
        long j2 = ((PUgcSlotData) obj2).slotStartTime;
        if (j > j2) {
            return 1;
        }
        if (j == j2) {
            return 0;
        }
        return -1;
    }

    public static final int compare$4(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((OSZ) obj).getFirst(), (Integer) ((OSZ) obj2).getFirst());
    }

    public static final int compare$5(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$6(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C8SZ.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$7(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((S1E) obj).priority()), Integer.valueOf(((S1E) obj2).priority()));
    }

    public static final int compare$8(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((HN3) obj).LJLIL), Integer.valueOf(((HN3) obj2).LJLIL));
    }

    public static final int compare$9(IDComparatorS35S0000000_7 iDComparatorS35S0000000_7, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((GUU) obj).LJFF), Long.valueOf(((GUU) obj2).LJFF));
    }
}
