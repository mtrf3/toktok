package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MRk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56812MRk {
    public static float LIZ;

    public static void LIZ(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(C04270Et.LIZIZ(view.getContext(), R.drawable.zb));
        } else {
            C7FA.LIZIZ(view);
        }
    }

    public static int LIZIZ(Context context) {
        float f = LIZ;
        if (f > 0.0f) {
            return (int) f;
        }
        float LIZJ = LIZJ(context);
        LIZ = LIZJ;
        return (int) LIZJ;
    }

    public static float LIZJ(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.ibm, R.string.exk, R.string.ie7, R.string.ibq, R.string.iwz, R.string.iy1, R.string.exm, R.string.gix, R.string.i3_};
        Paint paint = new Paint();
        paint.setTextSize(KL2.LIZJ(context, 14.0f));
        float LIZJ = KL2.LIZJ(context, 88.0f);
        float LIZJ2 = KL2.LIZJ(context, 120.0f);
        int i = 0;
        do {
            float measureText = paint.measureText(context.getString(iArr[i]));
            if (measureText > f) {
                f = measureText;
            }
            i++;
        } while (i < 9);
        float LIZJ3 = KL2.LIZJ(context, 16.0f) + f;
        if (LIZJ3 > LIZJ2) {
            return LIZJ2;
        }
        if (LIZJ3 < LIZJ) {
            return LIZJ;
        }
        return LIZJ3;
    }
}
