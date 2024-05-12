package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC86124Xr6;
import X.InterfaceC88473Ynt;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* loaded from: classes16.dex */
public class IDqS17S0101000_15 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S0101000_15(int i, Intent intent, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S0101000_15(int i, KeyEvent keyEvent, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = keyEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS17S0101000_15(Activity activity, int i, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }

    public static final Object invoke$0(IDqS17S0101000_15 iDqS17S0101000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        checkAndExecute.setContentView((Activity) iDqS17S0101000_15.l0, iDqS17S0101000_15.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS17S0101000_15 iDqS17S0101000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        checkAndExecute.onActivityReenter(iDqS17S0101000_15.i1, (Intent) iDqS17S0101000_15.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r5.booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.IDqS17S0101000_15 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.Xr6 r3 = (X.InterfaceC86124Xr6) r3
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.String r0 = "$this$checkAndExecute"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int r1 = r2.i1
            java.lang.Object r0 = r2.l0
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            boolean r0 = r3.onKeyDown(r1, r0)
            if (r0 != 0) goto L23
            r1 = 0
            if (r5 == 0) goto L24
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L24
        L23:
            r1 = 1
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS17S0101000_15.invoke$2(kotlin.jvm.internal.IDqS17S0101000_15, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
