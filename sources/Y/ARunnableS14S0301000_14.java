package Y;

import X.C79334VBq;
import X.EnumC79337VBt;
import X.InterfaceC79335VBr;
import X.VED;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes15.dex */
public class ARunnableS14S0301000_14 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS14S0301000_14 aRunnableS14S0301000_14) {
        boolean LIZ;
        try {
            super/*android.widget.FrameLayout*/.addView((View) aRunnableS14S0301000_14.l1, aRunnableS14S0301000_14.i3, (ViewGroup.LayoutParams) aRunnableS14S0301000_14.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0301000_14 aRunnableS14S0301000_14) {
        C79334VBq c79334VBq = (C79334VBq) aRunnableS14S0301000_14.l0;
        EnumC79337VBt enumC79337VBt = (EnumC79337VBt) aRunnableS14S0301000_14.l1;
        int i = aRunnableS14S0301000_14.i3;
        Object obj = aRunnableS14S0301000_14.l2;
        InterfaceC79335VBr interfaceC79335VBr = c79334VBq.LJLIL.LJLJI;
        if (interfaceC79335VBr != null) {
            interfaceC79335VBr.LJJJJJL(enumC79337VBt, i, obj);
        }
    }

    public static final void run$2(ARunnableS14S0301000_14 aRunnableS14S0301000_14) {
        C79334VBq c79334VBq = (C79334VBq) aRunnableS14S0301000_14.l0;
        EnumC79337VBt enumC79337VBt = (EnumC79337VBt) aRunnableS14S0301000_14.l1;
        int i = aRunnableS14S0301000_14.i3;
        Object obj = aRunnableS14S0301000_14.l2;
        InterfaceC79335VBr interfaceC79335VBr = c79334VBq.LJLIL.LJLJI;
        if (interfaceC79335VBr != null) {
            interfaceC79335VBr.LJJJJJL(enumC79337VBt, i, obj);
        }
    }

    public static final void run$3(ARunnableS14S0301000_14 aRunnableS14S0301000_14) {
        C79334VBq c79334VBq = (C79334VBq) aRunnableS14S0301000_14.l0;
        EnumC79337VBt enumC79337VBt = (EnumC79337VBt) aRunnableS14S0301000_14.l1;
        int i = aRunnableS14S0301000_14.i3;
        Object obj = aRunnableS14S0301000_14.l2;
        InterfaceC79335VBr interfaceC79335VBr = c79334VBq.LJLIL.LJLJI;
        if (interfaceC79335VBr != null) {
            interfaceC79335VBr.LJJJJJL(enumC79337VBt, i, obj);
        }
    }

    public static final void run$4(ARunnableS14S0301000_14 aRunnableS14S0301000_14) {
        boolean LIZ;
        try {
            ((Handler) aRunnableS14S0301000_14.l1).post(new ARunnableS33S0200000_14(aRunnableS14S0301000_14, ((VED) aRunnableS14S0301000_14.l0).LIZ(aRunnableS14S0301000_14.i3), 59));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S0301000_14(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
