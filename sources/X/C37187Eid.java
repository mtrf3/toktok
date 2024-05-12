package X;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Eid, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37187Eid {
    public ArrayList<?> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ(Context context) {
        if (Build.VERSION.SDK_INT > 23 || this.LIZIZ) {
            return;
        }
        ArrayList<?> arrayList = this.LIZ;
        if (arrayList != null) {
            o.LJI(arrayList);
            if (arrayList.size() > 0) {
                C79004UzY.LJI(this.LIZ);
                return;
            }
        }
        if (this.LIZJ || this.LIZ != null) {
            return;
        }
        new TextView(context).post(RunnableC37188Eie.LJLIL);
        try {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            Field declaredField = Thread.class.getDeclaredField("localValues");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(LLLLIIIILLL);
            Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            for (Object obj3 : (Object[]) obj2) {
                if (obj3 != null && o.LJ(obj3.getClass().getName(), "android.view.ViewRootImpl$RunQueue")) {
                    Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                    declaredField3.setAccessible(true);
                    C79004UzY.LJI(declaredField3.get(obj3));
                    Object obj4 = declaredField3.get(obj3);
                    o.LJII(obj4, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                    this.LIZ = (ArrayList) obj4;
                    this.LIZJ = true;
                    return;
                }
            }
        } catch (Exception unused) {
            this.LIZIZ = true;
        }
    }
}
