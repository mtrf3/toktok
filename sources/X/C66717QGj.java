package X;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QGj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66717QGj {
    public File LIZ;
    public final C67195QYt LIZIZ;

    public final File LIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    C67195QYt c67195QYt = this.LIZIZ;
                    c67195QYt.LIZ();
                    File LLIIJLIL = C16880lQ.LLIIJLIL(c67195QYt.LIZ);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PersistedInstallation.");
                    LIZ.append(this.LIZIZ.LIZJ());
                    LIZ.append(".json");
                    this.LIZ = new File(LLIIJLIL, X1D.LIZIZ(LIZ));
                }
            }
        }
        return this.LIZ;
    }

    public final C66720QGm LIZJ() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(LIZ());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        EnumC66725QGr enumC66725QGr = EnumC66725QGr.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", enumC66725QGr.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        C66721QGn c66721QGn = new C66721QGn();
        c66721QGn.LJFF = 0L;
        c66721QGn.LIZIZ(enumC66725QGr);
        c66721QGn.LJ = 0L;
        c66721QGn.LIZ = optString;
        c66721QGn.LIZIZ(EnumC66725QGr.values()[optInt]);
        c66721QGn.LIZJ = optString2;
        c66721QGn.LIZLLL = optString3;
        c66721QGn.LJFF = Long.valueOf(optLong);
        c66721QGn.LJ = Long.valueOf(optLong2);
        c66721QGn.LJI = optString4;
        return c66721QGn.LIZ();
    }

    public C66717QGj(C67195QYt c67195QYt) {
        this.LIZIZ = c67195QYt;
    }

    public final void LIZIZ(C66720QGm c66720QGm) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c66720QGm.LIZIZ);
            jSONObject.put("Status", c66720QGm.LIZJ.ordinal());
            jSONObject.put("AuthToken", c66720QGm.LIZLLL);
            jSONObject.put("RefreshToken", c66720QGm.LJ);
            jSONObject.put("TokenCreationEpochInSecs", c66720QGm.LJI);
            jSONObject.put("ExpiresInSecs", c66720QGm.LJFF);
            jSONObject.put("FisError", c66720QGm.LJII);
            C67195QYt c67195QYt = this.LIZIZ;
            c67195QYt.LIZ();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", C16880lQ.LLIIJLIL(c67195QYt.LIZ));
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(LIZ())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}
