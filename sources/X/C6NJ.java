package X;

import Y.ACListenerS37S0200000_2;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6NJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NJ implements InterfaceC82688Wcm, InterfaceC82689Wcn {
    public final View LIZ;
    public final List<C6NK> LIZIZ;
    public final C6NL LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final Context LJI;
    public final LinearLayout LJII;
    public InterfaceC82683Wch LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJIIIIZZ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public final boolean LIZIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJIIIIZZ;
        if (interfaceC82683Wch != null) {
            return interfaceC82683Wch.isShowing();
        }
        return false;
    }

    public final void LIZJ() {
        C142425iQ c142425iQ = new C142425iQ(this.LJI);
        c142425iQ.LIZIZ(this.LIZ);
        c142425iQ.LIZ.LJIIIIZZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        LinearLayout linearLayout = this.LJII;
        o.LJII(linearLayout, "null cannot be cast to non-null type android.view.View");
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJIJ = linearLayout;
        c82682Wcg.LJIIL = false;
        c142425iQ.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(this.LIZLLL, this.LJI));
        c142425iQ.LJIIJ(null, true);
        c142425iQ.LIZ.LJII = -1001L;
        InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
        this.LJIIIIZZ = LIZJ;
        LIZJ.LJ(this);
        InterfaceC82683Wch interfaceC82683Wch = this.LJIIIIZZ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.LIZIZ(this);
        }
        InterfaceC82683Wch interfaceC82683Wch2 = this.LJIIIIZZ;
        if (interfaceC82683Wch2 != null) {
            interfaceC82683Wch2.show();
        }
    }

    @Override // X.InterfaceC82688Wcm
    public final void onDismiss() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
        } else {
            this.LIZJ.onCancel();
        }
    }

    @Override // X.InterfaceC82689Wcn
    public final void onShow() {
        this.LIZJ.onShow();
    }

    public /* synthetic */ C6NJ(View view, List list, C6NL c6nl) {
        this(view, list, c6nl, R.attr.dk, R.attr.dv, 0.4f);
    }

    public C6NJ(View contentView, List<C6NK> list, C6NL clickListener, int i, int i2, float f) {
        LinearLayout linearLayout;
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(clickListener, "clickListener");
        this.LIZ = contentView;
        this.LIZIZ = list;
        this.LIZJ = clickListener;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = f;
        Context context = contentView.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        this.LJI = context;
        int i3 = -2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setOrientation(1);
        linearLayout2.setMinimumWidth((int) C74275TDb.LIZIZ(context, 156.0f));
        linearLayout2.setGravity(16);
        this.LJII = linearLayout2;
        Iterator it = ((ArrayList) list).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            C6NK c6nk = (C6NK) it.next();
            i4++;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, (int) C74275TDb.LIZIZ(this.LJI, 44.0f));
            LinearLayout linearLayout3 = new LinearLayout(this.LJI);
            linearLayout3.setLayoutParams(layoutParams2);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            Context context2 = linearLayout3.getContext();
            o.LJIIIIZZ(context2, "context");
            linearLayout3.setMinimumWidth((int) C74275TDb.LIZIZ(context2, 156.0f));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i3);
            layoutParams3.setMarginStart((int) C74275TDb.LIZIZ(this.LJI, 8.0f));
            layoutParams3.setMarginEnd((int) C74275TDb.LIZIZ(this.LJI, 12.0f));
            TuxTextView tuxTextView = new TuxTextView(this.LJI, null, 6, 0);
            tuxTextView.setTextColorRes(c6nk.LIZJ);
            tuxTextView.setTuxFont(102);
            Context context3 = tuxTextView.getContext();
            o.LJIIIIZZ(context3, "context");
            tuxTextView.setMinimumWidth((int) C74275TDb.LIZIZ(context3, 104.0f));
            Context context4 = tuxTextView.getContext();
            o.LJIIIIZZ(context4, "context");
            tuxTextView.setMaxWidth((int) C74275TDb.LIZIZ(context4, 198.0f));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(16);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setText(tuxTextView.getContext().getString(c6nk.LIZIZ));
            Context context5 = tuxTextView.getContext();
            o.LJIIIIZZ(context5, "context");
            tuxTextView.measure((int) C74275TDb.LIZIZ(context5, 198.0f), View.MeasureSpec.makeMeasureSpec(0, LiveLayoutPreloadThreadPriority.DEFAULT));
            tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
            Layout layout = tuxTextView.getLayout();
            if (layout != null && layout.getEllipsisCount(tuxTextView.getLineCount() - 1) > 0) {
                tuxTextView.setTuxFont(62);
            }
            tuxTextView.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) C74275TDb.LIZIZ(this.LJI, 20.0f), (int) C74275TDb.LIZIZ(this.LJI, 20.0f));
            if (C74275TDb.LJFF(this.LJI)) {
                layoutParams4.setMarginEnd((int) C74275TDb.LIZIZ(this.LJI, 12.0f));
            } else {
                layoutParams4.setMarginStart((int) C74275TDb.LIZIZ(this.LJI, 12.0f));
            }
            View view = c6nk.LJII;
            View view2 = view;
            if (view == null) {
                TuxIconView tuxIconView = new TuxIconView(this.LJI, null, 0, 6, null);
                tuxIconView.setIconRes(c6nk.LIZ);
                tuxIconView.setTintColorRes(c6nk.LIZLLL);
                view2 = tuxIconView;
            }
            view2.setLayoutParams(layoutParams4);
            view2.setLayoutDirection(0);
            linearLayout3.addView(view2, 0);
            linearLayout3.addView(tuxTextView, 1);
            linearLayout3.setClickable(true);
            C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS37S0200000_2(this, c6nk, 21));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(this.LJI, 0.5f));
            View view3 = new View(this.LJI);
            view3.setLayoutParams(layoutParams5);
            view3.setBackgroundColor(AnonymousClass636.LJIIIIZZ(this.LJ, this.LJI));
            view3.setAlpha(this.LJFF);
            LinearLayout linearLayout4 = this.LJII;
            if (linearLayout4 != null) {
                linearLayout4.addView(linearLayout3);
            }
            if (i4 != this.LIZIZ.size() && (linearLayout = this.LJII) != null) {
                linearLayout.addView(view3);
            }
            i3 = -2;
        }
    }
}
