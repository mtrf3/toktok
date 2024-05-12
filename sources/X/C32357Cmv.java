package X;

import Y.ACListenerS40S0200000_5;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWalletWebAppGuideAvailable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cmv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32357Cmv {
    public final BEQ LIZ;
    public final C77591Ucl LIZIZ;

    public final void LIZ(View view) {
        View findViewById = view.findViewById(R.id.awl);
        if (findViewById == null) {
            return;
        }
        if (C32355Cmt.LIZ.LJLILLLLZI.isWebRechargeAllowed && LiveWalletWebAppGuideAvailable.INSTANCE.isPanelAvailable()) {
            C87277YNd.LJJIJ(findViewById);
        } else {
            C87277YNd.LJJIIZ(findViewById);
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(view, this, 60), findViewById);
    }

    public C32357Cmv(BEQ beq, C77591Ucl c77591Ucl) {
        this.LIZ = beq;
        this.LIZIZ = c77591Ucl;
    }

    public final void LIZIZ(LayoutInflater layoutInflater, C32360Cmy c32360Cmy) {
        String str;
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dch, this.LIZ, false);
        Object[] objArr = new Object[1];
        if (C32358Cmw.LIZ()) {
            str = "Amazon";
        } else {
            str = "Google";
        }
        objArr[0] = str;
        ((TextView) LLLLIILL.findViewById(R.id.title)).setText(C15380j0.LJIILL(R.string.lwg, objArr));
        C16880lQ.LJJIII((C2A7) LLLLIILL.findViewById(R.id.b1h), new ACListenerS40S0200000_5(this, c32360Cmy, 61));
        LIZ(LLLLIILL);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dci, layoutInflater, null);
        BEQ beq = this.LIZ;
        BEP LIZ = BEP.LIZ(beq.getContext());
        TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.de6, C16880lQ.LLZIL(LIZ.LIZ), null);
        textView.setText(R.string.sq0);
        LIZ.LIZJ = textView;
        LIZ.LIZLLL = LLLLIILL;
        LIZ.LIZIZ = LLLZIIL;
        beq.setBuilder(LIZ);
    }
}
