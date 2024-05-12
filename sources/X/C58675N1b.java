package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.cct.AdCCTLogModel;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import kotlin.jvm.internal.AqS176S0100000_10;

/* renamed from: X.N1b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58675N1b extends C17J {
    public final /* synthetic */ OpenCCTUtils LJLJLJ;

    public C58675N1b(OpenCCTUtils openCCTUtils) {
        this.LJLJLJ = openCCTUtils;
    }

    @Override // X.C17J
    public final void LJJJIL(int i, Bundle bundle) {
        Long actInternalTime;
        String str = "";
        switch (i) {
            case 1:
                IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
                if (LJIILIIL != null) {
                    LJIILIIL.LJIIJ();
                }
                OpenCCTUtils openCCTUtils = this.LJLJLJ;
                if (openCCTUtils.LJII == 0) {
                    openCCTUtils.LJII = System.currentTimeMillis() - this.LJLJLJ.LJ;
                }
                OpenCCTUtils openCCTUtils2 = this.LJLJLJ;
                openCCTUtils2.LJIIJJI = false;
                if (openCCTUtils2.LJIIIIZZ) {
                    if (!openCCTUtils2.LJIIIZ) {
                        openCCTUtils2.LJIIIZ = true;
                    } else {
                        AdACTEventLoger adACTEventLoger = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils2.LJIJJ, openCCTUtils2.LJIJI, openCCTUtils2.LJIJJLI)});
                        C58685N1l.LIZ.getClass();
                        C58653N0f c58653N0f = C58685N1l.LJIJJLI;
                        OpenCCTUtils openCCTUtils3 = this.LJLJLJ;
                        String str2 = openCCTUtils3.LJIILIIL;
                        if (str2 == null) {
                            str2 = "";
                        }
                        adACTEventLoger.LIZJ(c58653N0f, str2, openCCTUtils3.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils3, 262));
                        this.LJLJLJ.LJIIIIZZ = false;
                        Keva.getRepo("chrome_custom_tab_repo").storeBoolean("isSuccess", true);
                    }
                }
                this.LJLJLJ.LIZLLL = System.currentTimeMillis();
                OpenCCTUtils openCCTUtils4 = this.LJLJLJ;
                AdACTEventLoger adACTEventLoger2 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils4.LJIJJ, openCCTUtils4.LJIJI, openCCTUtils4.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f2 = C58685N1l.LJJ;
                OpenCCTUtils openCCTUtils5 = this.LJLJLJ;
                String str3 = openCCTUtils5.LJIILIIL;
                if (str3 != null) {
                    str = str3;
                }
                adACTEventLoger2.LIZJ(c58653N0f2, str, openCCTUtils5.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils5, 263));
                return;
            case 2:
                OpenCCTUtils openCCTUtils6 = this.LJLJLJ;
                openCCTUtils6.LJIIJJI = true;
                AdACTEventLoger adACTEventLoger3 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils6.LJIJJ, openCCTUtils6.LJIJI, openCCTUtils6.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f3 = C58685N1l.LJJI;
                OpenCCTUtils openCCTUtils7 = this.LJLJLJ;
                String str4 = openCCTUtils7.LJIILIIL;
                if (str4 != null) {
                    str = str4;
                }
                adACTEventLoger3.LIZJ(c58653N0f3, str, openCCTUtils7.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils7, 264));
                OpenCCTUtils openCCTUtils8 = this.LJLJLJ;
                if (openCCTUtils8.LJIIL != 1) {
                    return;
                }
                openCCTUtils8.LJIIL = 0;
                return;
            case 3:
                OpenCCTUtils openCCTUtils9 = this.LJLJLJ;
                openCCTUtils9.LJIIJJI = true;
                AdACTEventLoger adACTEventLoger4 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils9.LJIJJ, openCCTUtils9.LJIJI, openCCTUtils9.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f4 = C58685N1l.LJJIII;
                OpenCCTUtils openCCTUtils10 = this.LJLJLJ;
                String str5 = openCCTUtils10.LJIILIIL;
                if (str5 != null) {
                    str = str5;
                }
                adACTEventLoger4.LIZJ(c58653N0f4, str, openCCTUtils10.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils10, 267));
                OpenCCTUtils openCCTUtils11 = this.LJLJLJ;
                if (openCCTUtils11.LJIIL != 1) {
                    return;
                }
                openCCTUtils11.LJIIL = 0;
                return;
            case 4:
                OpenCCTUtils openCCTUtils12 = this.LJLJLJ;
                AdACTEventLoger adACTEventLoger5 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils12.LJIJJ, openCCTUtils12.LJIJI, openCCTUtils12.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f5 = C58685N1l.LJJIIJ;
                OpenCCTUtils openCCTUtils13 = this.LJLJLJ;
                String str6 = openCCTUtils13.LJIILIIL;
                if (str6 != null) {
                    str = str6;
                }
                adACTEventLoger5.LIZJ(c58653N0f5, str, openCCTUtils13.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils13, 261));
                return;
            case 5:
                Keva.getRepo("chrome_custom_tab_repo").storeLong("openCCTLastTime", System.currentTimeMillis());
                OpenCCTUtils openCCTUtils14 = this.LJLJLJ;
                String str7 = openCCTUtils14.LJIILIIL;
                if (str7 == null) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                openCCTUtils14.LJIJ = str7;
                BrowserConfig browserConfig = openCCTUtils14.LJIIZILJ;
                if (browserConfig != null && (actInternalTime = browserConfig.getActInternalTime()) != null && actInternalTime.longValue() > 0) {
                    C2U8.LIZ(new C55386LoU());
                }
                OpenCCTUtils openCCTUtils15 = this.LJLJLJ;
                openCCTUtils15.LJIIL = 1;
                long currentTimeMillis = System.currentTimeMillis();
                OpenCCTUtils openCCTUtils16 = this.LJLJLJ;
                openCCTUtils15.LJI = currentTimeMillis - openCCTUtils16.LJFF;
                openCCTUtils16.LJ = System.currentTimeMillis();
                OpenCCTUtils openCCTUtils17 = this.LJLJLJ;
                AdACTEventLoger adACTEventLoger6 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils17.LJIJJ, openCCTUtils17.LJIJI, openCCTUtils17.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f6 = C58685N1l.LJIIZILJ;
                OpenCCTUtils openCCTUtils18 = this.LJLJLJ;
                String str8 = openCCTUtils18.LJIILIIL;
                if (str8 == null) {
                    str8 = "";
                }
                adACTEventLoger6.LIZJ(c58653N0f6, str8, openCCTUtils18.LJIILJJIL, null, C58676N1c.LJLIL);
                OpenCCTUtils openCCTUtils19 = this.LJLJLJ;
                AdACTEventLoger adACTEventLoger7 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils19.LJIJJ, openCCTUtils19.LJIJI, openCCTUtils19.LJIJJLI)});
                C58653N0f c58653N0f7 = C58685N1l.LJIJ;
                OpenCCTUtils openCCTUtils20 = this.LJLJLJ;
                String str9 = openCCTUtils20.LJIILIIL;
                if (str9 != null) {
                    str = str9;
                }
                adACTEventLoger7.LIZJ(c58653N0f7, str, openCCTUtils20.LJIILJJIL, null, C58674N1a.LJLIL);
                return;
            case 6:
                IClientSecurityService LJIILIIL2 = ClientSecurityServiceImpl.LJIILIIL();
                if (LJIILIIL2 != null) {
                    LJIILIIL2.LJII();
                }
                OpenCCTUtils openCCTUtils21 = this.LJLJLJ;
                AdACTEventLoger adACTEventLoger8 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils21.LJIJJ, openCCTUtils21.LJIJI, openCCTUtils21.LJIJJLI)});
                C58685N1l.LIZ.getClass();
                C58653N0f c58653N0f8 = C58685N1l.LJJIFFI;
                OpenCCTUtils openCCTUtils22 = this.LJLJLJ;
                String str10 = openCCTUtils22.LJIILIIL;
                if (str10 == null) {
                    str10 = "";
                }
                adACTEventLoger8.LIZJ(c58653N0f8, str10, openCCTUtils22.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils22, 265));
                OpenCCTUtils openCCTUtils23 = this.LJLJLJ;
                if (!openCCTUtils23.LJIIJJI) {
                    AdACTEventLoger adACTEventLoger9 = new AdACTEventLoger(new Object[]{new AdCCTLogModel(openCCTUtils23.LJIJJ, openCCTUtils23.LJIJI, openCCTUtils23.LJIJJLI)});
                    C58653N0f c58653N0f9 = C58685N1l.LJJII;
                    OpenCCTUtils openCCTUtils24 = this.LJLJLJ;
                    String str11 = openCCTUtils24.LJIILIIL;
                    if (str11 != null) {
                        str = str11;
                    }
                    adACTEventLoger9.LIZJ(c58653N0f9, str, openCCTUtils24.LJIILJJIL, null, new AqS176S0100000_10(openCCTUtils24, 266));
                }
                this.LJLJLJ.LJIIL = 1;
                return;
            default:
                return;
        }
    }
}
