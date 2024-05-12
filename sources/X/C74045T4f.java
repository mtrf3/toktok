package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.T4f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74045T4f extends FrameLayout {
    public KEI LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxIconView LJLJI;
    public final /* synthetic */ C74053T4n LJLJJI;

    public final int getContentHeight() {
        int i = 0;
        Object[] objArr = {this.LJLILLLLZI, this.LJLJI};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = (View) objArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return i2 - i3;
    }

    public final int getContentWidth() {
        int i = 0;
        Object[] objArr = {this.LJLILLLLZI, this.LJLJI};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = (View) objArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return i2 - i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r1 == r3.LIZLLL) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74045T4f.LIZ():void");
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        KEI kei = this.LJLIL;
        if (kei != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            kei.LIZ();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        KEI kei = this.LJLIL;
        if (kei == null) {
            return;
        }
        C17760mq c17760mq = new C17760mq(info);
        c17760mq.LJIIZILJ(C17740mo.LIZ(0, 1, kei.LIZLLL, 1, isSelected()));
        if (isSelected()) {
            c17760mq.LJIILL(false);
            c17760mq.LJII(C17720mm.LJI);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setSelected(z);
    }

    public final void setTab(KEI kei) {
        if (kei != this.LJLIL) {
            this.LJLIL = kei;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74045T4f(C74053T4n c74053T4n, Context context) {
        super(context);
        this.LJLJJI = c74053T4n;
        new LinkedHashMap();
        setClickable(true);
    }
}
