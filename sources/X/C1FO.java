package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest$run$1;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1FO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FO implements InterfaceC62533OgT, InterfaceC48038ItG, InterfaceC36484ETo {
    public static BenchmarkInitRequest$run$1 LJLIL;
    public static final C1FO LJLILLLLZI = new C1FO();

    @Override // X.InterfaceC62533OgT
    public void LJI() {
        PerfMonitorServiceImpl.LIZ().LIZLLL("share_panel");
    }

    public static C78488UrE LJII() {
        C78488UrE c78488UrE;
        C78489UrF LIZ = C78489UrF.LIZ();
        synchronized (LIZ) {
            c78488UrE = LIZ.LIZ.get("UNLOCK");
        }
        return c78488UrE;
    }

    public static C78488UrE LJIIIZ() {
        C78488UrE c78488UrE;
        if (LJII() != null) {
            return LJII();
        }
        C78489UrF LIZ = C78489UrF.LIZ();
        synchronized (LIZ) {
            if (!LIZ.LIZ.containsKey("UNLOCK")) {
                LIZ.LIZ.put("UNLOCK", new C78488UrE());
            }
            c78488UrE = LIZ.LIZ.get("UNLOCK");
        }
        return c78488UrE;
    }

    @Override // X.InterfaceC36484ETo
    public Gson LIZ() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(GsonPro…er::class.java).getGson()");
        return LIZ;
    }

    @Override // X.InterfaceC62533OgT
    public void LIZJ() {
        PerfMonitorServiceImpl.LIZ().LIZJ();
    }

    public static boolean LJIIIIZZ(String str) {
        BenchmarkInitRequest$run$1 benchmarkInitRequest$run$1 = LJLIL;
        if (benchmarkInitRequest$run$1 == null || benchmarkInitRequest$run$1.isHitSample(str, 0.01f)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ(X.C78490UrG r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1FO.LJIIJ(X.UrG, java.lang.String):boolean");
    }

    @Override // X.InterfaceC62533OgT
    public void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        PerfMonitorServiceImpl.LIZ().LIZIZ(interfaceC65784Pro, interfaceC65784Pro2);
    }

    @Override // X.InterfaceC36484ETo
    public int LIZLLL(Context context, Throwable th) {
        if (th instanceof C64802Pby) {
            if (((C64802Pby) th).getStatusCode() == 503) {
                return -19;
            }
            return -16;
        }
        return 0;
    }

    @Override // X.InterfaceC62533OgT
    public void LJ(String str, RecyclerView recyclerView, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        PerfMonitorServiceImpl.LIZ().LJI(str, EnumC55365Lo9.RECYCLER_VIEW, recyclerView, interfaceC65784Pro, interfaceC65784Pro2);
    }

    @Override // X.InterfaceC36484ETo
    public Object LJFF(String str, int i, String str2, Class cls, String str3, List list) {
        HH1.LIZ(str, "url", str2, "path", str3, "key");
        if (list != null) {
            return com.ss.android.ugc.aweme.app.api.Api.LJFF(str, i, str2, cls, str3, list);
        }
        if (String.class.equals(cls)) {
            return com.ss.android.ugc.aweme.app.api.Api.LJ(str, i, str2, C38300F1k.LIZ, str3);
        }
        return com.ss.android.ugc.aweme.app.api.Api.LJ(str, i, str2, new C38341F2z(cls), str3);
    }
}
