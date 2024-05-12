package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.V8p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79255V8p {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Context context) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        o.LJIIIIZZ(configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
