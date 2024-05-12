package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.R1n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68879R1n extends QIX {
    @Override // X.AbstractC68877R1l
    public final void LJIJ(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        if (C68882R1q.LIZ.isEmpty() && ((ConcurrentHashMap) C68882R1q.LIZIZ).isEmpty()) {
            return;
        }
        C1KV c1kv = new C1KV(1);
        Object obj = c1kv.LJLIL;
        ((C68878R1m) obj).LIZLLL = i;
        ((C68878R1m) obj).LIZJ = i2;
        String name = C16880lQ.LLLLIIIILLL().getName();
        Object obj2 = c1kv.LJLIL;
        ((C68878R1m) obj2).LIZIZ = name;
        ((C68878R1m) obj2).LJII = th;
        ((C68878R1m) c1kv.LJLIL).LJ = LJIIZILJ(list);
        String LJIILLIIL = AbstractC68877R1l.LJIILLIIL(str, objArr);
        Object obj3 = c1kv.LJLIL;
        ((C68878R1m) obj3).LJFF = LJIILLIIL;
        C68878R1m c68878R1m = (C68878R1m) obj3;
        C68882R1q.LIZ(c68878R1m);
        Iterator it = ((ConcurrentHashMap) C68882R1q.LIZIZ).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC68884R1s) it.next()).LIZ(c68878R1m);
        }
    }
}
