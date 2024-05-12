package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ook, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63046Ook extends C63045Ooj {
    public boolean LJLJJL;
    public final List<InterfaceC63047Ool> LJLJJLL;

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            if (!((InterfaceC63047Ool) it.next()).LIZ(this)) {
                return;
            }
        }
        if (!this.LJLJJL) {
            return;
        }
        setChecked(!isChecked());
        getId();
        if (!isChecked()) {
            ((RadioGroup) getParent()).clearCheck();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CanCancelRadioButton$SavedState canCancelRadioButton$SavedState = new CanCancelRadioButton$SavedState(super.onSaveInstanceState());
        canCancelRadioButton$SavedState.LJLIL = this.LJLJJL;
        return canCancelRadioButton$SavedState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CanCancelRadioButton$SavedState canCancelRadioButton$SavedState = (CanCancelRadioButton$SavedState) parcelable;
        super.onRestoreInstanceState(canCancelRadioButton$SavedState.getSuperState());
        setCanChecked(canCancelRadioButton$SavedState.LJLIL);
    }

    public void setCanChecked(boolean z) {
        this.LJLJJL = z;
    }

    public C63046Ook(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = true;
        this.LJLJJLL = new ArrayList();
    }
}
