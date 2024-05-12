package X;

import Y.IDRunnableS32S0200000_29;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ZtV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91369ZtV extends PMI {
    public final ViewGroup LIZIZ;
    public final InterfaceC92113jT LIZJ;
    public View LIZLLL;
    public C77869UhF LJ;
    public LSY LJFF;

    public final void LJIILL() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            View view = this.LIZLLL;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300L).withEndAction(new IDRunnableS32S0200000_29(view, this, 0)).start();
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

    public C91369ZtV(ViewGroup viewGroup, InterfaceC92113jT interfaceC92113jT) {
        super((View) viewGroup);
        this.LIZIZ = viewGroup;
        this.LIZJ = interfaceC92113jT;
    }
}
