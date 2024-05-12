package X;

import com.ss.android.ugc.aweme.services.BusinessMainServiceImpl;

/* renamed from: X.FtV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40409FtV implements Runnable {
    public static final RunnableC40409FtV LJLIL = new RunnableC40409FtV();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            BusinessMainServiceImpl.createIBusinessMainServicebyMonsterPlugin(false).getInitialChooseLanguageManager();
        } finally {
            if (LIZ) {
            }
        }
    }
}
