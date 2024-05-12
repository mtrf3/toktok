package X;

import Y.ACListenerS40S0300000_15;
import Y.ACListenerS49S0200000_15;
import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS123S0300000_4;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y4A {
    public final AwemePagerVM LIZ;
    public final View LIZIZ;
    public final Context LIZJ;
    public final String LIZLLL;
    public final User LJ;
    public final Aweme LJFF;
    public InterfaceC82683Wch LJI;

    public static boolean LIZLLL() {
        if (C00F.LIZ(31744, 0, "video_sort_opt", true) != 1) {
            return false;
        }
        return true;
    }

    public final void LIZ() {
        Y4F y4f;
        Y4F y4f2;
        InterfaceC82683Wch LIZJ;
        View view = this.LIZIZ;
        Y4H y4h = null;
        if (view instanceof Y4F) {
            y4f = (Y4F) view;
            y4f2 = (Y4F) view;
        } else {
            y4f = null;
            y4f2 = null;
        }
        if (LIZLLL()) {
            C74294TDu c74294TDu = new C74294TDu(this.LIZJ);
            c74294TDu.LJIIIZ(R.attr.cr);
            c74294TDu.LIZIZ(this.LIZIZ);
            c74294TDu.LJI(WHL.BOTTOM);
            c74294TDu.LJIIJ(null, true);
            c74294TDu.LIZ.LJ = 200;
            c74294TDu.LIZLLL = LIZJ(this.LIZJ, this.LIZ);
            C82682Wcg c82682Wcg = c74294TDu.LIZ;
            c82682Wcg.LJIJJLI = true;
            c82682Wcg.LJII = -1001L;
            c74294TDu.LJ(new AqS165S0100000_15(y4f2, 820));
            LIZJ = c74294TDu.LIZJ();
        } else {
            C142425iQ c142425iQ = new C142425iQ(this.LIZJ);
            c142425iQ.LIZIZ(this.LIZIZ);
            c142425iQ.LJI(WHL.BOTTOM);
            c142425iQ.LJIIJ(null, true);
            c142425iQ.LIZ.LJ = 10;
            View LIZJ2 = LIZJ(this.LIZJ, this.LIZ);
            C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
            c82682Wcg2.LJIJ = LIZJ2;
            c82682Wcg2.LJIJJLI = true;
            c82682Wcg2.LJII = -1001L;
            c142425iQ.LJ(new AqS165S0100000_15(y4f2, 821));
            LIZJ = c142425iQ.LIZJ();
        }
        this.LJI = LIZJ;
        if (y4f != null) {
            y4h = y4f.getButtonState();
        }
        if (y4h == Y4H.INITIAL) {
            InterfaceC82683Wch interfaceC82683Wch = this.LJI;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.show();
                return;
            }
            return;
        }
        InterfaceC82683Wch interfaceC82683Wch2 = this.LJI;
        if (interfaceC82683Wch2 == null) {
            return;
        }
        interfaceC82683Wch2.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, android.widget.PopupWindow] */
    public final void LIZIZ(View view) {
        View view2;
        Y4F y4f;
        C68322mC c68322mC = new C68322mC();
        Object LLILL = C16880lQ.LLILL(this.LIZJ, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        Y4H y4h = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c8a, (LayoutInflater) LLILL, null);
        TuxTextView tuxTextView = (TuxTextView) LLLZIIL.findViewById(R.id.mur);
        TuxTextView tuxTextView2 = (TuxTextView) LLLZIIL.findViewById(R.id.gna);
        if (view != null) {
            view2 = view.findViewById(R.id.n6h);
        } else {
            view2 = null;
        }
        tuxTextView.setText(R.string.rfi);
        tuxTextView2.setText(R.string.rfh);
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        C8YN.LJII(C245089jc.LJLJL, this.LIZ, new TBT() { // from class: X.Y4E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS123S0300000_4(c68322mC2, (C68322mC<String>) tuxTextView2, tuxTextView, (TuxTextView) 2), 6);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS49S0200000_15(this, c68322mC2, 31));
        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS49S0200000_15(this, c68322mC2, 32));
        ?? popupWindow = new PopupWindow(LLLZIIL, -1, -2, true);
        c68322mC.element = popupWindow;
        C16880lQ.LLJLLIL(popupWindow, this.LIZIZ, 48, 0, 0);
        ((PopupWindow) c68322mC.element).update(this.LIZIZ, -1, -1);
        ((PopupWindow) c68322mC.element).setOnDismissListener(new Y4B(this, view2));
        C8VC.LJIIL(this.LIZ, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9K2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS146S0200000_15(this, c68322mC, 47));
        View view3 = this.LIZIZ;
        if ((view3 instanceof Y4F) && (y4f = (Y4F) view3) != null) {
            y4h = y4f.getButtonState();
        }
        if (y4h == Y4H.INITIAL) {
            C16880lQ.LLJLLIL((PopupWindow) c68322mC.element, this.LIZIZ, 48, 0, 0);
            Interpolator LIZLLL = C55953Lxd.LIZLLL();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, C45804HyK.LJJI(54));
            ofInt.setInterpolator(LIZLLL);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(LLLZIIL, 65));
            ofInt.addListener(new IDAListenerS77S0100000_9(LLLZIIL, 10));
            if (view2 != null) {
                view2.setVisibility(0);
            }
            ofInt.start();
        }
    }

    public final View LIZJ(Context context, AwemePagerVM awemePagerVM) {
        int i;
        int i2;
        int i3;
        LayoutInflater LLZIL = C16880lQ.LLZIL(context);
        if (LIZLLL()) {
            i = R.layout.c8b;
        } else {
            i = R.layout.c8c;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, LLZIL, null);
        if (LIZLLL()) {
            i2 = 220;
        } else {
            i2 = 129;
        }
        int LJJI = C45804HyK.LJJI(i2);
        if (LIZLLL()) {
            i3 = 98;
        } else {
            i3 = 82;
        }
        LLLZIIL.setLayoutParams(new LinearLayout.LayoutParams(LJJI, C45804HyK.LJJI(i3)));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        LLLZIIL.setBackground(c110614Vt.LIZ(context));
        ((TextView) LLLZIIL.findViewById(R.id.mug)).setText(R.string.rfd);
        ((TextView) LLLZIIL.findViewById(R.id.gnc)).setText(R.string.rfc);
        LinearLayout linearLayout = (LinearLayout) LLLZIIL.findViewById(R.id.muf);
        TuxIconView tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.muh);
        LinearLayout linearLayout2 = (LinearLayout) LLLZIIL.findViewById(R.id.gnb);
        TuxIconView tuxIconView2 = (TuxIconView) LLLZIIL.findViewById(R.id.gnd);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C8YN.LJII(C245089jc.LJLJL, awemePagerVM, new TBT() { // from class: X.Y4D
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS123S0300000_4(tuxIconView, (TuxIconView) c68322mC, (C68322mC<String>) tuxIconView2, (TuxIconView) 3), 6);
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS40S0300000_15(awemePagerVM, this, c68322mC, 6));
        C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS40S0300000_15(awemePagerVM, this, c68322mC, 7));
        return LLLZIIL;
    }

    public Y4A(AwemePagerVM pagerVM, View anchor, Context context, String str, User user, Aweme aweme) {
        o.LJIIIZ(pagerVM, "pagerVM");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(context, "context");
        this.LIZ = pagerVM;
        this.LIZIZ = anchor;
        this.LIZJ = context;
        this.LIZLLL = str;
        this.LJ = user;
        this.LJFF = aweme;
    }
}
