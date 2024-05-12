package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAE {
    public static Intent LIZ(Context context, String widgetType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        Intent intent = new Intent(context, (Class<?>) AppWidgetLinkProxyActivity.class);
        intent.putExtra("extra_widget_type", widgetType);
        return intent;
    }
}
