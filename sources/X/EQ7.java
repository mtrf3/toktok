package X;

import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class EQ7 {
    public static final ArrayList<String> LIZ = new ArrayList<>();

    static {
        new ArrayList();
    }

    public static ArrayList<String> LIZ() {
        Iterator<String> it = LIZ.iterator();
        String str = "";
        while (it.hasNext()) {
            str = a1.LJ(str, it.next(), " , ");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(LIZ);
        arrayList.addAll(EQ6.LIZIZ().LIZ());
        return arrayList;
    }
}
