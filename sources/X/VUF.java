package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;

/* loaded from: classes15.dex */
public class VUF extends C16120kC {
    public final /* synthetic */ UIScrollView LIZ;

    public VUF(UIScrollView uIScrollView) {
        this.LIZ = uIScrollView;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        int LJJII = this.LIZ.LJJII();
        if (this.LIZ.LJZ && LJJII > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(((VUG) this.LIZ.mView).getRealScrollX());
        accessibilityEvent.setScrollY(((VUG) this.LIZ.mView).getRealScrollY());
        UIScrollView uIScrollView = this.LIZ;
        if (uIScrollView.LJLIL) {
            accessibilityEvent.setMaxScrollX(((VUG) uIScrollView.mView).getRealScrollX());
            accessibilityEvent.setMaxScrollY(LJJII);
        } else {
            accessibilityEvent.setMaxScrollX(LJJII);
            accessibilityEvent.setMaxScrollY(((VUG) this.LIZ.mView).getRealScrollY());
        }
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        int LJJII = this.LIZ.LJJII();
        if (this.LIZ.LJZ && LJJII > 0) {
            z = true;
        } else {
            z = false;
        }
        c17760mq.LJJII(z);
        if (z) {
            UIScrollView uIScrollView = this.LIZ;
            if (uIScrollView.LJLIL) {
                if (((VUG) uIScrollView.mView).getRealScrollY() > 0) {
                    c17760mq.LIZIZ(C17720mm.LJIIJ);
                    return;
                } else {
                    if (((VUG) this.LIZ.mView).getRealScrollY() >= LJJII) {
                        return;
                    }
                    c17760mq.LIZIZ(C17720mm.LJIIIZ);
                    return;
                }
            }
            if (((VUG) uIScrollView.mView).getRealScrollX() > 0) {
                c17760mq.LIZIZ(C17720mm.LJIIJ);
            } else {
                if (((VUG) this.LIZ.mView).getRealScrollX() >= LJJII) {
                    return;
                }
                c17760mq.LIZIZ(C17720mm.LJIIIZ);
            }
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int LJJIII = this.LIZ.LJJIII();
        int LJJII = this.LIZ.LJJII();
        UIScrollView uIScrollView = this.LIZ;
        if (!uIScrollView.LJZ || LJJII <= 0) {
            return false;
        }
        int realScrollX = ((VUG) uIScrollView.mView).getRealScrollX();
        int realScrollY = ((VUG) this.LIZ.mView).getRealScrollY();
        if (i != 4096) {
            if (i != 8192) {
                return false;
            }
            if (this.LIZ.LJLIL) {
                int max = Math.max(realScrollY - (LJJIII / 2), 0);
                if (max != realScrollY) {
                    ((VUG) this.LIZ.mView).LJFF(0, max, true);
                }
            } else {
                int max2 = Math.max(realScrollX - (LJJIII / 2), 0);
                if (max2 != realScrollX) {
                    ((VUG) this.LIZ.mView).LJFF(max2, 0, true);
                }
            }
            return true;
        }
        if (this.LIZ.LJLIL) {
            int min = Math.min((LJJIII / 2) + realScrollY, LJJII);
            if (min != realScrollY) {
                ((VUG) this.LIZ.mView).LJFF(0, min, true);
            }
        } else {
            int min2 = Math.min((LJJIII / 2) + realScrollX, LJJII);
            if (min2 != realScrollX) {
                ((VUG) this.LIZ.mView).LJFF(min2, 0, true);
            }
        }
        return true;
    }
}
