package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.36J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36J extends AbstractC65781Prl implements InterfaceC88472Yns<ActivityStatus, String> {
    public static final C36J LJLIL = new C36J();

    public C36J() {
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
