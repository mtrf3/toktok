package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class ODD extends AbstractC61551ODr<Pair<OEF, UpdatePackage>, Pair<OEF, UpdatePackage>> {
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        Pair pair = (Pair) obj;
        OC6.LIZ("gecko-debug-tag", "start unzip, channel:", ((UpdatePackage) pair.second).getChannel());
        OEF oef = (OEF) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = oef.LJJIII().getParentFile();
        try {
            LIZJ(0, parentFile, updatePackage, oef, null);
            File file = new File(parentFile, "res");
            C61467OAl.LIZJ(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                C16880lQ.LLLZZIL(oef.LJJIII());
                return c61548ODo.LJ(pair);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rename file failed:");
            LIZ.append(parentFile.getAbsolutePath());
            throw new RuntimeException(X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            throw new RuntimeException(C16880lQ.LLLZ("unzip failed, channel:%s, pkg id:%d, msg:%s", new Object[]{updatePackage.getChannel(), Long.valueOf(updatePackage.getPackage().getId()), e.getMessage()}), e);
        }
    }

    public static void LIZJ(int i, File file, UpdatePackage updatePackage, OEF oef, C61578OEs c61578OEs) {
        File file2 = new File(file, updatePackage.getChannel());
        if (file2.exists()) {
            C61467OAl.LIZJ(file2);
        }
        if (i < 2) {
            try {
                oef.position(0L);
                ODC.LIZJ(new OEG(oef), file.getAbsolutePath(), updatePackage.getChannel(), i);
                oef.LJJII();
                return;
            } catch (C61578OEs e) {
                LIZJ(i + 1, file, updatePackage, oef, e);
                return;
            }
        }
        C61467OAl.LIZJ(file);
        throw c61578OEs;
    }
}
