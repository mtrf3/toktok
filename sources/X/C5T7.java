package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEAudioRecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.5T7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T7 {
    public boolean LIZ;
    public boolean LIZIZ;
    public final VEAudioRecorder LIZJ = new VEAudioRecorder();

    public final long LIZJ(Cert cert) {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
        this.LIZ = false;
        if (cert == null) {
            return this.LIZJ.stopRecord();
        }
        return this.LIZJ.stopRecord(cert);
    }

    public static void LIZ(C5T7 c5t7, String wavPath, int i) {
        VEAudioEncodeSettings Build = new VEAudioEncodeSettings.Builder().Build();
        o.LJIIIIZZ(Build, "Builder().Build()");
        o.LJIIIZ(wavPath, "wavPath");
        c5t7.LIZJ.init(wavPath, Build, i);
    }

    public final int LIZIZ(int i, int i2, Cert cert) {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZ();
        this.LIZ = true;
        if (cert == null) {
            return this.LIZJ.startRecord(1.0f, i, i2);
        }
        return this.LIZJ.startRecord(1.0f, i, i2, cert);
    }
}
