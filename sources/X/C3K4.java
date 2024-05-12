package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.3K4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K4 {
    public static final C3K4 LIZ = new C3K4();
    public static final List<OSZ<String, String>> LIZIZ = new ArrayList();
    public static long LIZJ;

    public final StringBuilder LIZLLL() {
        List LLILZ;
        synchronized (this) {
            LLILZ = ORZ.LLILZ(100, LIZIZ);
        }
        StringBuilder sb = new StringBuilder();
        if (LLILZ.isEmpty()) {
            return sb;
        }
        sb.append((String) ((OSZ) ListProtector.get(LLILZ, 0)).getFirst());
        sb.append(":");
        sb.append((String) ((OSZ) ListProtector.get(LLILZ, 0)).getSecond());
        int size = LLILZ.size();
        for (int i = 1; i < size; i++) {
            OSZ osz = (OSZ) ListProtector.get(LLILZ, i);
            sb.append("_");
            sb.append((String) osz.getFirst());
            sb.append(":");
            sb.append((String) osz.getSecond());
        }
        if (LLILZ.size() == 100) {
            sb.append("_more");
        }
        return sb;
    }

    public final void LIZIZ(C81913Jj result) {
        o.LJIIIZ(result, "result");
        if (o.LJ(result.LJLIL.LJLIL, "preload")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("6(");
            LIZ2.append(result.LJLILLLLZI.size());
            LIZ2.append('_');
            LIZ2.append(result.LJLJJL);
            LIZ2.append('_');
            LIZ2.append(result.LJLIL.LJLILLLLZI);
            LIZ2.append(')');
            LIZJ(this, X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("7(");
        LIZ3.append(result.LJLILLLLZI.size());
        LIZ3.append('_');
        LIZ3.append(result.LJLIL.LJLILLLLZI);
        LIZ3.append(')');
        LIZJ(this, X1D.LIZIZ(LIZ3));
    }

    public static void LIZJ(C3K4 c3k4, String str) {
        String valueOf;
        synchronized (c3k4) {
            List<OSZ<String, String>> list = LIZIZ;
            if (((ArrayList) list).size() >= 100) {
                ORS.LJJLJ(list);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = LIZJ;
            long j2 = currentTimeMillis - j;
            if (j == 0) {
                valueOf = new SimpleDateFormat("dd-HH-mm-ss").format(new Date(currentTimeMillis));
            } else {
                valueOf = String.valueOf(j2);
            }
            if (ujb.o.LJJJLIIL(str, "r", false)) {
                ArrayList arrayList = (ArrayList) list;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (ujb.o.LJJJLIIL((String) ((OSZ) listIterator.previous()).getFirst(), "r", false)) {
                        int nextIndex = listIterator.nextIndex();
                        if (nextIndex >= 0) {
                            ListProtector.remove(LIZIZ, nextIndex);
                        }
                    }
                }
            }
            LIZJ = currentTimeMillis;
            ((ArrayList) LIZIZ).add(new OSZ(str, valueOf));
        }
    }

    public final void LIZ(int i, C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("12(");
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(sessionPage);
        LIZ2.append(')');
        LIZJ(this, X1D.LIZIZ(LIZ2));
    }
}
