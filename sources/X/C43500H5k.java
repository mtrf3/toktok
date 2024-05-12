package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.H5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43500H5k implements FUZ {
    public final /* synthetic */ AbstractC43498H5i LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    public C43500H5k(AbstractC43498H5i abstractC43498H5i, String str) {
        this.LIZ = abstractC43498H5i;
        this.LIZIZ = str;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        InterfaceC43506H5q LJIILL;
        String str;
        AbstractC43498H5i abstractC43498H5i = this.LIZ;
        String str2 = null;
        if (abstractC43498H5i.LJIILIIL != null) {
            if (i == 6) {
                if (imageUploadInfo == null || (str = imageUploadInfo.getMImageToskey()) == null) {
                    str = "";
                }
                abstractC43498H5i.getClass();
                abstractC43498H5i.LJIIIZ = str;
                InterfaceC43506H5q LJIILL2 = this.LIZ.LJIILL();
                if (LJIILL2 != null) {
                    EnumC43505H5p enumC43505H5p = EnumC43505H5p.STAGE_UPLOAD_ZIP;
                    AbstractC43498H5i abstractC43498H5i2 = this.LIZ;
                    String str3 = abstractC43498H5i2.LJIIIIZZ;
                    String str4 = abstractC43498H5i2.LJIIIZ;
                    if (imageUploadInfo != null) {
                        str2 = imageUploadInfo.getMExtra();
                    }
                    LJIILL2.LIZ(enumC43505H5p, 1, str3, str4, imageUploadInfo, null, str2, 0L);
                }
                AbstractC43498H5i abstractC43498H5i3 = this.LIZ;
                String zipPath = this.LIZIZ;
                abstractC43498H5i3.getClass();
                o.LJIIIZ(zipPath, "zipPath");
                if (TextUtils.isEmpty(abstractC43498H5i3.LJIIIIZZ) || TextUtils.isEmpty(abstractC43498H5i3.LJIIIZ)) {
                    return;
                }
                abstractC43498H5i3.LJIIL = System.currentTimeMillis();
                abstractC43498H5i3.LJII().LIZIZ();
                C76L<String> ugcTemplateVideoBinding = ((UploaderRetrofitService) V0N.LJIILIIL(UploaderRetrofitService.class)).ugcTemplateVideoBinding(abstractC43498H5i3.LJIIIIZZ, abstractC43498H5i3.LJIIIZ, abstractC43498H5i3.LJIIJ, abstractC43498H5i3.LJIJI());
                ugcTemplateVideoBinding.LJFF(new RunnableC65751PrH(ugcTemplateVideoBinding, new C43502H5m(abstractC43498H5i3, zipPath)), EnumC169566l6.LJLIL);
                return;
            }
            if (i != 7 || (LJIILL = abstractC43498H5i.LJIILL()) == null) {
                return;
            }
            EnumC43505H5p enumC43505H5p2 = EnumC43505H5p.STAGE_UPLOAD_ZIP;
            AbstractC43498H5i abstractC43498H5i4 = this.LIZ;
            String str5 = abstractC43498H5i4.LJIIIIZZ;
            String str6 = abstractC43498H5i4.LJIIIZ;
            if (imageUploadInfo != null) {
                str2 = imageUploadInfo.getMExtra();
            }
            LJIILL.LIZ(enumC43505H5p2, 2, str5, str6, imageUploadInfo, null, str2, 0L);
            return;
        }
        o.LJIJI("actualUploader");
        throw null;
    }
}
