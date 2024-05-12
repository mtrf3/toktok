package com.ss.android.ugc.aweme.image;

import X.AbstractC61742OLa;
import X.C00F;
import X.C19N;
import X.C208508Gg;
import X.C208518Gh;
import X.C37207Eix;
import X.C66580QBc;
import X.C81731W5v;
import X.C81814W9a;
import X.C8I5;
import X.EF7;
import X.HK5;
import X.InterfaceC72547Sdb;
import X.L12;
import X.OLZ;
import X.ORS;
import X.OSZ;
import X.QG9;
import X.QGA;
import X.QGO;
import X.SIR;
import X.WBG;
import X.WE8;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.librarian.Librarian;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.image.LightenConfigOutService;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class LightenConfigOutService implements ILightenConfigOutService {
    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Integer LJIILL() {
        return 5;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Integer LJJII() {
        return 1;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final void isLocalTest() {
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LIZJ() {
        return C19N.LJ("tt_lighten_downgrade_async", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final WBG LIZLLL() {
        return new WBG() { // from class: X.WAk
            @Override // X.WBG
            public final void loadLibrary(String str) {
                Librarian.LJ(str);
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final QGO LJ() {
        if (C19N.LJ("tt_lighten_enable_auto_biz_tag", true)) {
            return new QGO() { // from class: X.WB8
                @Override // X.QGO
                public final String LIZ() {
                    return C12460eI.LJFF();
                }
            };
        }
        return null;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJFF() {
        return 0L;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final String[] LJIIIZ() {
        ArrayList arrayList = new ArrayList();
        ORS.LJJLIIIJJIZ(arrayList, C37207Eix.LIZ);
        if (HK5.LIZIZ) {
            arrayList.addAll(HK5.LIZ);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final SIR LJIIJ() {
        return new SIR() { // from class: X.WFM
            @Override // X.SIR
            public final /* synthetic */ void LIZ(JSONObject jSONObject) {
            }

            @Override // X.SIR
            public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
                ImageCropConfig imageCropConfig;
                int optInt;
                int optInt2;
                LightenConfigOutService.this.getClass();
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
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final int LJIIJJI() {
        return C00F.LIZ(31744, 0, "tt_bitmap_pool_max_pool_size", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final WE8 LJIIL() {
        return new C81731W5v();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final List<C208518Gh> LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C208508Gg.LIZLLL);
        return arrayList;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final InterfaceC72547Sdb LJIILJJIL() {
        return new InterfaceC72547Sdb() { // from class: X.SW4
            @Override // X.InterfaceC72547Sdb
            public final long LIZ() {
                return NetworkService.LJI().LIZ();
            }
        };
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJIJI() {
        return 0L;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJIJJLI() {
        return C19N.LJ("tt_lighten_downgrade_cancellable", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIL() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJ() {
        return C19N.LJ("lighten_fix_bitmap_memory_anr_switch", false);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIFFI() {
        return C19N.LJ("tt_lighten_enable_fix_invalid_request", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIII() {
        return C19N.LJ("tt_lighten_enable_low_res", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final AbstractC61742OLa LJJIIZI() {
        return new OLZ();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Map<String, Long> LJJIJ() {
        HashMap hashMap = new HashMap();
        if (C8I5.LIZ()) {
            hashMap.put("profile_post_img", 41943040L);
        }
        if (L12.LIZIZ()) {
            hashMap.put("qrcode_cache_img", 2097152L);
        }
        if (HK5.LIZIZ) {
            for (OSZ<String, Long> osz : IMService.createIIMServicebyMonsterPlugin(false).getImImageService().LIZ()) {
                hashMap.put(osz.getFirst(), osz.getSecond());
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Long LJJIJIL() {
        return 0L;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIJL() {
        return C19N.LJ("tt_lighten_url_expire_check", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIJLIJ() {
        return C19N.LJ("lighten_attach_bug_fix_switch", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final boolean LJJIL() {
        return C19N.LJ("tt_lighten_enable_force_run_in_sub_thread", true);
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final C81814W9a LJI() {
        return C81814W9a.LJIIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r2 < 10485760) goto L7;
     */
    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long LJIJ() {
        /*
            r6 = this;
            java.io.File r1 = X.C66580QBc.LJIILIIL()
            boolean r0 = X.P8H.LJIIJJI()
            r4 = 20971520(0x1400000, double:1.03613076E-316)
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L27
            long r2 = r1.getFreeSpace()
            r0 = 8
            long r2 = r2 / r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1f
        L1a:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        L1f:
            r4 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto L1a
        L27:
            r2 = 20971520(0x1400000, double:1.03613076E-316)
        L2a:
            r4 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.image.LightenConfigOutService.LJIJ():java.lang.Long");
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final String LJJI() {
        return EF7.LIZIZ().getPackageName();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final File LJJIIJZLJL() {
        return C66580QBc.LJIILIIL();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Context getContext() {
        return EF7.LIZIZ();
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Bitmap.Config LIZ() {
        return Bitmap.Config.RGB_565;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LIZIZ() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJII() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final QGA LJIIIIZZ() {
        return QG9.LIZ;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIILLIIL() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIIZILJ() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJIJJ() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIIJ() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIIZ() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIJIIJI() {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
    public final Boolean LJJIJIIJIL() {
        return Boolean.TRUE;
    }
}
