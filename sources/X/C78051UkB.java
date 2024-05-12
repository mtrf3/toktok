package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.UkB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78051UkB extends C1C9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78051UkB(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 200.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        if (i > 2000) {
            i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return super.LJIIL(i);
    }
}
