package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.9XT, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9XT implements Runnable {
    public static final C9XT LJLIL = new C9XT();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        String curUserId;
        try {
            IAccountService iAccountService = C86918Y9i.LIZLLL;
            if (TextUtils.isEmpty(iAccountService.LJFF().getCurUserId())) {
                curUserId = CardStruct.IStatusCode.DEFAULT;
            } else {
                curUserId = iAccountService.LJFF().getCurUserId();
            }
            C86918Y9i.LJ = curUserId;
        } finally {
            if (LIZ) {
            }
        }
    }
}
