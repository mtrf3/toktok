package X;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.ActivityResult;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q8H implements InterfaceC66438Q5q {
    public final InterfaceC008701r LIZ;
    public final Q8K LIZIZ;

    @Override // X.InterfaceC66438Q5q
    public final Activity LIZ() {
        Object obj = this.LIZ;
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        return null;
    }

    public Q8H(InterfaceC008701r interfaceC008701r, Q8K q8k) {
        this.LIZ = interfaceC008701r;
        this.LIZIZ = q8k;
    }

    @Override // X.InterfaceC66438Q5q
    public final void startActivityForResult(Intent intent, int i) {
        final Q8J q8j = new Q8J();
        AbstractC008601q activityResultRegistry = this.LIZ.getActivityResultRegistry();
        Q8I q8i = new Q8I();
        InterfaceC008201m interfaceC008201m = new InterfaceC008201m() { // from class: X.Q8G
            @Override // X.InterfaceC008201m
            public final void LIZ(Object obj) {
                Q8H this$0 = Q8H.this;
                Q8J launcherHolder = q8j;
                Pair pair = (Pair) obj;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(launcherHolder, "$launcherHolder");
                Q8K q8k = this$0.LIZIZ;
                int requestCode = Q5U.Login.toRequestCode();
                Object obj2 = pair.first;
                o.LJIIIIZZ(obj2, "result.first");
                q8k.onActivityResult(requestCode, ((Number) obj2).intValue(), (Intent) pair.second);
                C18K c18k = launcherHolder.LIZ;
                if (c18k != null) {
                    c18k.LIZIZ();
                }
                launcherHolder.LIZ = null;
            }
        };
        activityResultRegistry.LIZLLL("facebook-login");
        ((HashMap) activityResultRegistry.LJFF).put("facebook-login", new C008401o(q8i, interfaceC008201m));
        if (((HashMap) activityResultRegistry.LJI).containsKey("facebook-login")) {
            Object obj = ((HashMap) activityResultRegistry.LJI).get("facebook-login");
            ((HashMap) activityResultRegistry.LJI).remove("facebook-login");
            interfaceC008201m.LIZ(obj);
        }
        ActivityResult activityResult = (ActivityResult) activityResultRegistry.LJII.getParcelable("facebook-login");
        if (activityResult != null) {
            activityResultRegistry.LJII.remove("facebook-login");
            interfaceC008201m.LIZ(q8i.LIZIZ(activityResult.mResultCode, activityResult.mData));
        }
        C18K c18k = new C18K(activityResultRegistry, "facebook-login", q8i);
        q8j.LIZ = c18k;
        c18k.LIZ(intent);
    }
}
