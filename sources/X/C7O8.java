package X;

import android.view.View;
import com.ss.android.ugc.aweme.nows.feed.ui.NowGestureAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowRelationAreaAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7O8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7O8 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowRelationAreaAssem, Boolean, C76800UCe> {
    public static final C7O8 LJLIL = new C7O8();

    public C7O8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowRelationAreaAssem nowRelationAreaAssem, Boolean bool) {
        NowRelationAreaAssem selectSubscribe = nowRelationAreaAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C7O3 c7o3 = NowGestureAssem.LLFZ;
        View containerView = selectSubscribe.getContainerView();
        c7o3.getClass();
        C7O3.LIZ(containerView, booleanValue);
        return C76800UCe.LIZ;
    }
}
