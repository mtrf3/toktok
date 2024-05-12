package X;

import java.io.File;

/* loaded from: classes8.dex */
public final class HVH implements InterfaceC83958WxG {
    public final File LIZ;
    public final File LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;

    public HVH() {
        File file = ((XFZ) C83739Wtj.LIZIZ()).LJIIIZ;
        this.LIZ = file;
        File file2 = new File(((XFZ) C83739Wtj.LIZIZ()).LJIIIZ, "segs");
        this.LIZIZ = file2;
        this.LIZJ = new File(file2, "video");
        this.LIZLLL = new File(file2, "audio");
        new File(file, "photo");
    }

    @Override // X.InterfaceC83958WxG
    public final File LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83958WxG
    public final File LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC83958WxG
    public final File LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC83958WxG
    public final File getWorkspace() {
        return this.LIZ;
    }
}
