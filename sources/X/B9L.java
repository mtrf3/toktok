package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class B9L extends AbstractC62607Ohf {
    public final DataChannel LIZ;

    @Override // X.AbstractC62607Ohf
    public final String LJ() {
        return "definition_selection_key";
    }

    @Override // X.AbstractC62607Ohf
    public final int LJFF() {
        return R.string.k10;
    }

    @Override // X.AbstractC62607Ohf
    public final int LJI() {
        return 1000;
    }

    @Override // X.AbstractC62607Ohf
    public final boolean LIZ() {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLLZLLLI;
        boolean z = !c48459J0d.LIZJ().booleanValue();
        c48459J0d.LIZ(Boolean.TRUE);
        if (LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    @Override // X.AbstractC62607Ohf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B9L.LIZLLL():int");
    }

    public B9L(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.AbstractC62607Ohf
    public final void LIZJ(Context context, C29930Bos c29930Bos) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            B9F.LIZ(fragmentManager, false);
        }
    }
}
