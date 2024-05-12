package X;

import android.content.Context;
import com.bytedance.android.livesdk.LandscapeFullScreenEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9N extends AbstractC62607Ohf {
    public final DataChannel LIZ;
    public boolean LIZIZ;

    @Override // X.AbstractC62607Ohf
    public final String LJ() {
        return "key_video_fullscreen_center_crop";
    }

    @Override // X.AbstractC62607Ohf
    public final int LJI() {
        return 0;
    }

    @Override // X.AbstractC62607Ohf
    public final boolean LIZ() {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLII;
        boolean z = !c48459J0d.LIZJ().booleanValue();
        if (z) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        if (LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            return false;
        }
        return z;
    }

    @Override // X.AbstractC62607Ohf
    public final int LIZLLL() {
        if (!this.LIZIZ) {
            return R.raw.icon_2pt_full_screen;
        }
        return R.raw.icon_2pt_arrows_to_center;
    }

    @Override // X.AbstractC62607Ohf
    public final int LJFF() {
        if (this.LIZIZ) {
            return R.string.nqj;
        }
        return R.string.nqk;
    }

    public B9N(DataChannel dataChannel) {
        boolean z;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
        Boolean bool = (Boolean) dataChannel.kv0(BCS.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LIZIZ = z;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.AbstractC62607Ohf
    public final void LIZJ(Context context, C29930Bos c29930Bos) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            boolean z = !this.LIZIZ;
            this.LIZIZ = z;
            ((C32537Cpp) dataChannel.gv0(BCS.class)).LIZ = Boolean.valueOf(z);
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(LandscapeFullScreenEvent.class, new C2308394d(this.LIZIZ, true));
            }
        }
        DataChannel dataChannel3 = this.LIZ;
        boolean z2 = this.LIZIZ;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_user_adaptive_screen");
        LIZ.LJIILLIIL(dataChannel3);
        LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_expand");
        LIZ.LJJIIJZLJL();
    }
}
