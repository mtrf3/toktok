package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.VsP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81109VsP extends C81108VsO {
    @Override // X.C81108VsO
    public final void LIZIZ() {
        C16880lQ.LLLLIILL(getLayoutInflater(), R.layout.ri, this, true);
        setContainer((LinearLayout) findViewById(R.id.hia));
        setYearPicker((C80607VkJ) findViewById(R.id.nkk));
        setMonthPicker((C80607VkJ) findViewById(R.id.gm0));
        setDayOfMonthPicker((C80607VkJ) findViewById(R.id.c3r));
        C80607VkJ monthPicker = getMonthPicker();
        if (monthPicker != null) {
            monthPicker.setVisibility(8);
        }
        C80607VkJ dayOfMonthPicker = getDayOfMonthPicker();
        if (dayOfMonthPicker != null) {
            dayOfMonthPicker.setVisibility(8);
        }
        C80607VkJ yearPicker = getYearPicker();
        if (yearPicker != null) {
            yearPicker.LLIILZL = this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81109VsP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
