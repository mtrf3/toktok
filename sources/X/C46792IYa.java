package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.o;

/* renamed from: X.IYa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46792IYa extends C46742IWc {
    @Override // X.C46742IWc, X.IZT
    public final void LJIJ() {
        if (C46793IYb.LJLJI.LJLILLLLZI) {
            SimRadar.keyScan("TTPlayer", String.valueOf(this.LJLILLLLZI.getPlayer()), "resetCoreWhenStop");
            IUA.LIZ.LIZ().getBindCpuCore().getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46792IYa(InterfaceC46804IYm info) {
        super(info);
        o.LJIIIZ(info, "info");
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        if (C46793IYb.LJLJI.LJLIL) {
            SimRadar.keyScan("TTPlayer", String.valueOf(this.LJLILLLLZI.getPlayer()), "bindBigCoreWhenPrepare");
            IUA.LIZ.LIZ().getBindCpuCore().getClass();
        }
    }
}
