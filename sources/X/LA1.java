package X;

import com.ss.android.ugc.aweme.AccountService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LA1 {
    public String LIZ = AccountService.LJIJ().LJFF().getCurUserId();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LA2.LJLIL);

    public final ConcurrentHashMap<String, Object> LIZ() {
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        if (!o.LJ(curUserId, this.LIZ)) {
            this.LIZ = curUserId;
            ((ConcurrentHashMap) this.LIZIZ.getValue()).clear();
        }
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }
}
