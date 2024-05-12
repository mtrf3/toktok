package X;

import android.view.View;

/* renamed from: X.Vh1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80403Vh1 extends C16120kC {
    public final /* synthetic */ C80401Vgz LIZ;

    public C80403Vh1(C80401Vgz c80401Vgz) {
        this.LIZ = c80401Vgz;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        C80401Vgz c80401Vgz = this.LIZ;
        c80401Vgz.getClass();
        if (view instanceof C80400Vgy) {
            i = 0;
            for (int i2 = 0; i2 < c80401Vgz.getChildCount(); i2++) {
                if (c80401Vgz.getChildAt(i2) == view) {
                    break;
                }
                if ((c80401Vgz.getChildAt(i2) instanceof C80400Vgy) && c80401Vgz.LJ(i2)) {
                    i++;
                }
            }
        }
        i = -1;
        c17760mq.LJIIZILJ(C17740mo.LIZ(0, 1, i, 1, ((C80400Vgy) view).isChecked()));
    }
}
