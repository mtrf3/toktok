package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H5j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43499H5j implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ AbstractC43498H5i LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC43506H5q LJIILL = this.LIZ.LJIILL();
        if (LJIILL != null) {
            EnumC43505H5p enumC43505H5p = EnumC43505H5p.STAGE_UPLOAD_ZIP;
            AbstractC43498H5i abstractC43498H5i = this.LIZ;
            LJIILL.LIZ(enumC43505H5p, 2, abstractC43498H5i.LJIIIIZZ, abstractC43498H5i.LJIIIZ, null, 10002, "get_upload_token_error", 0L);
        }
        InterfaceC43506H5q LJIILL2 = this.LIZ.LJIILL();
        if (LJIILL2 != null) {
            LJIILL2.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        C43859HJf c43859HJf;
        VideoCreation videoCreation2 = videoCreation;
        if (videoCreation2 instanceof UploadAuthKeyConfig) {
            AbstractC43498H5i abstractC43498H5i = this.LIZ;
            UploadAuthKeyConfig uploadConfig = (UploadAuthKeyConfig) videoCreation2;
            String zipPath = this.LIZIZ;
            abstractC43498H5i.getClass();
            o.LJIIIZ(uploadConfig, "uploadConfig");
            o.LJIIIZ(zipPath, "zipPath");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutTemplateUploadTask#executeUploadZip: zipPath = ");
            LIZ.append(zipPath);
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
            UploadImageConfig uploadImageConfig = uploadConfig.imgConfig;
            if (uploadImageConfig != null) {
                C43859HJf c43859HJf2 = new C43859HJf(uploadImageConfig);
                H75 h75 = new H75();
                h75.LIZJ(uploadImageConfig);
                c43859HJf2.LJIIJJI(h75.LIZLLL());
                C60903NvH.LJIIJJI().getApplicationService();
                c43859HJf2.LJIIJ(C45039Hlz.LIZLLL());
                abstractC43498H5i.LJIILIIL = c43859HJf2;
                c43859HJf2.LJIIIZ(new C43500H5k(abstractC43498H5i, zipPath));
                C43859HJf c43859HJf3 = abstractC43498H5i.LJIILIIL;
                if (c43859HJf3 != null) {
                    c43859HJf3.LJIIIIZZ(1, new String[]{zipPath});
                    try {
                        try {
                            c43859HJf = abstractC43498H5i.LJIILIIL;
                        } catch (Exception e) {
                            C43859HJf c43859HJf4 = abstractC43498H5i.LJIILIIL;
                            if (c43859HJf4 != null) {
                                c43859HJf4.LIZJ();
                                C16880lQ.LLLLIIL(e);
                            } else {
                                o.LJIJI("actualUploader");
                                throw null;
                            }
                        }
                        if (c43859HJf != null) {
                            c43859HJf.LJIIL();
                            return;
                        } else {
                            o.LJIJI("actualUploader");
                            throw null;
                        }
                    } finally {
                        abstractC43498H5i.LJIIZILJ(null, true);
                    }
                }
                o.LJIJI("actualUploader");
                throw null;
            }
            throw new IllegalArgumentException("upload image config is null");
        }
        InterfaceC43506H5q LJIILL = this.LIZ.LJIILL();
        if (LJIILL != null) {
            EnumC43505H5p enumC43505H5p = EnumC43505H5p.STAGE_UPLOAD_ZIP;
            AbstractC43498H5i abstractC43498H5i2 = this.LIZ;
            LJIILL.LIZ(enumC43505H5p, 2, abstractC43498H5i2.LJIIIIZZ, abstractC43498H5i2.LJIIIZ, null, 10003, "authkey_model_error", 0L);
        }
        InterfaceC43506H5q LJIILL2 = this.LIZ.LJIILL();
        if (LJIILL2 != null) {
            LJIILL2.LIZIZ(this.LIZIZ);
        }
    }

    public C43499H5j(AbstractC43498H5i abstractC43498H5i, String str) {
        this.LIZ = abstractC43498H5i;
        this.LIZIZ = str;
    }
}
