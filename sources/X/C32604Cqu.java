package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Cqu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32604Cqu {
    public final LinkedList<C32633CrN> LIZ = new LinkedList<>();
    public C32633CrN LIZIZ;

    public final void LIZ(C32633CrN status) {
        o.LJIIIZ(status, "status");
        LIZIZ(status);
        long j = status.LIZJ;
        Iterator<C32633CrN> it = this.LIZ.iterator();
        while (it.hasNext()) {
            C32633CrN next = it.next();
            if (next.LIZIZ == EnumC32627CrH.DOT) {
                next.LIZJ = j;
            }
        }
        this.LIZ.addFirst(status);
    }

    public final void LIZIZ(C32633CrN c32633CrN) {
        if (c32633CrN == null) {
            return;
        }
        Iterator<C32633CrN> it = this.LIZ.iterator();
        o.LJIIIIZZ(it, "mGuideStatusList.iterator()");
        while (it.hasNext()) {
            C32633CrN next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            C32633CrN c32633CrN2 = next;
            EnumC32627CrH enumC32627CrH = c32633CrN2.LIZIZ;
            EnumC32627CrH enumC32627CrH2 = EnumC32627CrH.BUBBLE;
            if (enumC32627CrH != enumC32627CrH2 && enumC32627CrH == c32633CrN.LIZIZ) {
                it.remove();
            } else if (enumC32627CrH == enumC32627CrH2 && c32633CrN2.LIZ == c32633CrN.LIZ) {
                it.remove();
            }
        }
    }
}
