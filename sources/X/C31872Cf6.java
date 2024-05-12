package X;

import android.content.Intent;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* renamed from: X.Cf6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31872Cf6 implements InterfaceC78910Uy2 {
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
        int optInt = this.LIZ.optInt("duration_limit", 10000) / 1000;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.durationLimit", optInt);
        intent.putExtra("android.intent.extra.videoQuality", 1);
        if (this.LIZJ.LJLILLLLZI.mo49getActivity() == null) {
            this.LIZJ.finishWithFailure();
        } else {
            C16880lQ.LJII(this.LIZJ.LJLILLLLZI, intent, 9001);
        }
    }

    public C31872Cf6(EncryptedUploadMethod encryptedUploadMethod, JSONObject jSONObject, C38131Exr c38131Exr) {
        this.LIZJ = encryptedUploadMethod;
        this.LIZ = jSONObject;
        this.LIZIZ = c38131Exr;
    }
}
