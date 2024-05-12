package Y;

import X.AnonymousClass195;
import X.C03Q;
import X.C14560hg;
import X.C19920qK;
import X.C19980qQ;
import X.C54232Ax;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes.dex */
public class IDCListenerS250S0100000 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS250S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS250S0100000 iDCListenerS250S0100000, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) iDCListenerS250S0100000.l0;
        if (anonymousClass195.LLFF.getWidth() > 1) {
            Resources resources = anonymousClass195.getContext().getResources();
            int paddingLeft = anonymousClass195.LJZ.getPaddingLeft();
            Rect rect = new Rect();
            boolean LIZ = C03Q.LIZ(anonymousClass195);
            if (anonymousClass195.LLIILII) {
                i9 = resources.getDimensionPixelSize(R.dimen.ce) + resources.getDimensionPixelSize(R.dimen.cd);
            } else {
                i9 = 0;
            }
            anonymousClass195.LJLLLLLL.getDropDownBackground().getPadding(rect);
            if (LIZ) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            anonymousClass195.LJLLLLLL.setDropDownHorizontalOffset(i10);
            anonymousClass195.LJLLLLLL.setDropDownWidth((((anonymousClass195.LLFF.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
        }
    }

    public static final void onLayoutChange$1(IDCListenerS250S0100000 iDCListenerS250S0100000, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LiveBaseSheetDialog liveBaseSheetDialog = (LiveBaseSheetDialog) iDCListenerS250S0100000.l0;
        if (liveBaseSheetDialog.LJLJJI == null) {
            liveBaseSheetDialog.LJIJJLI();
        }
        if (liveBaseSheetDialog.LJLJJI.LJIJI == 3) {
            ((LiveBaseSheetDialog) iDCListenerS250S0100000.l0).LJLLLLLL.setOffset(1.0f);
        } else {
            ((LiveBaseSheetDialog) iDCListenerS250S0100000.l0).LJLLLLLL.setOffset(0.0f);
        }
        ((LiveBaseSheetDialog) iDCListenerS250S0100000.l0).LJLLLLLL.removeOnLayoutChangeListener(iDCListenerS250S0100000);
    }

    public static final void onLayoutChange$2(IDCListenerS250S0100000 iDCListenerS250S0100000, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((LiveBottomSheetDialog) iDCListenerS250S0100000.l0).LJIJJ();
        ((LiveBottomSheetDialog) iDCListenerS250S0100000.l0).LJLJJL.removeOnLayoutChangeListener(iDCListenerS250S0100000);
    }

    public static final void onLayoutChange$3(IDCListenerS250S0100000 iDCListenerS250S0100000, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C14560hg c14560hg = (C14560hg) iDCListenerS250S0100000.l0;
        View view2 = c14560hg.LJ;
        if (view2 != null) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            List<Rect> LIZ = c14560hg.LIZ(c14560hg.LJFF);
            if (view2 instanceof C54232Ax) {
                ((C54232Ax) view2).LIZ(LIZ, c14560hg.LJI);
            }
        }
    }

    public static final void onLayoutChange$4(IDCListenerS250S0100000 iDCListenerS250S0100000, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19920qK c19920qK = (C19920qK) iDCListenerS250S0100000.l0;
        c19920qK.LIZJ = null;
        C19980qQ.LIZJ(c19920qK);
        ((C19920qK) iDCListenerS250S0100000.l0).LIZLLL.LIZIZ.removeOnLayoutChangeListener(iDCListenerS250S0100000);
    }
}
