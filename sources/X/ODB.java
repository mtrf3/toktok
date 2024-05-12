package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.GeckoManifest;
import com.bytedance.geckox.model.GeckoMd5Check;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ODB extends AbstractC61551ODr<Pair<OEF, UpdatePackage>, Pair<UpdatePackage, Long>> {
    public static void LIZJ(File file) {
        InputStreamReader inputStreamReader;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res");
        File file2 = new File(file, JBR.LJFF(LIZ, File.separator, "gecko_manifest.json", LIZ));
        if (!file2.exists()) {
            return;
        }
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file2), "utf-8");
        } catch (Throwable th) {
            th = th;
            inputStreamReader = null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read();
                if (read == -1) {
                    break;
                } else {
                    stringBuffer.append((char) read);
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            C78609UtB.LJJIIZI(inputStreamReader);
            java.util.Map<String, GeckoMd5Check> files = ((GeckoManifest) GsonProtectorUtils.fromJson(OXZ.LIZIZ.LIZ, stringBuffer2, GeckoManifest.class)).getFiles();
            if (files == null || files.isEmpty()) {
                return;
            }
            for (Map.Entry<String, GeckoMd5Check> entry : files.entrySet()) {
                String key = entry.getKey();
                String md5 = entry.getValue().getMd5();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(md5)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("res");
                    File file3 = new File(file, JBR.LJFF(LIZ2, File.separator, key, LIZ2));
                    if (file3.exists()) {
                        try {
                            C61467OAl.LIZ(file3);
                        } catch (Exception unused) {
                            String LIZJ = C61327O5b.LIZJ(file3);
                            if (!LIZJ.equals(md5)) {
                                StringBuilder LIZLLL = C06540Nm.LIZLLL("md5 check failed, local md5:", LIZJ, ", expect md5:", md5, ", file length: ");
                                LIZLLL.append(file3.length());
                                throw new RuntimeException(X1D.LIZIZ(LIZLLL));
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("file broken, but md5 is the same, file length: ");
                            LIZ3.append(file3.length());
                            throw new RuntimeException(X1D.LIZIZ(LIZ3));
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C78609UtB.LJJIIZI(inputStreamReader);
            throw th;
        }
    }

    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        Pair pair = (Pair) obj;
        OC6.LIZ("gecko-debug-tag", "start active channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        long version = updatePackage.getVersion();
        File LIZLLL = ODA.LIZLLL(updatePackage);
        File parentFile = LIZLLL.getParentFile();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(version);
        LIZ.append("");
        File file = new File(parentFile, X1D.LIZIZ(LIZ));
        if (C61467OAl.LIZJ(file)) {
            if (LIZLLL.renameTo(file)) {
                try {
                    LIZJ(file);
                    return c61548ODo.LJ(new Pair(updatePackage, Long.valueOf(version)));
                } catch (Exception e) {
                    C61467OAl.LIZLLL(file);
                    StringBuilder LIZ2 = X1D.LIZ();
                    throw new RuntimeException(KMP.LJFF(LIZ2, "check file broken failed: ", e, LIZ2));
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("rename failed:");
            LIZ3.append(LIZLLL.getAbsolutePath());
            throw new RuntimeException(X1D.LIZIZ(LIZ3));
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("delete old dir failed:");
        LIZ4.append(file.getAbsolutePath());
        throw new RuntimeException(X1D.LIZIZ(LIZ4));
    }
}
