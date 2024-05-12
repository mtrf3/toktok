package Y;

import X.C109544Rq;
import X.C59259NNn;
import X.C66851QLn;
import X.InterfaceC62480Ofc;
import X.InterfaceC63520OwO;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.model.Range;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import java.util.Comparator;

/* loaded from: classes11.dex */
public class IDComparatorS38S0000000_10 implements Comparator {
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
            case 19:
                return compare$19(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS38S0000000_10(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return ((String) obj).compareTo((String) obj2);
    }

    public static final int compare$1(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$10(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$11(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$12(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$13(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$14(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0.booleanValue() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$15(Y.IDComparatorS38S0000000_10 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope r3 = (com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope) r3
            java.lang.Boolean r0 = r3.getScopeRequired()
            r2 = 0
            if (r0 == 0) goto L16
            java.lang.Boolean r0 = r3.getScopeRequired()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3a
        L16:
            r0 = 1
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope r4 = (com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope) r4
            java.lang.Boolean r0 = r4.getScopeRequired()
            if (r0 == 0) goto L30
            java.lang.Boolean r0 = r4.getScopeRequired()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L31
        L30:
            r2 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            int r0 = X.C66851QLn.LJFF(r1, r0)
            return r0
        L3a:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS38S0000000_10.compare$15(Y.IDComparatorS38S0000000_10, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$16(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((ShareItemOrderBean) obj).LIZ()), Integer.valueOf(((ShareItemOrderBean) obj2).LIZ()));
    }

    public static final int compare$17(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return ((InterfaceC63520OwO) obj).getPriority().compareTo(((InterfaceC63520OwO) obj2).getPriority());
    }

    public static final int compare$18(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return Integer.compare(((int[]) obj)[0], ((int[]) obj2)[0]);
    }

    public static final int compare$19(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((Option) obj).getId()), Integer.valueOf(((Option) obj2).getId()));
    }

    public static final int compare$2(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$3(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        long j = ((Range) obj).start;
        long j2 = ((Range) obj2).start;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$4(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        C109544Rq c109544Rq = (C109544Rq) obj;
        C109544Rq c109544Rq2 = (C109544Rq) obj2;
        if (c109544Rq.getOrderIndex() < c109544Rq2.getOrderIndex()) {
            return -1;
        }
        if (c109544Rq.getOrderIndex() == c109544Rq2.getOrderIndex()) {
            return 0;
        }
        return 1;
    }

    public static final int compare$5(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        C109544Rq c109544Rq = (C109544Rq) obj;
        C109544Rq c109544Rq2 = (C109544Rq) obj2;
        if (c109544Rq.getOrderIndex() < c109544Rq2.getOrderIndex()) {
            return 1;
        }
        if (c109544Rq.getOrderIndex() == c109544Rq2.getOrderIndex()) {
            return 0;
        }
        return -1;
    }

    public static final int compare$6(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((IPNSConsentHandlerService) obj).getPriority().getV()), Integer.valueOf(((IPNSConsentHandlerService) obj2).getPriority().getV()));
    }

    public static final int compare$7(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InterfaceC62480Ofc) obj).getLayoutPriority().ordinal()), Integer.valueOf(((InterfaceC62480Ofc) obj2).getLayoutPriority().ordinal()));
    }

    public static final int compare$8(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$9(IDComparatorS38S0000000_10 iDComparatorS38S0000000_10, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C59259NNn) obj).byWrapper ? 1 : 0), Integer.valueOf(((C59259NNn) obj2).byWrapper ? 1 : 0));
    }
}
