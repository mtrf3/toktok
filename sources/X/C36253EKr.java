package X;

import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;

/* renamed from: X.EKr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36253EKr {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C36250EKo.LJLIL);

    public static final PlayeAbBufferConfigData LIZIZ() {
        return (PlayeAbBufferConfigData) LIZ.getValue();
    }

    public static final void LIZ(PlayeAbBufferConfigData playeAbBufferConfigData, m mVar) {
        int i;
        int i2;
        int i3;
        float f;
        j LJJIJ = mVar.LJJIJ("interactionBlockDurationPreloaded");
        int i4 = 200;
        if (LJJIJ != null) {
            i = LJJIJ.LJIILJJIL();
        } else {
            i = 200;
        }
        j LJJIJ2 = mVar.LJJIJ("interactionBlockDurationNonPreloaded");
        if (LJJIJ2 != null) {
            i2 = LJJIJ2.LJIILJJIL();
        } else {
            i2 = 1000;
        }
        j LJJIJ3 = mVar.LJJIJ("netBlockDurationMax");
        if (LJJIJ3 != null) {
            i3 = LJJIJ3.LJIILJJIL();
        } else {
            i3 = 5000;
        }
        j LJJIJ4 = mVar.LJJIJ("netBlockIncFactor");
        if (LJJIJ4 != null) {
            f = LJJIJ4.LJIIJ();
        } else {
            f = 9.0f;
        }
        j LJJIJ5 = mVar.LJJIJ("netBlockDurationInitial");
        if (LJJIJ5 != null) {
            i4 = LJJIJ5.LJIILJJIL();
        }
        playeAbBufferConfigData.setInteractionBlockDurationPreloaded(i);
        playeAbBufferConfigData.setInteractionBlockDurationNonPreloaded(i2);
        playeAbBufferConfigData.setNetBlockDurationMax(i3);
        playeAbBufferConfigData.setNetBlockIncFactor(f);
        playeAbBufferConfigData.setNetBlockDurationInitial(i4);
    }
}
