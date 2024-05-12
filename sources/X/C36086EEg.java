package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EEg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36086EEg implements InterfaceC34890Dmg {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ InterfaceC36087EEh LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.InterfaceC34890Dmg
    public final void LIZ(HashMap<String, Integer> durationMaps) {
        o.LJIIIZ(durationMaps, "durationMaps");
        Collection<Integer> values = durationMaps.values();
        o.LJIIIIZZ(values, "durationMaps.values");
        C76732zl c76732zl = this.LIZ;
        for (Integer num : values) {
            if (num == null || num.intValue() != 0) {
                c76732zl.element = (num.intValue() / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1 + c76732zl.element;
            } else {
                c76732zl.element++;
            }
        }
        int i = this.LIZ.element;
        if (i == 0) {
            this.LIZIZ.LIZ(false);
        } else if (Math.abs(this.LIZJ - i) > 3) {
            this.LIZIZ.LIZ(false);
        } else {
            this.LIZIZ.LIZ(true);
        }
    }

    public C36086EEg(C76732zl c76732zl, HGM hgm, int i) {
        this.LIZ = c76732zl;
        this.LIZIZ = hgm;
        this.LIZJ = i;
    }
}
