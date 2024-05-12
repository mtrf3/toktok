package X;

import Y.IDCListenerS206S0100000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.CZh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31537CZh implements C15M {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    public C31537CZh(AqS170S0100000_4 aqS170S0100000_4) {
        this.LIZ = aqS170S0100000_4;
    }

    @Override // X.C15M
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cwa, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveCheckBox");
        CompoundButton compoundButton = (CompoundButton) LLLLIILL;
        compoundButton.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 30));
        this.LIZ.invoke(Boolean.valueOf(compoundButton.isChecked()));
        return compoundButton;
    }
}
