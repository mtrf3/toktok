package X;

import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LCU extends PMI {
    public final ViewGroup LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final ARunnableS45S0100000_9 LJ;
    public View LJFF;
    public C77869UhF LJI;

    public final void LJIILL() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            View view = this.LJFF;
            if (view != null) {
                C09K.LIZ(view, 0.0f, 300L).withEndAction(new ARunnableS28S0200000_9(view, this, 82)).start();
                return;
            }
            return;
        }
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(Throwable(ename))");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("error_type", "UI_not_in_main");
            FUA.LIZJ("aweme_error_find_bug", jSONObject);
        } catch (Exception unused) {
            C39623Fgp.LIZIZ(stackTraceString);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LCU(ViewGroup viewContainer) {
        super((View) viewContainer);
        o.LJIIIZ(viewContainer, "viewContainer");
        this.LIZIZ = viewContainer;
        this.LJ = new ARunnableS45S0100000_9(this, 257);
    }
}
