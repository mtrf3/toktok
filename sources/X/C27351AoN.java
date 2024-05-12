package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.AoN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27351AoN {
    public static void LIZ(Context context, Object obj) {
        o.LJIIIZ(context, "context");
        Activity LIZ = C27740Aue.LIZ(context);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((TrackerProvider) ViewModelProviders.of((ActivityC45651qj) LIZ).get(TrackerProvider.class)).LJLIL = obj;
    }
}
