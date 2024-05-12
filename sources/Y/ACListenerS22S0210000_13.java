package Y;

import X.C2A7;
import X.C75770ToU;
import X.C80133Vcf;
import X.InterfaceC75774ToY;
import X.InterfaceC88472Yns;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ACListenerS22S0210000_13 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS22S0210000_13 aCListenerS22S0210000_13, View view) {
        if (o.LJ(((C80133Vcf) aCListenerS22S0210000_13.l0).getTag(), Integer.valueOf(view.getId())) && !aCListenerS22S0210000_13.z2) {
            ((C80133Vcf) aCListenerS22S0210000_13.l0).setTag(null);
            ((C2A7) view).LJJLL(R.style.a3f);
            return;
        }
        ((C80133Vcf) aCListenerS22S0210000_13.l0).setTag(Integer.valueOf(view.getId()));
        C80133Vcf c80133Vcf = (C80133Vcf) aCListenerS22S0210000_13.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS22S0210000_13.l1;
        int childCount = c80133Vcf.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c80133Vcf.getChildAt(i);
            o.LJIIIIZZ(childAt, "getChildAt(index)");
            if (childAt.getId() == view.getId()) {
                C2A7 c2a7 = (C2A7) childAt;
                c2a7.LJJLL(R.style.a35);
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Integer.valueOf(c2a7.getId()));
                }
            } else {
                ((C2A7) childAt).LJJLL(R.style.a3f);
            }
        }
    }

    public static final void onClick$1(ACListenerS22S0210000_13 aCListenerS22S0210000_13, View view) {
        C75770ToU.LIZ((C2A7) aCListenerS22S0210000_13.l0, (InterfaceC75774ToY) aCListenerS22S0210000_13.l1, aCListenerS22S0210000_13.z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS22S0210000_13 r19, android.view.View r20) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS22S0210000_13.onClick$2(Y.ACListenerS22S0210000_13, android.view.View):void");
    }

    public ACListenerS22S0210000_13(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
