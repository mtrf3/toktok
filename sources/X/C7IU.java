package X;

import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.jvm.internal.o;

/* renamed from: X.7IU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IU extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssemNew, C43I<? extends Boolean>, C76800UCe> {
    public static final C7IU LJLIL = new C7IU();

    public C7IU() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssemNew upvoteVideoAssemNew, C43I<? extends Boolean> c43i) {
        Boolean bool;
        UpvoteVideoAssemNew selectSubscribe = upvoteVideoAssemNew;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            bool = (Boolean) c43i2.LIZ;
        } else {
            bool = null;
        }
        selectSubscribe.LLILLL = bool;
        if (o.LJ(bool, Boolean.FALSE) && selectSubscribe.LJLLL && selectSubscribe.getContainerView().getVisibility() != 0) {
            selectSubscribe.f5("update_from_video_tag_decision");
        }
        return C76800UCe.LIZ;
    }
}
