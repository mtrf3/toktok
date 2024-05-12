package X;

import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7IV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IV extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C7IV LJLIL = new C7IV();

    public C7IV() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssem upvoteVideoAssem, C43I<? extends Boolean> c43i) {
        Boolean bool;
        UpvoteVideoAssem selectSubscribe = upvoteVideoAssem;
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
