package X;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PUu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64544PUu {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(File file) {
        try {
            C64532PUi LIZ2 = PU7.LIZ(PU7.LJI(file));
            try {
                LIZ2.LJLILLLLZI.j(LIZ2.LJLJI);
                String LJIILL = LIZ2.LJLILLLLZI.LJIILL();
                AnonymousClass636.LJFF(LIZ2, null);
                return LJIILL;
            } finally {
            }
        } catch (Exception e) {
            C34B.LJ("FileRWerHelper", e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x0034, LOOP:0: B:7:0x0010->B:15:0x0022, LOOP_END, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x0010, B:10:0x0016, B:15:0x0022), top: B:7:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[EDGE_INSN: B:16:0x002f->B:17:0x002f BREAK  A[LOOP:0: B:7:0x0010->B:15:0x0022], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized <T extends java.io.Serializable> java.util.List<T> LIZIZ(java.io.File r5, java.lang.Class<T> r6) {
        /*
            java.lang.Class<X.PUu> r4 = X.C64544PUu.class
            monitor-enter(r4)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            X.PUE r0 = X.PU7.LJI(r5)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L43
            X.PUi r2 = X.PU7.LIZ(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L43
        L10:
            java.lang.String r1 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L1f
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 != 0) goto L2f
            java.lang.Object r1 = X.C75792yF.LIZ(r1, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "fromJson(line, clazz)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L34
            r3.add(r1)     // Catch: java.lang.Throwable -> L34
            goto L10
        L2f:
            r0 = 0
            X.AnonymousClass636.LJFF(r2, r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L43
            goto L41
        L34:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            X.AnonymousClass636.LJFF(r2, r1)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L43
        L3b:
            r1 = move-exception
            java.lang.String r0 = "FileRWerHelper"
            X.C34B.LJ(r0, r1)     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r4)
            return r3
        L43:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64544PUu.LIZIZ(java.io.File, java.lang.Class):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[Catch: all -> 0x0034, LOOP:0: B:7:0x0011->B:15:0x0023, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:8:0x0011, B:10:0x0017, B:15:0x0023), top: B:7:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[EDGE_INSN: B:16:0x0030->B:17:0x0030 BREAK  A[LOOP:0: B:7:0x0011->B:15:0x0023], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized <T extends java.io.Serializable> java.util.List<T> LIZJ(java.io.File r6, java.lang.Class<T> r7) {
        /*
            java.lang.Class<X.PUu> r5 = X.C64544PUu.class
            monitor-enter(r5)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            r3 = 0
            X.PUE r0 = X.PU7.LJI(r6)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L44
            X.PUi r2 = X.PU7.LIZ(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L44
        L11:
            java.lang.String r1 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L20
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            if (r0 != 0) goto L30
            java.lang.Object r1 = X.C75792yF.LIZ(r1, r7)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "fromJson(line, clazz)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L34
            r4.add(r1)     // Catch: java.lang.Throwable -> L34
            goto L11
        L30:
            X.AnonymousClass636.LJFF(r2, r3)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L44
            goto L42
        L34:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            X.AnonymousClass636.LJFF(r2, r1)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L44
        L3b:
            r1 = move-exception
            java.lang.String r0 = "FileRWerHelper"
            X.C34B.LJ(r0, r1)     // Catch: java.lang.Throwable -> L44
            r4 = r3
        L42:
            monitor-exit(r5)
            return r4
        L44:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64544PUu.LIZJ(java.io.File, java.lang.Class):java.util.List");
    }

    public static final synchronized <T extends Serializable> boolean LIZLLL(File file, List<? extends T> list) {
        synchronized (C64544PUu.class) {
            if (list == null) {
                return false;
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                    return false;
                }
            }
            try {
                C64535PUl c64535PUl = new C64535PUl(PU7.LJ(file));
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String LIZJ = C75792yF.LIZJ(list.get(i));
                        o.LJIIIIZZ(LIZJ, "toJson(data[i])");
                        c64535PUl.LLIIIZ(LIZJ);
                        c64535PUl.LLIIIZ("\n");
                    }
                    c64535PUl.flush();
                    AnonymousClass636.LJFF(c64535PUl, null);
                    return true;
                } finally {
                }
            } catch (Exception e2) {
                C34B.LJ("FileRWerHelper", e2);
                return false;
            }
        }
    }
}
