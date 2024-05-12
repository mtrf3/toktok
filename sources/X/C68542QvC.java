package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QvC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68542QvC {
    public static QXB LIZIZ;
    public static QQC LIZJ;
    public static final C68542QvC LIZ = new C68542QvC();
    public static final List<InterfaceC252619vl> LIZLLL = new LinkedList();

    public static final void LIZJ() {
        if (C33884DRo.LIZLLL()) {
            C38995FSd.LIZLLL().execute(RunnableC40470FuU.LJLIL);
            return;
        }
        QXB qxb = LIZIZ;
        o.LJI(qxb);
        qxb.LIZJ();
    }

    public static void LIZ(InterfaceC252619vl listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (C68542QvC.class) {
            List<InterfaceC252619vl> list = LIZLLL;
            if (!((LinkedList) list).contains(listener)) {
                ((LinkedList) list).add(listener);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[Catch: all -> 0x01c9, TryCatch #3 {, blocks: (B:8:0x000e, B:10:0x0016, B:12:0x001f, B:14:0x0035, B:16:0x0046, B:18:0x004e, B:19:0x006c, B:21:0x007a, B:23:0x008a, B:26:0x0095, B:27:0x00a5, B:30:0x00c8, B:32:0x014f, B:34:0x015c, B:37:0x0177, B:39:0x017b, B:42:0x018a, B:45:0x019d, B:48:0x01a0, B:50:0x01bf, B:60:0x0025), top: B:7:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #3 {, blocks: (B:8:0x000e, B:10:0x0016, B:12:0x001f, B:14:0x0035, B:16:0x0046, B:18:0x004e, B:19:0x006c, B:21:0x007a, B:23:0x008a, B:26:0x0095, B:27:0x00a5, B:30:0x00c8, B:32:0x014f, B:34:0x015c, B:37:0x0177, B:39:0x017b, B:42:0x018a, B:45:0x019d, B:48:0x01a0, B:50:0x01bf, B:60:0x0025), top: B:7:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.QTZ r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68542QvC.LIZLLL(X.QTZ, java.lang.String):void");
    }

    public static void LIZIZ(int i, User user, User user2) {
        LinkedList linkedList = new LinkedList();
        synchronized (C68542QvC.class) {
            linkedList.addAll(LIZLLL);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((InterfaceC252619vl) it.next()).t0(i, user, user2);
        }
    }
}
