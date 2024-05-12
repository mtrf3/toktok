package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

/* renamed from: X.194, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass194 extends AnonymousClass038 {
    public int LJLJJL;
    public AnonymousClass195 LJLJJLL;
    public boolean LJLJL;
    public final IDRunnableS85S0100000 LJLJLJ;

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        C011302r c011302r = AnonymousClass195.LLJIJIL;
        c011302r.getClass();
        C011302r.LIZ();
        Method method = c011302r.LIZJ;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this, Boolean.TRUE);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.LJLJJL <= 0 || super.enoughToFilter()) {
            return true;
        }
        return false;
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960) {
            if (i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            return 192;
        }
        if (i < 600) {
            return 160;
        }
        return 192;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // X.AnonymousClass038, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.LJLJL) {
            removeCallbacks(this.LJLJLJ);
            post(this.LJLJLJ);
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.LJLJJLL.hasFocus() && getVisibility() == 0) {
            this.LJLJL = true;
            if (getContext().getResources().getConfiguration().orientation == 2) {
                LIZ();
            }
        }
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        if (!z) {
            this.LJLJL = false;
            removeCallbacks(this.LJLJLJ);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.LJLJL = false;
                removeCallbacks(this.LJLJLJ);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.LJLJL = true;
        }
    }

    public void setSearchView(AnonymousClass195 anonymousClass195) {
        this.LJLJJLL = anonymousClass195;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.LJLJJL = i;
    }

    public AnonymousClass194(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLJ = new IDRunnableS85S0100000(this, 7);
        this.LJLJJL = getThreshold();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.LJLJJLL.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AnonymousClass195 anonymousClass195 = this.LJLJJLL;
        anonymousClass195.LJIL(anonymousClass195.LLIILZL);
        anonymousClass195.post(anonymousClass195.LLIZLLLIL);
        if (anonymousClass195.LJLLLLLL.hasFocus()) {
            anonymousClass195.LJIIJJI();
        }
    }
}
