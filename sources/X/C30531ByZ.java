package X;

import java.io.File;

/* renamed from: X.ByZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30531ByZ extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C30531ByZ LJLIL = new C30531ByZ();

    public C30531ByZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LIZLLL().getDir("live_capture_video", 0).getAbsolutePath());
        return JBR.LJFF(LIZ, File.separator, "origin_video.h264", LIZ);
    }
}
