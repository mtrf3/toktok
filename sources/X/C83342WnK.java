package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WnK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83342WnK extends AbstractC83335WnD {
    public final View LJLILLLLZI;
    public final InterfaceC83334WnC LJLJI;
    public final ImageView LJLJJI;
    public EnumC83339WnH LJLJJL;
    public final ViewGroup LJLJJLL;
    public final C8HE LJLJL;

    @Override // X.AbstractC83335WnD
    public final void L(AbstractC83369Wnl message) {
        String str;
        o.LJIIIZ(message, "message");
        if (!(message instanceof C83355WnX)) {
            return;
        }
        C83355WnX c83355WnX = (C83355WnX) message;
        int i = C83365Wnh.LIZ[c83355WnX.LIZJ.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3 && i != 4) || (str = c83355WnX.LIZLLL) == null) {
                return;
            }
            boolean z = c83355WnX.LJII;
            this.LJLJJL = EnumC83339WnH.RETRY_FROM_BOT;
            M().setText(str);
            this.LJLJL.setVisibility(8);
            this.LJLJJI.setVisibility(8);
            this.LJLJJLL.removeAllViews();
            if (!z) {
                this.LJLJJLL.setVisibility(8);
                return;
            }
            ViewGroup viewGroup = this.LJLJJLL;
            Context context = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "innerView.context");
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
            c2068389v.LIZ = R.raw.icon_arrow_clockwise;
            c2068389v.LJ = Integer.valueOf(R.attr.dm);
            tuxIconView.setTuxIcon(c2068389v);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
            tuxIconView.setLayoutParams(layoutParams);
            viewGroup.addView(tuxIconView);
            ViewGroup viewGroup2 = this.LJLJJLL;
            Context context2 = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context2, "innerView.context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            tuxTextView.setTuxFont(52);
            tuxTextView.setTextColorRes(R.attr.dm);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxTextView.setLayoutParams(layoutParams2);
            tuxTextView.setText(tuxTextView.getContext().getText(R.string.e15));
            viewGroup2.addView(tuxTextView);
            this.LJLJJLL.setVisibility(0);
            return;
        }
        this.LJLJJL = EnumC83339WnH.CANCEL;
        this.LJLJJI.setVisibility(0);
        M().setVisibility(8);
        this.LJLJL.setVisibility(8);
        Drawable drawable = this.LJLJJI.getDrawable();
        o.LJII(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) drawable).start();
        this.LJLJJLL.removeAllViews();
        ViewGroup viewGroup3 = this.LJLJJLL;
        Context context3 = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context3, "innerView.context");
        TuxIconView tuxIconView2 = new TuxIconView(context3, null, 0, 6, null);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZ = R.raw.icon_x_mark_circle;
        c2068389v2.LJ = Integer.valueOf(R.attr.dm);
        tuxIconView2.setTuxIcon(c2068389v2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        tuxIconView2.setLayoutParams(layoutParams3);
        viewGroup3.addView(tuxIconView2);
        ViewGroup viewGroup4 = this.LJLJJLL;
        Context context4 = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context4, "innerView.context");
        TuxTextView tuxTextView2 = new TuxTextView(context4, null, 6, 0);
        tuxTextView2.setTuxFont(52);
        tuxTextView2.setTextColorRes(R.attr.dm);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        tuxTextView2.setLayoutParams(layoutParams4);
        tuxTextView2.setText(tuxTextView2.getContext().getText(R.string.e0k));
        viewGroup4.addView(tuxTextView2);
        this.LJLJJLL.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83342WnK(View view, C83346WnO onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLILLLLZI = view;
        this.LJLJI = onItemClickListener;
        this.LJLJJI = (ImageView) view.findViewById(R.id.ngo);
        this.LJLJJL = EnumC83339WnH.DEFAULT;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.d2b);
        C16880lQ.LJIIL(viewGroup, new ACListenerS34S0100000_14(this, 110));
        this.LJLJJLL = viewGroup;
        this.LJLJL = (C8HE) view.findViewById(R.id.mqh);
    }
}
