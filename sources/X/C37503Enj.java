package X;

import Y.ACallableS78S0101000_6;
import Y.ARunnableS7S1100000_6;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Settings;
import defpackage.i0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;
import ujb.s;

/* renamed from: X.Enj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37503Enj implements InterfaceC37604EpM {
    public static final C37503Enj LIZ = new C37503Enj();

    public static boolean LJ(android.net.Uri uri) {
        String path;
        if (uri == null || !C85693Xx.LIZIZ(uri)) {
            return false;
        }
        C37413EmH c37413EmH = Settings.LJIIIZ;
        if (!C37413EmH.LIZ(c37413EmH).isPiaEnabled || !C37413EmH.LIZ(c37413EmH).LIZIZ(uri)) {
            return false;
        }
        Settings LIZ2 = C37413EmH.LIZ(c37413EmH);
        LIZ2.getClass();
        if (Settings.LJII) {
            if (LIZ2.isPiaEnabled && C85693Xx.LIZIZ(uri)) {
                if (!((List) LIZ2.LIZLLL.getValue()).isEmpty()) {
                    String host = uri.getHost();
                    if (host != null && (path = uri.getPath()) != null) {
                        String LJFF = i0.LJFF(host, path);
                        List list = (List) LIZ2.LIZLLL.getValue();
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (s.LJJJLZIJ(LJFF, (String) it.next(), false)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (uri.getBooleanQueryParameter("__pia_manifest__", false)) {
            return true;
        }
        if (C37413EmH.LIZ(Settings.LJIIIZ).isPiaQueryDisable) {
            if (!C37429EmX.LIZ(uri) && !uri.getBooleanQueryParameter("_pia_", false)) {
                return false;
            }
        } else if (!uri.getBooleanQueryParameter("_pia_", false) || !C37429EmX.LIZ(uri)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37604EpM
    public final boolean LIZ(String str) {
        Object LIZ2;
        if (str == null) {
            return false;
        }
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isPiaQueryDisable && !s.LJJJLZIJ(str, "__pia_manifest__", false) && !s.LJJJLZIJ(str, "_pia_", false)) {
            return false;
        }
        try {
            LIZ2 = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        return LJ((android.net.Uri) LIZ2);
    }

    @Override // X.InterfaceC37604EpM
    public final C37500Eng LIZLLL(C37531EoB c37531EoB) {
        return new C37500Eng(c37531EoB);
    }

    @Override // X.InterfaceC37604EpM
    public final C37512Ens LIZIZ(String str, C37531EoB c37531EoB) {
        return LIZJ(str, c37531EoB, EnumC37510Enq.Activate);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.Ens, java.lang.Object] */
    @Override // X.InterfaceC37604EpM
    public final C37512Ens LIZJ(String str, C37531EoB c37531EoB, EnumC37510Enq enumC37510Enq) {
        C37488EnU.LIZ.getClass();
        if (Settings.LIZ().isWarmupEnabled) {
            if (!((HashMap) C37515Env.LIZ.LIZ).containsKey("HybridKit")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Warmup] failed to warmup because there is no env for ");
                LIZ2.append("HybridKit");
                C37238EjS.LIZIZ(X1D.LIZIZ(LIZ2));
            } else {
                C37504Enk c37504Enk = new C37504Enk();
                c37504Enk.LIZIZ = str;
                c37504Enk.LIZ = "HybridKit";
                c37504Enk.LIZJ = c37531EoB;
                c37504Enk.LIZLLL = true;
                final String LIZIZ = c37504Enk.LIZIZ();
                if (LIZIZ != null && !LIZIZ.isEmpty()) {
                    if (EnumC37510Enq.Load == enumC37510Enq) {
                        synchronized (C37560Eoe.class) {
                            C37499Enf LIZ3 = c37504Enk.LIZ();
                            if (LIZ3 != null && LIZ3.LIZJ.LIZJ()) {
                                android.net.Uri parse = UriProtector.parse(LIZ3.LIZJ.streaming);
                                if (C37560Eoe.LJI == null || !C37560Eoe.LJI.LIZ.equals(parse)) {
                                    if (C37560Eoe.LJI != null) {
                                        C37560Eoe.LJI.LIZIZ.terminate();
                                    }
                                    try {
                                        C37560Eoe.LJI = new C37560Eoe(LIZ3.LJIIIIZZ, parse);
                                    } catch (Throwable th) {
                                        C37238EjS.LIZLLL(4, "[Worker] try warmup failed!", th);
                                    }
                                }
                            }
                        }
                    } else {
                        final FutureTask<C37499Enf> futureTask = new FutureTask<>(new ACallableS78S0101000_6(0, c37504Enk, 0));
                        if (C37505Enl.LIZ.putIfAbsent(LIZIZ, futureTask) == null) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("[Runtime] start to warmup, url=");
                            LIZ4.append(str);
                            C37238EjS.LJFF(X1D.LIZIZ(LIZ4));
                            ?? r5 = new InterfaceC37489EnV() { // from class: X.Ens
                                @Override // X.InterfaceC37489EnV
                                public final void release() {
                                    C37613EpV.LIZJ(new ARunnableS7S1100000_6(futureTask, LIZIZ, 0));
                                }
                            };
                            C37613EpV.LIZJ(futureTask);
                            C37613EpV.LIZ().postDelayed(new HZD(2, r5), 30000L);
                            return r5;
                        }
                    }
                }
            }
        }
        return null;
    }
}
