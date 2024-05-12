package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C61780OMm;
import X.C76800UCe;
import X.C80796VnM;
import X.EnumC61773OMf;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public class AqS0S0203000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0203000_10 aqS0S0203000_10, Object it) {
        o.LJIIIZ(it, "it");
        C61780OMm.LIZ((Aweme) aqS0S0203000_10.l0, EnumC61773OMf.SUBMIT, (C80796VnM) aqS0S0203000_10.l1, aqS0S0203000_10.i2, aqS0S0203000_10.i3, aqS0S0203000_10.i4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0203000_10 aqS0S0203000_10, Object it) {
        o.LJIIIZ(it, "it");
        C61780OMm.LIZ((Aweme) aqS0S0203000_10.l0, EnumC61773OMf.CANCEL, (C80796VnM) aqS0S0203000_10.l1, aqS0S0203000_10.i2, aqS0S0203000_10.i3, aqS0S0203000_10.i4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0203000_10(Aweme aweme, C80796VnM c80796VnM, int i, int i2, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.l0 = aweme;
        this.l1 = c80796VnM;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }
}
