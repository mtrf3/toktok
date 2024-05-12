package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class OAS {
    public static List<Long> LIZ(File file) {
        File[] listFiles = file.listFiles(new OAU());
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                arrayList.add(Long.valueOf(CastLongProtector.valueOf(file2.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static Long LIZIZ(File file) {
        String[] split = file.getAbsolutePath().split("/");
        OD6.LJIIIZ(split[split.length - 2], split[split.length - 1], "ResVersionUtils.getLatestChannelVersion");
        return LIZJ(file);
    }

    public static Long LIZJ(File file) {
        Long l = null;
        if (file == null) {
            return null;
        }
        File[] listFiles = file.listFiles(new OAT());
        if (listFiles != null && listFiles.length != 0) {
            long j = 0;
            for (File file2 : listFiles) {
                String name = file2.getName();
                long lastModified = file2.lastModified();
                try {
                    long longValue = CastLongProtector.valueOf(name).longValue();
                    if (l == null || lastModified > j) {
                        l = Long.valueOf(longValue);
                        j = lastModified;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }
}
