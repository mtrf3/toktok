package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39738Fig extends EG4 {
    public final java.util.Map<String, View> LJLIL = new HashMap();
    public final /* synthetic */ C39739Fih LJLILLLLZI;

    public C39738Fig(C39739Fih c39739Fih) {
        this.LJLILLLLZI = c39739Fih;
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        String className = activity.getComponentName().getClassName();
        View view = (View) ((HashMap) this.LJLIL).get(className);
        if (view != null) {
            ((HashMap) this.LJLIL).put(className, null);
            C16880lQ.LJLLL(view, (ViewGroup) activity.getWindow().getDecorView());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        super.onActivityPostResumed(activity);
        if (this.LJLILLLLZI.LIZJ) {
            return;
        }
        String className = activity.getComponentName().getClassName();
        if (((HashMap) this.LJLIL).get(className) == null) {
            C39741Fij c39741Fij = new C39741Fij(this.LJLILLLLZI, activity);
            ((HashMap) this.LJLIL).put(className, c39741Fij);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(c39741Fij);
        }
    }
}
