package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C36661cE;
import X.C76800UCe;
import X.C82951Wh1;
import X.C86808Y5c;
import X.C86810Y5e;
import X.InterfaceC86124Xr6;
import X.InterfaceC88473Ynt;
import X.X1D;
import X.Y5K;
import X.Y5W;
import X.Y5Y;
import Y.ARunnableS14S1200000_15;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import ij2.a;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class IDqS188S0200000_15 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS188S0200000_15(Y5Y y5y, Bitmap bitmap, int i) {
        super(3);
        this.$t = i;
        this.l0 = y5y;
        this.l1 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS188S0200000_15(Activity activity, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = activity;
        this.l1 = view;
    }

    public static final Object invoke$0(IDqS188S0200000_15 iDqS188S0200000_15, Object obj, Object obj2, Object obj3) {
        Object opt;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C36661cE c36661cE = (C36661cE) obj3;
        try {
            if (((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL.LIZIZ) {
                if (!booleanValue) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("recordNetErrorCount: ");
                    LIZ.append(((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL.LJIIIZ);
                    X1D.LIZIZ(LIZ);
                    Y5W y5w = ((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL;
                    int i = y5w.LJIIIZ + 1;
                    y5w.LJIIIZ = i;
                    if (i > 5) {
                        y5w.LJIIIZ = 0;
                        y5w.LIZIZ = false;
                        Y5K y5k = ((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL.LJII;
                        if (y5k != null) {
                            y5k.LLJILJILJ(C82951Wh1.LIZ("pipo_payin_dropin_cashier_networkerror_statement"));
                        }
                        Handler handler = ((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL.LJ;
                        if (handler != null) {
                            handler.postDelayed(new ARunnableS14S1200000_15(c36661cE, str, iDqS188S0200000_15, 2), 1800L);
                        }
                    }
                }
                if (c36661cE != null) {
                    if (c36661cE.LJIIL) {
                        c36661cE.LIZ((Bitmap) iDqS188S0200000_15.l1);
                        if (c36661cE.LJIILIIL != null) {
                            PipoOcrResult.CREATOR.getClass();
                            PipoOcrResult LIZ2 = C86808Y5c.LIZ(c36661cE);
                            LIZ2.originalImage = (Bitmap) iDqS188S0200000_15.l1;
                            a.LJIJ.getClass();
                            a.LJIILL = "server";
                            a.LJIIJ = System.currentTimeMillis();
                            Bitmap bitmap = LIZ2.originalImage;
                            if (bitmap != null) {
                                a.LIZLLL(bitmap, new C86810Y5e(iDqS188S0200000_15, LIZ2));
                            }
                        }
                    } else if (!c36661cE.LJIIL) {
                        JSONObject jSONObject = c36661cE.LIZ;
                        if (((Y5Y) iDqS188S0200000_15.l0).LIZ.LJLIL.LJII != null && jSONObject != null && (opt = jSONObject.opt("error_message")) != null) {
                            opt.toString();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS188S0200000_15 iDqS188S0200000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC86124Xr6 checkAndExecute = (InterfaceC86124Xr6) obj;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        checkAndExecute.setContentView((Activity) iDqS188S0200000_15.l0, (View) iDqS188S0200000_15.l1);
        return C76800UCe.LIZ;
    }
}
