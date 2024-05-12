package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* renamed from: X.NJw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC59164NJw implements Runnable {
    public final /* synthetic */ File LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ UpdatePackage LJLJJL;

    public final void LIZ() {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clean channel old resources for ");
        LIZ.append(this.LJLIL.getPath());
        LIZ.append(" start. Waiting cost=");
        LIZ.append(currentTimeMillis - this.LJLILLLLZI);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        int LIZLLL = OAH.LIZLLL(Long.valueOf(this.LJLJI), this.LJLIL.getAbsolutePath(), false, false);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clean channel old resources finish, channel:");
        C0EH.LIZLLL(LIZ2, this.LJLJJI, "delete:", LIZLLL, " , cost:");
        LIZ2.append(currentTimeMillis2);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ2));
        String accessKey = this.LJLJJL.getAccessKey();
        String str = this.LJLJJI;
        if (LIZLLL > 0) {
            i = 204;
        } else {
            i = 205;
        }
        OD6.LJFF(new O08(i, accessKey, str, 0, currentTimeMillis2, (String) null, 7));
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

    public RunnableC59164NJw(File file, long j, long j2, String str, UpdatePackage updatePackage) {
        this.LJLIL = file;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = str;
        this.LJLJJL = updatePackage;
    }
}
