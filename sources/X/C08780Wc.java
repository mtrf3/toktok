package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08780Wc {
    public static final List<C0WA> LJIIIIZZ;
    public static final List<String> LJIIIZ;
    public final List<C0WA> LIZ;
    public final List<String> LIZIZ;
    public final C0WB LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    static {
        LinkedList linkedList = new LinkedList();
        LJIIIIZZ = linkedList;
        LinkedList linkedList2 = new LinkedList();
        LJIIIZ = linkedList2;
        linkedList.add(new C0WA("beauty", Arrays.asList(1, 2, 3)));
        String str = C0TY.LIZLLL;
        linkedList.add(new C0WA(str, Arrays.asList(1, 2, 3)));
        linkedList.add(new C0WA("effect_gift", Arrays.asList(1, 3)));
        linkedList.add(new C0WA("livegame", Collections.singletonList(3)));
        linkedList.add(new C0WA(C0TY.LIZ, Collections.singletonList(2)));
        linkedList.add(new C0WA(C0TY.LIZIZ, Arrays.asList(1, 2)));
        linkedList.add(new C0WA("livebackground", Collections.singletonList(3)));
        linkedList.add(new C0WA(C0TY.LIZJ, Arrays.asList(1, 2)));
        linkedList.add(new C0WA(C0TY.LIZ(), Arrays.asList(1, 2, 3)));
        linkedList.add(new C0WA("liveguestbeauty", Arrays.asList(1, 2, 3)));
        linkedList2.add(str);
        linkedList2.add(C0TY.LIZ());
        linkedList2.add("makeupforever");
    }

    public C08780Wc(C08770Wb c08770Wb) {
        this.LJI = true;
        this.LJII = true;
        this.LIZJ = c08770Wb.LIZJ;
        List<String> list = c08770Wb.LIZ;
        this.LIZIZ = list == null ? Collections.emptyList() : list;
        List<String> list2 = c08770Wb.LIZIZ;
        this.LIZLLL = list2 == null ? Collections.emptyList() : list2;
        this.LIZ = LJIIIIZZ;
        this.LJ = LJIIIZ;
        this.LJFF = c08770Wb.LIZLLL;
        this.LJI = c08770Wb.LJ;
        this.LJII = true;
    }
}
