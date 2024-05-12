package X;

import Y.IDRunnableS2S0300000;
import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28651An implements C08B {
    public final Context LIZ;

    public C28651An(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    @Override // X.C08B
    public final void LIZ(C08C c08c) {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new AnonymousClass081("EmojiCompatInitializer"));
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        pThreadPoolExecutor.execute(new IDRunnableS2S0300000(this, c08c, pThreadPoolExecutor, 2));
    }
}
