package X;

import com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService;

/* loaded from: classes15.dex */
public final class VY2 {
    public static ILiveGiftPlayerService LIZ;

    public static ILiveGiftPlayerService LIZ() {
        if (LIZ == null) {
            LIZ = (ILiveGiftPlayerService) CN1.LIZ(ILiveGiftPlayerService.class);
        }
        return LIZ;
    }
}
