package Y;

import X.C116484hg;
import X.C16880lQ;
import X.C36922EeM;
import X.C38048EwW;
import X.C38292F1c;
import X.C84763XOl;
import X.FMX;
import X.InterfaceC55058LjC;
import X.ViewOnTouchListenerC82857WfV;
import X.X1D;
import android.app.Activity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS1S0102000_6 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (this.i1 != 47) {
            ARunnableS10S0400000_6 aRunnableS10S0400000_6 = (ARunnableS10S0400000_6) this.l0;
            ((C38292F1c) aRunnableS10S0400000_6.l3).LIZJ(((C38048EwW) aRunnableS10S0400000_6.l1).LIZLLL);
        }
        ARunnableS10S0400000_6 aRunnableS10S0400000_62 = (ARunnableS10S0400000_6) this.l0;
        C38292F1c c38292F1c = (C38292F1c) aRunnableS10S0400000_62.l3;
        JSONObject jSONObject = (JSONObject) aRunnableS10S0400000_62.l2;
        int i = this.i2;
        c38292F1c.getClass();
        try {
            jSONObject.put("code", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        ARunnableS10S0400000_6 aRunnableS10S0400000_63 = (ARunnableS10S0400000_6) this.l0;
        C38292F1c c38292F1c2 = (C38292F1c) aRunnableS10S0400000_63.l3;
        c38292F1c2.LJLILLLLZI.LIZLLL(c38292F1c2.LJLJI, (JSONObject) aRunnableS10S0400000_63.l0);
    }

    public static final void run$0(ARunnableS1S0102000_6 aRunnableS1S0102000_6) {
        String str;
        switch (aRunnableS1S0102000_6.i1) {
            case 0:
                ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = (ViewOnTouchListenerC82857WfV) aRunnableS1S0102000_6.l0;
                viewOnTouchListenerC82857WfV.LLIIIL.scrollBy(aRunnableS1S0102000_6.i2, 0);
                return;
            default:
                Object obj = aRunnableS1S0102000_6.l0;
                int i = aRunnableS1S0102000_6.i2;
                obj.getClass();
                HashMap hashMap = new HashMap();
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    str = "null";
                } else if (LJIIIIZZ instanceof InterfaceC55058LjC) {
                    str = "homepage";
                } else {
                    str = "others";
                }
                C116484hg.LIZIZ(hashMap, "enter_from", str, i, "event_type");
                FMX.LJIIL("activity_relaunch", hashMap);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("activity relaunch ");
                LIZ.append(str);
                LIZ.append(",");
                LIZ.append(i);
                C36922EeM.LIZLLL(4, "ActivityCallback", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public static final void run$1(ARunnableS1S0102000_6 aRunnableS1S0102000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0102000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0102000_6(int i, int i2, Object obj, int i3) {
        this.$t = i3;
        this.i1 = i2;
        this.l0 = obj;
        this.i2 = i;
    }
}
