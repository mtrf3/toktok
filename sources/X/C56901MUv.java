package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MUv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56901MUv extends C56906MVa {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final TuxIconView LJLJJI;
    public String LJLJJL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 443));
        }
    }

    public C56901MUv(View view) {
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
        View findViewById4 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJJI = (TuxIconView) findViewById4;
        this.LJLJJL = "";
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(c119624mk, MVP.AVATAR, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(c119624mk);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyContentColor(c96533qb, this.LJLJI);
        applyArrow(c96533qb, this.LJLJJI);
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            TuxIconView tuxIconView = this.LJLJJI;
            resetViewTopMargin(tuxIconView, getViewTopMarginAddSpace(tuxIconView, MVV.LARGE_AVATAR_ADD_SPACE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56901MUv.onClick(android.view.View):void");
    }
}
