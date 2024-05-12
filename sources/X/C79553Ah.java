package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79553Ah extends AbstractC65781Prl implements InterfaceC88472Yns<ActivityStatus, String> {
    public static final C79553Ah LJLIL = new C79553Ah();

    public C79553Ah() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(ActivityStatus activityStatus) {
        ActivityStatus it = activityStatus;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.userID);
        LIZ.append('_');
        LIZ.append(it.activeTime);
        return X1D.LIZIZ(LIZ);
    }
}
