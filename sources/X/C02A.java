package X;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RatingBar;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.z0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3.h0;

/* renamed from: X.02A, reason: invalid class name */
/* loaded from: classes.dex */
public class C02A {
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {R.attr.onClick};
    public static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    public static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    public static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final C0MA<String, Constructor<? extends View>> sConstructorMap = new C0MA<>();

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void checkOnClickListener(final View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper) || !C16290kT.LIZ(view)) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
        final String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        if (LLLZLZ != null) {
            C16880lQ.LJIIJ(new View.OnClickListener(view, LLLZLZ) { // from class: X.029
                public final View LJLIL;
                public final String LJLILLLLZI;
                public Method LJLJI;
                public Context LJLJJI;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String LIZIZ;
                    Method method;
                    if (this.LJLJI == null) {
                        for (Context context2 = this.LJLIL.getContext(); context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                            try {
                                if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.LJLILLLLZI, View.class)) != null) {
                                    this.LJLJI = method;
                                    this.LJLJJI = context2;
                                }
                            } catch (NoSuchMethodException unused) {
                            }
                            if (!(context2 instanceof ContextWrapper)) {
                                break;
                            }
                        }
                        int id = this.LJLIL.getId();
                        if (id == -1) {
                            LIZIZ = "";
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(" with id '");
                            LIZ.append(this.LJLIL.getContext().getResources().getResourceEntryName(id));
                            LIZ.append("'");
                            LIZIZ = X1D.LIZIZ(LIZ);
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Could not find method ");
                        LIZ2.append(this.LJLILLLLZI);
                        LIZ2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        LIZ2.append(this.LJLIL.getClass());
                        LIZ2.append(LIZIZ);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                    try {
                        this.LJLJI.invoke(this.LJLJJI, view2);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Could not execute method for android:onClick", e2);
                    }
                }

                {
                    this.LJLIL = view;
                    this.LJLILLLLZI = LLLZLZ;
                }
            }, view);
        }
        obtainStyledAttributes.recycle();
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getClass().getName());
        LIZ.append(" asked to inflate view for <");
        LIZ.append(str);
        LIZ.append(">, but returned null");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public AnonymousClass038 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AnonymousClass038(context, attributeSet);
    }

    public C19F createButton(Context context, AttributeSet attributeSet) {
        return new C19F(context, attributeSet);
    }

    public C02Y createCheckBox(Context context, AttributeSet attributeSet) {
        return new C02Y(context, attributeSet);
    }

    public C03I createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C03I(context, attributeSet);
    }

    public C19K createEditText(Context context, AttributeSet attributeSet) {
        return new C19K(context, attributeSet);
    }

    public C012503d createImageButton(Context context, AttributeSet attributeSet) {
        return new C012503d(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.03h] */
    public C012903h createMultiAutoCompleteTextView(final Context context, final AttributeSet attributeSet) {
        return new MultiAutoCompleteTextView(context, attributeSet) { // from class: X.03h
            public static final int[] LJLJJI = {R.attr.popupBackground};
            public final C03A LJLIL;
            public final a0 LJLILLLLZI;
            public final C19L LJLJI;

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

            @Override // android.widget.TextView, android.view.View
            public final void drawableStateChanged() {
                super.drawableStateChanged();
                C03A c03a = this.LJLIL;
                if (c03a != null) {
                    c03a.LIZ();
                }
                a0 a0Var = this.LJLILLLLZI;
                if (a0Var != null) {
                    a0Var.LIZIZ();
                }
            }

            @Override // android.widget.TextView, android.view.View
            public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
                C78897Uxp.LJJJI(this, editorInfo, onCreateInputConnection);
                return this.LJLJI.LIZLLL(onCreateInputConnection, editorInfo);
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

            @Override // android.widget.AutoCompleteTextView
            public void setDropDownBackgroundResource(int i) {
                setDropDownBackgroundDrawable(C20110qd.LIZ(getContext(), i));
            }

            public void setEmojiCompatEnabled(boolean z) {
                this.LJLJI.LJ(z);
            }

            @Override // android.widget.TextView
            public void setKeyListener(KeyListener keyListener) {
                super.setKeyListener(this.LJLJI.LIZ(keyListener));
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, attributeSet, com.zhiliaoapp.musically.R.attr.wf);
                z0.LIZ(context);
                C16880lQ.LLLLII(getContext());
                AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(getContext(), attributeSet, LJLJJI, com.zhiliaoapp.musically.R.attr.wf, 0);
                if (LJIILIIL.LJIIJJI(0)) {
                    setDropDownBackgroundDrawable(LJIILIIL.LJ(0));
                }
                LJIILIIL.LJIILJJIL();
                C03A c03a = new C03A(this);
                this.LJLIL = c03a;
                c03a.LIZLLL(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
                a0 a0Var = new a0(this);
                this.LJLILLLLZI = a0Var;
                a0Var.LIZLLL(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
                a0Var.LIZIZ();
                C19L c19l = new C19L(this);
                this.LJLJI = c19l;
                c19l.LIZIZ(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
                KeyListener keyListener = getKeyListener();
                if (!(keyListener instanceof NumberKeyListener)) {
                    boolean isFocusable = isFocusable();
                    int inputType = getInputType();
                    KeyListener LIZ = c19l.LIZ(keyListener);
                    if (LIZ == keyListener) {
                        return;
                    }
                    super.setKeyListener(LIZ);
                    setRawInputType(inputType);
                    setFocusable(isFocusable);
                }
            }

            @Override // android.widget.TextView
            public final void setTextAppearance(Context context2, int i) {
                super.setTextAppearance(context2, i);
                a0 a0Var = this.LJLILLLLZI;
                if (a0Var != null) {
                    a0Var.LJ(i, context2);
                }
            }
        };
    }

    public C013603o createRadioButton(Context context, AttributeSet attributeSet) {
        return new C013603o(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.03p] */
    public C013703p createRatingBar(final Context context, final AttributeSet attributeSet) {
        return new RatingBar(context, attributeSet) { // from class: X.03p
            public final C013303l LJLIL;

            {
                C16880lQ.LLLLII(getContext());
                C013303l c013303l = new C013303l(this);
                this.LJLIL = c013303l;
                c013303l.LIZ(attributeSet, com.zhiliaoapp.musically.R.attr.b6t);
            }

            @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
            public final synchronized void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                Bitmap bitmap = this.LJLIL.LIZIZ;
                if (bitmap != null) {
                    setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
                }
            }
        };
    }

    public C02Z createSeekBar(Context context, AttributeSet attributeSet) {
        return new C02Z(context, attributeSet);
    }

    public C010002e createSpinner(Context context, AttributeSet attributeSet) {
        return new C010002e(context, attributeSet, com.zhiliaoapp.musically.R.attr.bc4);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.035] */
    public AnonymousClass035 createToggleButton(final Context context, final AttributeSet attributeSet) {
        return new ToggleButton(context, attributeSet) { // from class: X.035
            public final C03A LJLIL;
            public final a0 LJLILLLLZI;
            public C012203a LJLJI;

            private C012203a getEmojiTextViewHelper() {
                if (this.LJLJI == null) {
                    this.LJLJI = new C012203a(this);
                }
                return this.LJLJI;
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

            @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
            public final void drawableStateChanged() {
                super.drawableStateChanged();
                C03A c03a = this.LJLIL;
                if (c03a != null) {
                    c03a.LIZ();
                }
                a0 a0Var = this.LJLILLLLZI;
                if (a0Var != null) {
                    a0Var.LIZIZ();
                }
            }

            @Override // android.widget.TextView
            public void setAllCaps(boolean z) {
                super.setAllCaps(z);
                getEmojiTextViewHelper().LIZJ(z);
            }

            @Override // android.widget.ToggleButton, android.view.View
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

            public void setEmojiCompatEnabled(boolean z) {
                getEmojiTextViewHelper().LIZLLL(z);
            }

            @Override // android.widget.TextView
            public void setFilters(InputFilter[] inputFilterArr) {
                super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
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

            {
                C16880lQ.LLLLII(getContext());
                C03A c03a = new C03A(this);
                this.LJLIL = c03a;
                c03a.LIZLLL(attributeSet, R.attr.buttonStyleToggle);
                a0 a0Var = new a0(this);
                this.LJLILLLLZI = a0Var;
                a0Var.LIZLLL(attributeSet, R.attr.buttonStyleToggle);
                getEmojiTextViewHelper().LIZIZ(attributeSet, R.attr.buttonStyleToggle);
            }
        };
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            h0.LJIJJ(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            h0.LJIJJLI(view, C16880lQ.LLLZLZ(obtainStyledAttributes2, 0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            new C33921Uu(Boolean.class).LJ(view, Boolean.valueOf(obtainStyledAttributes3.getBoolean(0, false)));
        }
        obtainStyledAttributes3.recycle();
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String LIZIZ;
        C0MA<String, Constructor<? extends View>> c0ma = sConstructorMap;
        Constructor<? extends View> orDefault = c0ma.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 == null) {
                LIZIZ = str;
            } else {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str2);
                    LIZ.append(str);
                    LIZIZ = X1D.LIZIZ(LIZ);
                } catch (Exception unused) {
                    return null;
                }
            }
            orDefault = Class.forName(LIZIZ, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c0ma.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i >= strArr.length) {
                        return null;
                    }
                    View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                    if (createViewByPrefix == null) {
                        i++;
                    } else {
                        return createViewByPrefix;
                    }
                }
            } else {
                return createViewByPrefix(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.theme, R.attr.focusable, com.zhiliaoapp.musically.R.attr.b3n, com.zhiliaoapp.musically.R.attr.b3q, com.zhiliaoapp.musically.R.attr.biq}, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0) {
            i = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof C25600zU) || ((C25600zU) context).LIZ != i) {
                return new C25600zU(context, i);
            }
            return context;
        }
        return context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View createRatingBar;
        if (z && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            z0.LIZ(context2);
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    createRatingBar = createRatingBar(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    createRatingBar = createCheckedTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    createRatingBar = createTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    createRatingBar = createImageButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    createRatingBar = createSeekBar(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    createRatingBar = createSpinner(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    createRatingBar = createRadioButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    createRatingBar = createToggleButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    createRatingBar = createImageView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    createRatingBar = createCheckBox(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    createRatingBar = createEditText(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    createRatingBar = createButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar != null || (context != context2 && (createRatingBar = createViewFromTag(context2, str, attributeSet)) != null)) {
            checkOnClickListener(createRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
