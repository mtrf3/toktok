package X;

import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EHk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36168EHk implements Runnable {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL = "hybrid_security_csrf_highrate";

    public RunnableC36168EHk(android.net.Uri uri, String str, String str2, String str3) {
        this.LJLIL = uri;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    public final void LIZ() {
        Object LIZ;
        android.net.Uri uri = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        String str4 = this.LJLJJL;
        try {
            C198517qh c198517qh = new C198517qh();
            C35996EAu LIZ2 = C35995EAt.LIZ(uri);
            if (LIZ2 != null) {
                c198517qh.LIZLLL("target_url", LIZ2.LIZ);
                c198517qh.LIZLLL("target_path", LIZ2.LIZIZ);
                java.util.Set<String> set = LIZ2.LIZJ;
                if (set != null && !set.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    c198517qh.LIZLLL("target_query", jSONArray.toString());
                }
            }
            c198517qh.LIZ.put("origin_header", str);
            c198517qh.LIZ.put("referer_header", str2);
            if (!o.LJ("Navigation", str3)) {
                c198517qh.LIZLLL("http_method", str3);
            } else {
                c198517qh.LIZLLL("http_method", "GET");
            }
            JSONObject LJ = c198517qh.LJ();
            Objects.toString(LJ);
            C09900aA.LJI(str4, LJ, null, null);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
