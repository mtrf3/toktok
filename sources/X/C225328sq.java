package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.param.MobParamProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.8sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225328sq {
    public static MobParamProvider LIZ(Context context) {
        o.LJIIIZ(context, "context");
        Activity LIZ = C27740Aue.LIZ(context);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (MobParamProvider) ViewModelProviders.of((ActivityC45651qj) LIZ).get(MobParamProvider.class);
    }
}
