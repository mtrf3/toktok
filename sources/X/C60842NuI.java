package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.NuI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60842NuI {
    public final CopyOnWriteArrayList<InterfaceC60850NuQ> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Activity activity, InterfaceC88471Ynr interfaceC88471Ynr) {
        if (!(activity instanceof SparkActivity) || activity == null) {
            return;
        }
        Iterator<InterfaceC60850NuQ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC60850NuQ cb = it.next();
            o.LJFF(cb, "cb");
            interfaceC88471Ynr.invoke(cb, activity);
        }
    }
}
