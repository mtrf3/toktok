package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.87C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87C extends AbstractC65781Prl implements InterfaceC88471Ynr<RightAreaContainerAssem, C202067wQ, C76800UCe> {
    public static final C87C LJLIL = new C87C();

    public C87C() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RightAreaContainerAssem rightAreaContainerAssem, C202067wQ c202067wQ) {
        VideoItemParams gv0;
        DataCenter dataCenter;
        RightAreaContainerAssem selectSubscribe = rightAreaContainerAssem;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LJLIL != -1.0f && (gv0 = selectSubscribe.Z3().gv0()) != null && (dataCenter = gv0.dataCenter) != null) {
            dataCenter.jv0(it, "right_item_resize");
        }
        return C76800UCe.LIZ;
    }
}
