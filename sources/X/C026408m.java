package X;

import Y.IDComparatorS28S0000000;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.08m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C026408m {
    public static String LIZIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i / 1024.0f);
        LIZ.append("K");
        return X1D.LIZIZ(LIZ);
    }

    public static int LIZJ(Object obj) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeValue(obj);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Bundle bundle, StringBuilder sb, int i) {
        Class<Bundle> cls = Bundle.class;
        do {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getMap", new Class[0]);
                declaredMethod.setAccessible(true);
                java.util.Map map = (java.util.Map) declaredMethod.invoke(bundle, new Object[0]);
                if (map != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new C026208k(LIZJ(entry.getValue()), Pair.create(entry.getKey(), entry.getValue())));
                    }
                    Collections.sort(arrayList, new IDComparatorS28S0000000(0));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C026208k c026208k = (C026208k) it.next();
                        Pair pair = (Pair) c026208k.LIZIZ;
                        String str = (String) pair.first;
                        Object obj = pair.second;
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(' ');
                        }
                        C1DI.LIZIZ(sb, "key: ", str, ", size: ");
                        sb.append(LIZIZ(c026208k.LIZ));
                        sb.append('\n');
                        if (obj instanceof Bundle) {
                            LIZ((Bundle) obj, sb, i + 4);
                        } else if (obj instanceof FragmentManagerState) {
                            ArrayList<FragmentState> arrayList2 = ((FragmentManagerState) obj).LJLIL;
                            if (arrayList2 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<FragmentState> it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    FragmentState next = it2.next();
                                    arrayList3.add(new C026208k(LIZJ(next), next));
                                }
                                Collections.sort(arrayList3, new IDComparatorS28S0000000(1));
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    C026208k c026208k2 = (C026208k) it3.next();
                                    int i3 = i + 4;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        sb.append(' ');
                                    }
                                    sb.append("FragmentState: ");
                                    sb.append(((FragmentState) c026208k2.LIZIZ).LJLIL);
                                    sb.append(", size: ");
                                    sb.append(LIZIZ(c026208k2.LIZ));
                                    sb.append('\n');
                                    Bundle bundle2 = new Bundle();
                                    Bundle bundle3 = ((FragmentState) c026208k2.LIZIZ).LJLL;
                                    if (bundle3 != null) {
                                        bundle2.putAll(bundle3);
                                    }
                                    Bundle bundle4 = ((FragmentState) c026208k2.LIZIZ).LJLLJ;
                                    if (bundle4 != null) {
                                        bundle2.putAll(bundle4);
                                    }
                                    LIZ(bundle2, sb, i + 8);
                                }
                            }
                        } else {
                            if (!(obj instanceof List)) {
                                if (!(obj instanceof SparseArray) && !(obj instanceof Parcelable[])) {
                                }
                            } else {
                                int i5 = 0;
                                while (true) {
                                    List list = (List) obj;
                                    if (i5 >= list.size()) {
                                        break;
                                    }
                                    Object obj2 = ListProtector.get(list, i5);
                                    if (obj2 instanceof Bundle) {
                                        LIZ((Bundle) obj2, sb, i + 4);
                                    }
                                    i5++;
                                }
                            }
                            if (obj instanceof SparseArray) {
                                int i6 = 0;
                                while (true) {
                                    SparseArray sparseArray = (SparseArray) obj;
                                    if (i6 >= sparseArray.size()) {
                                        break;
                                    }
                                    Object valueAt = sparseArray.valueAt(i6);
                                    if (valueAt instanceof Bundle) {
                                        LIZ((Bundle) valueAt, sb, i + 4);
                                    }
                                    i6++;
                                }
                            }
                            if (obj instanceof Parcelable[]) {
                                int i7 = 0;
                                while (true) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    if (i7 < parcelableArr.length) {
                                        Parcelable parcelable = parcelableArr[i7];
                                        if (parcelable instanceof Bundle) {
                                            LIZ((Bundle) parcelable, sb, i + 4);
                                        }
                                        i7++;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    return;
                }
            }
        } while (cls != Object.class);
    }
}
