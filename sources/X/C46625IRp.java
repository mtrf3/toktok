package X;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.IRp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46625IRp implements InterfaceC46627IRr {
    public static volatile C46625IRp LJFF;
    public final C46628IRs LIZ;
    public final C46623IRn LIZIZ;
    public final C46620IRk LIZJ;
    public final C46624IRo LIZLLL;
    public final IS2 LJ;

    public final int LIZ() {
        C46628IRs c46628IRs = this.LIZ;
        c46628IRs.LJI();
        return c46628IRs.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    public final C46626IRq LIZIZ() {
        ?? r0;
        C46626IRq c46626IRq = new C46626IRq();
        String str = IU6.LIZ;
        if (str == null) {
            Method method = EY1.LIZ;
            if (method != null) {
                try {
                    str = (String) EY1.LIZ(method, new Object[]{"ro.board.platform", ""});
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                } catch (IllegalArgumentException e2) {
                    C16880lQ.LLLLIIL(e2);
                } catch (InvocationTargetException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                IU6.LIZ = str;
            }
            str = "";
            IU6.LIZ = str;
        }
        c46626IRq.LIZ = str;
        C46628IRs c46628IRs = this.LIZ;
        c46628IRs.LJI();
        c46626IRq.LIZIZ = c46628IRs.LJLJJL;
        c46626IRq.LIZJ = LIZ();
        c46626IRq.LIZLLL = LIZJ();
        PowerManager powerManager = this.LIZ.LJLJI;
        if (powerManager != null) {
            r0 = powerManager.isPowerSaveMode();
        } else {
            r0 = -1;
        }
        c46626IRq.LJ = r0;
        C46628IRs c46628IRs2 = this.LIZ;
        c46628IRs2.LJI();
        c46626IRq.LJFF = c46628IRs2.LJLJL;
        ((C46625IRp) ((InterfaceC46627IRr) this.LIZJ.LJLILLLLZI)).LJ.getClass();
        return c46626IRq;
    }

    public final int LIZJ() {
        C46623IRn c46623IRn = this.LIZIZ;
        if (Build.VERSION.SDK_INT >= 29) {
            PowerManager powerManager = c46623IRn.LJLJI;
            if (powerManager != null) {
                return powerManager.getCurrentThermalStatus();
            }
        } else {
            c46623IRn.getClass();
        }
        return -1;
    }

    public final C46625IRp LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start, obj:");
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        this.LIZ.getClass();
        this.LIZIZ.getClass();
        C46620IRk c46620IRk = this.LIZJ;
        if (!c46620IRk.LJLJI) {
            c46620IRk.LJLJI = true;
            c46620IRk.LJI();
        }
        return this;
    }

    public static C46625IRp LIZLLL(Context context) {
        if (LJFF == null) {
            synchronized (C46625IRp.class) {
                if (LJFF == null) {
                    LJFF = new C46625IRp(context, IS2.LIZJ);
                }
            }
        }
        return LJFF;
    }

    public C46625IRp(Context context, IS2 is2) {
        IS2 is22;
        Context LLLLL = C16880lQ.LLLLL(context);
        if (is2 == null) {
            is22 = IS2.LIZJ;
        } else {
            is22 = is2;
        }
        this.LJ = is22;
        this.LIZ = new C46628IRs(LLLLL, this);
        this.LIZIZ = new C46623IRn(LLLLL, this);
        this.LIZJ = new C46620IRk(LLLLL, this);
        this.LIZLLL = new C46624IRo(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new assist obj:");
        LIZ.append(this);
        LIZ.append(" config : ");
        LIZ.append(is2);
        X1D.LIZIZ(LIZ);
    }
}
