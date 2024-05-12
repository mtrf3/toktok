package X;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OK1 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Activity activity) {
        int i;
        if (Build.VERSION.SDK_INT < 28 || (i = activity.getWindow().getAttributes().layoutInDisplayCutoutMode) == 1) {
            return true;
        }
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.rn, new int[]{android.R.attr.windowFullscreen});
            o.LJIIIIZZ(obtainStyledAttributes, "activity.obtainStyledAtt…R.attr.windowFullscreen))");
            obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (typedValue.type != 18 || typedValue.data == 0) {
                return true;
            }
        }
        return false;
    }
}
