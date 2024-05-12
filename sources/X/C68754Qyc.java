package X;

import X.C0M9;
import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Qyc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68754Qyc implements InterfaceC789137v {
    public final AbstractC03300Ba LIZ;
    public final C3ZP LIZIZ;
    public final C3ZR LIZJ;
    public final C3ZQ LIZLLL;
    public final C3ZV LJ;
    public final C3ZW LJFF;
    public final C3ZX LJI;
    public final IDd0S17S0000000_11 LJII;
    public final IDd0S17S0000000_11 LJIIIIZZ;
    public final IDd0S17S0000000_11 LJIIIZ;
    public final IDd0S17S0000000_11 LJIIJ;
    public final IDd0S17S0000000_11 LJIIJJI;
    public final IDd0S17S0000000_11 LJIIL;

    @Override // X.InterfaceC789137v
    public final void LIZ() {
        this.LIZ.LIZJ();
        try {
            LJIIL();
            LJIILIIL();
            LJIIJJI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC789137v
    public final List<C789037u> LJ() {
        ArrayList<C789537z> arrayList;
        String str;
        String str2;
        Integer num;
        boolean z;
        Boolean bool;
        String str3;
        String str4;
        C789337x c789337x;
        C1CD LIZJ = C1CD.LIZJ(0, "SELECT * FROM user_info");
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, true);
            try {
                int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "uid");
                int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "version");
                int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "nickname");
                int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "is_private_account");
                int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "avatar_168");
                int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "avatar_300");
                C1HQ<String, ArrayList<C789537z>> c1hq = new C1HQ<>();
                C1HQ<String, C789437y> c1hq2 = new C1HQ<>();
                while (true) {
                    arrayList = null;
                    if (!LIZIZ.moveToNext()) {
                        break;
                    }
                    String string = LIZIZ.getString(LIZIZ2);
                    if (c1hq.getOrDefault(string, null) == null) {
                        c1hq.put(string, new ArrayList<>());
                    }
                    c1hq2.put(LIZIZ.getString(LIZIZ2), null);
                }
                LIZIZ.moveToPosition(-1);
                LJIIIZ(c1hq);
                LJIIJ(c1hq2);
                ArrayList arrayList2 = new ArrayList(LIZIZ.getCount());
                while (LIZIZ.moveToNext()) {
                    if (!LIZIZ.isNull(LIZIZ2) || !LIZIZ.isNull(LIZIZ3) || !LIZIZ.isNull(LIZIZ4) || !LIZIZ.isNull(LIZIZ5) || !LIZIZ.isNull(LIZIZ6) || !LIZIZ.isNull(LIZIZ7)) {
                        if (LIZIZ.isNull(LIZIZ2)) {
                            str = arrayList;
                        } else {
                            str = LIZIZ.getString(LIZIZ2);
                        }
                        long j = LIZIZ.getLong(LIZIZ3);
                        if (LIZIZ.isNull(LIZIZ4)) {
                            str2 = arrayList;
                        } else {
                            str2 = LIZIZ.getString(LIZIZ4);
                        }
                        if (!LIZIZ.isNull(LIZIZ5)) {
                            num = Integer.valueOf(LIZIZ.getInt(LIZIZ5));
                        } else {
                            num = arrayList;
                        }
                        if (num == 0) {
                            bool = arrayList;
                        } else {
                            if (num.intValue() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bool = Boolean.valueOf(z);
                        }
                        if (LIZIZ.isNull(LIZIZ6)) {
                            str3 = arrayList;
                        } else {
                            str3 = LIZIZ.getString(LIZIZ6);
                        }
                        if (LIZIZ.isNull(LIZIZ7)) {
                            str4 = arrayList;
                        } else {
                            str4 = LIZIZ.getString(LIZIZ7);
                        }
                        c789337x = new C789337x(str, j, str2, bool, str3, str4);
                    } else {
                        c789337x = arrayList;
                    }
                    ArrayList<C789537z> orDefault = c1hq.getOrDefault(LIZIZ.getString(LIZIZ2), arrayList);
                    if (orDefault == null) {
                        orDefault = new ArrayList<>();
                    }
                    arrayList2.add(new C789037u(c789337x, orDefault, c1hq2.getOrDefault(LIZIZ.getString(LIZIZ2), arrayList)));
                    arrayList = null;
                }
                this.LIZ.LJIILLIIL();
                return arrayList2;
            } finally {
                LIZIZ.close();
                LIZJ.LIZLLL();
            }
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    public final void LJIIJJI() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJII.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJII.LIZJ(LIZ);
        }
    }

    public final void LJIIL() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJIIIIZZ.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJIIIIZZ.LIZJ(LIZ);
        }
    }

    public final void LJIILIIL() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJIIIZ.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LJIIIZ.LIZJ(LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3ZP] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.3ZR] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3ZQ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3ZV] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.3ZW] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.3ZX] */
    public C68754Qyc(final RelationDatabase relationDatabase) {
        this.LIZ = relationDatabase;
        this.LIZIZ = new C1CG<C789337x>(relationDatabase) { // from class: X.3ZP
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `user_info` (`uid`,`version`,`nickname`,`is_private_account`,`avatar_168`,`avatar_300`) VALUES (?,?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789337x c789337x) {
                Integer valueOf;
                C789337x c789337x2 = c789337x;
                String str = c789337x2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                interfaceC37591dj.LJIIIZ(2, c789337x2.LIZIZ);
                String str2 = c789337x2.LIZJ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str2);
                }
                Boolean bool = c789337x2.LIZLLL;
                if (bool == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                }
                if (valueOf == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJIIIZ(4, valueOf.intValue());
                }
                String str3 = c789337x2.LJ;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(5);
                } else {
                    interfaceC37591dj.LJJII(5, str3);
                }
                String str4 = c789337x2.LJFF;
                if (str4 == null) {
                    interfaceC37591dj.LLLLLLJ(6);
                } else {
                    interfaceC37591dj.LJJII(6, str4);
                }
            }
        };
        this.LIZJ = new C1CG<C789537z>(relationDatabase) { // from class: X.3ZR
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `maf_info` (`uid`,`rec_type`,`rec_reason`,`relation_type`,`social_info`,`mutual_struct`,`external_recommend_reason`,`version`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789537z c789537z) {
                C789537z c789537z2 = c789537z;
                String str = c789537z2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c789537z2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
                String str3 = c789537z2.LIZJ;
                if (str3 == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJJII(3, str3);
                }
                String str4 = c789537z2.LIZLLL;
                if (str4 == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJJII(4, str4);
                }
                String str5 = c789537z2.LJ;
                if (str5 == null) {
                    interfaceC37591dj.LLLLLLJ(5);
                } else {
                    interfaceC37591dj.LJJII(5, str5);
                }
                String str6 = c789537z2.LJFF;
                if (str6 == null) {
                    interfaceC37591dj.LLLLLLJ(6);
                } else {
                    interfaceC37591dj.LJJII(6, str6);
                }
                String str7 = c789537z2.LJI;
                if (str7 == null) {
                    interfaceC37591dj.LLLLLLJ(7);
                } else {
                    interfaceC37591dj.LJJII(7, str7);
                }
                interfaceC37591dj.LJIIIZ(8, c789537z2.LJII);
            }
        };
        this.LIZLLL = new C1CG<C789437y>(relationDatabase) { // from class: X.3ZQ
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `user_status` (`uid`,`follow_status`,`follower_status`,`is_block`,`version`) VALUES (?,?,?,?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789437y c789437y) {
                Integer valueOf;
                C789437y c789437y2 = c789437y;
                String str = c789437y2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                if (c789437y2.LIZIZ == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJIIIZ(2, r0.intValue());
                }
                if (c789437y2.LIZJ == null) {
                    interfaceC37591dj.LLLLLLJ(3);
                } else {
                    interfaceC37591dj.LJIIIZ(3, r0.intValue());
                }
                Boolean bool = c789437y2.LIZLLL;
                if (bool == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                }
                if (valueOf == null) {
                    interfaceC37591dj.LLLLLLJ(4);
                } else {
                    interfaceC37591dj.LJIIIZ(4, valueOf.intValue());
                }
                interfaceC37591dj.LJIIIZ(5, c789437y2.LJ);
            }
        };
        this.LJ = new C1CF<C789537z>(relationDatabase) { // from class: X.3ZV
            @Override // X.C0BI
            public final String LIZIZ() {
                return "DELETE FROM `maf_info` WHERE `uid` = ? AND `rec_type` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789537z c789537z) {
                C789537z c789537z2 = c789537z;
                String str = c789537z2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c789537z2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
            }
        };
        this.LJFF = new C1CF<C789337x>(relationDatabase) { // from class: X.3ZW
            @Override // X.C0BI
            public final String LIZIZ() {
                return "DELETE FROM `user_info` WHERE `uid` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789337x c789337x) {
                String str = c789337x.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
            }
        };
        this.LJI = new C1CF<C789437y>(relationDatabase) { // from class: X.3ZX
            @Override // X.C0BI
            public final String LIZIZ() {
                return "DELETE FROM `user_status` WHERE `uid` = ?";
            }

            @Override // X.C1CF
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C789437y c789437y) {
                String str = c789437y.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
            }
        };
        this.LJII = new IDd0S17S0000000_11(relationDatabase, 6);
        this.LJIIIIZZ = new IDd0S17S0000000_11(relationDatabase, 7);
        this.LJIIIZ = new IDd0S17S0000000_11(relationDatabase, 8);
        this.LJIIJ = new IDd0S17S0000000_11(relationDatabase, 3);
        this.LJIIJJI = new IDd0S17S0000000_11(relationDatabase, 4);
        this.LJIIL = new IDd0S17S0000000_11(relationDatabase, 5);
    }

    @Override // X.InterfaceC789137v
    public final int LIZIZ(long j) {
        this.LIZ.LIZJ();
        try {
            int LJIIZILJ = LJIIZILJ(j) + LJIILLIIL(j) + LJIILL(j);
            this.LIZ.LJIILLIIL();
            return LJIIZILJ;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC789137v
    public final void LIZJ(List<C789537z> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC789137v
    public final void LIZLLL(List<C789337x> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC789137v
    public final void LJFF(C787637g entity) {
        this.LIZ.LIZJ();
        try {
            o.LJIIIZ(entity, "entity");
            C789537z c789537z = entity.LIZJ;
            if (c789537z != null) {
                LJIILJJIL(c789537z);
            }
            C789337x c789337x = entity.LIZIZ;
            if (c789337x != null) {
                LJIJ(c789337x);
            }
            C789437y c789437y = entity.LIZLLL;
            if (c789437y != null) {
                LJIJI(c789437y);
            }
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC789137v
    public final void LJI(List<C787637g> list) {
        this.LIZ.LIZJ();
        try {
            AnonymousClass380.LIZ(this, list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC789137v
    public final void LJII(List<C789437y> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            LJ(list);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: all -> 0x013b, TryCatch #1 {all -> 0x013b, blocks: (B:8:0x0025, B:9:0x0054, B:11:0x005b, B:13:0x0067, B:15:0x006f, B:18:0x0077, B:20:0x0087, B:22:0x008d, B:24:0x0093, B:26:0x0099, B:28:0x009f, B:30:0x00a5, B:33:0x010a, B:35:0x0116, B:36:0x011b, B:37:0x00ab, B:40:0x00b7, B:43:0x00c8, B:47:0x00e6, B:51:0x00f6, B:54:0x0105, B:55:0x0101, B:56:0x00f2, B:57:0x00cf, B:59:0x00dc, B:61:0x00e2, B:63:0x00c4, B:64:0x00b3, B:65:0x012a), top: B:7:0x0025, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2 A[Catch: all -> 0x013b, TryCatch #1 {all -> 0x013b, blocks: (B:8:0x0025, B:9:0x0054, B:11:0x005b, B:13:0x0067, B:15:0x006f, B:18:0x0077, B:20:0x0087, B:22:0x008d, B:24:0x0093, B:26:0x0099, B:28:0x009f, B:30:0x00a5, B:33:0x010a, B:35:0x0116, B:36:0x011b, B:37:0x00ab, B:40:0x00b7, B:43:0x00c8, B:47:0x00e6, B:51:0x00f6, B:54:0x0105, B:55:0x0101, B:56:0x00f2, B:57:0x00cf, B:59:0x00dc, B:61:0x00e2, B:63:0x00c4, B:64:0x00b3, B:65:0x012a), top: B:7:0x0025, outer: #0 }] */
    @Override // X.InterfaceC789137v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C789037u LJIIIIZZ(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68754Qyc.LJIIIIZZ(java.lang.String):X.37u");
    }

    public final void LJIIIZ(C1HQ<String, ArrayList<C789537z>> c1hq) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        int i;
        C0M9.c cVar = (C0M9.c) c1hq.keySet();
        if (cVar.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (c1hq.LJLJI > 999) {
            C1HQ<String, ArrayList<C789537z>> c1hq2 = new C1HQ<>(999);
            int i3 = c1hq.LJLJI;
            loop0: while (true) {
                i = 0;
                while (i2 < i3) {
                    c1hq2.put(c1hq.LJIIIIZZ(i2), c1hq.LJIIJJI(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                LJIIIZ(c1hq2);
                c1hq2 = new C1HQ<>(999);
            }
            if (i > 0) {
                LJIIIZ(c1hq2);
                return;
            }
            return;
        }
        StringBuilder LIZJ = C278817o.LIZJ("SELECT `uid`,`rec_type`,`rec_reason`,`relation_type`,`social_info`,`mutual_struct`,`external_recommend_reason`,`version` FROM `maf_info` WHERE `uid` IN (");
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
                String str2 = null;
                ArrayList<C789537z> orDefault = c1hq.getOrDefault(LIZIZ.getString(LIZ), null);
                if (orDefault != null) {
                    if (LIZIZ.isNull(0)) {
                        string = null;
                    } else {
                        string = LIZIZ.getString(0);
                    }
                    if (LIZIZ.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(1);
                    }
                    if (LIZIZ.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = LIZIZ.getString(2);
                    }
                    if (LIZIZ.isNull(3)) {
                        string4 = null;
                    } else {
                        string4 = LIZIZ.getString(3);
                    }
                    if (LIZIZ.isNull(4)) {
                        string5 = null;
                    } else {
                        string5 = LIZIZ.getString(4);
                    }
                    if (LIZIZ.isNull(5)) {
                        string6 = null;
                    } else {
                        string6 = LIZIZ.getString(5);
                    }
                    if (!LIZIZ.isNull(6)) {
                        str2 = LIZIZ.getString(6);
                    }
                    orDefault.add(new C789537z(string, string2, LIZIZ.getLong(7), string3, string4, string5, string6, str2));
                }
            }
        } finally {
            LIZIZ.close();
        }
    }

    public final void LJIIJ(C1HQ<String, C789437y> c1hq) {
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
                LJIIJ(c1hq2);
                c1hq.putAll(c1hq2);
                c1hq2 = new C1HQ<>(999);
            }
            if (i > 0) {
                LJIIJ(c1hq2);
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

    public final int LJIILJJIL(C789537z c789537z) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            int LJ = LJ(c789537z);
            this.LIZ.LJIILLIIL();
            return LJ;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    public final int LJIILL(long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJIIJ.LIZ();
        LIZ.LJIIIZ(1, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJIIJ.LIZJ(LIZ);
        }
    }

    public final int LJIILLIIL(long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJIIJJI.LIZ();
        LIZ.LJIIIZ(1, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJIIJJI.LIZJ(LIZ);
        }
    }

    public final int LJIIZILJ(long j) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJIIL.LIZ();
        LIZ.LJIIIZ(1, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJIIL.LIZJ(LIZ);
        }
    }

    public final int LJIJ(C789337x c789337x) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            int LJ = LJ(c789337x);
            this.LIZ.LJIILLIIL();
            return LJ;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    public final int LJIJI(C789437y c789437y) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            int LJ = LJ(c789437y);
            this.LIZ.LJIILLIIL();
            return LJ;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}
