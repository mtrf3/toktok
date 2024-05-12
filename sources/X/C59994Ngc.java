package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ngc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C59994Ngc implements InterfaceC48038ItG {
    public static EnumC74778TWk LIZJ() {
        C29556Biq.LIZ().getClass();
        return C74983Tbn.LIZJ();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        C59885Ner c59885Ner = (C59885Ner) obj;
        float f = 0.0f;
        if (c59885Ner.LIZJ) {
            long j = c59885Ner.LIZ;
            Context context = NR0.LIZLLL.LIZJ.get();
            if (context != null) {
                ArrayList<C59993Ngb> LIZIZ = C59995Ngd.LIZIZ(C59995Ngd.LIZ(c59885Ner.LIZLLL, context), c59885Ner.LJ);
                SystemClock.currentThreadTimeMillis();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                Iterator<C59993Ngb> it = LIZIZ.iterator();
                while (it.hasNext()) {
                    C59993Ngb next = it.next();
                    hashSet.add(Integer.valueOf(next.LIZ));
                    hashSet.add(Integer.valueOf(next.LIZJ));
                    hashSet2.add(Integer.valueOf(next.LIZIZ));
                    hashSet2.add(Integer.valueOf(next.LIZLLL));
                }
                ArrayList arrayList = new ArrayList(hashSet);
                ArrayList arrayList2 = new ArrayList(hashSet2);
                Collections.sort(arrayList);
                Collections.sort(arrayList2);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= arrayList.size() - 1) {
                        break;
                    }
                    int i3 = 0;
                    for (int i4 = 1; i3 < arrayList2.size() - i4; i4 = 1) {
                        int i5 = i + 1;
                        int intValue = ((Integer) ListProtector.get(arrayList, i5)).intValue() - ((Integer) ListProtector.get(arrayList, i)).intValue();
                        int i6 = i3 + 1;
                        int intValue2 = ((Integer) ListProtector.get(arrayList2, i6)).intValue() - ((Integer) ListProtector.get(arrayList2, i3)).intValue();
                        Iterator<C59993Ngb> it2 = LIZIZ.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            C59993Ngb next2 = it2.next();
                            if (next2.LIZ <= ((Integer) ListProtector.get(arrayList, i)).intValue() && next2.LIZJ >= ((Integer) ListProtector.get(arrayList, i5)).intValue() && next2.LIZLLL >= ((Integer) ListProtector.get(arrayList2, i6)).intValue() && next2.LIZIZ <= ((Integer) ListProtector.get(arrayList2, i3)).intValue()) {
                                z = true;
                            }
                        }
                        if (z) {
                            i2 = (intValue * intValue2) + i2;
                        }
                        i3 = i6;
                    }
                    i++;
                }
                f = (r12.LIZ() - i2) / c59885Ner.LIZLLL.LIZ();
            }
            return new C40449Fu9(j, c59885Ner.LIZIZ, f);
        }
        return new C40449Fu9(c59885Ner.LIZ, c59885Ner.LIZIZ, 0.0f);
    }

    public static ViewModelStore LIZ(InterfaceC93923mO interfaceC93923mO, String str) {
        ViewModelStore viewModelStore = C86793Y4n.LJIJJLI(interfaceC93923mO.getContext()).getViewModelStore();
        o.LJIIIIZZ(viewModelStore, str);
        return viewModelStore;
    }

    public static C88450YnW LIZIZ(LinkedList linkedList, C88450YnW c88450YnW) {
        linkedList.add(c88450YnW);
        return new C88450YnW();
    }
}
