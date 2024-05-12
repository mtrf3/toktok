package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import defpackage.i0;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.IDqS0S0001000;
import kotlin.jvm.internal.IDqS15S1100000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1VA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VA implements InterfaceC16890lR {
    public static final C1VA LIZ = new C1VA();
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final C20710rb<C1V9> LIZJ = new C20710rb<>();
    public static final C20710rb<C22M> LIZLLL = new C20710rb<>();
    public static final C20710rb<C22L> LJ = new C20710rb<>();

    @Override // X.InterfaceC16890lR
    public final void LIZJ(String trackKey) {
        o.LJIIIZ(trackKey, "trackKey");
        LJIIJ(trackKey, "infra_unistore_kv_access_dev", AnonymousClass228.LJLIL);
    }

    @Override // X.InterfaceC16890lR
    public final String LJII(InterfaceC32651Px KVRepo) {
        o.LJIIIZ(KVRepo, "KVRepo");
        return LJIIJJI(LIZJ, new IDqS416S0100000(KVRepo, LiveCoverMinSizeSetting.DEFAULT));
    }

    public static String LJIIJJI(C20710rb c20710rb, InterfaceC88472Yns interfaceC88472Yns) {
        try {
            return c20710rb.LIZIZ(new IDqS416S0100000(interfaceC88472Yns, 252));
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.InterfaceC16890lR
    public final void LIZIZ(InterfaceC32651Px KVRepo, String trackKey) {
        o.LJIIIZ(trackKey, "trackKey");
        o.LJIIIZ(KVRepo, "KVRepo");
        LJIIJ(trackKey, KVRepo.getRepoName(), C22A.LJLIL);
    }

    @Override // X.InterfaceC16890lR
    public final void LJFF(InterfaceC32651Px KVRepo, String str) {
        o.LJIIIZ(KVRepo, "KVRepo");
        LJIIJ(str, "infra_unistore_kv_create_repo_dev", AnonymousClass229.LJLIL);
    }

    @Override // X.InterfaceC16890lR
    public final String LJI(InterfaceC32651Px KVRepo, String key) {
        o.LJIIIZ(KVRepo, "KVRepo");
        o.LJIIIZ(key, "key");
        return LJIIJJI(LIZJ, new IDqS15S1100000(KVRepo, key, 2));
    }

    public static void LJIIJ(String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            LIZJ.LIZ(str, new IDqS416S0100000(interfaceC88472Yns, 251));
        } catch (Exception unused) {
            final String LJFF = i0.LJFF("endSession-", str2);
            new AbstractC43321my(LJFF) { // from class: X.22B
                public final String LJFF;
                public final String LJI;

                @Override // X.AbstractC20690rZ
                public final void LIZ() {
                }

                @Override // X.AbstractC20690rZ
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.AbstractC34871Yl
                public final java.util.Map<String, Object> LIZLLL() {
                    java.util.Map<String, Object> LIZLLL2 = super.LIZLLL();
                    HashMap hashMap = (HashMap) LIZLLL2;
                    hashMap.put("type", this.LJFF);
                    hashMap.put("repo_name", this.LIZJ);
                    hashMap.put("repo_type", this.LIZLLL);
                    hashMap.put("repo_path", this.LJ);
                    hashMap.put("target_event", this.LJI);
                    return LIZLLL2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(-1L, "infra_unistore_monitor_error_dev", "", "", "");
                    o.LJIIIZ(LJFF, "targetEvent");
                    this.LJFF = "kv";
                    this.LJI = LJFF;
                }
            };
        }
    }

    @Override // X.InterfaceC16890lR
    public final String LIZ(InterfaceC32651Px KVRepo, String key, String str) {
        o.LJIIIZ(KVRepo, "KVRepo");
        o.LJIIIZ(key, "key");
        return LJIIJJI(LIZJ, new AnonymousClass226(KVRepo, key, str));
    }

    @Override // X.InterfaceC16890lR
    public final void LIZLLL(String trackKey, InterfaceC32651Px KVRepo, int i) {
        o.LJIIIZ(trackKey, "trackKey");
        o.LJIIIZ(KVRepo, "KVRepo");
        LJIIJ(trackKey, "infra_unistore_kv_access_dev", new IDqS0S0001000(i, 13));
    }

    @Override // X.InterfaceC16890lR
    public final String LJ(String str, String repoUri, String repoType) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(repoUri, "repoUri");
        o.LJIIIZ(repoType, "repoType");
        try {
            C20710rb<C1V9> c20710rb = LIZJ;
            if (c20710rb.LIZ.get() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c20710rb.LIZJ(C47261Igj.LJII(new C1V9(0), new C1V9(0)));
            }
            C20710rb<C22M> c20710rb2 = LIZLLL;
            if (c20710rb2.LIZ.get() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c20710rb2.LIZJ(C47261Igj.LJII(new C22M(0), new C22M(0)));
            }
            C20710rb<C22L> c20710rb3 = LJ;
            if (c20710rb3.LIZ.get() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c20710rb3.LIZJ(C47261Igj.LJII(new C22L(0), new C22L(0)));
            }
        } catch (Exception unused) {
        }
        return LJIIJJI(LIZJ, new AnonymousClass225(str, repoType, repoUri));
    }

    @Override // X.InterfaceC16890lR
    public final void LJIIIIZZ(String trackKey, InterfaceC32651Px KVRepo, int i) {
        o.LJIIIZ(trackKey, "trackKey");
        o.LJIIIZ(KVRepo, "KVRepo");
        LJIIJ(trackKey, "infra_unistore_kv_access_dev", new IDqS0S0001000(i, 14));
    }

    @Override // X.InterfaceC16890lR
    public final String LJIIIZ(InterfaceC32651Px KVRepo, String key, String str) {
        o.LJIIIZ(KVRepo, "KVRepo");
        o.LJIIIZ(key, "key");
        return LJIIJJI(LIZJ, new AnonymousClass227(KVRepo, key, str));
    }

    public static C1V9 LJIILIIL(C1V9 c1v9, InterfaceC32651Px interfaceC32651Px, String str, String str2) {
        C1V9 c1v92 = c1v9;
        if (c1v92 == null) {
            c1v92 = new C1V9(0);
        }
        C1V9.LJ(c1v92, "infra_unistore_kv_access_dev", interfaceC32651Px.getRepoName(), interfaceC32651Px.LJFF().name(), interfaceC32651Px.getUri().toString(), str, str2, 64);
        return c1v92;
    }

    public static C22M LJIIL(C22M c22m, String str, String str2, String str3, String str4, String str5, int i, String str6, long j) {
        if (c22m == null) {
            c22m = new C22M(0);
        }
        C43588H8u.LIZLLL(str, "repoName", str2, "repoPath", str3, "repoType", str6, "eventType");
        c22m.LJIIIZ.set(true);
        c22m.LJFF = str4;
        c22m.LIZJ = str;
        c22m.LJ = str2;
        c22m.LIZLLL = str3;
        c22m.LJI = str5;
        c22m.LJII = i;
        c22m.LJIIIIZZ = str6;
        c22m.LIZIZ = j;
        return c22m;
    }
}
