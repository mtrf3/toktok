package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71202qq extends F9E {
    public final List<Integer> LJLIL;
    public final java.util.Map<Integer, String> LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public final long L(int i) {
        long j;
        long longValue = ((Number) ListProtector.get(this.LJLIL, i % this.LJLIL.size())).longValue();
        if (this.LJLJJI) {
            j = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getDebugDayTimeDuration();
        } else {
            j = 86400000;
        }
        return longValue * j;
    }

    public final boolean M(int i, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        String str = this.LJLILLLLZI.get(Integer.valueOf(i % this.LJLIL.size()));
        if (str == null) {
            str = this.LJLJI;
        }
        return o.LJ(str, enterFrom);
    }

    public C71202qq(int i, List reshowIntervals, java.util.Map targetPages) {
        String defaultTargetPage;
        targetPages = (i & 2) != 0 ? C113554cx.LJJJLIIL() : targetPages;
        if ((i & 4) != 0) {
            defaultTargetPage = "notification_page";
        } else {
            defaultTargetPage = null;
        }
        o.LJIIIZ(reshowIntervals, "reshowIntervals");
        o.LJIIIZ(targetPages, "targetPages");
        o.LJIIIZ(defaultTargetPage, "defaultTargetPage");
        this.LJLIL = reshowIntervals;
        this.LJLILLLLZI = targetPages;
        this.LJLJI = defaultTargetPage;
        this.LJLJJI = TextUtils.equals(EF7.LJIILIIL, "local_test");
    }
}
