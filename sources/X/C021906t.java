package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.06t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021906t {
    public final IconCompat LIZ;
    public final CharSequence LIZIZ;
    public final PendingIntent LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;
    public ArrayList<C020406e> LJFF;
    public final boolean LJI;

    public final C022006u LIZ() {
        C020406e[] c020406eArr;
        CharSequence[] charSequenceArr;
        java.util.Set<String> set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C020406e> arrayList3 = this.LJFF;
        if (arrayList3 != null) {
            Iterator<C020406e> it = arrayList3.iterator();
            while (it.hasNext()) {
                C020406e next = it.next();
                if (!next.LIZLLL && (((charSequenceArr = next.LIZJ) == null || charSequenceArr.length == 0) && (set = next.LJI) != null && !set.isEmpty())) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
        }
        C020406e[] c020406eArr2 = null;
        if (arrayList.isEmpty()) {
            c020406eArr = null;
        } else {
            c020406eArr = (C020406e[]) arrayList.toArray(new C020406e[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            c020406eArr2 = (C020406e[]) arrayList2.toArray(new C020406e[arrayList2.size()]);
        }
        return new C022006u(this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, c020406eArr2, c020406eArr, this.LIZLLL, 0, this.LJI, false, false);
    }

    public C021906t(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat LIZJ;
        if (i == 0) {
            LIZJ = null;
        } else {
            LIZJ = IconCompat.LIZJ(null, "", i);
        }
        Bundle bundle = new Bundle();
        this.LIZLLL = true;
        this.LJI = true;
        this.LIZ = LIZJ;
        this.LIZIZ = C022406y.LIZJ(charSequence);
        this.LIZJ = pendingIntent;
        this.LJ = bundle;
        this.LJFF = null;
        this.LIZLLL = true;
        this.LJI = true;
    }
}
