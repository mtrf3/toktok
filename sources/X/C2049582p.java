package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.82p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049582p extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractRightAreaComponent, C202067wQ, C76800UCe> {
    public static final C2049582p LJLIL = new C2049582p();

    public C2049582p() {
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
            FeedAvatarDefaultAssem.LLIIIL.getClass();
            dataCenter.jv0(it, FeedAvatarDefaultAssem.LLIIJLIL);
        }
        return C76800UCe.LIZ;
    }
}
