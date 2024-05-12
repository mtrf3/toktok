package X;

import defpackage.e1;

/* renamed from: X.KhH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52391KhH implements InterfaceC44948HkW {
    public static final C52391KhH LJIILJJIL = new C52391KhH();

    @Override // X.InterfaceC44948HkW
    public final int getOpenAlbumOptiGroup() {
        return ((Number) C52392KhI.LIZ.getValue()).intValue();
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenAlbumThreeColumnsOpti() {
        if (e1.LIZ(31744, "creative_tools_three_columns", true, false)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenStopVideoPlayerOpti() {
        return ((Boolean) C52394KhK.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC44948HkW
    public final boolean isOpenTaskDegradationOpti() {
        return e1.LIZ(31744, "creative_tools_task_degradation_opti", true, false);
    }
}
