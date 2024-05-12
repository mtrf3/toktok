package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YTV extends AudioDeviceCallback {
    public final AudioManager LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87430YTa.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(YTY.LJLIL);

    public final java.util.Map<String, Boolean> LIZ() {
        return (java.util.Map) this.LIZJ.getValue();
    }

    public YTV(AudioManager audioManager) {
        this.LIZ = audioManager;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(audioDeviceInfoArr);
            while (LJJIIJZLJL.hasNext()) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) LJJIIJZLJL.next();
                int type = audioDeviceInfo.getType();
                C62822Ol8 c62822Ol8 = C2YX.LIZ;
                boolean contains = ((List) c62822Ol8.getValue()).contains(Integer.valueOf(type));
                C87434YTe LIZ = YTW.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("audio device connected, is supported device: ");
                LIZ2.append(contains);
                LIZ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                AudioManager audioManager = this.LIZ;
                if (audioManager != null) {
                    try {
                        if (C61780OMm.LJI) {
                            continue;
                        } else if (audioManager.getMode() != 0) {
                            continue;
                        } else if (!audioDeviceInfo.isSink()) {
                            continue;
                        } else {
                            if (((List) c62822Ol8.getValue()).contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                if (audioDeviceInfo.getType() == 7) {
                                    if (audioManager.isBluetoothScoOn() && audioManager.isBluetoothScoAvailableOffCall()) {
                                    }
                                }
                                EarphonePlayerControl.LJII().LJFF(false);
                                for (InterfaceC87433YTd interfaceC87433YTd : (java.util.Set) this.LIZIZ.getValue()) {
                                    YTW.LIZIZ(LIZ().get(interfaceC87433YTd.LIZIZ()), interfaceC87433YTd.LIZIZ());
                                    if (o.LJ(LIZ().get(interfaceC87433YTd.LIZIZ()), Boolean.TRUE)) {
                                        interfaceC87433YTd.LIZ();
                                    }
                                }
                                return;
                            }
                            continue;
                        }
                    } catch (Exception e) {
                        C87434YTe LIZ3 = YTW.LIZ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("exception: ");
                        LIZ4.append(e);
                        LIZ3.LJIIIIZZ(X1D.LIZIZ(LIZ4));
                    }
                }
            }
        }
    }
}
