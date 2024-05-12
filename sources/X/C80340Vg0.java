package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* renamed from: X.Vg0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80340Vg0 extends C80317Vfd {
    public final /* synthetic */ C80342Vg2 LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80340Vg0(C80342Vg2 c80342Vg2, C80315Vfb c80315Vfb) {
        super(c80315Vfb);
        this.LIZIZ = c80342Vg2;
    }

    @Override // X.C80317Vfd, X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (this.LIZIZ.LIZ.getEditText().getKeyListener() == null) {
            c17760mq.LJIILJJIL(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (!c17760mq.LIZ.isShowingHintText()) {
                return;
            }
        } else {
            Bundle extras = c17760mq.LIZ.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                return;
            }
        }
        c17760mq.LJJ(null);
    }

    @Override // X.C16120kC
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        EditText editText = this.LIZIZ.LIZ.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() != 1 || !this.LIZIZ.LJIILIIL.isTouchExplorationEnabled() || this.LIZIZ.LIZ.getEditText().getKeyListener() != null) {
                return;
            }
            this.LIZIZ.LJFF(autoCompleteTextView);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
