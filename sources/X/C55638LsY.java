package X;

import com.ss.android.ugc.aweme.follow.widget.FollowWidgetServiceImpl;
import com.ss.android.ugc.aweme.live.assem.IFollowWidgetService;
import kotlin.jvm.internal.o;

/* renamed from: X.LsY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55638LsY extends AbstractC65781Prl implements InterfaceC88472Yns<C8V6, C76800UCe> {
    public static final C55638LsY LJLIL = new C55638LsY();

    public C55638LsY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V6 c8v6) {
        IFollowWidgetService iFollowWidgetService;
        C8V6 assem = c8v6;
        o.LJIIIZ(assem, "$this$assem");
        Object LIZ = C58096Mr6.LIZ(IFollowWidgetService.class, false);
        if (LIZ != null) {
            iFollowWidgetService = (IFollowWidgetService) LIZ;
        } else {
            if (C58096Mr6.U0 == null) {
                synchronized (IFollowWidgetService.class) {
                    if (C58096Mr6.U0 == null) {
                        C58096Mr6.U0 = new FollowWidgetServiceImpl();
                    }
                }
            }
            iFollowWidgetService = C58096Mr6.U0;
        }
        assem.LJFF = iFollowWidgetService.LIZ();
        return C76800UCe.LIZ;
    }
}
