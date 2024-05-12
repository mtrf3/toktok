package X;

import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.3KO, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3KO extends TBS implements InterfaceC88473Ynt<ActivityStatus, InterfaceC65784Pro<? extends Long>, ActivityStatusConfig, Boolean> {
    public static final C3KO LJLIL = new C3KO();

    public C3KO() {
        super(3, OUP.class, "isOnline", "isOnline(Lcom/ss/android/ugc/aweme/im/service/model/ActivityStatus;Lkotlin/jvm/functions/Function0;Lcom/ss/android/ugc/aweme/im/service/appsettings/ActivityStatusConfig;)Z", 1);
    }

    @Override // X.InterfaceC88473Ynt
    public final Boolean invoke(ActivityStatus activityStatus, InterfaceC65784Pro<? extends Long> interfaceC65784Pro, ActivityStatusConfig activityStatusConfig) {
        ActivityStatus p0 = activityStatus;
        InterfaceC65784Pro<? extends Long> p1 = interfaceC65784Pro;
        ActivityStatusConfig p2 = activityStatusConfig;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        return Boolean.valueOf(OUP.LJJIFFI(p0, p1, p2));
    }
}
