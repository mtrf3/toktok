package X;

import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveMenuWidget;

/* renamed from: X.C4s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30742C4s implements InterfaceC40159FpT {
    public final /* synthetic */ ProgrammedLiveMenuWidget LJLIL;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.NV7
    public final void refresh() {
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        this.LJLIL.dataChannel.rv0(ProgrammedLiveMenuVisibilityChannel.class, new C30744C4u(false, EnumC30108Brk.BLANK_SPACE));
    }

    public C30742C4s(ProgrammedLiveMenuWidget programmedLiveMenuWidget) {
        this.LJLIL = programmedLiveMenuWidget;
    }
}
