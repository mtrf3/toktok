package X;

import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import defpackage.i0;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wea, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82800Wea {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LIZIZ() {
        String str;
        if (HS4.LIZ()) {
            str = "_v2";
        } else {
            str = "";
        }
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        EnumC43651HBf enumC43651HBf = EnumC43651HBf.ANCHOR;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("editor_pro/guide");
        LIZ2.append(str);
        return LJ.LJIILJJIL(enumC43651HBf, X1D.LIZIZ(LIZ2));
    }

    public static int LIZ(String func, String url, InterfaceC65784Pro unZipFailed, InterfaceC88472Yns unZipSucceed) {
        o.LJIIIZ(func, "func");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(unZipFailed, "unZipFailed");
        o.LJIIIZ(unZipSucceed, "unZipSucceed");
        String LIZIZ2 = LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ2);
        String LIZIZ3 = C025908h.LIZIZ(LIZ2, File.separator, func, ".zip", LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("EPAnchor -> video path=");
        LIZ3.append(LIZIZ3);
        H7B.LIZ(X1D.LIZIZ(LIZ3));
        if (C44687HgJ.LIZIZ(LIZIZ3)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZIZ2);
            LIZ4.append('/');
            LIZ4.append(func);
            unZipSucceed.invoke(X1D.LIZIZ(LIZ4));
            return -1;
        }
        LIZ = System.currentTimeMillis();
        WFD wfd = WFD.LIZ;
        X5R with = DownloadServiceImpl.LIZJ().with(url);
        with.LJ = LIZIZ2;
        with.LIZJ = i0.LJFF(func, ".zip");
        with.LJII = 3;
        with.LJIIJ = "editor_pro_anchor_guide";
        with.LJIJJ = true;
        with.LJJI = true;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ2);
        LIZ5.append('/');
        LIZ5.append(func);
        LIZ5.append('/');
        String LIZIZ4 = X1D.LIZIZ(LIZ5);
        W1G w1g = new W1G(unZipSucceed, LIZIZ3, LIZIZ2, func, unZipFailed, url);
        with.LJIILLIIL = true;
        with.LJIJ = LIZIZ4;
        with.LJIJI = w1g;
        with.LJIIZILJ = true;
        with.LJIIL = new C82801Web(func, url);
        with.LJIJJ = true;
        with.LJIILL = new DownloadMonitorDepend(wfd, new LinkedHashMap(), "editor_pro_anchor_guide", "editor_pro_anchor_guide_state");
        return with.LIZLLL(N33.ZIP);
    }

    public static void LIZJ(String anchorType, String videoUrl, boolean z, boolean z2, String str) {
        int value;
        o.LJIIIZ(anchorType, "anchorType");
        o.LJIIIZ(videoUrl, "videoUrl");
        EnumC1289754j[] values = EnumC1289754j.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                EnumC1289754j enumC1289754j = values[i];
                if (o.LJ(enumC1289754j.getType(), anchorType)) {
                    value = enumC1289754j.getValue();
                    break;
                }
                i++;
            } else {
                value = EnumC1289754j.GENERAL.getValue();
                break;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - LIZ;
        C188727au LIZJ = C0RN.LIZJ(z ? 1 : 0, "is_download", z2 ? 1 : 0, "success");
        LIZJ.LIZLLL(value, "anchorType");
        LIZJ.LJIIIZ("video_url", videoUrl);
        if (z) {
            LIZJ.LJ(currentTimeMillis, "duration");
        }
        if (!z2) {
            LIZJ.LJI("error_msg", str);
        }
        FMX.LJIIL("editor_pro_anchor_guide_state", LIZJ.LIZ);
    }
}
