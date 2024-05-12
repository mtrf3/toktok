package X;

import android.content.Intent;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* renamed from: X.Cf3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31869Cf3 implements InterfaceC78910Uy2 {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ C38131Exr LIZIZ;
    public final /* synthetic */ EncryptedUploadMethod LIZJ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        KL2.LJI(R.string.soy, this.LIZIZ.LIZ);
        this.LIZJ.finishWithFailure();
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (this.LIZ.optInt("duration_limit", -1) != -1) {
            this.LIZJ.finishWithResult(new EncryptedUploadMethod.Result(1, 1, "Local video does not support duration_limit parameter", new EncryptedUploadMethod.Data()));
            return;
        }
        intent.setType("video/*");
        if (this.LIZJ.LJLILLLLZI.mo49getActivity() == null) {
            this.LIZJ.finishWithFailure();
        } else {
            C16880lQ.LJII(this.LIZJ.LJLILLLLZI, intent, 9002);
        }
    }

    public C31869Cf3(EncryptedUploadMethod encryptedUploadMethod, JSONObject jSONObject, C38131Exr c38131Exr) {
        this.LIZJ = encryptedUploadMethod;
        this.LIZ = jSONObject;
        this.LIZIZ = c38131Exr;
    }
}
