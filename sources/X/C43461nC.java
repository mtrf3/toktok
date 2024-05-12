package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C43461nC<Value> extends AbstractC34571Xh<Value> {
    public final C19000oq<Value> LIZ;
    public final boolean LIZIZ;

    @Override // X.AbstractC19020os
    public final void LIZ(List<Value> list) {
        if (!this.LIZ.LIZ()) {
            this.LIZ.LIZIZ(new C19110p1<>(list, 0, 0));
        }
    }

    @Override // X.AbstractC34571Xh
    public final void LIZIZ(int i, List list) {
        if (!this.LIZ.LIZ()) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() <= i) {
                if (arrayList.size() != 0 || i <= 0) {
                    int size = i - arrayList.size();
                    if (this.LIZIZ) {
                        this.LIZ.LIZIZ(new C19110p1<>(list, size, 0));
                        return;
                    } else {
                        this.LIZ.LIZIZ(new C19110p1<>(list));
                        return;
                    }
                }
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
        }
    }

    public C43461nC(AbstractC43471nD abstractC43471nD, boolean z, C34541Xe c34541Xe) {
        this.LIZ = new C19000oq<>(abstractC43471nD, 0, null, c34541Xe);
        this.LIZIZ = z;
    }
}
