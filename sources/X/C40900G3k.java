package X;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.G3k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40900G3k extends G46 {
    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix()));
        activity.getWindow().getDecorView().setLayerType(2, paint);
    }
}
