package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0G7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0G7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, LiveEffect liveEffect, boolean z, long j) {
        if (V0Q.Default.nextFloat() < 0.002f) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_sticker_cover_download_time");
            LIZ2.LJIILLIIL(dataChannel);
            C77412UZs.LJJIIZ(LIZ2, liveEffect);
            LIZ2.LJIJJ(liveEffect.effectPanelKey, "tab");
            LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
            C30869C9p.LIZ(j, LIZ2, "use_time");
        }
    }
}
