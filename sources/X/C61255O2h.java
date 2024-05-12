package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.O2h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61255O2h implements InterfaceC61267O2t {
    @Override // X.InterfaceC61267O2t
    public final void LIZ(O26 resInfo, O1M taskConfig) {
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        Iterator<InterfaceC61267O2t> it = C61269O2v.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ(resInfo, taskConfig);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC61267O2t
    public final void LIZIZ(O26 resInfo, O1M taskConfig) {
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        Iterator<InterfaceC61267O2t> it = C61269O2v.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZIZ(resInfo, taskConfig);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC61267O2t
    public final void LIZJ(O26 resInfo, O1M taskConfig, Throwable e) {
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        o.LJIIJ(e, "e");
        Iterator<InterfaceC61267O2t> it = C61269O2v.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZJ(resInfo, taskConfig, e);
            } catch (Throwable unused) {
            }
        }
    }
}
