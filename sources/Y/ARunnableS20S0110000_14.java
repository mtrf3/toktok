package Y;

import X.C40048Fng;
import X.C77378UYk;
import X.C79623VMt;
import X.C79902VXm;
import X.C81144Vsy;
import X.C81518Vz0;
import X.C82130WLe;
import X.C82398WVm;
import X.C82410WVy;
import X.C82848WfM;
import X.I0N;
import X.InterfaceC81146Vt0;
import X.VMW;
import X.VMZ;
import X.VN4;
import X.ViewOnTouchListenerC81419VxP;
import X.ViewOnTouchListenerC82857WfV;
import X.W5G;
import android.graphics.drawable.Drawable;
import com.ss.videoarch.strategy.utils.JniTask;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS20S0110000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (this.z1) {
            C82410WVy c82410WVy = (C82410WVy) this.l0;
            if (c82410WVy.LLFF && c82410WVy.LLF) {
                I0N LLF = c82410WVy.LLF();
                if ((LLF != null && C82398WVm.LIZJ(LLF) != null) || o.LJ(((C82410WVy) this.l0).LJLZ().LJIIZILJ, C77378UYk.LIZ)) {
                    C82130WLe.LIZ((C82410WVy) this.l0, true, false, false, "recover", true, 14);
                } else if (!((C82410WVy) this.l0).AO()) {
                    ((C82410WVy) this.l0).getBottomTabApiComponent().showBottomTab(true);
                }
                ((C82410WVy) this.l0).LLF = false;
                return;
            }
            return;
        }
        if (!((C82410WVy) this.l0).LJLLL().LLIILZL) {
            return;
        }
        C82130WLe.LIZ((C82410WVy) this.l0, false, false, false, null, true, 26);
        ((C82410WVy) this.l0).LLF = true;
    }

    public final void LIZ$1() {
        ((VN4) this.l0).LJII();
        VMZ LIZ = ((VN4) this.l0).LJFF.LIZ();
        if (LIZ != null) {
            ((VN4) this.l0).LIZ = LIZ;
            C79623VMt.LIZ();
            ((VN4) this.l0).LIZ.LIZIZ.getClass();
            VN4 vn4 = (VN4) this.l0;
            vn4.LJIIIIZZ(vn4.LIZ.LIZLLL);
        } else {
            ((VN4) this.l0).LJIIIIZZ(600);
        }
        if (!((VN4) this.l0).LIZJ) {
            VMZ LIZIZ = ((VN4) this.l0).LJFF.LIZIZ();
            if (LIZIZ != null) {
                ((VN4) this.l0).LIZ = LIZIZ;
            }
            VMW.LIZJ.LIZIZ();
        }
        if (this.z1) {
            HashMap hashMap = new HashMap();
            hashMap.put("setting_id", String.valueOf(((VN4) this.l0).LIZ.LJ));
            C40048Fng.LIZIZ(null, "startup_init", hashMap, null);
        }
    }

    public static final void run$0(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        try {
            InterfaceC81146Vt0 autoDarkListener = ((C81144Vsy) aRunnableS20S0110000_14.l0).getAutoDarkListener();
            if (autoDarkListener != null) {
                autoDarkListener.LIZ(aRunnableS20S0110000_14.z1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        Drawable drawable;
        try {
            super/*android.widget.ImageView*/.onVisibilityAggregated(aRunnableS20S0110000_14.z1);
            if (W5G.sEnableVisibleOpt && (drawable = ((W5G) aRunnableS20S0110000_14.l0).getDrawable()) != null) {
                drawable.setVisible(true, false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        try {
            ((C79902VXm) aRunnableS20S0110000_14.l0).setCameraHW(aRunnableS20S0110000_14.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        int i;
        try {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = ((C81518Vz0) aRunnableS20S0110000_14.l0).LJLJLJ;
            if (viewOnTouchListenerC81419VxP != null) {
                if (aRunnableS20S0110000_14.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                viewOnTouchListenerC81419VxP.setVisibility(i);
                return;
            }
            o.LJIJI("tabHost");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        try {
            aRunnableS20S0110000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        try {
            aRunnableS20S0110000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = (ViewOnTouchListenerC82857WfV) aRunnableS20S0110000_14.l0;
        if (aRunnableS20S0110000_14.z1) {
            viewOnTouchListenerC82857WfV.setCurPointerContainerStartX(viewOnTouchListenerC82857WfV.LJLLI.getStartX() + C82848WfM.LIZJ);
        }
        viewOnTouchListenerC82857WfV.LJIJJLI();
        viewOnTouchListenerC82857WfV.LJIJI();
        viewOnTouchListenerC82857WfV.LJIJ();
    }

    public static final void run$7(ARunnableS20S0110000_14 aRunnableS20S0110000_14) {
        boolean LIZ;
        try {
            ((JniTask) aRunnableS20S0110000_14.l0).nativeStart(aRunnableS20S0110000_14.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS20S0110000_14(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
