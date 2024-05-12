package X;

import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HIn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43841HIn implements InterfaceC83958WxG {
    public final File LIZ;
    public final File LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;

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

    public C43841HIn(Workspace workspaceIMP) {
        o.LJIIIZ(workspaceIMP, "workspaceIMP");
        File y = workspaceIMP.y();
        y.mkdirs();
        this.LIZ = y;
        this.LIZIZ = workspaceIMP.y();
        this.LIZJ = workspaceIMP.E();
        this.LIZLLL = workspaceIMP.LJJJJLI();
        new File(y, "photo");
    }
}
