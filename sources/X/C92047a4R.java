package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a4R, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92047a4R {
    public static final String LIZLLL(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final long LIZ() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static final String LIZJ(List<String> list) {
        o.LJIIIZ(list, "<this>");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i2);
                LIZ.append(", ");
                LIZ.append((Object) str);
                arrayList.add(X1D.LIZIZ(LIZ));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String LLD = ORZ.LLD(arrayList, "; ", null, null, null, 62);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("{ ");
        LIZ2.append(LLD);
        LIZ2.append(" }");
        return X1D.LIZIZ(LIZ2);
    }

    public static final String LJ(List<? extends List<? extends Object>> list) {
        boolean z;
        String str;
        o.LJIIIZ(list, "<this>");
        try {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            int i = 0;
            for (List<? extends Object> list2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    List<? extends Object> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                    for (Object obj : list3) {
                        if (obj == null) {
                            str = "null";
                        } else if (obj instanceof Boolean) {
                            str = LIZLLL(((Boolean) obj).booleanValue());
                        } else if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = "";
                        }
                        arrayList2.add(str);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((String) next).length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(next);
                        }
                    }
                    String LLD = ORZ.LLD(arrayList3, ", ", null, null, null, 62);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i2);
                    LIZ.append(", ");
                    LIZ.append(LLD);
                    arrayList.add(X1D.LIZIZ(LIZ));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            String LLD2 = ORZ.LLD(arrayList, "; ", null, null, null, 62);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("{ ");
            LIZ2.append(LLD2);
            LIZ2.append(" }");
            return X1D.LIZIZ(LIZ2);
        } catch (Throwable unused) {
            return "{ }";
        }
    }

    public static final List LIZIZ(Boolean bool, String str, String str2) {
        return C47261Igj.LJJIJIIJI(str, str2, bool);
    }
}
