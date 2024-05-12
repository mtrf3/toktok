package X;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.MAy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56384MAy extends AbstractC56382MAw {
    public final String LJ;

    @Override // X.AbstractC56382MAw
    public final void LIZ(Intent intent) {
        if (MWW.LIZ()) {
            intent.putExtra("extra_jump_type", 11);
            intent.putExtra("enter_method", this.LJ);
        } else {
            intent.putExtra("extra_jump_type", 13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56384MAy(Context context, String widgetType, String str, String str2) {
        super(context, widgetType, str);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        this.LJ = str2;
    }
}
