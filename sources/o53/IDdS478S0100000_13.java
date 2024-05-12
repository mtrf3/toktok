package o53;

import X.C025908h;
import X.C117434jD;
import X.C16880lQ;
import X.C61328O5c;
import X.C75103Tdj;
import X.C75358Thq;
import X.C76583U3v;
import X.C76584U3w;
import X.C78685UuP;
import X.C79285V9t;
import X.InterfaceC81599W0t;
import X.V92;
import X.V9B;
import X.V9E;
import X.V9H;
import X.V9L;
import X.V9M;
import X.W4V;
import X.W5C;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.tasm.base.LLog;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class IDdS478S0100000_13 extends W4V {
    public final int $t;
    public Object l0;

    public static final void LJI$0(IDdS478S0100000_13 iDdS478S0100000_13, Object obj, String str) {
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, th);
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.LJ(str, th);
                return;
            case 4:
                LJ$1(this, str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            case 3:
                LJFF$3(this, str, obj, animatable);
                return;
            case 4:
                LJFF$4(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LJI$0(this, obj, str);
                return;
            default:
                super.LJI(obj, str);
                return;
        }
    }

    public IDdS478S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(IDdS478S0100000_13 iDdS478S0100000_13, String str, Throwable th) {
        V9B v9b = (V9B) iDdS478S0100000_13.l0;
        if (v9b.LJLJJLL.LJJIIJ.LJII(v9b.LJLJJI)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailed src:");
        LLog.LIZLLL(4, "FrescoImageView", C61328O5c.LIZLLL(LIZ, ((V9B) iDdS478S0100000_13.l0).LJLJJI, "with reason", th, LIZ));
        int LJFF = C78685UuP.LJFF(th);
        int LJI = C78685UuP.LJI(LJFF);
        if (((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJIILL != null) {
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) && (message = Log.getStackTraceString(th)) != null && message.length() > 200) {
                message = message.substring(0, 200);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Android LynxImageManager loading image failed, and the url is ");
            ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJIILL.LIZJ(LJI, LJFF, C025908h.LIZIZ(LIZ2, ((V9B) iDdS478S0100000_13.l0).LJLJJI, ". The Fresco throw error msg is ", message, LIZ2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        V9H v9h = ((V9B) iDdS478S0100000_13.l0).LJLJJLL;
        C79285V9t c79285V9t = v9h.LJJIIJ;
        c79285V9t.LJ(c79285V9t.LJIILJJIL, false, v9h.LJJIIJZLJL, currentTimeMillis, 0, null);
        V9H v9h2 = ((V9B) iDdS478S0100000_13.l0).LJLJJLL;
        C79285V9t c79285V9t2 = v9h2.LJJIIJ;
        c79285V9t2.LJFF(LJFF, 0, v9h2.LJJIIJZLJL, currentTimeMillis, c79285V9t2.LJIILJJIL, false, false);
    }

    public static final void LJ$1(IDdS478S0100000_13 iDdS478S0100000_13, String str, Throwable th) {
        ((C75358Thq) iDdS478S0100000_13.l0).LJLJJL = false;
    }

    public static final void LJFF$0(IDdS478S0100000_13 iDdS478S0100000_13, String str, Object obj, Animatable animatable) {
        C79285V9t c79285V9t;
        V92 v92;
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        System.currentTimeMillis();
        V9H v9h = ((V9B) iDdS478S0100000_13.l0).LJLJJLL;
        if ((interfaceC81599W0t instanceof W5C) && (v92 = v9h.LJIIJ.LIZLLL) != null) {
            v92.getClass();
            v92.LJIILLIIL(0);
        }
        if (((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJ) {
            V9H.LJJIIZ.post(new ARunnableS49S0100000_13(iDdS478S0100000_13, 76));
        }
        V9B v9b = (V9B) iDdS478S0100000_13.l0;
        int i = v9b.LJLILLLLZI;
        int i2 = v9b.LJLJI;
        V9H v9h2 = v9b.LJLJJLL;
        if (v9h2.LJIILL != null) {
            C117434jD c117434jD = v9h2.LJJIIJ.LJIILLIIL;
            if (c117434jD != null) {
                ConcurrentHashMap<String, V9L> concurrentHashMap = C79285V9t.LJJIIJZLJL;
                if (concurrentHashMap.containsKey(c117434jD.LIZIZ().toString())) {
                    V9L v9l = concurrentHashMap.get(((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJIIJ.LJIILLIIL.LIZIZ().toString());
                    i = v9l.LIZ;
                    i2 = v9l.LIZIZ;
                    c79285V9t = ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJIIJ;
                    if (c79285V9t.LJI && c79285V9t.LIZJ == 0 && c79285V9t.LIZLLL == 0) {
                        c79285V9t.LIZJ = i;
                        c79285V9t.LIZLLL = i2;
                        c79285V9t.LIZLLL();
                    }
                    ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJIILL.LIZLLL(i, i2);
                }
            }
            if (interfaceC81599W0t != null) {
                i = interfaceC81599W0t.getWidth();
                i2 = interfaceC81599W0t.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            c79285V9t = ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJIIJ;
            if (c79285V9t.LJI) {
                c79285V9t.LIZJ = i;
                c79285V9t.LIZLLL = i2;
                c79285V9t.LIZLLL();
            }
            ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJIILL.LIZLLL(i, i2);
        }
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            animatedDrawable2.LJFF(new V9M(animatedDrawable2.LJLJI, ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJIJJLI));
            V9E.LIZJ(animatedDrawable2);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewWidth", ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJ);
            jSONObject.put("viewHeight", ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJFF);
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            jSONObject.put("config", ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJIIJ.LJIIIZ);
            long currentTimeMillis = System.currentTimeMillis();
            System.currentTimeMillis();
            int LIZ = ((V9B) iDdS478S0100000_13.l0).LJLJJLL.LJJIIJ.LIZ(i, i2);
            V9H v9h3 = ((V9B) iDdS478S0100000_13.l0).LJLJJLL;
            C79285V9t c79285V9t2 = v9h3.LJJIIJ;
            c79285V9t2.LJ(c79285V9t2.LJIILJJIL, true, v9h3.LJJIIJZLJL, currentTimeMillis, LIZ, jSONObject);
            V9H v9h4 = ((V9B) iDdS478S0100000_13.l0).LJLJJLL;
            C79285V9t c79285V9t3 = v9h4.LJJIIJ;
            c79285V9t3.LJFF(0, LIZ, v9h4.LJJIIJZLJL, currentTimeMillis, c79285V9t3.LJIILJJIL, true, false);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJFF$1(IDdS478S0100000_13 iDdS478S0100000_13, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ((C76584U3w) iDdS478S0100000_13.l0).LJLJL = animatable;
    }

    public static final void LJFF$2(IDdS478S0100000_13 iDdS478S0100000_13, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ((C76583U3v) iDdS478S0100000_13.l0).LJLJLJ = animatable;
    }

    public static final void LJFF$3(IDdS478S0100000_13 iDdS478S0100000_13, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ((C75103Tdj) iDdS478S0100000_13.l0).LLF = animatable;
    }

    public static final void LJFF$4(IDdS478S0100000_13 iDdS478S0100000_13, String str, Object obj, Animatable animatable) {
        ((C75358Thq) iDdS478S0100000_13.l0).LJLJJL = false;
    }
}
