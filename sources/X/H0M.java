package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* loaded from: classes8.dex */
public final class H0M implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ InterfaceC67352kd<String> LIZIZ;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    public H0M(FUX fux, C84654XKg c84654XKg) {
        this.LIZ = fux;
        this.LIZIZ = c84654XKg;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        String str;
        String str2;
        this.LIZ.LJ();
        String str3 = null;
        if (i == 6) {
            this.LIZ.LIZJ();
            InterfaceC67352kd<String> interfaceC67352kd = this.LIZIZ;
            if (imageUploadInfo != null) {
                str = imageUploadInfo.getMImageToskey();
            } else {
                str = null;
            }
            C3C5.m7constructorimpl(str);
            interfaceC67352kd.resumeWith(str);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("is_login", String.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMImageToskey();
            } else {
                str2 = null;
            }
            c145995oB.LIZ(!TextUtils.isEmpty(str2) ? 1 : 0, "zip_upload_res_status");
            if (imageUploadInfo != null) {
                str3 = imageUploadInfo.getMImageToskey();
            }
            c145995oB.LJI("zipuri", str3);
            FMX.LJIIL("account_info_after_zip_upload", c145995oB.LIZ);
            return;
        }
        this.LIZ.LJFF();
        if (i != 7) {
            return;
        }
        this.LIZ.LIZJ();
        InterfaceC67352kd<String> interfaceC67352kd2 = this.LIZIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd2.resumeWith(null);
    }
}
