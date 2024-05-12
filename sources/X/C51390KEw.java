package X;

import Y.ACListenerS28S0100000_8;
import Y.IDCListenerS255S0100000_8;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KEw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51390KEw extends C51387KEt {
    public boolean LJLLJ;
    public final java.util.Map<Integer, View> LJLLL;

    @Override // X.C51387KEt
    public final View LIZJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C51387KEt
    public final void LJ() {
        super.LJ();
        C16880lQ.LJJJJI((TuxTextView) LIZJ(R.id.miz), new ACListenerS28S0100000_8(this, 3));
    }

    @Override // X.C51387KEt
    public final void LJFF() {
        C16880lQ.LLLZIIL(R.layout.cfq, C16880lQ.LLZIL(getContext()), this);
        LJI();
        View LIZJ = LIZJ(R.id.miz);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(6));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.co, context);
        if (LJI != null) {
            gradientDrawable.setColor(LJI.intValue());
        }
        LIZJ.setBackground(gradientDrawable);
        LIZJ(R.id.miz).setVisibility(4);
        ((ImageView) LIZJ(R.id.ecf)).setVisibility(4);
        addOnLayoutChangeListener(new IDCListenerS255S0100000_8(this, 0));
    }

    @Override // X.C51387KEt
    public final void LIZLLL(String str) {
        if (o.LJ(str, getDefaultHintWord())) {
            return;
        }
        LIZJ(R.id.miy).setVisibility(4);
        LIZJ(R.id.miz).setVisibility(0);
        ((ImageView) LIZJ(R.id.ecf)).setVisibility(0);
        ((TextView) LIZJ(R.id.miz)).setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51390KEw(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, eCSearchEntranceData, kek, interfaceC65784Pro);
        this.LJLLL = C62850Ola.LJFF(context, "context");
    }
}
