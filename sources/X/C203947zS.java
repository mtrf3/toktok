package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.7zS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203947zS extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractRightAreaComponent, C202067wQ, C76800UCe> {
    public static final C203947zS LJLIL = new C203947zS();

    public C203947zS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractRightAreaComponent interactRightAreaComponent, C202067wQ c202067wQ) {
        VideoItemParams gv0;
        DataCenter dataCenter;
        InteractRightAreaComponent selectSubscribe = interactRightAreaComponent;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LJLIL != -1.0f && (gv0 = selectSubscribe.n4().gv0()) != null && (dataCenter = gv0.dataCenter) != null) {
            dataCenter.jv0(it, "right_item_resize");
        }
        return C76800UCe.LIZ;
    }
}
