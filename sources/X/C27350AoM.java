package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.AoM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27350AoM {
    public static C70414RkI LIZ(Context context) {
        Object obj = null;
        if (context == null) {
            return null;
        }
        Activity LIZ = C27740Aue.LIZ(context);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Object obj2 = ((TrackerProvider) ViewModelProviders.of((ActivityC45651qj) LIZ).get(TrackerProvider.class)).LJLIL;
        if (obj2 instanceof C70414RkI) {
            obj = obj2;
        }
        return (C70414RkI) obj;
    }
}
