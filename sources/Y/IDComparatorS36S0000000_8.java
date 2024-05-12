package Y;

import X.C46902Iaw;
import X.C66851QLn;
import X.IZT;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.DeploymentModelV4;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDComparatorS36S0000000_8 implements Comparator {
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
            default:
                return 0;
        }
    }

    public IDComparatorS36S0000000_8(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }

    public static final int compare$1(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        CheckRequestBodyModel.TargetChannel targetChannel = (CheckRequestBodyModel.TargetChannel) obj;
        CheckRequestBodyModel.TargetChannel targetChannel2 = (CheckRequestBodyModel.TargetChannel) obj2;
        if (targetChannel == null) {
            if (targetChannel2 == null) {
                return 0;
            }
            return -1;
        }
        if (targetChannel2 == null) {
            return 1;
        }
        return targetChannel.channelName.compareTo(targetChannel2.channelName);
    }

    public static final int compare$2(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        DeploymentModelV4.V4Group v4Group = (DeploymentModelV4.V4Group) obj;
        DeploymentModelV4.V4Group v4Group2 = (DeploymentModelV4.V4Group) obj2;
        if (v4Group == null) {
            if (v4Group2 == null) {
                return 0;
            }
            return -1;
        }
        if (v4Group2 == null) {
            return 1;
        }
        return v4Group.name.compareTo(v4Group2.name);
    }

    public static final int compare$3(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        return ((SimAudioBitrate) obj).getBitRate() - ((SimAudioBitrate) obj2).getBitRate();
    }

    public static final int compare$4(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        return ((SimBitRate) obj2).getBitRate() - ((SimBitRate) obj).getBitRate();
    }

    public static final int compare$5(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        int i = ((SimBitRate) obj).bitRate;
        int i2 = ((SimBitRate) obj2).bitRate;
        if (i > i2) {
            return -1;
        }
        if (i < i2) {
            return 1;
        }
        return 0;
    }

    public static final int compare$6(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        IZT izt = (IZT) obj;
        IZT izt2 = (IZT) obj2;
        if (izt.getOrder() == izt2.getOrder()) {
            return 0;
        }
        if (izt.getOrder() > izt2.getOrder()) {
            return -1;
        }
        return 1;
    }

    public static final int compare$7(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C46902Iaw) obj2).LJLILLLLZI), Integer.valueOf(((C46902Iaw) obj).LJLILLLLZI));
    }

    public static final int compare$8(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        SimBitRate o1 = (SimBitRate) obj;
        SimBitRate o2 = (SimBitRate) obj2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        return o2.getBitRate() - o1.getBitRate();
    }

    public static final int compare$9(IDComparatorS36S0000000_8 iDComparatorS36S0000000_8, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((Position) obj).begin), Integer.valueOf(((Position) obj2).begin));
    }
}
