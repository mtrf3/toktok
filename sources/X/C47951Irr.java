package X;

import com.ss.ttm.player.u;
import com.ss.ttm.vcshared.VCBaseKitLoader;
import defpackage.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Irr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47951Irr {
    public static final C47955Irv LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;
    public static int LJ;
    public static String LJFF;

    static {
        C16880lQ.LJLLJ(C47951Irr.class);
        LIZ = new C47955Irv();
        LIZIZ = false;
        LIZJ = false;
        LIZLLL = null;
        LJ = 0;
        LJFF = "";
    }

    public static final synchronized void LIZ() {
        boolean z;
        boolean z2;
        synchronized (C47951Irr.class) {
            try {
                boolean z3 = false;
                if (LJ == 0) {
                    LJ = u.LIZIZ(13, 0) / 1000;
                }
                VCBaseKitLoader.LIZ();
                if (LJ == 2925) {
                    z = true;
                } else {
                    z = false;
                }
                if (u.LIZLLL(3)) {
                    if (!z) {
                        if (!u.LIZLLL(30)) {
                            C16880lQ.LLJJJIL("c++_shared");
                        }
                        C16880lQ.LLJJJIL("audioeffect");
                        if (!u.LIZLLL(28)) {
                            LIZJ("ttcrypto");
                            LIZJ("ttboringssl");
                        }
                        LIZJ("ByteVC1_dec");
                        LIZJ("byteVC2dec");
                        LIZJ("ttffmpeg");
                    }
                    if (u.LIZLLL(29)) {
                        if (!LIZJ("ttmplayerbeta")) {
                            LIZJ = !LIZJ("ttmplayer");
                        } else {
                            LJFF = "ttmplayerbeta";
                        }
                    } else if (!LIZJ("ttmplayer")) {
                        LIZJ = true;
                    }
                    if (!LIZJ && LJFF.isEmpty()) {
                        LJFF = "ttmplayer";
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!z) {
                        if (!u.LIZLLL(30)) {
                            arrayList.add("c++_shared");
                        }
                        arrayList.add("audioeffect");
                        if (!u.LIZLLL(28)) {
                            arrayList.add("ttcrypto");
                            arrayList.add("ttboringssl");
                        }
                        arrayList.add("ByteVC1_dec");
                        arrayList.add("byteVC2dec");
                        arrayList.add("ttffmpeg");
                    }
                    if (u.LIZLLL(29)) {
                        if (!LIZIZ(arrayList, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LIZJ = z2;
                        if (!z2) {
                            arrayList.clear();
                            arrayList.add("ttmplayerbeta");
                            if (!LIZIZ(arrayList, true)) {
                                z3 = true;
                            }
                            LIZJ = z3;
                            if (z3) {
                                arrayList.clear();
                                arrayList.add("ttmplayer");
                                LIZJ = !LIZIZ(arrayList, true);
                            } else {
                                LJFF = "ttmplayerbeta";
                            }
                        }
                    } else {
                        arrayList.add("ttmplayer");
                        LIZJ = !LIZIZ(arrayList, false);
                    }
                    if (!LIZJ && LJFF.isEmpty()) {
                        LJFF = "ttmplayer";
                    }
                }
            } catch (Throwable th) {
                LIZJ = true;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("load default library error.");
                LIZ2.append(th.toString());
                LIZLLL = X1D.LIZIZ(LIZ2);
            }
        }
    }

    public static boolean LIZJ(String str) {
        String str2;
        try {
            u.LIZIZ = a1.LJ("lib", str, ".so");
            if (u.LIZ == null) {
                u.LIZ = u.LIZ(null);
            }
            if (u.LIZ != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(u.LIZ);
                LIZ2.append(File.separatorChar);
                LIZ2.append(u.LIZIZ);
                str2 = X1D.LIZIZ(LIZ2);
                if (str2 != null) {
                    if (!new File(str2).exists()) {
                        str2 = null;
                    } else {
                        System.load(str2);
                    }
                }
            } else {
                str2 = null;
            }
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("load path library error.");
            LIZ3.append(th.toString());
            LIZLLL = X1D.LIZIZ(LIZ3);
            str2 = null;
        }
        if (str2 == null) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                LIZIZ(arrayList, true);
                LIZLLL = null;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(List<String> list, boolean z) {
        boolean z2 = true;
        boolean z3 = LIZIZ;
        if ((!z) & z3) {
            return z3;
        }
        LIZ.getClass();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            try {
                C16880lQ.LLJJJIL((String) it.next());
            } catch (Throwable th) {
                LIZLLL = th.getMessage();
                z2 = false;
            }
        }
        LIZIZ = z2;
        return z2;
    }
}
