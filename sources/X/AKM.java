package X;

import Y.ARunnableS40S0100000_4;
import Y.IDLListenerS192S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKM extends PopupWindow {
    public static WeakReference<View> LJIIIIZZ;
    public static WeakReference<AKM> LJIIIZ;
    public final Context LIZ;
    public final View LIZIZ;
    public final A21 LIZJ;
    public View LIZLLL;
    public BottomSheetBehavior<LinearLayout> LJ;
    public int LJFF;
    public boolean LJI;
    public Integer LJII;

    public final void LIZ() {
        WeakReference<AKM> weakReference;
        AKM akm;
        View view;
        try {
            view = this.LIZLLL;
        } catch (Exception unused) {
        }
        if (view != null) {
            view.measure(0, 0);
            C16880lQ.LLJZIJLIL(this, this.LIZIZ);
            View view2 = this.LIZLLL;
            if (view2 != null) {
                AKF akf = (AKF) view2.findViewById(R.id.h42);
                akf.setTranslationY(akf.LJLJJI);
                View view3 = this.LIZLLL;
                if (view3 != null) {
                    ((AKF) view3.findViewById(R.id.h42)).LIZIZ(true);
                    if (this.LIZJ.LIZJ) {
                        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 11), this.LIZJ.LIZIZ);
                    }
                    WeakReference<View> weakReference2 = LJIIIIZZ;
                    if (o.LJ(weakReference2 != null ? weakReference2.get() : null, this.LIZIZ) && (weakReference = LJIIIZ) != null && (akm = weakReference.get()) != null && !o.LJ(akm, this) && akm.isShowing()) {
                        try {
                            super.dismiss();
                        } catch (Exception unused2) {
                        }
                    }
                    LJIIIIZZ = new WeakReference<>(this.LIZIZ);
                    LJIIIZ = new WeakReference<>(this);
                    return;
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        View view = this.LIZLLL;
        if (view != null) {
            ((AKF) view.findViewById(R.id.h42)).LIZIZ(false);
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 10), 500L);
        } else {
            o.LJIJI("root");
            throw null;
        }
    }

    public final void LIZIZ() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public AKM(Context context, View view, A21 bundle) {
        o.LJIIIZ(bundle, "bundle");
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = bundle;
        this.LJI = true;
        setWidth(-1);
        setHeight(-2);
        setClippingEnabled(false);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bx, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…ting_notice_layout, null)");
        this.LIZLLL = LLLZIIL;
        setContentView(LLLZIIL);
        View view2 = this.LIZLLL;
        if (view2 != null) {
            ((AKF) view2.findViewById(R.id.h42)).setDismiss(new AqS154S0100000_4(this, 7));
            View view3 = this.LIZLLL;
            if (view3 != null) {
                ((AKF) view3.findViewById(R.id.h42)).LIZJ(bundle);
                View view4 = this.LIZLLL;
                if (view4 != null) {
                    BottomSheetBehavior<LinearLayout> from = BottomSheetBehavior.from(view4.findViewById(R.id.h42));
                    o.LJIIIIZZ(from, "from(root.notice_layout)");
                    this.LJ = from;
                    from.setBottomSheetCallback(new AKO(this));
                    View view5 = this.LIZLLL;
                    if (view5 != null) {
                        view5.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS192S0100000_4(this, 0));
                        setOnDismissListener(new AKN(this));
                        if (Build.VERSION.SDK_INT < 23) {
                            setBackgroundDrawable(new ColorDrawable(0));
                        }
                        setTouchInterceptor(new IDTListenerS114S0100000_4(this, 0));
                        return;
                    }
                    o.LJIJI("root");
                    throw null;
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
