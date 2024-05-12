package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.NwF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60963NwF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        o.LJIIJ(context, "context");
        Resources resources = context.getResources();
        o.LJFF(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        o.LJFF(configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
