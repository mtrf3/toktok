package Y;

import X.AbstractC186347Ta;
import X.AnonymousClass708;
import X.AnonymousClass744;
import X.C174446sy;
import X.C178406zM;
import X.C71897SJp;
import X.C71Y;
import X.C77123UOp;
import X.C78886Uxe;
import X.C80674VlO;
import X.C8ZC;
import X.GSU;
import X.KL2;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Observer;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AObserverS47S0201000_3 implements Observer {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS47S0201000_3 aObserverS47S0201000_3, Object obj) {
        Integer it = (Integer) obj;
        C80674VlO LJIIJ = ((C8ZC) aObserverS47S0201000_3.l0).LIZ.LJIIJ(aObserverS47S0201000_3.i2);
        if (LJIIJ != null) {
            AbstractC186347Ta abstractC186347Ta = (AbstractC186347Ta) aObserverS47S0201000_3.l1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(abstractC186347Ta.LIZ().pageTitle);
            LIZ.append(' ');
            LIZ.append(C77123UOp.LJJIIJ(it.intValue()));
            LJIIJ.LIZJ = X1D.LIZIZ(LIZ);
            LJIIJ.LIZIZ();
        }
        Map<String, Integer> map = ((C8ZC) aObserverS47S0201000_3.l0).LIZLLL;
        String str = ((AbstractC186347Ta) aObserverS47S0201000_3.l1).LIZ().mobKey;
        o.LJIIIIZZ(it, "it");
        map.put(str, it);
    }

    public static final void onChanged$1(AObserverS47S0201000_3 aObserverS47S0201000_3, Object obj) {
        float f;
        int i;
        AnonymousClass708 anonymousClass708;
        switch (aObserverS47S0201000_3.i2) {
            case 0:
                AnonymousClass744 anonymousClass744 = (AnonymousClass744) aObserverS47S0201000_3.l0;
                View view = (View) aObserverS47S0201000_3.l1;
                Boolean bool = (Boolean) obj;
                if (anonymousClass744.LJLJJLL != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass744.LJLJJI.getLayoutParams();
                    Context context = view.getContext();
                    if (bool.booleanValue()) {
                        f = 12.0f;
                    } else {
                        f = 0.0f;
                    }
                    marginLayoutParams.setMarginStart((int) KL2.LIZJ(context, f));
                    anonymousClass744.LJLJJI.setLayoutParams(marginLayoutParams);
                    C71897SJp c71897SJp = anonymousClass744.LJLJJLL;
                    if (bool.booleanValue()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    c71897SJp.setVisibility(i);
                    if (bool.booleanValue()) {
                        AnonymousClass708 anonymousClass7082 = anonymousClass744.LLD;
                        if (anonymousClass7082 != null) {
                            anonymousClass7082.setVisibility(8);
                        }
                    } else if (!anonymousClass744.LLIIJLIL && C178406zM.LJIIJ(anonymousClass744.LJLLLLLL)) {
                        AnonymousClass708 anonymousClass7083 = anonymousClass744.LLD;
                        if (anonymousClass7083 != null) {
                            anonymousClass7083.setVisibility(8);
                        }
                    } else {
                        if (!C174446sy.LIZLLL(anonymousClass744.LJLILLLLZI) && (anonymousClass708 = anonymousClass744.LLD) != null) {
                            anonymousClass708.setVisibility(0);
                        }
                        anonymousClass744.a0();
                    }
                    C71Y.LIZ("unPin", "managementStatus");
                    C78886Uxe.LJJLIIIJ(-2, anonymousClass744.LJLJLJ);
                    return;
                }
                return;
            default:
                GSU gsu = (GSU) aObserverS47S0201000_3.l0;
                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = (ViewTreeObserver.OnWindowFocusChangeListener) aObserverS47S0201000_3.l1;
                if (((Boolean) obj).booleanValue() && !gsu.LJLLI) {
                    gsu.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
                    return;
                }
                return;
        }
    }

    public AObserverS47S0201000_3(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
