package com.google.android.material.theme;

import X.AnonymousClass038;
import X.C013603o;
import X.C02A;
import X.C02Y;
import X.C19F;
import X.C80400Vgy;
import X.C80440Vhc;
import X.C80441Vhd;
import X.C80450Vhm;
import X.V8A;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes15.dex */
public class MaterialComponentsViewInflater extends C02A {
    @Override // X.C02A
    public final AnonymousClass038 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C80450Vhm(context, attributeSet);
    }

    @Override // X.C02A
    public final C19F createButton(Context context, AttributeSet attributeSet) {
        return new C80400Vgy(context, attributeSet);
    }

    @Override // X.C02A
    public final C02Y createCheckBox(Context context, AttributeSet attributeSet) {
        return new C80440Vhc(context, attributeSet);
    }

    @Override // X.C02A
    public final C013603o createRadioButton(Context context, AttributeSet attributeSet) {
        return new C80441Vhd(context, attributeSet);
    }

    @Override // X.C02A
    public final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new V8A(context, attributeSet);
    }
}
