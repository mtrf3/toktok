package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Locale;

/* loaded from: classes14.dex */
public class V8M extends C19K {
    public final Rect LJLJJLL;
    public boolean LJLJL;

    private CharSequence getHintFromLayout() {
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private C80315Vfb getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C80315Vfb) {
                return (C80315Vfb) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.LLFZ) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.LLFZ && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LJLJL && rect != null) {
            textInputLayout.getFocusedRect(this.LJLJJLL);
            rect.bottom = this.LJLJJLL.bottom;
        }
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C80315Vfb textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            setLabelFor(R.id.l5v);
            String str2 = "";
            if (!z2) {
                str = "";
            } else {
                str = hint.toString();
            }
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((Object) text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = i0.LJFF(", ", str);
                }
                LIZ.append(str2);
                str2 = X1D.LIZIZ(LIZ);
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LJLJL) {
            this.LJLJJLL.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.a1w), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.LJLJJLL, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.LJLJL = z;
    }

    public V8M(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.aar, 0), attributeSet, R.attr.aar);
        this.LJLJJLL = new Rect();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.bif}, R.attr.aar, R.style.yc, new int[0]);
        setTextInputLayoutFocusedRectEnabled(LIZLLL.getBoolean(0, false));
        LIZLLL.recycle();
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        C80315Vfb textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.LJLJL && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.LJLJJLL, point);
            rect.bottom = this.LJLJJLL.bottom;
        }
        return globalVisibleRect;
    }
}
