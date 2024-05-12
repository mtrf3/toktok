package X;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.MAx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56383MAx extends AbstractC56382MAw {
    public final String LJ;
    public final long LJFF;

    @Override // X.AbstractC56382MAw
    public final void LIZ(Intent intent) {
        intent.putExtra("extra_jump_type", 12);
        intent.putExtra("extra_aweme_id", this.LJ);
        intent.putExtra("extra_now_landing_post_time", this.LJFF);
        intent.putExtra("enter_method", "click_now_self");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56383MAx(Context context, String widgetType, long j, String str) {
        super(context, widgetType, "now_self");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        this.LJ = str;
        this.LJFF = j;
    }
}
