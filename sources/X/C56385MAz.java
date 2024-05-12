package X;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.MAz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56385MAz extends AbstractC56382MAw {
    public final String LJ;

    @Override // X.AbstractC56382MAw
    public final void LIZ(Intent intent) {
        intent.putExtra("extra_jump_type", 13);
        intent.putExtra("extra_aweme_id", this.LJ);
        intent.putExtra("enter_method", "click_now_others");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56385MAz(Context context, String widgetType, String str) {
        super(context, widgetType, "now_others");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        this.LJ = str;
    }
}
