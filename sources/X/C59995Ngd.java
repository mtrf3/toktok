package X;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ngd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59995Ngd {
    public static C59993Ngb LIZ(C59993Ngb c59993Ngb, Context context) {
        int i = C78847Ux1.LJLJJLL;
        if (i == 0) {
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            if (windowManager != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                C78847Ux1.LJLJJL = point.x;
                C78847Ux1.LJLJJLL = point.y;
            }
            if (C78847Ux1.LJLJJL == 0 || C78847Ux1.LJLJJLL == 0) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                C78847Ux1.LJLJJL = displayMetrics.widthPixels;
                C78847Ux1.LJLJJLL = displayMetrics.heightPixels;
            }
            i = C78847Ux1.LJLJJLL;
        }
        int i2 = C78847Ux1.LJLJJL;
        if (i2 == 0) {
            WindowManager windowManager2 = (WindowManager) C16880lQ.LLILL(context, "window");
            if (windowManager2 != null) {
                Point point2 = new Point();
                windowManager2.getDefaultDisplay().getSize(point2);
                C78847Ux1.LJLJJL = point2.x;
                C78847Ux1.LJLJJLL = point2.y;
            }
            if (C78847Ux1.LJLJJL == 0 || C78847Ux1.LJLJJLL == 0) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                C78847Ux1.LJLJJL = displayMetrics2.widthPixels;
                C78847Ux1.LJLJJLL = displayMetrics2.heightPixels;
            }
            i2 = C78847Ux1.LJLJJL;
        }
        return c59993Ngb.LIZIZ(new C59993Ngb(0, 0, i2, i, c59993Ngb.LJ));
    }

    public static ArrayList<C59993Ngb> LIZIZ(C59993Ngb c59993Ngb, ArrayList<C59993Ngb> arrayList) {
        ArrayList<C59993Ngb> arrayList2 = new ArrayList<>();
        Iterator<C59993Ngb> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c59993Ngb.LIZIZ(it.next()));
        }
        return arrayList2;
    }
}
