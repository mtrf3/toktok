package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OF4 {
    public static volatile OIB LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static C61550ODq LIZLLL;
    public static List<String> LJ;
    public static int LJFF = -1;
    public static long LJI;

    public static void LIZJ() {
        try {
            if (LIZ != null) {
                return;
            }
            OIB oib = new OIB(LiveHostOuterService.LIZJ().LIZ());
            OIH oih = oib.LIZ;
            if (oih != null) {
                oih.LIZIZ = true;
            }
            oib.LIZIZ(C46104I7o.LJJIIJ());
            LIZ = oib;
        } catch (Exception e) {
            C0NB.LJII(e);
        }
    }

    public static void LIZLLL() {
        List arrayList;
        List<String> arrayList2;
        String str;
        String str2;
        int i;
        GeckoLiveGroupOpt LIZIZ2 = C28592BKa.LIZIZ();
        if (LIZIZ2 == null || !LIZIZ2.isEnable || LIZIZ || LIZJ || LIZLLL != null) {
            return;
        }
        if (C28592BKa.LIZ() <= 0) {
            arrayList = new ArrayList();
        } else {
            GeckoLiveGroupOpt LIZIZ3 = C28592BKa.LIZIZ();
            if (LIZIZ3 == null || (arrayList = LIZIZ3.channelList) == null) {
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<String> list = LJ;
        if (list == null || list.isEmpty()) {
            if (C28592BKa.LIZ() <= 0) {
                arrayList2 = new ArrayList<>();
            } else {
                GeckoLiveGroupOpt LIZIZ4 = C28592BKa.LIZIZ();
                if (LIZIZ4 == null || (arrayList2 = LIZIZ4.channelList) == null) {
                    arrayList2 = new ArrayList<>();
                }
            }
            LJ = arrayList2;
        }
        if (LJFF < 0) {
            GeckoLiveGroupOpt LIZIZ5 = C28592BKa.LIZIZ();
            if (LIZIZ5 != null) {
                i = LIZIZ5.retryTime;
            } else {
                i = 3;
            }
            LJFF = i;
        }
        LIZIZ = true;
        if (LJI <= 0) {
            LJI = System.currentTimeMillis();
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gecko_resource_download_channels");
        List<String> list2 = LJ;
        if (list2 == null || (str = list2.toString()) == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "download_channels");
        LIZ2.LJJIIJZLJL();
        LIZJ();
        OIB oib = LIZ;
        if (oib == null || (str2 = oib.LIZJ) == null) {
            return;
        }
        C61520OCm LIZ3 = O3E.LIZ(str2);
        ArrayList arrayList3 = new ArrayList();
        List<String> list3 = LJ;
        if (list3 != null) {
            Iterator<String> it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add(new CheckRequestBodyModel.TargetChannel(it.next()));
            }
        }
        java.util.Map<String, List<CheckRequestBodyModel.TargetChannel>> LJJIIZI = C51029K0z.LJJIIZI(new OSZ(str2, arrayList3));
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setFrom("live_normal");
        optionCheckUpdateParams.setEnableThrottle(false);
        optionCheckUpdateParams.setExpireCleanGroup(true);
        optionCheckUpdateParams.setListener(new OF5());
        if (LIZ3 == null) {
            return;
        }
        LIZ3.LIZ("default", LJJIIZI, optionCheckUpdateParams);
    }

    public static File LIZIZ(String channel, String filePath) {
        String str;
        String str2;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(filePath, "filePath");
        if (TextUtils.isEmpty(channel) || TextUtils.isEmpty(filePath)) {
            return null;
        }
        if (TextUtils.isEmpty(channel)) {
            str2 = "";
        } else {
            LIZJ();
            OIB oib = LIZ;
            if (oib != null) {
                str = oib.LIZJ;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C38943FQd.LIZLLL();
                str2 = C70657RoD.LJIIIZ(str, channel);
            } else {
                str2 = null;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        File file = new File(JBR.LJFF(LIZ2, File.separator, filePath, LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public static void LIZ(String str, String str2, boolean z, boolean z2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gecko_resource_download_complete");
        LIZ2.LJIJJ(Boolean.valueOf(z), "downloaded");
        LIZ2.LJIJJ(Boolean.valueOf(z2), "is_complete");
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis() - LJI), "download_duration");
        LIZ2.LJIJJ(str, "download_channels");
        LIZ2.LJIJJ(str2, "from");
        LIZ2.LJJIIJZLJL();
    }
}
