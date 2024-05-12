package Y;

import X.AbstractC78640Utg;
import X.C53778L8s;
import X.C54296LSq;
import X.C66851QLn;
import X.C78069UkT;
import X.EnumC53761L8b;
import X.EnumC53763L8d;
import X.L9A;
import X.LML;
import X.MMJ;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.followingtab.assem.FollowingBottomTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDComparatorS37S0000000_9 implements Comparator {
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
            default:
                return 0;
        }
    }

    public IDComparatorS37S0000000_9(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        ArrayList<String> arrayList = FollowingBottomTabProtocolAssem.LJLJJLL;
        return C66851QLn.LJFF(Integer.valueOf(arrayList.indexOf(((ISocialTabProtocol) obj).getTag())), Integer.valueOf(arrayList.indexOf(((ISocialTabProtocol) obj2).getTag())));
    }

    public static final int compare$1(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        ArrayList<String> arrayList = FriendsTabProtocolAssem.LJLJJLL;
        return C66851QLn.LJFF(Integer.valueOf(arrayList.indexOf(((ISocialTabProtocol) obj).getTag())), Integer.valueOf(arrayList.indexOf(((ISocialTabProtocol) obj2).getTag())));
    }

    public static final int compare$10(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((L9A) obj).LJLI()), Integer.valueOf(((L9A) obj2).LJLI()));
    }

    public static final int compare$11(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C78069UkT) obj2).LJIIJJI), Integer.valueOf(((C78069UkT) obj).LJIIJJI));
    }

    public static final int compare$12(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EnumC53761L8b) obj).getIndex()), Integer.valueOf(((EnumC53761L8b) obj2).getIndex()));
    }

    public static final int compare$13(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((EnumC53763L8d) obj).getIndex()), Integer.valueOf(((EnumC53763L8d) obj2).getIndex()));
    }

    public static final int compare$14(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        boolean z;
        MatchedFriendStruct matchedFriendStruct = ((User) obj).getMatchedFriendStruct();
        boolean z2 = false;
        if (matchedFriendStruct != null) {
            z = o.LJ(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(!z);
        MatchedFriendStruct matchedFriendStruct2 = ((User) obj2).getMatchedFriendStruct();
        if (matchedFriendStruct2 != null) {
            z2 = o.LJ(matchedFriendStruct2.isNewMaF(), Boolean.TRUE);
        }
        return C66851QLn.LJFF(valueOf, Boolean.valueOf(!z2));
    }

    public static final int compare$2(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((AbstractC78640Utg) obj).LIZ), Integer.valueOf(((AbstractC78640Utg) obj2).LIZ));
    }

    public static final int compare$3(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return ((C54296LSq) obj).LJ - ((C54296LSq) obj2).LJ;
    }

    public static final int compare$4(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((IMUser) obj2).getFollowTime()), Long.valueOf(((IMUser) obj).getFollowTime()));
    }

    public static final int compare$5(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((MMJ) obj).getInterval().LIZIZ), Long.valueOf(((MMJ) obj2).getInterval().LIZIZ));
    }

    public static final int compare$6(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C53778L8s) obj).LJLILLLLZI), Integer.valueOf(((C53778L8s) obj2).LJLILLLLZI));
    }

    public static final int compare$7(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(((LML) obj).LJ(), ((LML) obj2).LJ());
    }

    public static final int compare$8(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(((LML) obj).LJI(), ((LML) obj2).LJI());
    }

    public static final int compare$9(IDComparatorS37S0000000_9 iDComparatorS37S0000000_9, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((L9A) obj).LJLI()), Integer.valueOf(((L9A) obj2).LJLI()));
    }
}
