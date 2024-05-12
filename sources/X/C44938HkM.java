package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HkM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44938HkM {
    public static final ArrayList<String> LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static Aweme LJ;
    public static Aweme LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static int LJIIIZ;
    public static final List<String> LJIIJ;
    public static String LJIIJJI;
    public static int LJIIL;
    public static String LJIILIIL;
    public static boolean LJIILJJIL;
    public static SharePackage LJIILL;
    public static Bundle LJIILLIIL;
    public static boolean LJIIZILJ;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        LIZ = arrayList;
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        arrayList.add("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity");
        LJIIJ = C47261Igj.LJJIJIIJI("download", "download_no_watermark");
        LJIIJJI = "";
        LJIIL = 1;
        LJIIZILJ = true;
    }

    public static boolean LIZ() {
        Aweme aweme = LJFF;
        if (aweme == null || LJ == null) {
            return false;
        }
        String aid = aweme.getAid();
        Aweme aweme2 = LJ;
        o.LJI(aweme2);
        return o.LJ(aid, aweme2.getAid());
    }

    public static final boolean LIZIZ() {
        return C4LD.LIZIZ.LJJJLIIL();
    }

    public static final boolean LIZLLL() {
        ShareDependService.LIZ.getClass();
        if (C44498HdG.LIZ().LJIILJJIL() || C54029LIj.LIZIZ.LJJI()) {
            return true;
        }
        return false;
    }

    public static boolean LJ() {
        String str = LJIIIIZZ;
        if (str != null) {
            List<String> list = LJIIJ;
            if (list.contains(str) && list.contains("download")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ() {
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 == null) {
            return false;
        }
        return LIZ.contains(LJIIIIZZ2.getLocalClassName());
    }

    public static void LJFF(C45382HrW currentDownloadVideoStatus, String enterFrom) {
        o.LJIIIZ(currentDownloadVideoStatus, "currentDownloadVideoStatus");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (LJ()) {
            C57082Lw.LIZ.LIZJ("video_download_status").postValue(currentDownloadVideoStatus);
        }
    }
}
