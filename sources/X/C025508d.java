package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.08d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C025508d {
    public final ArrayList<Fragment> LIZ = new ArrayList<>();
    public final HashMap<String, C09E> LIZIZ = new HashMap<>();

    public final List<Fragment> LIZJ() {
        ArrayList arrayList = new ArrayList();
        for (C09E c09e : this.LIZIZ.values()) {
            if (c09e != null) {
                arrayList.add(c09e.LIZIZ);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> LIZLLL() {
        ArrayList arrayList;
        if (this.LIZ.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.LIZ) {
            arrayList = new ArrayList(this.LIZ);
        }
        return arrayList;
    }

    public final void LIZ(Fragment fragment) {
        if (!this.LIZ.contains(fragment)) {
            synchronized (this.LIZ) {
                this.LIZ.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fragment already added: ");
        LIZ.append(fragment);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(int i) {
        Iterator<Fragment> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C09E c09e = this.LIZIZ.get(it.next().mWho);
            if (c09e != null) {
                c09e.LIZJ = i;
            }
        }
        for (C09E c09e2 : this.LIZIZ.values()) {
            if (c09e2 != null) {
                c09e2.LIZJ = i;
            }
        }
    }
}
