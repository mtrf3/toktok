package X;

import com.bytedance.poplayer.core.PopupManager;

/* renamed from: X.OnQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62964OnQ implements InterfaceC62968OnU {
    public final /* synthetic */ InterfaceC62968OnU LIZ;

    @Override // X.InterfaceC62968OnU
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZJ() {
    }

    public C62964OnQ(InterfaceC62968OnU interfaceC62968OnU) {
        this.LIZ = interfaceC62968OnU;
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZ(String str, boolean z) {
        C62913Omb.LIZLLL = true;
        PopupManager.LIZJ(C40462FuM.class);
        InterfaceC62968OnU interfaceC62968OnU = this.LIZ;
        if (interfaceC62968OnU != null) {
            interfaceC62968OnU.LIZ(str, z);
        }
    }
}
