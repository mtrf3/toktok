package X;

import Y.IDCListenerS209S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TrV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75957TrV implements C15M {
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C75957TrV(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.C15M
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cvn, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveCheckBox");
        CompoundButton compoundButton = (CompoundButton) LLLLIILL;
        compoundButton.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 10));
        this.LIZ.invoke(Boolean.valueOf(compoundButton.isChecked()));
        return compoundButton;
    }
}
