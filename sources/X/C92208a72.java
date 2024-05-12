package X;

import android.graphics.Color;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.a72, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92208a72 implements InterfaceC91815a0h {
    public final /* synthetic */ BillHomeFragment LIZ;

    public C92208a72(BillHomeFragment billHomeFragment) {
        this.LIZ = billHomeFragment;
    }

    @Override // X.InterfaceC91815a0h
    public final void LIZ(int i) {
        int i2;
        Integer num;
        int i3 = BillHomeFragment.LJLJJLL;
        if (i > i3) {
            i2 = 255;
        } else {
            i2 = (int) ((i * 255.0f) / i3);
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 110) {
            i2 = 255;
        }
        if (i2 != C91891a1v.LIZLLL) {
            C91891a1v.LIZLLL = i2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bnpl_home_alpha ");
            LIZ.append(i2);
            C91931a2Z.LIZ(X1D.LIZIZ(LIZ));
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (mo49getActivity != null) {
                num = C79045V0n.LJI(R.attr.cl, mo49getActivity);
            } else {
                num = null;
            }
            if (num != null) {
                BillHomeFragment billHomeFragment = this.LIZ;
                int intValue = num.intValue();
                int argb = Color.argb(C91891a1v.LIZLLL, (intValue >> 16) & 255, (intValue >> 8) & 255, intValue & 255);
                C61713OJx LIZIZ = C61712OJw.LIZIZ(billHomeFragment);
                LIZIZ.LJIIIIZZ(argb);
                LIZIZ.LIZJ();
                ((C252709vu) billHomeFragment._$_findCachedViewById(R.id.hs)).setNavBackground(argb);
            }
            if (!C91891a1v.LJ) {
                if (C91891a1v.LIZLLL > 50) {
                    List list = (List) BillHomeAssem.LJLJJLL.getValue();
                    BillHomeFragment billHomeFragment2 = this.LIZ;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        View LJI = ((C252709vu) billHomeFragment2._$_findCachedViewById(R.id.hs)).LJI(it.next());
                        if (LJI != null) {
                            ((TuxIconView) LJI).setTintColorRes(R.attr.go);
                        }
                    }
                    C61713OJx LIZIZ2 = C61712OJw.LIZIZ(this.LIZ);
                    LIZIZ2.LIZ(true);
                    LIZIZ2.LIZJ();
                    return;
                }
                List list2 = (List) BillHomeAssem.LJLJJLL.getValue();
                BillHomeFragment billHomeFragment3 = this.LIZ;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    View LJI2 = ((C252709vu) billHomeFragment3._$_findCachedViewById(R.id.hs)).LJI(it2.next());
                    if (LJI2 != null) {
                        ((TuxIconView) LJI2).setTintColorRes(R.attr.dj);
                    }
                }
                C61713OJx LIZIZ3 = C61712OJw.LIZIZ(this.LIZ);
                LIZIZ3.LIZ(false);
                LIZIZ3.LIZIZ.LJIIJ(false);
                LIZIZ3.LIZJ();
            }
        }
    }
}
