package Y;

import X.AbstractC37134Ehm;
import X.C09900aA;
import X.C16880lQ;
import X.C37099EhD;
import X.F5U;
import X.F5V;
import X.F5Y;
import X.FI5;
import X.FIJ;
import X.FMX;
import X.FTS;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Process;
import com.bytedance.ies.safemode.SmartProtected.fastboot.FastBootBlankActivity;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IDCListenerS282S0100000_6 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS282S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS282S0100000_6 iDCListenerS282S0100000_6, DialogInterface dialogInterface) {
        LLog.LIZIZ.getClass();
        FTS fts = LLog.LIZ;
        Object[] obj = Arrays.copyOf(new Object[0], 0);
        fts.getClass();
        o.LJIIJ(obj, "obj");
        if (obj.length != 0) {
            Object[] copyOf = Arrays.copyOf(obj, obj.length);
            o.LJIIIIZZ(C16880lQ.LLLZ("dialog cancelled...", Arrays.copyOf(copyOf, copyOf.length)), "java.lang.String.format(format, *args)");
        }
        FIJ fij = FI5.LIZ;
        Application application = ((FastBootBlankActivity) iDCListenerS282S0100000_6.l0).getApplication();
        o.LJFF(application, "application");
        fij.getClass();
        Process.killProcess(FIJ.LIZ(application));
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void onCancel$1(IDCListenerS282S0100000_6 iDCListenerS282S0100000_6, DialogInterface dialogInterface) {
        F5U f5u = (F5U) iDCListenerS282S0100000_6.l0;
        AbstractC37134Ehm abstractC37134Ehm = f5u.LJII;
        if (abstractC37134Ehm != null) {
            int i = f5u.LJIIIIZZ;
            try {
                JSONObject LIZLLL = C37099EhD.LIZLLL(abstractC37134Ehm);
                LIZLLL.put("status", i);
                FMX.LJIILLIIL("df_cancel_progress_dialog", LIZLLL);
                int i2 = 2;
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        if (i != 8) {
                            i2 = 4;
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 3;
                }
                C09900aA.LJIIJJI("df_cancel_progress_dialog", i2, LIZLLL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (abstractC37134Ehm.LJIIIZ == F5Y.RUNNING && abstractC37134Ehm.LJI.LIZJ) {
                abstractC37134Ehm.LIZ(8, abstractC37134Ehm.LJIIIIZZ);
                abstractC37134Ehm.LJFF = true;
                abstractC37134Ehm.LJI.LIZ = false;
                abstractC37134Ehm.LJIIIIZZ = 0;
                return;
            }
            F5V.LIZLLL().getClass();
            F5V.LIZ(abstractC37134Ehm);
        }
    }
}
