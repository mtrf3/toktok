package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PRl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64457PRl implements InterfaceC64469PRx {
    @Override // X.InterfaceC64469PRx
    public final boolean LIZ(C64464PRs probeUnit, List messageList, long j) {
        Object obj;
        String str;
        long uptimeMillis;
        long[] LIZIZ;
        o.LJIIIZ(probeUnit, "probeUnit");
        o.LJIIIZ(messageList, "messageList");
        Iterator it = messageList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Number) ((C64466PRu) obj).LIZLLL.getValue()).longValue() >= 30) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C64466PRu c64466PRu = (C64466PRu) obj;
        if (c64466PRu == null) {
            return false;
        }
        C64467PRv c64467PRv = new C64467PRv();
        c64467PRv.LIZ = 1;
        c64467PRv.LIZIZ = c64466PRu.LIZJ;
        C64468PRw c64468PRw = new C64468PRw();
        long j2 = c64466PRu.LIZ;
        long j3 = c64466PRu.LIZIZ;
        try {
            uptimeMillis = SystemClock.uptimeMillis();
            LIZIZ = C25500zK.LIZIZ(j2, j3);
        } catch (Throwable unused) {
        }
        if (LIZIZ != null) {
            LinkedList linkedList = new LinkedList();
            C64229PIr.LJFF(LIZIZ, linkedList, uptimeMillis);
            C64229PIr.LJI(5, linkedList);
            StringBuilder sb = new StringBuilder();
            C64229PIr.LJ(linkedList, sb);
            str = sb.toString();
            o.LJIIIIZZ(str, "reportBuilder.toString()");
            c64468PRw.LIZ = str;
            c64467PRv.LIZJ = C47261Igj.LJJIJIL(c64468PRw);
            probeUnit.LIZ(c64467PRv);
            return true;
        }
        str = "";
        c64468PRw.LIZ = str;
        c64467PRv.LIZJ = C47261Igj.LJJIJIL(c64468PRw);
        probeUnit.LIZ(c64467PRv);
        return true;
    }
}
