package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.W9b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81815W9b implements V21 {
    public volatile C81814W9a LIZ;

    public final C81814W9a LIZ() {
        long j;
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    QG2 qg2 = QG9.LIZ;
                    File LJIILIIL = C66580QBc.LJIILIIL();
                    long j2 = 20971520;
                    if (P8H.LJIIJJI()) {
                        if (LJIILIIL != null) {
                            j = LJIILIIL.getFreeSpace() / 8;
                            if (j <= 20971520) {
                                j2 = 10485760;
                                if (j < 10485760) {
                                }
                            }
                        } else {
                            j = 20971520;
                        }
                        j2 = j;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C208508Gg.LIZLLL);
                    C81816W9c c81816W9c = new C81816W9c(EF7.LIZIZ());
                    c81816W9c.LJIJ = true;
                    c81816W9c.LJIILJJIL = true;
                    c81816W9c.LJII = Bitmap.Config.RGB_565;
                    c81816W9c.LJIIIIZZ = 1;
                    c81816W9c.LJFF = 5;
                    c81816W9c.LJIILIIL = new C81731W5v();
                    c81816W9c.LIZJ = LJIILIIL;
                    c81816W9c.LIZLLL = j2;
                    c81816W9c.LIZIZ = qg2;
                    c81816W9c.LJIJJLI = false;
                    c81816W9c.LJIIJJI = true;
                    c81816W9c.LJI = new OLZ();
                    c81816W9c.LJIJI = arrayList;
                    c81816W9c.LJIIIZ = true;
                    c81816W9c.LJIIJ = false;
                    c81816W9c.LJIIL = new SIR() { // from class: X.WFL
                        @Override // X.SIR
                        public final /* synthetic */ void LIZ(JSONObject jSONObject) {
                        }

                        @Override // X.SIR
                        public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
                            ImageCropConfig imageCropConfig;
                            int optInt;
                            int optInt2;
                            C81815W9b.this.getClass();
                            if (z || (40 != (optInt2 = jSONObject.optInt("err_code")) && 41 != optInt2)) {
                                Y8H.LIZ.LIZ(jSONObject, z);
                            }
                            if (C64235PIx.LIZ("image_monitor_v2")) {
                                if (!z && (40 == (optInt = jSONObject.optInt("err_code")) || 41 == optInt)) {
                                    return;
                                }
                                String str2 = null;
                                boolean z2 = true;
                                try {
                                    FFL.LJIIIZ().getClass();
                                    imageCropConfig = (ImageCropConfig) FFL.LJIILLIIL(ImageCropConfig.class, "image_crop_config_v3", true);
                                } catch (Throwable unused) {
                                    imageCropConfig = null;
                                }
                                if (imageCropConfig == null) {
                                    z2 = false;
                                }
                                try {
                                    jSONObject.put("url_convert", z2);
                                } catch (JSONException e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                                String optString = jSONObject.optString("uri");
                                if (!TextUtils.isEmpty(optString)) {
                                    str2 = (String) ((HashMap) C72546Sda.LIZ).remove(optString);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        jSONObject.put("err_code", "42");
                                        jSONObject.put("err_desc", str2);
                                    } catch (JSONException e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                }
                                FUA.LIZJ("image_monitor_v2", jSONObject);
                            }
                        }
                    };
                    c81816W9c.LJIILL = true;
                    c81816W9c.LJIILLIIL = true;
                    c81816W9c.LJIIZILJ = C37207Eix.LIZ;
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "tt_image_oom_opt", true, false)) {
                        c81816W9c.LJJ = true;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        c81816W9c.LJIJJ = true;
                    }
                    this.LIZ = new C81814W9a(c81816W9c);
                }
            }
        }
        return this.LIZ;
    }
}
