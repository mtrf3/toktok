package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailHeaderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A42 implements C07G {
    public final /* synthetic */ PaidContentCollectionDetailHeaderAssem LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public A42(PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem, Context context) {
        this.LJLIL = paidContentCollectionDetailHeaderAssem;
        this.LJLILLLLZI = context;
    }

    @Override // X.C07G
    public final void LIZ(C45631qh view, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        Integer LJI;
        Integer LJI2;
        Context context;
        Integer LJI3;
        A3P value;
        o.LJIIIZ(view, "view");
        View findViewById = this.LJLIL.x3().findViewById(R.id.gwk);
        int LJIIJJI = KL2.LJIIJJI(this.LJLILLLLZI);
        PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem = this.LJLIL;
        Context context2 = this.LJLILLLLZI;
        paidContentCollectionDetailHeaderAssem.getClass();
        int measuredHeight = (LJIIJJI - ((int) (context2.getResources().getDisplayMetrics().density * 22))) - this.LJLIL.x3().getMeasuredHeight();
        int LJIIJJI2 = KL2.LJIIJJI(this.LJLILLLLZI) - this.LJLIL.x3().getMeasuredHeight();
        int LJIIJJI3 = KL2.LJIIJJI(this.LJLILLLLZI);
        PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem2 = this.LJLIL;
        Context context3 = this.LJLILLLLZI;
        paidContentCollectionDetailHeaderAssem2.getClass();
        int measuredHeight2 = (LJIIJJI3 + ((int) (context3.getResources().getDisplayMetrics().density * 40))) - this.LJLIL.x3().getMeasuredHeight();
        if (view.getScrollY() > measuredHeight2) {
            PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem3 = this.LJLIL;
            CollectionDetailModel collectionDetailModel = paidContentCollectionDetailHeaderAssem3.LJLJJI;
            if (collectionDetailModel != null) {
                C252709vu x3 = paidContentCollectionDetailHeaderAssem3.x3();
                C9KF c9kf = new C9KF();
                c9kf.LIZ(collectionDetailModel.getCollectionName());
                x3.LJIILLIIL(c9kf);
            }
            findViewById.setAlpha(1.0f);
        } else {
            PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem4 = this.LJLIL;
            Context context4 = this.LJLILLLLZI;
            paidContentCollectionDetailHeaderAssem4.getClass();
            int i5 = ((int) (context4.getResources().getDisplayMetrics().density * 16)) + LJIIJJI2;
            int scrollY = view.getScrollY();
            if (i5 <= scrollY && scrollY <= measuredHeight2) {
                PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem5 = this.LJLIL;
                CollectionDetailModel collectionDetailModel2 = paidContentCollectionDetailHeaderAssem5.LJLJJI;
                if (collectionDetailModel2 != null) {
                    C252709vu x32 = paidContentCollectionDetailHeaderAssem5.x3();
                    C9KF c9kf2 = new C9KF();
                    c9kf2.LIZ(collectionDetailModel2.getCollectionName());
                    x32.LJIILLIIL(c9kf2);
                    findViewById.setAlpha(((view.getScrollY() - LJIIJJI2) * 1.0f) / (measuredHeight2 - LJIIJJI2));
                }
            } else {
                PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem6 = this.LJLIL;
                if (paidContentCollectionDetailHeaderAssem6.LJLJJI != null) {
                    C252709vu x33 = paidContentCollectionDetailHeaderAssem6.x3();
                    C9KF c9kf3 = new C9KF();
                    c9kf3.LIZJ = "";
                    x33.LJIILLIIL(c9kf3);
                }
            }
        }
        if (A3E.LIZ() && (value = this.LJLIL.v3().LJLLI.getValue()) != null) {
            value.LJJLL();
        }
        int scrollY2 = view.getScrollY();
        if (scrollY2 >= 0 && scrollY2 <= measuredHeight) {
            z = true;
        } else {
            z = false;
        }
        int i6 = R.style.ux;
        if (z) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this.LJLIL);
            if (LIZ != null) {
                PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem7 = this.LJLIL;
                C61713OJx LIZJ = C61712OJw.LIZJ(LIZ);
                LIZJ.LIZIZ.LJIIJ(false);
                LIZJ.LIZ(false);
                LIZJ.LIZIZ.LJIIL();
                LIZJ.LIZJ();
                paidContentCollectionDetailHeaderAssem7.x3().LJIILL(R.style.ux);
                paidContentCollectionDetailHeaderAssem7.x3().setNavBackground(0);
                paidContentCollectionDetailHeaderAssem7.x3().setBackgroundColor(0);
                paidContentCollectionDetailHeaderAssem7.x3().setAlpha(1.0f);
                return;
            }
            return;
        }
        int scrollY3 = view.getScrollY();
        if (measuredHeight <= scrollY3 && scrollY3 <= LJIIJJI2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this.LJLIL);
            if (LIZ2 != null && (context = this.LJLIL.getContext()) != null && (LJI3 = C79045V0n.LJI(R.attr.cl, context)) != null) {
                LJI3.intValue();
                C61713OJx LIZJ2 = C61712OJw.LIZJ(LIZ2);
                LIZJ2.LIZIZ.LJIIJ(!AnonymousClass636.LJIILJJIL(LIZ2));
                LIZJ2.LIZ(false);
                LIZJ2.LIZIZ.LJIIL();
                LIZJ2.LIZJ();
            }
            if (C212428Vi.LIZ(this.LJLIL) == null) {
                return;
            }
            PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem8 = this.LJLIL;
            Context context5 = this.LJLILLLLZI;
            C252709vu x34 = paidContentCollectionDetailHeaderAssem8.x3();
            o.LJIIIZ(context5, "<this>");
            if (!AnonymousClass636.LJIILJJIL(context5)) {
                i6 = R.style.ul;
            }
            x34.LJIILL(i6);
            Context context6 = paidContentCollectionDetailHeaderAssem8.getContext();
            if (context6 != null && (LJI2 = C79045V0n.LJI(R.attr.cl, context6)) != null) {
                int intValue = LJI2.intValue();
                paidContentCollectionDetailHeaderAssem8.x3().setNavBackground(intValue);
                paidContentCollectionDetailHeaderAssem8.x3().setBackgroundColor(intValue);
            }
            paidContentCollectionDetailHeaderAssem8.x3().setAlpha(((view.getScrollY() - measuredHeight) * 1.0f) / (LJIIJJI2 - measuredHeight));
            return;
        }
        if (C212428Vi.LIZ(this.LJLIL) != null) {
            PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem9 = this.LJLIL;
            Context context7 = this.LJLILLLLZI;
            C252709vu x35 = paidContentCollectionDetailHeaderAssem9.x3();
            o.LJIIIZ(context7, "<this>");
            if (!AnonymousClass636.LJIILJJIL(context7)) {
                i6 = R.style.ul;
            }
            x35.LJIILL(i6);
            Context context8 = paidContentCollectionDetailHeaderAssem9.getContext();
            if (context8 != null && (LJI = C79045V0n.LJI(R.attr.cl, context8)) != null) {
                int intValue2 = LJI.intValue();
                paidContentCollectionDetailHeaderAssem9.x3().setNavBackground(intValue2);
                paidContentCollectionDetailHeaderAssem9.x3().setBackgroundColor(intValue2);
            }
            paidContentCollectionDetailHeaderAssem9.x3().setAlpha(1.0f);
        }
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this.LJLIL);
        if (LIZ3 == null) {
            return;
        }
        C61713OJx LIZJ3 = C61712OJw.LIZJ(LIZ3);
        LIZJ3.LIZIZ.LJIIJ(!AnonymousClass636.LJIILJJIL(LIZ3));
        LIZJ3.LJII(R.attr.cl);
        LIZJ3.LIZ(false);
        LIZJ3.LIZJ();
    }
}
