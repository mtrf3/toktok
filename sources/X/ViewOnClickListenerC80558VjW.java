package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.VjW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80558VjW implements View.OnClickListener {
    public final /* synthetic */ MaterialCalendar LJLIL;

    public ViewOnClickListenerC80558VjW(MaterialCalendar materialCalendar) {
        this.LJLIL = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.LJLIL;
        EnumC80555VjT enumC80555VjT = materialCalendar.LJLJJLL;
        EnumC80555VjT enumC80555VjT2 = EnumC80555VjT.YEAR;
        if (enumC80555VjT == enumC80555VjT2) {
            materialCalendar.xl(EnumC80555VjT.DAY);
        } else {
            if (enumC80555VjT != EnumC80555VjT.DAY) {
                return;
            }
            materialCalendar.xl(enumC80555VjT2);
        }
    }
}
