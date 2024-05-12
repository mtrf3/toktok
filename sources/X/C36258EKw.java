package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EKw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36258EKw extends AbstractC48600J5o {
    public static final /* synthetic */ int LIZLLL = 0;
    public IServerPortraitService LIZIZ;
    public boolean LIZJ;

    @Override // X.AbstractC48600J5o
    public final ConcurrentHashMap<String, String> LJFF() {
        m LIZIZ;
        IServerPortraitService iServerPortraitService = this.LIZIZ;
        if (iServerPortraitService == null || (LIZIZ = iServerPortraitService.LIZIZ()) == null || LIZIZ.size() <= 0) {
            return null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        for (Map.Entry<String, j> entry : LIZIZ.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                String key = entry.getKey();
                o.LJIIIIZZ(key, "kv.key");
                j value = entry.getValue();
                o.LJIIIIZZ(value, "kv.value");
                concurrentHashMap.put(key, LJII(value));
            }
        }
        return concurrentHashMap;
    }

    public final IServerPortraitService LJI() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        IServerPortraitService LIZJ = ServerPortraitCollections.LIZJ();
        this.LIZIZ = LIZJ;
        this.LIZJ = true;
        return LIZJ;
    }

    @Override // X.AbstractC48600J5o
    public final void LIZIZ() {
        LJI();
    }

    public static String LJII(j jVar) {
        try {
            if (jVar instanceof p) {
                return jVar.LJJIFFI();
            }
            if (jVar instanceof m) {
                return jVar.toString();
            }
            if (jVar instanceof g) {
                return jVar.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.AbstractC48600J5o
    public final boolean LIZ(String str) {
        IServerPortraitService LJI;
        m LIZIZ;
        if (str == null || (LJI = LJI()) == null || (LIZIZ = LJI.LIZIZ()) == null) {
            return false;
        }
        return LIZIZ.LJJIJLIJ(str);
    }

    @Override // X.AbstractC48600J5o
    public final String LIZJ(String str) {
        IServerPortraitService LJI;
        m LIZIZ;
        j LJJIJ;
        if (str == null || (LJI = LJI()) == null || (LIZIZ = LJI.LIZIZ()) == null || (LJJIJ = LIZIZ.LJJIJ(str)) == null) {
            return null;
        }
        return LJII(LJJIJ);
    }
}
