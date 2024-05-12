package X;

import kotlin.jvm.internal.AqS13S1110000_8;
import kotlin.jvm.internal.AqS75S1100000_8;

/* loaded from: classes9.dex */
public final class J9F extends AbstractC36569EWv {
    public final /* synthetic */ AbstractC36569EWv LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.E0U
    public final void LJJJJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnected url=");
        LIZ.append(str);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJJJI(str);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music_stream");
        c188727au.LJ(currentTimeMillis, "duration");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("resource_url", str);
        String str3 = J9C.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        c188727au.LJIIIZ("resource_id", str2);
        c188727au.LJIIIZ("status", "connect");
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        FMX.LJIIL("tool_performance_resource_download", c188727au.LIZ);
    }

    @Override // X.E0U
    public final void LJJJLIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFinished url=");
        LIZ.append(str);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        C43045Guv.LIZLLL(new AqS75S1100000_8(this.LJLIL, str, 12), 0L);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music_stream");
        c188727au.LJ(currentTimeMillis, "duration");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("resource_url", str);
        String str3 = J9C.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        c188727au.LJIIIZ("resource_id", str2);
        c188727au.LJIIIZ("status", "finish");
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        FMX.LJIIL("tool_performance_resource_download", c188727au.LIZ);
        H6X.LIZIZ = null;
    }

    public J9F(AbstractC36569EWv abstractC36569EWv, long j) {
        this.LJLIL = abstractC36569EWv;
        this.LJLILLLLZI = j;
    }

    @Override // X.E0U
    public final void LJIIJ(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOpenResult url=");
        LIZ.append(str);
        LIZ.append(" success=");
        LIZ.append(z);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        C43045Guv.LIZLLL(new AqS13S1110000_8(this.LJLIL, str, z, 0), 0L);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music_stream");
        c188727au.LJ(currentTimeMillis, "duration");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("resource_url", str);
        String str3 = J9C.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        c188727au.LJIIIZ("resource_id", str2);
        c188727au.LJIIIZ("status", "open");
        c188727au.LJFF(Boolean.valueOf(z), "is_success");
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        FMX.LJIIL("tool_performance_resource_download", c188727au.LIZ);
    }

    @Override // X.E0U
    public final void LJJJJJ(String str, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgress url=");
        LIZ.append(str);
        LIZ.append(" progress=");
        LIZ.append(f);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        C43045Guv.LIZLLL(new J9G(this.LJLIL, str, f), 0L);
    }

    @Override // X.E0U
    public final void LJJJ(String str, int i, int i2, String str2) {
        String str3 = str;
        String str4 = str2;
        StringBuilder LJ = AnonymousClass028.LJ("onError url=", str3, " errorCode=", i, " ext=");
        LJ.append(i2);
        LJ.append(" msg=");
        LJ.append(str4);
        H78.LIZLLL("EditMusicStream", new Exception(X1D.LIZIZ(LJ)));
        C43045Guv.LIZLLL(new J9H(this.LJLIL, str3, i, i2, str4), 0L);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music_stream");
        c188727au.LJ(currentTimeMillis, "duration");
        String str5 = "";
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("resource_url", str3);
        String str6 = J9C.LIZIZ;
        if (str6 != null) {
            str5 = str6;
        }
        c188727au.LJIIIZ("resource_id", str5);
        c188727au.LJIIIZ("status", "error");
        c188727au.LIZLLL(i, "error_code");
        if (str4 == null) {
            str4 = "empty_error_msg";
        }
        c188727au.LJIIIZ("error_msg", str4);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        FMX.LJIIL("tool_performance_resource_download", c188727au.LIZ);
        H6X.LIZIZ = null;
    }

    @Override // X.AbstractC36569EWv
    public final void LIZ(String str, int i, int i2, float f, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInfo type=");
        LIZ.append(i);
        LIZ.append(" - msg: ");
        LIZ.append(str2);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ));
        C43045Guv.LIZLLL(new J9D(i, this.LJLIL, str, i2, f, str2), 0L);
    }
}
