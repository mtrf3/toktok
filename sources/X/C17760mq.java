package X;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17760mq {
    public static int LIZLLL;
    public final AccessibilityNodeInfo LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;

    public final CharSequence LJ() {
        return this.LIZ.getContentDescription();
    }

    public final CharSequence LJFF() {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.LIZ.getStateDescription();
        }
        return this.LIZ.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public final CharSequence LJI() {
        if (!LIZJ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> LIZJ = LIZJ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> LIZJ2 = LIZJ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> LIZJ3 = LIZJ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> LIZJ4 = LIZJ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.LIZ.getText(), 0, this.LIZ.getText().length()));
            for (int i = 0; i < LIZJ.size(); i++) {
                final int intValue = ((Integer) ListProtector.get(LIZJ4, i)).intValue();
                final int i2 = this.LIZ.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
                spannableString.setSpan(new ClickableSpan(intValue, this, i2) { // from class: X.0mh
                    public final int LJLIL;
                    public final C17760mq LJLILLLLZI;
                    public final int LJLJI;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.LJLIL);
                        C17760mq c17760mq = this.LJLILLLLZI;
                        c17760mq.LIZ.performAction(this.LJLJI, bundle);
                    }

                    {
                        this.LJLIL = intValue;
                        this.LJLILLLLZI = this;
                        this.LJLJI = i2;
                    }
                }, ((Integer) ListProtector.get(LIZJ, i)).intValue(), ((Integer) ListProtector.get(LIZJ2, i)).intValue(), ((Integer) ListProtector.get(LIZJ3, i)).intValue());
            }
            return spannableString;
        }
        return this.LIZ.getText();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.LIZ;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final String toString() {
        ?? emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        LIZLLL(rect);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("; boundsInParent: ");
        LIZ.append(rect);
        sb.append(X1D.LIZIZ(LIZ));
        this.LIZ.getBoundsInScreen(rect);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("; boundsInScreen: ");
        LIZ2.append(rect);
        sb.append(X1D.LIZIZ(LIZ2));
        sb.append("; packageName: ");
        sb.append(this.LIZ.getPackageName());
        sb.append("; className: ");
        sb.append(this.LIZ.getClassName());
        sb.append("; text: ");
        sb.append(LJI());
        sb.append("; contentDescription: ");
        sb.append(LJ());
        sb.append("; viewId: ");
        sb.append(this.LIZ.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.LIZ.isCheckable());
        sb.append("; checked: ");
        sb.append(this.LIZ.isChecked());
        sb.append("; focusable: ");
        sb.append(this.LIZ.isFocusable());
        sb.append("; focused: ");
        sb.append(this.LIZ.isFocused());
        sb.append("; selected: ");
        sb.append(this.LIZ.isSelected());
        sb.append("; clickable: ");
        sb.append(this.LIZ.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.LIZ.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.LIZ.isEnabled());
        sb.append("; password: ");
        sb.append(this.LIZ.isPassword());
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("; scrollable: ");
        LIZ3.append(this.LIZ.isScrollable());
        sb.append(X1D.LIZIZ(LIZ3));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.LIZ.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new C17720mm(ListProtector.get(actionList, i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            C17720mm c17720mm = (C17720mm) ListProtector.get(emptyList, i2);
            int LIZ4 = c17720mm.LIZ();
            if (LIZ4 != 1) {
                if (LIZ4 != 2) {
                    switch (LIZ4) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case FileUtils.BUFFER_SIZE /* 8192 */:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case R.id.accessibilityActionMoveWindow:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        case R.id.accessibilityActionImeEnter:
                            str = "ACTION_IME_ENTER";
                            break;
                        default:
                            switch (LIZ4) {
                                case R.id.accessibilityActionShowOnScreen:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case R.id.accessibilityActionScrollToPosition:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case R.id.accessibilityActionScrollUp:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case R.id.accessibilityActionScrollLeft:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case R.id.accessibilityActionScrollDown:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case R.id.accessibilityActionScrollRight:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case R.id.accessibilityActionContextClick:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (LIZ4) {
                                        case R.id.accessibilityActionShowTooltip:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionHideTooltip:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionPageUp:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case R.id.accessibilityActionPageDown:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case R.id.accessibilityActionPageLeft:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case R.id.accessibilityActionPageRight:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case R.id.accessibilityActionPressAndHold:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            str = "ACTION_UNKNOWN";
                                            break;
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) c17720mm.LIZ).getLabel() != null) {
                str = ((AccessibilityNodeInfo.AccessibilityAction) c17720mm.LIZ).getLabel().toString();
            }
            sb.append(str);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public C17760mq(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.LIZ = accessibilityNodeInfo;
    }

    public final void LIZ(int i) {
        this.LIZ.addAction(i);
    }

    public final void LIZIZ(C17720mm c17720mm) {
        this.LIZ.addAction((AccessibilityNodeInfo.AccessibilityAction) c17720mm.LIZ);
    }

    public final List<Integer> LIZJ(String str) {
        ArrayList<Integer> integerArrayList = this.LIZ.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.LIZ.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void LIZLLL(Rect rect) {
        this.LIZ.getBoundsInParent(rect);
    }

    public final void LJII(C17720mm c17720mm) {
        this.LIZ.removeAction((AccessibilityNodeInfo.AccessibilityAction) c17720mm.LIZ);
    }

    public final void LJIIIIZZ(boolean z) {
        this.LIZ.setAccessibilityFocused(z);
    }

    public final void LJIIJ(Rect rect) {
        this.LIZ.setBoundsInParent(rect);
    }

    public final void LJIIJJI(Rect rect) {
        this.LIZ.setBoundsInScreen(rect);
    }

    public final void LJIIL(boolean z) {
        this.LIZ.setCheckable(z);
    }

    public final void LJIILIIL(boolean z) {
        this.LIZ.setChecked(z);
    }

    public final void LJIILJJIL(CharSequence charSequence) {
        this.LIZ.setClassName(charSequence);
    }

    public final void LJIILL(boolean z) {
        this.LIZ.setClickable(z);
    }

    public final void LJIILLIIL(C17730mn c17730mn) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.LIZ;
        if (c17730mn == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) c17730mn.LIZ;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public final void LJIIZILJ(C17740mo c17740mo) {
        this.LIZ.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c17740mo.LIZ);
    }

    public final void LJIJ(CharSequence charSequence) {
        this.LIZ.setContentDescription(charSequence);
    }

    public final void LJIJI(boolean z) {
        this.LIZ.setDismissable(z);
    }

    public final void LJIJJ(boolean z) {
        this.LIZ.setEnabled(z);
    }

    public final void LJIJJLI(boolean z) {
        this.LIZ.setFocusable(z);
    }

    public final void LJIL(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.LIZ.setHeading(z);
        } else {
            LJIIIZ(2, z);
        }
    }

    public final void LJJ(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.LIZ.setHintText(charSequence);
        } else {
            this.LIZ.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void LJJI(View view) {
        this.LIZIZ = -1;
        this.LIZ.setParent(view);
    }

    public final void LJJIFFI(CharSequence charSequence) {
        this.LIZ.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void LJJII(boolean z) {
        this.LIZ.setScrollable(z);
    }

    public final void LJJIII(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ.setStateDescription(charSequence);
        } else {
            this.LIZ.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void LJJIIJ(CharSequence charSequence) {
        this.LIZ.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C17760mq)) {
            return false;
        }
        C17760mq c17760mq = (C17760mq) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.LIZ;
        if (accessibilityNodeInfo == null) {
            if (c17760mq.LIZ != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c17760mq.LIZ)) {
            return false;
        }
        if (this.LIZJ == c17760mq.LIZJ && this.LIZIZ == c17760mq.LIZIZ) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(int i, boolean z) {
        Bundle extras = this.LIZ.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }
}
