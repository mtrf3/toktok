package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVC extends CR6 {
    public final String LJLIL;
    public final User LJLILLLLZI;
    public final String LJLJI;
    public long LJLJJI;
    public final long LJLJJL;
    public final int LJLJJLL;
    public int LJLJL;
    public final String LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public CZV LJLLI;
    public long LJLLILLLL;
    public final String LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public User LJLLLLLL;
    public boolean LJLZ;

    public final long LIZ() {
        return ((this.LJLL - SystemClock.elapsedRealtime()) + 499) / 1000;
    }

    public CVC(String starCommentId, User user, String content, long j, long j2, int i, String contentLanguage, CZV displayStatus, long j3, String str) {
        o.LJIIIZ(starCommentId, "starCommentId");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(contentLanguage, "contentLanguage");
        o.LJIIIZ(displayStatus, "displayStatus");
        this.LJLIL = starCommentId;
        this.LJLILLLLZI = user;
        this.LJLJI = content;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = i;
        this.LJLJL = 0;
        this.LJLJLJ = contentLanguage;
        this.LJLJLLL = 0L;
        this.LJLL = 0L;
        this.LJLLI = displayStatus;
        this.LJLLILLLL = j3;
        this.LJLLJ = str;
        this.LJLLL = 0;
        this.LJLLLL = false;
        this.LJLLLLLL = null;
        this.LJLZ = false;
    }
}
