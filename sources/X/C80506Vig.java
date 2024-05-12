package X;

import android.content.res.Resources;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Vig, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80506Vig implements InterfaceC80524Viy, InterfaceC80523Vix {
    public final LinearLayout LJLIL;
    public final TimeModel LJLILLLLZI;
    public final C80510Vik LJLJI;
    public final C80514Vio LJLJJI;
    public final C80503Vid LJLJJL;
    public final C80503Vid LJLJJLL;
    public final EditText LJLJL;
    public final EditText LJLJLJ;
    public C80401Vgz LJLJLLL;

    public final void LIZJ() {
        int i;
        C80401Vgz c80401Vgz = this.LJLJLLL;
        if (c80401Vgz == null) {
            return;
        }
        if (this.LJLILLLLZI.LJLJJL == 0) {
            i = R.id.gfu;
        } else {
            i = R.id.gfv;
        }
        c80401Vgz.LIZIZ(i);
    }

    @Override // X.InterfaceC80523Vix
    public final void hide() {
        View focusedChild = this.LJLIL.getFocusedChild();
        if (focusedChild == null) {
            this.LJLIL.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C04330Ez.LJ(this.LJLIL.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.LJLIL.setVisibility(8);
    }

    @Override // X.InterfaceC80523Vix
    public final void invalidate() {
        LIZIZ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC80523Vix
    public final void show() {
        this.LJLIL.setVisibility(0);
    }

    @Override // X.InterfaceC80524Viy
    public final void LIZ(int i) {
        boolean z;
        this.LJLILLLLZI.LJLJJI = i;
        C80503Vid c80503Vid = this.LJLJJL;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c80503Vid.setChecked(z);
        C80503Vid c80503Vid2 = this.LJLJJLL;
        if (i == 10) {
            z2 = true;
        }
        c80503Vid2.setChecked(z2);
        LIZJ();
    }

    public final void LIZIZ(TimeModel timeModel) {
        this.LJLJL.removeTextChangedListener(this.LJLJJI);
        this.LJLJLJ.removeTextChangedListener(this.LJLJI);
        Locale locale = this.LJLIL.getResources().getConfiguration().locale;
        String LLLZI = C16880lQ.LLLZI(locale, "%02d", new Object[]{Integer.valueOf(timeModel.LJLJI)});
        String LLLZI2 = C16880lQ.LLLZI(locale, "%02d", new Object[]{Integer.valueOf(timeModel.LIZIZ())});
        this.LJLJJL.setText(LLLZI);
        this.LJLJJLL.setText(LLLZI2);
        this.LJLJL.addTextChangedListener(this.LJLJJI);
        this.LJLJLJ.addTextChangedListener(this.LJLJI);
        LIZJ();
    }

    public C80506Vig(LinearLayout linearLayout, TimeModel timeModel) {
        C80510Vik c80510Vik = new C80510Vik(this);
        this.LJLJI = c80510Vik;
        C80514Vio c80514Vio = new C80514Vio(this);
        this.LJLJJI = c80514Vio;
        this.LJLIL = linearLayout;
        this.LJLILLLLZI = timeModel;
        Resources resources = linearLayout.getResources();
        C80503Vid c80503Vid = (C80503Vid) linearLayout.findViewById(R.id.gg0);
        this.LJLJJL = c80503Vid;
        C80503Vid c80503Vid2 = (C80503Vid) linearLayout.findViewById(R.id.gfx);
        this.LJLJJLL = c80503Vid2;
        TextView textView = (TextView) c80503Vid.findViewById(R.id.gfz);
        TextView textView2 = (TextView) c80503Vid2.findViewById(R.id.gfz);
        textView.setText(resources.getString(R.string.i0l));
        textView2.setText(resources.getString(R.string.i0k));
        c80503Vid.setTag(R.id.jmw, 12);
        c80503Vid2.setTag(R.id.jmw, 10);
        if (timeModel.LJLIL == 0) {
            C80401Vgz c80401Vgz = (C80401Vgz) linearLayout.findViewById(R.id.gfw);
            this.LJLJLLL = c80401Vgz;
            c80401Vgz.LJLJJI.add(new C80522Viw(this));
            this.LJLJLLL.setVisibility(0);
            LIZJ();
        }
        ViewOnClickListenerC80517Vir viewOnClickListenerC80517Vir = new ViewOnClickListenerC80517Vir(this);
        c80503Vid2.setOnClickListener(new ViewOnClickListenerC13880ga(viewOnClickListenerC80517Vir));
        c80503Vid.setOnClickListener(new ViewOnClickListenerC13880ga(viewOnClickListenerC80517Vir));
        Q94 q94 = timeModel.hourInputValidator;
        InputFilter[] filters = c80503Vid2.LJLJI.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = q94;
        c80503Vid2.LJLJI.setFilters(inputFilterArr);
        Q94 q942 = timeModel.minuteInputValidator;
        InputFilter[] filters2 = c80503Vid.LJLJI.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = q942;
        c80503Vid.LJLJI.setFilters(inputFilterArr2);
        EditText editText = c80503Vid2.getTextInput().getEditText();
        this.LJLJL = editText;
        EditText editText2 = c80503Vid.getTextInput().getEditText();
        this.LJLJLJ = editText2;
        ViewOnKeyListenerC80505Vif viewOnKeyListenerC80505Vif = new ViewOnKeyListenerC80505Vif(c80503Vid2, c80503Vid, timeModel);
        c80503Vid2.setChipDelegate(new A9S(linearLayout.getContext(), R.string.i0b));
        c80503Vid.setChipDelegate(new A9S(linearLayout.getContext(), R.string.i0d));
        editText.addTextChangedListener(c80514Vio);
        editText2.addTextChangedListener(c80510Vik);
        LIZIZ(timeModel);
        C80315Vfb textInput = c80503Vid2.getTextInput();
        C80315Vfb textInput2 = c80503Vid.getTextInput();
        EditText editText3 = textInput.getEditText();
        EditText editText4 = textInput2.getEditText();
        editText3.setImeOptions(268435461);
        editText4.setImeOptions(268435462);
        editText3.setOnEditorActionListener(viewOnKeyListenerC80505Vif);
        editText3.setOnKeyListener(viewOnKeyListenerC80505Vif);
        editText4.setOnKeyListener(viewOnKeyListenerC80505Vif);
    }
}
