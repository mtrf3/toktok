package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QNu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66910QNu extends QNO {
    public final /* synthetic */ DialogC66909QNt LIZ;

    public C66910QNu(DialogC66909QNt dialogC66909QNt) {
        this.LIZ = dialogC66909QNt;
    }

    @Override // X.QNO
    public final void LIZJ(int i, int i2) {
        int i3;
        int i4;
        float f;
        Method method;
        DialogC66909QNt dialogC66909QNt = this.LIZ;
        dialogC66909QNt.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeDialog width = ");
        LIZ.append(i);
        LIZ.append(", height = ");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (dialogC66909QNt.LJLLI || !dialogC66909QNt.isShowing()) {
            return;
        }
        if (dialogC66909QNt.LJZL.LIZJ()) {
            i = -1;
            i2 = -1;
        }
        if (i > 0 && i2 > 0) {
            Context context = dialogC66909QNt.LJLJL;
            o.LJIIJ(context, "context");
            try {
                method = DisplayMetrics.class.getDeclaredMethod("getDeviceDensity", null);
                o.LJFF(method, "method");
                method.setAccessible(true);
            } catch (Exception unused) {
                Context LLLLL = C16880lQ.LLLLL(context);
                o.LJFF(LLLLL, "context.applicationContext");
                Resources resources = LLLLL.getResources();
                o.LJFF(resources, "context.applicationContext.resources");
                f = resources.getDisplayMetrics().density;
            }
            if (method.invoke(null, new Object[0]) != null) {
                f = ((Integer) r0).intValue() / 160.0f;
                i = Math.round(i * f);
                i2 = Math.round(f * i2);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
            }
        }
        ViewGroup.LayoutParams layoutParams = dialogC66909QNt.LJLJI.getLayoutParams();
        if (dialogC66909QNt.LJLLILLLL && (i3 = layoutParams.width) > 0 && (i4 = layoutParams.height) > 0) {
            O5V o5v = dialogC66909QNt.LJLJI;
            o5v.getClass();
            ValueAnimator ofObject = ValueAnimator.ofObject(new QO1(), new int[]{i3, i4}, new int[]{i, i2});
            ofObject.addUpdateListener(new C66915QNz(o5v));
            ofObject.setDuration(300L).start();
            dialogC66909QNt.LJLLILLLL = false;
            return;
        }
        dialogC66909QNt.LJLJI.post(new RunnableC66912QNw(dialogC66909QNt, layoutParams, i, i2));
    }

    @Override // X.QNO
    public final void LIZLLL(int i, String str, String str2) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - QN2.LIZ);
            jSONObject.put("result", i);
            jSONObject.put("key", "result");
            QN2.LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e);
            }
        }
        QNS qns = this.LIZ.LJLLL;
        if (qns != null) {
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("token", str);
                    jSONObject2.put("mobile", str2);
                } catch (JSONException e2) {
                    if (C61349O5x.LIZ < 3) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                this.LIZ.LJLLL.LIZ(i, jSONObject2);
            } else {
                qns.onFail(i);
            }
            this.LIZ.LJLLL = null;
        }
        DialogC66909QNt dialogC66909QNt = this.LIZ;
        dialogC66909QNt.LJLL = true;
        dialogC66909QNt.dismiss();
    }
}
