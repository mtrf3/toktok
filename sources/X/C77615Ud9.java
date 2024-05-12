package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityDetail;
import com.bytedance.bddatefmt.BDDateFormat;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ud9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77615Ud9 extends AbstractC77653Udl {
    public final ViewGroup LJLIL;
    public final C77666Udy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77615Ud9(ViewGroup parent) {
        super(parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLILLLLZI = new C77666Udy(context);
    }

    @Override // X.AbstractC77653Udl
    public final void L(ExtraActivityDetail extraActivityDetail) {
        C77696UeS c77696UeS;
        C77666Udy c77666Udy = this.LJLILLLLZI;
        c77666Udy.getClass();
        c77666Udy.LIZIZ = extraActivityDetail;
        long j = 1000;
        String LJ = a1.LJ(BDDateFormat.LIZJ(new BDDateFormat("ll"), extraActivityDetail.startTime * j), " - ", BDDateFormat.LIZJ(new BDDateFormat("ll"), extraActivityDetail.endTime * j));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.m7i);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.m7j);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJIILJJIL2);
        C17I c17i = new C17I();
        c17i.LIZIZ = 0;
        c17i.LIZJ = LJIILJJIL2.length();
        c17i.LIZ(new ForegroundColorSpan(C77556UcC.LIZ(c77666Udy.LIZ)));
        c17i.LIZLLL = 18;
        c17i.LIZIZ(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LJIILJJIL);
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, "{rewards}", 0, false, 6);
        if (LJJLIIIJL >= 0) {
            spannableStringBuilder2.replace(LJJLIIIJL, LJJLIIIJL + 9, (CharSequence) spannableStringBuilder);
        }
        if (CCJ.LIZ(c77666Udy.LIZ)) {
            c77696UeS = C77697UeT.LIZIZ;
        } else {
            c77696UeS = C77697UeT.LIZ;
        }
        c77666Udy.LIZJ = new C77618UdC(LJ, spannableStringBuilder2, c77696UeS);
        C77618UdC c77618UdC = this.LJLILLLLZI.LIZJ;
        if (c77618UdC != null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C87277YNd.LJJIJ(itemView);
            TextView textView = (TextView) this.itemView.findViewById(R.id.mnh);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.m2v);
            View findViewById = this.itemView.findViewById(R.id.ezb);
            textView.setText(c77618UdC.LIZ);
            textView2.setText(c77618UdC.LIZIZ);
            C63129Oq5 c63129Oq5 = c77618UdC.LIZJ;
            C15490jB.LJ(findViewById, c63129Oq5.LJLIL, c63129Oq5.LIZ());
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 168), this.itemView);
            return;
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C87277YNd.LJJIIZ(itemView2);
    }
}
