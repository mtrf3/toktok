package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C229198z5;
import X.C68322mC;
import X.C76800UCe;
import X.EnumC228828yU;
import X.InterfaceC229218z7;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS0S2400000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS0S2400000_3 aqS0S2400000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q1m, new AqS0S2400000_3((Activity) aqS0S2400000_3.l2, (Aweme) aqS0S2400000_3.l3, (C68322mC) aqS0S2400000_3.l4, (InterfaceC229218z7) aqS0S2400000_3.l5, aqS0S2400000_3.s0, aqS0S2400000_3.s1, 1));
        actionGroup.LJIIIIZZ(R.string.cg_, new AqS169S0100000_3((InterfaceC229218z7) aqS0S2400000_3.l5, 268));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS0S2400000_3 aqS0S2400000_3, Object it) {
        o.LJIIIZ(it, "it");
        C229198z5.LIZ(EnumC228828yU.VIDEOREMOVE.getOperation(), (Activity) aqS0S2400000_3.l2, (Aweme) aqS0S2400000_3.l3, (InterfaceC229218z7) aqS0S2400000_3.l5, (String) ((C68322mC) aqS0S2400000_3.l4).element, aqS0S2400000_3.s0, aqS0S2400000_3.s1, false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S2400000_3(Activity activity, Activity activity2, Aweme aweme, C68322mC<String> c68322mC, InterfaceC229218z7 interfaceC229218z7, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = activity;
        this.l3 = activity2;
        this.l4 = aweme;
        this.l5 = c68322mC;
        this.s0 = interfaceC229218z7;
        this.s1 = str;
    }
}
