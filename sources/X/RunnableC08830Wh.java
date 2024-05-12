package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.0Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC08830Wh implements Runnable {
    public final DataChannel LJLIL;
    public final LiveEffect LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;

    public final void LIZ() {
        Integer num;
        String str = this.LJLILLLLZI.effectPanelKey;
        if (str != null) {
            C42151l5.LJIIJ.add(str);
        }
        C42151l5.LJII("ReportBeautyEffectiveUseRunnable", "report effective use");
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_connection_beauty_effective_use");
        LIZ.LJIILLIIL(this.LJLIL);
        LiveEffect.ComposerConfig smallItemConfig = this.LJLILLLLZI.getSmallItemConfig();
        Integer num2 = null;
        if (smallItemConfig != null) {
            num = Integer.valueOf(smallItemConfig.LIZ);
        } else {
            num = null;
        }
        LiveEffect.ComposerConfig smallItemConfig2 = this.LJLILLLLZI.getSmallItemConfig();
        if (smallItemConfig2 != null) {
            num2 = Integer.valueOf(smallItemConfig2.LIZIZ);
        }
        LIZ.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJJI), "event_scene");
        LIZ.LJIL("beauty_value", Float.valueOf(this.LJLJI));
        LIZ.LJJIFFI(C42151l5.LJIIL);
        C77412UZs.LJJIIZ(LIZ, this.LJLILLLLZI);
        LIZ.LJII(C50341yI.LJLIL);
        LIZ.LJJIIJZLJL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC08830Wh(DataChannel dataChannel, LiveEffect liveEffect, float f, int i) {
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = liveEffect;
        this.LJLJI = f;
        this.LJLJJI = i;
    }
}
