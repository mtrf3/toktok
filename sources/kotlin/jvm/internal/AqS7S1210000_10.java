package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C109824Ss;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C63067Op5;
import X.C76800UCe;
import X.C9KF;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OQL;
import android.app.Activity;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class AqS7S1210000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AqS7S1210000_10 aqS7S1210000_10, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        String str2 = aqS7S1210000_10.s0;
        C63067Op5 c63067Op5 = (C63067Op5) aqS7S1210000_10.l1;
        Activity activity = (Activity) aqS7S1210000_10.l2;
        c63067Op5.getClass();
        if (C63067Op5.LIZ(activity)) {
            str = "live_take_popup_in_room";
        } else {
            str = "live_take_popup_out_room";
        }
        OQL.LIZ(str2, "cancel", str, aqS7S1210000_10.z3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S1210000_10 aqS7S1210000_10, Object obj) {
        C252709vu view = (C252709vu) obj;
        o.LJIIIZ(view, "view");
        String str = aqS7S1210000_10.s0;
        boolean z = aqS7S1210000_10.z3;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS7S1210000_10.l1;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS7S1210000_10.l2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZ(str);
        c235119Kp.LIZJ = c9kf;
        C234509Ig c234509Ig = new C234509Ig();
        String string = view.getContext().getString(R.string.cg_);
        o.LJIIIIZZ(string, "context.getString(R.string.cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ = new C109824Ss(new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 607));
        c235119Kp.LIZLLL(c234509Ig);
        C234509Ig c234509Ig2 = new C234509Ig();
        String string2 = view.getContext().getString(R.string.exd);
        o.LJIIIIZZ(string2, "context.getString(R.string.done)");
        c234509Ig2.LIZJ = string2;
        c234509Ig2.LJ = z;
        c234509Ig2.LIZ = new C109824Ss(new AqS160S0100000_10(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 608));
        c235119Kp.LIZIZ(c234509Ig2);
        view.setNavActions(c235119Kp);
        view.setNavBackground(0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S1210000_10(String str, C63067Op5 c63067Op5, Activity activity, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c63067Op5;
        this.l2 = activity;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S1210000_10(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z3 = z;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
    }
}
