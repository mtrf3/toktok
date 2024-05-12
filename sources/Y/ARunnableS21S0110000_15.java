package Y;

import X.C84923XUp;
import X.C84987XXb;
import X.C85022XYk;
import X.InterfaceC86860Y7c;
import X.XX7;
import X.XX9;
import X.XXF;
import X.XXG;
import X.Y7W;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lynx.hybrid.settings.SettingsConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS21S0110000_15 implements Runnable {
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
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: RuntimeException -> 0x0065, TryCatch #0 {RuntimeException -> 0x0065, blocks: (B:4:0x000c, B:6:0x0014, B:8:0x001a, B:10:0x0022, B:15:0x0030, B:17:0x0034, B:18:0x0037, B:20:0x004e, B:22:0x0054, B:29:0x0062, B:25:0x0058), top: B:3:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l0
            X.Y60 r0 = (X.Y60) r0
            X.Y5y r2 = r0.LIZJ
            boolean r5 = r6.z1
            android.hardware.Camera r0 = r2.LIZ
            if (r0 == 0) goto L65
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.RuntimeException -> L65
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2b
            java.lang.String r1 = r0.getFlashMode()     // Catch: java.lang.RuntimeException -> L65
            if (r1 == 0) goto L2b
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L65
            if (r0 != 0) goto L2d
            java.lang.String r0 = "torch"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L65
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            goto L2e
        L2d:
            r0 = 1
        L2e:
            if (r5 == r0) goto L65
            X.Y5z r0 = r2.LIZJ     // Catch: java.lang.RuntimeException -> L65
            if (r0 == 0) goto L37
            r0.LIZIZ()     // Catch: java.lang.RuntimeException -> L65
        L37:
            android.hardware.Camera r0 = r2.LIZ     // Catch: java.lang.RuntimeException -> L65
            android.hardware.Camera$Parameters r1 = r0.getParameters()     // Catch: java.lang.RuntimeException -> L65
            X.Y5B.LIZIZ(r1, r5)     // Catch: java.lang.RuntimeException -> L65
            X.VK2 r0 = r2.LJFF     // Catch: java.lang.RuntimeException -> L65
            r0.getClass()     // Catch: java.lang.RuntimeException -> L65
            android.hardware.Camera r0 = r2.LIZ     // Catch: java.lang.RuntimeException -> L65
            r0.setParameters(r1)     // Catch: java.lang.RuntimeException -> L65
            X.Y5z r2 = r2.LIZJ     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L65
            r2.LIZ = r4     // Catch: java.lang.RuntimeException -> L65
            boolean r0 = r2.LIZJ     // Catch: java.lang.RuntimeException -> L65
            if (r0 == 0) goto L65
            boolean r0 = r2.LIZIZ     // Catch: java.lang.RuntimeException -> L65
            if (r0 != 0) goto L65
            android.hardware.Camera r1 = r2.LIZLLL     // Catch: java.lang.RuntimeException -> L62
            X.Y6F r0 = r2.LJFF     // Catch: java.lang.RuntimeException -> L62
            r1.autoFocus(r0)     // Catch: java.lang.RuntimeException -> L62
            r2.LIZIZ = r3     // Catch: java.lang.RuntimeException -> L62
            goto L65
        L62:
            r2.LIZ()     // Catch: java.lang.RuntimeException -> L65
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS21S0110000_15.LIZ$0():void");
    }

    public final void LIZ$1() {
        String buildUrl;
        SettingsConfig settingsConfig = ((Y7W) this.l0).LIZJ;
        if (settingsConfig == null || (buildUrl = settingsConfig.buildUrl()) == null || !((Y7W) this.l0).LJIIIZ) {
            if (this.z1) {
                Y7W.LJIILIIL.LIZIZ(60000L, new ARunnableS51S0100000_15(this, 89));
            }
        } else {
            if (!((Y7W) this.l0).LIZLLL.compareAndSet(false, true)) {
                return;
            }
            Y7W y7w = (Y7W) this.l0;
            InterfaceC86860Y7c interfaceC86860Y7c = y7w.LIZIZ;
            if (interfaceC86860Y7c != null) {
                interfaceC86860Y7c.LIZ(buildUrl, y7w.LJIIJ);
            } else {
                o.LJIJI("settingsFetcher");
                throw null;
            }
        }
    }

    public static final void run$0(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        boolean LIZ;
        try {
            aRunnableS21S0110000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        XX7 xx7 = (XX7) aRunnableS21S0110000_15.l0;
        boolean z = aRunnableS21S0110000_15.z1;
        RecyclerView recyclerView = xx7.LJLJJL;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(xx7.LJLJJLL);
        if (!(LJJIZ instanceof C84987XXb)) {
            return;
        }
        ((XXG) LJJIZ).V(z, true, !xx7.LJZL);
    }

    public static final void run$2(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        C84923XUp c84923XUp = (C84923XUp) aRunnableS21S0110000_15.l0;
        c84923XUp.LJFF.LJ.LLLLZLL(aRunnableS21S0110000_15.z1, true);
    }

    public static final void run$3(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        C84923XUp c84923XUp = (C84923XUp) aRunnableS21S0110000_15.l0;
        c84923XUp.LJFF.LJ.LLLLZLL(aRunnableS21S0110000_15.z1, true);
    }

    public static final void run$4(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        boolean LIZ;
        try {
            aRunnableS21S0110000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS21S0110000_15 aRunnableS21S0110000_15) {
        XX9 xx9 = (XX9) aRunnableS21S0110000_15.l0;
        boolean z = aRunnableS21S0110000_15.z1;
        RecyclerView recyclerView = xx9.LJLJI;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(xx9.LJLJJI);
        if (!(LJJIZ instanceof C85022XYk)) {
            return;
        }
        ((XXF) LJJIZ).U(z, true);
    }

    public ARunnableS21S0110000_15(XX9 xx9, int i) {
        this.$t = i;
        this.l0 = xx9;
        this.z1 = false;
    }

    public ARunnableS21S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
