package X;

import com.ss.ttlivestreamer.core.capture.audio.AudioFocusChangedCallBackInfo;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38591fL implements AudioDeviceModule.AudioFocusChangedCallBack {
    public static final C38591fL LIZ = new C38591fL();

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioFocusChangedCallBack
    public final void onRecordingConfigChanged(List<AudioFocusChangedCallBackInfo.RecordCallbackInfo> list) {
        boolean z;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("byte audio AudioFocusChangedCallBack configs.size:");
            LIZ2.append(list.size());
            C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
        }
        if (list.size() > 1) {
            for (AudioFocusChangedCallBackInfo.RecordCallbackInfo recordCallbackInfo : list) {
                if (recordCallbackInfo.isBySelf == 1) {
                    if (recordCallbackInfo.isClientSilenced != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LJI = JBR.LJI("byte audio AudioFocusChangedCallBack focus:", z, ", isRunning: ");
                        FT5.LJ(LJI, AnonymousClass147.LIZJ, LJI, "AudioRecordFocusManager");
                    }
                    if (AnonymousClass147.LIZJ && z != AnonymousClass147.LIZLLL) {
                        if (z) {
                            Iterator<AnonymousClass144> it = AnonymousClass147.LJII.iterator();
                            while (it.hasNext()) {
                                it.next().LIZ();
                            }
                        } else {
                            Iterator<AnonymousClass144> it2 = AnonymousClass147.LJII.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZIZ();
                            }
                        }
                    }
                    AnonymousClass147.LIZLLL = z;
                }
            }
        }
    }
}
