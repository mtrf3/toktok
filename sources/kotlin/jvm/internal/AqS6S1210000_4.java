package kotlin.jvm.internal;

import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C76800UCe;
import X.C9KF;
import X.C9LO;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowerComponent;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;

/* loaded from: classes5.dex */
public class AqS6S1210000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$0(X.C9LO r8) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS6S1210000_4.invoke$0(X.9LO):void");
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS6S1210000_4 aqS6S1210000_4, Object obj) {
        aqS6S1210000_4.invoke$0((C9LO) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S1210000_4 aqS6S1210000_4, Object obj) {
        C252709vu it = (C252709vu) obj;
        o.LJIIIZ(it, "it");
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_clockwise;
        LIZJ.LJI = aqS6S1210000_4.z3;
        LIZJ.LIZIZ((InterfaceC65784Pro) aqS6S1210000_4.l1);
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZ(aqS6S1210000_4.s0);
        c235119Kp.LIZJ = LIZLLL;
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark_small;
        LIZJ2.LIZIZ((InterfaceC65784Pro) aqS6S1210000_4.l2);
        c235119Kp.LIZIZ(LIZJ2);
        c235119Kp.LIZLLL = true;
        it.setNavActions(c235119Kp);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1210000_4(ActivityC45651qj activityC45651qj, RelationFollowerComponent relationFollowerComponent, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityC45651qj;
        this.l2 = relationFollowerComponent;
        this.z3 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1210000_4(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
    }
}
