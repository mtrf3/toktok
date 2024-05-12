package X;

import Y.ACListenerS32S0100000_12;
import Y.IDCListenerS376S0100000_12;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SDf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71731SDf extends LinearLayout {
    public boolean LJLIL;
    public InterfaceC65784Pro<Boolean> LJLILLLLZI;
    public C5FY LJLJI;
    public ImageView LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public View.OnClickListener LJLJL;
    public View.OnFocusChangeListener LJLJLJ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJLLL;
    public final java.util.Map<Integer, View> LJLL;

    public static /* synthetic */ void getIndicatorType$annotations() {
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final C5FY getClearButton() {
        if (this.LJLJI == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            this.LJLJI = new C5FY(context, null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            C5FY c5fy = this.LJLJI;
            o.LJI(c5fy);
            c5fy.setLayoutParams(layoutParams);
        }
        C5FY c5fy2 = this.LJLJI;
        o.LJI(c5fy2);
        return c5fy2;
    }

    private final ImageView getImageView() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ImageView imageView = this.LJLJJI;
            o.LJI(imageView);
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.LJLJJI;
        o.LJI(imageView2);
        return imageView2;
    }

    public final EditText getEditText() {
        EditText inputWithIndicatorEditText = (EditText) LIZ(R.id.eof);
        o.LJIIIIZZ(inputWithIndicatorEditText, "inputWithIndicatorEditText");
        return inputWithIndicatorEditText;
    }

    public final int getInputType() {
        return ((TextView) LIZ(R.id.eof)).getInputType();
    }

    public final String getText() {
        String obj;
        String charSequence;
        Editable text = ((C19K) LIZ(R.id.eof)).getText();
        if (text == null || (obj = text.toString()) == null || (charSequence = s.LJZI(obj).toString()) == null) {
            return "";
        }
        return charSequence;
    }

    public final boolean getEnableAutoHide() {
        return this.LJLIL;
    }

    public final int getIndicatorType() {
        return this.LJLJJL;
    }

    public final View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.LJLJLJ;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnIndicatorVisibleChangeListener() {
        return this.LJLJLLL;
    }

    public final void setAutoHideRules(InterfaceC65784Pro<Boolean> rules) {
        o.LJIIIZ(rules, "rules");
        this.LJLILLLLZI = rules;
    }

    public final void setContainerPadding(int i) {
        LIZ(R.id.eog).setPadding(i, i, i, i);
    }

    public final void setEnableAutoHide(boolean z) {
        this.LJLIL = z;
    }

    public final void setHint(String str) {
        ((TextView) LIZ(R.id.eof)).setHint(str);
    }

    public final void setIndicatorClickListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJL = listener;
    }

    public final void setIndicatorSize(int i) {
        this.LJLJJLL = i;
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ(R.id.eoe).setVisibility(i);
        LIZ(R.id.eog).setVisibility(i);
        this.LJLJLLL.invoke(Boolean.valueOf(z));
    }

    public final void setInputTextEncrypted(boolean z) {
        if (z) {
            ((TextView) LIZ(R.id.eof)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            ((TextView) LIZ(R.id.eof)).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
    }

    public final void setInputType(int i) {
        ((TextView) LIZ(R.id.eof)).setInputType(i);
    }

    public final void setMaxLength(int i) {
        if (i > 0) {
            OPS.LIZ((T5T) LIZ(R.id.eof), i);
        }
    }

    public final void setMaxLines(int i) {
        ((TextView) LIZ(R.id.eof)).setMaxLines(i);
    }

    public final void setOnEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LJLJLJ = onFocusChangeListener;
    }

    public final void setOnIndicatorVisibleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLLL = interfaceC88472Yns;
    }

    public final void setText(CharSequence text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.eof)).setText(text);
        if (text.length() > 0) {
            ((EditText) LIZ(R.id.eof)).setSelection(String.valueOf(((C19K) LIZ(R.id.eof)).getText()).length());
        }
    }

    public final void setTextWatcher(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        ((TextView) LIZ(R.id.eof)).addTextChangedListener(watcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71731SDf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = new AqS162S0100000_12(this, 1024);
        this.LJLJLLL = C34400Dem.LJLIL;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxLines, android.R.attr.maxLength, android.R.attr.inputType, R.attr.a61, R.attr.a64, R.attr.a65, R.attr.a66, R.attr.a67, R.attr.a68, R.attr.a69});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…merce_InputWithIndicator)");
        int i = obtainStyledAttributes.getInt(4, 0);
        this.LJLJJL = i;
        this.LJLJJLL = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 7);
        int i2 = obtainStyledAttributes.getInt(0, Integer.MAX_VALUE);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 1);
        float f = obtainStyledAttributes.getInt(9, 15);
        int color = obtainStyledAttributes.getColor(6, AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        View.inflate(context, R.layout.zn, this);
        int resourceId = obtainStyledAttributes.getResourceId(8, 80);
        if (resourceId != 80) {
            LIZ(R.id.eof).setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        setMaxLength(i3);
        setMaxLines(i2);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        if (C26338AVi.LIZJ(context2)) {
            LIZ(R.id.eof).setLayoutDirection(0);
            LIZ(R.id.eof).setTextAlignment(6);
        }
        View inputWithIndicatorEditText = LIZ(R.id.eof);
        o.LJIIIIZZ(inputWithIndicatorEditText, "inputWithIndicatorEditText");
        C26338AVi.LJIIIZ(inputWithIndicatorEditText, null, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), 21);
        ((TextView) LIZ(R.id.eof)).setHint(LLLZLZ);
        ((TextView) LIZ(R.id.eof)).setTextSize(f);
        ((TextView) LIZ(R.id.eof)).setInputType(i4);
        ((TextView) LIZ(R.id.eof)).setTextColor(color);
        ((TextView) LIZ(R.id.eof)).addTextChangedListener(new C71732SDg(this));
        ((TextView) LIZ(R.id.eof)).setOnEditorActionListener(C71733SDh.LJLIL);
        LIZ(R.id.eof).setOnFocusChangeListener(new IDCListenerS376S0100000_12(this, 2));
        C16880lQ.LJIILJJIL((FrameLayout) LIZ(R.id.eoe), new ACListenerS32S0100000_12(this, 110));
        if (i == 1 && this.LJLIL) {
            LIZ(R.id.eog).setVisibility(8);
        }
        if (this.LJLJJLL <= 0) {
            this.LJLJJLL = C17N.LJIILL(16.0d);
        }
        View inputWithIndicatorViewContainer = LIZ(R.id.eog);
        o.LJIIIIZZ(inputWithIndicatorViewContainer, "inputWithIndicatorViewContainer");
        int i5 = this.LJLJJLL;
        C27570Aru.LJI(i5, i5, inputWithIndicatorViewContainer);
        if (i == 1) {
            C5FY clearButton = getClearButton();
            ((ViewGroup) LIZ(R.id.eog)).removeAllViews();
            ((ViewGroup) LIZ(R.id.eog)).addView(clearButton);
        }
    }
}
