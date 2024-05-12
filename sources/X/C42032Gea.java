package X;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Gea, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42032Gea<T> implements Comparator {
    public final /* synthetic */ java.util.Map<String, Integer> LJLIL;
    public final /* synthetic */ ArrayList<String> LJLILLLLZI;

    public C42032Gea(ArrayList arrayList, java.util.Map map) {
        this.LJLIL = map;
        this.LJLILLLLZI = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        String o1 = (String) obj;
        String o2 = (String) obj2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        Integer num = this.LJLIL.get(o1);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.LJLIL.get(o2);
        if (num2 != null) {
            i2 = num2.intValue();
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            return C1JI.LJI(o1, this.LJLILLLLZI) - C1JI.LJI(o2, this.LJLILLLLZI);
        }
        return i3;
    }
}
