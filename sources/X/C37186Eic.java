package X;

import Y.ARunnableS13S0000000_6;
import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.Eic, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37186Eic {
    public ArrayList LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ(Context context) {
        if (Build.VERSION.SDK_INT > 23 || this.LIZIZ) {
            return;
        }
        ArrayList arrayList = this.LIZ;
        if (arrayList != null && arrayList.size() > 0) {
            this.LIZ.clear();
            return;
        }
        if (this.LIZJ || this.LIZ != null) {
            return;
        }
        new TextView(context).post(new ARunnableS13S0000000_6(50));
        try {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            Field declaredField = Thread.class.getDeclaredField("localValues");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(LLLLIIIILLL);
            Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
            declaredField2.setAccessible(true);
            for (Object obj2 : (Object[]) declaredField2.get(obj)) {
                if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                    Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                    declaredField3.setAccessible(true);
                    ArrayList arrayList2 = (ArrayList) declaredField3.get(obj2);
                    this.LIZ = arrayList2;
                    arrayList2.clear();
                    this.LIZJ = true;
                    return;
                }
            }
        } catch (Exception unused) {
            this.LIZIZ = true;
        }
    }
}
