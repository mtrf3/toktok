package X;

import Y.ACListenerS31S0101000_14;
import Y.ACListenerS32S0101000_15;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Wqh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83551Wqh extends FrameLayout {
    public static final /* synthetic */ int LJLLI = 0;
    public EditText LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public final InputMethodManager LJLJJL;
    public InterfaceC83565Wqv LJLJJLL;
    public final String LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public InterfaceC65784Pro<Integer> LJLL;

    public void LJ(int i) {
    }

    public int getLayout() {
        return R.layout.blu;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public final void LIZ() {
        InputMethodManager inputMethodManager;
        EditText editText = this.LJLIL;
        if (editText != null && (inputMethodManager = this.LJLJJL) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public void LIZLLL() {
        EditText editText = this.LJLIL;
        if (editText != null) {
            editText.requestFocus();
        }
        setVisibility(0);
    }

    public String getText() {
        EditText editText = this.LJLIL;
        if (editText != null && editText.getEditableText() != null) {
            return this.LJLIL.getEditableText().toString();
        }
        return null;
    }

    public void LIZJ() {
        LIZ();
    }

    public void LIZIZ(C29S c29s) {
        setVisibility(8);
        this.LJLJI = C16880lQ.LLLZIIL(getLayout(), C16880lQ.LLZIL(c29s), this);
        this.LJLIL = (EditText) findViewById(R.id.cqw);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.LJLIL.addTextChangedListener(textWatcher);
        }
        View findViewById = findViewById(R.id.kug);
        this.LJLILLLLZI = findViewById;
        C16880lQ.LJIIJ(new ACListenerS31S0101000_14(3, this, 2), findViewById);
        this.LJLJJI = findViewById(R.id.la4);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0101000_15(6, this, 12)));
    }

    public void setEffectTextChangeListener(InterfaceC83565Wqv interfaceC83565Wqv) {
        this.LJLJJLL = interfaceC83565Wqv;
    }

    public void setHintText(String str) {
        if (this.LJLIL != null && !TextUtils.isEmpty(str)) {
            this.LJLIL.setHint(str);
        }
    }

    public void setMaxTextCount(int i) {
        this.LJLJLJ = i;
    }

    public void setText(String str) {
        EditText editText = this.LJLIL;
        if (editText != null && str != null) {
            editText.setText(str);
            int length = str.length();
            if (length <= this.LJLIL.getText().length()) {
                this.LJLIL.setSelection(length);
            }
        }
    }

    public void setTopMarginSupplier(InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        this.LJLL = interfaceC65784Pro;
    }

    public C83551Wqh(C29S c29s, AttributeSet attributeSet) {
        super(c29s, attributeSet);
        LIZIZ(c29s);
        this.LJLJJL = (InputMethodManager) C16880lQ.LLILL(c29s, "input_method");
        this.LJLJL = c29s.getResources().getString(R.string.pvn);
    }
}
