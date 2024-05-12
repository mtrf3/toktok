package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83932Wwq extends AbstractC84033WyT {
    public final InterfaceC83958WxG LJI;

    @Override // X.AbstractC84033WyT
    public final String LIZ() {
        String absolutePath = this.LJI.LIZJ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "workspaceProvider.concat…entAudioPath.absolutePath");
        return absolutePath;
    }

    @Override // X.AbstractC84033WyT
    public final String LIZIZ() {
        String absolutePath = this.LJI.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "workspaceProvider.concat…entVideoPath.absolutePath");
        return absolutePath;
    }

    @Override // X.AbstractC84033WyT
    public final String LIZJ() {
        String path = this.LJI.LIZIZ().getAbsolutePath();
        new File(path).mkdirs();
        o.LJIIIIZZ(path, "path");
        return path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83932Wwq(InterfaceC83958WxG workspaceProvider) {
        super(workspaceProvider.getWorkspace().getAbsolutePath());
        o.LJIIIZ(workspaceProvider, "workspaceProvider");
        this.LJI = workspaceProvider;
    }
}
