package X;

import Y.ACListenerS22S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141465gs extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLLL = 0;
    public final int LJLIL;
    public final View LJLILLLLZI;
    public final InterfaceC141035gB LJLJI;
    public final C141205gS LJLJJI;
    public C141225gU LJLJJL;
    public View LJLJJLL;
    public TuxIconView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public SY4 LJLL;
    public TuxIconView LJLLI;
    public C29701Eo LJLLILLLL;
    public ObjectAnimator LJLLJ;

    public final SY4 L() {
        SY4 sy4 = this.LJLL;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("useButton");
        throw null;
    }

    public final void M(boolean z) {
        if (z) {
            if (L().getVisibility() == 0) {
                return;
            }
            L().setVisibility(0);
            ObjectAnimator objectAnimator = this.LJLLJ;
            if (objectAnimator != null) {
                objectAnimator.start();
                return;
            } else {
                o.LJIJI("alphaAnimator");
                throw null;
            }
        }
        L().setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141465gs(int i, View view, InterfaceC141035gB listener, C141205gS dataManager) {
        super(view);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(dataManager, "dataManager");
        this.LJLIL = i;
        this.LJLILLLLZI = view;
        this.LJLJI = listener;
        this.LJLJJI = dataManager;
        View findViewById = view.findViewById(R.id.jda);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.se_item_layout)");
        this.LJLJJLL = findViewById;
        View findViewById2 = view.findViewById(R.id.jd9);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.se_item_icon)");
        TuxIconView tuxIconView = (TuxIconView) findViewById2;
        this.LJLJL = tuxIconView;
        tuxIconView.setIconRes(R.raw.icon_music_note_single);
        View findViewById3 = view.findViewById(R.id.jdb);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.se_item_playing_lottie)");
        this.LJLLILLLL = (C29701Eo) findViewById3;
        View findViewById4 = view.findViewById(R.id.jdc);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.se_item_title)");
        this.LJLJLJ = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.jdd);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.se_item_total_time)");
        this.LJLJLLL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.jde);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.se_item_use)");
        this.LJLL = (SY4) findViewById6;
        if (C58B.LIZ()) {
            SY4 L = L();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(5);
            Context context = L().getContext();
            o.LJIIIIZZ(context, "useButton.context");
            L.setBackground(c110614Vt.LIZ(context));
        }
        View findViewById7 = view.findViewById(R.id.jd8);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.se_item_collect)");
        this.LJLLI = (TuxIconView) findViewById7;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(L(), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.LJLLJ = ofFloat;
        C16880lQ.LJJIZ(L(), new ACListenerS22S0100000_2(this, 82));
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS22S0100000_2(this, 83));
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 84), view2);
                return;
            } else {
                o.LJIJI("soundItemLayout");
                throw null;
            }
        }
        o.LJIJI("collectButton");
        throw null;
    }
}
