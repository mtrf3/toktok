package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* renamed from: X.H0j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43369H0j implements FUZ {
    public final /* synthetic */ C43859HJf LIZ;
    public final /* synthetic */ InterfaceC67352kd<String> LIZIZ;

    public C43369H0j(C43859HJf c43859HJf, C84654XKg c84654XKg) {
        this.LIZ = c43859HJf;
        this.LIZIZ = c84654XKg;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("what=");
        LIZ.append(i);
        C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
        this.LIZ.getClass();
        String str2 = null;
        if (i == 6) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("upload succesful image key: ");
            if (imageUploadInfo != null) {
                str = imageUploadInfo.getMImageToskey();
            } else {
                str = null;
            }
            LIZ2.append(str);
            C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ2));
            this.LIZ.LIZJ();
            InterfaceC67352kd<String> interfaceC67352kd = this.LIZIZ;
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMImageToskey();
            }
            C3C5.m7constructorimpl(str2);
            interfaceC67352kd.resumeWith(str2);
            return;
        }
        this.LIZ.getClass();
        if (i == 7) {
            C15280iq.LJ("DiyProp", "upload failed");
            this.LIZ.LIZJ();
            InterfaceC67352kd<String> interfaceC67352kd2 = this.LIZIZ;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd2.resumeWith(null);
            return;
        }
        this.LIZ.getClass();
    }

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("upload onLog what=", i, ", code=", i2, ", info=");
        LIZJ.append(str);
        C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZJ));
    }
}
