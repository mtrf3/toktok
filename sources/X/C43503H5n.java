package X;

import com.ss.bduploader.BDVideoInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.H5n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43503H5n implements InterfaceC43506H5q {
    public final /* synthetic */ C43497H5h LIZ;

    @Override // X.InterfaceC43506H5q
    public final void LIZJ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
    }

    public C43503H5n(C43497H5h c43497H5h) {
        this.LIZ = c43497H5h;
    }

    @Override // X.InterfaceC43506H5q
    public final void LIZIZ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        C43497H5h c43497H5h = this.LIZ;
        c43497H5h.getClass();
        float length = ((float) new File(filePath).length()) / 1024.0f;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZJ(Float.valueOf(length), "size");
        c145995oB.LJI("aweme_id", c43497H5h.LJIIIIZZ);
        c145995oB.LJI("vid", c43497H5h.LJIIIZ);
        FMX.LJIIL("ugc_template_zip_size_event", c145995oB.LIZ);
    }

    @Override // X.InterfaceC43506H5q
    public final void LIZ(EnumC43505H5p stage, int i, String itemId, String vid, Object obj, Integer num, String str, long j) {
        BDVideoInfo bDVideoInfo;
        String str2;
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(vid, "vid");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C43497H5h c43497H5h = this.LIZ;
                if (obj instanceof BDVideoInfo) {
                    bDVideoInfo = (BDVideoInfo) obj;
                } else {
                    bDVideoInfo = null;
                }
                c43497H5h.getClass();
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZ(2, "status");
                c145995oB.LJI("aweme_id", itemId);
                c145995oB.LJI("vid", vid);
                Object obj2 = num;
                if (bDVideoInfo != null) {
                    obj2 = Long.valueOf(bDVideoInfo.mErrorCode);
                }
                c145995oB.LIZJ(obj2, "error_code");
                if (bDVideoInfo != null && (str2 = bDVideoInfo.mErrorMsg) != null) {
                    str = str2;
                }
                c145995oB.LJI("error_msg", str);
                FMX.LJIIL("ugc_template_upload_event", c145995oB.LIZ);
                return;
            }
            if (stage != EnumC43505H5p.STAGE_BIND) {
                return;
            }
            this.LIZ.getClass();
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZ(1, "status");
            c145995oB2.LJI("aweme_id", itemId);
            c145995oB2.LJI("vid", vid);
            FMX.LJIIL("ugc_template_upload_event", c145995oB2.LIZ);
            this.LIZ.getClass();
            C145995oB c145995oB3 = new C145995oB();
            c145995oB3.LIZIZ(j, "time");
            FMX.LJIIL("ugc_template_zip_upload_time_event", c145995oB3.LIZ);
            return;
        }
        this.LIZ.getClass();
        C145995oB c145995oB4 = new C145995oB();
        c145995oB4.LIZ(0, "status");
        c145995oB4.LJI("aweme_id", itemId);
        FMX.LJIIL("ugc_template_upload_event", c145995oB4.LIZ);
    }
}
