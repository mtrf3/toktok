package X;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import java.text.DateFormat;

/* renamed from: X.Vja, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80562Vja extends AbstractC80544VjI {
    public final /* synthetic */ AbstractC80535Vj9 LJLJL;
    public final /* synthetic */ SingleDateSelector LJLJLJ;

    @Override // X.AbstractC80544VjI
    public final void LIZ() {
        this.LJLJL.LIZ();
    }

    @Override // X.AbstractC80544VjI
    public final void LIZIZ(Long l) {
        if (l == null) {
            this.LJLJLJ.selectedItem = null;
        } else {
            this.LJLJLJ.LLLLLZIL(l.longValue());
        }
        this.LJLJL.LIZIZ(this.LJLJLJ.selectedItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80562Vja(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, C80315Vfb c80315Vfb, CalendarConstraints calendarConstraints, C80534Vj8 c80534Vj8) {
        super(str, dateFormat, c80315Vfb, calendarConstraints);
        this.LJLJLJ = singleDateSelector;
        this.LJLJL = c80534Vj8;
    }
}
