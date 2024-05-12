package X;

import X.C0M9;
import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase;
import java.util.Iterator;

/* renamed from: X.Qyb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68753Qyb implements InterfaceC787837i {
    public final AbstractC03300Ba LIZ;
    public final IDd0S17S0000000_11 LIZIZ;
    public final IDd0S17S0000000_11 LIZJ;
    public final IDd0S17S0000000_11 LIZLLL;

    public C68753Qyb(RelationDatabase relationDatabase) {
        this.LIZ = relationDatabase;
        this.LIZIZ = new IDd0S17S0000000_11(relationDatabase, 0);
        this.LIZJ = new IDd0S17S0000000_11(relationDatabase, 1);
        this.LIZLLL = new IDd0S17S0000000_11(relationDatabase, 2);
    }

    @Override // X.InterfaceC787837i
    public final void LIZ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC787837i
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZIZ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZIZ.LIZJ(LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r6.isNull(r16) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC787837i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C787537f> LIZLLL(java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68753Qyb.LIZLLL(java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7 A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:33:0x0086, B:37:0x0093, B:39:0x0099, B:42:0x00a3, B:45:0x00af, B:48:0x00c0, B:52:0x00e1, B:55:0x00ee, B:58:0x00fb, B:61:0x00f7, B:62:0x00ea, B:63:0x00c8, B:65:0x00d4, B:68:0x00dd, B:70:0x00bc, B:71:0x00ab), top: B:32:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:33:0x0086, B:37:0x0093, B:39:0x0099, B:42:0x00a3, B:45:0x00af, B:48:0x00c0, B:52:0x00e1, B:55:0x00ee, B:58:0x00fb, B:61:0x00f7, B:62:0x00ea, B:63:0x00c8, B:65:0x00d4, B:68:0x00dd, B:70:0x00bc, B:71:0x00ab), top: B:32:0x0086 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1HQ<java.lang.String, X.C789337x> r17) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68753Qyb.LJ(X.1HQ):void");
    }

    public final void LJFF(C1HQ<String, C789437y> c1hq) {
        String string;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        boolean z;
        Boolean valueOf4;
        int i;
        C0M9.c cVar = (C0M9.c) c1hq.keySet();
        if (cVar.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (c1hq.LJLJI > 999) {
            C1HQ<String, C789437y> c1hq2 = new C1HQ<>(999);
            int i3 = c1hq.LJLJI;
            loop0: while (true) {
                i = 0;
                while (i2 < i3) {
                    c1hq2.put(c1hq.LJIIIIZZ(i2), null);
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                LJFF(c1hq2);
                c1hq.putAll(c1hq2);
                c1hq2 = new C1HQ<>(999);
            }
            if (i > 0) {
                LJFF(c1hq2);
                c1hq.putAll(c1hq2);
                return;
            }
            return;
        }
        StringBuilder LIZJ = C278817o.LIZJ("SELECT `uid`,`follow_status`,`follower_status`,`is_block`,`version` FROM `user_status` WHERE `uid` IN (");
        int size = cVar.size();
        C217818gj.LIZ(size, LIZJ);
        LIZJ.append(")");
        C1CD LIZJ2 = C1CD.LIZJ(size, LIZJ.toString());
        Iterator it = cVar.iterator();
        int i4 = 1;
        while (true) {
            C0M7 c0m7 = (C0M7) it;
            if (!c0m7.hasNext()) {
                break;
            }
            String str = (String) c0m7.next();
            if (str == null) {
                LIZJ2.LLLLLLJ(i4);
            } else {
                LIZJ2.LJJII(i4, str);
            }
            i4++;
        }
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ2, false);
        try {
            int LIZ = C25070yd.LIZ(LIZIZ, "uid");
            if (LIZ == -1) {
                return;
            }
            while (LIZIZ.moveToNext()) {
                String string2 = LIZIZ.getString(LIZ);
                if (c1hq.containsKey(string2)) {
                    if (LIZIZ.isNull(0)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(0);
                    }
                    if (LIZIZ.isNull(1)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(LIZIZ.getInt(1));
                    }
                    if (LIZIZ.isNull(2)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(LIZIZ.getInt(2));
                    }
                    if (!LIZIZ.isNull(3) && (valueOf3 = Integer.valueOf(LIZIZ.getInt(3))) != null) {
                        if (valueOf3.intValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        valueOf4 = Boolean.valueOf(z);
                        c1hq.put(string2, new C789437y(string, valueOf, valueOf2, valueOf4, LIZIZ.getLong(4)));
                    }
                    valueOf4 = null;
                    c1hq.put(string2, new C789437y(string, valueOf, valueOf2, valueOf4, LIZIZ.getLong(4)));
                }
            }
        } finally {
            LIZIZ.close();
        }
    }

    @Override // X.InterfaceC787837i
    public final void LIZJ(String str, String str2) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        if (str2 == null) {
            LIZ.LLLLLLJ(2);
        } else {
            LIZ.LJJII(2, str2);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }
}
