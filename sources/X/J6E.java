package X;

import Y.ARunnableS27S0200000_8;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J6E implements J5W {
    public final /* synthetic */ J6F LIZ;

    public J6E(J6F j6f) {
        this.LIZ = j6f;
    }

    @Override // X.J5W
    public final void LIZ(J5Q j5q) {
        boolean z;
        Object obj;
        Object obj2;
        float[] fArr;
        J6F j6f = this.LIZ;
        j6f.getClass();
        if (j5q.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !o.LJ(j5q.LIZIZ, J5R.LJLJJI) && (fArr = j6f.LJIILIIL) != null) {
            J6T j6t = j6f.LJ;
            int i = j5q.LIZIZ.LJLIL;
            j6t.getClass();
            if (i == 1 || i == 2) {
                LinkedList<RectF> linkedList = j6t.LIZ[i - 1];
                synchronized (linkedList) {
                    linkedList.offerLast(j6t.LIZ(fArr));
                    if (linkedList.size() > 15) {
                        linkedList.removeFirst();
                    }
                }
            }
        }
        J6F j6f2 = this.LIZ;
        j6f2.getClass();
        int i2 = j5q.LIZIZ.LJLIL;
        Iterator it = ((ArrayList) j5q.LIZJ).iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((J5R) obj2).LJLIL == 1) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        J5R j5r = (J5R) obj2;
        if (j5r != null) {
            float f = j5r.LJLJI;
            Iterator it2 = ((ArrayList) j5q.LIZJ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((J5R) next).LJLIL == 2) {
                    obj = next;
                    break;
                }
            }
            J5R j5r2 = (J5R) obj;
            if (j5r2 != null) {
                float f2 = j5r2.LJLJI;
                j5q.LIZIZ.getClass();
                FQN fqn = new FQN(i2, f, f2);
                j6f2.LJI = fqn;
                j6f2.LIZJ.post(new ARunnableS27S0200000_8(fqn, j6f2, 62));
            }
        }
    }
}
