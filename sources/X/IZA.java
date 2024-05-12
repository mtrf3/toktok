package X;

import Y.ARunnableS1S0001000_6;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZA {
    public static volatile boolean LIZJ;
    public static boolean LIZLLL;
    public static final ArrayList<Runnable> LIZ = new ArrayList<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(IUC.INSTANCE);
    public static final ARunnableS1S0001000_6 LJ = new ARunnableS1S0001000_6(1, 24);

    public static boolean LIZ() {
        Object value = IZ8.LLLILZLLLI.getValue();
        o.LJIIIIZZ(value, "<get-COLD_BOOT_VIDEO_VOLUME_BALANCE_DEGRADE>(...)");
        if (!((Boolean) value).booleanValue() || LIZLLL) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.equals("TASK_POWER_MONITOR_REGISTER") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00e6, code lost:
    
        X.IZA.LIZ.add(new X.RunnableC47136Iei(r2, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f0, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C46985IcH r3) {
        /*
            boolean r0 = X.IZA.LIZLLL
            r2 = 4
            if (r0 != 0) goto Le
            java.lang.String r1 = r3.LIZ
            int r0 = r1.hashCode()
            switch(r0) {
                case -1530123236: goto L17;
                case -85908354: goto L20;
                case -59188514: goto L3c;
                case 35836265: goto L4b;
                case 342382844: goto L66;
                case 807781118: goto L81;
                case 909984752: goto L9c;
                case 1194633059: goto Lb8;
                case 1199085467: goto Ld4;
                default: goto Le;
            }
        Le:
            X.Iei r0 = new X.Iei
            r0.<init>(r2, r3)
            r0.run()
            return
        L17:
            java.lang.String r0 = "TASK_POWER_MONITOR_REGISTER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Le6
            goto Le
        L20:
            java.lang.String r0 = "TASK_VIDEO_PLUGIN_INIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto Le
        L29:
            X.5H3 r0 = X.IZ8.LLJLLIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_VIDEO_PLUGIN_DEGRADE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        L3c:
            java.lang.String r0 = "TASK_MDL_START"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto Le
        L45:
            boolean r0 = X.IZ8.LJFF()
            goto Le2
        L4b:
            java.lang.String r0 = "TASK_BRIGHTNESS_MONITOR_INIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L54
            goto Le
        L54:
            X.5H3 r0 = X.IZ8.LLLJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_VIDEO_BRI…NESS_MODULE_DEGRADE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        L66:
            java.lang.String r0 = "TASK_PRELOAD_MANAGER_SERVICE_INIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            goto Le
        L6f:
            X.5H3 r0 = X.IZ8.LLJLL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_PRELOAD_MANAGER_DEGRADE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        L81:
            java.lang.String r0 = "TASK_BMF_PLUGIN_INIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8a
            goto Le
        L8a:
            X.5H3 r0 = X.IZ8.LLJLLL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_BMF_PLUGIN_DEGRADE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        L9c:
            java.lang.String r0 = "TASK_FEED_PRERENDER_ENABLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La6
            goto Le
        La6:
            X.5H3 r0 = X.IZ8.LLLIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_FEED_PRER…R_DEGRADE_PRECISELY>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        Lb8:
            java.lang.String r0 = "TASK_PRELOAD_MANAGER_SERVICE_IMPL_INIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc2
            goto Le
        Lc2:
            X.5H3 r0 = X.IZ8.LLLIIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_MDL_RUNNABLE_DEGRADE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto Le2
        Ld4:
            java.lang.String r0 = "TASK_INIT_CACHE_DIR"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lde
            goto Le
        Lde:
            boolean r0 = X.IZ8.LJFF()
        Le2:
            if (r0 != 0) goto Le6
            goto Le
        Le6:
            java.util.ArrayList<java.lang.Runnable> r1 = X.IZA.LIZ
            X.Iei r0 = new X.Iei
            r0.<init>(r2, r3)
            r1.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZA.LIZIZ(X.IcH):void");
    }
}
