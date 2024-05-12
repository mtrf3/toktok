package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C91927a2V;
import X.C91928a2W;
import X.C92630aDq;
import X.EF7;
import X.ViewTreeObserverOnGlobalLayoutListenerC92022a42;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public class IDRunnableS89S0100000_31 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window2;
        View decorView2;
        ActivityC45651qj LIZ;
        Window window3;
        View decorView3;
        ViewTreeObserver viewTreeObserver2;
        if (((PhoneNumberAssem) this.l0)._$_findCachedViewById(R.id.ff).getParent() != null) {
            PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) this.l0;
            if (phoneNumberAssem.LJLJJL != null && (LIZ = C212428Vi.LIZ(phoneNumberAssem)) != null && (window3 = LIZ.getWindow()) != null && (decorView3 = window3.getDecorView()) != null && (viewTreeObserver2 = decorView3.getViewTreeObserver()) != null) {
                viewTreeObserver2.removeOnGlobalLayoutListener(phoneNumberAssem.LJLJJL);
            }
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(phoneNumberAssem);
            if (LIZ2 != null && (window2 = LIZ2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                i = decorView2.getHeight();
            } else {
                i = 0;
            }
            phoneNumberAssem.LJLJI = i;
            phoneNumberAssem.LJLJJL = new ViewTreeObserverOnGlobalLayoutListenerC92022a42(phoneNumberAssem);
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(phoneNumberAssem);
            if (LIZ3 != null && (window = LIZ3.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(phoneNumberAssem.LJLJJL);
            }
        }
    }

    public static final void run$0(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            iDRunnableS89S0100000_31.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinConfirmViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                if (C91927a2V.LIZ != 0) {
                    ((PinConfirmViewAssem) iDRunnableS89S0100000_31.l0).x3();
                } else {
                    ((PinConfirmViewAssem) iDRunnableS89S0100000_31.l0).v3();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinSetViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                if (C91927a2V.LIZ != 0) {
                    ((PinSetViewAssem) iDRunnableS89S0100000_31.l0).x3();
                } else {
                    ((PinSetViewAssem) iDRunnableS89S0100000_31.l0).v3();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        InputMethodManager inputMethodManager;
        try {
            ((EditText) iDRunnableS89S0100000_31.l0).requestFocus();
            EditText editText = (EditText) iDRunnableS89S0100000_31.l0;
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "input_method");
            if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
                inputMethodManager.showSoftInput(editText, 1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        ScrollView scrollView;
        try {
            ScrollView scrollView2 = (ScrollView) ((RepaymentAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.d9);
            if (scrollView2 != null && scrollView2.getParent() != null && (scrollView = (ScrollView) ((RepaymentAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.d9)) != null) {
                scrollView.smoothScrollTo(0, ((ScrollView) ((RepaymentAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.d9)).getHeight());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinChangeViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                ((PinChangeViewAssem) iDRunnableS89S0100000_31.l0).v3();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinConfirmViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                C92630aDq bnpl_pin_input = (C92630aDq) ((PinConfirmViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb);
                o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
                C91928a2W.LIZ(bnpl_pin_input);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinSetViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                C92630aDq bnpl_pin_input = (C92630aDq) ((PinSetViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb);
                o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
                C91928a2W.LIZ(bnpl_pin_input);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS89S0100000_31 iDRunnableS89S0100000_31) {
        boolean LIZ;
        try {
            if (((C92630aDq) ((PinVerifyViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb)).getParent() != null) {
                ((PinVerifyViewAssem) iDRunnableS89S0100000_31.l0).v3();
                C92630aDq bnpl_pin_input = (C92630aDq) ((PinVerifyViewAssem) iDRunnableS89S0100000_31.l0)._$_findCachedViewById(R.id.gb);
                o.LJIIIIZZ(bnpl_pin_input, "bnpl_pin_input");
                C91928a2W.LIZ(bnpl_pin_input);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS89S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
