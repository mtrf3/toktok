package X;

import android.content.Context;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class V1F {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;

    public V1F(Context context) {
        boolean z;
        int i;
        TypedValue LIZ = C78972Uz2.LIZ(R.attr.ab8, context);
        if (LIZ != null && LIZ.type == 18 && LIZ.data != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        TypedValue LIZ2 = C78972Uz2.LIZ(R.attr.ab7, context);
        if (LIZ2 != null) {
            i = LIZ2.data;
        } else {
            i = 0;
        }
        this.LIZIZ = i;
        TypedValue LIZ3 = C78972Uz2.LIZ(R.attr.a4y, context);
        this.LIZJ = LIZ3 != null ? LIZ3.data : 0;
        this.LIZLLL = context.getResources().getDisplayMetrics().density;
    }
}
