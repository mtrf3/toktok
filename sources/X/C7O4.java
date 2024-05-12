package X;

import android.view.View;
import com.ss.android.ugc.aweme.nows.feed.ui.NowGestureAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowInteractionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7O4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7O4 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowInteractionAssem, Boolean, C76800UCe> {
    public static final C7O4 LJLIL = new C7O4();

    public C7O4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowInteractionAssem nowInteractionAssem, Boolean bool) {
        NowInteractionAssem selectSubscribe = nowInteractionAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C7O3 c7o3 = NowGestureAssem.LLFZ;
        View containerView = selectSubscribe.getContainerView();
        c7o3.getClass();
        C7O3.LIZ(containerView, booleanValue);
        return C76800UCe.LIZ;
    }
}
