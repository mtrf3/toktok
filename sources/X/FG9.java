package X;

import com.ss.android.ugc.aweme.audiomode.legoimpl.AudioSDKABLegoLauncherTaskImpl;
import com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi;

/* loaded from: classes7.dex */
public final class FG9 implements IAudioSDKABLegoLaunchTaskApi {
    public static final FG9 LIZIZ = new FG9();
    public final /* synthetic */ IAudioSDKABLegoLaunchTaskApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    public FG9() {
        IAudioSDKABLegoLaunchTaskApi iAudioSDKABLegoLaunchTaskApi;
        Object LIZ = C58096Mr6.LIZ(IAudioSDKABLegoLaunchTaskApi.class, false);
        if (LIZ != null) {
            iAudioSDKABLegoLaunchTaskApi = (IAudioSDKABLegoLaunchTaskApi) LIZ;
        } else {
            if (C58096Mr6.LLILZLL == null) {
                synchronized (IAudioSDKABLegoLaunchTaskApi.class) {
                    if (C58096Mr6.LLILZLL == null) {
                        C58096Mr6.LLILZLL = new AudioSDKABLegoLauncherTaskImpl();
                    }
                }
            }
            iAudioSDKABLegoLaunchTaskApi = C58096Mr6.LLILZLL;
        }
        this.LIZ = iAudioSDKABLegoLaunchTaskApi;
    }
}
