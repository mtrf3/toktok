package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.jvm.internal.o;

/* renamed from: X.H5o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43504H5o implements InterfaceC43506H5q {
    public final /* synthetic */ C43501H5l LIZ;

    @Override // X.InterfaceC43506H5q
    public final void LIZIZ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
    }

    public C43504H5o(C43501H5l c43501H5l) {
        this.LIZ = c43501H5l;
    }

    @Override // X.InterfaceC43506H5q
    public final void LIZJ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        this.LIZ.LJIILJJIL = filePath;
    }

    @Override // X.InterfaceC43506H5q
    public final void LIZ(EnumC43505H5p stage, int i, String itemId, String vid, Object obj, Integer num, String str, long j) {
        Integer num2;
        AbstractImageUploader.ImageUploadInfo imageUploadInfo;
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(vid, "vid");
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if ((obj instanceof AbstractImageUploader.ImageUploadInfo) && (imageUploadInfo = (AbstractImageUploader.ImageUploadInfo) obj) != null) {
                num2 = Integer.valueOf((int) imageUploadInfo.getMErrorCode());
            } else {
                num2 = num;
            }
            if (stage == EnumC43505H5p.STAGE_UPLOAD_ZIP) {
                long LIZLLL = C45049Hm9.LIZLLL(this.LIZ.LJIIJJI);
                this.LIZ.LJIL(LIZLLL, num2, str, false);
                this.LIZ.LJIJJLI(LIZLLL, num2, str, false);
                return;
            } else {
                if (stage == EnumC43505H5p.STAGE_BIND) {
                    C43501H5l c43501H5l = this.LIZ;
                    c43501H5l.LJIJJ(C45049Hm9.LIZLLL(c43501H5l.LJIIL), num2, str, false);
                    C43501H5l c43501H5l2 = this.LIZ;
                    c43501H5l2.LJIJJLI(C45049Hm9.LIZLLL(c43501H5l2.LJIIJJI), num2, str, false);
                    return;
                }
                this.LIZ.LJIJJLI(0L, num, str, false);
                return;
            }
        }
        if (stage == EnumC43505H5p.STAGE_UPLOAD_ZIP) {
            C43501H5l c43501H5l3 = this.LIZ;
            c43501H5l3.LJIL(C45049Hm9.LIZLLL(c43501H5l3.LJIIJJI), null, null, true);
        } else {
            if (stage != EnumC43505H5p.STAGE_BIND) {
                return;
            }
            C43501H5l c43501H5l4 = this.LIZ;
            c43501H5l4.LJIJJ(C45049Hm9.LIZLLL(c43501H5l4.LJIIL), null, null, true);
            C43501H5l c43501H5l5 = this.LIZ;
            c43501H5l5.LJIJJLI(C45049Hm9.LIZLLL(c43501H5l5.LJIIJJI), null, null, true);
        }
    }
}
