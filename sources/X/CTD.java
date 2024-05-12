package X;

import Y.ACListenerS25S0100000_5;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CTD extends CSX<CTF<? extends CR6>> {
    public final ImageView LJLJLLL;
    public final ImageView LJLL;
    public final TextView LJLLI;
    public final View LJLLILLLL;
    public final ACListenerS25S0100000_5 LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTD(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.icon)");
        this.LJLJLLL = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.j2g);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.right_icon)");
        this.LJLL = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.content)");
        this.LJLLI = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.h65);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notify_content)");
        this.LJLLILLLL = findViewById4;
        this.LJLLJ = new ACListenerS25S0100000_5(this, 384);
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        CTF model = (CTF) crd;
        o.LJIIIZ(model, "model");
        if (model.LLIFFJFJJ() != null) {
            C31665Cbl.LIZLLL(this.LJLJLLL, model.LLIFFJFJJ(), this.LJLJLLL.getWidth(), this.LJLJLLL.getHeight());
        } else {
            model.LLFII();
            this.LJLJLLL.setBackgroundResource(R.drawable.cz6);
        }
        model.LLFZ();
        if (!model.LLII()) {
            this.LJLL.setVisibility(8);
        }
        if (!TextUtils.isEmpty(model.getContent())) {
            this.LJLLI.setText(model.getContent());
        } else {
            this.LJLLI.setText("");
        }
        model.LLI();
        if (!TextUtils.isEmpty(model.LLFFF())) {
            try {
                Drawable background = this.LJLLILLLL.getBackground();
                o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setColor(Color.parseColor(model.LLFFF()));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (model.LLII()) {
            this.itemView.setTag(model);
            C16880lQ.LJIIJ(this.LJLLJ, this.itemView);
            return;
        }
        C16880lQ.LJIIJ(null, this.itemView);
    }
}
