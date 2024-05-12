package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.HashtagId;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.E6a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35872E6a {
    public static final VopSignUpConfig LIZ = new VopSignUpConfig(null, null, null, 7, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35873E6b.LJLIL);

    public static boolean LIZ() {
        boolean z;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        if (((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        C62822Ol8 c62822Ol8 = LIZIZ;
        Integer num = ((VopSignUpConfig) c62822Ol8.getValue()).isShowVopEntry;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        String str = ((VopSignUpConfig) c62822Ol8.getValue()).webUrl;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0 || !isLogin || z) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        List<HashtagId> list;
        if (!LIZ() || str.length() == 0 || (list = ((VopSignUpConfig) LIZIZ.getValue()).hashtagIdGroup) == null || list.isEmpty()) {
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
