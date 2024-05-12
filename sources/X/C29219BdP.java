package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;

/* renamed from: X.BdP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29219BdP {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, InterfaceC21020s6 interfaceC21020s6) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT >= 29 && interfaceC21020s6 != null) {
            AudioDeviceModule LJII = interfaceC21020s6.LJII();
            if (LJII != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("adm, isMicOccupiedSilenced: ");
                LIZ2.append(LJII.isMicOccupiedSilenced());
                C0NB.LJIIIZ("MicrophoneStateDetectionUtil", X1D.LIZIZ(LIZ2));
                return LJII.isMicOccupiedSilenced();
            }
            C0NB.LJIIIZ("MicrophoneStateDetectionUtil", "adm is null");
            return false;
        }
        if (context == null) {
            return false;
        }
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.OB() | iInteractService.ta0()) {
            return false;
        }
        Object LLILL = C16880lQ.LLILL(context, "audio");
        if (!(LLILL instanceof AudioManager) || (audioManager = (AudioManager) LLILL) == null) {
            return false;
        }
        if (audioManager.getMode() != 3 && audioManager.getMode() != 2) {
            return false;
        }
        return true;
    }
}
