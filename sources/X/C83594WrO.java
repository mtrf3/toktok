package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WrO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83594WrO implements InterfaceC83707WtD {
    public final /* synthetic */ C83621Wrp LIZ;

    public C83594WrO(C83621Wrp c83621Wrp) {
        this.LIZ = c83621Wrp;
    }

    @Override // X.InterfaceC83707WtD
    public final void LIZ(int i) {
        if (i < 0) {
            C29S c29s = this.LIZ.LLIIZ;
            String string = c29s.getResources().getString(R.string.ikf, Integer.valueOf(i));
            C82890Wg2.LJFF.getClass();
            new C82890Wg2(c29s, string, 0, 2).LIZ();
            this.LIZ.k0(i);
            this.LIZ.finish();
            return;
        }
        this.LIZ.w0(i);
    }

    @Override // X.InterfaceC83707WtD
    public final void LIZIZ(int i) {
        C83621Wrp c83621Wrp = this.LIZ;
        CameraComponentModel cameraComponentModel = c83621Wrp.LLILZIL;
        if (cameraComponentModel.mRestoreType == 0) {
            cameraComponentModel.mHardEncode = i ^ 1;
        }
        c83621Wrp.o0(i, 1);
    }
}
