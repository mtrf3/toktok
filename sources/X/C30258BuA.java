package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;

/* renamed from: X.BuA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30258BuA {
    public static final java.util.Map<DataChannel, C30240Bts> LIZ = new LinkedHashMap();

    public static EnumC30259BuB LIZ(C30261BuD c30261BuD) {
        int i = C30257Bu9.LIZ[c30261BuD.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EnumC30259BuB.LANDSCAPE_ICON;
            }
            throw new C162476Zf();
        }
        if (ToolBarButtonWithTextExperiment.hasText()) {
            return EnumC30259BuB.ICON_WITH_TEXT;
        }
        return EnumC30259BuB.ICON;
    }
}
