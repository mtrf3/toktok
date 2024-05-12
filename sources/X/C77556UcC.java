package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UcC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77556UcC {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.e2});
        o.LJIIIIZZ(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attribute)");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
}
