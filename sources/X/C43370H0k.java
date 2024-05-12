package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.List;

/* renamed from: X.H0k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43370H0k implements FUZ {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZJ;
    public final /* synthetic */ C43858HJe LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJ;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        Integer num;
        String str;
        float f;
        Integer num2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uploader notify: what = ");
        LIZ.append(i);
        LIZ.append(' ');
        String str2 = null;
        if (imageUploadInfo != null) {
            num = Integer.valueOf(imageUploadInfo.getMFileIndex());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" - ");
        if (imageUploadInfo != null) {
            str = imageUploadInfo.getMImageToskey();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (i == 6) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("single file complete: ");
            if (imageUploadInfo != null) {
                num2 = Integer.valueOf(imageUploadInfo.getMFileIndex());
            } else {
                num2 = null;
            }
            LIZ2.append(num2);
            LIZ2.append(" - ");
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMImageToskey();
            }
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
            if (imageUploadInfo != null && Integer.valueOf(imageUploadInfo.getMFileIndex()) != null && imageUploadInfo.getMImageToskey() != null) {
                java.util.Map<String, String> map = this.LIZ;
                Object obj = ListProtector.get(this.LIZIZ, imageUploadInfo.getMFileIndex());
                String mImageToskey = imageUploadInfo.getMImageToskey();
                if (mImageToskey != null) {
                    map.put(obj, mImageToskey);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        if (i == 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("upload file complete: ");
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMImageToskey();
            }
            LIZ3.append(str2);
            X1D.LIZIZ(LIZ3);
            InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZJ;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            interfaceC67352kd.resumeWith(bool);
            return;
        }
        if (i == 2 || i == 7) {
            this.LIZLLL.LIZ.close();
            InterfaceC67352kd<Boolean> interfaceC67352kd2 = this.LIZJ;
            Boolean bool2 = Boolean.FALSE;
            C3C5.m7constructorimpl(bool2);
            interfaceC67352kd2.resumeWith(bool2);
            return;
        }
        if (i != 1) {
            return;
        }
        InterfaceC88472Yns<Float, C76800UCe> interfaceC88472Yns = this.LJ;
        if (imageUploadInfo != null) {
            f = (float) imageUploadInfo.getMProgress();
        } else {
            f = 0.0f;
        }
        interfaceC88472Yns.invoke(Float.valueOf(f));
    }

    public C43370H0k(java.util.Map map, List list, C84654XKg c84654XKg, C43858HJe c43858HJe, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = map;
        this.LIZIZ = list;
        this.LIZJ = c84654XKg;
        this.LIZLLL = c43858HJe;
        this.LJ = interfaceC88472Yns;
    }
}
