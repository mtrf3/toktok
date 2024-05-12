package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VIB {
    public final View LIZ;
    public List<List<String>> LIZJ;
    public VID LJ;
    public C79925VYj LJFF;
    public final List<C79762VSc> LIZIZ = new ArrayList();
    public final List<Integer> LIZLLL = new ArrayList();

    public VIB(View view) {
        this.LIZ = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final void LIZ(List<Integer> list) {
        if (this.LIZJ == null) {
            ((ArrayList) this.LIZLLL).clear();
            return;
        }
        if (list == 0) {
            list = new ArrayList<>();
            for (int i = 0; i < this.LIZJ.size(); i++) {
                list.add(0);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("index can not be null");
            }
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
            C79762VSc c79762VSc = (C79762VSc) ListProtector.get(this.LIZIZ, i2);
            if (i2 < list.size()) {
                int intValue = ((Integer) ListProtector.get(list, i2)).intValue();
                List<List<String>> list2 = this.LIZJ;
                if (list2 != null && i2 < list2.size() && intValue < ((List) ListProtector.get(this.LIZJ, i2)).size()) {
                    c79762VSc.setCurrentIndex(intValue);
                } else {
                    ListProtector.set(list, i2, 0);
                    c79762VSc.setCurrentIndex(0);
                }
            } else {
                c79762VSc.setCurrentIndex(0);
            }
        }
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(list);
    }
}
