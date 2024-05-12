package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.jvm.internal.o;

/* renamed from: X.8VT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VT {
    public static AssemSupervisor LIZ(LifecycleOwner lifecycleOwner, Context context, C7C3 dataStore, C8VA serviceStore) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataStore, "dataStore");
        o.LJIIIZ(serviceStore, "serviceStore");
        return new AssemSupervisor(lifecycleOwner, context, dataStore, serviceStore);
    }
}
