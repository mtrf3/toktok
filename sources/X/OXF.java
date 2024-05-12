package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OXF implements InterfaceC61118Nyk {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ UploadFileMethod LIZIZ;

    public OXF(UploadFileMethod uploadFileMethod, Activity activity) {
        this.LIZIZ = uploadFileMethod;
        this.LIZ = activity;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(this.LIZ, (Class<?>) ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.LIZIZ.shouldWithCamera);
                intent.putExtra("maxSelectNum", this.LIZIZ.maxSelectNum);
                intent.putExtra("maxFileSize", this.LIZIZ.originalImageMaxSize);
                intent.putExtra("needBase64Response", this.LIZIZ.needBase64Response);
                intent.putExtra("enter_from", this.LIZIZ.mFrom);
                C16880lQ.LIZIZ(this.LIZ, intent);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", this.LIZIZ.mFrom);
                FMX.LJIIL("enter_image_choose", c188727au.LIZ);
                ImageChooseUploadActivity.LJLLLL = this.LIZIZ;
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(this.LIZ);
            c26045AKb.LJIIIZ(this.LIZ.getString(R.string.jga));
            c26045AKb.LJIIJ();
            this.LIZIZ.cancelMultiUpload();
        }
    }
}
