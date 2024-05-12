package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.twitter.sdk.android.core.Session;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Pjd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65277Pjd<T extends Session> {
    public final C65278Pje LIZ;
    public final C54845Lfl LIZIZ;
    public final InterfaceC65283Pjj<T> LIZJ;
    public final ExecutorService LIZLLL;
    public final InterfaceC65282Pji LJ;

    public C65277Pjd(C65264PjQ c65264PjQ, PThreadPoolExecutor pThreadPoolExecutor, C65269PjV c65269PjV) {
        C54845Lfl c54845Lfl = new C54845Lfl();
        C65278Pje c65278Pje = new C65278Pje();
        this.LIZIZ = c54845Lfl;
        this.LIZJ = c65264PjQ;
        this.LIZLLL = pThreadPoolExecutor;
        this.LIZ = c65278Pje;
        this.LJ = c65269PjV;
    }
}
