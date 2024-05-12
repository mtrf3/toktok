package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.HashtagId;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8I {
    public static final VopCloneConfig LIZ = new VopCloneConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E8J.LJLIL);

    public static final VopCloneConfig LIZ() {
        return (VopCloneConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        boolean z;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        if (((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        Integer num = LIZ().isShowVopEntry;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        String str = LIZ().webUrl;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0 || !isLogin || z) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str) {
        List<HashtagId> list;
        if (!LIZIZ() || str.length() == 0 || (list = LIZ().hashtagIdGroup) == null || list.isEmpty()) {
            return false;
        }
        Iterator<HashtagId> it = list.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().hashtagID, str)) {
                return true;
            }
        }
        return false;
    }
}
