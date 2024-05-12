package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cey, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31864Cey implements InterfaceC73463SsN<C28467BFf<UploadResult>> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ UploadPhotoV2Method LJLJI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        Context context = this.LJLJI.LJLILLLLZI.getContext();
        if (context != null) {
            C0RO.LIZ(context, th, null);
        }
        if (this.LJLILLLLZI.length <= 0) {
            this.LJLJI.getClass();
        } else {
            C30868C9o.LIZJ(R.string.t01);
            this.LJLJI.LJJII();
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJI.LJLJJL = interfaceC92693kP;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(C28467BFf<UploadResult> c28467BFf) {
        C28467BFf<UploadResult> c28467BFf2 = c28467BFf;
        UploadResult uploadResult = c28467BFf2.data;
        this.LJLIL.toString();
        uploadResult.getClass();
        UploadPhotoV2Method uploadPhotoV2Method = this.LJLJI;
        UploadResult uploadResult2 = c28467BFf2.data;
        android.net.Uri uri = this.LJLIL;
        DialogC31813Ce9 dialogC31813Ce9 = uploadPhotoV2Method.LJLJJLL;
        if (dialogC31813Ce9 != null && dialogC31813Ce9.isShowing()) {
            uploadPhotoV2Method.LJLJJLL.dismiss();
        }
        String str = uploadResult2.uri;
        COY LIZIZ = COY.LIZIZ();
        Context context = uploadPhotoV2Method.callContext.LIZ;
        LIZIZ.getClass();
        uploadPhotoV2Method.finishWithResult(new UploadPhotoV2Method.Result(str, COY.LIZ(C00S.LIZIZ(context, uri))));
    }

    public C31864Cey(UploadPhotoV2Method uploadPhotoV2Method, android.net.Uri uri, byte[] bArr) {
        this.LJLJI = uploadPhotoV2Method;
        this.LJLIL = uri;
        this.LJLILLLLZI = bArr;
    }
}
