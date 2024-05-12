package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cex, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31863Cex implements InterfaceC73463SsN<C28467BFf<UploadResult>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ EncryptedUploadMethod LJLJI;

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
            this.LJLJI.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJI.LJLJJI = interfaceC92693kP;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(C28467BFf<UploadResult> c28467BFf) {
        UploadResult uploadResult = c28467BFf.data;
        uploadResult.getClass();
        EncryptedUploadMethod encryptedUploadMethod = this.LJLJI;
        String str = this.LJLIL;
        encryptedUploadMethod.LJJIIJ();
        EncryptedUploadMethod.Data data = new EncryptedUploadMethod.Data();
        data.uri = uploadResult.uri;
        COY.LIZIZ().getClass();
        data.local_img = COY.LIZ(str);
        encryptedUploadMethod.finishWithResult(new EncryptedUploadMethod.Result(1, 0, C15380j0.LJIILJJIL(R.string.sq4), data));
    }

    public C31863Cex(EncryptedUploadMethod encryptedUploadMethod, String str, byte[] bArr) {
        this.LJLJI = encryptedUploadMethod;
        this.LJLIL = str;
        this.LJLILLLLZI = bArr;
    }
}
