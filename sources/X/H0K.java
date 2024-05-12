package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.List;

/* loaded from: classes8.dex */
public final class H0K implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ AbstractC41925Gcr LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ InterfaceC67352kd<String> LIZLLL;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        this.LIZ.LJ();
        String str3 = null;
        if (i == 6) {
            long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ.LIZLLL;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZIZ(currentTimeMillis, "upload_time");
            AbstractC41925Gcr.LJII(c145995oB);
            AbstractC41925Gcr abstractC41925Gcr = this.LIZIZ;
            long currentTimeMillis2 = System.currentTimeMillis() - this.LIZIZ.LIZIZ;
            abstractC41925Gcr.getClass();
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZIZ(currentTimeMillis2, "total_time");
            AbstractC41925Gcr.LJII(c145995oB2);
            int i2 = (int) currentTimeMillis;
            List<String> list = this.LIZJ;
            if (list != null) {
                num2 = Integer.valueOf(list.size());
            } else {
                num2 = null;
            }
            C43044Guu.LIZJ(i2, num2);
            this.LIZ.LIZJ();
            InterfaceC67352kd<String> interfaceC67352kd = this.LIZLLL;
            if (imageUploadInfo != null) {
                str = imageUploadInfo.getMImageToskey();
            } else {
                str = null;
            }
            C3C5.m7constructorimpl(str);
            interfaceC67352kd.resumeWith(str);
            C145995oB c145995oB3 = new C145995oB();
            c145995oB3.LJI("is_login", String.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMImageToskey();
            } else {
                str2 = null;
            }
            c145995oB3.LIZ(!TextUtils.isEmpty(str2) ? 1 : 0, "zip_upload_res_status");
            if (imageUploadInfo != null) {
                str3 = imageUploadInfo.getMImageToskey();
            }
            c145995oB3.LJI("zipuri", str3);
            FMX.LJIIL("account_info_after_zip_upload", c145995oB3.LIZ);
            return;
        }
        this.LIZ.LJFF();
        if (i != 7) {
            return;
        }
        List<String> list2 = this.LIZJ;
        if (list2 != null) {
            num = Integer.valueOf(list2.size());
        } else {
            num = null;
        }
        C43044Guu.LIZIZ(num, imageUploadInfo);
        this.LIZ.LIZJ();
        InterfaceC67352kd<String> interfaceC67352kd2 = this.LIZLLL;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd2.resumeWith(null);
    }

    public H0K(FUX fux, AbstractC41925Gcr abstractC41925Gcr, List list, C84654XKg c84654XKg) {
        this.LIZ = fux;
        this.LIZIZ = abstractC41925Gcr;
        this.LIZJ = list;
        this.LIZLLL = c84654XKg;
    }
}
