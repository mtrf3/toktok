package X;

import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import defpackage.e1;

/* renamed from: X.Wuz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83817Wuz extends C83615Wrj {
    public final /* synthetic */ byte LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final boolean LJJIIZI() {
        return true;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final VECameraSettings.CAMERA_MODE_TYPE LIZLLL() {
        if (this.LJLJI == 2 && !e1.LIZ(31744, "now_use_video_mode", true, false)) {
            return VECameraSettings.CAMERA_MODE_TYPE.IMAGE_MODE;
        }
        return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final boolean LJI() {
        return C19N.LJ("enable_release_capture_result", true);
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final int LJII() {
        return Q7K.LIZIZ("start_preview_retry_count", 0);
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final int[] LJIILIIL() {
        return C44655Hfn.LIZJ(this.LJLJI);
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final int[] LJIILL() {
        return C44655Hfn.LIZIZ(this.LJLJI);
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final boolean LJJII() {
        if (this.LJLJI == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final boolean LJJIIJ() {
        if (this.LJLJI == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final int LJJIIJZLJL() {
        return Q7K.LIZIZ("open_camera_retry_count", 10);
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final int[] LJIIJ() {
        return LJIILIIL();
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final byte LJIIIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C78588Usq, X.InterfaceC83931Wwp
    public final VEDisplaySettings LJJIII(VESize vESize) {
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
        builder.setFitMode(EnumC84107Wzf.SCALE_MODE_CENTER_CROP);
        builder.setRenderSize(vESize);
        return builder.build();
    }

    public C83817Wuz(byte b, int i, int i2) {
        this.LJLILLLLZI = b;
        this.LJLJI = i2;
    }
}
