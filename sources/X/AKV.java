package X;

import X.AKX;
import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AKV<T extends AKX> extends PopupWindow {
    public static int LIZJ;
    public static final java.util.Map<String, OSZ<WeakReference<View>, WeakReference<AKV<?>>>> LIZLLL = new LinkedHashMap();
    public final View LIZ;
    public final T LIZIZ;

    public void LIZ(boolean z) {
    }

    public abstract void LIZIZ(boolean z);

    public abstract View LIZJ();

    public final void LIZLLL() {
        AKV akv;
        try {
            AKW LLLJIL = this.LIZIZ.LLLJIL();
            LLLJIL.LIZ = Long.valueOf(System.currentTimeMillis() + LLLJIL.LJ);
            C16880lQ.LLJZ(this, this.LIZ);
            LIZJ().announceForAccessibility(LLLJIL.LIZIZ);
            LIZ(LLLJIL.LJFF);
            if (LLLJIL.LJFF) {
                LIZIZ(true);
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 7), LLLJIL.LJ);
        } catch (Exception unused) {
        }
        String LJLLJ = C16880lQ.LJLLJ(getClass());
        java.util.Map<String, OSZ<WeakReference<View>, WeakReference<AKV<?>>>> map = LIZLLL;
        OSZ osz = (OSZ) ((LinkedHashMap) map).get(LJLLJ);
        Object obj = null;
        if (osz == null) {
            osz = new OSZ(null, null);
        }
        Reference reference = (Reference) osz.getFirst();
        Reference reference2 = (Reference) osz.getSecond();
        if (reference != null) {
            obj = reference.get();
        }
        if (o.LJ(obj, this.LIZ) && reference2 != null && (akv = (AKV) reference2.get()) != null && !o.LJ(akv, this) && akv.isShowing()) {
            akv.LJ();
        }
        map.put(LJLLJ, new OSZ<>(new WeakReference(this.LIZ), new WeakReference(this)));
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (this.LIZIZ.LLLJIL().LJI) {
            LIZIZ(false);
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 6), 500L);
        } else {
            LJ();
        }
    }

    public final void LJ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        try {
            super.dismiss();
            WeakReference<InterfaceC65784Pro<C76800UCe>> weakReference = this.LIZIZ.LLLJIL().LJIIIZ;
            if (weakReference != null && (interfaceC65784Pro = weakReference.get()) != null) {
                interfaceC65784Pro.invoke();
            }
        } catch (Exception unused) {
        }
    }

    public AKV(View view, T toastBundle) {
        o.LJIIIZ(toastBundle, "toastBundle");
        this.LIZ = view;
        this.LIZIZ = toastBundle;
        setWidth(-1);
        setHeight(-1);
        setInputMethodMode(1);
        setClippingEnabled(false);
    }
}
