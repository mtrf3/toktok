package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MUu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56900MUu extends C56906MVa {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public BaseNotice LJLJLJ;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 440));
        }
    }

    public C56900MUu(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLILLLLZI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f7y);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJJL = findViewById5;
        this.LJLJL = -1;
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(c119624mk, MVP.AVATAR, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(c119624mk);
        }
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyContentColor(c96533qb, this.LJLJI);
        applyArrow(c96533qb, this.LJLJJL);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            View view = this.LJLJJL;
            int i = MVV.LARGE_AVATAR_ADD_SPACE;
            resetViewTopMargin(view, getViewTopMarginAddSpace(view, i));
            View view2 = this.LJLJJI;
            resetViewTopMargin(view2, getViewTopMarginAddSpace(view2, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L8;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56900MUu.onClick(android.view.View):void");
    }
}
