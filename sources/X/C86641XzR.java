package X;

import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import q03.IDaS491S0100000_15;

/* renamed from: X.XzR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86641XzR extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C2068389v LJLLJ;
    public final C2068389v LJLLL;
    public final java.util.Map<Integer, View> LJLLLL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final LinearLayout getCommentContainer() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-commentContainer>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getCommentCountTextView() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-commentCountTextView>(...)");
        return (TuxTextView) value;
    }

    private final TuxIconView getCommentIconView() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-commentIconView>(...)");
        return (TuxIconView) value;
    }

    private final C8DZ getDiggAnimationView() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-diggAnimationView>(...)");
        return (C8DZ) value;
    }

    private final LinearLayout getDiggContainer() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-diggContainer>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getDiggCountTextView() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-diggCountTextView>(...)");
        return (TuxTextView) value;
    }

    private final LinearLayout getFavoriteContainer() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-favoriteContainer>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getFavoriteCountTextView() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-favoriteCountTextView>(...)");
        return (TuxTextView) value;
    }

    private final T5P getFavoriteImageView() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-favoriteImageView>(...)");
        return (T5P) value;
    }

    private final LinearLayout getShareContainer() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-shareContainer>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getShareCountTextView() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-shareCountTextView>(...)");
        return (TuxTextView) value;
    }

    private final TuxIconView getShareIconView() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-shareIconView>(...)");
        return (TuxIconView) value;
    }

    public final void LJJLJLI() {
        getDiggAnimationView().LIZIZ();
    }

    public final void LJJZ() {
        getFavoriteImageView().LIZIZ();
    }

    public final void LJJLL(boolean z) {
        int i;
        TuxTextView diggCountTextView = getDiggCountTextView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        diggCountTextView.setVisibility(i);
    }

    public final void LJJZZI(boolean z) {
        SY9 LIZ;
        T5P favoriteImageView = getFavoriteImageView();
        if (z) {
            C2068389v c2068389v = this.LJLLL;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZ = c2068389v.LIZ(context);
        } else {
            C2068389v c2068389v2 = this.LJLLJ;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LIZ = c2068389v2.LIZ(context2);
        }
        favoriteImageView.setImageDrawable(LIZ);
    }

    public final void setCommentText(String text) {
        o.LJIIIZ(text, "text");
        getCommentCountTextView().setText(text);
    }

    public final void setDiggAnimationViewSelected(boolean z) {
        getDiggAnimationView().setSelected(z);
    }

    public final void setDiggText(String text) {
        o.LJIIIZ(text, "text");
        getDiggCountTextView().setText(text);
    }

    public final void setFavoriteText(String text) {
        o.LJIIIZ(text, "text");
        getFavoriteCountTextView().setText(text);
    }

    public final void setShareText(String text) {
        o.LJIIIZ(text, "text");
        getShareCountTextView().setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86641XzR(Context context, InterfaceC86642XzS actionsListener) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(actionsListener, "actionsListener");
        this.LJLLLL = new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 749));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 748));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 750));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 745));
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 746));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 747));
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 751));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 752));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 753));
        this.LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 754));
        this.LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 755));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 756));
        IDaS491S0100000_15 iDaS491S0100000_15 = new IDaS491S0100000_15(actionsListener, 0);
        ACListenerS35S0100000_15 aCListenerS35S0100000_15 = new ACListenerS35S0100000_15(actionsListener, 167);
        ACListenerS35S0100000_15 aCListenerS35S0100000_152 = new ACListenerS35S0100000_15(actionsListener, 168);
        int LIZIZ = C7MY.LIZIZ(26);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_3pt_bookmark;
        c2068389v.LJ = Integer.valueOf(R.attr.gu);
        c2068389v.LIZIZ = LIZIZ;
        c2068389v.LIZJ = LIZIZ;
        this.LJLLJ = c2068389v;
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_3pt_bookmark_fill;
        c2068389v2.LJ = Integer.valueOf(R.attr.c6);
        c2068389v2.LIZIZ = LIZIZ;
        c2068389v2.LIZJ = LIZIZ;
        this.LJLLL = c2068389v2;
        C86643XzT c86643XzT = new C86643XzT(actionsListener);
        ACListenerS35S0100000_15 aCListenerS35S0100000_153 = new ACListenerS35S0100000_15(actionsListener, 169);
        C38619FDr.LIZIZ(R.layout.c1u, context, this, true);
        C16880lQ.LJIIZILJ(getDiggContainer(), iDaS491S0100000_15);
        getDiggAnimationView().setOnClickListener(new ViewOnClickListenerC13880ga(iDaS491S0100000_15));
        C16880lQ.LJJJJI(getDiggCountTextView(), iDaS491S0100000_15);
        C16880lQ.LJIIZILJ(getCommentContainer(), aCListenerS35S0100000_15);
        C16880lQ.LJJJJI(getCommentCountTextView(), aCListenerS35S0100000_15);
        C16880lQ.LJJJ(getCommentIconView(), aCListenerS35S0100000_15);
        C16880lQ.LJIIZILJ(getFavoriteContainer(), aCListenerS35S0100000_152);
        C16880lQ.LJJJJI(getFavoriteCountTextView(), aCListenerS35S0100000_152);
        C16880lQ.LJJJLIIL(getFavoriteImageView(), aCListenerS35S0100000_152);
        getFavoriteImageView().setOnStateChangeListener(c86643XzT);
        C16880lQ.LJIIZILJ(getShareContainer(), aCListenerS35S0100000_153);
        C16880lQ.LJJJJI(getShareCountTextView(), aCListenerS35S0100000_153);
        C16880lQ.LJJJ(getShareIconView(), aCListenerS35S0100000_153);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(52));
        for (View view : OJ6.LJJJ(getDiggContainer(), getCommentContainer(), getFavoriteContainer(), getShareContainer())) {
            o.LJIIIZ(view, "<this>");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.width != LJJIIZ) {
                layoutParams.width = LJJIIZ;
                view.setLayoutParams(layoutParams);
            }
            C78886Uxe.LJJLIIIJ(LJJIIZ, view);
        }
        Iterator it = OJ6.LJJJ(getCommentIconView(), getShareIconView()).iterator();
        while (it.hasNext()) {
            ((TuxIconView) it.next()).setTintColorRes(R.attr.go);
        }
        for (TuxTextView tuxTextView : OJ6.LJJJ(getDiggCountTextView(), getCommentCountTextView(), getFavoriteCountTextView(), getShareCountTextView())) {
            tuxTextView.setTuxFont(72);
            tuxTextView.setTextColorRes(R.attr.go);
        }
        this.LJLLJ.LJ = Integer.valueOf(R.attr.go);
    }
}
