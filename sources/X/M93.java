package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M93 extends MCC {
    public int LIZ = 1000;

    @Override // X.MCC
    public final boolean LJ() {
        UgAwemeActivitySetting awemeActivitySetting = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting();
        if (awemeActivitySetting != null) {
            return awemeActivitySetting.isUseTouchPointWidget();
        }
        return false;
    }

    @Override // X.MCC
    public final AbstractC73672Svk<Boolean> LIZLLL() {
        return C84763XOl.LJI();
    }

    @Override // X.MCC
    public final PendingIntent LIZIZ(Context context, String widgetTypeName) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetTypeName, "widgetTypeName");
        Intent LJIIJ = AppWidgetServiceImpl.LJIJI().LJIIJ(context, widgetTypeName);
        LJIIJ.putExtra("extra_jump_type", 0);
        int i2 = this.LIZ + 1;
        this.LIZ = i2;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        return PendingIntent.getActivity(context, i2, LJIIJ, i);
    }

    @Override // X.MCC
    public final PendingIntent LIZJ(Context context, String widgetTypeName, String str) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetTypeName, "widgetTypeName");
        Intent LJIIJ = AppWidgetServiceImpl.LJIJI().LJIIJ(context, widgetTypeName);
        LJIIJ.putExtra("extra_jump_type", 9);
        LJIIJ.putExtra("extra_jump_link", str);
        int i2 = this.LIZ + 1;
        this.LIZ = i2;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        return PendingIntent.getActivity(context, i2, LJIIJ, i);
    }
}
