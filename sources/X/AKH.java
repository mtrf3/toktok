package X;

import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKH {
    public final A21 LIZ;
    public Context LIZIZ;
    public final ViewGroup LIZJ;
    public AKM LIZLLL;
    public AKJ LJ;

    public final void LIZ() {
        AKM akm = this.LIZLLL;
        if (akm != null) {
            akm.LJFF = 3;
            akm.dismiss();
        }
        AKJ akj = this.LJ;
        if (akj != null) {
            akj.LLII = 3;
            akj.LJIL();
        }
    }

    public final void LIZIZ() {
        A21 a21 = this.LIZ;
        if (a21.LJIILIIL) {
            LIZJ();
            return;
        }
        Context context = this.LIZIZ;
        ViewGroup viewGroup = this.LIZJ;
        CharSequence charSequence = a21.LJ;
        CharSequence charSequence2 = a21.LIZLLL;
        if (context != null) {
            if (viewGroup != null) {
                if ((charSequence2 == null || charSequence2.length() == 0) && (charSequence == null || charSequence.length() == 0)) {
                    "title & message view cannot be null at the same time".toString();
                    throw new IllegalStateException("title & message view cannot be null at the same time");
                }
                AKM akm = new AKM(context, viewGroup, this.LIZ);
                this.LIZLLL = akm;
                akm.LIZ();
                return;
            }
            "parent must not be null".toString();
            throw new IllegalStateException("parent must not be null");
        }
        "context must not be null".toString();
        throw new IllegalStateException("context must not be null");
    }

    public final void LIZJ() {
        Context context = this.LIZIZ;
        ViewGroup viewGroup = this.LIZJ;
        A21 a21 = this.LIZ;
        CharSequence charSequence = a21.LJ;
        CharSequence charSequence2 = a21.LIZLLL;
        if (context != null) {
            if (viewGroup != null) {
                if ((charSequence2 == null || charSequence2.length() == 0) && (charSequence == null || charSequence.length() == 0)) {
                    "title & message view cannot be null at the same time".toString();
                    throw new IllegalStateException("title & message view cannot be null at the same time");
                }
                AKJ akj = new AKJ(viewGroup, this.LIZ, context);
                this.LJ = akj;
                try {
                    akj.measure(0, 0);
                    akj.LJJI();
                    AKF akf = (AKF) akj.LJIJJLI(R.id.h42);
                    akf.setTranslationY(akf.LJLJJI);
                    ((AKF) akj.LJIJJLI(R.id.h42)).LIZIZ(true);
                    if (akj.LLFZ.LIZJ) {
                        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(akj, 9), akj.LLFZ.LIZIZ);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            "parent must not be null".toString();
            throw new IllegalStateException("parent must not be null");
        }
        "context must not be null".toString();
        throw new IllegalStateException("context must not be null");
    }

    public AKH(Fragment fragment) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = new A21(null);
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.LIZJ = view instanceof ViewGroup ? (ViewGroup) view : null;
        this.LIZIZ = fragment.getContext();
    }

    public AKH(Activity activity) {
        View view;
        o.LJIIIZ(activity, "activity");
        this.LIZ = new A21(null);
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view instanceof ViewGroup ? (ViewGroup) view : null;
        this.LIZIZ = activity;
    }

    public AKH(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        this.LIZ = new A21(null);
        this.LIZJ = parent;
        this.LIZIZ = parent.getContext();
    }

    public final void LIZLLL(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        if (z) {
            this.LIZ.LIZ = new AqS167S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 16);
        } else {
            this.LIZ.LIZ = interfaceC88472Yns;
        }
    }
}
