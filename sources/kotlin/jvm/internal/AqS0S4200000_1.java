package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C112634bT;
import X.C188727au;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88472Yns;
import X.M5K;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class AqS0S4200000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AqS0S4200000_1 aqS0S4200000_1, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZ().LIZIZ(null);
        String valueOf = String.valueOf(R.string.pjk);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("rule_id", aqS0S4200000_1.s0);
        c188727au.LJIIIZ("push_label", aqS0S4200000_1.s1);
        c188727au.LJIIIZ("anchor_id", aqS0S4200000_1.s2);
        c188727au.LJIIIZ("room_id", aqS0S4200000_1.s3);
        FMX.LJIIL(valueOf, c188727au.LIZ);
        Context context = (Context) aqS0S4200000_1.l4;
        if (context instanceof Activity) {
            M5K.LJIIJJI((Activity) context, (Intent) aqS0S4200000_1.l5);
            ((Activity) ((Context) aqS0S4200000_1.l4)).finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S4200000_1 aqS0S4200000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.pjk, new AqS0S4200000_1(aqS0S4200000_1.s0, aqS0S4200000_1.s1, aqS0S4200000_1.s2, aqS0S4200000_1.s3, (Context) aqS0S4200000_1.l4, (Intent) aqS0S4200000_1.l5, 0));
        actionGroup.LJIIIIZZ(R.string.pjj, new C112634bT(aqS0S4200000_1.s0, aqS0S4200000_1.s1, aqS0S4200000_1.s2, aqS0S4200000_1.s3));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S4200000_1(String str, String str2, String str3, String str4, Context context, Intent intent, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l4 = context;
        this.l5 = intent;
    }
}
