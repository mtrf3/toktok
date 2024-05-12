package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3S8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S8 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final CopyOnWriteArrayList<SessionListViewHolder> LIZLLL = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<C96803r2>> LJ = new ConcurrentHashMap<>();

    public static void LIZIZ() {
        if (LIZIZ || LIZ || LIZJ) {
            return;
        }
        LIZIZ = true;
        synchronized (C3K5.LJLIL) {
            C3K5.LJLJL = 2;
        }
        if ((C3SE.LIZ() & 1) != 0) {
            C55888Lwa.LIZIZ.LJJIIJ();
        }
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dc, code lost:
    
        if (r9.isFinishing() != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01de, code lost:
    
        X.C16970lZ.LJ(com.zhiliaoapp.musically.R.layout.b5v, r9);
        r5 = X.C16970lZ.LIZLLL(r9, com.zhiliaoapp.musically.R.layout.b5v);
        kotlin.jvm.internal.o.LJIIIIZZ(r5, "view");
        X.C3S8.LIZLLL.add(new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder(r5, new X.C3OA(r9, "notification_page", "cell")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fd, code lost:
    
        if (r10 == r8) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0202, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
    
        if (r0 <= 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        if (r0 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ab, code lost:
    
        r9 = X.C84763XOl.LJIIIIZZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        if ((r9 instanceof X.InterfaceC55058LjC) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        r9 = (X.InterfaceC55058LjC) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b7, code lost:
    
        if ((r9 instanceof X.ActivityC45651qj) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b9, code lost:
    
        r9 = (X.ActivityC45651qj) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        if (r9 != null) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3S8.LIZ():void");
    }
}
