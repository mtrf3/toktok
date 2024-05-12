package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuthKt;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8D implements InterfaceC116954iR<CommentImageUploadAuth> {
    public final /* synthetic */ Y88 LJLIL;
    public final /* synthetic */ CommentImageModel LJLILLLLZI;
    public final /* synthetic */ SH7 LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLJI.onError();
        Y89.LJ(this.LJLILLLLZI, -1);
        C71Y.LIZLLL("CommentImageUploadController", "fetch authConfig error");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(CommentImageUploadAuth commentImageUploadAuth) {
        CommentImageUploadAuth auth = commentImageUploadAuth;
        o.LJIIIZ(auth, "auth");
        if (CommentImageUploadAuthKt.isValid(auth)) {
            C71Y.LIZLLL("CommentImageUploadController", "fetch valid authConfig success");
            Y88.LIZLLL = auth;
            C7EJ.LIZJ(Y88.LIZJ, GsonProtectorUtils.toJson(C75792yF.LIZIZ(), auth));
            this.LJLIL.LIZIZ(this.LJLILLLLZI, auth, this.LJLJI);
            Y89.LJ(this.LJLILLLLZI, 1);
            return;
        }
        C71Y.LIZLLL("CommentImageUploadController", "fetch invalid authConfig!");
        this.LJLJI.onError();
        Y89.LJ(this.LJLILLLLZI, -1);
    }

    public Y8D(CommentImageModel commentImageModel, Y88 y88, SH7 sh7) {
        this.LJLIL = y88;
        this.LJLILLLLZI = commentImageModel;
        this.LJLJI = sh7;
    }
}
