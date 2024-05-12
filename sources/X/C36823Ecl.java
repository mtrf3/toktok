package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ecl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36823Ecl extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C36823Ecl LJLIL = new C36823Ecl();

    public C36823Ecl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        ExecutorService newCachedThreadPool = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("PreloadInitConfig$Builder$build$1"));
        o.LJFF(newCachedThreadPool, "Executors.newCachedThreadPool()");
        return newCachedThreadPool;
    }
}
