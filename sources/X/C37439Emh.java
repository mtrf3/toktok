package X;

import android.text.TextUtils;
import com.bytedance.pia.core.PiaManifest;
import com.google.gson.j;
import com.google.gson.m;
import java.util.HashMap;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Emh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37439Emh<T> implements BQ6<m> {
    public final /* synthetic */ PiaManifest LIZ;
    public final /* synthetic */ C37444Emm LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ C37443Eml LJ;

    public C37439Emh(PiaManifest piaManifest, C37444Emm c37444Emm, long j, boolean z, C37443Eml c37443Eml) {
        this.LIZ = piaManifest;
        this.LIZIZ = c37444Emm;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = c37443Eml;
    }

    @Override // X.BQ6
    public final void accept(m mVar) {
        Object LIZ;
        try {
            j LJJIJ = mVar.LJJIJ("html");
            o.LJFF(LJJIJ, "it.get(\"html\")");
            LIZ = LJJIJ.LJJIFFI();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str = (String) LIZ;
        if (TextUtils.isEmpty(str)) {
            this.LIZIZ.LIZ("Save empty result");
            return;
        }
        C37440Emi.LIZIZ.getClass();
        C37445Emn c37445Emn = C37440Emi.LIZ;
        String uri = this.LIZ.LIZ.toString();
        o.LJFF(uri, "manifest.uri.toString()");
        long j = this.LIZJ;
        boolean z = this.LIZLLL;
        if (str != null) {
            c37445Emn.getClass();
            C37437Emf LIZ2 = C37438Emg.LIZ(uri);
            if (LIZ2 != null) {
                c37445Emn.LIZ();
                if (((HashMap) c37445Emn.LIZ).containsKey(LIZ2)) {
                    ((HashMap) c37445Emn.LIZ).remove(LIZ2);
                    ORS.LJJLIIJ(c37445Emn.LIZIZ, new AqS172S0100000_6(LIZ2, 91));
                }
                if (c37445Emn.LIZIZ.size() == c37445Emn.LIZJ) {
                    ((HashMap) c37445Emn.LIZ).remove(c37445Emn.LIZIZ.poll().getSecond());
                }
                c37445Emn.LIZIZ.add(new OSZ<>(Long.valueOf(System.currentTimeMillis() + j), LIZ2));
                ((HashMap) c37445Emn.LIZ).put(LIZ2, new C37436Eme(z, str));
            }
            this.LJ.LIZ(str, true);
            return;
        }
        o.LJIIZILJ();
        throw null;
    }
}
