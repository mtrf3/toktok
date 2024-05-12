package Y;

import X.AbstractC792639e;
import X.C109544Rq;
import X.C3ML;
import X.C3QL;
import X.C63120Opw;
import X.C66851QLn;
import X.C771931f;
import X.C85983Za;
import X.C86023Ze;
import X.C86804Y4y;
import X.C88333dN;
import X.EnumC772331j;
import X.ORZ;
import X.OSZ;
import X.X1D;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDComparatorS29S0000000_1 implements Comparator {
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
            case 23:
                return compare$23(this, t, t2);
            case 24:
                return compare$24(this, t, t2);
            case 25:
                return compare$25(this, t, t2);
            case 26:
                return compare$26(this, t, t2);
            case 27:
                return compare$27(this, t, t2);
            case 28:
                return compare$28(this, t, t2);
            case 29:
                return compare$29(this, t, t2);
            case 30:
                return compare$30(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS29S0000000_1(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((AuthorizedScope) obj).getScopeRequired(), ((AuthorizedScope) obj2).getScopeRequired());
    }

    public static final int compare$1(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((ActivityStatus) obj).userID, ((ActivityStatus) obj2).userID);
    }

    public static final int compare$10(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((OSZ) obj).getSecond(), (Integer) ((OSZ) obj2).getSecond());
    }

    public static final int compare$11(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C86804Y4y) obj).LJLILLLLZI, ((C86804Y4y) obj2).LJLILLLLZI);
    }

    public static final int compare$12(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        Boolean scopeRequired = ((AuthorizedScope) obj).getScopeRequired();
        Boolean bool = Boolean.FALSE;
        return C66851QLn.LJFF(Boolean.valueOf(!o.LJ(scopeRequired, bool)), Boolean.valueOf(!o.LJ(((AuthorizedScope) obj2).getScopeRequired(), bool)));
    }

    public static final int compare$13(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$14(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C85983Za.LIZ(((C86023Ze) obj).LJLJI)), Integer.valueOf(C85983Za.LIZ(((C86023Ze) obj2).LJLJI)));
    }

    public static final int compare$15(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(C85983Za.LIZ(((C86023Ze) obj).LJLJI)), Integer.valueOf(C85983Za.LIZ(((C86023Ze) obj2).LJLJI)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$16(Y.IDComparatorS29S0000000_1 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS29S0000000_1.compare$16(Y.IDComparatorS29S0000000_1, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$17(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        C3QL c3ql = (C3QL) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c3ql.LIZIZ);
        LIZ.append('_');
        LIZ.append(c3ql.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C3QL c3ql2 = (C3QL) obj2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c3ql2.LIZIZ);
        LIZ2.append('_');
        LIZ2.append(c3ql2.LIZJ);
        return C66851QLn.LJFF(LIZIZ, X1D.LIZIZ(LIZ2));
    }

    public static final int compare$18(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((IMUser) obj2).getFollowStatus()), Integer.valueOf(((IMUser) obj).getFollowStatus()));
    }

    public static final int compare$19(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
    }

    public static final int compare$2(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((RecyclerView.ViewHolder) obj).getLayoutPosition()), Integer.valueOf(((RecyclerView.ViewHolder) obj2).getLayoutPosition()));
    }

    public static final int compare$20(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        int i;
        int followStatus = ((User) obj).getFollowStatus();
        int i2 = 0;
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 4) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else {
                i = 1;
            }
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        int followStatus2 = ((User) obj2).getFollowStatus();
        if (followStatus2 != 0) {
            if (followStatus2 != 1) {
                if (followStatus2 != 4) {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
        } else {
            i2 = -1;
        }
        return C66851QLn.LJFF(valueOf, Integer.valueOf(i2));
    }

    public static final int compare$21(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((AbstractC792639e) obj).LIZIZ()), Integer.valueOf(((AbstractC792639e) obj2).LIZIZ()));
    }

    public static final int compare$22(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Boolean.valueOf(!o.LJ(obj, "default")), Boolean.valueOf(!o.LJ(obj2, "default")));
    }

    public static final int compare$23(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C3ML) obj2).LJLIL), Integer.valueOf(((C3ML) obj).LJLIL));
    }

    public static final int compare$24(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C63120Opw) obj2).getUpdatedTime()), Long.valueOf(((C63120Opw) obj).getUpdatedTime()));
    }

    public static final int compare$25(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        C109544Rq lastShowMessage;
        long index;
        C109544Rq lastShowMessage2;
        C771931f c771931f = (C771931f) obj2;
        EnumC772331j enumC772331j = c771931f.LIZ;
        EnumC772331j enumC772331j2 = EnumC772331j.MESSAGE;
        long j = 0;
        if (enumC772331j == enumC772331j2) {
            C109544Rq c109544Rq = c771931f.LIZJ;
            if (c109544Rq != null) {
                index = c109544Rq.getIndex();
            }
            index = 0;
        } else {
            C63120Opw c63120Opw = c771931f.LIZLLL;
            if (c63120Opw != null && (lastShowMessage = c63120Opw.getLastShowMessage()) != null) {
                index = lastShowMessage.getIndex();
            }
            index = 0;
        }
        Long valueOf = Long.valueOf(index);
        C771931f c771931f2 = (C771931f) obj;
        if (c771931f2.LIZ == enumC772331j2) {
            C109544Rq c109544Rq2 = c771931f2.LIZJ;
            if (c109544Rq2 != null) {
                j = c109544Rq2.getIndex();
            }
        } else {
            C63120Opw c63120Opw2 = c771931f2.LIZLLL;
            if (c63120Opw2 != null && (lastShowMessage2 = c63120Opw2.getLastShowMessage()) != null) {
                j = lastShowMessage2.getIndex();
            }
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j));
    }

    public static final int compare$26(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        long j;
        C109544Rq lastShowMessage = ((C63120Opw) obj2).getLastShowMessage();
        long j2 = 0;
        if (lastShowMessage != null) {
            j = lastShowMessage.getIndex();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        C109544Rq lastShowMessage2 = ((C63120Opw) obj).getLastShowMessage();
        if (lastShowMessage2 != null) {
            j2 = lastShowMessage2.getIndex();
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(j2));
    }

    public static final int compare$27(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
    }

    public static final int compare$28(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return C66851QLn.LJFF(0, 0);
    }

    public static final int compare$29(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((Aweme) obj2).getAid(), ((Aweme) obj).getAid());
    }

    public static final int compare$3(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((RecyclerView.ViewHolder) obj).getLayoutPosition()), Integer.valueOf(((RecyclerView.ViewHolder) obj2).getLayoutPosition()));
    }

    public static final int compare$30(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF((Integer) ((OSZ) obj).getFirst(), (Integer) ((OSZ) obj2).getFirst());
    }

    public static final int compare$4(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        obj2.getClass();
        obj.getClass();
        return C66851QLn.LJFF(0L, 0L);
    }

    public static final int compare$5(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        obj2.getClass();
        obj.getClass();
        return C66851QLn.LJFF(0L, 0L);
    }

    public static final int compare$6(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return Long.compare(((C109544Rq) obj2).getOrderIndex(), ((C109544Rq) obj).getOrderIndex());
    }

    public static final int compare$7(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        long sortOrder = ((C63120Opw) obj2).getSortOrder() - ((C63120Opw) obj).getSortOrder();
        if (sortOrder > 0) {
            return 1;
        }
        if (sortOrder < 0) {
            return -1;
        }
        return 0;
    }

    public static final int compare$8(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        Long l;
        SellerMessage sellerMessage;
        SellerMessage sellerMessage2;
        List<SellerMessage> list = ((C88333dN) obj2).LIZIZ.messages;
        Long l2 = null;
        if (list != null && (sellerMessage2 = (SellerMessage) ORZ.LLFII(list)) != null) {
            l = sellerMessage2.createTime;
        } else {
            l = null;
        }
        List<SellerMessage> list2 = ((C88333dN) obj).LIZIZ.messages;
        if (list2 != null && (sellerMessage = (SellerMessage) ORZ.LLFII(list2)) != null) {
            l2 = sellerMessage.createTime;
        }
        return C66851QLn.LJFF(l, l2);
    }

    public static final int compare$9(IDComparatorS29S0000000_1 iDComparatorS29S0000000_1, Object obj, Object obj2) {
        return C66851QLn.LJFF(((IMContact) obj).getDisplayName(), ((IMContact) obj2).getDisplayName());
    }
}
