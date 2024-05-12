package X;

import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import defpackage.a1;

/* renamed from: X.BPd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28725BPd extends LinearLayout {
    public RadioButton LJLIL;
    public InterfaceC28722BPa LJLILLLLZI;

    public final InterfaceC28722BPa getOnCheckChangeListener() {
        return this.LJLILLLLZI;
    }

    public final RadioButton getRadioButton() {
        return this.LJLIL;
    }

    public final void setChecked(boolean z) {
        RadioButton radioButton;
        RadioButton radioButton2 = this.LJLIL;
        if ((radioButton2 != null && z == radioButton2.isChecked()) || (radioButton = this.LJLIL) == null) {
            return;
        }
        radioButton.setChecked(z);
    }

    public final void setOnCheckChangeListener(InterfaceC28722BPa interfaceC28722BPa) {
        this.LJLILLLLZI = interfaceC28722BPa;
    }

    public final void setRadioButton(RadioButton radioButton) {
        this.LJLIL = radioButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28725BPd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setClickable(false);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 358)));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof RadioButton) {
            RadioButton radioButton = (RadioButton) view;
            this.LJLIL = radioButton;
            radioButton.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 1));
        }
    }
}
