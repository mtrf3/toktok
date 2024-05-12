package X;

import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

/* renamed from: X.Nx8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61018Nx8 {
    public static final /* synthetic */ int LJI = 0;
    public int LIZ;
    public volatile boolean LIZIZ = true;
    public long LIZJ;
    public M59 LIZLLL;
    public C61020NxA LJ;
    public int LJFF;

    static {
        new WeakReference(null);
    }

    public C61018Nx8(AwemeHostApplication awemeHostApplication) {
        awemeHostApplication.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        awemeHostApplication.registerActivityLifecycleCallbacks(new C61016Nx6(this));
    }
}
