package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.87A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87A extends AbstractC65781Prl implements InterfaceC88471Ynr<RightAreaContainerAssem, C202067wQ, C76800UCe> {
    public static final C87A LJLIL = new C87A();

    public C87A() {
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
            FeedAvatarDefaultAssem.LLIIIL.getClass();
            dataCenter.jv0(it, FeedAvatarDefaultAssem.LLIIJLIL);
        }
        return C76800UCe.LIZ;
    }
}
