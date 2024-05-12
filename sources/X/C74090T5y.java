package X;

import Y.IDCListenerS376S0100000_12;
import Y.IDObjectS183S0100000_12;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.T5y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74090T5y extends LinearLayout {
    public InterfaceC65784Pro<Boolean> LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public InterfaceC74091T5z LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public static /* synthetic */ void getPrimaryIndicatorType$annotations() {
    }

    public static /* synthetic */ void getSecondaryIndicatorType$annotations() {
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
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

    private final ImageView getCheckImageView() {
        return (ImageView) this.LJLJI.getValue();
    }

    private final ImageView getClearButton() {
        return (ImageView) this.LJLILLLLZI.getValue();
    }

    private final ImageView getEyeCloseImageView() {
        return (ImageView) this.LJLJJL.getValue();
    }

    private final ImageView getEyeOpenImageView() {
        return (ImageView) this.LJLJJI.getValue();
    }

    private final C74086T5u getLoadingView() {
        return (C74086T5u) this.LJLJJLL.getValue();
    }

    public final int getDefaultIndicatorSize() {
        return ((Number) this.LJLJLJ.getValue()).intValue();
    }

    public final int getDefaultPadding() {
        return ((Number) this.LJLJL.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.T5u] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.ImageView] */
    public final void LIZJ() {
        ?? clearButton;
        C74086T5u loadingView = getLoadingView();
        if (loadingView != null) {
            loadingView.LIZJ();
        }
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(this.LJLLI), Integer.valueOf(this.LJLL));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJIIJI) {
            if (((Number) obj).intValue() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                clearButton = new View(getContext());
                            } else {
                                LJ(144);
                                clearButton = getEyeOpenImageView();
                            }
                        } else {
                            LJ(129);
                            clearButton = getEyeCloseImageView();
                        }
                    } else {
                        clearButton = getCheckImageView();
                    }
                } else {
                    clearButton = getLoadingView();
                    clearButton.LIZIZ();
                }
            } else {
                clearButton = getClearButton();
            }
            arrayList2.add(clearButton);
        }
        View LIZ = LIZ(R.id.eog);
        int size = arrayList2.size() * this.LJLLILLLL;
        int i = this.LJLLILLLL;
        if (LIZ != null) {
            ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = size;
            LIZ.setLayoutParams(layoutParams);
        }
        ((ViewGroup) LIZ(R.id.eog)).removeAllViews();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) LIZ(R.id.eog)).addView((View) it2.next());
        }
        invalidate();
    }

    public final EditText getEditText() {
        EditText inputWithIndicatorEditText = (EditText) LIZ(R.id.eof);
        o.LJIIIIZZ(inputWithIndicatorEditText, "inputWithIndicatorEditText");
        return inputWithIndicatorEditText;
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

    public final ImageView LIZIZ(int i) {
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDefaultIndicatorSize(), getDefaultIndicatorSize());
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(i);
        return imageView;
    }

    public final void LJ(int i) {
        int selectionStart = ((TextView) LIZ(R.id.eof)).getSelectionStart();
        int selectionEnd = ((TextView) LIZ(R.id.eof)).getSelectionEnd();
        ((TextView) LIZ(R.id.eof)).setInputType(i);
        ((EditText) LIZ(R.id.eof)).setSelection(selectionStart, selectionEnd);
    }

    public final void setAutoHideRules(InterfaceC65784Pro<Boolean> rules) {
        o.LJIIIZ(rules, "rules");
        this.LJLIL = rules;
    }

    public final void setContainerPadding(int i) {
        LIZ(R.id.eog).setPadding(i, i, i, i);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ(R.id.eog).setVisibility(i);
    }

    public final void setListener(InterfaceC74091T5z indicatorListener) {
        o.LJIIIZ(indicatorListener, "indicatorListener");
        this.LJLJLLL = indicatorListener;
    }

    public final void setText(CharSequence text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.eof)).setText(text);
        if (text.length() > 0) {
            ((EditText) LIZ(R.id.eof)).setSelection(text.length());
        }
    }

    public final void setTextWatcher(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        ((TextView) LIZ(R.id.eof)).addTextChangedListener(watcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74090T5y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        this.LJLIL = new AqS162S0100000_12(this, 1090);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0200000_12(context, this, 66));
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1091));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1093));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1092));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0200000_12(context, this, 67));
        this.LJLJL = C221108m2.LIZIZ(C2302892a.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C92Z.LJLIL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxLines, android.R.attr.maxLength, android.R.attr.inputType, R.attr.ahq, R.attr.ahs, R.attr.ai1, R.attr.ai2, R.attr.ai3, R.attr.b_g});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.InputWithIndicator)");
        this.LJLL = obtainStyledAttributes.getInt(3, 0);
        this.LJLLI = obtainStyledAttributes.getInt(8, 0);
        this.LJLLILLLL = obtainStyledAttributes.getDimensionPixelSize(4, C17N.LJIILL(28.0d));
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 6);
        int i = obtainStyledAttributes.getInt(0, 1);
        int i2 = obtainStyledAttributes.getInt(1, 0);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        int color = obtainStyledAttributes.getColor(5, AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        View.inflate(context, R.layout.bah, this);
        int resourceId = obtainStyledAttributes.getResourceId(7, 80);
        if (resourceId != 80) {
            LIZ(R.id.eof).setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (i2 > 0) {
            OPT.LIZ((EditText) LIZ(R.id.eof), i2);
        }
        ((TextView) LIZ(R.id.eof)).setMaxLines(i);
        ((TextView) LIZ(R.id.eof)).setHint(LLLZLZ);
        if (i3 != 129) {
            ((TextView) LIZ(R.id.eof)).setInputType(i3);
        }
        ((T5T) LIZ(R.id.eof)).setTuxFont(42);
        ((TextView) LIZ(R.id.eof)).setTextColor(color);
        ((TextView) LIZ(R.id.eof)).addTextChangedListener(new IDObjectS183S0100000_12(this, 6));
        LIZ(R.id.eof).setOnFocusChangeListener(new IDCListenerS376S0100000_12(this, 3));
        if (this.LJLL == 1) {
            LIZ(R.id.eog).setVisibility(8);
        }
        LIZJ();
    }

    public final void LIZLLL(int i, int i2) {
        if (i2 == this.LJLLI && i == this.LJLL) {
            return;
        }
        this.LJLLI = i2;
        this.LJLL = i;
        LIZJ();
    }
}
