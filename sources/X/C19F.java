package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.z0;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* renamed from: X.19F, reason: invalid class name */
/* loaded from: classes.dex */
public class C19F extends Button implements C07K, InterfaceC023207g {
    public final C03A LJLIL;
    public final a0 LJLILLLLZI;
    public C012203a LJLJI;

    private C012203a getEmojiTextViewHelper() {
        if (this.LJLJI == null) {
            this.LJLJI = new C012203a(this);
        }
        return this.LJLJI;
    }

    @Override // android.widget.TextView, X.C07K
    public int getAutoSizeMaxTextSize() {
        if (C07K.LIZLLL) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            return Math.round(a0Var.LJIIIIZZ.LJ);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C07K.LIZLLL) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            return Math.round(a0Var.LJIIIIZZ.LIZLLL);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C07K.LIZLLL) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            return Math.round(a0Var.LJIIIIZZ.LIZJ);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C07K.LIZLLL) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            return a0Var.LJIIIIZZ.LJFF;
        }
        return new int[0];
    }

    @Override // android.widget.TextView, X.C07K
    public int getAutoSizeTextType() {
        if (C07K.LIZLLL) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.LJIIIIZZ.LIZ;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C012102z c012102z = this.LJLILLLLZI.LJII;
        if (c012102z != null) {
            return c012102z.LIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C012102z c012102z = this.LJLILLLLZI.LJII;
        if (c012102z != null) {
            return c012102z.LIZIZ;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        String str;
        try {
            super.drawableStateChanged();
            C03A c03a = this.LJLIL;
            if (c03a != null) {
                c03a.LIZ();
            }
            a0 a0Var = this.LJLILLLLZI;
            if (a0Var != null) {
                a0Var.LIZIZ();
            }
        } catch (Exception e) {
            try {
                C36922EeM.LJFF(e);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("targetViewId", getId());
                jSONObject.put("targetViewClassName", getClass().getName());
                ViewParent parent = getParent();
                if (parent instanceof ViewGroup) {
                    jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                    jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
                }
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    str = LJIIIIZZ.getClass().getName();
                } else {
                    str = "";
                }
                jSONObject.put("currentActivity", str);
                jSONObject.put("errorMsg", android.util.Log.getStackTraceString(e));
                C09900aA.LJI("detail_view_animation_crash", null, null, jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C023107f.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.widget.TextView, X.C07K
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C07K.LIZLLL) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var == null) {
            return;
        }
        a0Var.LJII(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C023107f.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LIZ.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    @Override // X.InterfaceC023207g
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var.LJII == null) {
            a0Var.LJII = new C012102z();
        }
        C012102z c012102z = a0Var.LJII;
        c012102z.LIZ = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c012102z.LIZLLL = z;
        a0Var.LIZIZ = c012102z;
        a0Var.LIZJ = c012102z;
        a0Var.LIZLLL = c012102z;
        a0Var.LJ = c012102z;
        a0Var.LJFF = c012102z;
        a0Var.LJI = c012102z;
        a0Var.LIZIZ();
    }

    @Override // X.InterfaceC023207g
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z;
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var.LJII == null) {
            a0Var.LJII = new C012102z();
        }
        C012102z c012102z = a0Var.LJII;
        c012102z.LIZIZ = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c012102z.LIZJ = z;
        a0Var.LIZIZ = c012102z;
        a0Var.LIZJ = c012102z;
        a0Var.LIZLLL = c012102z;
        a0Var.LJ = c012102z;
        a0Var.LJFF = c012102z;
        a0Var.LJI = c012102z;
        a0Var.LIZIZ();
    }

    public C19F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a0k);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C07K.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var == null) {
            return;
        }
        a0Var.LJI(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LJ(i, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (C07K.LIZLLL) {
            super.setTextSize(i, f);
            return;
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var == null) {
            return;
        }
        c0 c0Var = a0Var.LJIIIIZZ;
        if (c0Var.LJII() && c0Var.LIZ != 0) {
            return;
        }
        a0Var.LJIIIIZZ.LJ(f, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19F(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z0.LIZ(context);
        C16880lQ.LLLLII(getContext());
        C03A c03a = new C03A(this);
        this.LJLIL = c03a;
        c03a.LIZLLL(attributeSet, i);
        a0 a0Var = new a0(this);
        this.LJLILLLLZI = a0Var;
        a0Var.LIZLLL(attributeSet, i);
        a0Var.LIZIZ();
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null && !C07K.LIZLLL) {
            c0 c0Var = a0Var.LJIIIIZZ;
            if (c0Var.LJII() && c0Var.LIZ != 0) {
                this.LJLILLLLZI.LJIIIIZZ.LIZ();
            }
        }
    }

    @Override // android.widget.TextView, X.C07K
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C07K.LIZLLL) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var == null) {
            return;
        }
        a0Var.LJFF(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null && !C07K.LIZLLL) {
            a0Var.LJIIIIZZ.LIZ();
        }
    }
}
