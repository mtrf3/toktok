package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MV2 extends C56906MVa {
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final C62846OlW LJLJJL;
    public PostNotice LJLJJLL;

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 438));
        }
    }

    public MV2(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById2;
        this.LJLILLLLZI = ap9;
        View findViewById3 = view.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_name)");
        TextView textView = (TextView) findViewById3;
        this.LJLJI = textView;
        View findViewById4 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById4;
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.h4n);
        if (c62846OlW == null) {
            View findViewById5 = view.findViewById(R.id.h4p);
            o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…notification_cover_right)");
            c62846OlW = (C62846OlW) findViewById5;
        }
        this.LJLJJL = c62846OlW;
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            MVR.LIZ(c62846OlW, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(textView, MVP.USERNAME, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(ap9);
            C7FA.LIZIZ(c62846OlW);
        }
        if (C99W.LIZ) {
            c62846OlW.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        C16880lQ.LJJJJJL(c62846OlW, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        ap9.LIZ();
        V92 hierarchy = c62846OlW.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context), 1);
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJJL);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyTitleSize(c96533qb, this.LJLJI);
        applyContentColor(c96533qb, this.LJLJJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (r8 == null) goto L49;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MV2.onClick(android.view.View):void");
    }
}
