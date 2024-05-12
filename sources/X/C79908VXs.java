package X;

import Y.ARunnableS13S0210000_14;
import Y.ARunnableS17S0201000_14;
import Y.ARunnableS18S0101000_14;
import Y.IDRunnableS6S0101000;
import Y.IDTListenerS122S0100000_14;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.VXs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79908VXs implements InterfaceC79913VXx {
    public final /* synthetic */ C79907VXr LIZ;

    @Override // X.InterfaceC79913VXx
    public final void LJFF() {
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZ() {
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.post(new ARunnableS18S0101000_14(4, c79907VXr, 22));
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZIZ() {
        Activity LIZ;
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        C79910VXu c79910VXu;
        C79910VXu c79910VXu2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        ViewGroup viewGroup3;
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.getClass();
        View view2 = (View) new WeakReference(c79907VXr).get();
        if (view2 != null && (LIZ = C53819LAh.LIZ(view2)) != null) {
            L22.LIZIZ.put(Integer.valueOf(LIZ.hashCode()), new WeakReference<>(view2));
            java.util.Map<Integer, WeakReference<View>> map = L22.LIZLLL;
            Reference reference = (Reference) ((LinkedHashMap) map).get(Integer.valueOf(LIZ.hashCode()));
            if (reference == null || (view = (View) reference.get()) == null) {
                View view3 = new View(LIZ);
                view3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                view3.setOnTouchListener(new IDTListenerS122S0100000_14(LIZ, 10));
                View rootView = view2.getRootView();
                if ((rootView instanceof FrameLayout) && (viewGroup = (ViewGroup) rootView) != null) {
                    viewGroup.addView(view3);
                }
                map.put(Integer.valueOf(LIZ.hashCode()), new WeakReference<>(view3));
            } else if (view.getParent() == null) {
                View rootView2 = view2.getRootView();
                if ((rootView2 instanceof FrameLayout) && (viewGroup2 = (ViewGroup) rootView2) != null) {
                    viewGroup2.addView(view);
                }
            }
        }
        c79907VXr.LJJJJZ();
        C79909VXt c79909VXt = c79907VXr.LJLZ;
        if (c79909VXt != null) {
            c79910VXu = c79909VXt.LJ;
            c79910VXu2 = c79909VXt.LJFF;
        } else {
            c79910VXu = null;
            c79910VXu2 = null;
        }
        c79907VXr.LLIIII = c79910VXu;
        c79907VXr.LLIIIILZ = c79910VXu2;
        C1295156l c1295156l = c79907VXr.LLIIL;
        if (c79910VXu != null) {
            num = Integer.valueOf(c79910VXu.LIZIZ);
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        if (c79910VXu != null) {
            num2 = Integer.valueOf(c79910VXu.LIZJ);
        } else {
            num2 = null;
        }
        if (num2 == null) {
            num2 = 0;
        }
        c1295156l.setLayoutParams(new ViewGroup.LayoutParams(intValue, num2.intValue()));
        C1295156l c1295156l2 = c79907VXr.LLIILII;
        if (c79910VXu2 != null) {
            num3 = Integer.valueOf(c79910VXu2.LIZIZ);
        } else {
            num3 = null;
        }
        if (num3 == null) {
            num3 = 0;
        }
        int intValue2 = num3.intValue();
        if (c79910VXu2 != null) {
            num4 = Integer.valueOf(c79910VXu2.LIZJ);
        } else {
            num4 = null;
        }
        if (num4 == null) {
            num4 = 0;
        }
        c1295156l2.setLayoutParams(new ViewGroup.LayoutParams(intValue2, num4.intValue()));
        c79907VXr.LLIIL.setImageDrawable(c79910VXu);
        c79907VXr.LLIILII.setImageDrawable(c79910VXu2);
        ViewParent parent = c79907VXr.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
            viewGroup3.addView(c79907VXr.LLIIL);
            viewGroup3.addView(c79907VXr.LLIILII);
            viewGroup3.setClipToPadding(false);
            viewGroup3.setClipChildren(false);
            C79907VXr.LJJJJJ(c79907VXr.LLIIL, 0.0f, 1.0f, null);
            C79907VXr.LJJJJJ(c79907VXr.LLIILII, 0.0f, 1.0f, null);
            c79907VXr.LJJJIL();
            c79907VXr.LLIIIJ = viewGroup3.getLayoutParams().width;
            c79907VXr.LLIIIL = viewGroup3.getLayoutParams().height;
            int width = viewGroup3.getWidth();
            int height = viewGroup3.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            viewGroup3.setLayoutParams(layoutParams);
        }
        C79907VXr c79907VXr2 = this.LIZ;
        c79907VXr2.post(new IDRunnableS6S0101000(3, c79907VXr2, 39));
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZLLL() {
        Activity LIZ;
        View view;
        ViewGroup viewGroup;
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.getClass();
        View view2 = (View) new WeakReference(c79907VXr).get();
        if (view2 != null && (LIZ = C53819LAh.LIZ(view2)) != null) {
            L22.LIZIZ.put(Integer.valueOf(LIZ.hashCode()), null);
            Reference reference = (Reference) ((LinkedHashMap) L22.LIZLLL).get(Integer.valueOf(LIZ.hashCode()));
            if (reference != null && (view = (View) reference.get()) != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(view, viewGroup);
                }
            }
        }
        c79907VXr.LJJJJZ();
        C79907VXr.LJJJJJ(c79907VXr.LLIIL, 1.0f, 0.0f, null);
        C79907VXr.LJJJJJ(c79907VXr.LLIILII, 1.0f, 0.0f, new AqS164S0100000_14(c79907VXr, 491));
        C79907VXr c79907VXr2 = this.LIZ;
        c79907VXr2.post(new IDRunnableS6S0101000(2, c79907VXr2, 6));
    }

    @Override // X.InterfaceC79913VXx
    public final void LJI() {
        String str;
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.LJJJIL();
        c79907VXr.LJJJJZ();
        C79909VXt c79909VXt = this.LIZ.LJLZ;
        if (c79909VXt == null || (str = c79909VXt.LIZJ.LIZJ) == null || str.length() == 0) {
            NJO.LIZIZ.LIZIZ("CustomSelectTextView", "empty content");
            C79907VXr c79907VXr2 = this.LIZ;
            if (!c79907VXr2.LJJJJLL()) {
                return;
            }
            C79909VXt c79909VXt2 = c79907VXr2.LJLZ;
            if (c79909VXt2 != null) {
                c79909VXt2.LIZIZ();
            }
            c79907VXr2.LJJJJL();
            return;
        }
        C79907VXr c79907VXr3 = this.LIZ;
        c79907VXr3.post(new ARunnableS18S0101000_14(4, c79907VXr3, 21));
    }

    public C79908VXs(C79907VXr c79907VXr) {
        this.LIZ = c79907VXr;
    }

    @Override // X.InterfaceC79913VXx
    public final void LIZJ(Rect rect) {
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.post(new ARunnableS17S0201000_14(2, c79907VXr, rect, 15));
    }

    @Override // X.InterfaceC79913VXx
    public final void LJ(CharSequence charSequence, boolean z) {
        C79907VXr c79907VXr = this.LIZ;
        c79907VXr.post(new ARunnableS13S0210000_14(c79907VXr, charSequence, z, 5));
    }
}
