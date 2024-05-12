package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.0We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC08800We implements Runnable {
    public final DataChannel LJLIL;
    public final boolean LJLILLLLZI;
    public final LiveEffect LJLJI;
    public final float LJLJJI;
    public final boolean LJLJJL;

    public final void LIZ() {
        Integer num;
        String str;
        if (C78880UxY.LJJL(this.LJLJI)) {
            return;
        }
        String str2 = this.LJLJI.effectPanelKey;
        if (str2 != null) {
            C32011Nl.LJIIIZ.add(str2);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_beauty_effective_use");
        LIZ.LJIILLIIL(this.LJLIL);
        LiveEffect.ComposerConfig smallItemConfig = this.LJLJI.getSmallItemConfig();
        Integer num2 = null;
        if (smallItemConfig != null) {
            num = Integer.valueOf(smallItemConfig.LIZ);
        } else {
            num = null;
        }
        LiveEffect.ComposerConfig smallItemConfig2 = this.LJLJI.getSmallItemConfig();
        if (smallItemConfig2 != null) {
            num2 = Integer.valueOf(smallItemConfig2.LIZIZ);
        }
        LIZ.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
        LIZ.LJIJJ(Integer.valueOf(this.LJLILLLLZI ? 1 : 0), "is_live_take_default");
        LIZ.LJIL("beauty_value", Float.valueOf(this.LJLJJI));
        if (this.LJLJJL) {
            str = "makeup";
        } else {
            str = "normal";
        }
        LIZ.LJIJJ(str, "beauty_status");
        C32011Nl.LJII(LIZ, this.LJLJI);
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

    public RunnableC08800We(DataChannel dataChannel, boolean z, LiveEffect liveEffect, float f, boolean z2) {
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = z;
        this.LJLJI = liveEffect;
        this.LJLJJI = f;
        this.LJLJJL = z2;
    }
}
