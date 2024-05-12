package X;

import android.text.TextUtils;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F3I implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL = null;
    public final /* synthetic */ String LJLJL = null;
    public final /* synthetic */ F3J LJLJLJ;

    public final void LIZ() {
        File file;
        int optInt;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        String str3 = this.LJLJI;
        String str4 = this.LJLJJI;
        String str5 = this.LJLJJL;
        JSONObject jSONObject = this.LJLJJLL;
        String str6 = this.LJLJL;
        F3J f3j = this.LJLJLJ;
        File file2 = null;
        String jSONObject2 = null;
        File file3 = null;
        try {
            try {
                IHttpService iHttpService = (IHttpService) C171096nZ.LIZ(IHttpService.class);
                if (iHttpService == null) {
                    iHttpService = new DefaultHttpServiceImpl();
                }
                InterfaceC36632EZg buildMultipartUpload = iHttpService.buildMultipartUpload(UCH.LJLJJLL, "UTF-8", false);
                buildMultipartUpload.LIZ("aid", str);
                buildMultipartUpload.LIZ("os", "Android");
                buildMultipartUpload.LIZ("update_version_code", str2);
                buildMultipartUpload.LIZ("channel", str3);
                buildMultipartUpload.LIZ("release_build", str4);
                if (!TextUtils.isEmpty(str6)) {
                    buildMultipartUpload.LIZ("device_id", str6);
                }
                buildMultipartUpload.LIZ("monitor_version", "5.0.20.1-rc.121-ttp");
                File file4 = new File(str5);
                if (file4.exists()) {
                    String parent = file4.getParent();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C38975FRj.LIZJ(file4));
                    LIZ.append(".zip");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(parent);
                    LIZ2.append("/");
                    LIZ2.append(LIZIZ);
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    C38975FRj.LIZIZ(LIZIZ2, str5);
                    file = new File(LIZIZ2);
                    try {
                        buildMultipartUpload.LIZJ(file.getName(), file, new HashMap());
                    } catch (IOException e) {
                        e = e;
                        file3 = file;
                        if (f3j != null) {
                            f3j.LIZ(e.getMessage());
                        }
                        if (file3 != null) {
                            try {
                                C16880lQ.LLLZZIL(file3);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (f3j == null) {
                                    return;
                                }
                                f3j.LIZ(th.getMessage());
                            }
                        }
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        file2 = file;
                        if (f3j != null) {
                            f3j.LIZ(e.getMessage());
                        }
                        if (file2 != null) {
                            try {
                                C16880lQ.LLLZZIL(file2);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (f3j == null) {
                                    return;
                                }
                                f3j.LIZ(th.getMessage());
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (file != null) {
                            try {
                                C16880lQ.LLLZZIL(file);
                            } catch (Throwable th4) {
                                if (f3j != null) {
                                    f3j.LIZ(th4.getMessage());
                                }
                            }
                        }
                        throw th;
                    }
                } else {
                    file = null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("filetype", "common_params");
                hashMap.put("logtype", "env");
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.toString();
                }
                if (TextUtils.isEmpty(jSONObject2)) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("defaultData", "none commonParams");
                    } catch (JSONException unused) {
                    }
                    jSONObject2 = jSONObject3.toString();
                }
                buildMultipartUpload.LIZIZ(jSONObject2, hashMap);
                String str7 = new String(buildMultipartUpload.finish().LIZJ);
                try {
                    optInt = new JSONObject(str7).optInt("errno", -1);
                } catch (JSONException e3) {
                    if (f3j != null) {
                        f3j.LIZ(e3.getMessage());
                    }
                }
                if (f3j != null) {
                    if (optInt == 200) {
                        f3j.onSuccess();
                    }
                    f3j.LIZ(str7);
                }
                if (file != null) {
                    try {
                        C16880lQ.LLLZZIL(file);
                    } catch (Throwable th5) {
                        th = th5;
                        if (f3j == null) {
                            return;
                        }
                        f3j.LIZ(th.getMessage());
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                file = null;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
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

    public F3I(String str, String str2, String str3, String str4, String str5, F3L f3l) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJLJ = f3l;
    }
}
