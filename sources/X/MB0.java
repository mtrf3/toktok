package X;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MB0 extends AbstractC56382MAw {
    @Override // X.AbstractC56382MAw
    public final void LIZ(Intent intent) {
        int i;
        if (AV1.LJIILLIIL()) {
            i = 3;
        } else {
            i = 0;
        }
        intent.putExtra("extra_jump_type", i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MB0(Context context, String widgetType) {
        super(context, widgetType, "tt_icon");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
    }
}
