package X;

import defpackage.e1;

/* renamed from: X.HhY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44764HhY implements InterfaceC44777Hhl {
    public static final C44764HhY LJIILJJIL = new C44764HhY();

    static {
        C5Z6.LIZ("MvAndCanvasByteBenchApi -> use DefaultApi");
    }

    @Override // X.InterfaceC44777Hhl
    public final boolean enableMvBindingHDSwitch() {
        return e1.LIZ(31744, "mv_enable_binding_hd_switch", true, false);
    }

    @Override // X.InterfaceC44777Hhl
    public final boolean enableSynthesisMvTo1080p() {
        return C19N.LJ("enable_1080p_photo_to_video", false);
    }

    @Override // X.InterfaceC44777Hhl
    public final int mvDynamicResolutionStrategy() {
        return C00F.LIZ(31744, 0, "tool_photo_to_video_resolution_strategy", true);
    }

    @Override // X.InterfaceC44777Hhl
    public final int mvFastImportStrategy() {
        return C00F.LIZ(31744, 0, "mv_photo_resize_strategy", true);
    }

    @Override // X.InterfaceC44777Hhl
    public final String mvSynthesisSettingsFor1080p() {
        return C31461Li.LIZJ("avtools_1080p_mv_photo_ve_synthesis_settings", "", "getInstance().getStringV…ettings1080p::class.java)");
    }
}
