package X;

import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168106ik {
    public FrameLayout LIZ;
    public YAB LIZIZ;

    public final void LIZ(int i, List list) {
        boolean z;
        ArrayList LJ = AnonymousClass391.LJ(list, "texts");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Effect effect = (Effect) ListProtector.get(list, i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            LJ.add(new SGH(effect, z));
        }
        YAB yab = this.LIZIZ;
        if (yab != null) {
            yab.LJLIL.post(new YAC(yab, i, LJ));
        }
    }
}
