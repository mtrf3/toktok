package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.Vid, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80503Vid extends FrameLayout implements Checkable {
    public final C80438Vha LJLIL;
    public final C80315Vfb LJLILLLLZI;
    public final EditText LJLJI;
    public final C80504Vie LJLJJI;
    public final TextView LJLJJL;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LJLIL.isChecked();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.LJLIL.toggle();
    }

    public C80315Vfb getTextInput() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJLJI.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.LJLIL.setChecked(z);
        EditText editText = this.LJLJI;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        C80438Vha c80438Vha = this.LJLIL;
        if (z) {
            i2 = 8;
        }
        c80438Vha.setVisibility(i2);
        if (isChecked()) {
            this.LJLJI.requestFocus();
            if (!TextUtils.isEmpty(this.LJLJI.getText())) {
                EditText editText2 = this.LJLJI;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setChipDelegate(C16120kC c16120kC) {
        h0.LJIJI(this.LJLIL, c16120kC);
    }

    public void setCursorVisible(boolean z) {
        this.LJLJI.setCursorVisible(z);
    }

    public void setHelperText(CharSequence charSequence) {
        this.LJLJJL.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public void setText(CharSequence charSequence) {
        this.LJLIL.setText(TimeModel.LIZ(getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty(this.LJLJI.getText())) {
            this.LJLJI.removeTextChangedListener(this.LJLJJI);
            this.LJLJI.setText((CharSequence) null);
            this.LJLJI.addTextChangedListener(this.LJLJJI);
        }
    }

    public C80503Vid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater LLZIL = C16880lQ.LLZIL(context);
        C80438Vha c80438Vha = (C80438Vha) C16880lQ.LLLLIILL(LLZIL, R.layout.brv, this, false);
        this.LJLIL = c80438Vha;
        C80315Vfb c80315Vfb = (C80315Vfb) C16880lQ.LLLLIILL(LLZIL, R.layout.brw, this, false);
        this.LJLILLLLZI = c80315Vfb;
        EditText editText = c80315Vfb.getEditText();
        this.LJLJI = editText;
        editText.setVisibility(4);
        C80504Vie c80504Vie = new C80504Vie(this);
        this.LJLJJI = c80504Vie;
        editText.addTextChangedListener(c80504Vie);
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(c80438Vha);
        addView(c80315Vfb);
        this.LJLJJL = (TextView) findViewById(R.id.gfz);
        editText.setSaveEnabled(false);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.LJLIL.setTag(i, obj);
    }
}
