package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C38350F3i;
import X.C59127NIl;
import X.InterfaceC88471Ynr;

/* loaded from: classes11.dex */
public class AqS16S2000000_10 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S2000000_10(String str, String str2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }

    public static final Object invoke$0(AqS16S2000000_10 aqS16S2000000_10, Object obj, Object obj2) {
        C59127NIl track = (C59127NIl) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(track, "$this$track");
        if (booleanValue) {
            track.LIZLLL = aqS16S2000000_10.s0;
        } else {
            String adId = aqS16S2000000_10.s1;
            o.LJIIIIZZ(adId, "adId");
            track.LJ.LIZ("ad_id", C38350F3i.LJJIZ(adId));
        }
        return track;
    }

    public static final Object invoke$1(AqS16S2000000_10 aqS16S2000000_10, Object obj, Object obj2) {
        Long l;
        C59127NIl track = (C59127NIl) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(track, "$this$track");
        if (booleanValue) {
            track.LIZLLL = aqS16S2000000_10.s0;
        } else {
            String str = aqS16S2000000_10.s1;
            if (str != null) {
                l = C38350F3i.LJJIZ(str);
            } else {
                l = null;
            }
            track.LJ.LIZ("ad_id", l);
        }
        return track;
    }
}
