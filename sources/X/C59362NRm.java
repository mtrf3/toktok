package X;

import Y.IDObjectS331S0100000_10;
import Y.IDObjectS4S0101000_10;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.NRm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59362NRm implements AnonymousClass954 {
    public final ViewGroup LIZ;
    public View LIZIZ;
    public boolean LIZJ;

    @Override // X.C95T
    public final int LIZIZ() {
        return C8ON.LIZIZ();
    }

    public final View LJI() {
        ViewParent viewParent;
        ViewParent parent;
        if (!this.LIZJ) {
            View findViewById = this.LIZ.findViewById(R.id.gtc);
            View view = null;
            if (findViewById != null && (parent = findViewById.getParent()) != null) {
                viewParent = parent.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof View) {
                view = (View) viewParent;
            }
            this.LIZIZ = view;
            this.LIZJ = true;
        }
        return this.LIZIZ;
    }

    public C59362NRm(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.C95T
    public final void LIZJ(float f) {
        View LJI = LJI();
        if (LJI == null) {
            return;
        }
        LJI.setAlpha(f);
    }

    @Override // X.C95T
    public final void LJ(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View LJI = LJI();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (LJI != null) {
            layoutParams = LJI.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        View LJI2 = LJI();
        if (LJI2 == null) {
            return;
        }
        View LJI3 = LJI();
        if (LJI3 != null) {
            layoutParams2 = LJI3.getLayoutParams();
        }
        LJI2.setLayoutParams(layoutParams2);
    }

    @Override // X.C95T
    public final void LJFF(int i) {
        View LJI = LJI();
        if (LJI == null) {
            return;
        }
        LJI.setVisibility(i);
    }

    @Override // X.AnonymousClass954
    public final void LIZ(int i, InterfaceC88472Yns<? super View, Boolean> interfaceC88472Yns) {
        IDObjectS331S0100000_10 iDObjectS331S0100000_10 = new IDObjectS331S0100000_10(this.LIZ, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS331S0100000_10.iterator();
        while (true) {
            IDObjectS4S0101000_10 iDObjectS4S0101000_10 = (IDObjectS4S0101000_10) it;
            if (!iDObjectS4S0101000_10.hasNext()) {
                break;
            }
            Object next = iDObjectS4S0101000_10.next();
            if (interfaceC88472Yns.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setVisibility(i);
            view.requestLayout();
            arrayList2.add(C76800UCe.LIZ);
        }
    }

    @Override // X.AnonymousClass954
    public final void LIZLLL(float f, InterfaceC88472Yns<? super View, Boolean> interfaceC88472Yns) {
        IDObjectS331S0100000_10 iDObjectS331S0100000_10 = new IDObjectS331S0100000_10(this.LIZ, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS331S0100000_10.iterator();
        while (true) {
            IDObjectS4S0101000_10 iDObjectS4S0101000_10 = (IDObjectS4S0101000_10) it;
            if (!iDObjectS4S0101000_10.hasNext()) {
                break;
            }
            Object next = iDObjectS4S0101000_10.next();
            if (interfaceC88472Yns.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setAlpha(f);
            arrayList2.add(C76800UCe.LIZ);
        }
    }
}
