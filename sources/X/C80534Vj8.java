package X;

import com.google.android.material.datepicker.MaterialTextInputPicker;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [S] */
/* renamed from: X.Vj8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80534Vj8<S> extends AbstractC80535Vj9<S> {
    public final /* synthetic */ MaterialTextInputPicker LIZ;

    @Override // X.AbstractC80535Vj9
    public final void LIZ() {
        Iterator<AbstractC80535Vj9<S>> it = this.LIZ.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public C80534Vj8(MaterialTextInputPicker materialTextInputPicker) {
        this.LIZ = materialTextInputPicker;
    }

    @Override // X.AbstractC80535Vj9
    public final void LIZIZ(S s) {
        Iterator<AbstractC80535Vj9<S>> it = this.LIZ.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(s);
        }
    }
}
