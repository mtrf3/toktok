package Y;

import X.C2313796f;
import X.C234109Gs;
import X.C66851QLn;
import X.C9I1;
import X.C9IF;
import X.OSZ;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.Control;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes5.dex */
public class IDComparatorS32S0000000_4 implements Comparator {
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
            default:
                return 0;
        }
    }

    public IDComparatorS32S0000000_4(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((Utterance) obj).getStartTime()), Long.valueOf(((Utterance) obj2).getStartTime()));
    }

    public static final int compare$1(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$10(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C2313796f) obj).LIZ), Integer.valueOf(((C2313796f) obj2).LIZ));
    }

    public static final int compare$11(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        long j;
        MusicReleaseInfo musicReleaseInfo;
        MusicReleaseInfo musicReleaseInfo2;
        Music sourceMusic = ((MusicGroup) obj2).getSourceMusic();
        long j2 = 0;
        if (sourceMusic != null && (musicReleaseInfo2 = sourceMusic.getMusicReleaseInfo()) != null) {
            j = musicReleaseInfo2.getGroupReleaseDate();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        Music sourceMusic2 = ((MusicGroup) obj).getSourceMusic();
        if (sourceMusic2 != null && (musicReleaseInfo = sourceMusic2.getMusicReleaseInfo()) != null) {
            j2 = musicReleaseInfo.getGroupReleaseDate();
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j2));
    }

    public static final int compare$12(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        long j;
        MusicReleaseInfo musicReleaseInfo = ((Music) obj2).getMusicReleaseInfo();
        long j2 = 0;
        if (musicReleaseInfo != null) {
            j = musicReleaseInfo.getGroupReleaseDate();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        MusicReleaseInfo musicReleaseInfo2 = ((Music) obj).getMusicReleaseInfo();
        if (musicReleaseInfo2 != null) {
            j2 = musicReleaseInfo2.getGroupReleaseDate();
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j2));
    }

    public static final int compare$13(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C234109Gs) ((OSZ) obj).getSecond()).LIZLLL, ((C234109Gs) ((OSZ) obj2).getSecond()).LIZLLL);
    }

    public static final int compare$14(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C234109Gs) ((OSZ) obj).getSecond()).LIZLLL, ((C234109Gs) ((OSZ) obj2).getSecond()).LIZLLL);
    }

    public static final int compare$15(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        Integer num;
        Control control = ((InAppPush) obj).control;
        Integer num2 = null;
        if (control != null) {
            num = Integer.valueOf(control.time);
        } else {
            num = null;
        }
        Control control2 = ((InAppPush) obj2).control;
        if (control2 != null) {
            num2 = Integer.valueOf(control2.time);
        }
        return C66851QLn.LJFF(num, num2);
    }

    public static final int compare$16(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(((BaseLoginMethod) obj2).getLastActiveTime(), ((BaseLoginMethod) obj).getLastActiveTime());
    }

    public static final int compare$17(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C234109Gs) ((OSZ) obj).getSecond()).LIZLLL, ((C234109Gs) ((OSZ) obj2).getSecond()).LIZLLL);
    }

    public static final int compare$18(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C234109Gs) ((OSZ) obj).getSecond()).LIZLLL, ((C234109Gs) ((OSZ) obj2).getSecond()).LIZLLL);
    }

    public static final int compare$2(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C9IF) obj).getId()), Integer.valueOf(((C9IF) obj2).getId()));
    }

    public static final int compare$3(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C9IF) obj).getId()), Integer.valueOf(((C9IF) obj2).getId()));
    }

    public static final int compare$4(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InteractStickerStruct) obj).getIndex()), Integer.valueOf(((InteractStickerStruct) obj2).getIndex()));
    }

    public static final int compare$5(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((ActivityTask) obj).time), Integer.valueOf(((ActivityTask) obj2).time));
    }

    public static final int compare$6(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((PushOffReason) obj).category), Integer.valueOf(((PushOffReason) obj2).category));
    }

    public static final int compare$7(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InteractStickerStruct) obj).getIndex()), Integer.valueOf(((InteractStickerStruct) obj2).getIndex()));
    }

    public static final int compare$8(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C9I1) obj).LJLIL.getId()), Integer.valueOf(((C9I1) obj2).LJLIL.getId()));
    }

    public static final int compare$9(IDComparatorS32S0000000_4 iDComparatorS32S0000000_4, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C9I1) obj).LJLIL.getId()), Integer.valueOf(((C9I1) obj2).LJLIL.getId()));
    }
}
