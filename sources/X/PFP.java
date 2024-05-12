package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.services.apm.api.IHttpService;
import defpackage.a1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PFP implements InterfaceC64158PFy<PAO> {
    @Override // X.InterfaceC64158PFy
    public final PAO create() {
        return new PAO() { // from class: X.1PW
            public String LIZ;
            public volatile boolean LIZIZ;
            public byte[] LIZJ;
            public long LIZLLL;
            public String LJ;

            @Override // X.PAO
            public final byte[] get() {
                FileOutputStream fileOutputStream;
                FileOutputStream fileOutputStream2 = null;
                if (!this.LIZIZ) {
                    this.LIZIZ = true;
                    this.LIZJ = OPR.LIZIZ(new File(C16880lQ.LLIIJLIL(C78248UnM.LJLJJI), "monitor_dict"));
                    SharedPreferences LIZIZ = F9J.LIZIZ(C78248UnM.LJLJJI, 0, "dict_interval");
                    this.LIZLLL = LIZIZ.getLong("dict_interval", 0L);
                    this.LJ = LIZIZ.getString("dict_version", null);
                }
                byte[] bArr = this.LIZJ;
                if (bArr != null && bArr.length > 0) {
                    return bArr;
                }
                if (bArr == null || System.currentTimeMillis() - this.LIZLLL > 604800000) {
                    HashMap hashMap = new HashMap(PC5.LJJIIJ());
                    hashMap.put("slardar_zstd_dict_type", "monitor");
                    hashMap.put("version", "1");
                    hashMap.put("slardar-zstd-version", this.LJ);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("slardar-zstd-version", this.LJ);
                    try {
                        C36633EZh doGet = ((IHttpService) PGH.LIZ(IHttpService.class)).doGet(EZT.LIZ(this.LIZ, hashMap), hashMap2);
                        if (doGet != null && doGet.LIZJ != null) {
                            JSONObject jSONObject = new JSONObject(new String(doGet.LIZJ));
                            this.LJ = JSONObjectProtectorUtils.getString(jSONObject, "dict_version");
                            byte[] decode = Base64.decode(JSONObjectProtectorUtils.getString(jSONObject, "dict"), 0);
                            File file = new File(C16880lQ.LLIIJLIL(C78248UnM.LJLJJI), "monitor_dict");
                            if (decode != null && decode.length != 0) {
                                file.getParentFile().mkdirs();
                                try {
                                    if (file.exists()) {
                                        C16880lQ.LLLZZIL(file);
                                    }
                                    file.exists();
                                    fileOutputStream = new FileOutputStream(file);
                                } catch (Exception unused) {
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    fileOutputStream.write(decode);
                                    fileOutputStream.flush();
                                    C78685UuP.LJJLIIIJLLLLLLLZ(fileOutputStream);
                                } catch (Exception unused2) {
                                    fileOutputStream2 = fileOutputStream;
                                    C78685UuP.LJJLIIIJLLLLLLLZ(fileOutputStream2);
                                    this.LIZJ = decode;
                                    this.LIZLLL = System.currentTimeMillis();
                                    F9J.LIZIZ(C78248UnM.LJLJJI, 0, "dict_interval").edit().putLong("dict_interval", this.LIZLLL).putString("dict_version", this.LJ).commit();
                                    return this.LIZJ;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream2 = fileOutputStream;
                                    C78685UuP.LJJLIIIJLLLLLLLZ(fileOutputStream2);
                                    throw th;
                                }
                            }
                            this.LIZJ = decode;
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    this.LIZLLL = System.currentTimeMillis();
                    F9J.LIZIZ(C78248UnM.LJLJJI, 0, "dict_interval").edit().putLong("dict_interval", this.LIZLLL).putString("dict_version", this.LJ).commit();
                }
                return this.LIZJ;
            }

            @Override // X.PAO
            public final void LIZ(String str) {
                this.LIZ = a1.LJ("https://", str, "/monitor/collect/zstd_dict/");
            }
        };
    }
}
