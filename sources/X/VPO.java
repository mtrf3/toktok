package X;

import android.graphics.Rect;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Comparator;

/* loaded from: classes15.dex */
public final class VPO implements Comparator {
    public final /* synthetic */ LynxBaseUI LJLIL;
    public final /* synthetic */ VPM LJLILLLLZI;

    public VPO(VPM vpm, LynxBaseUI lynxBaseUI) {
        this.LJLILLLLZI = vpm;
        this.LJLIL = lynxBaseUI;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Rect rect = ((VPQ) obj).LIZIZ;
        Rect rect2 = ((VPQ) obj2).LIZIZ;
        if (this.LJLIL.isAccessibilityDirectionVertical()) {
            int i3 = rect.left - rect2.left;
            int i4 = this.LJLILLLLZI.LJFF;
            int i5 = rect.top;
            if (i4 == 0) {
                i2 = rect2.top;
            } else {
                i5 /= i4;
                i2 = rect2.top / i4;
            }
            int i6 = i5 - i2;
            if (i6 == 0) {
                return i3;
            }
            return i6;
        }
        int i7 = this.LJLILLLLZI.LJ;
        if (i7 == 0) {
            i = rect.left - rect2.left;
        } else {
            i = (rect.left / i7) - (rect2.left / i7);
        }
        int i8 = rect.top - rect2.top;
        if (i == 0) {
            return i8;
        }
        return i;
    }
}
