package X;

import android.util.Pair;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class OD8 extends AbstractC61551ODr<Pair<OEF, UpdatePackage>, Pair<OEF, UpdatePackage>> {
    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
    }

    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        boolean z;
        Pair pair = (Pair) obj;
        boolean z2 = false;
        OC6.LIZ("gecko-debug-tag", "start merge dir, channel:", ((UpdatePackage) pair.second).getChannel());
        OEF oef = (OEF) pair.first;
        File LJJIII = oef.LJJIII();
        oef.LJJII();
        oef.release();
        File parentFile = LJJIII.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(updatePackage.getLocalVersion());
        File file = new File(parentFile, JBR.LJFF(LIZ, File.separator, "res", LIZ));
        File file2 = new File(LJJIII.getParentFile(), "res");
        C61467OAl.LIZLLL(file2);
        try {
            if (AppSettingsManager.LIZ()) {
                try {
                    new C61508OCa().LJFF(file, file2, LJJIII);
                    C16880lQ.LLLZZIL(LJJIII);
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("merge dir failed: ");
                    LIZ2.append(updatePackage.toString());
                    OC6.LJ("gecko-debug-tag", X1D.LIZIZ(LIZ2), e);
                    throw e;
                }
            } else {
                try {
                    try {
                        z = O5R.LIZIZ(parentFile.getAbsolutePath());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                }
                try {
                    if (!z) {
                        OC6.LIZ("gecko-debug-tag", "merge dir,channel:", parentFile.getAbsolutePath());
                        new C61508OCa().LJFF(file, file2, LJJIII);
                        O5R.LIZLLL(parentFile.getAbsolutePath());
                    } else {
                        throw new RuntimeException("read lock timeout");
                    }
                } catch (Exception e3) {
                    e = e3;
                    z2 = z;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("merge dir failed: ");
                    LIZ3.append(updatePackage.toString());
                    OC6.LJ("gecko-debug-tag", X1D.LIZIZ(LIZ3), e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (!z) {
                        O5R.LIZLLL(parentFile.getAbsolutePath());
                    }
                    throw th;
                }
            }
            return c61548ODo.LJ(pair);
        } finally {
            C16880lQ.LLLZZIL(LJJIII);
        }
    }
}
