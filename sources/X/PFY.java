package X;

import android.os.Process;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;

/* loaded from: classes12.dex */
public final class PFY extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PFX LJLJJI;

    public final void LIZ() {
        boolean z;
        PFX pfx = this.LJLJJI;
        if (pfx.LIZ == null) {
            return;
        }
        PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
        int i = 0;
        if (pg9 != null) {
            z = pg9.isForeground();
        } else {
            z = false;
        }
        int myPid = Process.myPid();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(myPid);
            LIZ.append("/fd");
            i = new File(X1D.LIZIZ(LIZ)).listFiles().length;
        } catch (Exception unused) {
        }
        if (i > 0 && i < pfx.LIZ.LIZ) {
            PC2.LIZ(new PFZ(i, z, null));
            return;
        }
        if (pfx.LJFF == null) {
            pfx.LJFF = (IFdCheck) C171096nZ.LIZ(IFdCheck.class);
        }
        IFdCheck iFdCheck = pfx.LJFF;
        if (iFdCheck == null) {
            return;
        }
        PC2.LIZ(new PFZ(i, z, iFdCheck.getFdList()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PFY(PFX pfx, long j) {
        super(0L, j);
        this.LJLJJI = pfx;
    }
}
