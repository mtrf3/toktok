package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.plugins.HtmlPlugin;
import com.bytedance.pia.core.plugins.ManifestPlugin;
import com.bytedance.pia.core.plugins.RenderingPlugin;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EnN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37481EnN implements InterfaceC37486EnS {
    public static final java.util.Map<String, C37499Enf> LIZ = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [X.EnQ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EnP] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.EnO] */
    @Override // X.InterfaceC37486EnS
    public final C37482EnO LIZ(String str, java.util.Map map, final C37358ElO c37358ElO, final C37485EnR c37485EnR) {
        if (!Settings.LIZ().isCacheEnabled) {
            c37485EnR.accept(new C37407EmB());
            return null;
        }
        if (str == null) {
            c37485EnR.accept(new C37407EmB());
            return null;
        }
        Config LIZ2 = Config.LIZ(UriProtector.parse(str));
        if (LIZ2 == null || !LIZ2.LIZIZ().contains("nsr")) {
            c37485EnR.accept(new C37407EmB());
            return null;
        }
        C37488EnU.LIZ.getClass();
        C37499Enf LIZ3 = C37505Enl.LIZ(str, "HybridKit", null, LIZ2, false);
        if (LIZ3 == null) {
            c37485EnR.accept(new C37394Ely("Create runtime error!"));
            return null;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final String obj = LIZ3.toString();
        ((HashMap) LIZ).put(obj, LIZ3);
        final ?? r4 = new InterfaceC37489EnV() { // from class: X.EnO
            @Override // X.InterfaceC37489EnV
            public final void release() {
                C37496Enc c37496Enc;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                String str2 = obj;
                if (!atomicBoolean2.compareAndSet(false, true) || (c37496Enc = (C37496Enc) ((HashMap) C37481EnN.LIZ).remove(str2)) == null) {
                    return;
                }
                c37496Enc.release();
            }
        };
        ?? r3 = new BQ6() { // from class: X.EnP
            @Override // X.BQ6
            public final void accept(Object obj2) {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                InterfaceC37489EnV interfaceC37489EnV = r4;
                BQ6 bq6 = c37358ElO;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC37489EnV.release();
                if (bq6 == null) {
                    return;
                }
                bq6.accept(obj2);
            }
        };
        ?? r2 = new BQ6() { // from class: X.EnQ
            @Override // X.BQ6
            public final void accept(Object obj2) {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                InterfaceC37489EnV interfaceC37489EnV = r4;
                BQ6 bq6 = c37485EnR;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC37489EnV.release();
                if (bq6 == null) {
                    return;
                }
                bq6.accept(obj2);
            }
        };
        LIZ3.LJIIIIZZ(HtmlPlugin.class, null);
        LIZ3.LJIIIIZZ(ManifestPlugin.class, null);
        LIZ3.LJIIIIZZ(RenderingPlugin.class, new C37479EnL(map, r3, r2));
        LIZ3.LJII();
        return r4;
    }
}
