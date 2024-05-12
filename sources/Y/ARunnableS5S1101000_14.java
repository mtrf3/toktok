package Y;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;

/* loaded from: classes15.dex */
public class ARunnableS5S1101000_14 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS5S1101000_14 aRunnableS5S1101000_14) {
        boolean LIZ;
        try {
            LynxTemplateRender lynxTemplateRender = ((DynamicComponentLoader) aRunnableS5S1101000_14.l1).LIZIZ.get();
            if (lynxTemplateRender != null) {
                lynxTemplateRender.LJIILIIL(aRunnableS5S1101000_14.i2, aRunnableS5S1101000_14.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1101000_14 aRunnableS5S1101000_14) {
        boolean LIZ;
        try {
            LynxTemplateRender lynxTemplateRender = ((ExternalSourceLoader) aRunnableS5S1101000_14.l1).LIZLLL.get();
            if (lynxTemplateRender != null) {
                lynxTemplateRender.LJIILIIL(aRunnableS5S1101000_14.i2, aRunnableS5S1101000_14.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1101000_14(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
