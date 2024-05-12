package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class OD9 extends AbstractC61551ODr<Pair<OEF, UpdatePackage>, Pair<OEF, UpdatePackage>> {
    public C61276O3c LJI;

    public static File LIZJ(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        String accessKey = updatePackage.getAccessKey();
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        File rootDirectory = c61532OCy.LJ.getRootDirectory();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(accessKey);
        String str = File.separator;
        LIZ.append(str);
        LIZ.append(updatePackage.getChannel());
        File file = new File(rootDirectory, X1D.LIZIZ(LIZ));
        if (packageType != 0) {
            if (packageType != 1) {
                OC6.LIZ("gecko-debug-tag", KMP.LJ("unknown file type: ", packageType));
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(updatePackage.getLocalVersion());
            LIZ2.append(str);
            LIZ2.append("res");
            File file2 = new File(file, X1D.LIZIZ(LIZ2));
            File[] listFiles = file2.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("can not found old full single file,:");
                LIZ3.append(file2.getAbsolutePath());
                OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ3));
                return null;
            }
            return listFiles[0];
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(updatePackage.getLocalVersion());
        LIZ4.append(str);
        LIZ4.append("res.zip");
        return new File(file, X1D.LIZIZ(LIZ4));
    }

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        this.LJI = (C61276O3c) objArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01a2  */
    @Override // X.AbstractC61551ODr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C61548ODo r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OD9.LIZIZ(X.ODo, java.lang.Object):java.lang.Object");
    }
}
