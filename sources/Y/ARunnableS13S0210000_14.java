package Y;

import X.AbstractC82921WgX;
import X.C16880lQ;
import X.C76800UCe;
import X.C79907VXr;
import X.EnumC84152X0y;
import X.InterfaceC79913VXx;
import X.InterfaceC88472Yns;
import X.NJO;
import X.VIS;
import X.VIW;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS13S0210000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS13S0210000_14.LIZ$0():void");
    }

    public final void LIZ$1() {
        VIS vis = ((VIW) this.l0).LJIIJJI.get((Aweme) this.l1);
        if (vis != null) {
            boolean z = this.z2;
            vis.LJLILLLLZI = Long.valueOf(System.currentTimeMillis());
            vis.LJLJI = Boolean.valueOf(z);
        }
        ((ArrayList) ((VIW) this.l0).LJIIIIZZ).remove((Aweme) this.l1);
        ((ArrayList) ((VIW) this.l0).LJIIIZ).add((Aweme) this.l1);
        List<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>> list = ((VIW) this.l0).LJI.get((Aweme) this.l1);
        if (list != null) {
            Aweme aweme = (Aweme) this.l1;
            Iterator<WeakReference<InterfaceC88472Yns<Aweme, C76800UCe>>> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC88472Yns<Aweme, C76800UCe> interfaceC88472Yns = it.next().get();
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(aweme);
                }
            }
        }
        ((VIW) this.l0).LJI.remove((Aweme) this.l1);
        VIW.LJIIJ((VIW) this.l0);
    }

    public static final void run$0(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        boolean LIZ;
        try {
            aRunnableS13S0210000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        boolean LIZ;
        try {
            if (aRunnableS13S0210000_14.z2) {
                AbstractC82921WgX abstractC82921WgX = (AbstractC82921WgX) aRunnableS13S0210000_14.l1;
                abstractC82921WgX.LIZIZ(abstractC82921WgX.LJIIIIZZ);
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS50S0100000_14(aRunnableS13S0210000_14, 13), 50L);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS13S0210000_14.l1).setAutoFocusLock((TECameraCapture) aRunnableS13S0210000_14.l0, aRunnableS13S0210000_14.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS13S0210000_14.l1).toggleTorch((TECameraCapture) aRunnableS13S0210000_14.l0, aRunnableS13S0210000_14.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        boolean LIZ;
        try {
            aRunnableS13S0210000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0210000_14 aRunnableS13S0210000_14) {
        C79907VXr this$0 = (C79907VXr) aRunnableS13S0210000_14.l0;
        CharSequence charSequence = (CharSequence) aRunnableS13S0210000_14.l1;
        boolean z = aRunnableS13S0210000_14.z2;
        o.LJIIIZ(this$0, "this$0");
        NJO.LIZIZ.LIZIZ("CustomSelectTextView", "onSelectTextChange");
        InterfaceC79913VXx interfaceC79913VXx = this$0.LLFF;
        if (interfaceC79913VXx != null) {
            interfaceC79913VXx.LJ(charSequence, z);
        }
    }

    public ARunnableS13S0210000_14(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
