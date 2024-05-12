package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JpN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50345JpN {
    public static final boolean LIZLLL = C50346JpO.LIZIZ();
    public static final boolean LJ;
    public final String LIZ;
    public final EnumC50341JpJ LIZIZ;
    public final boolean LIZJ;

    static {
        boolean z;
        if (C50346JpO.LIZ() != 0) {
            C50346JpO.LIZ();
            z = false;
        } else {
            z = true;
        }
        LJ = z;
    }

    public final void LIZIZ(boolean z) {
        if (!this.LIZJ) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bridgeName", this.LIZ);
        hashMap.put("newContainer", String.valueOf(z));
        C78983UzD.LJIILLIIL("search_jsb_use_deprecated", hashMap);
    }

    public /* synthetic */ C50345JpN(F3T f3t, String str) {
        this(f3t, str, EnumC50341JpJ.DEPRECATED);
    }

    public final boolean LIZ(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        int i = C50343JpL.LIZ[this.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i == 3) {
                LIZIZ(this.LIZJ);
                if (LJ && LIZLLL && this.LIZJ) {
                    iReturn.LIZ(0, "deprecated jsb methods cannot be added in spark plugin");
                    return true;
                }
                return false;
            }
            throw new C162476Zf();
        }
        boolean z = this.LIZJ;
        HashMap hashMap = new HashMap();
        hashMap.put("bridgeName", this.LIZ);
        hashMap.put("newContainer", String.valueOf(z));
        C78983UzD.LJIILLIIL("search_jsb_use_experimental", hashMap);
        return false;
    }

    public C50345JpN(F3T contextProviderFactory, String str, EnumC50341JpJ methodStatus) {
        boolean z;
        C50069Jkv c50069Jkv;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        o.LJIIIZ(methodStatus, "methodStatus");
        this.LIZ = str;
        this.LIZIZ = methodStatus;
        C60737Nsb c60737Nsb = contextProviderFactory.LIZIZ;
        if (c60737Nsb != null && (c50069Jkv = (C50069Jkv) c60737Nsb.LIZIZ(C50069Jkv.class)) != null) {
            z = c50069Jkv.LJLIL;
        } else {
            z = false;
        }
        this.LIZJ = z;
    }
}
