package X;

import Y.IDCListenerS209S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TrL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75947TrL implements C15M {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    public C75947TrL(AqS179S0100000_13 aqS179S0100000_13) {
        this.LIZ = aqS179S0100000_13;
    }

    @Override // X.C15M
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cvl, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveCheckBox");
        CompoundButton compoundButton = (CompoundButton) LLLLIILL;
        compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 5));
        this.LIZ.invoke(Boolean.valueOf(compoundButton.isChecked()));
        return compoundButton;
    }
}
