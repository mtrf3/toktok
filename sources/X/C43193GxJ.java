package X;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.DateFormat;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.LocalDraftLog;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GxJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43193GxJ extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abor_draft_local_info";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        String LJ;
        IAVDraftService draftService = AVExternalServiceImpl.LIZ().draftService();
        boolean z = true;
        String str = null;
        int i = draftService.queryDraftsInfo(new GPK(true, true, null, 4)).LIZ;
        List<Integer> queryUserDraftCounts = draftService.getFeedbackService().queryUserDraftCounts(false);
        int LLILLIZIL = ORZ.LLILLIZIL(queryUserDraftCounts) + i;
        File file = new File(draftService.getFeedbackService().getReadableDBPath());
        long j = -1;
        if (file.exists() && file.isFile()) {
            LJ = LJ(file.lastModified());
        } else {
            LJ = LJ(-1L);
        }
        String dBCreationTime = draftService.getFeedbackService().getDBCreationTime();
        if (dBCreationTime != null && dBCreationTime.length() != 0) {
            z = false;
        }
        String str2 = "Unknown";
        if (z) {
            if (!file.exists() || !file.isFile()) {
                dBCreationTime = "Unknown";
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    j = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
                }
                dBCreationTime = LJ(j);
            }
        }
        File dataDirectory = Environment.getDataDirectory();
        o.LJIIIIZZ(dataDirectory, "getDataDirectory()");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        if (availableBlocksLong >= 0) {
            if (availableBlocksLong >= 1024) {
                long j2 = 1024;
                availableBlocksLong /= j2;
                if (availableBlocksLong >= 1024) {
                    availableBlocksLong /= j2;
                    str = "MB";
                } else {
                    str = "KB";
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(availableBlocksLong));
            int length = sb.length();
            while (true) {
                length -= 3;
                if (length <= 0) {
                    break;
                }
                sb.insert(length, ',');
            }
            if (str != null) {
                sb.append(str);
            }
            str2 = sb.toString();
            o.LJIIIIZZ(str2, "resultBuffer.toString()");
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new LocalDraftLog("draft_count", dBCreationTime, LJ, i, LLILLIZIL, queryUserDraftCounts, str2));
        o.LJIIIIZZ(json, "get().getService(GsonPro…a).gson.toJson(localInfo)");
        return json;
    }

    public static String LJ(long j) {
        if (j <= 0) {
            return "Unknown";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }
}
