package X;

import java.io.File;

/* renamed from: X.ByY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30530ByY extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C30530ByY LJLIL = new C30530ByY();

    public C30530ByY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LIZLLL().getDir("live_capture_video", 0).getAbsolutePath());
        return JBR.LJFF(LIZ, File.separator, "effect_video.h264", LIZ);
    }
}
