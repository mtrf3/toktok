package X;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.RangeDateSelector;
import java.text.DateFormat;

/* renamed from: X.Vjd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80565Vjd extends AbstractC80544VjI {
    public final /* synthetic */ C80315Vfb LJLJL;
    public final /* synthetic */ C80315Vfb LJLJLJ;
    public final /* synthetic */ AbstractC80535Vj9 LJLJLLL;
    public final /* synthetic */ RangeDateSelector LJLL;

    @Override // X.AbstractC80544VjI
    public final void LIZ() {
        RangeDateSelector rangeDateSelector = this.LJLL;
        rangeDateSelector.proposedTextStart = null;
        rangeDateSelector.LIZ(this.LJLJL, this.LJLJLJ, this.LJLJLLL);
    }

    @Override // X.AbstractC80544VjI
    public final void LIZIZ(Long l) {
        RangeDateSelector rangeDateSelector = this.LJLL;
        rangeDateSelector.proposedTextStart = l;
        rangeDateSelector.LIZ(this.LJLJL, this.LJLJLJ, this.LJLJLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80565Vjd(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, C80315Vfb c80315Vfb, CalendarConstraints calendarConstraints, C80315Vfb c80315Vfb2, C80315Vfb c80315Vfb3, C80534Vj8 c80534Vj8) {
        super(str, dateFormat, c80315Vfb, calendarConstraints);
        this.LJLL = rangeDateSelector;
        this.LJLJL = c80315Vfb2;
        this.LJLJLJ = c80315Vfb3;
        this.LJLJLLL = c80534Vj8;
    }
}
