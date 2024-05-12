package X;

import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.lynx.react.bridge.Callback;
import kotlin.jvm.internal.AqS110S0300000_6;

/* renamed from: X.EvL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37975EvL implements InterfaceC37916EuO {
    public final /* synthetic */ AqS110S0300000_6 LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C37975EvL(AqS110S0300000_6 aqS110S0300000_6, boolean z) {
        this.LIZ = aqS110S0300000_6;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC37916EuO
    public final void LJI(C37911EuJ c37911EuJ, C37955Ev1 c37955Ev1) {
        LynxBridgeDelegateModule lynxBridgeDelegateModule = (LynxBridgeDelegateModule) this.LIZ.l0;
        lynxBridgeDelegateModule.onLynxBridgeResult(c37911EuJ, c37955Ev1, (C37904EuC) lynxBridgeDelegateModule.getObj(), this.LIZIZ, (Callback) this.LIZ.l2);
    }
}
