package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zz4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91714Zz4 {
    public final Context LIZ;
    public final Intent LIZIZ;
    public final C92143a5z LIZJ;
    public final List<C91713Zz3> LIZLLL;

    public final C020906j LIZ() {
        if (this.LIZJ != null) {
            if (!((ArrayList) this.LIZLLL).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                Iterator it = ((ArrayList) this.LIZLLL).iterator();
                C91720ZzA c91720ZzA = null;
                while (true) {
                    int i = 0;
                    if (it.hasNext()) {
                        C91713Zz3 c91713Zz3 = (C91713Zz3) it.next();
                        int i2 = c91713Zz3.LIZ;
                        Bundle bundle = c91713Zz3.LIZIZ;
                        C91720ZzA LIZIZ = LIZIZ(i2);
                        if (LIZIZ != null) {
                            int[] LJIIIIZZ = LIZIZ.LJIIIIZZ(c91720ZzA);
                            int length = LJIIIIZZ.length;
                            while (i < length) {
                                int i3 = LJIIIIZZ[i];
                                i++;
                                arrayList.add(Integer.valueOf(i3));
                                arrayList2.add(bundle);
                            }
                            c91720ZzA = LIZIZ;
                        } else {
                            String LIZIZ2 = C91718Zz8.LIZIZ(i2, this.LIZ);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Navigation destination ");
                            LIZ.append(LIZIZ2);
                            LIZ.append(" cannot be found in the navigation graph ");
                            LIZ.append(this.LIZJ);
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                        }
                    } else {
                        this.LIZIZ.putExtra("android-support-nav:controller:deepLinkIds", ORZ.LLJ(arrayList));
                        this.LIZIZ.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                        C020906j c020906j = new C020906j(this.LIZ);
                        Intent intent = new Intent(this.LIZIZ);
                        ComponentName component = intent.getComponent();
                        if (component != null || (component = intent.resolveActivity(c020906j.LJLILLLLZI.getPackageManager())) != null) {
                            c020906j.LIZJ(component);
                        }
                        c020906j.LJLIL.add(intent);
                        int size = c020906j.LJLIL.size();
                        while (i < size) {
                            int i4 = i + 1;
                            Intent intent2 = (Intent) ListProtector.get(c020906j.LJLIL, i);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", this.LIZIZ);
                            }
                            i = i4;
                        }
                        return c020906j;
                    }
                }
            } else {
                "You must call setDestination() or addDestination() before constructing the deep link".toString();
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
            }
        } else {
            "You must call setGraph() before constructing the deep link".toString();
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
    }

    public final void LIZJ() {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            int i = ((C91713Zz3) it.next()).LIZ;
            if (LIZIZ(i) == null) {
                String LIZIZ = C91718Zz8.LIZIZ(i, this.LIZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Navigation destination ");
                LIZ.append(LIZIZ);
                LIZ.append(" cannot be found in the navigation graph ");
                LIZ.append(this.LIZJ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
    }

    public C91714Zz4(C92145a61 navController) {
        Intent launchIntentForPackage;
        o.LJIIIZ(navController, "navController");
        Context context = navController.LIZ;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.LIZIZ = launchIntentForPackage;
        this.LIZLLL = new ArrayList();
        this.LIZJ = navController.LJII();
    }

    public final C91720ZzA LIZIZ(int i) {
        ORV orv = new ORV();
        C92143a5z c92143a5z = this.LIZJ;
        o.LJI(c92143a5z);
        orv.addLast(c92143a5z);
        while (!orv.isEmpty()) {
            C91720ZzA c91720ZzA = (C91720ZzA) orv.removeFirst();
            if (c91720ZzA.LJLJJLL == i) {
                return c91720ZzA;
            }
            if (c91720ZzA instanceof C92143a5z) {
                C92142a5y c92142a5y = new C92142a5y((C92143a5z) c91720ZzA);
                while (c92142a5y.hasNext()) {
                    orv.addLast(c92142a5y.next());
                }
            }
        }
        return null;
    }
}
