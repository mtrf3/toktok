package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CZn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31543CZn extends AbstractC31544CZo {
    public final InterfaceC31548CZs LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31543CZn(View view, InterfaceC31548CZs selectCallback) {
        super(view);
        o.LJIIIZ(selectCallback, "selectCallback");
        this.LJLIL = selectCallback;
        View findViewById = view.findViewById(R.id.af5);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.background)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon)");
        this.LJLJI = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.title)");
        this.LJLJJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.bgn);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.coins)");
        this.LJLJJL = (C47121t6) findViewById4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C15380j0.LIZ(C15380j0.LJFF(R.dimen.ad9) - 36.0f);
        view.setLayoutParams(layoutParams);
    }

    @Override // X.AbstractC31544CZo
    public final void L(C31540CZk data, List<? extends Object> payloads) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty() || o.LJ(ListProtector.get(payloads, 0), "ChangeSelect")) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 435), this.itemView);
            if (getPosition() != 0) {
                C29306Beo.LJJLIIIJ(C15380j0.LIZ(12.0f), this.itemView);
            } else {
                C29306Beo.LJJLIIIJ(C15380j0.LIZ(0.0f), this.itemView);
            }
            this.LJLJJL.setText(String.valueOf(data.LIZ));
            if (data.LIZLLL) {
                this.LJLILLLLZI.setBackgroundResource(R.drawable.clw);
            } else {
                this.LJLILLLLZI.setBackgroundResource(R.drawable.clv);
            }
            if (data.LJ == EnumC31545CZp.HIGH) {
                AbstractC31544CZo.M(this.LJLJJI);
                this.LJLJJI.setText(C15380j0.LJIILL(R.string.o4y, String.valueOf(data.LIZIZ)));
                this.LJLJI.setImageResource(R.drawable.dau);
            } else {
                this.LJLJJI.setText(C15380j0.LJIILL(R.string.o4q, String.valueOf(data.LIZIZ)));
                this.LJLJI.setImageResource(R.drawable.dat);
            }
        }
    }
}
