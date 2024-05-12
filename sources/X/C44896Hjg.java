package X;

import android.os.Bundle;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44896Hjg implements InterfaceC43172Gwy {
    public static boolean LIZIZ;
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static Aweme LJI;
    public static String LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static C43170Gww LJIILL;
    public static C42593Gnd LJIILLIIL;
    public static boolean LJIJJLI;
    public static final C44896Hjg LIZ = new C44896Hjg();
    public static String LIZJ = "";
    public static final java.util.Set<Integer> LJIIJ = new HashSet();
    public static java.util.Set<String> LJIIJJI = new HashSet();
    public static java.util.Set<String> LJIIL = new HashSet();
    public static java.util.Set<String> LJIILIIL = new HashSet();
    public static java.util.Set<String> LJIILJJIL = new HashSet();
    public static int LJIIZILJ = -1;
    public static int LJIJ = -1;
    public static String LJIJI = "";
    public static String LJIJJ = "";
    public static Bundle LJIL = new Bundle();

    public static void LJI() {
        LIZIZ = false;
        C44938HkM.LIZIZ = false;
        LJ = false;
        LJFF = false;
        LJI = null;
        LJIIIZ = ((HashSet) LJIILIIL).size();
        LJIIJJI = new HashSet();
        LJIIL = new HashSet();
        LJIILJJIL = new HashSet();
        LJII = null;
        LJIIIIZZ = 0;
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
        LJIILIIL(null);
    }

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LJ(android.net.Uri uri) {
    }

    public static void LJIIIZ() {
        if (!LIZIZ) {
            return;
        }
        if (o.LJ(LJIJJ, "long_press_download")) {
            C45441HsT.LIZIZ(LJI, "mask", LJII, LJIIIZ);
        } else {
            C45441HsT.LIZIZ(LJI, C44938HkM.LJIIIIZZ, LJII, LJIIIZ);
        }
        String str = LJIJI;
        C225298sn.LIZ(LJIIIZ, 1, LJI, str);
        Aweme aweme = LJI;
        if (aweme != null) {
            C4LD.LIZIZ.LJJIJIIJIL(aweme, LJIJI, LIZLLL, LJIIIZ);
        }
    }

    public final void LJIIL() {
        String str = LJII;
        if (str != null && str.length() > 0) {
            ((HashSet) LJIILIIL).add(str);
        }
        if (!LJIIJJI.isEmpty()) {
            LJIILL();
            return;
        }
        Aweme aweme = LJI;
        if (aweme != null) {
            LJIIJ(C45382HrW.LIZ(5, aweme, 0, 0, LJIL, 12), true);
            LJIIIZ();
            C225298sn.LIZIZ(LJI, LJIIIZ, LJIIJ);
        }
        LJI();
    }

    public final void LJIILL() {
        C42593Gnd c42593Gnd;
        if (LJI != null && (c42593Gnd = LJIILLIIL) != null && (!LJIIJJI.isEmpty())) {
            LIZIZ = true;
            String str = (String) ORZ.LJLLILLLL(LJIIJJI);
            LJII = str;
            LJIIJJI.remove(str);
            C43170Gww c43170Gww = LJIILL;
            if (c43170Gww != null) {
                c43170Gww.LIZ(str, this, c42593Gnd);
            }
        }
    }

    public static void LJFF() {
        LJI();
        LJIILL = null;
        LJIILLIIL = null;
        LJIILIIL = new HashSet();
        LJIIIZ = 0;
    }

    @Override // X.InterfaceC43172Gwy
    public final void onCancel() {
        LJIIIZ();
        C225298sn.LIZIZ(LJI, LJIIIZ, LJIIJ);
        LJFF();
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        LJIIL();
    }

    public static boolean LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (!AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableSaveOwnVideoWithoutWatermask() || !C025908h.LJFF(false, aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI(int i) {
        if (LJFF) {
            return;
        }
        int size = (i / LJIIIZ) + (((HashSet) LJIIL).size() * (100 / LJIIIZ));
        Aweme aweme = LJI;
        if (aweme != null) {
            LJIIJ(C45382HrW.LIZ(2, aweme, size, 0, LJIL, 8), true);
        }
    }

    public static void LJIILIIL(DownloadInfo downloadInfo) {
        if (!LJ) {
            LJ = true;
            Aweme aweme = LJI;
            if (aweme != null) {
                if (downloadInfo != null) {
                    LJIIIIZZ = downloadInfo.getId();
                }
                LJIIJ(C45382HrW.LIZ(1, aweme, 0, 0, LJIL, 12), true);
            }
        }
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        LJIILJJIL(str, true, null);
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZLLL(DownloadInfo downloadInfo) {
        LJIILIIL(downloadInfo);
    }

    @Override // X.InterfaceC43172Gwy
    public final void onProgress(int i) {
        LJIIJJI(i);
    }

    public static void LJIIJ(C45382HrW status, boolean z) {
        o.LJIIIZ(status, "status");
        if (z) {
            C57082Lw.LIZ.LIZJ("video_download_status").postValue(status);
        }
    }

    public final void LJIILJJIL(String str, boolean z, InterfaceC43172Gwy interfaceC43172Gwy) {
        if (LJFF) {
            LJFF();
            return;
        }
        String str2 = LJII;
        if (str2 != null && str2.length() > 0) {
            ((HashSet) LJIIL).add(str2);
        }
        if (str != null && str.length() > 0) {
            ((HashSet) LJIILJJIL).add(str);
        }
        if (!LJIIJJI.isEmpty()) {
            LJIILL();
            return;
        }
        LJIIIZ();
        if (!((HashSet) LJIILIIL).isEmpty()) {
            Aweme aweme = LJI;
            if (aweme != null) {
                LJIIJ(C45382HrW.LIZ(5, aweme, 0, 0, LJIL, 12), true);
            }
            C225298sn.LIZIZ(LJI, LJIIIZ, LJIIJ);
            LJI();
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C43173Gwz(z, interfaceC43172Gwy, true, null), 2);
    }

    public static void LJIIIIZZ(String enterFrom, String downloadMethod, C43170Gww downloadPhotoHandler, Aweme aweme, java.util.Set set, C42593Gnd c42593Gnd, InterfaceC88472Yns interfaceC88472Yns, int i) {
        String LIZIZ2;
        C42593Gnd c42593Gnd2;
        ACLCommonShare aCLCommonShare;
        C44896Hjg c44896Hjg = LIZ;
        if ((i & 128) != 0) {
            interfaceC88472Yns = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(downloadPhotoHandler, "downloadPhotoHandler");
        o.LJIIIZ(aweme, "aweme");
        if (C44938HkM.LIZIZ()) {
            return;
        }
        C44938HkM.LIZIZ = true;
        C44938HkM.LJFF = aweme;
        LJFF();
        LJIJI = enterFrom;
        LJIJJ = downloadMethod;
        LJI = aweme;
        LJIILL = downloadPhotoHandler;
        LJIILLIIL = c42593Gnd;
        if (LJII(aweme) && (c42593Gnd2 = LJIILLIIL) != null && (aCLCommonShare = c42593Gnd2.LIZ) != null) {
            aCLCommonShare.setTranscode(1);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            C43170Gww c43170Gww = LJIILL;
            if (c43170Gww != null && (LIZIZ2 = c43170Gww.LIZIZ(aweme, intValue, c42593Gnd)) != null && LIZIZ2.length() > 0) {
                LJIIJJI.add(LIZIZ2);
            }
            java.util.Set<Integer> set2 = LJIIJ;
            if (set2 != null) {
                ((HashSet) set2).add(Integer.valueOf(intValue + 1));
            }
        }
        LJIIIZ = LJIIJJI.size();
        c44896Hjg.LJIILL();
        C42593Gnd c42593Gnd3 = LJIILLIIL;
        if (c42593Gnd3 != null && interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c42593Gnd3);
        }
        if (!LIZIZ) {
            return;
        }
        C225298sn.LIZJ(LJIIIZ, 1, LJI);
    }
}
