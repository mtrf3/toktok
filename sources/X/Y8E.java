package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuthKt;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8E implements InterfaceC116954iR<CommentImageUploadAuth> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(CommentImageUploadAuth commentImageUploadAuth) {
        CommentImageUploadAuth auth = commentImageUploadAuth;
        o.LJIIIZ(auth, "auth");
        if (CommentImageUploadAuthKt.isValid(auth)) {
            Y88.LIZLLL = auth;
            C7EJ.LIZJ(Y88.LIZJ, GsonProtectorUtils.toJson(C75792yF.LIZIZ(), auth));
            C71Y.LIZLLL("CommentImageUploadController", "prefetch auth success");
        }
    }
}
