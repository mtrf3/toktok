package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import java.util.LinkedHashMap;

/* renamed from: X.BPc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28724BPc extends LinearLayout {
    public InterfaceC28722BPa LJLIL;
    public C28725BPd LJLILLLLZI;

    public final C28725BPd getLastCheckedButton() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC28722BPa getOnCheckChangeListener() {
        return this.LJLIL;
    }

    public final void setLastCheckedButton(C28725BPd c28725BPd) {
        this.LJLILLLLZI = c28725BPd;
    }

    public final void setOnCheckChangeListener(InterfaceC28722BPa interfaceC28722BPa) {
        this.LJLIL = interfaceC28722BPa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28724BPc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        if (view instanceof C28725BPd) {
            C28725BPd c28725BPd = (C28725BPd) view;
            RadioButton radioButton = c28725BPd.LJLIL;
            if (radioButton != null && radioButton.isChecked()) {
                this.LJLILLLLZI = c28725BPd;
            }
            c28725BPd.setOnCheckChangeListener(new C28723BPb(this, view));
        }
    }
}
