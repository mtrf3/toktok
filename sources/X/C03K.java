package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.03K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03K {
    public final Context LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;
    public final WindowManager.LayoutParams LIZLLL;
    public final Rect LJ;
    public final int[] LJFF;
    public final int[] LJI;

    public C03K(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LIZLLL = layoutParams;
        this.LJ = new Rect();
        this.LJFF = new int[2];
        this.LJI = new int[2];
        this.LIZ = context;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dj, C16880lQ.LLZIL(context), null);
        this.LIZIZ = LLLZIIL;
        this.LIZJ = (TextView) LLLZIIL.findViewById(R.id.ghd);
        layoutParams.setTitle(C16880lQ.LJLLJ(C03K.class));
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.ac;
        layoutParams.flags = 24;
    }
}
