package X;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T4d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74043T4d extends AbstractC38761fc {
    public final C74042T4c LJIILIIL;
    public final Rect LJIILJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74043T4d(C74042T4c slider) {
        super(slider);
        o.LJIIIZ(slider, "slider");
        this.LJIILIIL = slider;
        this.LJIILJJIL = new Rect();
    }

    @Override // X.AbstractC38761fc
    public final void LIZJ(List<Integer> list) {
        ((ArrayList) list).add(0);
    }

    @Override // X.AbstractC38761fc
    public final boolean LJFF(int i, int i2) {
        if (!this.LJIILIIL.isEnabled()) {
            return false;
        }
        if (i2 != 4096) {
            if (i2 != 8192) {
                return false;
            }
            C74042T4c c74042T4c = this.LJIILIIL;
            c74042T4c.setIndicator(c74042T4c.getIndicator() - 1);
            sendAccessibilityEvent(this.LJIILIIL, 4);
        } else {
            C74042T4c c74042T4c2 = this.LJIILIIL;
            c74042T4c2.setIndicator(c74042T4c2.getIndicator() + 1);
            sendAccessibilityEvent(this.LJIILIIL, 4);
        }
        return true;
    }

    @Override // X.AbstractC38761fc
    public final void LJII(int i, C17760mq c17760mq) {
        c17760mq.LIZIZ(C17720mm.LJIJ);
        int valueFrom = this.LJIILIIL.getValueFrom();
        int valueTo = this.LJIILIIL.getValueTo();
        if (this.LJIILIIL.isEnabled()) {
            c17760mq.LIZ(FileUtils.BUFFER_SIZE);
            c17760mq.LIZ(4096);
        }
        c17760mq.LIZ.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, this.LJIILIIL.getIndicator()));
        c17760mq.LJIILJJIL(SeekBar.class.getName());
        c17760mq.LJIJ("");
        C74042T4c c74042T4c = this.LJIILIIL;
        Rect virtualViewBounds = this.LJIILJJIL;
        c74042T4c.getClass();
        o.LJIIIZ(virtualViewBounds, "virtualViewBounds");
        int i2 = c74042T4c.LLF;
        int i3 = c74042T4c.LJLLJ;
        int i4 = c74042T4c.LLFII;
        virtualViewBounds.set(i2 - i3, i4 - i3, i2 + c74042T4c.LLFFF + i3, i4 + i3);
        c17760mq.LJIIJ(this.LJIILJJIL);
    }
}
