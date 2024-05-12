package X;

import com.ss.android.ugc.aweme.app.launch.TaskServiceImpl;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskApi;
import kotlin.jvm.internal.o;

/* renamed from: X.FVh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39077FVh implements ITaskApi {
    public static final C39077FVh LIZIZ = new C39077FVh();
    public final /* synthetic */ ITaskApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZIZ(EFK type) {
        o.LJIIIZ(type, "type");
        return this.LIZ.LIZIZ(type);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final EE1 LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C39077FVh() {
        ITaskApi iTaskApi;
        Object LIZ = C58096Mr6.LIZ(ITaskApi.class, false);
        if (LIZ != null) {
            iTaskApi = (ITaskApi) LIZ;
        } else {
            if (C58096Mr6.LLIL == null) {
                synchronized (ITaskApi.class) {
                    if (C58096Mr6.LLIL == null) {
                        C58096Mr6.LLIL = new TaskServiceImpl();
                    }
                }
            }
            iTaskApi = C58096Mr6.LLIL;
        }
        this.LIZ = iTaskApi;
    }
}
