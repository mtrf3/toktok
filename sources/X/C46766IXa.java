package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.IXa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46766IXa {
    public static void LIZ(C47140Iem c47140Iem, int i) {
        String str;
        IUB iub = IUA.LIZ;
        StringBuilder LIZJ = b1.LIZJ(iub.LIZ().getThumbCacheDir(C46982IcE.LIZ), "/");
        LIZJ.append(LIZIZ(c47140Iem, i));
        File file = new File(X1D.LIZIZ(LIZJ));
        if (i == 0) {
            str = c47140Iem.LIZ;
        } else {
            str = (String) ListProtector.get(c47140Iem.LIZIZ, i);
        }
        if (!file.exists()) {
            iub.LIZ().downloadFile(str, LIZIZ(c47140Iem, i), iub.LIZ().getThumbCacheDir(C46982IcE.LIZ), "legacy_video_thumb");
        }
    }

    public static String LIZIZ(C47140Iem c47140Iem, int i) {
        ArrayList<String> arrayList;
        if (i == 0 || (arrayList = c47140Iem.LIZIZ) == null || arrayList.size() <= 1 || i >= c47140Iem.LIZIZ.size()) {
            return String.valueOf(c47140Iem.LIZ.hashCode());
        }
        return String.valueOf(((String) ListProtector.get(c47140Iem.LIZIZ, i)).hashCode());
    }
}
