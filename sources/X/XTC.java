package X;

import android.media.MediaExtractor;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import defpackage.e1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XTC implements InterfaceC84870XSo {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC84870XSo LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public long LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(XTD.LJLIL);

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC84870XSo interfaceC84870XSo = this.LIZJ;
        if (interfaceC84870XSo != null) {
            interfaceC84870XSo.onCancel();
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music");
        c188727au.LJ(currentTimeMillis, "duration");
        c188727au.LIZLLL(2, "status");
        c188727au.LJIIIZ("resource_id", this.LIZ);
        c188727au.LJIIIZ("error_domain", this.LIZIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        iAVMobService.onEventV3("tool_performance_resource_download", c188727au.LIZ);
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        this.LJFF = System.currentTimeMillis();
        InterfaceC84870XSo interfaceC84870XSo = this.LIZJ;
        if (interfaceC84870XSo != null) {
            interfaceC84870XSo.onStart();
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC84870XSo interfaceC84870XSo = this.LIZJ;
        if (interfaceC84870XSo != null) {
            interfaceC84870XSo.LIZ(error);
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "music");
        c188727au.LJ(currentTimeMillis, "duration");
        c188727au.LIZLLL(1, "status");
        c188727au.LJIIIZ("resource_id", this.LIZ);
        c188727au.LJIIIZ("error_domain", this.LIZIZ);
        c188727au.LIZLLL(error.getErrorCode(), "error_code");
        String errorMsg = error.getErrorMsg();
        if (errorMsg == null) {
            errorMsg = "empty_error_msg";
        }
        c188727au.LJIIIZ("error_msg", errorMsg);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("from", this.LJ);
        iAVMobService.onEventV3("tool_performance_resource_download", c188727au.LIZ);
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        InterfaceC84870XSo interfaceC84870XSo = this.LIZJ;
        if (interfaceC84870XSo != null) {
            interfaceC84870XSo.onProgress(i);
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC84870XSo interfaceC84870XSo = this.LIZJ;
        if (interfaceC84870XSo != null) {
            interfaceC84870XSo.LIZIZ(musicFile, musicWaveBean, bool);
        }
        C188727au c188727au = new C188727au();
        int i = 1;
        if (e1.LIZ(31744, "creative_tools_enable_mob_loudness_and_bitrate", true, true)) {
            try {
                c188727au.LJ(new File(musicFile).length(), "file_size");
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(musicFile);
                c188727au.LIZLLL(mediaExtractor.getTrackFormat(0).getInteger("bitrate"), "file_bitrate");
            } catch (Exception unused) {
            }
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        c188727au.LJIIIZ("resource_type", "music");
        c188727au.LJ(currentTimeMillis, "duration");
        c188727au.LIZLLL(0, "status");
        c188727au.LJIIIZ("resource_id", this.LIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJFF(bool, "isSuccessByCache");
        c188727au.LJIIIZ("from", this.LJ);
        if (o.LJ(bool, Boolean.FALSE)) {
            i = 0;
        } else if (!o.LJ(bool, Boolean.TRUE)) {
            if (bool == null) {
                i = 2;
            } else {
                throw new C162476Zf();
            }
        }
        c188727au.LIZLLL(i, "begin_status");
        iAVMobService.onEventV3("tool_performance_resource_download", c188727au.LIZ);
    }

    public XTC(String str, String str2, InterfaceC84870XSo interfaceC84870XSo, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC84870XSo;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
