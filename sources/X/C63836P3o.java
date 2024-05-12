package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: X.P3o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63836P3o {
    static {
        C16880lQ.LJLLJ(C63836P3o.class);
    }

    public static EnumC63837P3p LIZ() {
        boolean[] zArr = new boolean[EnumC63837P3p.values().length];
        int ordinal = EnumC63837P3p.BLUETOOTH.ordinal();
        int ordinal2 = EnumC63837P3p.WIRED.ordinal();
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) C16880lQ.LLILL(VERuntime.getInstance().getContext(), "audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                zArr[ordinal] = true;
            } else if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                zArr[ordinal2] = true;
            }
        }
        if (zArr[ordinal2]) {
            return EnumC63837P3p.WIRED;
        }
        if (zArr[ordinal]) {
            return EnumC63837P3p.BLUETOOTH;
        }
        return EnumC63837P3p.DEFAULT;
    }
}
