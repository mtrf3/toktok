package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;

/* loaded from: classes12.dex */
public final class QBI implements InterfaceC73463SsN<BaseResponse> {
    public final /* synthetic */ InstagramPresenter LJLIL;

    public QBI(InstagramPresenter instagramPresenter) {
        this.LJLIL = instagramPresenter;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        C221018lt.LJ(th);
        this.LJLIL.mInsView.n10();
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        C221018lt.LJFF("InstagramPresenter", "Start onSubscribe");
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(BaseResponse baseResponse) {
        C221018lt.LJFF("InstagramPresenter", "unbind onSuccess");
        this.LJLIL.mInsView.l30(null);
    }
}
