package X;

import com.ss.ugc.effectplatform.task.FetchCategoryEffectTask;
import com.ss.ugc.effectplatform.task.FetchEffectListCheckedTask;
import com.ss.ugc.effectplatform.task.FetchPanelEffectListTask;
import com.ss.ugc.effectplatform.task.FetchPanelInfoTask;
import kotlin.jvm.internal.o;

/* renamed from: X.XDq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84482XDq {
    public final XCG LIZ;

    public C84482XDq(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZ = effectConfig;
    }

    public final void LIZIZ(String str, XDR xdr) {
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            this.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        C84486XDu c84486XDu = new C84486XDu(this.LIZ, str, LIZ);
        XCX xcx = this.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(c84486XDu);
        }
    }

    public final void LIZJ(String panel, boolean z, XDR xdr) {
        InterfaceC13850gX fetchPanelEffectListTask;
        o.LJIIJ(panel, "panel");
        String LIZ = C84410XAw.LIZ();
        this.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        if (z) {
            fetchPanelEffectListTask = new XDW(this.LIZ, panel, LIZ);
        } else {
            fetchPanelEffectListTask = new FetchPanelEffectListTask(this.LIZ, panel, LIZ);
        }
        XCX xcx = this.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchPanelEffectListTask);
        }
    }

    public final void LIZLLL(String panel, boolean z, java.util.Map map, XDR xdr) {
        InterfaceC13850gX fetchEffectListCheckedTask;
        o.LJIIJ(panel, "panel");
        String LIZ = C84410XAw.LIZ();
        this.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        if (z) {
            fetchEffectListCheckedTask = new XDV(this.LIZ, panel, LIZ);
        } else {
            fetchEffectListCheckedTask = new FetchEffectListCheckedTask(this.LIZ, panel, LIZ, map);
        }
        XCX xcx = this.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchEffectListCheckedTask);
        }
    }

    public final void LJ(String panel, boolean z, String str, int i, int i2, boolean z2, java.util.Map map, XDR xdr) {
        InterfaceC13850gX fetchPanelInfoTask;
        o.LJIIJ(panel, "panel");
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            this.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        if (z2) {
            fetchPanelInfoTask = new C84469XDd(this.LIZ, panel, LIZ, z, str, i, i2);
        } else {
            fetchPanelInfoTask = new FetchPanelInfoTask(this.LIZ, panel, LIZ, z, str, i, i2, map);
        }
        XCX xcx = this.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchPanelInfoTask);
        }
    }

    public final void LIZ(String panel, String str, int i, int i2, int i3, String str2, boolean z, java.util.Map map, XDR xdr) {
        InterfaceC13850gX fetchCategoryEffectTask;
        o.LJIIJ(panel, "panel");
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            this.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        if (z) {
            fetchCategoryEffectTask = new C84468XDc(this.LIZ, panel, LIZ, str, i, i2, i3);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.LIZ, panel, LIZ, str, i, i2, i3, str2, map);
        }
        XCX xcx = this.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchCategoryEffectTask);
        }
    }
}
