package com.ss.android.ugc.aweme.ad.preload;

import X.C2060386t;
import X.C38995FSd;
import X.C43588H8u;
import X.C58096Mr6;
import X.C58909NAb;
import X.C59086NGw;
import X.C74092vV;
import X.C74102vW;
import X.C74112vX;
import X.C78857UxB;
import X.C78983UzD;
import X.NH3;
import X.NJP;
import Y.ARunnableS11S1100000_10;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes11.dex */
public final class AdLandPagePreloadServiceImpl implements IAdLandPagePreloadService {
    public final String LIZ = "\"/** adInfo **/\"";
    public final String LIZIZ = "\"/** first_page **/\"";
    public final String LIZJ = "\"/** ix_to_externalurl **/\"";
    public final String LIZLLL = "/** session_id **/";
    public final String LJ = "/** refer **/";
    public final String LJFF = "\"/** web_init_time **/\"";
    public final String LJI = "\"/** scene_state **/\"";
    public final String LJII = "\"/** landing_page_style **/\"";
    public final String LJIIIIZZ = "\"/** is_web_url **/\"";
    public final String LJIIIZ = "/** web_url **/";
    public final String LJIIJ = "\"/** preload_status **/\"";
    public final String LJIIJJI = "/** channel_name **/";
    public final String LJIIL = "\"/** preload_h5_type **/\"";
    public final String LJIILIIL = "preload_land_page_analytics";
    public final String LJIILJJIL = "preload_land_page_analytics_url";
    public String LJIILL = "";
    public final String LJIILLIIL = "";
    public final Keva LJIIZILJ = Keva.getRepo("commercial_preload_land_page_name");

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final boolean LJIIJJI() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_ad_geckox_cache_config", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJIJ() {
    }

    public static IAdLandPagePreloadService LJJI() {
        Object LIZ = C58096Mr6.LIZ(IAdLandPagePreloadService.class, false);
        if (LIZ != null) {
            return (IAdLandPagePreloadService) LIZ;
        }
        if (C58096Mr6.LLD == null) {
            synchronized (IAdLandPagePreloadService.class) {
                if (C58096Mr6.LLD == null) {
                    C58096Mr6.LLD = new AdLandPagePreloadServiceImpl();
                }
            }
        }
        return C58096Mr6.LLD;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LIZIZ() {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() != null) {
            NJP.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LJIIZILJ() {
        return C59086NGw.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LJIJJLI() {
        return this.LJIILLIIL;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject LIZ(String str) {
        if (str != null) {
            o.LJJJJJL(str);
        }
        C74092vV c74092vV = (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str);
        if (c74092vV != null) {
            return c74092vV.LIZIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LIZLLL(Long l) {
        return "lynx_h5_" + l + '_';
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int LJ(String str) {
        C74092vV c74092vV;
        Integer num;
        if (o.LJJJJJL(str) || (c74092vV = (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str)) == null || (num = c74092vV.LIZLLL) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJFF(AwemeRawAd awemeRawAd) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() != null) {
            NJP.LJII(awemeRawAd);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        return X.NU7.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r3.equals("a1a15b782e3ee8a25247561a91a99835") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        X.C58909NAb.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (X.NH3.LIZJ() == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return X.NU7.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r3.equals("3d7abe67f93fd5525385b2d8792fafaa") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r3.equals("0da04670c45fcb4f5dee6049f06a9d77") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.equals("f7c98296e166e48f682216480ab62358") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        X.C58909NAb.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (X.NH3.LIZJ() == null) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(java.lang.String r3) {
        /*
            r2 = this;
            r1 = 40
            if (r3 == 0) goto Lb
            int r0 = r3.hashCode()
            switch(r0) {
                case -1976134561: goto L36;
                case -1411088883: goto L2d;
                case -104239079: goto L24;
                case 1713381051: goto L1b;
                default: goto Lb;
            }
        Lb:
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NGv r0 = X.NH3.LIZJ()
            if (r0 == 0) goto L1a
            int r1 = X.NU7.LIZ()
        L1a:
            return r1
        L1b:
            java.lang.String r0 = "f7c98296e166e48f682216480ab62358"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            goto Lb
        L24:
            java.lang.String r0 = "a1a15b782e3ee8a25247561a91a99835"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto Lb
        L2d:
            java.lang.String r0 = "3d7abe67f93fd5525385b2d8792fafaa"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            goto Lb
        L36:
            java.lang.String r0 = "0da04670c45fcb4f5dee6049f06a9d77"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto Lb
        L3f:
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NGv r0 = X.NH3.LIZJ()
            if (r0 == 0) goto L4e
            int r1 = X.NU7.LIZIZ()
        L4e:
            return r1
        L4f:
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NGv r0 = X.NH3.LIZJ()
            if (r0 == 0) goto L5e
            int r1 = X.NU7.LJIJI()
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJII(java.lang.String):int");
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject LJIIJ(String str) {
        return C74102vW.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LJIIL(String scene) {
        kotlin.jvm.internal.o.LJIIIZ(scene, "scene");
        switch (scene.hashCode()) {
            case -1243020381:
                if (!scene.equals("global")) {
                    return null;
                }
                return LJIIZILJ();
            case -895866265:
                if (!scene.equals("splash")) {
                    return null;
                }
                return "3d7abe67f93fd5525385b2d8792fafaa";
            case 3138974:
                if (!scene.equals("feed")) {
                    return null;
                }
                return "cca47107bfcbdb211d88f3385aeede40";
            case 862628038:
                if (!scene.equals("lynx_feed")) {
                    return null;
                }
                return "a1a15b782e3ee8a25247561a91a99835";
            case 1856444385:
                if (!scene.equals("flutter_feed")) {
                    return null;
                }
                return "";
            case 2012743738:
                if (!scene.equals("dynamic_ad_feed")) {
                    return null;
                }
                return "a20813e75cff1b482e289722d8e7422b";
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final C74092vV LJIILJJIL(String str) {
        if (str != null) {
            o.LJJJJJL(str);
        }
        return (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject LJIILL(String str) {
        boolean z;
        C74092vV c74092vV;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (c74092vV = (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str)) == null) {
            return null;
        }
        return c74092vV.LJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LJIILLIIL(Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return this.LJIIZILJ.getString(String.valueOf(l), "");
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final int LJIJI(String str) {
        C74092vV c74092vV;
        Integer num;
        if (o.LJJJJJL(str) || (c74092vV = (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str)) == null || (num = c74092vV.LJFF) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final JSONObject LJIJJ(String str) {
        boolean z;
        C74092vV c74092vV;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (c74092vV = (C74092vV) ((LinkedHashMap) C74102vW.LIZ).get(str)) == null) {
            return null;
        }
        return c74092vV.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJIL(String str) {
        if (!C2060386t.LIZ(str)) {
            C74112vX.LIZJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJJ(String str) {
        if (C2060386t.LIZ(str)) {
            return;
        }
        if (kotlin.jvm.internal.o.LJ(str, this.LJIIZILJ.getString(this.LJIILJJIL, ""))) {
            this.LJIILL = this.LJIIZILJ.getString(this.LJIILIIL, "");
        }
        if (C78857UxB.LJJJIL(this.LJIILL)) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS11S1100000_10(this, str, 5));
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final void LJIIIZ(Long l, String str) {
        if (l == null || l.longValue() <= 0 || C2060386t.LIZ(str)) {
            return;
        }
        this.LJIIZILJ.storeString(String.valueOf(l), str);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final long LJIILIIL(long j, long j2) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZIZ() != null) {
            return NJP.LJIIIIZZ(j, j2);
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService
    public final String LIZJ(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3) {
        String str11;
        String str12 = str3;
        String str13 = str2;
        String str14 = str9;
        String str15 = str4;
        String str16 = str8;
        C43588H8u.LIZLLL(str, "adInfo", str5, "sceneState", str6, "landingPageStyle", str7, "isWebUrl");
        String str17 = "";
        if (C2060386t.LIZ(this.LJIILL)) {
            str11 = this.LJIIZILJ.getString(this.LJIILIIL, "");
        } else {
            str11 = this.LJIILL;
        }
        if (str11 == null || str11.length() == 0) {
            return null;
        }
        String LJJJJZ = o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(str11, this.LIZ, str, true), this.LIZIZ, String.valueOf(i), true), this.LIZJ, String.valueOf(i2), true);
        String str18 = this.LIZLLL;
        if (str13 == null) {
            str13 = "";
        }
        String LJJJJZ2 = o.LJJJJZ(LJJJJZ, str18, str13, true);
        String str19 = this.LJ;
        if (str12 == null) {
            str12 = "";
        }
        String LJJJJZ3 = o.LJJJJZ(LJJJJZ2, str19, str12, true);
        String str20 = this.LJFF;
        if (str15 == null) {
            str15 = "";
        }
        String LJJJJZ4 = o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(LJJJJZ3, str20, str15, true), this.LJI, str5, true), this.LJII, str6, true), this.LJIIIIZZ, str7, true);
        String str21 = this.LJIIIZ;
        if (str16 == null) {
            str16 = "";
        }
        String LJJJJZ5 = o.LJJJJZ(LJJJJZ4, str21, str16, true);
        String str22 = this.LJIIJ;
        if (str14 == null) {
            str14 = "";
        }
        String LJJJJZ6 = o.LJJJJZ(LJJJJZ5, str22, str14, true);
        String str23 = this.LJIIJJI;
        if (str10 != null) {
            str17 = str10;
        }
        return o.LJJJJZ(o.LJJJJZ(LJJJJZ6, str23, str17, true), this.LJIIL, String.valueOf(i3), true);
    }
}
