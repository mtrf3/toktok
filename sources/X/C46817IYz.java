package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IYz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46817IYz extends AbstractC47210Ifu {
    public String LJ;

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        if (interfaceC46811IYt == null) {
            return;
        }
        interfaceC46811IYt.LJII();
        SimRadar.keyScan("PlayerImpl", "play", null, interfaceC46811IYt.getKey());
        SimRadar.traceGroup(o.LJIILLIIL(interfaceC46811IYt.getKey(), "VIDEO@")).LIZIZ("Play");
        String str = this.LJ;
        if (str == null) {
            return;
        }
        ITQ traceGroup = SimRadar.traceGroup(str);
        interfaceC46811IYt.LJII();
        traceGroup.LIZIZ(o.LJIILLIIL(null, "Play:"));
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJFF(String str) {
        String str2 = this.LJ;
        if (str2 != null) {
            SimRadar.traceGroup(str2).LIZIZ("clearPlayList");
        }
        this.LJ = null;
        SimRadar.keyScan("PlayerImpl", "clearPlayList", "sceneID", str);
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        this.LJ = str;
        if (str != null) {
            SimRadar.traceGroup(str).LIZIZ("setPlayList");
        }
        SimRadar.keyScan("PlayerImpl", "setPlayList", "sceneID", str, "size", Integer.valueOf(list.size()));
    }
}
