package X;

import android.accounts.NetworkErrorException;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* loaded from: classes8.dex */
public final class H0S implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ InterfaceC73573Su9<String> LIZIZ;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    public H0S(FUX fux, C73433Srt c73433Srt) {
        this.LIZ = fux;
        this.LIZIZ = c73433Srt;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        String mExtra;
        String mImageToskey;
        this.LIZ.LJ();
        String str = "";
        if (i == 6) {
            this.LIZ.LIZJ();
            InterfaceC73573Su9<String> interfaceC73573Su9 = this.LIZIZ;
            if (imageUploadInfo != null && (mImageToskey = imageUploadInfo.getMImageToskey()) != null) {
                str = mImageToskey;
            }
            interfaceC73573Su9.onNext(str);
            return;
        }
        this.LIZ.LJFF();
        if (i != 7) {
            return;
        }
        this.LIZ.LIZJ();
        InterfaceC73573Su9<String> interfaceC73573Su92 = this.LIZIZ;
        if (imageUploadInfo != null && (mExtra = imageUploadInfo.getMExtra()) != null) {
            str = mExtra;
        }
        interfaceC73573Su92.tryOnError(new NetworkErrorException(str));
    }
}
