package X;

import com.google.android.material.datepicker.MaterialDatePicker;

/* JADX INFO: Add missing generic type declarations: [S] */
/* renamed from: X.Vj6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80532Vj6<S> extends AbstractC80535Vj9<S> {
    public final /* synthetic */ MaterialDatePicker LIZ;

    @Override // X.AbstractC80535Vj9
    public final void LIZ() {
        this.LIZ.LJLZ.setEnabled(false);
    }

    public C80532Vj6(MaterialDatePicker materialDatePicker) {
        this.LIZ = materialDatePicker;
    }

    @Override // X.AbstractC80535Vj9
    public final void LIZIZ(S s) {
        this.LIZ.Dl();
        MaterialDatePicker materialDatePicker = this.LIZ;
        materialDatePicker.LJLZ.setEnabled(materialDatePicker.LJLJJLL.LLLLLLL());
    }
}
