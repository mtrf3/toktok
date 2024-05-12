package X;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16120kC {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    public C16120kC() {
        this(DEFAULT_DELEGATE);
    }

    public C16120kC(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C16080k8(this);
    }

    public static List<C17720mm> getActionList(View view) {
        List<C17720mm> list = (List) view.getTag(R.id.kzp);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public C17780ms getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider LIZ = C16090k9.LIZ(this.mOriginalDelegate, view);
        if (LIZ != null) {
            return new C17780ms(LIZ);
        }
        return null;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan2 : clickableSpanArr) {
                        if (clickableSpan.equals(clickableSpan2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        Reference reference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.kzq);
        if (sparseArray != null && (reference = (Reference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) reference.get();
            if (isSpanStillValid(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c17760mq.LIZ);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C17720mm> actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C17720mm c17720mm = (C17720mm) ListProtector.get(actionList, i2);
            if (c17720mm.LIZ() == i) {
                if (c17720mm.LIZLLL != null) {
                    Class<? extends AbstractC17820mw> cls = c17720mm.LIZJ;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception unused) {
                        }
                    }
                    boolean LIZ = c17720mm.LIZLLL.LIZ(view);
                    if (LIZ) {
                        return LIZ;
                    }
                }
            } else {
                i2++;
            }
        }
        boolean LIZIZ = C16090k9.LIZIZ(this.mOriginalDelegate, view, i, bundle);
        if (!LIZIZ && i == R.id.ly && bundle != null) {
            return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return LIZIZ;
    }
}
